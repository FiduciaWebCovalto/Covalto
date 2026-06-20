<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento
                                                      Parametrizaci�n de
                                                      Interfase A2K vs FiduciaWeb</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%"  width="100%">
        <table width="90%" align="center" class="texto" border="0">
          <tr valign="middle">
            <td valign="middle" nowrap colspan="4">&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Clave A2K</td>
            <td valign="middle" width="8%" nowrap>
              <input type="text" name="fvfwIdOperSisVal" id="fvfwIdOperSisVal" size="10" maxlength="10" tipo="Num" required message="La Clave de A2K es obligatorio"/>
            </td>
            <td valign="middle" width="8%" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="middle" height="6" width="5%" nowrap>Clave FiduciaWeb</td>
            <td valign="middle" width="8%" nowrap>
                <input type="text" name="fvfwIdOperSisFw" id="fvfwIdOperSisFw" size="10" maxlength="10" tipo="Num" required message="La Clave de FiduciaWeb es obligatorio"/>
            </td>
            <td valign="middle" width="8%" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Tipo Operacion</td>
            <td valign="middle" width="8%" nowrap>
            </td>
            <td valign="middle" width="8%" nowrap>
              <select size="1" name="fvfwTipoOper" id="fvfwTipoOper" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave"  param="clavesCombo1003" next="loadCatalogo" required message="El tipo de Operacion es un campo obligatorio"/>
              <input type="text" name="fvfwIdOperSisValNombre" id="fvfwIdOperSisValNombre" size="50" maxlength="50"/>
            </td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Numero Operacion</td>
            <td valign="middle" width="8%" nowrap>
              <input type="text" name="fvfwNumOperacion" id="fvfwNumOperacion" size="10" maxlength="25" tipo="Num"/>
            </td>
            <td valign="middle" width="8%" nowrap>&nbsp;</td>
          </tr>          
        </table>
      </td>
    </tr>
    <tr>
      <td colspan="5" height="100%">&nbsp;&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="ejecutaOperacion();" style="visibility:hidden"/>
        <input type="BUTTON" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="regresar()" style="visibility:hidden"/>
      </td>
    </tr>
  </table>
</FORM>
