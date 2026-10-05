<form name="frmDatosOperaciones" id="frmDatosOperaciones" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Cat&aacute;logo de Operaciones</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="10%">No.</td>
            <td>
              <input type="text" name="paramNumero" id="paramNumero" size="15" maxlength="15" tipo="Num"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="10%">Nombre</td>
            <td>
              <input type="text" name="paramNombre" id="paramNombre" size="50" maxlength="50" tipo="AlphaNumeric"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="10%">Operaci&oacute;n</td>
            <td>
              <select size="1" name="cmbOperacion" id="cmbOperacion" ref="cves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" param="cmbOperacionParam" next="formsLoaded" onchange="cmbAtxt(this,GI('paramOperacion'))"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              <input type="text" name="paramOperacionLineas" id="paramOperacionLineas" size="2" value="" style="visibility:hidden"/>
              <input type="text" name="paramOperacionDepositos" id="paramOperacionDepositos" size="2" value="" style="visibility:hidden"/>
              <input type="text" name="paramOperacion" id="paramOperacion" size="2" value="" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="4">&nbsp;
              <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="conPriOpe" fun="loadTableElement" tabla="tblRegPriOpe" onclick="previoConsultar(this);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" value="Limpiar" name="cmdLimpiar" id="cmdLimpiar" class="btn btn-primary" onclick="limpiar(frmDatosOperaciones);"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="4">
              <input type="button" value="   Alta  " name="cmdAlta" id="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoOperaciones(1);"/>
              <input type="button" value="Modificar" name="cmdModificar" id="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoOperaciones(2);"/>
              <input type="button" value="   Baja  " name="cmdBaja" id="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoOperaciones(3);"/>
              <input type="button" value="Modifica Estructura" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoOperaciones(4);"/>
              <input type="button" name="cmdExportarExcel" id="cmdExportarExcel" value="Exportar Excel" class="btn btn-primary" onclick="doDownload();"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" class="subtitulo" align="center">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPriOpe"  border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0"  dataInfo="arrTblOpeDat" keys="opeNumOperacion" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                <td>&nbsp;</td>
                  <td>No.</td>
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
</form>
<div style="visibility:hidden;">
    <form id="frmExport" method="POST" action="DatosFiduciarios.xls" target="iframeDownload">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
        <input type="hidden" id="jsonExport" name="json" value="" />
        <input type="hidden" name="headers" value="Nombre,No,Status" />
    </form>
    <iframe name="iframeDownload" src=""></iframe>
</div>