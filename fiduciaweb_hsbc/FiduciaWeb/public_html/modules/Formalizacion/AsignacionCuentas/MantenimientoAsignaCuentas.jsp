<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Asignaci&oacuten de Nuevas Cuentas</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" align="center" class="texto" border="0" style="text-align: left;">
          <tr>
            <td width="25%">&nbsp;</td>
            <td nowrap width="15%">No. Prospecto</td>
            <td>
                <input type="text" name="pccNumProspecto" id="pccNumProspecto" tipo="Num" size="10" maxlength="10" disabled/>
            </td>
            <td nowrap width="60%">
              <input type="text" name="prsNomProspecto" id="prsNomProspecto" size="50" maxlength="50" disabled/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
             <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">Cantidad de cuentas</td>
            <td colspan="2">
                <input type="text" name="pccNumCuenta" id="pccNumCuenta" tipo="Num" size="10" maxlength="10" required message="El N&uacute;mero de Cuentas es un campo obligatorio"/>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
              <td width="12%">&nbsp;</td>
              <td nowrap width="15%">Moneda</td>
              <td colspan="2">
                <select size="1" name="pccMoneda" id="pccMoneda" ref="conNumMonNomMon2" fun="loadComboElement" keyValue="monNumPais" theValue="monNomMoneda" next="loadCatalogo" required message="La Moneda es un campo obligatorio"/>
              </td>
              <td align="left" width="10%">&nbsp;</td>
            </tr>
          </div>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="22">
            <input type="hidden" name="pccBanco" id="pccBanco" size="10" value="113"/>
            <input type="hidden" name="pccTipoCuenta" id="pccTipoCuenta" size="10" value="2"/>
        &nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " id="cmdAceptar"  class="btn btn-primary" onclick="asignarCuentasProspecto();" />
        <input type="BUTTON" value="Cancelar" id="cmdCancelar"  class="btn btn-danger" onclick="cargaPrincipalDirecciones2();" />
      </td>
    </tr>
  </table>
</FORM>