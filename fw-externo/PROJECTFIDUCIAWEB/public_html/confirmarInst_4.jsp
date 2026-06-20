<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="Formato"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="Moneda"  class="com.bancomext.negocio.nConsultas"/>
<%@ include file="sesionInst4.jsp" %>
<%@ include file="parametrosToken.jsp" %>
<%  
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/	
String titulo="Confirmar Pago de Honorarios";
String Folio="";
String mensajePKI="";
String cotizacion="";   
Moneda.setVtrStrDato1((String)request.getParameter("cboDivisa")!=null?(String)request.getParameter("cboDivisa"):(String)request.getParameter("cboMonedaSwiftR"));
    Moneda.querySelect(49);
    int cveMoneda = Moneda.getVtrIntDato1();

    if( cveMoneda != 1 ) {
         cotizacion = BD.obtenTipoCambio(cveMoneda, fecha);
         //impValor = Double.parseDouble(request.getParameter("txtImporteD")) * Double.parseDouble(cotizacion);
    } else {
         cotizacion = "1";
    }

 double SaldoCO;
 if(request.getParameter("cboCuentaPH")!=null  && !request.getParameter("cboCuentaPH").equals("fondo") ) 
 	{
	 titulo="Pago de Honorarios";		
   	 Folio=BD.getFolio(2);
	 SaldoCO=0;
	}
 else
		{
		   if((request.getParameter("cboContratoPH")!=null  && !request.getParameter("cboContratoPH").equals("") ))
			  SaldoCO=BD.getSaldoActual((String)session.getAttribute("NumFid"),request.getParameter("cboContratoPH"));
		   else
			  SaldoCO=0;
			  
			if((request.getParameter("cboContratoPH")!=null  && !request.getParameter("cboContratoPH").equals("") )&&  SaldoCO < (NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImportePH")).doubleValue()))
						 titulo="Pago de Honorarios";		
			else						  
				{
				Folio=BD.getFolio(2);
				}
		}
//mensaje a firmar digitalmente

mensajePKI	 = "\"INSTRUCCION DE PAGO DE HONORARIOS\\n\\n"
				 +  "Folio de Operaci�n: "+Folio
 		 		 +  "\\nFideicomiso:"+session.getAttribute( "Fideicomiso" );
		       
 if(request.getParameter("cboCuentaPH")!=null  && !request.getParameter("cboCuentaPH").equals("fondo") ) 
	mensajePKI += "\\nCuenta Bancomext en la que se depositaron los recursos: "+request.getParameter("cboCuentaPH");             	
else 
 if(request.getParameter("cboContratoPH")!=null  && !request.getParameter("cboContratoPH").equals("") ) 
	mensajePKI += "\\nDescontar del Contrato: "+request.getParameter("cboContratoPH");
	
mensajePKI += "\\nImporte con IVA: $"+request.getParameter("txtImportePH");
mensajePKI += "\";";
%>

<HTML>
<HEAD><TITLE>Instrucciones - <%=titulo%></TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
<script language="JavaScript" type="text/JavaScript">
function cancelar()
	{
	  parent.location="FI_Instrucciones.jsp";
	}
function Sign()
		{
// script para Microsoft Internet Explorer		

if(bName == "Microsoft Internet Explorer")
	{
				document.Pago.action="instruccion4.jsp";
				document.Pago.submit();
  }
else{
	if (bName == "Netscape") 
		{
			document.Pago.action="instruccion4.jsp";
			document.Pago.submit();
		}
  }
}//sign

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
      <TD valign="top"><table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo"><%=titulo%></td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> <table width="80%"  border="0">
                <%
				 if(request.getParameter("cboCuentaPH")!=null  && request.getParameter("cboCuentaPH").equals("fondo") ) 
				 if((request.getParameter("cboContratoPH")!=null  && !request.getParameter("cboContratoPH").equals("") )&&  SaldoCO < (NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImportePH")).doubleValue()))
						{
						%>
                <tr> 
                  <td class="alerta"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;EL 
                    SALDO DEL CONTRATO DE INVERSION ES INSUFICIENTE<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
                    &nbsp;&nbsp;&nbsp;&nbsp;NO SE PUEDE REALIZAR EL PAGO DE HONORARIOS</td>
                </tr>
                <%}%>
                <tr> 
                  <td  align="center"> <form name="Pago"  method="post" action="">
                      <input type="hidden" name="Pkcs7">
                      <input type="hidden" name="SignedText">
                      <input type="hidden" name="txtFolio" value="<%=Folio%>" >
                      <input type="hidden" name="txtImportePH" value="<%=request.getParameter("txtImportePH")%>">
                      <% 
    		  if(request.getParameter("cboCuentaPH")!=null  && !request.getParameter("cboCuentaPH").equals("fondo") ) 

					{%>
                      <input type="hidden" name="cboCuentaPH" value="<%=request.getParameter("cboCuentaPH")%>" >
                      <%}
		    else  if(request.getParameter("cboContratoPH")!=null  && !request.getParameter("cboContratoPH").equals("") ) 
					{%>
                      <input type="hidden" name="cboContratoPH" value="<%=request.getParameter("cboContratoPH")%>">
                      <%}%>
                      <table width="100%">
					   <td  colspan="2" align="center"  bgcolor="#999966" class="celda01"><b>DETALLE 
                           DEL PAGO</b></td>
                        </tr>
                        <input type="HIDDEN"  name="fechaValor" 
                        value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):""%>">
                        <tr  class="celda02"> 
                          <td align="left">Fecha del Pago: </td>
                          <td > <%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%> 
                          </td>
                        </tr>                                                                                                
                        <%
		       if(request.getParameter("cboCuentaPH")!=null  && !request.getParameter("cboCuentaPH").equals("fondo") ) 

					{%>
                        <tr  class="celda02"> 
                          <td width="210"   > Cuenta <%=session.getAttribute("empresa_9")%> en 
                            la que se Deposito:</td>
                          <td  > <%=request.getParameter("cboCuentaPH")%> 
                          </td>
                        </tr>
                        <%}
					else	if(request.getParameter("cboContratoPH")!=null  && !request.getParameter("cboContratoPH").equals(""))
								{%>
                        <tr  class="celda02"> 
                          <td    >Descontar 
                            del Contrato:</td>
                          <td  ><%=request.getParameter("cboContratoPH")%> 
                            <% if((request.getParameter("cboContratoPH")!=null  && !request.getParameter("cboContratoPH").equals("") ) &&  SaldoCO < (NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImportePH")).doubleValue()))
						{
						out.print("<font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible: "+NumberFormat.getCurrencyInstance(Locale.US).format(SaldoCO)+"]</font>");
						}
						%>
                          </td>
                        </tr>
                        <%}%>
                        <tr  class="celda02"> 
                          <td align="left">Divisa: </td>
                          <td > <%=(String)request.getParameter("cboDivisa")%> 
                          </td>
                        </tr>                                                
                        <input type="HIDDEN"  name="txtNomMoneda" value="<%=(String)request.getParameter("cboDivisa")!=null?(String)request.getParameter("cboDivisa"):""%>">
                        <tr  class="celda02"> 
                          <td> Importe del Pago de Honorarios:</td>
                          <td  width="291" > 
                            <%
							if(request.getParameter("txtImportePH")!=null)
                		        	//out.print(NumberFormat.getCurrencyInstance(Locale.US).format( NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImportePH")).doubleValue() ));
                              //out.print(request.getParameter("txtImportePH"));
                              out.print(Formato.muestraImporte((String)request.getParameter("txtImportePH")));
						%>
                            (incluye IVA)</td>
                        </tr>
                      </table>
                    </form></td>
                </tr>
                <tr> 
                  <td height="20" align="center">&nbsp;</td>
                </tr>
                <%if((request.getParameter("cboCuentaPH")!=null  && request.getParameter("cboCuentaPH").equals("fondo") )  && (request.getParameter("cboContratoPH")!=null  && !request.getParameter("cboContratoPH").equals("") ) && SaldoCO < (NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImportePH")).doubleValue()));
				     else
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
                  <td height="30" align="center"> 
                    <% 
					if((request.getParameter("cboCuentaPH")!=null  && request.getParameter("cboCuentaPH").equals("fondo") )  && (request.getParameter("cboContratoPH")!=null  && !request.getParameter("cboContratoPH").equals("") ) && SaldoCO < (NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImportePH")).doubleValue()))
						{
						%>
                    <input type="button" name="Modificar" value="Modificar" onClick="javascript:history.back()"  class="boton" > 
                    <%}
	  else{%>
                    <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:Sign()"  class="boton" > </a> 
                    <%}%>
                    &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()"  class="boton" > 
                  </td>
                </tr>
              </table></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
