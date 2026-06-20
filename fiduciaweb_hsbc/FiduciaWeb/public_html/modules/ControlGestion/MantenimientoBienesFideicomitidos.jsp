<FORM name="frmMantenimientoBienesFideicomitidos" id="frmMantenimientoBienesFideicomitidos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento del Registro de Bienes Fideicomitidos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" align="center" class="texto">
          <tr>
            <td width="30%">Fideicomiso:</td>
            <td nowrap width="15%">
              <input type="text" name="fbifIdFideicomiso" id="fbifIdFideicomiso" tipo="Num" size = "10" maxlength="10" required message = "Valor obligatorio"/>
            </td>
            <td>SubCuenta:
            </td>
            <td width="45%">     
                <input type="text" name="fbifIdSubCuenta" id="fbifIdSubCuenta" tipo="Num" size = "10" maxlength="10" required message = "Valor obligatorio"/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">Tipo de Bien Fideicomitido:</td>
            <td nowrap width="15%">
                <select size="1" name="fbifIdTipoBien" id="fbifIdTipoBien" ref="cves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" param="clavesCombo70b" next=""  onchange="cargaParamComboProducto(this,false);" required message = "Valor obligatorio"/>
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
           <tr>
            <td nowrap width="25%">Clave de Bien Fideicomitido:</td>
            <td nowrap width="15%">
              <select size="1" name="fbifIdCveBien" id="fbifIdCveBien" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo71" next="loadCatalogo" required message = "Valor obligatorio">
              <option value="-1">-- Seleccione --</option>
              </select>
            </td>
            <td>&nbsp;</td>
            <td width="45%">&nbsp;
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
           <tr>
            <td width="30%">Identificacion del Bien:</td>
            <td nowrap width="15%">
            <input type="text" name="fbifIdBien" id="fbifIdBien"  size = "30" maxlength="25" required message = "Valor obligatorio"/>
            </td>
            <td>&nbsp;</td>
            <td width="45%">&nbsp;
            </td>
            <td width="15%">&nbsp;</td>
          <tr>
           <tr>
            <td width="30%">Importe del Bien:</td>
            <td nowrap width="15%">
              <input type="text" name="fbifImpBien" id="fbifImpBien" tipo="Num" size = "20" maxlength="16" />
            </td>
            <td>&nbsp;</td>
            <td width="45%">&nbsp;
            </td>
            <td width="15%">&nbsp;</td>
          <tr>
           <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">&nbsp;
            </td>
            <td>&nbsp;</td>
            <td width="45%">&nbsp;
            </td>
            <td width="15%">&nbsp;</td>
          <tr>
           <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">&nbsp;
            </td>
            <td>&nbsp;</td>
            <td width="45%">&nbsp;
            </td>
            <td width="15%">&nbsp;</td>
          <tr>
           <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">&nbsp;
            </td>
            <td nowrap width="15%">&nbsp;</td>
                <td>&nbsp;</td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="10%">&nbsp;
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;
            </td>
            <td align="left" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%"><div id="importeRevaluacion" style="visibility:hidden"> Importe Revaluaci&oacute;n: </div> </td>
            <td colspan="2">
              <input type="text" name = "txtImporteRevaluacion" id="txtImporteRevaluacion" style="visibility:hidden"/>
            </td>
            <td align="left" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%"><div id="tipoCambio" style="visibility:hidden"> Tipo de Cambio </div> </td>
            <td colspan="2">
              <input type="text" name = "fbifTipoCambio" id="fbifTipoCambio" style="visibility:hidden"/>
            </td>
            <td align="left" width="15%">&nbsp;</td>
          </tr>
           <tr>
            <td colspan="5" align="center">
              
      </td>
    </tr>
     <tr>
            <td colspan="5" align="center">
              <input type="button" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="button" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="onButtonClick('Contabilidad.BienesFideicomitidos.PrincipalBienesFideicomitidos','')" style="visibility:hidden"/>
            </td>
          </tr>
    <tr>
    </tr>
  </table>
</FORM>
