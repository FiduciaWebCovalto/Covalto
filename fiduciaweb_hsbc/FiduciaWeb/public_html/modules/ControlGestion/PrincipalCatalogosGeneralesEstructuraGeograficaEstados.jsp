<FORM name="frmPrincipalCatalogosGeneralesEstructuraGeograficaEstados" id="frmPrincipalCatalogosGeneralesEstructuraGeograficaEstados" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Estructura Geografica Estados</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table cellspacing="3" cellpadding="2" border="0" width="100%" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">Nombre Pais</td>
            <td>
              <select size="1" name="paramPais" id="paramPais" ref="clavePais" fun="loadComboElement" keyValue="paiNumPais" theValue="paiNomPais" next="formsLoaded" required message="Para llevar a cabo la b�squeda se requiere cuando menos el Pais" onchange="cargaParamComboEstado(this,true);"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">Nombre Estado</td>
            <td>
              <select size="1" name="paramEstado" id="paramEstado" ref="claveEstado" fun="loadComboElement" keyValue="edoNumEstado" theValue="edoNomEstado" next="formsLoaded" param="parametroComboEstado">
                <option value="-1">-- Seleccione --</option>
              </select>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosEstados" fun="loadTableElement" tabla="tablaRegistrosDatosEstados" onclick="buscarRegistros();"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalCatalogosGeneralesEstructuraGeograficaEstados'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCatalogosGeneralesEstructuraGeograficaEstado(1);"/>
              <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoCatalogosGeneralesEstructuraGeograficaEstado(2);"/>
              <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/>
              <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoCatalogosGeneralesEstructuraGeograficaEstado(3);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosDatosEstados" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaDatosEstadosData" keys="edoNumEstado,edoNumPais" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Pa&iacute;s</td>
                  <td> Estado</td>
                  <td>Abrev. Estado</td>
                  <td>Hr. Diferencia</td>
                  <td>Min. Diferencia</td>
                  <td>Status</td>                    
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
</TD>
</FORM>
