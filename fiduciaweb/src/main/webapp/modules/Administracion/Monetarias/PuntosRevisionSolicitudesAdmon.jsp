<FORM name="frmPtosSol" id="frmPtosSol" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Charola de Instruccion Monetaria</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
        <tr>
            <td height="100%">
                <table width="100%" class="texto" border="0" style="text-align:left">
                    <tr>
                        <td>Tipo de Operac&oacute;n</td>
                        <td><input type="text" name="insTxtComentario" id="insTxtComentario" size="20" disabled="disabled"/></td>
                        <td>Mensaje de Interfaz</td>
                        <td><input type="text" name="mensajeInterfaz" id="mensajeInterfaz" size="20" disabled="disabled"/></td>
                        <!--td style="text-align:center"><input type="BUTTON" name="cmdReporte" value="Reporte" class="btn btn-primary" onclick="generaReporte();"/></td-->
                    </tr>
                    <tr>
                        <td>Folio</td>
                        <td><input type="text" name="insNumFolioInst" id="insNumFolioInst" size="20" disabled="disabled"/></td>
                        <td>Fecha</td>
                        <td><input type="text" name="fbisFechaIni" id="fbisFechaIni" size="20" disabled="disabled"/></td>
                        <!--td style="text-align:center"><input type="BUTTON" name="cmdReporte" value="Reporte" class="btn btn-primary" onclick="generaReporte();"/></td-->
                    </tr>
                    <tr>
                        <td>Fideicomiso</td>
                        <td><input type="text" name="insNumContrato" id="insNumContrato" size="20" disabled="disabled"/></td>
                        <td>Tipo de Entrada</td>
                        <td><input type="text" name="tipoEntrada" id="tipoEntrada" size="50" disabled="disabled"/></td>
                    </tr>
                    <tr>
                        <td>Cuenta Origen</td>
                        <td><input type="text" name="cuentaOrigen" id="cuentaOrigen" size="20" disabled="disabled"/></td>
                        <td>Tipo de Operacion</td>
                        <td>&nbsp;<!--input type="text" name="insTxtComentario" id="insTxtComentario" size="50" disabled="disabled"/--></td>
                    </tr>
                    <tr>
                        <td>Nombre de la Cuenta Origen</td>
                        <td><input type="text" name="nombreCuentaOrigen" id="nombreCuentaOrigen" size="20" disabled="disabled"/></td>
                        <td>Concepto de Pago</td>
                        <td><input type="text" name="concepto" id="concepto" size="50" disabled="disabled"/></td>
                    </tr>
                    <tr>
                        <td>Cuenta Clabe</td>
                        <td><input type="text" name="cuentaClabe" id="cuentaClabe" size="20" disabled="disabled"/></td>
                        <td>Moneda</td>
                        <td><input type="text" name="moneda" id="moneda" size="50" disabled="disabled"/></td>
                    </tr>
                    <tr>
                        <td>Nombre del Beneficiario</td>
                        <td><input type="text" name="beneficiario" id="beneficiario" size="20" disabled="disabled"/></td>
                        <td>Observaciones</td>
                        <td><textarea name="observaciones" id="observaciones" rows="3" cols="50" disabled="disabled"></textarea></td>
                    </tr>
                    <tr>
                        <td>Monto</td>
                        <td><input type="text" name="monto" id="monto" size="20" disabled="disabled"/></td>
                        <td width="20%">&nbsp;</td>
                        <td width="30%">&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Nombre del Banco Beneficiario</td>
                        <td><input type="text" name="nombreBancoBeneficiario" id="nombreBancoBeneficiario" size="20" disabled="disabled"/></td>
                        <td width="20%">&nbsp;</td>
                        <td width="30%">&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Referencia</td>
                        <td><input type="text" name="referencia" id="referencia" size="20" disabled="disabled"/></td>
                        <td width="20%">&nbsp;</td>
                        <td width="30%">&nbsp;</td>
                    </tr>
                </table>
          </td>
        </tr>
        <tr>
            <td width="90%" colspan="5" align="center" valign="middle">
                &nbsp;<input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
            </td>
        </tr>
        <tr>
            <td height="100%">
                <table width="100%" class="texto" border="0" style="text-align:left">
                    <tr>
                        <td width="10%">
                            <input type="BUTTON" name="cmdEjecutarInterfaz" value="Ejecutar Interfaz" class="btn btn-primary" onclick="ejecutaAccion('interfaz');">
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>
                            <input type="BUTTON" name="cmdCarta" value="Carta de Instruccion" class="btn btn-primary" onclick="generaReporteAuxiliarCarta();">
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>
                            <input type="BUTTON" name="cmdExcelPagosMasivos" value="Excel Pagos Masivos" class="btn btn-primary" onclick="ejecutaAccion('excel');">
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>
                            <input type="BUTTON" name="cmdEnviarCorreo" value="Enviar Correo" class="btn btn-primary" onclick="ejecutaAccion('correo');">
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>
                            <input type="BUTTON" name="cmdOperado" value="Operado" class="btn btn-primary" onclick="ejecutaAccion('operado');">
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>
                            <input type="BUTTON" name="cmdRechazado" value="Rechazado" class="btn btn-primary" onclick="ejecutaAccion('rechazado');">
                        </td>
                        <td style="text-align: left;">
                            <select size="1" name="cboCausaRechazo" id="cboCausaRechazo" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="hideWaitLayer" param="clavesComboMotivoRechazo" message="Este campo es obligatorio" required="required">
                            </select>
                        </td>
                    </tr>
                </table>
          </td>
        </tr>
        <tr align="center"><td colspan="5"><a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a></td></tr>
        <tr align="center">
            <td colspan="5">
               <input type="BUTTON" name="cmdRegresar" value="Regresar" class="btn btn-danger" onclick="cargaPantallaInstrucciones();">
            </td>
        </tr>
      </table>
</FORM>