<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="Moneda"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="sesionInst4.jsp" %>
<HTML>
<HEAD><TITLE>Instrucciones - Pago de Honorarios</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/instruccion4.js'>
</script>
</HEAD>
<%	
String adeudoPH=BD.getTotalHonPend((String)session.getAttribute("NumFid"));
String strDisabled="";
String alerta="";

if((adeudoPH.trim()).length()>0&&adeudoPH.charAt(0)=='0')
	{
	strDisabled="disabled";
	alerta="No tienes Honorarios Fiduciarios Pendientes de Pago ";
	}
%>
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
      <TD valign="top" align="center">
	   <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Pago 
              de Honorarios</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> <form name="pagoHonorarios" method="post" action="">
			 <table width="50%" border="0" cellspacing="1" cellpadding="1" align="center">
                  <tr>
                    <td><div id="token" style="position:absolute; visibility:hidden;"   align="center"> 
                        <table width="305" border="1" cellpadding="1" cellspacing="1" bordercolor="#666666" bgcolor="#999999" align="center">
                          <tr> 
                            <td align="center"><table width="300" border="0" cellspacing="1" cellpadding="1" class="texto" bgcolor="#CCCCCC" align="center"  background="imagenes/fondoSubMenu.png">
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td width="43%">&nbsp;</td>
                                  <td width="57%">&nbsp;</td>
                                </tr>
                                <tr align="center"> 
                                  <td colspan="2" class="textoNegritaWhite">Introduzca 
                                    su <%=session.getAttribute("empresa_9")%>-LLAVE: 
                                    <input type="password" name="txtToken" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  value="<%=request.getParameter("txtToken")!=null?request.getParameter("txtToken"):""%>"></td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td colspan="2" align="center"> <input type="button" name="AceptarToken" value="Aceptar" onClick="aceptarToken()" class="btn btn-primary"> 
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="button" name="CancelarToken" value="Cancelar" onClick="ocultarToken();" class="btn btn-danger"> 
                                  </td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                              </table></td>
                          </tr>
                        </table>
                      </div></td>
                  </tr>
                </table>			
                <input type="hidden" name="txtImportePH"   
					  <%
			         if(request.getParameter("txtImportePH")!=null)
                         out.print(" value=\""+request.getParameter("txtImportePH")+"\"");
           			else
		  				out.print(" value=\""+adeudoPH+"\"");
						%>>
                <table width="90%" border="0" id="datos" height="61" align="center" bordercolorlight="#FFFFFF" bordercolordark="#FFFFFF">
                  <tr> 
                    <td colspan="2" align="center" class="alerta"><%=alerta%></td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center" ><%=BD.getPeriodoHonPend((String)session.getAttribute("NumFid"))%></td>
                  </tr>
                  <tr> 
                    <td colspan="2" >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto" ></td>
                    <td class="texto">
                    <input type="hidden" name="txtFecha" maxlength=10 size="8" 
                    value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" class="texto"> 
                      <input type="hidden" id="cboCalendarioI" name="cboCalendarioI"  style=" WIDTH: 60px" 
                      value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" onChange="pagoHonorarios.txtFecha.value=pagoHonorarios.cboCalendarioI.value;"><input type="hidden" id="lanzaCalendarioI" name="lanzaCalendarioI"  style=" WIDTH: 15px"   class="botonCbo" value="v"> 
                      <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioI",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioI"   // el id del botón que lanzará el calendario
																						});					
																   </SCRIPT> &nbsp; 
                    
                    </td>
                  </tr>                  
                  <tr> 
                    <td width="57%" align="right" class="texto">Cuenta <%=session.getAttribute("empresa_9")%> en 
                      la que se depositaron los recursos:</td>
                    <td width="43%" class="texto" > <select name="cboCuentaPH"  class="texto" onChange= "document.pagoHonorarios.submit();">
                        <option>Selecciona Cuenta 
                        <%
			           String temporal=request.getParameter("cboCuentaPH");
						
                        if(request.getParameter("cboCuentaPH")!=null && !temporal.equals("Selecciona Cuenta"))
        		                   { 
			   					out.print(BD.DataCombos(1,(String)session.getAttribute("NumFid"),request.getParameter("cboCuentaPH")));
								   }
						else	{
								out.print(BD.DataCombos(1,(String)session.getAttribute("NumFid"),""));
								}		   
						%>
                        <option value="fondo" <%=temporal!=null && temporal.trim().equals("fondo")?"selected":""%>>Descontar 
                        del fondo</option>
                      </select> </td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">Divisa:</td>
                    <td class="texto"> <select name="cboDivisa"  tabindex="5">
                        <option>Selecciona Divisa 
                        <%
						                temporal=request.getParameter("cboDivisa");   
                		       	if(request.getParameter("cboDivisa")!=null&&!temporal.equals("Selecciona Divisa"))
                              out.print(Moneda.DataCombos(4,"",request.getParameter("cboDivisa")));
                        		else
                      				out.print(Moneda.DataCombos(4,"",""));
  								      %>
                        </option>
                      </select> </td>
                  </tr>                                  
                  <tr> 
                    <td  align="right" class="texto">Importe:</td>
                    <td class="textoNegrita">$ <%=adeudoPH.trim()%></td>
                  </tr>
                  <% if(temporal!=null && temporal.trim().equals("fondo"))				  
				{
				%>
                  <tr> 
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" class="subtitulo">Descontar de Contrato:</td>
                  </tr>
                  <tr> 
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <%String sContratos=BD.DataCombos(3,(String)session.getAttribute("NumFid"),"cboContratoPH");
	   
		if(sContratos.equals(""))
			{
			strDisabled="disabled";
			%>
                  <tr> 
                    <td colspan="2" class="subtitulo" align="center">NO TIENES 
                      REGISTRADO NINGUN CONTRATO DE INVERSION</td>
                  </tr>
                  <%}
		else {%>
                  <tr> 
                    <td class="texto" align="right">No. Contrato de Inversión:</td>
                    <td class="texto"> <select name="cboContratoPH" class="texto">
                        <option value="-1">Selecciona Contrato 
                        <%
							out.print(sContratos);
							%>
                        </option>
                      </select> <input type="hidden" name="descontarFondo" value="si"> 
                    </td>
                  </tr>
                  <%}
}	
else
	{%>
                  <input type="hidden" name="cboContratoPH" value="">
                  <input type="hidden" name="descontarFondo" value="no">
                  <%}%>
                  <tr> 
                    <td colspan="2" align="center">&nbsp;</td>
                  </tr>
                  <tr>
                    <td colspan="2" align="center"> <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:validacion(<%=(String)session.getAttribute("token")%>)"  class="boton" <%=strDisabled%>> 
                      &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()"  class="boton" <%=strDisabled%>></td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center">&nbsp;</td>
                  </tr>
                </table>
                <table border=0 cellpadding=0 cellspacing=1 >
                  <tbody>
                    <tr> 
                      <td align="middle" class="ref" >|<a  href="FI_Legales.jsp" class="ref">ASPECTOS 
                        LEGALES</a>|</td>
                    </tr>
                  </tbody>
                </table>
              </form></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
