<FORM name="frmDatosMantenimientoAnteproyectoGenerales" id="frmDatosMantenimientoAnteproyectoGenerales" onsubmit=" ">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="0" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Proyecto</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="100%" border="0" style="text-align: left;" class="texto">
            <tr>
              <td nowrap width="1%">&nbsp;</td>
              <td nowrap width="20%">No. Prospecto</td>
              <td>
                <input type="text" name="antNumProspecto" id="antNumProspecto" tipo="Num" size="10" maxlength="10" required message="El Numero de Proyecto es un dato obligatorio"/>
              </td>
              <td>&nbsp;</td>
              <td nowrap width="20%">Apodo</td>
              <td>
                <input type="text" name="antNomNegocio" id="antNomNegocio" size="45" maxlength="100" required message="El Apodo es un dato obligatorio"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td nowrap>Tipo Negocio</td>
              <td colspan="4">
                    <select size="1" name="antCveTipoNeg" id="antCveTipoNeg" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="antNumProducto" param="clavesCombo36" onchange="actualizaComboClasProd();" required message="El Tipo de Negocio es un dato obligatorio"></select>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td nowrap>Clasificaci&oacute;n Producto</td>
              <td colspan="4">
                    <select size="1" name="antCveClasifPro" id="antCveClasifPro" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo37" next="antNumProducto" required message="La Clasificacion del Producto es un dato obligatorio"></select>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td nowrap>Producto</td>
              <td colspan="4">
                    <select size="1" name="antNumProducto" id="antNumProducto" ref="claveProducto" fun="loadComboElement" keyValue="prlNumProducto" theValue="prlNomProducto" next="antCveClasifSubPro" param="parametroComboProducto" required message="El Producto es un dato obligatorio"></select>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td nowrap>Sub Producto</td>
              <td>
                    <select size="1" name="antCveClasifSubPro" id="antCveClasifSubPro" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1010" next="antCveAreaInst" required message="El Sub Producto es un dato obligatorio"></select>
              </td>
              <td>&nbsp;</td>
              <td nowrap>Empresa</td>
              <td>
                    <select size="1" name="antCveAreaInst" id="antCveAreaInst" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="antSeguimiento" param="clavesCombo1003" required message="La Empresa es un dato obligatorio"></select>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td nowrap>Promotor Client Specialist</td>
                <td>
                    <input type="text" name="antProCliSpe" id="antProCliSpe" tipo="AlphaNumeric" size="30" maxlength="100" required message="El Promotor Client Specialist es un campo obligatorio"/>
                </td>
                <td>&nbsp;</td>
              <td nowrap>Fecha de Inicio Negociacion</td>
              <td>
                <input type="text" name="antFechaApertura" id="antFechaApertura" tipo="Fecha" size="10" maxlength="10" message="La Fecha Inicio de Negociacion es un campo obligatorio"/>
              </td>
              <td>&nbsp;</td>
            </tr>   
            <tr>
                <td>&nbsp;</td>
                <td nowrap>Promotor Client Manager</td>
                <td>
                    <input type="text" name="antProCliMan" id="antProCliMan" tipo="AlphaNumeric" size="30" maxlength="100"/>                            
                </td>                
                <td>&nbsp;</td>
              <td nowrap>Fecha Probable de Constitucion</td>
              <td>
                <input type="text" name="antFecProConsti" id="antFecProConsti" tipo="Fecha" size="10" maxlength="10"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td nowrap>Fecha Ultima Gestion</td>
              <td>
                <input type="text" name="antFecGestion" id="antFecGestion" tipo="Fecha" size="10" maxlength="10"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td nowrap>Descripcion Ultima Gestion</td>
              <td colspan="4">
                <textarea name="antDesGestion" id="antDesGestion" style="width:600px;height:80px" onkeydown="validaLongitud(this,250);"></textarea>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td nowrap>Situaci&oacute;n</td>
              <td>
                <select size="1" name="antSeguimiento" id="antSeguimiento" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="antCveStProspec" param="clavesCombo125"></select>
              </td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td nowrap>Estatus</td>
              <td>
                    <select size="1" name="antCveStProspec" id="antCveStProspec" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="loadCatalogo" param="clavesCombo161" required message="El Estatus es un dato obligatorio"></select>
              </td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr align="center">
        <td height="100%">
          <input type="BUTTON" value="  Aceptar  " name="cmdAceptar" id="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <!--input type="BUTTON" value="Siguiente >" name="cmdSiguiente" class="btn btn-primary" onclick="guardaInfoSiguiente();" style="visibility:hidden"/-->
          <input type="BUTTON" value="  Cancelar " name="cmdCancelar" id="cmdCancelar"  class="btn btn-danger" onclick="cargaPrincipalProspectosAnteproyecto();" style="visibility:hidden"/>
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
