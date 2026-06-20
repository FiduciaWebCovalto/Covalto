<FORM name="frmCharolaSolicitudes" id="frmCharolaSolicitudes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Validar Cuentas Bancarias y de Inversion</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="95%" style="text-align:left" class="texto" border="0">
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Fideicomiso</td>
              <td><input type="text" name="paramContrato" id="paramContrato" size="10" onchange="verNomFiso();"/></td>
              <td width="30%">
                <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
                <input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
                <input type="text" name="Perfil" id="Perfil" size="10" maxlength="10" tipo="Num" value="<%=session.getAttribute("puestoId")!=null?session.getAttribute("puestoId").toString():"0"%>" style="visibility:hidden" size="1"/>
                <input type="hidden" id="paramEstatus" name="paramEstatus" value="ACTIVO" size="1"/>
              </td>
            </tr>
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Institucion</td>
              <td><select size="1" name="fciIntermediario" id="fciIntermediario" ref="conNumIntNomInt" fun="loadComboElement" keyValue="intEntidadFin" theValue="intIntermediario" next="formsLoaded"></select></td>
              <td width="30%">&nbsp;</td>
            </tr>  
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="25%">Cuenta Bancaria o de Inversion</td>
              <td><input type="text" name="paramCuenta" id="paramCuenta" size="20" maxlength="20" /></td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="4">
                    <input type="text" name="paramIdEtapa" id="paramIdEtapa" value="12" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdTipoSolicitud" id="paramIdTipoSolicitud" value="M" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramTipoSolicitud" id="paramTipoSolicitud" value="4" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdEtapaOrigen" id="paramIdEtapaOrigen" value="12" size="1" style="visibility:hidden"/>
                </td>
            </tr>
            <tr>
              <td colspan="5" align="center" valign="middle">
                <input type="button" value="Buscar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="qry.admon.cbi" fun="loadTableElement" tabla="tblRegCharSol" param="paramQueryAdmon" onclick="consultar(this, frmCharolaSolicitudes, false);"/>
                <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmCharolaSolicitudes);"/>
                
              </td>
            </tr>
            <tr><td colspan="5" align="center" valign="middle">&nbsp;
            </td></tr>
          </table>
        </td>
      </tr>
    <tr><td align="center" valign="middle"><font color="#2C3587" size="-1"><strong>Solicitudes con Estatus PENDIENTE</strong></font></td></tr>
    <tr>
        <td align="center">
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width:100%">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegCharSol" dataInfo="arrTblDatCharSol" keys="insNumFolioInst,insNumOper,insNumContrato,ftopTipoSol,fetaIdEtapa,fbisNumEtapa,fciNumFideicomiso,fciNumCta,fciTipoCta,fciIntermediario,monNomMoneda,fbisFechaIni,fciEstatus" fun="clickTablaCharSol" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                    <thead>
                      <tr align="left" class="cabeceras">
                        <td width="23px">&nbsp;</td>
                        <td width="100px">Fideicomiso</td>
                        <td width="100px">No. Cuenta</td>
                        <td width="100px">Tipo Cuenta</td>
                        <td width="300px">Institucion</td>
                        <td width="200px">Moneda</td>
                        <td width="100px">Fecha Alta</td>
                        <td width="100px">Estatus</td>
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
        </td>
    </tr>
  </table>
</FORM>