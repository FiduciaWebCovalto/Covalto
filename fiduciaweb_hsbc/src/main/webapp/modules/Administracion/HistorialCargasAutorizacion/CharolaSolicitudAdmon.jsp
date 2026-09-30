<FORM name="frmCharolaSolicitudes" id="frmCharolaSolicitudes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Historial de Modificacion Masiva de Partes</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="95%" style="text-align:left" class="texto" border="0">
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="15%">Fideicomiso</td>
              <td width="20%"><input type="text" name="paramContrato" id="paramContrato" size="10"/></td>
              <td width="30%">
                <input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
                <input type="text" name="Perfil" id="Perfil" size="10" maxlength="10" tipo="Num" value="<%=session.getAttribute("puestoId")!=null?session.getAttribute("puestoId").toString():"0"%>" style="visibility:hidden"/>
              </td>
            </tr>                
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Fecha Inicial</td>
              <td><input type="text" id="paramFechaInicial" name="paramFechaInicial" tipo="Fecha" size="10"></td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Fecha Final</td>
              <td><input type="text" id="paramFechaFinal" name="paramFechaFinal" tipo="Fecha" size="10"></td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%">&nbsp;</td>
              <td width="10%">Estatus</td>
              <td><select size="1" name="paramEstatus" id="paramEstatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo31" next="formsLoaded"></select></td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="4">
                    <input type="text" name="paramIdEtapa" id="paramIdEtapa" value="13" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdTipoSolicitud" id="paramIdTipoSolicitud" value="C" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramTipoSolicitud" id="paramTipoSolicitud" value="5" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdEtapaOrigen" id="paramIdEtapaOrigen" value="13" size="1" style="visibility:hidden"/>
                </td>
            </tr>
            <tr>
              <td colspan="5" align="center" valign="middle">
                <input type="button" value="Buscar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="qry.admon.historialCargasAutorizacion" fun="loadTableElement" tabla="tblRegCharSol" param="paramQueryAdmon" onclick="consultar(this, frmCharolaSolicitudes, false);"/>
                <input type="button" name="cmdLimpiar" id="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="regresarAlaCharola();"/>
              </td>
            </tr>
            <tr><td colspan="5" align="center" valign="middle">&nbsp;
            </td></tr>
          </table>
        </td>
      </tr>
    <tr>
        <td align="center">
            <table cellspacing="1" cellpadding="0" border="0">
              <tr align="left" class="cabeceras">
                <td width="23px">&nbsp;</td>
                <td width="100px">Fideicomiso</td>
                <td width="200px">Nombre Carga</td>
                <td width="100px">Fecha</td>
                <td width="100px">Estatus</td>
              </tr>
            </table>
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegCharSol" dataInfo="arrTblDatCharSol" keys="insNumFolioInst,insCveTipoInstr,insNumOper,insNumContrato,fetaNombreEtapa,ftopTipoSol,fetaIdEtapa,fbisNumEtapa,ftopNombreTipoper,fbisFechaIni,insCveStInstruc" fun="clickTablaCharSol" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
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