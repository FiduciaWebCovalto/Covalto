<FORM name="frmDatosMantenimientoProspectos" id="frmDatosMantenimientoProspectos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td height="100%">&nbsp;</td>
      <td rowspan="6" width="10%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td align="center" height="100%" class="titulo">Prospectos Tipo Persona</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table cellspacing="2" cellpadding="-3" border="0" class="texto">
          <tr>
            <td nowrap width="10%">&nbsp;</td>
            <td nowrap width="19%">N&uacute;mero de Prospecto</td>
            <td width="50%">
              <input type="text" name="prpNumProspecto" id="prpNumProspecto" tipo="Num" size="10" maxlength="10" required message="El Numero de Prospecto es un campo obligatorio"/>
            </td>
            <td nowrap width="20px">&nbsp;</td>
            <td nowrap width="13%"></td> 
            <td width="17%">
                <select size="1" name="prpTipoPersona" id="prpTipoPersona" ref="claves" fun="loadComboElement" keyvalue="cveNumSecClave" thevalue="cveDescClave"
                        param="clavesCombo140" next="prpCvePersona"></select>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td nowrap width="10%">&nbsp;</td>
            <td nowrap width="19%">Clave Persona</td>
            <td valign="middle" width="50%">
                <select size="1" name="prpCvePersona" id="prpCvePersona" ref="conTipoEmisor" fun="loadComboElement" keyvalue="eindDescripcion" thevalue="eindDescripcion"
                        param="indices580" next="prpCveEstatus"></select>
            </td>
            <td width="20px">&nbsp;</td>
            <td width="13%">N&uacute;mero de Persona</td>
            <td width="17%">
              <input type="text" name="prpNumProPersona" id="prpNumProPersona" tipo="Num" size="15" maxlength="15"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td nowrap width="10%">&nbsp;</td>
            <td nowrap width="19%">Nombre</td>
            <td width="50%">
                <input type="text" name="prpNomProPersona" id="prpNomProPersona" tipo="Num" size="100" maxlength="50" required message="El Nombre del tipo de Prospecto es un campo obligatorio"/>
            </td>
            <td width="20px">&nbsp;</td>
            <td width="13%" valign ="top">Estatus</td>
            <td width="17%">
                <select size="1" name="prpCveEstatus" id="prpCveEstatus" ref="claves" fun="loadComboElement" keyvalue="cveNumSecClave" thevalue="cveDescClave"
                        param="clavesCombo31" next="formsLoaded"></select>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
        <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalProspectos();" style="visibility:hidden"/>
      </td>
    </tr>
  </table>
</FORM>
