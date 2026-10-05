<FORM name="frmPrincipalCatalogoIndicesOficialesControlGestion" id="frmPrincipalCatalogoIndicesOficialesControlGestion" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
<table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Catalogos Indices Oficiales</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table cellspacing="3" cellpadding="2" border="0" width="100%" class="texto">
          <tr>
            <td width="30%">&nbsp;
            </td>
            <td width="5%">Indice</td>
            <td>
              <select size="1" name="paramIndice" id="paramIndice" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo14"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" colspan="4">
              <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosIndicesOficiales" fun="loadTableElement" tabla="tablaRegistrosDatosIndicesOficiales" onclick="consultar(this, GI('frmPrincipalCatalogoIndicesOficialesControlGestion'), false);"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalCatalogoIndicesOficialesControlGestion'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center" width="25%">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td class="subtitulo" align="center" colspan="4">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCatalogosIndicesOficialesControlGestion(1);"/>
              <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoCatalogosIndicesOficialesControlGestion(2);"/>
              <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/>
              <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoCatalogosIndicesOficialesControlGestion(3);"/>
            </td>
          </tr>
          <tr>
            <td class="subtitulo" align="center" colspan="4">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosDatosIndicesOficiales" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaDatosIndicesOficialesData" keys="indCveIndice,indAnoIndice,indMesIndice,indDiaIndice" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Clave</td>
                  <td>A&ntilde;o</td>
                  <td>Mes</td>
                  <td>Dia</td>
                  <td>Valor</td>
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
