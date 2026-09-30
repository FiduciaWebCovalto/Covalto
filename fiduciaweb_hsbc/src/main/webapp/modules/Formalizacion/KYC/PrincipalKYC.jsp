<FORM name="frmDatosFideicomitentesConsulta" id="frmDatosFideicomitentesConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">KYC</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">          
          <table width="90%" style="text-align:left" class="texto" border="0">
            <tr valign="middle">
              <td width="30%">&nbsp;</td>
              <td width="16%" nowrap>No. Prospecto</td>
              <td width="216">
                <input type="text" name="paramProyecto" id="paramProyecto" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td width="217">&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="16%" nowrap>Tipo de Parte / Rol</td>
              <td width="216">
                <select id="paramTipoParte" name="paramTipoParte" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="paramTipoPersona" param="clavesComboTipoParte"></select>
              </td>
              <td width="217">&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="16%" nowrap>Tipo de Persona</td>
              <td width="216">
                <select id="paramTipoPersona" name="paramTipoPersona" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo23"></select>
              </td>
              <td width="217">&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="20%" nowrap>Nombre o Razon Social</td>
              <td colspan="2">
                <input type="text" name="NombreFideicomitente" id="paramNombreFideicomitente" size="50" maxlength="100"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
                <input type="text" name="paramOrder" id="paramOrder" size="2" value="s" style="visibility:hidden"/>
                <input type="text" name="paramModulo" id="paramModulo" value="FORMALIZACION" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" id="CmdAceptar" name="CmdAceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosFideicomitentes" fun="loadTableElement" tabla="tablaRegistrosFideicomitentes" onclick="consultar(this, GI('frmDatosFideicomitentesConsulta'), false);"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" id="CmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmDatosFideicomitentesConsulta'));"/>
                </td>
                </tr>
              </table>
                
                
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoFideicomitentes(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoFideicomitentes(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoFideicomitentes(3)"/> </td>                  
                </tr>
              </table>   
               
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr align="center">
              <td colspan="5">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                    <table id="tablaRegistrosFideicomitentes" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaFideicomitentesData" keys="afbCvePersona,afbNumFidben,afbAnteproyecto,antNumContrato" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen registros para estos criterios de busqueda">
                        <thead>
                          <tr class="cabeceras">
                            <td width="23" align="center">&nbsp;</td>
                            <td width="100">Csc</td>
                            <td width="100">No. Prospecto</td>
                            <td width="300">Nombre o Razon Social</td>
                            <td width="300">Tipo de Persona</td>
                            <td width="300">Tipo de Parte / Rol</td>
                            <td width="200">Etatus</td>
                            <td width="200">Fideicomiso</td>
                            <td width="150">Riesgo</td>
                          </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
              </td>
            </tr>
          </table>
        </td>
      </tr>
  </table>
</FORM>