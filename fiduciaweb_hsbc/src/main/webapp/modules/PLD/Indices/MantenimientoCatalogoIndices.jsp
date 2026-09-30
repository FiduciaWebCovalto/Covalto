<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <table width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento a Cat&aacute;logo de &Iacute;ndices</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="13%" nowrap>No. &Iacute;ndice</td>
            <td>
              <input type="text" name="ecinIdIndice" id="ecinIdIndice" size="10" tipo="Num" maxlength="10" required message="El No. �ndice es un campo obligatorio"/>
              <input type="text" name="paramNumIndice" id="paramNumIndice" size="10" style="visibility:hidden"/>
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="13%" nowrap>Descripci&oacute;n</td>
            <td>
              <input type="text" name="ecinDescripcion" id="ecinDescripcion" size="50" maxlength="50" required message="La Descripci�n es un campo obligatorio"/>
            </td>
            <td align="center" width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="13%" nowrap>Forma de Empleo</td>
            <td>
              <input type="text" name="ecinFormaEmp" id="ecinFormaEmp" size="50" maxlength="70" required message="La Forma de Empleo es un campo obligatorio"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="13%" nowrap>Status</td>
            <td>
              <select size="1" name="ecinStCatindic" id="ecinStCatindic" ref="conETDatInd" fun="loadComboElement" keyValue="eindDescripcion" theValue="eindDescripcion" param="cmbStatusParam" next="asignaValues2ObjHTML" required message="El Status es un campo obligatorio"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="4">
              <input type="BUTTON" value="Aceptar " name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" onclick="ejecutaOperacionIndice();" style="visibility:hidden"/>
              <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="onButtonClickPestania('PLD.Indices.PrincipalCatalogoIndices','')" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">
              <hr/>
            </td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="4">
              <input type="BUTTON" value="   Alta  " name="cmdAlta" id="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoEstructuraIndices(1);" style="visibility:hidden"/>
              <input type="BUTTON" value="Modificar" name="cmdModificar" id="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoEstructuraIndices(2);" style="visibility:hidden"/>
              <input type="BUTTON" value="  Baja   " name="cmdBaja" id="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoEstructuraIndices(3);" style="visibility:hidden"/>
              <input type="button" value="Consultar" name="cmdConsultar" id="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoEstructuraIndices(4);" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" class="subtitulo" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" class="subtitulo" align="center">Estructura &Iacute;ndices</td>
          </tr>
          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblReg" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="arrTblDat2" keys="eindIdIndice,eindIdSubindice" fun="clickTabla2" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>Indice</td>
                  <td>Sec.</td>
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
</FORM>
