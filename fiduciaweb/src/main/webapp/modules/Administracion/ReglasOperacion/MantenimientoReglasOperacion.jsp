<FORM name="frmDatosMantenimientoContactosFideicomisos" id="frmDatosMantenimientoContactosFideicomisos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Cedula Administrativa del Fideicomiso</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table align="center" class="texto" width="90%">
            <tr valign="middle">
              <td width="15%">&nbsp;</td>
              <td width="15%" nowrap>N&uacute;m. Fideicomiso</td>
              <td colspan="3">
                <input type="text" name="froNumFideicom" id="froNumFideicom" tipo="Num" size="10" maxlength="10" onblur="mostrarDatosInformativos(2);" required message="El N�mero de Fideicomiso es un campo obligatorio"/>
              </td>
              <td width="15%" nowrap>Nombre Fideicomiso</td>
              <td colspan="3">
                 <input type="text" name="nomFideicomiso" id="nomFideicomiso" disabled/>
                <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="15%">&nbsp;
              </td>
              <td colspan="7">
                <hr/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td class="subtitulo" width="15%">&nbsp;</td>
              <td class="subtitulo" colspan="7">Reglas</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td width="15%">&nbsp;</td>
              <td colspan="7">&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td width="15%">&nbsp;</td>
              <!--<td width="15%" nowrap>No. Regla</td>-->
              <td colspan="6">
                <input type="text" name="froSecNumFideicom" id="froSecNumFideicom" tipo="Num" size="10" maxlength="10" required message="El No. Regla es un campo obligatorio" style="visibility:hidden"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td width="15%">&nbsp;</td>
              <td width="15%" nowrap>Tipo de Regla</td>
              <td colspan="5">
                <select size="1" name="froTipoRegla" id="froTipoRegla" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="froStatus" param="clavesCombo1008" required message="El Tipo de Regla es un campo obligatorio"/>
              </td>
            </tr>
            <tr>
              <td width="15%">&nbsp;</td>
              <td width="15%" nowrap>Descripcion</td>
              <td colspan="6">
                <textarea name="froDescripcion" id="froDescripcion" style="width:500px;height:50px" onkeydown="validaLongitud(this,250);"></textarea>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td width="15%">&nbsp;</td>
              <td width="15%" nowrap>Status</td>
              <td colspan="5">
                <select size="1" name="froStatus" id="froStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="loadCatalogo" param="clavesCombo31" required message="El Status es un campo obligatorio"/>
              </td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="BUTTON" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalContactosFideicomisos();" style="visibility:hidden"/>
        </td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
  </table>
</FORM>
