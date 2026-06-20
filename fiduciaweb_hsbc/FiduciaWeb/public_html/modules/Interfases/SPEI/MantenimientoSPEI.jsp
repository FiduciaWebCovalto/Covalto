<form name="frmDatosInterfase" id="frmDatosInterfase">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Configuraci&oacute;n SPEI - <span id="funcionTitle">Funcion</span></td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="80%" align="center" class="texto">
          <tr valign="middle">
            <td align="left">&nbsp;</td>
            <td align="right">Fideicomiso</td>
            <td align="left">
              <input type="hidden" id="paramfpsIdParametro" name="paramfpsIdParametro" value="0" />
              <input type="text" id="paramfpsNumFiso" name="paramfpsNumFiso" tipo="Numero" size="10" required="required" message="El Fideicomiso es un campo obligatorio" onblur="cargaCmbSubCta(this);" next="conNomFidActivo" style="width:120px;"/>
              <span id="nomFideicomiso" class="textoNegrita" ref="conNomFidActivo" fun="asignaValor2DivFideicomiso" theValue="ctoTipoAdmon" param="divNombreFideicomisoParam">&nbsp;</span>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Tipo de Operaci&oacute;n</td>
            <td align="left">            
              <select id="paramfpsTipoOperacion" name="paramfpsTipoOperacion" tipo="Numero" style="width:300px;" title="Tipo de Operacion">
                <option value="-1">-- Seleccione --</option>
                <option value="1">DEPOSITO</option>
                <option value="2">RETIRO</option>
                <option value="3">TRASPASO</option>
              </select>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Sub Cuenta</td>
            <td align="left">            
              <select id="paramfpsSubcuenta" name="paramfpsSubcuenta" tipo="Numero" size="1" style="width:300px;" title="Sub Cuenta" ref="subCuentaFISO" fun="loadComboElement" keyValue="fsctIdSubCuenta" param="cmbSubCta" theValue="fsctIdNomSubCuenta" next="formsLoaded"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr>
            <td style="height:20px;" colspan="3">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td colspan="2" align="center">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="112"  align="center" valign="middle">
                    <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="doMantenimientoSPEI(currentScreen);">
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="Regresar" id="cmdCancelar" name="cmdCancelar" class="boton_right" onclick="cancelarMnto();"/>
                  </td>
                </tr>
              </table> 
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</form>