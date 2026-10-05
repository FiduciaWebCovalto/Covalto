<FORM name="frmCharolaSolicitudes" id="frmCharolaSolicitudes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Charola RPP</td>
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
                <input type="text" name="paramEtapa" id="paramEtapa" ref="qryMuestraNombreEtapa" fun="loadTxtElementX" theValue="nombreEtapa"  param="asignaPerfil" next="paramNumOperacion" size="25" disabled="disabled"/>
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
              <td width="10%">Operacion</td>
              <td><select size="1" name="paramNumOperacion" id="paramNumOperacion" ref="qryOperacionesNoMonetarias" fun="loadComboElement" keyvalue="ftopNumOper" thevalue="ftopNombreTipoper" next="formsLoaded"></select></td>
              <td width="30%">&nbsp;</td>
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
                    <input type="text" name="paramIdEtapa" id="paramIdEtapa" value="9" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdTipoSolicitud" id="paramIdTipoSolicitud" value="N" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramTipoSolicitud" id="paramTipoSolicitud" value="2" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdEtapaOrigen" id="paramIdEtapaOrigen" value="1" size="1" style="visibility:hidden"/>
                </td>
            </tr>
            <tr>
              <td colspan="5" align="center" valign="middle">
                <input type="button" value="Buscar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="qry.juridico.rpp" fun="loadTableElement" tabla="tblRegCharSol" param="paramQueryAdmon" onclick="consultar(this, frmCharolaSolicitudes, false);"/>
                <input type="button" name="cmdLimpiar" id="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="regresarAlaCharola();"/>
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
            <table cellspacing="1" cellpadding="0" border="0">
              <tr align="left" class="cabeceras">
                <td width="25px">&nbsp;</td>
                <td width="100px">Estatus</td>
                <td width="100px">Fideicomiso</td>
                <td width="100px">Folio</td>
                <td width="100px">Fecha de Generacion</td>
                <td width="300px">Operacion</td>
                <td width="100px">Fecha del Documento</td>
                <td width="100px">Num Escritura</td>
                <td width="100px">Notaria</td>
              </tr>
            </table>
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width:950px">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegCharSol" dataInfo="arrTblDatCharSol" keys="insNumContrato,ctoNomContrato,insNumFolioInst,insCveStInstruc,insNumOper,insTxtComentario,fusuNombreUsuario,ateNomEjecutivo,concepto,ctoCveStContrat,fbisFechaIni,fpfFecha,fdfNumEscritura,fdfNotaria" fun="clickTablaCharSol" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda" rowFunction="rowInstruccion">
                </table>
            </div>
        </td>
    </tr>
    <tr><td align="center" valign="middle">&nbsp;</td></tr>
    <tr>
        <td align="center" valign="middle">
            <input type="BUTTON" value="Completar" class="btn btn-primary" onclick="funcionDelBoton(7);">
        </td>
    </tr>
    <tr align="center">
	<td colspan="5">
            <a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
	</td>
    </tr>
  </table>
</FORM>