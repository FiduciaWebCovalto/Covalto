<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="sesionInst11.jsp" %>
<%@ include file="parametrosToken.jsp" %>
<%
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/
	NumberFormat nfFormato;
	nfFormato = NumberFormat.getCurrencyInstance(Locale.US);
	double dImporte;
	String sImporte;
	
	dImporte= Double.parseDouble(request.getParameter("txtImporte"));
	sImporte = nfFormato.format(dImporte);
	
   double SaldoCO=BD.getSaldoActual((String)session.getAttribute("NumFid"),request.getParameter("cboContrato"));
	   
   String Folio=BD.getFolio(2);
   String Folio2=BD.getFolio(2);
   String alerta= "";

	//mensaje a firmar digitalmente
	String mensaje="\"INSTRUCCION DE TRASPASO INTER-FIDEICOMISOS";     
	mensaje+="\\n\\nRetiro Contrato de Inversi�n Origen: ";
	mensaje+="\\n\\n	Folio de Operaci�n: "+Folio;
	mensaje+="\\n	Fideicomiso: "+session.getAttribute( "NumFid" );  
	mensaje+="\\n	Contrato de Inversi�n: "+request.getParameter("txtCO");
    mensaje+="\\n	Concepto: "+ request.getParameter("txtConcepto");
	mensaje+="\\n	Importe: "+((NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte")).doubleValue()))).trim();
	mensaje+="\\n\\nDep�sito Contrato de Inversi�n Destino: ";
	mensaje+="\\n\\n	Folio de Operaci�n: "+Folio2;
	mensaje+="\\n	Fideicomiso: "+request.getParameter( "txtFD" );
	mensaje+="\\n	Contrato de Inversi�n: "+request.getParameter("txtCD");
	mensaje+="\\n	Concepto: "+ request.getParameter("txtConcepto");
	mensaje+="\\nImporte: "+((NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporte")).doubleValue()))).trim();	
	mensaje+="\";";
				
%>
<HTML>
<HEAD><TITLE>Instrucciones - Confirmar Traspaso </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
<script language="JavaScript" type="text/JavaScript">
<!-- 
function cancelar() 
 {
	  parent.location="FI_Instrucciones.jsp";
 }
 

function Sign()
		{
// script para Microsoft Internet Explorer		

if(bName == "Microsoft Internet Explorer")
	{
			var ToSignText;
			var pkcs7_="";
			var estatus;
			ToSignText=<%=mensaje%>			
			SeguriSIGN.Who=document.domain;
			pkcs7_=SeguriSIGN.Firma(ToSignText);
			if(SeguriSIGN.status == 2000)	
				{
				document.Traspaso.Pkcs7.value=pkcs7_;
				document.Traspaso.SignedText.value="NONE";
				if(SeguriSIGN.File!="")
					alert("El archivo seleccionado fue:"+SeguriSIGN.File);
				}
			else
				{
				if(SeguriSIGN.status != 0)
					alert("Error del proceso de la Firma: "+SeguriSIGN.status);
				else if(SeguriSIGN.status == 0)
					alert("Para poder realizar la Instrucci�n de Pago de Honorarios\n Es necesaria su Firma Digital ");					
				}
			
			if(SeguriSIGN.status == 2000)
				{
				document.Traspaso.action="instruccion11.jsp";
				document.Traspaso.submit();
				}
}
else
	if (bName == "Netscape") 
		{
		var ToSignText;
		var pkcs7_="";
		ToSignText=<%=mensaje%>
		pkcs7_=crypto.signText(ToSignText,"ask");
		if(pkcs7_!="error:UserCancel" && pkcs7_!="error:internalError" && pkcs7_!="error:noMatchingCert")
			{
			document.Traspaso.Pkcs7.value=pkcs7_;
			document.Traspaso.SignedText.value=escape(ToSignText);
			document.Traspaso.action="instruccion11.jsp";
			document.Traspaso.submit();
			}
		else    {

			if(pkcs7_=="error:internalError")
				{
				alert("Verifique que la AC que emitio el certificado este instalada o habilitada");
				}
			else	{
				if(pkcs7_=="error:userCancel")
					alert("El proceso de firma fue cancelado por el usuario");
				else
					if(pkcs7_=="error:noMatchingCert")
						alert("Es posible que la base de datos de certificados no este inicializada o este vacia");	
				}
		     }
}		
}//sing


//-->
</script>
</HEAD>
<body class="bg-light">
<jsp:include page="header.jsp"/>
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%" >
  <TBODY>
    <TR class="trMenuSuperior">
      <TD colspan="7">
        <ul class="menuSuperior">
          <li><a href="FI_Consultas.jsp">Consultas</a></li>
          <li><a href="FI_Instrucciones.jsp">Instrucciones</a></li> <li><a href="FI_InstruccionesN.jsp">Instrucciones No Monetarias</a></li>
          <li><a href="FI_EdosF.jsp">Informacion Financiera</a></li>
          <li><a href="FI_Opciones.jsp">Opciones</a></li>
          <li><a href="salir.jsp">Salir</a></li>
        </ul>
      </TD>
    </TR>
    <TR > 
      <TD align="center" class="tdMenuLateral"  valign="top" height="100%"   width="176">
        <%@ include file="menuInstrucciones.jsp" %>
      </TD>
      <TD valign="top" align="center"> <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
          <td width="90%" class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Confirmar 
              Traspaso Inter-Fideicomisos</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td><table width="100%"  border="0">
                <tr> 
                  <td ></td>
                </tr>
                <tr> 
                  <td  align="center"> <form name="Traspaso" method="post" action="">
                      <input type="hidden" name="Pkcs7">
                      <input type="hidden" name="SignedText">
                      <input type="hidden" name="txtFolio" 		value="<%=Folio%>">
					  <input type="hidden" name="txtFolio2" 		value="<%=Folio2%>">
                      <input type="hidden" name="cboContrato" 	value="<%=request.getParameter("txtCO")%>">
                      <input type="hidden" name="cboFisoD" 		value="<%=request.getParameter("txtFD")%>">
                      <input type="hidden" name="cboContratoD" 	value="<%=request.getParameter("txtCD")%>">
                      <input type="hidden" name="txtImporte" 	value="<%=request.getParameter("txtImporte")%>">
                      <input type="hidden" name="txtConcepto" 	value="<%=request.getParameter("txtConcepto")%>">
                       <input type="hidden" name="txtImporteF" 	value="<%=sImporte%>">
                      <table width="90%" >
                        <td  colspan="2" align="center"  bgcolor="#999966" class="celda01"><b>DETALLE 
                          DEL TRASPASO</b></td>
                        </tr>

                        <tr  class="celda01"> 
                          <td colspan="2"   bgcolor="#CCCCCC"> Retiro Contrato 
                            de Inversi&oacute;n Origen:</td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="35%"    >Fideicomiso :</td>
                          <td width="65%" > <%=(String)session.getAttribute("NumFid")%> 
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="35%"    >Contrato de Inversi&oacute;n : 
                          </td>
                          <td width="65%" > <%=request.getParameter("txtCO")%> 
                          </td>
                        </tr>
						<tr  class="celda02"> 
                          <td  > Concepto:</td>
                          <td  > <%=request.getParameter("txtConcepto")%> </td>
                        </tr>
						 <tr  class="celda02"> 
                          <td  > Importe:</td>
                          <td  > <%=sImporte%> </td>
                        </tr>
						 <tr  class="celda01"> 
                          <td colspan="2"    bgcolor="#CCCCCC"> Dep&oacute;sito 
                            Contrato de Inversi&oacute;n Destino: </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="35%"    > Fideicomiso : </td>
                          <td width="65%" > <%=request.getParameter("txtFD")%> 
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td >Contrato de Inversi&oacute;n :</td>
                          <td > <%=request.getParameter("txtCD")%> </td>
                        </tr>
						                        <tr  class="celda02"> 
                          <td  > Concepto:</td>
                          <td  > <%=request.getParameter("txtConcepto")%> </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td  > Importe:</td>
                          <td  > <%=sImporte%> </td>
                        </tr>
                      </table>
                    </form></td>
                </tr>
                <tr> 
                  <td align="center">&nbsp;</td>
                </tr>
                <%if(alerta.trim().equals(""))
						{
						%>
                <tr> 
                  <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.back()"><u>Modificar 
                    Instrucci&oacute;n</u></a></td>
                </tr>
                <tr> 
                  <td >&nbsp;</td>
                </tr>
                <%}%>
                <tr> 
                  <td align="center">
                      <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:Sign()" class="boton">
                      &nbsp; 
                      <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton">
                  </td>
                </tr>
              </table> </td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
