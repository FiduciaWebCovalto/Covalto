<FORM name="frmCharolaSolicitudes" id="frmCharolaSolicitudes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Charola de Instruccion Monetaria Excepcion</td>
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
                <input type="text" name="paramEtapa" id="paramEtapa" ref="qryMuestraNombreEtapaM" fun="loadTxtElementX" theValue="nombreEtapa"  param="asignaPerfil" next="formsLoaded" size="25" disabled="disabled"/>
              </td>
              <td width="30%">
                <input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
                <input type="text" name="Perfil" id="Perfil" size="10" maxlength="10" tipo="Num" value="<%=session.getAttribute("puestoId")!=null?session.getAttribute("puestoId").toString():"0"%>" style="visibility:hidden" size="1"/>
                <input type="hidden" id="paramEstatus" name="paramEstatus" value="VALIDADA" size="1"/>
              </td>
            </tr>
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Fideicomiso</td>
              <td><input type="text" name="paramContrato" id="paramContrato" size="10" onchange="verNomFiso();"/></td>
              <td width="30%"><div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div></td>
            </tr>
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Folio</td>
              <td><input id="paramFolio" name="paramFolio" size="10" fun="loadTableElement" tabla="tblRegCharSol"/></td>
              <td width="30%">
                <input id="paramNombreUsuario" name="paramNombreUsuario" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1" style="visibility:hidden"/>
            </td>
            </tr> 
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Ordenamiento</td>
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
            </tr>    
            <tr>
                <td colspan="4">
                    <input type="text" name="paramIdEtapa" id="paramIdEtapa" value="5" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdTipoSolicitud" id="paramIdTipoSolicitud" value="M" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramTipoSolicitud" id="paramTipoSolicitud" value="1" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdEtapaOrigen" id="paramIdEtapaOrigen" value="4" size="1" style="visibility:hidden"/>
                    <!--input type="text" name="paramMonto" id="paramMonto" value="0" size="1" style="visibility:hidden"/-->
                    <!--input type="text" name="paramMontoMaximo" id="paramMontoMaximo" value="500000" size="1" style="visibility:hidden"/-->
                    <input type="text" name="paramExcepcion" id="paramExcepcion" value="S" size="1" style="visibility:hidden"/>
                    
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
                <input type="button" value="Buscar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="qry.mesaControl.instrucciones" fun="loadTableElement" tabla="tblRegCharSol" param="paramQueryAdmon" onclick="consultar(this, frmCharolaSolicitudes, false);"/>
                <input type="button" name="cmdLimpiar" id="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="regresarAlaCharola();"/>
              </td>
            </tr>
            <tr><td colspan="5" align="center" valign="middle">&nbsp;
            </td></tr>
          </table>
        </td>
      </tr>
    <tr><td align="center" valign="middle"><font color="#2C3587" size="-1"><strong>Solicitudes con Estatus ACTIVO</strong></font></td></tr>
    <tr>
        <td align="center">
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width:100%">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" style="width: 100%" id="tblRegCharSol" dataInfo="arrTblDatCharSol" keys="insNumContrato,insNumFolioInst,insCveStInstruc,insNumOper,insTxtComentario,fusuNombreUsuario,ateNomEjecutivo,concepto,ctoCveStContrat" fun="clickTablaCharSol" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda" rowFunction="rowInstruccion">
                    <thead>
                      <tr align="left" class="cabeceras">
                        <td width="350px">&nbsp;</td>
                        <td width="100px">Semaforo Garantia / Red Flag</td>
                        <td width="70px">Obligacion</td>
                        <td width="70px">Fideicomiso</td>
                        <td width="100px">Folio</td>
                        <td width="100px">Fecha y Hora de Generacion</td>
                        <td width="100px">Estatus del Fideicomiso</td>
                        <td width="100px">Tipo de Instruccion</td>
                        <td width="100px">Operacion</td>
                        <td width="300px">Concepto</td>
                        <td width="300px">Monto</td>
                        <td width="300px">Beneficiario</td>
                        <td width="300px">CM / Cliente</td>
                        <td width="300px">Asesor MCF</td>
                        <td width="600px">Back 1</td>
                        <td width="600px">Back 2</td>
                        <td width="100px">Recurrente</td>
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
            <input type="BUTTON" value="Puntos de Revision" class="btn btn-primary" onclick="funcionDelBoton(1);">
            <!--input type="BUTTON" value="    Documentos    " class="btn btn-primary" onclick="funcionDelBoton(2);"-->
            <!--input type="BUTTON" value="    SubClasificacion    " class="btn btn-primary" onclick="funcionDelBoton(5);"-->
        </td>
    </tr>
    <!--tr><td align="center" valign="middle">&nbsp;</td></tr>
    <tr>
        <td align="center" valign="middle">
            <input type="BUTTON" name="cmdAutoriza" value="Aceptar" class="btn btn-primary" onclick="autorizaRechaza(1);"> 
            <input type="BUTTON" name="cmdRechaza" value="Cancelar" class="btn btn-primary" onclick="autorizaRechaza(2);">
        </td>
    </tr-->
    <tr align="center">
	<td colspan="5">
            <a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
	</td>
    </tr>		  
    <tr align="center"><td colspan="5"><a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a></td></tr>
  </table>
</FORM>