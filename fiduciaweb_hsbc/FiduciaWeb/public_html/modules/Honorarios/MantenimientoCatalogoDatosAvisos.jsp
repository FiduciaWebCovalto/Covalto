<FORM name="frmDatosAvisosHonorariosMantenimiento" id="frmDatosAvisosHonorariosMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Mantenimiento a Cat&aacute;logo para los Avisos de Cobro</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="30%">&nbsp;</td>
              <td width="30%">Fideicomiso</td>
              <td width="25%">
                <input type="text" name="davNumContrato" id="davNumContrato" tipo="Num" size="10" maxlength="10" onblur="verificarAltaPk();" required message="El N�mero de Fideicomiso es un dato obligatorio"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">Dirigido a</td>
              <td>
                <input type="text" name="davDirigidoA" id="davDirigidoA" tipo="AlphaNumeric" size="50" maxlength="255" required message="El Dirigido a es un dato obligatorio"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">Cargo</td>
              <td>
                <input type="text" name="davCargo" id="davCargo" tipo="AlphaNumeric" size="50" maxlength="100"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">Direcci&oacute;n</td>
              <td>
                <input type="text" name="davCalleNum" id="davCalleNum" tipo="AlphaNumeric" size="50" maxlength="255" required message="La Calle es un dato obligatorio"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">Colonia</td>
              <td>
                <input type="text" name="davColonia" id="davColonia" tipo="AlphaNumeric" size="45" maxlength="100"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">Ciudad/Estado</td>
              <td>
                <input type="text" name="davCiudadEdo" id="davCiudadEdo" tipo="AlphaNumeric" size="45" maxlength="50" required message="la ciudad es un dato obligatorio"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">C&oacute;digo Postal</td>
              <td>
                <input type="text" name="davCodigoPostal" id="davCodigoPostal" tipo="Num" size="5" maxlength="10" required message="El CP es un dato obligatorio"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">Referencia CIE</td>
              <td>
                <input type="text" name="davReferenciaCie" id="davReferenciaCie" tipo="AlphaNumeric" size="10" maxlength="30" required message="La Referencia CIE es un dato obligatorio"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="BUTTON" value="Aceptar" name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/> &nbsp;
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalDatosAvisosHonorarios();" style="visibility:hidden"/>
        </td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
  </table>
</FORM>
