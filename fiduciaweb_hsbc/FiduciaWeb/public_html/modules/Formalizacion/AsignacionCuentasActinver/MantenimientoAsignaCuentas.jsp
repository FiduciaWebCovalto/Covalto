<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Asignaci&oacuten de nuevas cuentas de Actinver</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto" border="0">
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">No. Prospecto</td>
            <td>
                <input type="text" name="prsNumprospect" id="prsNumprospect" tipo="Num" size="10" maxlength="10" disabled/>
            <td width="10%">&nbsp;</td>
          </tr>
             <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">N&uacute;mero de cuentas de Banco</td>
            <td>
                <input type="text" name="prcNumCuentas" id="prcNumCuentas" tipo="Num" size="10" maxlength="10" required message="El N&uacute;mero de Cuentas es un campo obligatorio"/>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
                <td width="12%">&nbsp;</td>
                <td nowrap width="15%">N&uacute;mero de cuentas Casa de Bolsa</td>
                <td>
                    <input type="text" name="prcNumCuentasBolsa" id="prcNumCuentasBolsa" tipo="Num" size="10" maxlength="10" required message="El N&uacute;mero de Cuentas de Casa de Bolsa es un campo obligatorio"/>
                    <input type="text" name="prcBanco" id="prcBanco" value="NULL" tipo="Num" size="10" maxlength="10" disabled style="visibility:hidden"/>
                    <input type="text" name="prcTipoCuentas" id="prcTipoCuentas" value="NULL" tipo="Num" size="10" maxlength="10" disabled style="visibility:hidden"/>
                <td width="10%">&nbsp;</td>
            </tr>
          </div>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="22">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="ejecutaOperacionCuenta();" style="visibility:hidden"/>
        <input type="BUTTON" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalDirecciones2();" style="visibility:hidden"/>
      </td>
    </tr>
  </table>
</FORM>
