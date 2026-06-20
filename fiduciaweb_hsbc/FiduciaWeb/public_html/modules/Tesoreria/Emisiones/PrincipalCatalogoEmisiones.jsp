<form name="frmDatosEmisiones" id="frmDatosEmisiones">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Cat&aacute;logo de Emisiones</td>
    </tr>
    <tr>
      <td align="center" height="100%" class="titulo">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto">
          <tr>
            <td width="15%">&nbsp;</td>
            <td width="10%">Mercado</td>
            <td>
              <select id="paramMercado" name="paramMercado" ref="cves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" param="cmbMercadoParam" next="paramStatus" onchange="cmbInstrumentoParam.tipoMercado = this.value; loadElement(GI('paramInstrumento'));"/>
            </td>
            <td width="10%">Emisora</td>
            <td>
              <input type="text" id="paramEmisora" name="paramEmisora" tipo="AlphaNumeric" maxlength="10" size="10"/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td width="10%">Instrumento</td>
            <td>
              <select size="1" name="paramInstrumento" id="paramInstrumento" ref="conIns" fun="loadComboElement" keyValue="insNumInstrume" theValue="insNomInstrume" param="cmbInstrumentoParam" next="formsLoaded">
                <option value="-1">-- Seleccione --</option>
              </select>
                
            </td>
            <td width="10%">Serie</td>
            <td>
              <input type="text" id="paramSerie" name="paramSerie" tipo="AlphaNumeric" maxlength="7" size="10"/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td width="10%">Secuencial</td>
            <td>
              <input type="text" maxlength="10" size="10" name="paramSec" id="paramSec" tipo="Num"/>
            </td>
            <td width="10%">Cup&oacute;n</td>
            <td>
              <input type="text" id="paramCupon" name="paramCupon" tipo="Num" maxlength="10" size="10"/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" width="15%">&nbsp;</td>
            <td width="10%">Status</td>
            <td>
              <select id="paramStatus" name="paramStatus" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbStatusParam" next="formsLoaded"/>
            </td>
            <td width="10%">&nbsp;</td>
            <td>&nbsp;</td>
            <td align="center" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" width="10%" colspan="6">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="6" align="center" width="15%">&nbsp;
              <input type="BUTTON" name="cmdAceptar" id="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="conPriEmi" fun="loadTableElement" tabla="tblRegPriEmi" onclick="consultar(this, GI('frmDatosEmisiones'), false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" name="cmdLimpiar" id="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="limpiar(frmDatosEmisiones);"/>
            </td>
          </tr>
          <tr>
            <td colspan="6" align="center" width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="6" align="center" width="25%">
              <input type="BUTTON" value="   Alta   " name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoEmisiones(1)"/>
              <input type="BUTTON" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoEmisiones(2)"/>
              <input type="BUTTON" value="   Baja   " name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoEmisiones(3);"/>
              <input type="BUTTON" value="Consultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoEmisiones(4)"/>
            </td>
          </tr>
          <tr>
            <td colspan="6" align="center" width="25%">&nbsp;</td>
          </tr>
          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPriEmi"  border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0"  dataInfo="arrTblEmiDat" keys="emiNumSecEmis,emiCveTipoMerca,emiNumInstrume,emiNomPizarra,emiNumSerEmis,emiNumCuponVig" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Mercado</td>
                  <td>Instrumento</td>
                  <td>Sec. Emis.</td>
                  <td>Emisora</td>
                  <td>Serie</td>
                  <td>Cup&oacute;n</td>
                  <td>Status</td>                  </tr>                  
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
