<FORM name="frmMantenimientoCatalogoSubCuentas" id="frmMantenimientoCatalogoSubCuentas" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Catalogo de Puntos de Revision</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table class="texto" width="100%">
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap>No Punto Revision</td>
              <td>
                <input type="text" name="paramFideicomiso" id="paramFideicomiso" tipo="Num" size="10" maxlength="10" />
              </td>
              <td>
              &nbsp;
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td nowrap>Descripcion</td>
              <td colspan="2">
              <input type="text" name="paramDescripcion" id="paramDescripcion" size="50" maxlength="50" />
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="5" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>           
          <tr>
            <td colspan="4" align="center">
            <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosPuntosRevision" fun="loadTableElement" tabla="tablaRegistrosDatosSubCuentas" onclick="consultar(this, GI('frmMantenimientoCatalogoSubCuentas'), false);"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmMantenimientoCatalogoSubCuentas'));"/>
                </td>
                </tr>
            </table> 
              
              
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
            <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoSubCuentas(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoSubCuentas(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoSubCuentas(3)"/> </td>                   
                </tr>
            </table>              
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosDatosSubCuentas" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaDatosSubCuentasData" keys="fpurIdPuntorev" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>No. Punto Revision</td>
                  <td>Descripcion</td>
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
