<form name="frmDatos" id="frmDatos" onsubmit="">
  <table width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Cat&aacute;logo de &Iacute;ndices</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">No. &Iacute;ndice</td>
            <td>
              <input type="text" name="paramNo" id="paramNo" size="10" maxlength="10" tipo="Num"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">Descripci&oacute;n</td>
            <td>
              <select size="1" name="paramDescripcion" id="paramDescripcion" ref="conETIdIndDesCatInd" fun="loadComboElement" keyValue="ecinDescripcion" theValue="ecinDescripcion" next="paramStatus"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">Status</td>
            <td>
              <select size="1" name="paramStatus" id="paramStatus" ref="conETDatInd" fun="loadComboElement" keyValue="eindDescripcion" theValue="eindDescripcion" param="cmbStatusParam" next="formsLoaded"/>
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
              <input type="button" value="Aceptar" name="cmdAceptar" class="btn btn-primary" ref="conETPriCatInd" fun="loadTableElement" tabla="tblReg" onclick="consultar(this, frmDatos, false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" value="Limpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatos);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="4">
              <input type="button" value="   Alta  " name="cmdAlta" id="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCatalogoIndices(1);"/>
              <input type="button" value="Modificar" name="cmdModificar" id="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoCatalogoIndices(2);"/>
              <input type="button" value="  Baja   " name="cmdBaja" id="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoCatalogoIndices(3);"/>
              <input type="button" value="Consultar" name="cmdConsultar" id="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoCatalogoIndices(4);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>

            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblReg" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="arrTblDat" keys="ecinIdIndice" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Indice</td>
                  <td>Descripci&oacute;n</td>
                  <td>Forma de Empleo</td>
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
