<FORM name="frmCharolaSolicitudes" id="frmCharolaSolicitudes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Charola Excepciones</td>
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
                <input type="hidden" id="paramEstatus" name="paramEstatus" value="ACTIVO" size="1"/>
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
              <td><select size="1" name="paramNumOperacion" id="paramNumOperacion" ref="qryOperacionesNoMonetarias" fun="loadComboElement" keyvalue="ftopNumOper" thevalue="ftopNombreTipoper" next="paramPromotor"></select></td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Promotor</td>
              <td><select size="1" name="paramPromotor" id="paramPromotor" ref="muestraDatosPersonalOrdenado" fun="loadComboElement" keyValue="perNomUsuario" theValue="perNomUsuario" next="paramSubdirector" required message="Este campo es obligatorio"></select></td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Subdirector</td>
              <td><select size="1" name="paramSubdirector" id="paramSubdirector" ref="muestraDatosPersonalOrdenado" fun="loadComboElement" keyValue="perNomUsuario" theValue="perNomUsuario" next="formsLoaded" required message="Este campo es obligatorio"></select></td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="4">
                    <input type="text" name="paramIdEtapa" id="paramIdEtapa" value="5" size="1" style="visibility:hidden"/>
                    <!--input type="text" name="paramIdTipoSolicitud" id="paramIdTipoSolicitud" value="M" size="1" style="visibility:hidden"/-->
                    <!--input type="text" name="paramTipoSolicitud" id="paramTipoSolicitud" value="1" size="1" style="visibility:hidden"/-->
                    <input type="text" name="paramIdEtapaOrigen" id="paramIdEtapaOrigen" value="4" size="1" style="visibility:hidden"/>
                    <!--input type="text" name="paramMonto" id="paramMonto" value="0" size="1" style="visibility:hidden"/-->
                    <input type="text" name="paramExcepcion" id="paramExcepcion" value="S" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramSubsanable" id="paramSubsanable" value="S" size="1" style="visibility:hidden"/>
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
            <table cellspacing="1" cellpadding="0" border="0">
              <tr align="left" class="cabeceras">
                <td width="23px">&nbsp;</td>
                <td width="100px">Fideicomiso</td>
                <td width="100px">Folio</td>
                <td width="100px">Fecha de Generacion</td>
                <td width="300px">Tipo de Operacion</td>
                <td width="200px">Ejecutivo</td>                
              </tr>
            </table>
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegCharSol" dataInfo="arrTblDatCharSol" keys="insNumContrato,insNumFolioInst,insCveStInstruc,insNumOper,insTxtComentario,fusuNombreUsuario,ateNomEjecutivo,concepto,ctoCveStContrat" fun="clickTablaCharSol" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                </table>
            </div>
        </td>
    </tr>
    <tr><td align="center" valign="middle">&nbsp;</td></tr>
    <tr>
        <td align="center" valign="middle">
            <input type="BUTTON" name="cmdCompletado" value="Completado" class="btn btn-primary" onclick="">
            <input type="BUTTON" name="cmdBloqueo" value="Bloqueo Fideicomiso" class="boton_x" onclick="bloquear();">
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