<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<%@ page errorPage="FI_Instrucciones.jsp?error=1" %>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.nInstrucciones"/>
<%@ include file="sesionInst11.jsp" %> 
<%@ include file="pki.jsp" %>
<%@ include file="parametrosPKI.jsp" %>

<%		
    boolean bInstruccion=false;
    String Folio2         = request.getParameter("txtFolio2");   
	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
	//FOLIO RETIRO: Folio
	//FOLIO DEPOSITO:Folio2
	if(BD.existeFolio(Folio2,1) || BD.existeFolio(Folio,2)) 
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}		
				 
        /**************************************************************Firma Digital***********************************************************/
   %>		
   <%@ include file="firmaDigital.jsp" %>
   <%  
        /**************************************************************Fin Firma Digital********************************************************/
				
        // Almacena arreglo con datos del Retiro
	String[] sData = new String[32]; 
	sData[0] = fecha;
	sData[1] = Folio;
	sData[2] = (String)session.getAttribute("NumFid");
	//Retiro en espera de autorizacion
	sData[31] = (String)session.getAttribute("NumUser");
	sData[3] = request.getParameter("cboContrato");
	sData[4] = request.getParameter("txtImporte");
	sData[5] = "SI";
	sData[6] = request.getParameter("txtConcepto");
	sData[7] = "2311";
	// FISO Destino
	sData[8] =  request.getParameter("cboFisoD");
	sData[9] = " ";
	sData[10] = "2311";
	sData[11] = "90";
	sData[12] = "33";
	sData[13] = "FIDUCIARIA";
	sData[14] = request.getParameter("txtImporte");
	sData[22] = "TERCERO";
			
	String[] bitacora = new String[4];
	bitacora[0]=fecha;
	bitacora[1]=Folio;
	bitacora[2]=(String)session.getAttribute("NumUser");
	bitacora[3]="Retiro por Internet con Folio: "+Folio+detalleBit;
	
	// Se prepara para realizar el deposito en el fideicomiso destino
	System.out.println("Folio 2: " + Folio2);
	String[] bitacora2 = new String[4];
	bitacora2[0]=fecha;
	bitacora2[1]=Folio2;
	bitacora2[2]=(String)session.getAttribute("NumUser");
	bitacora2[3]="Deposito por Internet con Folio: "+Folio2+detalleBit;	
	
	
	
	// Almacena arreglo con datos del Deposito
	String[] sData2 = new String[32]; 
	sData2[0] = fecha;
	sData2[1] = Folio2;
	sData2[2] = (String)request.getParameter("cboFisoD");
	sData2[3] = (String)session.getAttribute("NumUser");
	sData2[4] = "2311";
	sData2[5] = request.getParameter("txtImporte");
	sData2[6] = (String)request.getParameter("txtConcepto");
	sData2[7] = (String)session.getAttribute("NumFid");
	sData2[8] = (String)request.getParameter("cboContratoD");
	sData2[9] = (String)request.getParameter("cboContrato");		
	  
	bInstruccion=BD.insertaInterFid(sData,sData2,bitacora,bitacora2);	
		 
        if(!bInstruccion)
	{
	   session.setAttribute("msgError","Tu operaci�n(Traspaso inter Fideicomisos) no fue procesada<br>Intenta nuevamente");
	%>
	   <jsp:forward page="FI_Instrucciones.jsp"/>    
	<%       
		}			
	%> 
