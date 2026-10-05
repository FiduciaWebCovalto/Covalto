<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.nInstrucciones"/>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<%
  //VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
   if(BD.existeFolio(request.getParameter("txtFolio"),8))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}
	  
        String sFiso=(String)session.getAttribute("NumFid");
      double  sImporteDA=0,sImporteRP=0,sImporteA=0,sImporteT=0;
      sImporteDA = NumberFormat.getInstance(Locale.US).parse(request.getParameter("saldoDA")).doubleValue(); 
      sImporteRP = NumberFormat.getInstance(Locale.US).parse(request.getParameter("saldoRP")).doubleValue(); 
      sImporteA = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteA")!=null&&!request.getParameter("txtImporteA").trim().equals("")?request.getParameter("txtImporteA"):"0.00").doubleValue(); 
      sImporteT =sImporteRP +sImporteA;
      String Ejercicio=request.getParameter("cboEjercicio").trim();
      String Eje=request.getParameter("cboEje")!=null?request.getParameter("cboEje"):"-";	
      String Programa=request.getParameter("cboPrograma")!=null?request.getParameter("cboPrograma"):"-";
      String Proyecto=request.getParameter("cboProyecto")!=null?request.getParameter("cboProyecto"):"-";
      String Accion=request.getParameter("cboAccion")!=null?request.getParameter("cboAccion"):"-";


      Eje=Eje.substring(0,Eje.indexOf('-')).trim();
      Programa=Programa.substring(0,Programa.indexOf('-')).trim();
      Proyecto=Proyecto.substring(0,Proyecto.indexOf('-')).trim();
      Accion=Accion.substring(0,Accion.indexOf('-')).trim();
	  
	    //se validan los saldos disponibles
    if(sCaptura.equals("NO"))
		{       	
	  String contratoInv=BD.getNumContrato(sFiso,"RENDIMIENTOS");
	  if(sImporteA>0 && BD.getRendimientosContrato(sFiso,Ejercicio,contratoInv)<sImporteA)
					{
					session.setAttribute("msgError","No se registro la operacion<br>El saldo de los rendimientos por asignar del ejercicio"+Ejercicio+", no es suficiente ");
					%>
					<jsp:forward page="FI_Instrucciones.jsp"/>    
					<%     
					}
		}				
						

   if(sCaptura.equals("NO"))
	 {       
/**************************************************************Firma Digital***********************************************************/
   %>		
   <%@ include file="firmaDigital.jsp" %>
   <%  
/**************************************************************Fin Firma Digital********************************************************/
	}	
     DecimalFormat num = new DecimalFormat("############0.00");
     boolean bInstruccion=false;
     boolean bFirmasMan=BD.firmasMancomunadas((String)session.getAttribute("NumFid"));
	 String[] presupuesto = new String[5];
	 presupuesto[0] ="7000,"+Eje+","+Programa+","+Proyecto+","+Accion+",0,"+(String)session.getAttribute("NumFid")+","+Ejercicio+",3,"+Folio+","+fecha+","+ num.format(sImporteA) +",A,N,null,"+request.getParameter("txtAcuerdoComite")+",null," + sCaptura;
	 presupuesto[1] =(String)session.getAttribute("NumFid");
	 presupuesto[2] =BD.getNumContrato((String)session.getAttribute("NumFid"),"RENDIMIENTOS");
	 presupuesto[3] =Ejercicio;
	 presupuesto[4] =String.valueOf(sImporteA);
	 
	 String[] bitacora = new String[4];
	 bitacora[0]=fecha;
	 bitacora[1]=Folio;
	 bitacora[2]=(String)session.getAttribute("NumUser");
	 bitacora[3]="Asignacion de Rendimientos FOSEG por Internet con Folio: "+Folio+(sCaptura.equals("SI") || bFirmasMan ?"  y en espera de autorizaci�n":"");//+detalleBit;
	
   	 String[] firmas = new String[5];
	 firmas[0]=sCaptura.equals("SI")?"1":"2";
	 firmas[1]=Folio;
	 firmas[2]=(String)session.getAttribute("NumFid");
	 firmas[3]=(String)session.getAttribute("NumUser");
	 firmas[4]=fecha;

      bInstruccion=BD.insertaInstruccFoseg(presupuesto,bitacora,firmas,8);
	 
	 if(!bInstruccion)
					  {
					  session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Intenta nuevamente");
						%>
						<jsp:forward page="FI_Instrucciones.jsp"/>    
						<%       
						}
						
session.setAttribute("operacion",bInstruccion?"La Instruccion con Folio:"+Folio+ " fue registrada orrectamnete<br>Error al imprimir tu comprobante de la instruccion<br>Informale a tu ejecutivo de Cuenta":"La operacion no fue registrada, Intenta Nuevamente");		
						

%>	
<HTML>
<HEAD>
<TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link href="styles/bancomext.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">

function regresar()
{
 	parent.location="FI_Instrucciones.jsp";

}
function imprimir()
{
   window.print();
	parent.location="FI_Instrucciones.jsp";

}
</script>
<script> 
function window.onbeforeprint()
{ 
Imprimir.style.visibility = 'hidden';
Salir.style.visibility = 'hidden'; 
} 
function window.onafterprint(){ 
Imprimir.style.visibility = 'visible';
Salir.style.visibility = 'visible'; 
}
</script> 

