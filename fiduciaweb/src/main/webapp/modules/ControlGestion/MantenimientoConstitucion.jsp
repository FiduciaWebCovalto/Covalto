<FORM name="frmMantenimientoConstitucion" id="frmMantenimientoConstitucion" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
<TD colspan="2" valign="middle" align="center" class="titulo">
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Ficha de Constituci&oacute;n</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="2%">&nbsp;</td>
              <td width="14%">No. Prospecto</td>
              <td width="25%" colspan="4">
                <input type="text" name="antNumProspecto" id="antNumProspecto" tipo="Num" size="10" required message="El Numero de Prospecto es un campo obligatorio"/>
              </td>
              <td width="1%">&nbsp;</td>
            </tr>
            <tr>
              <td width="2%">&nbsp;</td>
              <td width="14%">Nombre o raz&oacute;n social</td>
              <td colspan="4">
                <input type="text" name="antNomNegocio" id="antNomNegocio" tipo="AlphaNumeric" size="50"/>
              </td>
              <td width="1%">&nbsp;</td>
            </tr>
            <tr>
              <td width="2%">&nbsp;</td>
              <td width="14%">Tipo negocio</td>
              <td colspan="4">
                <input type="text" name="antCveTipoNeg" id="antCveTipoNeg" tipo="AlphaNumeric" size="25"/>
              </td>
              <td width="1%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%" colspan="7">
                <hr/>
              </td>
            </tr>
            <tr>
              <td width="2%">&nbsp;</td>
              <td width="14%">Fecha constituci&oacute;n</td>
              <td colspan="4">
                <input type="text" name="txtFechaConstitucion" id="txtFechaConstitucion" tipo="Fecha" size="15" required message="La fecha es una dato obligatorio"/>
              </td>
              <td width="1%">&nbsp;</td>
            </tr>
            <tr>
              <td width="2%">&nbsp;</td>
              <td width="14%">No. Fideicomiso</td>
              <td colspan="4">
                <input type="text" name="txtNoFideicomiso" id="txtNoFideicomiso" tipo="Num" size="10" disabled/>
              </td>
              <td width="1%">&nbsp;</td>
            </tr>
            <!--tr>
              <td width="2%">&nbsp;</td>
              <td colspan="3" align="left" height="60%">
                <input type="checkbox" name="ChkFideicomisoFoseg" id="ChkFideicomisoFoseg" class="check" onclick="refrescarValorFideicomisoFoseg();"/>Fideicomiso FOSEG
              
              &nbsp;
              </td>
              <td align="left">
                <input type="checkbox" name="ChkContabilidadDetallada" id="ChkContabilidadDetallada" class="check" onclick="refrescarValorContabilidadDetallada();"/>Cuentas Individuales
              </td>
              <td align="left">
                <input type="checkbox" name="ChkEnviaMensajeria" id="ChkEnviaMensajeria" class="check" onclick="refrescarValorEnviaMensajeria();"/>Env&iacute;a mensajer&iacute;a
              </td>
              <td width="1%">&nbsp;</td>
            </tr-->
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="BUTTON" value="Aceptar" name="cmdAceptar" class="btn btn-primary" onclick="verificarEjecucionFuncion();"/>
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalConstitucion();"/>
        </td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
  </table>
</TD>
</FORM>
