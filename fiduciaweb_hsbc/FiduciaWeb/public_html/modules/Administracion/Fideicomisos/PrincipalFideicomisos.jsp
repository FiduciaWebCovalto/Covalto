<FORM name="frmPrincipal" id="frmPrincipal" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
<table cellspacing="1" cellpadding="0" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Fideicomiso</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table class="texto" style="text-align:left" border="0" width="100%">
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="25%">Fideicomiso</td>
            <td width="25%">
              <input type="text" name="paramNumFideicomiso" id="paramNumFideicomiso" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>Apodo</td>
            <td>
              <input type="text" name="paramApodo" id="paramApodo" size="50" maxlength="100"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>CIS del Fideicomiso</td>
            <td>
              <input type="text" name="paramCIS" id="paramCIS" size="50" maxlength="100"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>Num. Anterior Legacy</td>
            <td>
              <input type="text" name="paramNumAnteriorLegacy" id="paramNumAnteriorLegacy" size="50" maxlength="100"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
                <td>&nbsp;</td>
                <td nowrap>Pendientes de Captura</td>
                <td>
                    <input type="checkbox" name="paramPendientes" id="paramPendientes" class="check" tv="1" fv="0"/>
                </td>
                <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>Estatus</td>
            <td>
              <select size="1" name="paramEstatus" id="paramEstatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="{'llaveClave':2000}"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="text" name="paramOrder" id="paramOrder" size="2" value="S" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td width="100%" colspan="4" align="center" valign="middle">
            <table cellpadding="0" cellspacing="0">
              <tr>
              <td align="center" valign="middle">
                <input type="button" name="cmdAceptar" id="Aceptar" value="Aceptar" class="btn btn-primary" ref="qry.admon.fideicomisos" fun="loadTableElement" tabla="tablaFideicomisos" onclick="consultar(this, GI('frmPrincipal'), false);">
              </td>
              <td align="center" valign="middle">
                <input type="button" name="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipal'));"/>              
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
                   <td align="center" valign="middle"> <input type="button" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargarPantallaMantenimiento(2)"/></td>
                   <td align="center" valign="middle"> <input type="button" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargarPantallaMantenimiento(3)"/></td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Riesgo" id="cmdRiesgo" name="cmdRiesgo"  class="btn btn-danger" onclick="determinaRiesgo()"/> </td>                   
                   <td width="112"  align="center" valign="middle"> <input type="button" value="Ver Docto" id="cmdDocumento" name="cmdDocumento" class="btn btn-info" onclick="validaDocumento();" /> </td>                   
                   
                </tr>
            </table>              
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width: 100%">
                  <table width="100%" id="tablaFideicomisos" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaFideicomisosData" keys="ctoNumContrato" fun="clickTabla" radioWidth="35" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                    <thead>
                        <tr class="cabeceras">
                          <td width="23" nowrap>&nbsp;</td>
                          <td width="50" nowrap>Fideicomiso</td>
                          <td width="300" nowrap>Apodo</td>
                          <td width="150" nowrap>Tipo de Negocio</td>
                          <td width="100" nowrap>Estatus</td>
                          <td width="100" nowrap>Riesgo</td>
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