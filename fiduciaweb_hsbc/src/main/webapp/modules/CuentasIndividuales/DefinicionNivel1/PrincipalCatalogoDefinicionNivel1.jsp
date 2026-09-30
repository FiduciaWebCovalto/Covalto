<FORM name="frmDatos" id="frmDatos">
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo"><div id="dvNivel">Titulo&nbsp;</div></td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto">
          <tr>
            <td width="15%">&nbsp;</td>
            <td width="5%" nowrap>
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" maxlength="10" tipo="Num" value="<%=session.getAttribute("fideicomisoCtasInd")!=null?session.getAttribute("fideicomisoCtasInd").toString():"0"%>"/>
            </td>
            <td colspan="5" width="60%">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomisoCtasIndiv" param="divNombreFideicomisoParam" next="divReedireccion">&nbsp;</div>
            </td>
            <td nowrap width="15%" colspan="4">
              <div id="divReedireccion" class="textoNegrita" ref ="refer" fun="reedireccionar();" next="datLongitudMaxima">&nbsp;</div>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td width="5%" nowrap>Clave</td>
            <td colspan="5">
              <input type="text" name="paramClave" id="paramClave" size="10" maxlength="30" tipo="AlphaNumeric"/>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td width="5%" nowrap>Nombre</td>
            <td colspan="5">
              <input type="text" name="paramNombre" id="paramNombre" size="60" maxlength="100" tipo="AlphaNumeric"/>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="8" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              <input type="text" name="paramNivel" id="paramNivel" size="2" value="1" style="visibility:hidden"/>
              <input type="text" name="datLongitudMaxima" id="datLongitudMaxima" size="1" style="visibility:hidden" ref="conLonMaxLonNivFid" fun="loadTxtElementX" theValue="longitudMaxima" param="divNombreFideicomisoParam" next="formsLoaded"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="8">&nbsp;
              <input type="button" name="cmdAceptar" id="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="conPriCatNiv" fun="loadTableElement" tabla="tblRegPri" onclick="consultar(this,GI('frmDatos'),false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" name="cmdLimpiar" id="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="limpiar(frmDatos);"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="8">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="8">
              <input type="button" value="   Alta   " name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCatalogoDefinicionNivel1(1)"/>
              <input type="button" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoCatalogoDefinicionNivel1(2)"/>
              <input type="button" value="   Baja   " name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoCatalogoDefinicionNivel1(3);"/>
              <input type="button" value="Consultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoCatalogoDefinicionNivel1(4)"/>
              <input type="BUTTON" value="Regresar" name="cmdRegresar" id="cmdRegresar" class="btn btn-danger" onclick="regresarCtasIndiv();"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="8" valign="middle">&nbsp;</td>
          </tr>
          
          <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPri" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tblRegDat" keys="datContrato,datClave" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Clave</td>
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
