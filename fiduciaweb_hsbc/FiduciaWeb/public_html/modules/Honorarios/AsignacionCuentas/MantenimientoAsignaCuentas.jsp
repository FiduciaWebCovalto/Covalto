<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Asignaci&oacuten de nuevas cuentas</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto" border="0">
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">No. Fideicomiso</td>
            <td>
                <input type="text" name="pacNumCto" id="pacNumCto" tipo="Num" size="10" maxlength="10" next="pacCtoInver" disabled/>
            <td width="10%">&nbsp;</td>
          </tr>
            <tr>
              <td width="12%">&nbsp;</td>
              <td nowrap width="15%">Contrato de Inversi&oacute;n</td>
              <td colspan="2">
                <select size="1" name="pacCtoInver" id="pacCtoInver" fun="loadComboElement" ref="obtCtoInte" param="pacNumCtoin" keyValue="cprContratoInter" theValue="cprContratoInter" next="formsLoaded" required message="El Contrato de Inversion es un campo obligatorio"/> <!--param="pacNumCtoin"-->
              </td>
              <td align="left" width="10%">&nbsp;</td>
            </tr>
          </div>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" onclick="ejecutaOperacionCuenta();" style="visibility:hidden"/>
        <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalDirecciones2();" style="visibility:hidden"/>
      </td>
    </tr>
  </table>
</FORM>
