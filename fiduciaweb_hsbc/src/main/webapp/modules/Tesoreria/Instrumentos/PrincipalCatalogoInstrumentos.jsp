<form name="frmDatosInstrumentos" id="frmDatosInstrumentos">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Cat&aacute;logo de Instrumentos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto">
          <tr valign="middle">
            <td width="20%">&nbsp;</td>
            <td width="10%">Mercado</td>
            <td width="25%">
              <select name="paramMercado" id="paramMercado" ref="cves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" param="cmbMercadoParam" next="paramClasificacion"/>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td width="10%">Clasificaci&oacute;n</td>
            <td width="25%">
              <select name="paramClasificacion" id="paramClasificacion" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbClasificacionParam" next="paramStatus"/>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td width="10%">No. Instr.</td>
            <td width="25%">
              <input type="text" name="paramNumeroInstrumento" id="paramNumeroInstrumento" tipo="Num"/>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" valign="middle" height="22">&nbsp;</td>
            <td width="10%">Nombre</td>
            <td valign="middle" height="22">
              <input type="text" name="paramNombre" id="paramNombre" size="50" tipo="AlphaNumeric"/>
            </td>
            <td align="center" valign="middle" height="22">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" valign="middle" height="22">&nbsp;</td>
            <td width="10%">Mnem&oacute;nico</td>
            <td valign="middle" height="22">
              <input type="text" name="paramMnemo" id="paramMnemo" size="20" tipo="AlphaNumeric"/>
            </td>
            <td align="center" valign="middle" height="22">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" valign="middle">&nbsp;</td>
            <td width="10%">Status</td>
            <td valign="middle" width="25%">
              <select id="paramStatus" name="paramStatus" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbStatusParam" next="formsLoaded"/>
            </td>
            <td align="center" valign="middle">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" valign="middle" colspan="4">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center" valign="middle" width="25%">&nbsp;
              <input type="button" name="cmdAceptar" id="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="conPriIns" fun="loadTableElement" tabla="tblRegPriIns" onclick="consultar(this, GI('frmDatosInstrumentos'), false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" name="CmdLimpiar" id="CmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="limpiar(frmDatosInstrumentos);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center" valign="middle" width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center" valign="middle" width="25%">
              <input type="button" value="   Alta   " name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoInstrumentos(1)"/>
              <input type="button" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoInstrumentos(2)"/>
              <input type="button" value="   Baja   " name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoInstrumentos(3);"/>
              <input type="button" value="Consultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoInstrumentos(4)"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center" valign="middle" width="25%">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPriIns"  border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0"  dataInfo="arrTblInsDat" keys="insCveTipoMerca,insNumInstrume" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Mercado</td>
                  <td>Instrumento</td>
                  <td>Nombre</td>
                  <td>Abreviatura</td>
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
