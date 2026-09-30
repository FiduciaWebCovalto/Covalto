<!doctype html>
<!--
/*
  @Autor:cubo
  @Creado: Septiembre 2020
*/
-->

<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="sesionInstrucc.jsp" %>
<HTML>
<HEAD><TITLE>Inversi&oacute;n - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></script>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></script>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></script>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'></script>
</HEAD>
<body class="bg-light">
  <jsp:include page="header.jsp"/>
  <jsp:include page="NuevoMenu.jsp"/>

  <%
    String temporal = request.getParameter("cboFormaInversion");
    int idFormaInversion = temporal != null && !"-1".equals(temporal) ? Integer.parseInt(temporal.substring(0, 1)) : -1;
  %>
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%" >
  <TBODY>
    <TR > 
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Inversi&oacute;n</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> 
                <form name="Inversion" id="Inversion"  
                method="post" action="confirmarInst_14.jsp" class="needs-validation" novalidate>
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
                                    <input class="form-control" type="password" name="txtToken" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  value="<%=request.getParameter("txtToken")!=null?request.getParameter("txtToken"):""%>"></td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td colspan="2" align="center"> <input class="form-control" type="button" name="AceptarToken" value="Aceptar" onClick="aceptarToken()" class="btn btn-primary"> 
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="form-control" type="button" name="CancelarToken" value="Cancelar" onClick="ocultarToken();" class="btn btn-danger"> 
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
                    <td colspan="2" class="subtitulo">Inversi&oacute;n:</td>
                  </tr>
                  <tr> 
                    <td colspan="2">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto" >Fecha:</td>
                    <td class="texto">
                    <input class="form-control" type="hidden" name="txtFecha" maxlength=10 size="8" value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" class="texto"> 
                    <input class="form-control" type="button" id="cboCalendarioI" name="cboCalendarioI"  style=" WIDTH: 100px" value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" onChange="Traspaso.txtFecha.value=Traspaso.cboCalendarioI.value;"><input class="form-control" type="button" id="lanzaCalendarioI" name="lanzaCalendarioI"  style=" WIDTH: 15px"   class="botonCbo" value="v"> 
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
                    <td width="187" class="texto" align="right">Forma de Inversi&oacute;n:</td>
                    <td class="texto"> 
                    <div class="mb-3">
                        <select class="form-select" name="cboFormaInversion" id="cboFormaInversion"
                        onchange="muestraCamposFormaInversion(this)" required>
                            <option value="">Selecciona una Forma de Inversi&oacute;n</option>
                            <%
                                temporal = request.getParameter("cboFormaInversion");
                                if(temporal != null && !temporal.equals("Selecciona una Forma de Inversi&oacute;n")) {
                                    out.print(BD.DataCombos(1016,"", request.getParameter("cboFormaInversion")));
                                } else {
                                    out.print(BD.DataCombos(1016, "",""));
                                }
                            %>
                        </select>
                        <div class="invalid-feedback">
                        Por favor, seleccione la forma de inversion.
                        </div>
                    </div>
                    </td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">Concepto:</td>
                    <td class="texto"> 
                        <select class="form-select" name="cboConcepto" required>
                            <option value="">Selecciona un Concepto</option> 
                            <%
                                temporal = request.getParameter("cboConcepto");
                                if(temporal != null && !temporal.equals("Selecciona un Concepto")) {
                                    out.print(BD.DataCombos(7, (String)session.getAttribute("NumFid"), request.getParameter("cboConcepto")));
                                } else {
                                    out.print(BD.DataCombos(7, (String)session.getAttribute("NumFid"), ""));
                                }
                            %>
                          </select>
                        <div class="invalid-feedback">
                        Por favor, seleccione el Concepto.
                        </div>
                    </td>
                  </tr>
                  
                <% System.out.println("Forma de INversion "+idFormaInversion);
                if((idFormaInversion == 1 || idFormaInversion == 2 || idFormaInversion == 3)&& idFormaInversion!=-1) { %>  
                    <tr>
                    <td class="texto" align="right">Observaciones:</td>
                    <td class="texto"> 
                        <input class="form-control" maxlength="255" name="txtObservaciones" size="70" style=" WIDTH:300px" value="<%=request.getParameter("txtObservaciones")!=null?request.getParameter("txtObservaciones"):""%>">
                    </td>
                  </tr>
                  <%} %>
                  <tr> 
                  <div class="mb-3">
                    <td class="texto" align="right">Monto en N&uacute;mero / <br>N&uacute;mero de Titulos:</td>
                    <td height="3" width="345" class="texto"> 
                        <input class="form-control" type="text" class="form-control"  name="txtMonto" size="13" style=" WIDTH: 130px" maxlength="20" required value="<%=request.getParameter("txtMonto")!=null?request.getParameter("txtMonto"):""%>"
                                onKeyUp="validaNum(this.form.txtMonto);" onBlur="formatImporte(this.form.txtMonto)"> 
                    </td>
                    </div>
                    <div class="invalid-feedback">
                        Por favor, introduzca el monto.
                        </div>
                  </tr>
                  <% if(idFormaInversion == 1) { %>
                      <tr>
                        <td class="texto" align="right">Tipo de instrumento original:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtTipoInstrumentoOriginal" id="txtTipoInstrumentoOriginal" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>
                      <tr>
                        <td class="texto" align="right">Tipo de instrumento al que se requiere cambiar:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtTipoInstrumentoNuevo" id="txtTipoInstrumentoNuevo" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>
                      <tr> 
                        <td width="187" class="texto" align="right">Cuenta de Inversi&oacute;n Origen</td>
                        <td class="texto">
                            <select class="form-select" name="cboContratoOrigen">
                                <option value="-1">Selecciona Cuenta</option>
                                <%out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));%>
                            </select>
                        </td>
                      </tr>
                      <tr> 
                        <td width="187" class="texto" align="right">Cuenta Inversi&oacute;n Destino:</td>
                        <td class="texto"> 
                            <select class="form-select"  name="cboContratoDestino">
                                <option value="-1">Selecciona Cuenta</option>
                                <%out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));%>
                            </select> 
                        </td>
                      </tr>
                      <tr>
                        <td class="texto" align="right">Caj&oacute;n de Indeval:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtCajonIndeval" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>
                      <tr>
                        <td class="texto" align="right">Plazo Nuevo Requerido (En D&iacute;as):</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtPlazoNuevoRequerido" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>
                      <tr> 
                        <td width="187" class="texto" align="right">Instituci&oacute;n:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtInstitucion" size="70" style="WIDTH:300px"> 
                        </td>
                      </tr>
                      <tr>
                        <td class="texto" align="right">Contrato Burs&aacute;til:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtContratoBursatil" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>
                  <%} else if(idFormaInversion == 2) {%>
                  <tr> 
                        <td width="187" class="texto" align="right">Cuenta de Inversi&oacute;n Origen</td>
                        <td class="texto">
                            <select class="form-select" name="cboCuentaInversionOrigen">
                                <option value="-1">Selecciona Cuenta</option>
                                <%out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));%>
                            </select>
                        </td>
                      </tr>
                      <tr> 
                        <td width="187" class="texto" align="right">Cuenta Inversi&oacute;n Destino:</td>
                        <td class="texto"> 
                            <select class="form-select" name="cboCuentaInversionDestino">
                                <option value="-1">Selecciona Cuenta</option>
                                <%out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));%>
                            </select> 
                        </td>
                      </tr>
                      <tr>
                        <td class="texto" align="right">Caj&oacute;n de Indeval:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtCajonIndeval" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>
                      <tr> 
                        <td width="187" class="texto" align="right">Instituci&oacute;n:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtInstitucion" size="70" style="WIDTH:300px"> 
                        </td>
                      </tr>
                      <tr>
                        <td class="texto" align="right">Contrato Burs&aacute;til:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtContratoBursatil" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>
                  <%} 
                  //FORMA VENTA 4
                  else if(idFormaInversion == 4) {%>
                  <tr> 
                        <td width="187" class="texto" align="right">Cuenta Cargo</td>
                        <td class="texto">
                            <select class="form-select" name="cboCuentaCargo">
                                <option value="-1">Selecciona Cuenta</option>
                                <%out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));%>
                            </select>
                        </td>
                      </tr>
                       <tr> 
                        <td width="187" class="texto" align="right">Contrato de Inversi&oacute;n:</td>
                        <td class="texto"> 
                            <select class="form-select" name="cboContratoInversion">
                                <option value="-1">Selecciona Contrato</option>
                                <%out.print(BD.DataCombos(3,(String)session.getAttribute("NumFid"),""));%>
                            </select> 
                        </td>
                      </tr>
                     <tr>
                        <td class="texto" align="right">Tipo de Instrumento:</td>
                        <td class="texto">
                            <select class="form-select" name="cboTipoInstrumento">
                                <option>Selecciona Instrumento</option>
                                <%out.print(BD.DataCombos(1017, "", ""));%>
                            </select> 
                        </td>
                      </tr> 
                    <tr> 
                        <td class="texto" align="right">Moneda:</td>
                        <td class="texto"> 
                            <select class="form-select" name="cboDivisa">
                                <option>Selecciona Moneda</option>
                                <%out.print(BD.DataCombos(4, "", ""));%>
                            </select> 
                        </td>
                      </tr>  
                      <tr>
                       <tr>
                        <td class="texto" align="right">Nombre del Beneficiario:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtNombreBeneficiario" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>

                      <tr>
                        <td class="texto" align="right">Clave de Pizarra:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtClavePizarra" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>
                  <%}
                  
                  
                  
                  
                  //CIERA FORMA 4
                  else if(idFormaInversion == 3) {%>
                  <tr> 
                        <td width="187" class="texto" align="right">Cuenta Cargo</td>
                        <td class="texto">
                            <select class="form-select" name="cboCuentaCargo">
                                <option value="-1">Selecciona Cuenta</option>
                                <%out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));%>
                            </select>
                        </td>
                      </tr>
                      <tr> 
                        <td width="187" class="texto" align="right">Contrato de Inversi&oacute;n:</td>
                        <td class="texto"> 
                            <select class="form-select" name="cboContratoInversion">
                                <option value="-1">Selecciona Contrato</option>
                                <%out.print(BD.DataCombos(3,(String)session.getAttribute("NumFid"),""));%>
                            </select> 
                        </td>
                      </tr>
                      <tr> 
                        <td class="texto" align="right">Divisa:</td>
                        <td class="texto"> 
                            <select class="form-select" name="cboDivisa">
                                <option>Selecciona Divisa</option>
                                <%out.print(BD.DataCombos(4, "", ""));%>
                            </select> 
                        </td>
                      </tr>  
                      <tr>
                        <td class="texto" align="right">Nombre del Beneficiario:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtNombreBeneficiario" size="70" style=" WIDTH:300px">
                        </td>
                      </tr>
                      <tr>
                        <td class="texto" align="right">Tipo de Instrumento:</td>
                        <td class="texto">
                            <select class="form-select" name="cboTipoInstrumento">
                                <option>Selecciona Instrumento</option>
                                <%out.print(BD.DataCombos(1017, "", ""));%>
                            </select> 
                        </td>
                      </tr> 
                      <tr>
                        <td class="texto" align="right">Clave de Pizarra:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtClavePizarra" size="70" style=" WIDTH:300px">
                        </td>
                      </tr> 
                      <tr>
                        <td class="texto" align="right">Plazo:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtPlazo" size="70" style=" WIDTH:300px">
                        </td>
                      </tr> 
                      <tr>
                        <td class="texto" align="right">Liquidez:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtLiquidez" size="70" style=" WIDTH:300px">
                        </td>
                      </tr> 
                      <tr>
                        <td class="texto" align="right">Precio Techo:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255" name="txtPrecioTecho" size="13" style=" WIDTH:130px" onKeyUp="validaNum(this.form.txtPrecioTecho);" onBlur="formatImporte(this.form.txtPrecioTecho)">
                        </td>   
                      </tr> 
                      <tr>
                        <td class="texto" align="right">Precio Piso:</td>
                        <td class="texto"> 
                            <input class="form-control" maxlength="255"  name="txtPrecioPiso" size="13" style=" WIDTH:130px" onKeyUp="validaNum(this.form.txtPrecioPiso);" onBlur="formatImporte(this.form.txtPrecioPiso)">
                        </td>
                      </tr> 
                      <tr>
                        <td class="texto" align="right">Precio de Mercado:</td>
                        <td class="texto">
                            <select class="form-select" name="cboPrecioMercado">
                                <option>Selecciona Precio de Mercado</option>
                                <%out.print(BD.DataCombos(1018, "", ""));%>
                            </select> 
                        </td>
                      </tr>
                  <%}%>
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
                 
                  <script language="JavaScript" SRC='scripts/instruccion14.js'></script>
                
                    <td colspan="2" align="center"> 
                    <button type="submit" class="btn btn-primary">Aceptar</button>
                    <!--input type="button" name="Aceptar" value="Aceptar" onClick="javascript:validacion(<%=(String)session.getAttribute("token")%>)"  class="btn btn-primary" -->
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
