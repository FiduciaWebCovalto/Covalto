<form name="frmMantenimientoCedulaFiscal" id="frmMantenimientoCedulaFiscal" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento a C&eacute;dula Fiscal</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td>&nbsp;</td>
            <td nowrap>Fideicomiso</td>
            <td width="10%">
              <input type="text" name="crfNumFideicom" id="crfNumFideicom" size="10" maxlength="10" tipo="Num" required message="El Fideicomiso es un campo obligatorio" onblur="consultaNombreFideicomiso('nomFideicomiso',this);"/>
            </td>
            <td><div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div></td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Clasificaci&oacute;n</td>
            <td colspan="4">
              <select size="1" name="trfCveTratfisc" id="trfCveTratfisc" ref="conTraFis" fun="loadComboElement" keyValue="trfCveTratfisc" theValue="trfClasific" next="crfObligadFisc" required message="La Clasificaci�n es un campo obligatorio"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Obligaciones Fiscales a Cargo de</td>
            <td colspan="2">
              <select size="1" name="crfObligadFisc" id="crfObligadFisc" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbObligacionesFiscalesParam" next="crfPartfisc" required message="El Obligado Fiscal es un campo obligatorio"/>
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>RFC</td>
            <td colspan="2">
              <input type="text" name="crfRfc" id="crfRfc" size="15" maxlength="30" tipo="AlphaNumeric" /> <!-- required message="El RFC es un campo obligatorio"-->
            </td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td>CURP</td>
            <td>
              <input type="text" name="crfCurf" id="crfCurf" size="18" maxlength="20"/>
            </td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Titular</td>
            <td colspan="4">
              <input type="text" name="crfTitular" id="crfTitular" size="100" maxlength="255" tipo="AlphaNumeric" /> <!--required message="El Titular es un campo obligatorio"-->
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Participaci&oacute;n</td>
            <td colspan="2">
              <select size="1" name="crfPartfisc" id="crfPartfisc" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbParticipacionParam" next="crfCveStCerefi"/> <!--required message="La Participaci�n es un campo obligatorio"-->
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Status</td>
            <td colspan="2">
              <select size="1" name="crfCveStCerefi" id="crfCveStCerefi" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbStatusParam" next="asignaValues2ObjHTML"/> <!--required message="El Status es un campo obligatorio"-->
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Documentaci&oacute;n faltante</td>
            <td colspan="2">
               <textarea name="crfDocFalt" id="crfDocFalt" style="width:400px;height:80px" onkeydown="validaLongitud(this,500);"></textarea>
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap><b>Datos del despacho encargado</b></td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Despacho</td>
            <td colspan="2">
              <input type="text" name="crfDesp" id="crfDesp" size="100" maxlength="255" tipo="AlphaNumeric" />
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Representante legal ante el SAT</td>
            <td colspan="2">
              <input type="text" name="crfDespRepSat" id="crfDespRepSat" size="100" maxlength="255" tipo="AlphaNumeric" />
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Domicilio</td>
            <td colspan="2">
              <input type="text" name="crfDespDom" id="crfDespDom" size="100" maxlength="255" tipo="AlphaNumeric" />
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Telefono</td>
            <td colspan="2">
              <input type="text" name="crfDespTel" id="crfDespTel" size="100" maxlength="255" tipo="AlphaNumeric" />
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Contacto Adicional</td>
            <td colspan="2">
              <input type="text" name="crfDespContac" id="crfDespContac" size="100" maxlength="255" tipo="AlphaNumeric" />
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Resultado a la revisi&oacute;n de las obligaciones fiscales</td>
            <td colspan="2">
               <textarea name="crfResRev" id="crfResRev" style="width:400px;height:80px" onkeydown="validaLongitud(this,500);"></textarea>
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td nowrap>Recomendaci&oacute;n</td>
            <td colspan="2">
               <textarea name="crfRecom" id="crfRecom" style="width:400px;height:80px" onkeydown="validaLongitud(this,500);"></textarea>
            </td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td>&nbsp;</td>
            <td colspan="2">&nbsp;</td>
            <td colspan="2">&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="2">&nbsp;</td>
            <td colspan="2" align="right">
              <input type="button" value="Ced. An&aacute;lisis Fiscal" name="cmdCedula" id="cmdCedula" class="btn btn-primary" onclick="generaFichaSP()"/>
              <input type="button" value="Documentos" name="cmdDocumentos" id="cmdDocumentos" class="btn btn-primary" onclick="cargaPrincipalCedulaFiscalRegimenFiscal2();"/>
              <input type="button" value="Obligaciones" name="cmdObligaciones" id="cmdObligaciones" class="btn btn-primary" onclick="cargaPrincipalCedulaFiscalRegimenFiscal();"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td height="100%" align="center">&nbsp;</td>
    </tr>
    <tr align="center">
      <td height="100%" align="center">
        <input type="button" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="ejecutaOperacionCedulaFiscal();" style="visibility:hidden"/>
        <input type="button" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="onButtonClickPestania('Contabilidad.CedulaFiscal.PrincipalCedulaFiscalRegimenFiscal','')" style="visibility:hidden"/>
      </td>
    </tr>
  </table>
</form>
<a id="linkReporte" href="#" style="visibility:hidden">Archivo</a> 
<a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a> 
