<FORM name="frmPrincipalCatalogosEjecutivosControlGestion" id="frmPrincipalCatalogosEjecutivosControlGestion" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Ejecutivos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table cellspacing="2" cellpadding="3" border="0" width="100%" class="texto">
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="5%">Area</td>
            <td>
              <select size="1" name="paramBanca" id="paramBanca" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="paramTipoEjecutivo" param="clavesCombo5"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;
            </td>
            <td width="5%">Tipo</td>
            <td>
              <select size="1" name="paramTipoEjecutivo" id="paramTipoEjecutivo" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo67"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraEjecutivos" fun="loadTableElement" tabla="tablaRegistrosDatosEjecutivos" onclick="consultar(this, GI('frmPrincipalCatalogosEjecutivosControlGestion'), false);"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalCatalogosEjecutivosControlGestion'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCatalogosEjecutivosControlGestion(1);"/>
              <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoCatalogosEjecutivosControlGestion(2);"/>
              <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/>
              <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoCatalogosEjecutivosControlGestion(3);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr align="center">

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosDatosEjecutivos" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaDatosEjecutivosData" keys="ejeCveBanca,ejeNumEjecAtenc" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Banca</td>
                  <td>N&uacute;mero</td>
                  <td>Nombre</td>
                  <td>Tipo</td>
                  <td>Lada1</td>
                  <td>Tel&eacute;fono1</td>
                  <td>Ext.1</td>
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
