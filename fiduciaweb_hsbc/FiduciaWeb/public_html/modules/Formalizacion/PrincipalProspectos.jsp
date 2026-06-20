<FORM name="frmDatosProspectosConsulta" id="frmDatosProspectosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
<table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Prospectos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" class="texto" style="text-align:left" border="0">
          <tr>
            <td width="20%">&nbsp;</td>
            <td>Prospecto</td>
            <td>
              <input type="text" name="paramProspecto" id="paramProspecto" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td>Nombre</td>
            <td colspan="3">
              <input type="text" name="paramNombreProspecto" id="paramNombreProspecto" size="50" maxlength="50"  onblur="Mayusculas(this)"/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td>Tipo de Negocio</td>
            <td>
              <select size="1" name="paramTiposNegocioProspecto" id="paramTiposNegocioProspecto" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="paramStatus" param="clavesCombo36"/>
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;
            </td>
            <td width="10%">&nbsp;
            </td>
          </tr>
          <tr>
            <td width="20%">&nbsp;</td>
            <td>Estatus</td>
            <td>
              <select id="paramStatus" name="paramStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo161"/>
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="6" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td width="100%" colspan="6" align="center" valign="middle">
               <table width="224" cellpadding="0" cellspacing="0">
                    <tr>
                        <td width="112"  align="center" valign="middle">
                            <input type="BUTTON" id="cmdAceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="muestraProspectos" fun="loadTableElement" tabla="tablaRegistrosProspectos" onclick="consultar(this, GI('frmDatosProspectosConsulta'), false);"/>
                        </td>
                        <td width="112" align="center" valign="middle">
                            <input type="BUTTON" name="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="RF(GI('frmDatosProspectosConsulta'));"/>
                        </td>
                    </tr>
              </table>
            </td>
          </tr>
          <tr>
            <td colspan="6" align="center">&nbsp;</td>
          </tr>
          <tr>
          
            <td colspan="6" align="center">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoProspectos(1);"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoProspectos(2);"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value=" Cancelar " id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="cancelarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoProspectos(3);"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Reservar Fideicomiso" id="cmdCorreo" name="cmdCorreo" class="btn btn-primary" onclick="enviarCorreoOperaciones();"/></td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Envio Etapa Proyecto" id="cmdEnvio" name="cmdEnvio" class="btn btn-primary" onclick="enviarEtapaProyecto();"/></td>
                </tr>
            </table>
            </td>
          </tr>
          <tr>
            <td colspan="6" align="center">&nbsp;</td>
          </tr>
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosProspectos"  border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0"  dataInfo="tablaProspectosData" keys="prsNumProspecto,prsCveStatus,prsNumContrato,prsCisFid,prsNomProspecto,prsTipoNegocio,prsNumProducto,prsCveAreaInst,prsProCliSpe,prsProCliMan,prsFecProspecto" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>No.</td>
                  <td>Nombre</td>
                  <td>Tipo de Negocio</td>
                  <td>Fecha de Inicio</td>
                  <td>Fecha Const.</td>
                  <td>Contrato</td>
                  <td>Estatus</td>
                  <td>&nbsp;</td>
                  </tr>                  
                  </thead>
                   <tbody></tbody>
                  </table>
                </div>
              </td>
            </tr>  
          
            <tr>
                <td colspan="4" align="center">
                    <table id="tablaFiso" style="visibility:hidden;" class="texto" border=0 cellspacing="0" cellpadding="0" width="50%">
                        <tr>
                            <td>&nbsp;</td>
                            <td colspan=4 class="subtitulo">No. Fideicomiso<hr/></td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td width="10%">
                                <input type="BUTTON" id="cmdFiso" name="cmdFiso" value="Generar Fiso" class="btn btn-primary"  onclick="determinaFideicomiso();">
                            </td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td>Fideicomiso</td>
                            <td>
                                <input type="text" disabled name="txtNoFideicomiso" id="txtNoFideicomiso" tipo="Num" size="10" onblur="verificaNoExistaFideicomiso();"/>
                            </td>
                            <td colspan=3>&nbsp;</td>
                        </tr>
                        <tr>
                            <td colspan=6>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>
                                <input type="BUTTON" id="cmdAceptaFiso" name="cmdAceptaFiso" value="Aceptar" class="btn btn-primary"  onclick="botonFideicomiso('ACEPTAR');">
                            </td>
                            <td>
                                <input type="BUTTON" id="cmdCancelaFiso" name="cmdCancelaFiso" value="Cancelar" class="btn btn-danger"  onclick="botonFideicomiso('CANCELAR');">
                            </td>
                            <td>&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>		  
        </table>
      </td>
    </tr>
    
    <tr>
      <td width="60%" height="100%" align="center">
        <a id="linkReporte" href="#" style="visibility:hidden" target="_new">Archivo</a> 
        <a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
        <input type="hidden" id="refSP" name="refSP" value=""/>
        <input type="hidden" id="refQry" name="refQry" value="processID"/>
        <input type="hidden" id="paramurlReporte" name="paramurlReporte" value="/jsp/Reportes/Administracion/EnviarCorreoCIS.jsp"/>
        <input type="hidden" id="paramsendToJSP" name="paramsendToJSP" value="true"/>
        <input type="hidden" id="paramtakeParameters" name="paramtakeParameters" value="false"/>
        
      </td>
    </tr>             
    
</table>
</FORM>
