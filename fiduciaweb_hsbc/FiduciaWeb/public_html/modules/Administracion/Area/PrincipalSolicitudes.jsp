<FORM name="frmMantenimientoCatalogoSubCuentas" id="frmMantenimientoCatalogoSubCuentas" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Catalogo de Areas de Solicitudes</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table class="texto" width="100%">
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap>No Solicitud</td>
              <td>
                <input type="text" name="paramFideicomiso" id="paramFideicomiso" tipo="Num" size="10" maxlength="10" />
                <input type="text" name="txtNomComite" id="txtNomComite" size="50" maxlength="100" />
              </td>
              <td>
              &nbsp;
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td nowrap>Area</td>
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
                  <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosSolicitudesArea" fun="loadTableElement" tabla="tablaRegistrosDatosSubCuentas" onclick="consultar(this, GI('frmMantenimientoCatalogoSubCuentas'), false);"/>
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
<td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Regresar " id="cmdRegresar" name="cmdRegresar" class="btn btn-primary" onclick="cargaPrincipalCatalogosGeneralEstructuraGeograficaPaises2();"/> </td>                   
                </tr>
            </table>              
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr align="center">
            <td colspan="4">
              <table cellspacing="0" cellpadding="0" border="0">
                <tr class="cabeceras">
                  <td width="23px">&nbsp;</td>
                  <td width="70px">No. Solicitud</td>
                  <td width="100px">Etapa</td>
                  <td width="270px">Nombre Area</td>
                  <td width="90px">Status</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:430px;">
                <table id="tablaRegistrosDatosSubCuentas" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaDatosSubCuentasData" keys="ftopNumOper,ftaIdArea,fetaIdEtapa" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                </table>
              </div>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</FORM>