<HTML><HEAD>
<TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link href="styles/bancomext.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
function instrucciones()
	{
		parent.location='FI_Instrucciones.jsp'
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
<BODY vLink=#052206 leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table border="0" width="90%" align="center">
  <tr bordercolor="#000000"> 
    <td><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td align="right" class="textoNegrita"><table width="100%" border="0" height="79">
        <tr bordercolor="#000000"> 
          <td width="11%"><img src="imagenes/logo.jpg" width="135" height="89"></td>
          <td width="89%" align="center" bordercolor="#FFFFFF" class="subtitulo">DIRECCION 
            FIDUCIARIA <br>
            SOLICITUD DE TRASPASO INTER-FIDEICOMISOS </td>
        </tr>
      </table></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">Fecha: <%=BD.getFecha()+"&nbsp;&nbsp;  "+BD.getHora() +" hrs."%></td>
  </tr>
  <tr bordercolor="#000000">
    <td  align="right" class="textoNegrita">&nbsp;</td>
  </tr>
</table>
<table width="70%" border="0" align="center">
  <tr> 
    <td align="center">
	<table width="100%" border="1" bordercolor="#FFFFFF">
        <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
          <td colspan="3" h><b class="subtitulo">Folios de Operaci&oacute;n: <%=Folio%> 
            &nbsp; y &nbsp; <%=Folio2%> </b></td>
        </tr>


        <tr bordercolor="#000000"> 
          <td colspan="2" class="textoNegrita" align="center"> RETIRO CONTRATO DE INVERSION 
            ORIGEN</td>
        </tr>
		  <tr bordercolor="#000000"> 
          <td class="texto">Folio: </td>
          <td class="texto"> <%=Folio%> </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td width="179"  class="texto">Fideicomiso:</td>
          <td width="349"  class="texto"><%= session.getAttribute( "Fideicomiso" ) %></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Contrato de Inversi&oacute;n: </td>
          <td class="texto"> <%=request.getParameter("cboContrato")%> </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto"> Concepto:</td>
          <td class="texto"> <%=request.getParameter("txtConcepto")%> </td>
        </tr>
				        <tr bordercolor="#000000"> 
          <td  class="texto"> Importe:</td>
          <td class="texto"> <%=request.getParameter("txtImporteF")%> </td>
        </tr>
		 <tr bordercolor="#000000"> 
          <td colspan="2" class="textoNegrita" align="center">DEPOSITO CONTRATO DE INVERSION 
            DESTINO</td>
        </tr>
		        <tr bordercolor="#000000"> 
          <td class="texto">Folio: </td>
          <td class="texto"> <%=Folio2%> </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Fideicomiso: </td>
          <td class="texto"> <%=request.getParameter("cboFisoD")%> </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto"> Contrato de Inversi&oacute;n:</td>
          <td class="texto"> <%=request.getParameter("cboContratoD")%> </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td  class="texto"> Concepto:</td>
          <td class="texto"> <%=request.getParameter("txtConcepto")%> </td>
        </tr>
				        <tr bordercolor="#000000"> 
          <td  class="texto"> Importe:</td>
          <td class="texto"> <%=request.getParameter("txtImporteF")%> </td>
        </tr>

      </table> </td>
  </tr>
  <tr> 
    <td align="center"><table width="100%" height="38">
        <tr> 
          <td width="544" >&nbsp;</td>
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
  

        <!--tr> 
          <td > 
		  <br>
            <p class="subtitulo" align="justify"> 
			  La aplicaci&oacute;n de este traspaso est&aacute; 
              sujeta a la recepci&oacute;n de su notificaci&oacute;n por este 
              medio, a m&aacute;s tardar a las 12:30 horas. En caso de requerir 
              inversiones en valores gubernamentales, la notificaci&oacute;n deber&aacute; 
              realizarse antes de las 10:30 horas. 
			  </p>
            <p class="subtitulo" align="justify"> 
			  Los traspasos solicitados y notificados fuera 
              de ese horario se realizar&aacute;n al siguiente d&iacute;a h&aacute;bil 
            </p>
			
			</td>
        </tr-->
        <tr> 
          <td >&nbsp;</td>
        </tr>
        <tr> 
          <td  align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir()" > 
            &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:instrucciones()" ></td>
        </tr>
      </table> </td>
  </tr>
</table>
</BODY>
</HTML>
