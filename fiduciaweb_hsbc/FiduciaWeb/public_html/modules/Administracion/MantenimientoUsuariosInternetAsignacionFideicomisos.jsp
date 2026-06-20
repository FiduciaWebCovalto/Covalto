<FORM name="frmMantenimientoUsuariosInternetAsignacionFideicomisos" id="frmMantenimientoUsuariosInternetAsignacionFideicomisos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;" class="texto">
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td align="center" height="100%" class="titulo">Puntos de Revision por Solicitud</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table id="tabs" cellpadding="0" cellspacing="0" border="0">
          <tr>
            <td class="tab_blanco_claro"><img src="imagenes/spacer.gif" width="37" height="1"/></td>
            <td class="tab_relleno_claro" onclick="cambiaTab(this, 'cargaMantenimientoUsuariosInternetPersonas(2)');">Datos Solicitud</td>
            <td class="tab_claro_azul"><img src="imagenes/spacer.gif" width="34" height="1"/></td>
            <td class="tab_relleno_azul" onclick="cambiaTab(this, 'cargaMantenimientoAsignacionFideicomisos()');">Asignacion Puntos Revision</td>
            <td class="tab_azul_blanco"><img src="imagenes/spacer.gif" width="35" height="1"/></td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table cellspacing="2" cellpadding="3" border="0" width="100%" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">Etapa</td>
            <td>
              <select size="1" name="paramEtapa" id="paramEtapa" ref="qry.seguridad.paramSolicitudes.ptosRevXSol.etapas" fun="loadComboElement" keyValue="fetaIdEtapa" theValue="fetaNombreEtapa" param="paramQueryEtapa" next="formsLoaded" />
            </td>
            <td width="40%">
              &nbsp;
            </td>
            <td>
            </td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%" nowrap>Punto de Revision</td>
            <td>
              <select size="1" name="paramPuntoRevision" id="paramPuntoRevision" ref="muestraDatosPuntosRevision" fun="loadComboElement" keyValue="fpurIdPuntorev" theValue="fpurDescripcion" next="formsLoaded"/>
            </td>
            <td width="40%">
              &nbsp;
            </td>
            <td>
            </td>
          </tr>          
          <tr>
            <td colspan="5">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              <input type="BUTTON" id="hdRegistrosAsignacion" name="hdRegistrosAsignacion" ref="muestraDatosAsignacionSolicitudesPtosRev" fun="loadTableElement" tabla="tablaRegistrosDatosUsuariosAsignacion" style="visibility:hidden"/>
              <input type="text" name="paramEjecutivoAtencion" id="paramEjecutivoAtencion" size="10" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="5" align="center">
              <input type="BUTTON" value="    Alta    " name="cmdAlta" class="btn btn-primary" onclick="validaAltaAsignacion();"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="    Baja    " name="cmdBajar" class="btn btn-primary" onclick="validaExistaAsignacionComite();"/>
            </td>
          </tr>
          <tr>
            <td colspan="5">
              <hr/>
            </td>
          </tr>
          <tr>
            <td colspan="5">
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                  <table id="tablaRegistrosDatosUsuariosAsignacion" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaDatosUsuariosAsignacionData" keys="ftopNumOper,fetaIdEtapa,fpurIdPuntorev" fun="clickTabla2" radioWidth="35">
                    <thead>
                        <tr align="left" class="cabeceras">
                          <td width="24" height="23">&nbsp;</td>
                          <td width="123" height="23">Num Operacion</td>
                          <td width="123" height="23">Etapa</td>
                          <td width="707" height="23">Punto de Revision</td>
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
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="   Cancelar   " name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalSeguridadUsuariosInternet();"/>
      </td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
