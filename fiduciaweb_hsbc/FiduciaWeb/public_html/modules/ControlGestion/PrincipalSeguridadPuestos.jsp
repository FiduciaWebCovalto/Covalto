<FORM name="frmPrincipalSeguridadPuestos" id="frmPrincipalSeguridadPuestos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Perfiles Seguridad y Acceso</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table align="center" class="texto" width="100%">
            <tr valign="middle">
              <td width="30%">&nbsp;</td>
              <td>Perfil</td>
              <td>
                <input type="text" name="paramPuesto" id="paramPuesto" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td>Nombre</td>
              <td>
                <input type="text" name="paramNombre" id="paramNombre" tipo="AlphaNumeric" size="50" maxlength="50"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center">&nbsp;
                <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosPuestosPerfil" fun="loadTableElement" tabla="tablaRegistrosPuestos" onclick="consultar(this, GI('frmPrincipalSeguridadPuestos'), false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalSeguridadPuestos'));"/>
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center">
                <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoSeguridadPuestos(1);"/>
                <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoSeguridadPuestos(2);"/>
                <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/>
                <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoSeguridadPuestos(3);"/>
                <input type="BUTTON" value="Funciones por Perfil" id="cmdFuncionesPorPerfil" name="cmdFuncionesPorPerfil" class="btn btn-primary" onclick="cargaPrincipalSeguridadFuncionesXPuesto();"/>
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center">&nbsp;</td>
            </tr>

            
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosPuestos" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaPuestosData" keys="fperIdPerfil" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>&nbsp;</td>
                    <td>Perfil</td>
                    <td>Nombre</td>              
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
