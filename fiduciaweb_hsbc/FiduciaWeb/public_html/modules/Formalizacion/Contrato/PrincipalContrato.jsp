<FORM name="frmProspectosAnteproyectoConsulta" id="frmProspectosAnteproyectoConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
<table cellspacing="1" cellpadding="0" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Contrato</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" class="texto" style="text-align:left" border="0">
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="20%">No. Fideicomiso</td>
            <td width="20%">
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>No. Prospecto</td>
            <td>
              <input type="text" name="paramAnteproyecto" id="paramAnteproyecto" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
                <input type="text" name="paramorder" id="paramOrder" size="2" value="s" style="visibility:hidden"/>
                <input type="text" name="paramAutorizadoMCF" id="paramAutorizadoMCF" value="1" size="1" style="visibility:hidden"/>
                <input type="text" name="paramStatus" id="paramStatus" value="ACTIVO" size="1" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td width="100%" colspan="4" align="center" valign="middle">
            <table width="224" cellpadding="0" cellspacing="0">
              <tr>
              <td width="112"  align="center" valign="middle">
                <input type="BUTTON" id="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosAnteproyecto" fun="loadTableElement" tabla="tablaProspectosAnteproyecto" onclick="consultar(this, GI('frmProspectosAnteproyectoConsulta'), false);">
                </td>
                <td width="112" align="center" valign="middle">
                <input type="BUTTON" value="Limpiar" name="cmdLimpiar" class="btn btn-warning"  onclick="RF(GI('frmProspectosAnteproyectoConsulta'));"/>              
              </td>
              </tr>
            </table>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
            <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoProspectosAnteproyectoCaracteristicasTab(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value=" Cancelar " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoProspectosAnteproyectoCaracteristicasTab(3)"/> </td>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Correo Ops Act Fiso HOGAN" id="cmdEnviarCorreo" name="cmdEnviarCorreo" class="btn btn-info" onclick="enviarCorreoOperaciones();"/> </td>
                  </td>
                </tr>
            </table>              
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width: 100%">
                <table id="tablaProspectosAnteproyecto" border="0" cellspacing="0" 
                cellpadding="0" width="100%" dataInfo="tablaProspectosAnteproyectoData" 
                keys="antNumProspecto,prsCveStatus" fun="clickTabla" radioWidth="35" 
                NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                    <thead>
                        <tr class="cabeceras">
                          <td width="23" nowrap>&nbsp;</td>
                          <td width="100" nowrap>No. Prospecto</td>
                          <td width="100" nowrap>No. Fideicomiso</td>
                          <td width="300" nowrap>Nombre</td>
                          <td width="200" nowrap>Tipo de Negocio</td>
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