</HEAD>
<BODY vLink=#052206 leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table border="0" width="90%" align="center">
  <tr bordercolor="#000000"> 
    <td  ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td align="right" class="textoNegrita"><table width="100%" border="0" height="79">
        <tr bordercolor="#000000"> 
          <td width="11%"><img src="imagenes/logo.jpg" width="135" height="89"></td>
          <td width="89%" align="center" bordercolor="#FFFFFF" class="subtitulo">DIRECCION 
            FIDUCIARIA <br>
            <%=sCaptura.equals("NO") && !bFirmasMan?"COMPROBANTE DE ASIGNACION DE RENDIMIENTOS":""%> 
            <%=sCaptura.equals("SI") && !bFirmasMan?"ASIGNACION DE RENDIMIENTOS EN ESPERA DE AUTORIZACION":""%> 
            <%=sCaptura.equals("SI") && bFirmasMan?"ASIGNACION DE RENDIMIENTOS EN ESPERA DE LA PRIMERA FIRMA DE AUTORIZACION":""%> 
            <%=sCaptura.equals("NO") && bFirmasMan?"ASIGNACION DE RENDIMIENTOS EN ESPERA DE LA SEGUNDA FIRMA DE AUTORIZACION":""%> 
            </td>
        </tr>
      </table></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">Fecha:<%=fecha+"&nbsp;&nbsp;  "+BD.getHora() +" hrs."%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">&nbsp;</td>
  </tr>
</table>
<table width="70%"  border="1" bordercolor="#FFFFFF" align="center">
  <tr bordercolor="#000000"> 
    <td  colspan="2" bgcolor="#CCCCCC"  class="subtitulo">Folio de Operaci&oacute;n: 
      <%=Folio%> </td>
  </tr>
  <tr bordercolor="#000000"> 
    <td width="38%"  class="texto">Fideicomiso:</td>
    <td width="62%" class="texto"><%= session.getAttribute( "Fideicomiso" ) %></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td height="23"  bgcolor="#FFFFFF" class="texto">Ejercicio:</td>
    <td bgcolor="#FFFFFF" class="texto"><%=request.getParameter("cboEjercicio")!=null?request.getParameter("cboEjercicio"):""%> 
    </td>
  </tr>
  <tr bordercolor="#000000"> 
    <td class="texto">Saldo disponible por asignar:</td>
    <td class="texto"> <%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteDA)%> 
    </td>
  </tr>
  <tr bordercolor="#000000"> 
    <td bgcolor="#FFFFFF"  class="texto">Acuerdo del Comite T&eacute;cnico o Carta 
      de Instrucci&oacute;n:</td>
    <td bgcolor="#FFFFFF" class="texto" > <%=request.getParameter("txtAcuerdoComite")!=null?request.getParameter("txtAcuerdoComite"):""%>&nbsp; 
    </td>
  </tr>
  <tr bordercolor="#000000" class="texto"> 
    <td height="29" colspan="2" align="center" bgcolor="#FFFFFF">Registro Presupuestal</td>
  </tr>
  <tr bordercolor="#000000" class="texto"> 
    <td bgcolor="#FFFFFF">Eje:</td>
    <td bgcolor="#FFFFFF" > 
      <%  if(request.getParameter("cboEje")!=null)
                                out.print(request.getParameter("cboEje"));
                  %>
    </td>
  </tr>
  <tr bordercolor="#000000" class="texto"> 
    <td bgcolor="#FFFFFF">Programa:</td>
    <td bgcolor="#FFFFFF" > 
      <%  if(request.getParameter("cboPrograma")!=null)
                                out.print(request.getParameter("cboPrograma"));
                  %>
    </td>
  </tr>
  <tr bordercolor="#000000" class="texto" > 
    <td bgcolor="#FFFFFF" > Proyecto: </td>
    <td bgcolor="#FFFFFF" > 
      <%  if(request.getParameter("cboProyecto")!=null)
                                out.print(request.getParameter("cboProyecto"));
                  %>
    </td>
  </tr>
  <tr bordercolor="#000000" class="texto"> 
    <td bgcolor="#FFFFFF">Accion:</td>
    <td bgcolor="#FFFFFF" > 
      <%  if(request.getParameter("cboAccion")!=null)
                                out.print(request.getParameter("cboAccion"));
                  %>
    </td>
  </tr>
  <tr bordercolor="#000000"> 
    <td align="left" class="texto"> Saldo Anterior:</td>
    <td class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteRP)%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td align="left"  class="texto">Importe Asignado: </td>
    <td  class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteA)%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  class="texto"> Saldo Disponible Actual: </td>
    <td class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteT)%></td>
  </tr>
</table>
<table width="70%" height="38" align="center">
  <tr> 
    <td class="texto" align="left">&nbsp;</td>
  </tr>
  <tr> 
    <td class="texto" align="left">&nbsp;</td>
  </tr>
  <tr> 
<td class="textoNegrita" align="center"><%=sCaptura.equals("SI")?"Capturada":"Autorizada"%> por:</td>  </tr>
  <tr> 
    <td align="center">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center"> _______________________</td>
  </tr>
  <tr> 
    <td class="textoNegrita" ><div align="center"><b><%=(String)session.getAttribute("NomUser")%></b></div></td>
  </tr>
  <tr> 
    <td  class="texto" align="center">&nbsp;</td>
  </tr>
  <tr> 
    <td  class="texto" align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir()" > 
      &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:regresar()" > 
    </td>
  </tr>
</table>
</BODY>
</HTML>
