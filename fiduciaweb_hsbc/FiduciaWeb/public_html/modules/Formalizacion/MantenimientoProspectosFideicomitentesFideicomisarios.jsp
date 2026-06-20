<FORM name="frmDatosMantenimientoFideicomitentes" id="frmDatosMantenimientoFideicomitentes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Fideicomitentes/Fideicomisarios</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table border="0" width="100%" class="texto">
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Prospecto</td>
              <td>
                <input type="text" name="fidNumProspecto" id="fidNumProspecto" tipo="Num" size="10" maxlength="10" onblur="consultarExistenciaFideicomitente();" required message="El Anteproyecto es un campo obligatorio"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Nombre del Prospecto</td>
              <td>
                <input type="text" name="txtNomProspecto" id="txtNomProspecto" size="50" maxlength="50" disabled/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;
              </td>
              <td colspan="2">
                <hr/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>N&uacute;mero</td>
              <td>
                <input type="text" name="fidSecuencialPersona" id="fidSecuencialPersona" tipo="Num" size="10" maxlength="10" required message="El N�mero es un campo obligatorio"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Nombre/Raz&oacute;n Social</td>
              <td>
                <input type="text" name="fidNomPersona" id="fidNomPersona" size="50" maxlength="50" required message="El Nombre es un campo obligatorio"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Apellido Paterno</td>
              <td>
                <input type="text" name="fidApPaterno" id="fidApPaterno" size="50" maxlength="50"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Apellido Materno</td>
              <td>
                <input type="text" name="fidApMaterno" id="fidApMaterno" size="50" maxlength="50"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
                
             <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Tipo Persona</td>
              <td>
                <select id="fidCvePersona" name="fidCvePersona" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="loadCatalogo" param="clavesCombo29" required message="El Tipo de Persona es un campo obligatorio"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>RFC</td>
              <td>
                <input type="text" name="fidRfcPersona" id="fidRfcPersona" size="15" maxlength="13"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>CURP</td>
              <td>
                <input type="text" name="fidCurpPersona" id="fidCurpPersona" size="20" maxlength="20"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Domicilio</td>
              <td>
                <textarea name="fidDomicilioPersona" id="fidDomicilioPersona" rows="3" size="60"></textarea>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Telefono</td>
              <td>
                <input type="text" name="fidTelPersona" id="fidTelPersona" size="20" maxlength="20"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <div style="position:absolute;visibility:hidden">
        <input type="text" name="fidCveStPersona" id="fidCveStPersona" value="ACTIVO"/>
      </div>
      <tr align="center">
        <td height="100%">
          <input type="button" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalProspectosFideicomitentes();" style="visibility:hidden"/>
           <input type="BUTTON" value="Ir a KYC" name="cmdKYC" class="btn btn-primary" onclick="cargaCheckList();" style="visibility:hidden"/>
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
