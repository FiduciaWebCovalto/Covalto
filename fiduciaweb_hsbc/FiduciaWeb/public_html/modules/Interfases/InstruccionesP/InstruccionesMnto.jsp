<form name="frmDatosInterfase" id="frmDatosInterfase">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Instrucciones Programadas - <span id="funcionTitle">Funcion</span></td>
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
              <input type="text" id="paramfipNumFiso" name="paramfipNumFiso" tipo="Numero" size="10" required="required" message="El Fideicomiso es un campo obligatorio" onblur="cargaCombos(this);" next="paramfipSubcuenta" style="width:120px;"/>
              <span id="nomFideicomiso" class="textoNegrita" ref="conNomFidActivo" fun="asignaValor2DivFideicomiso" theValue="ctoTipoAdmon" param="divNombreFideicomisoParam">&nbsp;</span>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Tipo de Operaci&oacute;n</td>
            <td align="left">            
              <select id="paramfipTipoOperacion" name="paramfipTipoOperacion" tipo="Numero" required="required" message="Indique el tipo de operacion" style="width:300px;" title="Tipo de Operacion">
                <!--option value="-1">-- Seleccione --</option>
                <option value="1">DEPOSITO</option-->
                <option value="2">RETIRO</option>
                <!--option value="3">TRASPASO</option-->
              </select>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Sub Cuenta</td>
            <td align="left">            
              <select id="paramfipSubcuentaOrigen" name="paramfipSubcuentaOrigen" tipo="Numero" size="1" style="width:300px;" title="Sub Cuenta" ref="subCuentaFISO" fun="loadComboElement" keyValue="fsctIdSubCuenta" param="cmbSubCta" theValue="fsctIdNomSubCuenta" next="paramfipCtaOrigen"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Cuenta Origen</td>
            <td align="left">            
              <select id="paramfipCtaOrigen" name="paramfipCtaOrigen" tipo="String" required="required" message="Indique la cuenta origen" size="1" style="width:300px;" title="Cuenta Origen" ref="ctasFisoIP" fun="loadComboElement" keyValue="fcbaClabeCba" param="cmbClabeCba" theValue="fcbaClabeCba" next="paramfipCtaDestino"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Cuenta Destino</td>
            <td align="left">            
              <select id="paramfipCtaDestino" name="paramfipCtaDestino" tipo="String" required="required" message="Indique la cuenta destino" size="1" style="width:300px;" title="Cuenta Destino" ref="ctasFisoIP" fun="loadComboElement" keyValue="fcbaClabeCba" param="cmbClabeCba" theValue="fcbaClabeCba" next="paramfipConcepto"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Concepto</td>
            <td align="left">            
              <select id="paramfipConcepto" name="paramfipConcepto" tipo="string" required="required" message="Indique el concepto" size="1" style="width:300px;" title="Concepto" ref="conceptosFisoIP" fun="loadComboElement" keyValue="cveDescClave" param="cmbFipConcepto" theValue="cveDescClave" next="paramfipPeriodicidad"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td align="left">&nbsp;</td>
            <td align="right">Importe</td>
            <td align="left">
              <input type="text" id="paramfipImporte" name="paramfipImporte" required="required" message="Debe indicar el importe" tipo="Numero" size="30" style="width:120px;" maxlength="22"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td align="left">&nbsp;</td>
            <td align="right">Descripci&oacute;n</td>
            <td align="left">
              <input type="text" id="paramfipDescripcion" required="required" message="Debe indicar la descripcion" name="paramfipDescripcion" size="100"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Periodicidad</td>
            <td align="left">            
              <select id="paramfipPeriodicidad" name="paramfipPeriodicidad" tipo="string" required="required" message="Debe indicar la periodicidad" size="1" style="width:300px;" title="Periodicidad" ref="periodicidadFisoIP" fun="loadComboElement" keyValue="cveDescClave" param="cmbFipPeriodicidad" theValue="cveDescClave" next="paramfipdiaOrdinario"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Fecha Inicio</td>
            <td align="left">            
                <input type="text" name="paramfipFecEvento" id="paramfipFecEvento" required="required" message="Debe indicar la fecha de inicio" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="txtFechaInicio" maxlength="10" tipo="Fecha"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Fecha Fin</td>
            <td align="left">            
              <input type="text" name="paramfipFecFinEvento" id="paramfipFecFinEvento" required="required" message="Debe indicar la fecha de termino" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="txtFechaInicio" maxlength="10" tipo="Fecha"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td align="left">&nbsp;</td>
            <td align="right">D&iacute;a</td>
            <td align="left">
              <input type="text" id="paramfipDiaHabil" name="paramfipDiaHabil" required="required" message="Debe idicar el dia habil" tipo="Numero" size="5" maxlength="3"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">&Uacute;ltimo D&iacute;a</td>
            <td align="left">            
              <input type="checkbox" id="paramfipUltimoDia" name="paramfipUltimoDia" checked="checked" value="1" />
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Feriado</td>
            <td align="left">            
              <select id="parameageCveFeriado" tipo="String" required="required" message="Debe idicar si es feriado" name="parameageCveFeriado" style="width:300px;" title="Feriado">
                <option value="ANTERIOR">ANTERIOR</option>
                <option value="SIGUIENTE">SIGUIENTE</option>
              </select>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Periodo Especial</td>
            <td align="left">            
              <select id="paramfipPeriodoEspecial" tipo="Number" required="required" message="Debe indicar se es periodo especial" name="paramfipPeriodoEspecial" style="width:300px;" title="Feriado">
                <option value="1">Si</option>
                <option value="0">No</option>
              </select>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">D&iacute;a Ordinario</td>
            <td align="left">            
              <select id="paramfipdiaOrdinario" name="paramfipdiaOrdinario" tipo="Numero" size="1" style="width:300px;" title="Dia Ordinario" ref="diaOrdinarioIP" fun="loadComboElement" keyValue="cveNumSecClave" param="cmbFipPeriodicidad" theValue="cveDescClave" next="paramfipStatus"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Tipo d&iacute;a h&aacute;bil</td>
            <td align="left">            
              <select id="paramfipCveDiaHabnat" name="paramfipCveDiaHabnat" tipo="String" style="width:300px;" title="Feriado">
                <option value="HABIL">Habil</option>
                <option value="NATURAL">Natural</option>
              </select>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Estatus</td>
            <td align="left">            
              <select id="paramfipStatus" name="paramfipStatus" tipo="String" size="1" style="width:300px;" title="Estatus" ref="estatusFisoIP" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr>
            <td style="height:20px;" colspan="3">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td colspan="2" align="center">
              <table width="336" cellpadding="2" cellspacing="2">
                <tr>
                  <td width="112"  align="center" valign="middle">
                    <input id="cmdAceptar" type="BUTTON" value="Aceptar" name="cmdAceptar" class="btn btn-primary" onclick="invocarCRUD(1);">
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input id="cmdCancelar" type="BUTTON" value="Regresar" name="cmdCancelar" class="btn btn-primary" onclick="cancelarMnto();"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input id="cmdProyectar" type="BUTTON" value="Proyectar" name="cmdProyectar" class="btn btn-primary" onclick="doProyectar();" style="visibility:hidden"/>
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