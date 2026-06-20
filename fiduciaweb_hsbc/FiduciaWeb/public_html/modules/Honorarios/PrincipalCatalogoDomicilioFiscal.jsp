<FORM name="frmDomicilioFiscalHonorariosConsulta" id="frmDomicilioFiscalHonorariosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Domicilio Fiscal del Fideicomiso</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="35%">&nbsp;</td>
              <td width="10%">No. Fideicomiso</td>
              <td>
                <input type="text" name="paramNumFiso" id="paramNumFiso" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="35%">&nbsp;</td>
              <td width="10%">RFC</td>
              <td>
                <input type="text" name="paramRfc" id="paramRfc" tipo="AlphaNumeric" size="13" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="35%">&nbsp;</td>
              <td width="10%">Nombre</td>
              <td>
                <input type="text" name="paramNombre" id="paramNombre" tipo="AlphaNumeric" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="35%">&nbsp;</td>
              <td width="10%">Correo Electr&oacute;nico</td>
              <td>
                <input type="text" name="paramEmail" id="paramEmail" tipo="AlphaNumeric" size="40" maxlength="255"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" id="Aceptar" name="Aceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosDomicilioFiscalHonorarios" fun="loadTableElement" tabla="tablaRegistrosDomicilioFiscalHonorarios" onclick="consultar(this, GI('frmDomicilioFiscalHonorariosConsulta'), false);"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" name="cmdLimpiar" size="20%" class="btn btn-warning" onclick="RF(GI('frmDomicilioFiscalHonorariosConsulta'));"/>
                </td>
                </tr>
            </table>
                
                
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoDomicilioFiscalHonorarios(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoDomicilioFiscalHonorarios(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoDomicilioFiscalHonorarios(3)"/> </td>                   
                  </td>
                </tr>
            </table>               
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>

            
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosDomicilioFiscalHonorarios" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaDomicilioFiscalHonorariosData" keys="dfNumContrato,dfTipoPersona,dfNumPersona,dfNombre,dfRfc" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>&nbsp;</td>
                    <td>Fideicomiso</td>
                    <td>Tipo Persona</td>
                    <td>Num Persona</td>
                    <td>No. Domicilio</td>
                    <td>Domicilio</td>
                    <td>RFC</td>
                    <td>Nombre</td>                  
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
