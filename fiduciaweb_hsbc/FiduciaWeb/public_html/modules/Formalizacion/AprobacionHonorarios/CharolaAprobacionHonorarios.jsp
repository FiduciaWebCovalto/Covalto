<FORM name="frmCharolaSolicitudes" id="frmCharolaSolicitudes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Aprobacion Honorarios</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="100%" class="texto" style="text-align:left" border="0">
            <tr>
              <td width="40%">&nbsp;</td>
              <td width="10%">No. Prospecto</td>
              <td><input id="paramProspecto" name="paramProspecto" size="10"/></td>
              <td width="40%">&nbsp;</td>
            </tr>
            <tr>
              <td width="40%">&nbsp;</td>
              <td width="10%">No. Fideicomiso</td>
              <td><input id="paramFideicomiso" name="paramFideicomiso" size="10"/></td>
              <td width="40%">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="4">
                    <input id="paramNombreUsuario" name="paramNombreUsuario" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder" id="paramOrder" size="1" value="S" style="visibility:hidden"/>
                    <input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
                    <input type="text" name="Perfil" id="Perfil" maxlength="10" tipo="Num" value="<%=session.getAttribute("puestoId")!=null?session.getAttribute("puestoId").toString():"0"%>" style="visibility:hidden" size="1"/>
                    <input type="hidden" id="paramEstatus1" name="paramEstatus1" value="AUTORIZADO" size="1"/>
                    <input type="hidden" id="paramEstatus2" name="paramEstatus2" value="RECHAZADO" size="1"/>
                    <input type="text" name="paramIdEtapa" id="paramIdEtapa" value="11" size="1" style="visibility:hidden"/>
                </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
                <table width="224" cellpadding="0" cellspacing="0">
                    <tr>
                    <td width="112"  align="center" valign="middle">
                      <input type="button" value="Buscar" name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" ref="qry.formalizacion.dictaminacion.aprobacionHonorarios" fun="loadTableElement" tabla="tblRegCharSol" param="paramQueryAdmon" onclick="consultar(this, frmCharolaSolicitudes, false);"/>
                    </td>
                    <td width="112" align="center" valign="middle">
                      <input type="button" name="cmdLimpiar" id="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="RF(GI('frmCharolaSolicitudes'));"/>
                    </td>
                    </tr>
                </table>
              </td>
            </tr>
            <tr>
                <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
    <tr>
        <td align="center">
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width:70%">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" width="100%" id="tblRegCharSol" dataInfo="arrTblDatCharSol" keys="pacNumContrato,antNumContrato,antNomNegocio,antCveTipoNeg,ahoCveEstado,ahoNumOper" fun="clickTablaCharSol" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                    <thead>
                      <tr align="left" class="cabeceras">
                            <td width="23">&nbsp;</td>
                            <td width="100px">No. Prospecto</td>
                            <td width="300px">Nombre</td>
                            <td width="300px">Tipo de Negocio</td>
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
  </table>
</FORM>