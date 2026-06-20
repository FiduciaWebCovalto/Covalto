<FORM name="frmCharolaSolicitudes" id="frmCharolaSolicitudes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Charola de Instruccion Monetaria</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="95%" style="text-align:left" class="texto" border="0">
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="15%">Etapa</td>
              <td>
                <input type="text" name="paramEtapa" id="paramEtapa" ref="qryMuestraNombreEtapaM" fun="loadTxtElementX" theValue="nombreEtapa" param="asignaPerfil" next="paramNumOperacion" size="25" disabled="disabled"/>
              </td>
              <td width="30%">
                <input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
                <input type="text" name="Perfil" id="Perfil" size="10" maxlength="10" tipo="Num" value="<%=session.getAttribute("puestoId")!=null?session.getAttribute("puestoId").toString():"0"%>" style="visibility:hidden" size="1"/>
              </td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Tipo de Operaci&oacute;n</td>
              <td><select size="1" name="paramNumOperacion" id="paramNumOperacion" ref="qryOperacionesMonetarias" fun="loadComboElement" keyvalue="ftopNumOper" thevalue="ftopNombreTipoper" next="formsLoaded"></select></td>
              <td>&nbsp;</td>
            </tr> 
            <tr>
              <td>&nbsp;</td>
              <td>No. Fideicomiso</td>
              <td><input type="text" name="paramContrato" id="paramContrato" size="10"/></td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Folio</td>
              <td><input id="paramFolio" name="paramFolio" size="10"/></td>
              <td>
                <input id="paramNombreUsuario" name="paramNombreUsuario" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Fecha</td>
              <td><input id="paramFecha" name="paramFecha" size="10"/></td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Tipo de Entrada</td>
              <td>
                <select name="paramTipoEntrada" id="paramTipoEntrada">
                    <option value="-1">-- Seleccione --</option>
                    <option value="Cliente">Cliente</option>
                    <option value="Client Services">Client Services</option>
                </select>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td nowrap>Carta / Recurrente - Obligaci&oacute;n</td>
              <td>
                <select name="paramCartaRecurrente" id="paramCartaRecurrente">
                    <option value="-1">-- Seleccione --</option>
                    <option value="Carta">Carta</option>
                    <option value="Recurrente">Recurrente</option>
                </select>
              </td>
              <td>&nbsp;</td>
            </tr>
            <!--tr>
              <td>&nbsp;</td>
              <td>Ordenamiento</td>
              <td>
                <select name="cboOrdenamiento" id="cboOrdenamiento" onchange="setOrder(this)">
                    <option value="1">Semaforo Garantia</option>
                    <option value="2">Obligacion</option>
                    <option value="3">Fideicomiso</option>
                    <option value="4" selected="selected">Folio</option>
                    <option value="5">Fecha y Hora de Generacion</option>
                    <option value="6">Estatus del Fideicomiso</option>
                    <option value="7">Tipo de Instruccion</option>
                    <option value="8">Operacion</option>
                    <option value="9">Concepto</option>
                    <option value="10">Monto</option>
                    <option value="11">Beneficiario</option>
                    <option value="12">CM / Cliente</option>
                    <option value="13">Asesor MCF</option>
                    <option value="14">Back 1</option>
                    <option value="15">Back 2</option>
                    <option value="16">Recurrente</option>
                </select>
              </td>
              <td>&nbsp;</td>
            </tr-->
            <tr>
                <td colspan="4">
                    <input type="text" name="paramIdEtapa" id="paramIdEtapa" value="6" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdTipoSolicitud" id="paramIdTipoSolicitud" value="M" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramTipoSolicitud" id="paramTipoSolicitud" value="1" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdEtapaOrigen" id="paramIdEtapaOrigen" value="5" size="1" style="visibility:hidden"/>
                    <!--input type="text" name="paramMonto" id="paramMonto" value="0" size="1" style="visibility:hidden"/-->
                    <input type="text" name="paramExcepcion" id="paramExcepcion" value="N" size="1" style="visibility:hidden"/>
                    <input type="hidden" id="paramEstatus" name="paramEstatus" value="VALIDADA" size="1"/>
                    
                    <input type="text" name="paramOrder1" id="paramOrder1" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder2" id="paramOrder2" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder3" id="paramOrder3" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder4" id="paramOrder4" value="S" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder5" id="paramOrder5" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder6" id="paramOrder6" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder7" id="paramOrder7" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder8" id="paramOrder8" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder9" id="paramOrder9" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder10" id="paramOrder10" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder11" id="paramOrder11" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder12" id="paramOrder12" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder13" id="paramOrder13" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder14" id="paramOrder14" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder15" id="paramOrder15" value="" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder16" id="paramOrder16" value="" size="1" style="visibility:hidden"/>
                </td>
            </tr>
            <tr>
              <td colspan="5" align="center" valign="middle">
                <input type="button" value="Buscar" name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" ref="qry.mesaControl.instrucciones" fun="loadTableElement" tabla="tblRegCharSol" param="paramQueryAdmon" onclick="consultar(this, frmCharolaSolicitudes, false);"/>
                <input type="button" name="cmdLimpiar" id="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="cargaPantallaInstrucciones();"/>
                <input type="button" name="cmdEjecutarInterfaz" id="cmdEjecutarInterfaz" value="Ejecutar Interfaz" class="btn btn-primary" onclick="ejecutarInterfaz()"/>
                <input type="button" name="cmdExportarExcel" id="cmdExportarExcel" value="Exportar Excel" class="btn btn-primary" onclick="doDownload();"/>
              </td>
            </tr>
            <tr><td colspan="5" align="center" valign="middle">&nbsp;
            </td></tr>
          </table>
        </td>
      </tr>
    <tr><td align="center" valign="middle"><font color="#2C3587" size="-1"><strong>Solicitudes con Estatus VALIDADA</strong></font></td></tr>
    <tr>
        <td align="center">
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width:100%">
                <table border="0" cellpadding="0" cellspacing="1" class="texto" id="tblRegCharSol" dataInfo="arrTblDatCharSol" keys="insNumContrato,insNumFolioInst,insCveStInstruc,insNumOper,insTxtComentario,fusuNombreUsuario,ateNomEjecutivo,concepto,ctoCveStContrat,cuentaOrigen,beneficiario,monto,fbisFechaIni,tipoEntrada,moneda,cuentaDestino" fun="clickTablaCharSol" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda" rowFunction="rowInstruccion">
                    <thead>
                      <tr align="left" class="cabeceras" style="text-align: center;">
                        <td width="23px">&nbsp;</td>
                        <td width="200px">Status</td>
                        <td width="200px">Interfaz</td>
                        <td width="200px">Folio</td>
                        <td width="200px">Status</td>
                        <td width="200px">Fideicomiso</td>
                        <td width="200px">Tipo Operaci&oacute;n</td>
                        <td width="200px">Moneda</td>
                        <td width="200px">Concepto de Pago</td>
                        <td width="200px">Cta. Origen</td>
                        <td width="200px">Cta. Destino</td>
                        <td width="200px">Monto</td>
                        <td width="200px">Beneficiario</td>
                        <td width="200px">Fecha de Validaci&oacute;n</td>
                        <td width="200px">Carta / Recurrente</td>
                        <td width="200px">Tipo de Entrada</td>
                      </tr>
                    </thead>
                  <tbody></tbody>
                </table>
            </div>
        </td>
    </tr>
    <tr><td align="center" valign="middle">&nbsp;</td></tr>
    <tr>
        <td align="center" valign="middle">
            <input type="BUTTON" value="Puntos de Revision" class="btn btn-primary" onclick="cargaPantallaPuntosRevision();">
        </td>
    </tr>
    <tr align="center">
	<td colspan="5">
            <a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
	</td>
    </tr>		  
    <tr align="center"><td colspan="5"><a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a></td></tr>
  </table>
</FORM>
<div style="visibility:hidden;">
    <form id="frmExport" method="POST" action="DatosFiduciarios.xls" target="iframeDownload">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
        <input type="hidden" id="jsonExport" name="json" value="" />
        <input type="hidden" name="headers" value="Semaforo,Interfaz,Folio,Estatus,Fideicomiso,Tipo Operacion,Moneda,Concepto de Pago,Cta. Origen,Cta. Destino,Monto,Beneficiario,Fecha de Validación,Carta / Recurrente,Tipo de Entrada" />
    </form>
    <iframe name="iframeDownload" src=""></iframe>
</div>