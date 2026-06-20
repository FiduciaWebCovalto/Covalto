<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="sesionInstrucc.jsp" %>
<HTML>
<HEAD><TITLE>Traspaso - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'></script>
<script language="JavaScript" SRC='scripts/instruccion10.js'>
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
      <TD valign="top" align="center">
	    <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Traspaso 
              entre Cuentas Bancarias</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> <form name="Traspaso"  method="post" action="confirmarInst_10.jsp">
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
                <table width="90%" id="datos">
                  <tr> 
                    <td colspan="2" class="subtitulo">Traspaso:</td>
                  </tr>
                  <tr> 
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto" >Fecha:</td>
                    <td class="texto">
                    <input type="hidden" name="txtFecha" maxlength=10 size="8" 
                    value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" class="texto"> 
                      <input type="button" id="cboCalendarioI" name="cboCalendarioI"  style=" WIDTH: 60px" 
                      value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" onChange="Traspaso.txtFecha.value=Traspaso.cboCalendarioI.value;"><input type="button" id="lanzaCalendarioI" name="lanzaCalendarioI"  style=" WIDTH: 15px"   class="botonCbo" value="v"> 
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
                    <td width="187" class="texto" align="right"> Cuenta cheques 
                      Origen:</td>
                    <td class="texto"> <select name="cboContratoOrigenTC" onchange="">
                        <option value="-1">Selecciona Cuenta de Cheque
                        <%
                              out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));
                       %>
                      </select>
                      <input type="hidden" name="ocultoComboSeleccionado" value/>
                      </td>
                  </tr>
                  <tr> 
                   <tr> 
                    <td width="187" class="texto" align="right"><div id="divSubcuenta1" style="">  Subcuenta 
                      Origen:</div></td>
                    <td class="texto"><div id="divSubcuenta2"> <select name="cboSubCuentaOrigen">
                        <option value="-1">Selecciona Subcuenta
                        <%
                              out.print(BD.DataCombos(49,(String)session.getAttribute("NumFid"),""));
                         %>
                      </select></div></td>
                  </tr>
                  <tr> 
                    <td width="187" class="texto" align="right"> Cuenta cheques
                      Destino:</td>
                    <td class="texto"> <select name="cboContratoDestinoTC" onchange="">
                        <option value="-1">Selecciona Cuenta de Cheque
                        <%
                              out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));
                        %>
                      </select> </td>
                  </tr>
                  <tr> 
                    <td width="187" class="texto" align="right"><div id="divSubcuenta3" style="">  Subcuenta 
                      Destino:</div></td>
                    <td class="texto"> <div id="divSubcuenta4"> <select name="cboSubCuentaDestino">
                        <option value="-1">Selecciona Subcuenta
                        <%
                              out.print(BD.DataCombos(49,(String)session.getAttribute("NumFid"),""));
                        %>
                      </select> </div></td>
                  </tr>
                  <tr> 
                  <tr> 
                    <td width="187" class="texto" align="right">Importe:</td>
                    <td class="texto"> <input type="text" name="txtImporteTC" size="13" maxlength="20"   onKeyUp="validaNum(this.form.txtImporteTC);"   onBlur="formatImporte(this.form.txtImporteTC)">  
                    </td>
                  </tr>
                  <tr> 
                    <td colspan="2" >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" >&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="2" align="center"> <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:validacion(<%=(String)session.getAttribute("token")%>)"  class="boton">
                      &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()"  class="boton"> 
                    </td>
                  </tr>
                </table>
              </form>
              <table border=0 cellpadding=0 cellspacing=1 class=texto_menu_inf width=530 align="center">
                <tr> 
                  <td height="12" colspan="9" class="texto_menu_inf" align="center"></td>
                </tr>
                <tr> 
                  <td width="482" height="12" colspan="9" class="texto_menu_inf" align="center"></td>
                </tr>
                <tr align=middle valign=center> 
                  <td class=texto_menu_inf colspan="9" height="30" align="center"><a  href="#top"><img  border=0 height=11 src="imagenes/arriba.gif" width=59></a></td>
                </tr>
                <tr align=middle> 
                  <td class=texto_menu_inf colspan=9 height=7 align="center"><img height=1 src="imagenes/cnaranja01.gif" width=400></td>
                </tr>
                <tr> 
                  <td class=texto_menu_inf colspan=9 height=7>&nbsp;</td>
                </tr>
              </table>
              <table border=0 cellpadding=0 cellspacing=1 >
                <tbody>
                  <tr> 
                    <td align="middle" class="ref" >|<a  href="FI_Legales.jsp" class="ref">ASPECTOS  LEGALES</a>|</td>
                    
                  </tr>
                </tbody>
              </table></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
