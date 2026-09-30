<FORM name="frmProspectosAnteproyectoConsulta" id="frmProspectosAnteproyectoConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
<table cellspacing="1" cellpadding="0" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Proyecto</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto" style="text-align:left" border="0">
          <tr>
            <td width="20%">&nbsp;</td>
            <td width="20%">No. Prospecto</td>
            <td width="20%">
              <input type="text" name="paramAnteproyecto" id="paramAnteproyecto" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>Nombre</td>
            <td>
              <input type="text" name="paramNombre" id="paramNombre" size="50" maxlength="100" onblur="ConvierteMayus(this)"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>Estatus</td>
            <td>
              <select size="1" name="paramStatus" id="paramStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo161"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center" valign="middle">
            <table cellpadding="0" cellspacing="0">
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
                   <!--td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoProspectosAnteproyectoGenerales(1)"/> </td-->
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoProspectosAnteproyectoGenerales(2)"/> </td>
                   <!--td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td-->
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value=" Cancelar " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoProspectosAnteproyectoGenerales(3)"/> </td>                  
                   <!--td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Asignar Fideicomiso" id="cmdAsignar" name="cmdAsignar" class="boton_middle" onclick="asignarFideicomiso();"/> </td-->
                  <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Riesgo" id="cmdRiesgo" name="cmdRiesgo"  class="btn btn-danger" onclick="determinaRiesgo()"/> </td>

                </tr>
            </table>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width:100%">                
                  <table id="tablaProspectosAnteproyecto" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaProspectosAnteproyectoData" keys="antNumProspecto,prsCveStatus" fun="clickTabla" radioWidth="35" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                    <thead>
                        <tr class="cabeceras">
                          <td width="23" nowrap>&nbsp;</td>
                          <td width="70" nowrap>No.</td>
                          <td width="300" nowrap>Nombre o Razon S&oacute;cial</td>
                          <td width="150" nowrap>Promotor Fiduciario</td>
                          <td width="150" nowrap>Fecha Inicio Negociaci&oacute;n</td>
                          <td width="150" nowrap>Estatus</td>
                          <td width="150" nowrap>Riesgo</td>
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