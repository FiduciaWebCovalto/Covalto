<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="Horario"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="FechaHabilSig"  class="com.bancomext.negocio.RetirosDB"/>
<jsp:useBean id="MonedaOrig"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="MonedaDest"  class="com.bancomext.negocio.nConsultas"/>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="parametrosToken.jsp" %>
<%
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/
    String valCtoInverOrigen;      
    valCtoInverOrigen=((String)request.getParameter("cboContratoOrigenTC"));
    String valCtoInverDestino;      
    valCtoInverDestino=((String)request.getParameter("cboContratoDestinoTC"));
    
    
    //por default moneda nacional
    String sMonedaOrigen="MONEDA NACIONAL";
    String sMonedaDestino="MONEDA NACIONAL";
    MonedaOrig.setVtrStrDato1(sMonedaOrigen);
    MonedaOrig.querySelect(49);
    int cveMonedaOrigen = MonedaOrig.getVtrIntDato1();
    MonedaDest.setVtrStrDato1(sMonedaOrigen);
    MonedaDest.querySelect(49);
    int cveMonedaDestino = MonedaDest.getVtrIntDato1();
   
    double SaldoCO=BD.getSaldoActualCtaCheques((String)session.getAttribute("NumFid"),valCtoInverOrigen,
      ((String)request.getParameter("cboSubCuentaOrigen")));
    
   String Folio=BD.getFolio(2);

   String fechaValor="";
   Horario.querySelect(65);     //SE OBTIENE LA HORA DE LA BASE Y SE COMPARA VS EL HORARIO DE OPERACION EN FORMATO HH24MI
   if(Horario.getVtrIntDato1()<1600){//HORARIO MAYOR A 14:30 EN RETIROS
    fechaValor = request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha;  
    fechaValor=FechaHabilSig.obtenerFechaHabilSig(fechaValor,cveMonedaOrigen,1);
   } 
  else{
    fechaValor = request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha;  
    fechaValor=FechaHabilSig.obtenerFechaHabilSig(fechaValor,cveMonedaOrigen,2);
   } 

//mensaje a firmar digitalmente

		 String mensaje="\"INSTRUCCION DE TRASPASO ENTRE CONTRATOS DE INVERSION\\n\\n";       
			mensaje+="Folio de Operaci�n: "+Folio+"\\n";
        		mensaje+="Fideicomiso: "+session.getAttribute( "Fideicomiso" );
			mensaje+="\\nContrato de Inversi�n Origen: "+request.getParameter("cboContratoOrigenTC");
	                mensaje+="\\nContrato de Inversi�n Destino: "+request.getParameter("cboContratoDestinoTC");
                        mensaje+="\\nImporte: "+((NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteTC")).doubleValue()))).trim();
   		        mensaje+="\";";
				
		String alerta="";
		 if(SaldoCO<(NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteTC")).doubleValue()))
					{
					alerta="EL SALDO DE LA CUENTA DE CHEQUES ORIGEN ES INSUFICIENTE<BR>NO SE PUEDE REALZAR EL TRASPASO";
					}				
%>
<HTML>
<HEAD><TITLE>Instrucciones - Confirmar Traspaso </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
</script>
<script language="JavaScript" type="text/JavaScript">
function confirmar() 
{
   <%
   if(sCaptura.equals("NO"))
   {
   %>
     Sign()
   <%
   }
   else
   {
   %>
      document.Traspaso.action='instruccion10.jsp';
      document.Traspaso.submit();
   <%
   }
   %>
}


 function Sign()
		{
if(bName == "Microsoft Internet Explorer")
	{		
		document.Traspaso.action="instruccion10.jsp";
		document.Traspaso.submit();
	}
	if (bName == "Netscape") 
	{
			document.Traspaso.action="instruccion10.jsp";
			document.Traspaso.submit();
   }   
}
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
          <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Confirmar 
              Traspaso </td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td><table width="100%"  border="0">
                <tr> 
                  <td class="alerta"><%=alerta%></td>
                </tr>
                <tr> 
                  <td  align="center"> <form name="Traspaso"  method="post" action="">
                      <input type="hidden" name="Pkcs7">
                      <input type="hidden" name="SignedText">
                      <input type="hidden" name="txtFolio" value="<%=Folio%>">
                      <input type="hidden" name="cboContratoOrigenTC" value="<%=request.getParameter("cboContratoOrigenTC")%>">
                      <input type="hidden" name="cboContratoDestinoTC" value="<%=request.getParameter("cboContratoDestinoTC")%>">
                      <input type="hidden" name="cboSubCuentaDestino" value="<%=request.getParameter("cboSubCuentaDestino")%>">
                      <input type="hidden" name="cboSubCuentaOrigen" value="<%=request.getParameter("cboSubCuentaOrigen")%>">
                      <input type="hidden" name="txtImporteTC" value="<%=request.getParameter("txtImporteTC")%>">
                      <input type="HIDDEN"  name="fechaValor" 
                      value="<%=fechaValor!=null&&fechaValor.length()>0?fechaValor:(request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):"")%>">
                      <table width="90%" >
					    <td  colspan="2" align="center"  bgcolor="#999966" class="celda01"><b>DETALLE 
                            DEL TRASPASO</b></td>
                        </tr>
                        <tr  class="celda02"> 
                          <td align="left">Fecha del Retiro: </td>
                          <td > <%=fechaValor!=null&&fechaValor.length()>0?fechaValor:(request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):"")%> 
                          </td>
                        </tr>                                                                        
                        <tr  class="celda02"> 
                          <td width="35%"    > 
                            Cuenta&nbsp;Bancaria Origen:</td>
                          <td width="65%" > 
                            <%
		      	if(request.getParameter("cboContratoOrigenTC")!=null)
                        	out.print(request.getParameter("cboContratoOrigenTC"));							
				if(SaldoCO<(NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteTC")).doubleValue()))			
				           out.print("<font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible: "+NumberFormat.getCurrencyInstance(Locale.US).format(SaldoCO)+"]</font>");
					%>
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="35%"    > 
                            Subcuenta Origen:</td>
                          <td width="65%" > 
                            <%
		      	if(request.getParameter("cboSubCuentaOrigen")!=null)
                        	out.print(request.getParameter("cboSubCuentaOrigen"));							
                            %>
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td >Cuenta&nbsp;Bancaria Destino:</td>
                          <td > 
                            <%
					if(request.getParameter("cboContratoDestinoTC")!=null)
                        	out.print(request.getParameter("cboContratoDestinoTC"));
					%>
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="35%"    > 
                            Subcuenta Destino:</td>
                          <td width="65%" > 
                            <%
                      if(request.getParameter("cboSubCuentaDestino")!=null)
                        	out.print(request.getParameter("cboSubCuentaDestino"));							
                            %>
                          </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td  > Importe del Traspaso:</td>
                          <td  > 
                            <%
				if(request.getParameter("txtImporteTC")!=null)
				   out.print(NumberFormat.getCurrencyInstance(Locale.US).format( NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteTC")).doubleValue() ));
					%>
                          </td>
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
                      <% if(!alerta.trim().equals(""))
                       {
                     %>
                      <input type="button" name="Modificar" value="Modificar" onClick="javascript:history.back()" class="boton">
                      <%}
               else    {%>
                      <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:confirmar()" class="boton">
                      <%}%>
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
