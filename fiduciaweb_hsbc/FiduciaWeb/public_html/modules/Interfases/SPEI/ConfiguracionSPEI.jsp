<form name="frmDatosInterfase" id="frmDatosInterfase">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Configuraci&oacute;n SPEI</td>
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
              <input type="hidden" id="paramfpsIdParametro" name="paramfpsIdParametro" value="" />
              <input type="text" id="paramfpsNumFiso" name="paramfpsNumFiso" tipo="Numero" size="10" message="El Fideicomiso es un campo obligatorio" onblur="cargaCmbSubCta(this);" next="conNomFidActivo" style="width:120px;"/>
              <span id="nomFideicomiso" class="textoNegrita" ref="conNomFidActivo" fun="asignaValor2DivFideicomiso" theValue="ctoTipoAdmon" param="divNombreFideicomisoParam">&nbsp;</span>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Tipo de Operaci&oacute;n</td>
            <td align="left">            
              <select id="paramfpsTipoOperacion" name="paramfpsTipoOperacion" tipo="Numero" style="width:300px;" title="Tipo de Operacion" >
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
              <select size="1" style="width:300px;" id="paramfpsSubcuenta" name="paramfpsSubcuenta" tipo="Numero" title="Sub Cuenta" ref="subCuentaFISO" fun="loadComboElement" keyValue="fsctIdSubCuenta" param="cmbSubCta" theValue="fsctIdNomSubCuenta" next="formsLoaded"/>
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
                    <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="Aceptar" class="boton_left" ref="muestraDatosSPEI" fun="loadTableElement" tabla="tablaFisoSPEI" doOrder="true" onclick="consultar(this, GI('frmDatosInterfase'), false);">
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar();"/>
                  </td>
                </tr>
              </table> 
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr>
            <td style="height:20px;" colspan="3">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td colspan="2" align="center">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMntoSPEI(1)"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMntoSPEI(2)"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMntoSPEI(4)"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="Eliminar" id="cmdConsultar" name="cmdBaja" class="boton_right" onclick="cargaMntoSPEI(3)"/>
                  </td>                   
                </tr>
              </table>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr>
            <td style="height:20px;" colspan="3">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4">
              <table cellspacing="0" cellpadding="0" border="0" width="100%">
                <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>No.</td>
                  <td>&nbsp;</td>
                  <td style="width:300px;">Fideicomiso</td>
                  <td>&nbsp;</td>
                  <td>&nbsp;</td>
                  <td>&nbsp;</td>
                  <td style="width:300px;">Sub Cuenta</td>
                  <td>&nbsp;</td>
                  <td style="width:150px;">Tipo de Operaci&oacute;n</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top;">
                <table id="tablaFisoSPEI" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaFisoSPEIData" keys="fpsIdParametro,fpsNumFiso,fpsSubcuenta,fpsTipoOperacion,fsctNombreSubCuenta" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de b&uacute;squeda">
                </table>
              </div>
            <td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</form>