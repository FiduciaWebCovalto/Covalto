<form name="frmDatosCatalogoGuias" id="frmDatosCatalogoGuias" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Cat&aacute;logo de Conceptos Contables</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table border="0" width="100%" class="texto">
          <tr>
            <td width="20%">&nbsp;</td>
            <td width="10%">No.</td>
            <td>
              <input type="text" name="paramNumGuia" id="paramNumGuia" size="10" maxlength="10" tipo="Num"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td width="10%">Nombre</td>
            <td>
              <input type="text" name="paramNomGuia" id="paramNomGuia" size="65" maxlength="100" tipo="AlphaNumeric"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td width="10%">Status</td>
            <td>
              <select size="1" name="paramCveStGuiano" id="paramCveStGuiano" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbStatusParam" next="formsLoaded"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td align="center" valign="middle" colspan="4">
              <input type="button" value="Aceptar" name="cmdAceptar" class="btn btn-primary" ref="conPriCatGui" fun="loadTableElement" tabla="tblRegPriCatGui" onclick="consultarCount(this, frmDatosCatalogoGuias, false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" value="Limpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosCatalogoGuias);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="4">
              <input type="button" value="   Alta  " name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCatalogoGuias(1);"/>
              <input type="button" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoCatalogoGuias(2);"/>
              <input type="button" value="  Baja   " name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoCatalogoGuias(3);"/>
              <input type="button" value="Modifica Estructura" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoCatalogoGuias(4);"/>
              <input type="button" name="cmdExportarExcel" id="cmdExportarExcel" value="Exportar Excel" class="btn btn-primary" onclick="doDownload();"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPriCatGui" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="arrTblCatGuiDat" keys="gunNumGuia" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
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
        <input type="hidden" name="headers" value="Nombre,Status,No" />
    </form>
    <iframe name="iframeDownload" src=""></iframe>
</div>