<FORM name="frmDatosMantenimientoAnteproyectoCaracteristicas" id="frmDatosMantenimientoAnteproyectoCaracteristicas" onsubmit=" ">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Contrato</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table border="0" width="100%" class="texto" style="text-align:left" border="0">
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">No. Prospecto</td>
              <td>
                <input type="text" name="antNumProspecto" id="antNumProspecto" tipo="Num" size="10" maxlength="10" required message="El Proyecto es un campo obligatorio" disabled="disabled"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>No. Fideicomiso</td>
              <td>
                <input type="text" name="antNumContrato" id="antNumContrato" tipo="Num" size="10" maxlength="10" disabled="disabled"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td><strong>Contrato Privado</strong></td>
              <td style="text-align: center;">
                <input type="radio" name="rdTipoContacto" id="antTipoPublic" class="radio" value2="CONTRATO PRIVADO" onclick="clickContratoEscritura('antTipoPublic', this, true)"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Fecha del Contrato</td>
              <td>
                <input type="text" name="antFechaContrato" id="antFechaContrato" tipo="Fecha" size="10" maxlength="10"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Comentarios</td>
              <td>
                <input type="text" name="antComentarios" id="antComentarios" size="50" maxlength="200"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td><strong>Escritura P&uacute;blica</strong></td>
              <td style="text-align: center;">
                <input type="radio" name="rdTipoContacto" id="antTipoPublic2" class="radio" value="ESCRITURA PUBLICA" onclick="clickContratoEscritura('antTipoPublic', this, false)"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>No. Escritura</td>
              <td>
                <input type="text" name="antNumEscritura" id="antNumEscritura" tipo="AlphaNumeric" size="10" maxlength="25"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Nombre del Notario</td>
              <td>
                <select size="1" name="antNumNotario" id="antNumNotario" ref="claveNotarios" keyValue="notNumNotario" theValue="notNomNotario" fun="loadComboElement" next="loadCatalogo" onchange="consultaDatosNotario();">
                </select>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Localidad</td>
              <td>
                <input type="text" class="inputLocked" name="txtLocalidad" id="txtLocalidad" size="50" maxlength="50" disabled="disabled"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>No. Notario</td>
              <td>
                <input type="text" class="inputLocked" name="txtNumNotario" id="txtNumNotario" tipo="Num" size="10" maxlength="10" disabled="disabled"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Fecha de Escritura</td>
              <td>
                <input type="text" name="antFechaEscritura" id="antFechaEscritura" tipo="Fecha" size="10" maxlength="10"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Estado</td>
              <td>
                <input type="text" class="inputLocked" name="txtEstado" id="txtEstado" size="10" maxlength="10"/>
              </td>
              <td>&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr align="center">
        <td height="100%">
          <input type="BUTTON" value="Aceptar " name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibilitys:hidden"/>
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalProspectosAnteproyecto();" style="visibilitys:hidden"/>
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
