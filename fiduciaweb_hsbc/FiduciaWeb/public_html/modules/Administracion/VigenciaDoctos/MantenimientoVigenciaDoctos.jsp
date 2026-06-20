<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Vigencia de Documentos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
          <table width="90%" style="text-align:left" class="texto" border="0">
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">No. Prospecto</td>
            <td>
              <input type="text" name="fdocIdAnteproy" id="fdocIdAnteproy" size="10" maxlength="10" disabled/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">No. Persona</td>
            <td>
              <input type="text" name="fdocNumper" id="fdocNumper" size="10" maxlength="10" disabled/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Tipo de Parte</td>
              <td>
                <input type="text" name="paramTipoParte" id="paramTipoParte" size="50" maxlength="50" disabled />
              </td>
              <td width="10%">&nbsp;</td>
          </tr>
          <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Tipo de Persona</td>
              <td>
                <input type="text" name="fdocTipoPer" id="fdocTipoPer" size="50" maxlength="50" disabled />
              </td>
              <td width="10%">&nbsp;</td>
          </tr>
          <tr style="visibility:visible">
                <td width="25%">&nbsp;</td>
                <td>Documento</td>
                <td>
                    <select size="1" name="fdocIdDocumentovig" id="fdocIdDocumentovig" ref="qryDocumentsCboHijo" fun="loadComboElement" param="cmbDocumentoParam" keyValue="id" theValue="nombre" next="formsLoaded" required message="Seleccione un documento">
                    </select>
                </td>
                <td width="10%">&nbsp;</td>
          </tr>              
          <tr valign="middle">
            <td width="19%">&nbsp;</td>
            <td width="20%">Fecha de Vencimiento</td>
            <td width="44%">
                <input type="text" name="fdocFechaRenov" id="fdocFechaRenov" tipo="Fecha" size="10" maxlength="10"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>
          
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="22">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" id="cmdAceptar" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="ejecutaOperacionCuenta();" style="visibility:hidden"/>
        <input type="BUTTON" id="cmdCancelar" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="regresar2();" style="visibility:hidden"/>
      </td>
        <input type="text" name="pantORIG" id="pantORIG" size="10" maxlength="10" style="visibility:hidden"/>
        <input type="text" name="afbTelFidben" id="afbTelFidben" size="10" maxlength="10" style="visibility:hidden"/>
        <input type="text" name="afbCvePersona" id="afbCvePersona" size="10" maxlength="10" style="visibility:hidden"/>
        <input type="text" name="antNumContrato" id="antNumContrato" value=""  style="visibility:hidden"/> 
        <input type="text" name="paramNombre" id="paramNombre" size="50" maxlength="50" style="visibility:hidden"/>

    </tr>
  </table>
  <a id="ligaArchivo" href="#"/>
</FORM>
