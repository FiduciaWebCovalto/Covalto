<FORM name="frmDomicilioFiscalHonorariosMantenimiento" id="frmDomicilioFiscalHonorariosMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">
          <P>Mantenimiento a Domicilio Fiscal del Fideicomiso</P>
        </td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>No. Fideicomiso</td>
              <td>
                <input type="text" name="dfNumContrato" id="dfNumContrato" tipo="Num" size="10" maxlength="10" onblur="verificarAltaPk();" required message="El N�mero de Fideicomiso es un dato obligatorio"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Tipo Persona:</td>
              <td>
                <select size="1" name="dfTipoPersona" id="dfTipoPersona" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="dfStatus" param="clavesCombo10"  required message="El Tipo de Persona es un dato obligatorio"></select>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>No. Persona:</td>
              <td>
                <input type="text" name="dfNumPersona" id="dfNumPersona" tipo="Num" size="10" maxlength="10" onblur="validaPersona();" required message="El Numero de Persona es un dato obligatorio"/>
                <input type="text" name="NombrePersona" id="NombrePersona" size="35" maxlength="50" disabled/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>            
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Domicilio Fiscal</td>
              <td>
                <textarea name="dfDomicilio" id="dfDomicilio" style="width:400px;height:80px" onkeydown="validaLongitud(this,255);"  required message="El Domicilio es un dato obligatorio"></textarea>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>RFC</td>
              <td>
                <input type="text" name="dfRfc" id="dfRfc" size="15" maxlength="255" required message="El RFC es un dato obligatorio"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Correo Electr&oacute;nico</td>
              <td>
                <input type="text" name="dfEmail" id="dfEmail" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Nombre</td>
              <td>
                <textarea name="dfNombre" id="dfNombre" style="width:400px;height:80px" onkeydown="validaLongitud(this,255);" required message="El Nombre es un dato obligatorio"></textarea>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>N&uacute;mero Exterior</td>
              <td>
                <input type="text" name="dfNumExt" id="dfNumExt" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>N&uacute;mero Interior</td>
              <td>
                <input type="text" name="dfNumInt" id="dfNumInt" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Colonia</td>
              <td>
                <input type="text" name="dfColonia" id="dfColonia" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Delegaci&oacute;n</td>
              <td>
                <input type="text" name="dfDelegacion" id="dfDelegacion" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Estado</td>
              <td>
                <input type="text" name="dfEstado" id="dfEstado" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>C&oacute;digo Postal</td>
              <td>
                <input type="text" name="dfCp" id="dfCp" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Contacto</td>
              <td>
                <input type="text" name="dfContacto" id="dfContacto" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Porcentaje</td>
              <td>
                <input type="text" name="dfPorcentaje" id="dfPorcentaje" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="12%" nowrap>Status</td>
              <td>
                <select size="1" name="dfStatus" id="dfStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="loadCatalogo" param="clavesCombo31" required message="El Status es un dato obligatorio"></select>
                
              </td>
              <td width="5%">&nbsp;</td>
            </tr>            
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="BUTTON" value="  Aceptar  "  id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalDomicilioFiscalHonorarios();" style="visibility:hidden"/>
        </td>
      </tr>
  </table>
</FORM>
