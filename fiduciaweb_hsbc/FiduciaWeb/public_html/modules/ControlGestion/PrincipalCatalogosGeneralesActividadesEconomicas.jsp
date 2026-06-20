<FORM name="frmPrincipalCatalogosGeneralesActividadesEconomicas" id="frmPrincipalCatalogosGeneralesActividadesEconomicas" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Actividades Econ&oacute;micas</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table cellspacing="2" cellpadding="3" border="0" width="100%" class="texto">
          <tr>
            <td height="26" width="30%">&nbsp;</td>
            <td height="26" width="5%">Nombre</td>
            <td height="26">
              <input type="text" name="paramNombre" id="paramNombre" tipo="AlphaNumeric" size="50" maxlength="50"/>
            </td>
            <td height="26" width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosActividadesEconomicas" fun="loadTableElement" tabla="tablaRegistrosDatosActividades" onclick="consultar(this, GI('frmPrincipalCatalogosGeneralesActividadesEconomicas'), false);"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalCatalogosGeneralesActividadesEconomicas'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCatalogosGeneralesActividadesEconomicas(1)"/>
              <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoCatalogosGeneralesActividadesEconomicas(2)"/>
              <input type="BUTTON" value="  Baja   " id="cmdBajar" name="cmdBajar" class="btn btn-primary" onclick="eliminarRegistro();"/>
              <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoCatalogosGeneralesActividadesEconomicas(3)"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosDatosActividades" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaDatosActividadesData" keys="actNumRama,actNumSrama" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Rama</td>
                  <td>SubRama</td>
                  <td>Nombre</td>
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
</FORM>
