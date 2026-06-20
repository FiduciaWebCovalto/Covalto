<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.nInstrucciones"/>
<%@ include file="sesionInst4.jsp" %>
<%@ include file="pki.jsp"%> 
<%@ include file="parametrosPKI.jsp"%>
<% 
	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
	if(BD.existeFolio(request.getParameter("txtFolio"),4))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}


/**************************************************************Firma Digital***********************************************************/
   %>		
   <%@ include file="firmaDigital.jsp"%>
   <%  
/**************************************************************Fin Firma Digital********************************************************/

	DecimalFormat num = new DecimalFormat("############0.00");
	double importe=NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte")).doubleValue();
	boolean bInstruccion=false;
		
	String sFolioFS=BD.getFolioFOSEG();
	String sContarto = null;
	sContarto = BD.getContRendimientos((String)session.getAttribute("NumFid"));
	
	String[] sData = new String[1];
	sData[0] ="7000,14,2,1,1,0,"+(String)session.getAttribute("NumFid")+","+ request.getParameter("txtAnio")+",3,"+sFolioFS+","+fecha+","+num.format(importe)+",H,"+ "N,"+ Folio+",DE CONFORMIDAD CONTRATO FISO,null," + sCaptura;
						   
	String[] bitacora = new String[4];
	bitacora[0]=fecha;
	bitacora[1]=Folio;
	bitacora[2]=(String)session.getAttribute("NumUser");
	bitacora[3]="Pago de Honorarios por Internet con Folio: "+Folio;//+detalleBit;
	
	String[] firmas = new String[5];
	
	firmas[0]= "2";
	firmas[1]= Folio;
	firmas[2]= (String)session.getAttribute("NumFid");
	firmas[3]= (String)session.getAttribute("NumUser");
	firmas[4]= fecha;	 

  	bInstruccion=BD.insertaPagoHonFOSEG( (String)session.getAttribute("NumFid"),
														null,
														sContarto, 
														num.format(importe),
														Folio,
														sData,
														bitacora,
														firmas);	
 
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
<TITLE>Instrucciones Pago de Honorarios - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>

<link href="styles/bancomext.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">

function instrucciones()
	{
	parent.location='FI_Instrucciones.jsp';
	}
function imprimir()
{
window.print();
parent.location='FI_Instrucciones.jsp';
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
<BODY vLink=#052206  leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
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
            AVISO DE PAGO DE HONORARIOS FIDUCIARIOS </td>
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
        <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
         	<td height="33" colspan="2" class="subtitulo">Folio de Operaci&oacute;n: <%=Folio%></td>
        </tr>
		<tr bordercolor="#000000"> 
          <td width="203"  class="texto" >Fideicomiso:</td>
          <td width="331"  class="texto"><%= session.getAttribute( "Fideicomiso" ) %></td>
        </tr>
		<tr  bordercolor="#000000">
			<td width="203"  class="texto">En espera de autorizaci�n:</td>
			<td width="203"  class="texto"><%= sCaptura %> </td>
		</tr>
		<tr bordercolor="#000000">
			<td width="203"  class="texto">Ejercicio:</td>
			<td width="203"  class="texto"><%=request.getParameter("txtAnio")%></td>
		</tr>		
        <tr bordercolor="#000000"  class="texto"> 
          <td height="29" colspan="2" align="center">Registro Presupuestal</td>
        </tr>						
		<tr  bordercolor="#000000"> 
			<td  width="203"  class="texto" align="right">Eje:</td>
			<td  width="203"  class="texto" >14.   Rendimientos Financieros</td>
		</tr>         
		<tr  bordercolor="#000000"> 
			<td    width="203"  class="texto"   align="right">Programa:</td>
			<td width="203"  class="texto" >2.  Rendimeintos Aplicados</td>
		</tr>   		
		<tr  bordercolor="#000000"> 
			<td width="203"  class="texto"  align="right">Proyecto:</td>
			<td width="203"  class="texto" >1.  Aplicaciones Generales </td>
		</tr>   
		<tr bordercolor="#000000"> 
			<td width="203"  class="texto"  align="right">Acci&oacute;n:</td>
			<td width="203"  class="texto" >1. Honorarios Fiducuiarios </td>
		</tr>    	
		<tr bordercolor="#000000"> 
			<td   width="203"  class="texto" >Comprometido:</td>
			<td  width="203"  class="texto">NO</td>
		</tr>     		


        <tr bordercolor="#000000"> 
          <td class="texto">Concepto:</td>
          <td class="texto"> HONORARIOS POR ADMINISTRACION DEL PERIODO  &nbsp;&nbsp;
		  							<% out.println(request.getParameter("txtPeriodo")); %> , &nbsp; 
									<%=request.getParameter("txtEstado")%>
		  </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto"  width="203" > Importe del Pago de Honorarios:</td>
          <td class="texto"  width="203" > 
            <%
					if(request.getParameter("txtImporte")!=null)
                        	out.print(NumberFormat.getCurrencyInstance(Locale.US).format( NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte")).doubleValue() ));
					%>
            (incluye IVA)</td>
        </tr>
		<tr bordercolor="#000000">
			<td class="texto"  width="203" >Forma de Liquidaci�n</td>
			<td class="texto"  width="203" >Descontar del Fondo</td>
		</tr>
      </table> 
	</td>
  </tr>
  <tr> 
    <td align="center">
	
	<table width="100%" height="38">
		<tr>
			<td></td>
		</tr>
		<tr> 
         	<td class="textoNegrita" align="center"><%=sCaptura.equals("SI")?"Capturada":"Autorizada"%> por:</td>
        </tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
		 <tr> 
          <td align="center"> _______________________</td>
        </tr>
		<tr> 
          <td class="textoNegrita" ><div align="center"><b><%=(String)session.getAttribute("NomUser")%></b></div></td>
        </tr>
        <tr>  
           <tr> 
          <td class="texto"> 
            <%if(request.getParameter("cboContratoPH")==null)
	     {%>
            <p class="subtitulo" align="justify"> 
			  La aplicaci&oacute;n de este pago est&aacute; 
              sujeta a la recepci&oacute;n de los recursos en la cuenta indicada 
              y a su notificaci&oacute;n por este medio, a mas tardar a las 12:30 
              horas de su fecha. 
			  </p>
             <p class="subtitulo" align="justify"> 
			 Los pagos recibidos y notificados fuera de ese 
              horario se aplicar&aacute;n al siguiente d&iacute;a h&aacute;bil. 
            </p>
            <%}%>
          </td>
        </tr>
        <tr> 
          <td>&nbsp;</td>
        </tr>
          
          <td class="texto" align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir()" > 
            &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:instrucciones()" > 
          </td>
        </tr>
      </table> </td>
  </tr>
</table>
</BODY>
</HTML>



