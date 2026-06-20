<!--Version de Formalizacion/Proyectos-->
<FORM name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Fiscal</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      
          <tr>
            <td width="30%">No. Fideicomiso</td>
            <td nowrap width="15%">
              <input type="text" name="fpfFideicomiso" id="fpfFideicomiso" tipo="Num" size="10" maxlength="10"  required message="El Numero de Fideicomiso es un campo obligatorio" /> <!---->
           
             <input type="text" name="fpfProspecto" id="fpfProspecto" tipo="Num" size="10" maxlength="10"  value="0" style="visibility:hidden"/> <!---->              
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
            &nbsp;
            </td>
          </tr>   
          <tr>
            <td width="30%">Clasificacion FATCA</td>
            <td nowrap width="15%">
                <input type="text" name="fpfClasFatca" id="fpfClasFatca"  size="20" maxlength="20" />
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                          <input type="checkbox" name="fpfAutocerFatcaChk" id="fpfAutocerFatcaChk" class="check" tv="1" fv="0"/>Autenticacion FATCA
            </td>
          </tr>   
          <tr>
            <td width="30%">Clasificacion CRS</td>
            <td nowrap width="15%">
                <input type="text" name="fpfClasCrs" id="fpfClasCrs"  size="20" maxlength="20" />
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
              <input type="checkbox" name="fpfAutocerCrsChk" id="fpfAutocerCrsChk" class="check" tv="1" fv="0"/>Autenticacion CRS
            </td>
          </tr>
          <tr>
            <td width="30%">GIIN</td>
            <td nowrap width="15%">
                <input type="text" name="fpfGin" id="fpfGin"  size="10" maxlength="10" required message="El GIN es un campo obligatorio" onblur="verificacionExistenciaRegistro(true);" /> <!---->
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
              <input type="checkbox" name="fpfRetencionFiscalChk" id="fpfRetencionFiscalChk" class="check" tv="1" fv="0"/>Retenciones Fiscales
            </td>
          </tr>   
          <tr>
            <td width="30%">TIN</td>
            <td nowrap width="15%">
                <input type="text" name="fpfTin" id="fpfTin"  size="10" maxlength="10" required message="El TIN es un campo obligatorio" onblur="verificacionExistenciaRegistro(true);" /> <!---->
             </td>
            <td colspan="2">Exento o Gravado</td>
            <td align="left" width="15%">
              <select size="1" name="fpfExcento" id="fpfExcento" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1093"  next="fpfPaisResidencia" required message="El campo Exento o Gravado es un campo obligatorio"/> <!---->              
            </td>
          </tr>   
          <tr>
            <td width="30%">Pais de Residencia fiscal</td>
            <td nowrap width="15%">
                <select size="1" name="fpfPaisResidencia" id="fpfPaisResidencia" ref="clavePaisCat" fun="loadComboElement" keyValue="paiNomPais" theValue="paiNomPais"  next="fpfClasificacionSat"/> <!---->
             </td>
            <td colspan="2">Clasificacion SAT</td>
            <td align="left" width="15%">
              <select size="1" name="fpfClasificacionSat" id="fpfClasificacionSat" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1092"  next="loadCatalogo"/> <!---->              
            </td>
          </tr>           
      <tr>
        <td colspan="5" align="center">
          <input type="BUTTON" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="BUTTON" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalFinalidadesContrato();" style="visibility:hidden"/>
        </td>
      </tr>
      
  </table>
</FORM>
