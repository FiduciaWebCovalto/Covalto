<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Fideicomitentes</td>
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
              <input type="text" name="fidNumContrato" id="fidNumContrato" tipo="Num" size="10" maxlength="10" onblur="validarPkAlta(this);" required message="El N�mero de Fideicomiso es un campo obligatorio"/>
            </td>
            <td colspan="4">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">No. Fideicomitente</td>
            <td>
              <input type="text" name="fidFideicomitente" id="fidFideicomitente" tipo="Num" size="10" maxlength="10" required message="El N�mero de Fideicomitente es un campo obligatorio"/>
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td width="16%">&nbsp;</td>
            <td>&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">Raz&oacute;n Social</td>
            <td colspan="5">
              <input type="text" name="fidNomFideicom" id="fidNomFideicom" size="50" maxlength="50" required message="La Raz�n Social es un campo obligatorio"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td nowrap colspan="6" width="15%">
              <hr/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
           
            <tr>
              <td width="12%">&nbsp;</td>
              <td nowrap width="15%">Nacionalidad</td>
              <td colspan="5">
                <select size="1" name="fidNomNacional" id="fidNomNacional" ref="claveNacionalidad" fun="loadComboElement" onchange="GI('fidCveMigratoria').selectedIndex=((this.options[this.selectedIndex].text=='MEXICANA')?1:2);" keyValue="nacNomNacional" theValue="nacNomNacional" next="fidCveMigratoria" required message="La nacionalidad es un campo obligatorio"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="12%">&nbsp;</td>
              <td nowrap width="15%">Calidad Migratoria</td>
              <td colspan="5">
                <select size="1" name="fidCveMigratoria" id="fidCveMigratoria" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="fidCveTipoPer" param="clavesCombo16"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="12%">&nbsp;</td>
              <td nowrap width="15%">Tipo Persona</td>
              <td colspan="5">
                <select size="1" name="fidCveTipoPer" id="fidCveTipoPer" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="loadCatalogo" param="clavesCombo23" required message="El Tipo de Persona es un campo obligatorio"/>
              </td>
              <td align="left" width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="12%">&nbsp;</td>
              <td nowrap width="15%">E-mail:</td>
              <td colspan="5">
                <input type="text" name="fidRfc" id="fidRfc"  value=""  size="15" maxlength="15"/>
              </td>
              <td align="left" width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="12%">&nbsp;</td>
              <td nowrap width="15%">% Participacion:</td>
              <td colspan="5">
                <input type="text" name="fidCurp" id="fidCurp"  value=""  size="10" maxlength="10"/>
              </td>
              <td align="left" width="10%">&nbsp;</td>
            </tr>            
            
            <tr>
              <td width="12%">&nbsp;</td>
              <td nowrap width="15%">Documento:</td>
              <td colspan="5">
                 <select size="1" name="cboNombre" id="cboNombre" ref="qryDocumentsCboTP2" fun="loadComboElement" keyValue="fdocIdDocumento" theValue="fdocNombre" param = "paramsQryDocumentsCbo" next="fin"/>
		<input type="BUTTON" id="btnViewDoc" name="btnViewDoc" value="  Ver Documento  " class="btn btn-primary" onclick="viewDoc(this);" style="visibility:hidden"/>					                </td>		  
		<div style="visibility:hidden"><a id="docLink" href="#" target="_new">Liga para ver documentos</a></div>
              </td>
              <td align="left" width="10%">&nbsp;</td>
            </tr>
           

             
          <div style="position:absolute;visibility:hidden">
            <input type="text" name="fidNumRama" id="fidNumRama"  value="1"/>
            <input type="text" name="fidNumSrama" id="fidNumSrama"  value="1"/>
            <input type="text" name="fidCveSexo" id="fidCveSexo"  value=""/>
            <input type="text" name="fidNumLadaCasa" id="fidNumLadaCasa"  value=""/>
            <input type="text" name="fidNumTelefCasa" id="fidNumTelefCasa"  value=""/>
            <input type="text" name="fidNumLadaOfic" id="fidNumLadaOfic"  value=""/>
            <input type="text" name="fidNumTelefOfic" id="fidNumTelefOfic"  value=""/>
            <input type="text" name="fidNumExtOfic" id="fidNumExtOfic"  value=""/>
            <input type="text" name="fidNumLadaFax" id="fidNumLadaFax"  value=""/>
            <input type="text" name="fidNumTelefFax" id="fidNumTelefFax"  value=""/>
            <input type="text" name="fidNumExtFax" id="fidNumExtFax"  value=""/>
            <input type="text" name="fidCveStFideico" id="fidCveStFideico"  value="PENDIENTE"/>
          </div>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
        <input type="BUTTON" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalFideicomitentes();" style="visibility:hidden"/>
        <input type="BUTTON" value="Direcciones" name="cmdDirecciones" class="btn btn-primary" onclick="cargaPrincipalDirecciones();" style="visibility:hidden"/>
        <input type="BUTTON" value="Ir a KYC" name="cmdKYC" class="btn btn-primary" onclick="cargaCheckList();" style="visibility:hidden"/>
      </td>
    </tr>
  </table>
</FORM>
<table cellpadding="0" cellspacing="0" width="1168" height="640" id="ContenedorKYC" style="visibility:hidden;">
  <tr>
    <td colspan="2" width="1168" align="right" height="40" class="AcotacionesKYC"></td>    
  </tr>
  <tr>
    <td width="168" align="right" height="600" style="vertical-align:top;"><div id="cargaCheck"></div></td>
    <td width="1000" align="center" height="600" style="background-color: #E4E4E4;"><div id="cargaConceptos" style="vertical-align:top;"><div style="color: #CCCCCC;font-size: 70px;font-weight: bold;">KYC</div></div></td>
  </tr>
</table>
