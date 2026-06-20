<FORM name="frmDatosPrincipalAgenda" id="frmDatosPrincipalAgenda" onsubmit=" ">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="0" cellpadding="0" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Agenda de Eventos</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto"> 
           <tr valign="middle">
              <td width="35%">&nbsp;</td>
              <td nowrap>Usuario</td>
              <td>
                <select size="1" name="paramnumUsu" id="paramnumUsu" ref="muestraUsuariosActivos" fun="loadComboElement" keyValue="perNumUsuario" theValue="perNomUsuario" param="statusUsuActivo" next="paramStatus" style="width:120;"/>
              </td>       
                <td width="45%" align=left>
                <input type="checkbox" id="edito" name="edito" onclick="if(this.checked){GI('paramnumUsu').name ='paramusuMod';GI('paramnumUsu').id ='paramusuMod';}else{GI('paramusuMod').name ='paramnumUsu';GI('paramusuMod').id ='paramnumUsu';}" style="position:absolute;visibility:hidden;"/><!--&nbsp;Ultima Modificaci�n-->
              </td>
            </tr>
            
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap>Fecha Inicial</td>
              <td>
                 <input type="hidden" id="paramAtrasado" maxlength="10" size="10" name="paramAtrasado" style="position:absolute;"/>
                 <input type="text" id="paramfecEvento" maxlength="10" size="10" name="paramfecEvento" tipo="Fecha" onclick="GI('botonLista').click();GI('skinhelper-Normal').rel = 'stylesheet'; GI('skinhelper-Minis').rel = '';GI('incluir_personalizados').value=0;consultaFeriados();"/>
              </td>              
              <td width="25%"><input type="checkbox" id="siUnAno" name="siUnAno" onclick="if(this.checked){SA(GI('cmdAceptar'),'ref','qryConsultaAgendaUnAno')}else{SA(GI('cmdAceptar'),'ref','qryConsultaAgenda')}" style="position:absolute;visibility:hidden;"/><!--&nbsp;Completar A�o--></td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap>Fecha Final</td>
              <td>
                 <input type="text" id="paramfecFinEvento" maxlength="10" size="10" name="paramfecFinEvento" tipo="Fecha" onclick="consultaFeriados();"/>
              </td>              
              <td width="25%">&nbsp;</td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap>Fideicomiso</td>
              <td>
                <input type="text" name="paramFideicomiso" id="paramFideicomiso" tipo="Num" size="10" maxlength="10" onblur="consultaNombreFideicomiso('nomFideicomiso',this);" message="El Fideicomiso es un campo obligatorio" style="width:120;"/>
                
              </td>
              <td width="25%"><div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
              </td>
            </tr>
            <tr valign="middle" style="width:120;position:absolute;visibility:hidden">
              <td width="25%">&nbsp;</td>
              <td nowrap>No. Folio</td>
              <td>
                <input type="text" name="paramidFolio" id="paramidFolio" tipo="Num" size="10" maxlength="10" style="width:120;position:absolute;visibility:hidden"/>
              </td>              
              <td width="25%">&nbsp;</td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap>Estatus</td>
              <td>
                <select size="1" name="paramStatus" id="paramStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo7" next="formsLoaded" style="width:120;"/>
              </td>              
              <td width="25%">&nbsp;</td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap colspan=2>
                <input type="checkbox" name="paramchkQryProy" id="paramchkQryProy" class="check"/>
                &nbsp;Consultar Proyecciones?</td>
              </td>              
              <td width="25%">&nbsp;</td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td  colspan="5" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
              <tr>
              <td width="112"  align="center" valign="middle">
                <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="qryConsultaAgenda" fun="loadTableElement" tabla="tablaConsultaAgenda" onclick="consultaAgenda(this);"></td>
                <td width="112" align="center" valign="middle">
                <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosPrincipalAgenda);"/>            
              
              </td>
              </tr>
              </table>
              </td>
            </tr>

              <td width="100%" colspan="5" align="center" valign="middle">
                <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              </td>
            </tr>
            <input type="hidden" id="incluir_personalizados" value="0">
            <tr>  
              <td colspan="5" align="center" valign="middle">
                <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoAgenda(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoAgenda(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoAgenda(3)"/> </td>
                  </td>
                </tr>
                </table>
              </td>
            </tr> 
            <tr align="center">            
              <td colspan="5">
              <div id="div_resultados" align="center">
              
                <br><div class="subtitulo">Eventos<hr width="80%"></div>

                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaConsultaAgenda"  border="0" cellspacing="0" class="texto" 
                  style="width:100%;"   width=513px  cellpadding="0"  
                  dataInfo="tablaAgendaData" 
                  keys="eageIdFolio,eageFolioPadre,eageNumEventos,eagePeriodicidad,eageFecEvento"
                  fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>&nbsp;</td>
                    <td>Folio</td>
                    <td>Fideicomiso</td>
                    <td>Fecha Inicio</td>
                    <td>Fecha Fin</td>
                    <td>Descripcion</td>
                    <td>Periodicidad</td>
                    <td>Eventos</td>                    
                    <td>Estatus</td>  
                  </tr>                  
                  </thead>
                   <tbody></tbody>
                  </table>
                </div>              
                
               <br><div class="subtitulo">Proyecciones<hr width="80%"></div>
               
               <input style="position:absolute;visibility:hidden;" type="BUTTON" value="Aceptar2" id="cmdAceptar2" name="cmdAceptar2" class="btn btn-primary"  ref="qryConsultaAgendaProyecciones" fun="loadTableElement" tabla="tablaConsultaProyecciones" onclick="consultar(this, GI('frmDatosPrincipalAgenda'), false);"></td>
               <input style="position:absolute;visibility:hidden;" type="text" name="paramFolioOrigen" id="paramFolioOrigen" tipo="Num" size="10" maxlength="10"/>
               
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaConsultaProyecciones"  border="0" cellspacing="0" class="texto" 
                  style="width:100%;"   width=513px  cellpadding="0"  
                  dataInfo="tablaAgendaProyecciones" 
                  keys="eageIdFolio,eageFecEvento"
                  fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>&nbsp;</td>
                    <td>Folio</td>
                    <td>Fideicomiso</td>
                    <td>Fecha Inicio</td>
                    <td>Fecha Fin</td>
                    <td>Descripcion</td>
                    <td>Periodicidad</td>
                    <td>Eventos</td>                    
                    <td>Estatus</td>  
                  </tr>                  
                  </thead>
                   <tbody></tbody>
                  </table>
                </div>                              
                
            </div>
                <div id="mosaico_calendarios" style="visibility:hidden;position:absolute;top:250px;left:0px;height:400px; overflow:auto; width:850px;z-index:2;">
                  <table>
                    <tr>
                      <td style="color: #070 !important; font-weight: bold; font-size:11px">eventos activos</td><td width="23px">&nbsp;</td>
                      <td style="color: #f00 !important; font-weight: bold; font-size:11px">eventos pendientes</td><td width="23px">&nbsp;</td>
                      <td style="color: #004 !important; font-weight: bold; font-size:11px">eventos atendidos</td><td width="23px">&nbsp;</td>
                      <td style="color: #00f !important; font-weight: bold; font-size:11px">fecha actual</td><td width="23px">&nbsp;</td>
                      <td style="color: #830 !important; font-weight: bold; font-size:11px">dia feriado</td><td width="23px">&nbsp;</td>
                    </tr>                  
                  </table>
                  <table align="center" cellpadding="0" cellspacing="0">                 
                  <tr>
                    <td><div id="calendar1"></div></td><td width="60"></td>
                    <td><div id="calendar2"></div></td><td width="60"></td>
                    <td><div id="calendar3"></div></td><td width="60"></td>
                    <td><div id="calendar4"></div></td><td width="60"></td>
                    <td><div id="calendar5"></div></td><td width="60"></td>
                    <td><div id="calendar6"></div></td><td width="60"></td>
                  </tr>
                  <tr>
                    <td colspan="12" height="50"></td>                    
                  </tr>
                  <tr>
                    <td><div id="calendar7"></div></td><td width="60"></td>
                    <td><div id="calendar8"></div></td><td width="60"></td>
                    <td><div id="calendar9"></div></td><td width="60"></td>
                    <td><div id="calendar10"></div></td><td width="60"></td>
                    <td><div id="calendar11"></div></td><td width="60"></td>
                    <td><div id="calendar12"></div></td><td width="60"></td>
                  </tr>                    
                  
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
                  <td width="60%" height="100%" align="center">
                    <a id="linkReporte" href="#" style="visibility:hidden" target="_new">Archivo</a> 
                    <a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
                    <input type="hidden" id="refSP" name="refSP" value=""/>
                    <input type="hidden" id="refQry" name="refQry" value="muestraTextosAgenda"/>
                    <input type="hidden" id="paramurlReporte" name="paramurlReporte" value="/jsp/Reportes/Administracion/EnviarCorreoAgenda.jsp"/>
                    <input type="hidden" id="paramsendToJSP" name="paramsendToJSP" value="true"/>
                    <input type="hidden" id="paramtakeParameters" name="paramtakeParameters" value="false"/>
                    <input type="hidden" id="paramnumFolio" name="paramnumFolio" value=""/>
                    
                  </td>
                </tr>             
            <tr>      
  </table>
</FORM>
