<FORM name="frmDatosHonorariosConsulta" id="frmDatosHonorariosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Honorarios</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
          <table width="100%" class="texto" style="text-align:left" border="0">
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="10%">No. Fideicomiso</td>
            <td>
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td width="10%">&nbsp;
            </td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="10%">No. Prospecto</td>
            <td>
              <input type="text" name="paramProspecto" id="paramProspecto" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td width="10%">&nbsp;
            </td>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td width="100%" colspan="4" align="center" valign="middle">
            <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" id="Aceptar" name="Aceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosHonorariosAnteproy" fun="loadTableElement" tabla="tablaRegistrosHonorarios" onclick="consultar(this, GI('frmDatosHonorariosConsulta'), false);">
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" name="cmdLimpiar" class="btn btn-warning"  onclick="RF(GI('frmDatosHonorariosConsulta'));"/>                
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
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoHonorarios(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoHonorarios(2)"/> </td>
                   <!--td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td-->
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoHonorarios(3)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Correo Hon y Fis" id="cmdEnviarCorreo" name="cmdEnviarCorreo" class="boton_right" onclick="enviarCorreo()"/> </td>
                  </td>
                </tr>
                </table>  
              
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" height="37" align="center">
              <table cellspacing="0" cellpadding="0" border="0" align="center" class="texto">
                <tr class="cabeceras">
                  <td width="23">&nbsp;</td>
                  <td width="80">No. Prospecto</td>
                  <td width="80">No. Fideicomiso</td>
                  <td width="300">Nombre</td>
                  <td width="200">Tipo de Negocio</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:700px;">
              <table id="tablaRegistrosHonorarios" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaHonorariosData" keys="ahoAnteproyecto" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
              </table>
              </div>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  <tr align="center">
    <td height="100%">&nbsp;</td>
  </tr>
  </table>
</FORM>
