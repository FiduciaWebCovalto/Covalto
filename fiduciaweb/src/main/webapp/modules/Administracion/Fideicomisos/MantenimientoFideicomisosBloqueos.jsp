<FORM name="frmMantenimiento" id="frmMantenimiento" onsubmit=" ">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="0" border="0" width="100%" align="left" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Fideicomiso</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="100%" class="texto" border="0" style="text-align: left;">
            <tr>
              <td nowrap>&nbsp;</td>
              <td nowrap>Num. Fideicomiso</td>
              <td>
                <input type="text" name="ctoNumContrato" id="ctoNumContrato" tipo="Num" size="10" maxlength="10" disabled="disabled"/>
              </td>
              <td nowrap>Apodo</td>
              <td colspan="2">
                <input type="text" name="ctoNomContrato" id="ctoNomContrato" size="50" maxlength="100" disabled="disabled"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
                <td colspan="7" nowrap><hr/></td>
            </tr>
            <tr valign="middle">
                <td class="subtitulo" nowrap colspan="7" align="left">
                    <table id="tabs" cellpadding="0" cellspacing="0" border="0">
                        <tr>
                            <td class="tab_blanco_claro">&nbsp;</td>
                            <td class="tab_relleno_claro" onclick="cambiaTab(this, 'cargarPantallaMantenimientoTab(1)');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Datos Generales&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td class="tab_claro_claro_izq">&nbsp;</td>
                            <td class="tab_relleno_claro" onclick="cambiaTab(this, 'cargarPantallaMantenimientoTab(2)');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Estatus KYC&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td class="tab_claro_azul">&nbsp;</td>
                            <td class="tab_relleno_azul" onclick="cambiaTab(this, 'cargarPantallaMantenimientoTab(3)');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tipos de Bloqueo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td class="tab_azul_blanco">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td colspan="7"><hr/></td>
            </tr>
            <tr>
                <td width="20%">Pendientes de Predial</td>
                <td width="10%">
                    <input type="checkbox" name="ctoPendientesPredialChk" id="ctoPendientesPredialChk" class="check" tv="1" fv="0"/>
                </td>
                <td width="20%">Embargo</td>
                <td width="10%">
                    <input type="checkbox" name="ctoEmbargoChk" id="ctoEmbargoChk" class="check" tv="1" fv="0"/>
                </td>
                <td width="20%">Pendientes Rendicion de Cuentas</td>
                <td width="10%">
                    <input type="checkbox" name="ctoPendientesRendCuentaChk" id="ctoPendientesRendCuentaChk" class="check" tv="1" fv="0"/>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td>Pendientes Contables</td>
                <td>
                    <input type="checkbox" name="ctoPendientesContablesChk" id="ctoPendientesContablesChk" class="check" tv="1" fv="0"/>
                </td>
                <td>CSEM Cat A</td>
                <td>
                    <input type="checkbox" name="ctoCsemChk" id="ctoCsemChk" class="check" tv="1" fv="0"/>
                </td>
                <td>Honorarios Pendientes</td>
                <td>
                    <input type="checkbox" name="ctoHonorariosPendChk" id="ctoHonorariosPendChk" class="check" tv="1" fv="0"/>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td>Pendientes Fiscales</td>
                <td>
                    <input type="checkbox" name="ctoPenFiscalesChk" id="ctoPenFiscalesChk" class="check" tv="1" fv="0"/>
                </td>
                <td>Documentaci&oacute;n Faltante</td>
                <td>
                    <input type="checkbox" name="ctoDocFaltanteChk" id="ctoDocFaltanteChk" class="check" tv="1" fv="0"/>
                </td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr align="center">
        <td>
            <table>
                <tr>
                    <td style="text-align: right;"><input type="button" value="  Aceptar  " name="cmdAceptar" id="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="display: none;"/></td>
                    <td style="text-align: left;"><input type="button" value="  Cancelar " name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipal();" style="display: none;"/></td>
                </tr>
            </table>
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
