<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.nInstrucciones"/>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<%
	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
     if(BD.existeFolio(request.getParameter("txtFolio"),7))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}
		
	     String sFiso=(String)session.getAttribute("NumFid");
      DecimalFormat num = new DecimalFormat("############0.00");
      double sImporte =  NumberFormat.getInstance(Locale.US).parse((request.getParameter("txtImporteR")!=null&&!(request.getParameter("txtImporteR")).trim().equals(""))?request.getParameter("txtImporteR"):"0").doubleValue();
      double saldoDO = NumberFormat.getInstance(Locale.US).parse((request.getParameter("saldoO")!=null&&!(request.getParameter("saldoO")).trim().equals(""))?request.getParameter("saldoO"):"0").doubleValue();
      double saldoDD =  NumberFormat.getInstance(Locale.US).parse((request.getParameter("saldoD")!=null&&!(request.getParameter("saldoD")).trim().equals(""))?request.getParameter("saldoD"):"0").doubleValue();
      double saldoA=saldoDD+sImporte;
      String origen="";
      if (request.getParameter("cboOrigen").equals("Federal"))
         origen="1";
      else if (request.getParameter("cboOrigen").equals("Estatal"))
         origen="2";
      else if (request.getParameter("cboOrigen").equals("Rendimientos"))
         origen="3";
      

      String  acuerdo=request.getParameter("txtAcuerdo")!=null?request.getParameter("txtAcuerdo"):"";

      String Ejercicio=request.getParameter("cboEjercicio").trim();
      String Eje=request.getParameter("cboEje")!=null?request.getParameter("cboEje"):"-";	
      String Programa=request.getParameter("cboPrograma")!=null?request.getParameter("cboPrograma"):"-";
      String Proyecto=request.getParameter("cboProyecto")!=null?request.getParameter("cboProyecto"):"-";
      String Accion=request.getParameter("cboAccion")!=null?request.getParameter("cboAccion"):"-";


      Eje=Eje.substring(0,Eje.indexOf('-')).trim();
      Programa=Programa.substring(0,Programa.indexOf('-')).trim();
      Proyecto=Proyecto.substring(0,Proyecto.indexOf('-')).trim();
      Accion=Accion.substring(0,Accion.indexOf('-')).trim();	


      String EjercicioD=request.getParameter("cboEjercicioD").trim();
      String EjeD=request.getParameter("cboEjeD")!=null?request.getParameter("cboEjeD"):"-";	
      String ProgramaD=request.getParameter("cboProgramaD")!=null?request.getParameter("cboProgramaD"):"-";
      String ProyectoD=request.getParameter("cboProyectoD")!=null?request.getParameter("cboProyectoD"):"-";
      String AccionD=request.getParameter("cboAccionD")!=null?request.getParameter("cboAccionD"):"-";

      EjeD=EjeD.substring(0,EjeD.indexOf('-')).trim();
      ProgramaD=ProgramaD.substring(0,ProgramaD.indexOf('-')).trim();
      ProyectoD=ProyectoD.substring(0,ProyectoD.indexOf('-')).trim();
      AccionD=AccionD.substring(0,AccionD.indexOf('-')).trim();

        //se validan los saldos disponibles
    if(sCaptura.equals("NO"))
		{       	

		if(sImporte>0)
		if(BD.getSaldoRecursos(sFiso,Ejercicio,Eje, Programa,Proyecto, Accion,origen,1)<sImporte)
					{
					session.setAttribute("msgError","No se registro la operacion<br>El saldo del presupuesto origen es insuficiente ");
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


     boolean bInstruccion=false;
     boolean bFirmasMan=BD.firmasMancomunadas((String)session.getAttribute("NumFid"));
	 String[] presupuesto = new String[2];
	 presupuesto[0] ="7000,"+Eje+","+Programa+","+Proyecto+","+Accion+",0,"+(String)session.getAttribute("NumFid")+","+Ejercicio+", "+origen+","+Folio+","+fecha+","+num.format(sImporte)+",P,N,null,"+acuerdo+",Reprogramacion Origen," + sCaptura;
	 presupuesto[1] ="7000,"+EjeD+","+ProgramaD+","+ProyectoD+","+AccionD+",0,"+(String)session.getAttribute("NumFid")+","+EjercicioD+","+origen+","+Folio+","+fecha+","+ num.format(sImporte)+",D,N,null,"+acuerdo+",Reprogramacion Destino," + sCaptura;
	 
	 String[] bitacora = new String[4];
	 bitacora[0]=fecha;
	 bitacora[1]=Folio;
	 bitacora[2]=(String)session.getAttribute("NumUser");
	 bitacora[3]="Reprogramacion FOSEG por Internet con Folio: "+Folio+(sCaptura.equals("SI") || bFirmasMan ?"  y en espera de autorizaci�n":"");//+detalleBit;
	
   	 String[] firmas = new String[5];
	 firmas[0]=sCaptura.equals("SI")?"1":"2";
	 firmas[1]=Folio;
	 firmas[2]=(String)session.getAttribute("NumFid");
	 firmas[3]=(String)session.getAttribute("NumUser");
	 firmas[4]=fecha;

     bInstruccion=BD.insertaInstruccFoseg(presupuesto,bitacora,firmas,7);
	 
	 if(!bInstruccion)
					  {
					  session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Intenta nuevamente");
						%>
						<jsp:forward page="FI_Instrucciones.jsp"/>    
						<%       
						}
						
	session.setAttribute("operacion",bInstruccion?"La Instruccion con Folio:"+Folio+ " fue registrada orrectamnete<br>Error al imprimir tu comprobante de la instruccion<br>Informale a tu ejecutivo de Cuenta":"La operacion no fue registrada, Intenta Nuevamente");		

%>
	
	
<HTML><HEAD>
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
            <%=sCaptura.equals("NO") && !bFirmasMan?"COMPROBANTE DE REPROGRAMACION DE PRESUPUESTO":""%> 
            <%=sCaptura.equals("SI") && !bFirmasMan?"REPROGRAMACION DE PRESUPUESTO EN ESPERA DE AUTORIZACION":""%> 
            <%=sCaptura.equals("SI") && bFirmasMan?"REPROGRAMACION DE PRESUPUESTO EN ESPERA DE LA PRIMERA FIRMA DE AUTORIZACION":""%> 
            <%=sCaptura.equals("NO") && bFirmasMan?"REPROGRAMACION DE PRESUPUESTO EN ESPERA DE LA SEGUNDA FIRMA DE AUTORIZACION":""%> 
            </td>
        </tr>
      </table></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">Fecha:<%=BD.getFecha()+"&nbsp;&nbsp;  "+BD.getHora() +" hrs."%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">&nbsp;</td>
  </tr>
</table>
<table width="70%" border="0" align="center">
  <tr>
    <td align="center">
	<table width="100%"  border="1" bordercolor="#FFFFFF">
        <tr bordercolor="#000000"> 
          <td  colspan="2" bgcolor="#CCCCCC"  class="subtitulo">Folio de Operaci&oacute;n: 
            <%=Folio%> </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td width="38%"  class="texto">Fideicomiso:</td>
          <td width="62%" class="texto"><%= session.getAttribute( "Fideicomiso" ) %></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Origen de Recursos:</td>
          <td class="texto"><%=request.getParameter("cboOrigen")%></td>
        </tr>
        <tr bordercolor="#333333"> 
          <td  class="texto">Acuerdo del comite o Carta de Instrucci&oacute;n:</td>
          <td class="texto" > <%=request.getParameter("txtAcuerdo")%> </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto">Ejercicio Origen:</td>
          <td  class="texto"><%=request.getParameter("cboEjercicio")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto" colspan="2" align="center">Registro Presupuestal 
            Origen</td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto" > Eje Origen:</td>
          <td  class="texto" ><%=request.getParameter("cboEje")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto"> Programa Origen:</td>
          <td class="texto"><%=request.getParameter("cboPrograma")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto"> Proyecto Origen:</td>
          <td class="texto"><%=request.getParameter("cboProyecto")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto">Acci�n Origen:</td>
          <td class="texto"><%=request.getParameter("cboAccion")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td align="left" class="texto">Saldo disponible:</td>
          <td class="texto"><%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoDO)%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto" colspan="2" align="center">Registro Presupuestal 
            Destino</td>
        </tr>
        
        <tr bordercolor="#000000"> 
          <td  class="texto">Eje Destino:</td>
          <td  class="texto"><%=request.getParameter("cboEjeD")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto">Programa Destino:</td>
          <td  class="texto"><%=request.getParameter("cboProgramaD")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto">Proyecto Destino:</td>
          <td  class="texto"><%=request.getParameter("cboProyectoD")%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto">Acci�n Destino:</td>
          <td  class="texto"><%=request.getParameter("cboAccionD")%></td>
        </tr>
        <tr bordercolor="#000000" class="texto"> 
          <td bgcolor="#FFFFFF">Saldo disponible :</td>
          <td bgcolor="#FFFFFF"><%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoDD)%></td>
        </tr>
        <tr bordercolor="#000000" class="texto"> 
          <td bgcolor="#FFFFFF" >Importe a Transferir:</td>
          <td bgcolor="#FFFFFF"><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporte)%></td>
        </tr>
        <tr bordercolor="#000000" class="texto"> 
          <td bgcolor="#FFFFFF" >Saldo Actual:</td>
          <td bgcolor="#FFFFFF"><%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoA)%></td>
        </tr>
      </table></td>
  </tr>
   <tr> 
      <td align="center">
         <table width="100%" height="38">
        <tr> 
          <td >&nbsp;</td>
        </tr>
      
        <tr> 
          <td class="textoNegrita" align="center"><%=sCaptura.equals("SI")?"Capturada":"Autorizada"%> por:</td>
        </tr>
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
          <td class="textoNegrita" >&nbsp;</td>
        </tr>
        <tr> 
          <td  class="texto" align="center">&nbsp;</td>
        </tr>
        <tr> 
          <td  align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir()" > 
            &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:regresar()" ></td>
        </tr>
      </table>
      </td>
   </tr>
</table>
<p>&nbsp;</p>
</BODY>
</HTML>
