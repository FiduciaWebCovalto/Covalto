<form name="frmDatosTransacciones" id="frmDatosTransacciones" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Cat&aacute;logo de Transacciones</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" class="texto">
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
              <input type="text" name="paramNombre" id="paramNombre" size="70" tipo="AlphaNumeric" maxlength="70"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="10%">Gu&iacute;a</td>
            <td>
              <input type="text" name="paramGuia" id="paramGuia" size="10" maxlength="10" tipo="Num"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="10%">Status</td>
            <td>
              <select size="1" name="paramStatus" id="paramStatus" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbStatusParam" next="formsLoaded"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="4">&nbsp;
              <input type="BUTTON" value="Aceptar" name="cmdAceptar" class="btn btn-primary" ref="conPriTra" fun="loadTableElement" tabla="tblRegPriTra" onclick="consultarCount(this, frmDatosTransacciones, false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" name="cmdLimpiar" class="btn btn-warning"  onclick="limpiar(frmDatosTransacciones);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" class="subtitulo" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" colspan="4" align="center">
              <input type="button" value="   Alta  " name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoTransacciones(1);"/>
              <input type="button" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoTransacciones(2);"/>
              <input type="button" value="   Baja  " name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoTransacciones(3);"/>
              <input type="button" value="Consultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoTransacciones(4);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" class="subtitulo" align="center">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPriTra" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="arrTblTraDat" keys="trsNumModulo,trsNumTransac" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>No.</td>
                  <td>Nombre</td>
                  <td>No. Gu&iacute;a</td>
                  <td>Acumula Saldos</td>
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
