<FORM name="frmMantenimiento" id="frmMantenimiento" onsubmit=" ">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="0" border="0" width="100%" align="left" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Fideicomiso</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="100%" class="texto" border="0" style="text-align: left;">
            <tr>
              <td nowrap>&nbsp;</td>
              <td nowrap>Num. Fideicomiso</td>
              <td>
                <input type="text" name="ctoNumContrato" id="ctoNumContrato" tipo="Num" size="10" maxlength="10" disabled="disabled"/>
              </td>
              <td nowrap>Apodo</td>
              <td colspan="2">
                <input type="text" name="ctoNomContrato" id="ctoNomContrato" size="50" maxlength="100" disabled="disabled"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
                <td colspan="7" nowrap><hr/></td>
            </tr>
            <tr valign="middle">
                <td class="subtitulo" nowrap colspan="7" align="left">
                    <table id="tabs" cellpadding="0" cellspacing="0" border="0">
                        <tr>
                            <td class="tab_blanco_claro">&nbsp;</td>
                            <td class="tab_relleno_claro" onclick="cambiaTab(this, 'cargarPantallaMantenimientoTab(1)');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Datos Generales&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td class="tab_claro_azul">&nbsp;</td>
                            <td class="tab_relleno_azul" onclick="cambiaTab(this, 'cargarPantallaMantenimientoTab(2)');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Estatus KYC&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td class="tab_azul_claro">&nbsp;</td>
                            <td class="tab_relleno_claro" onclick="cambiaTab(this, 'cargarPantallaMantenimientoTab(3)');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tipos de Bloqueo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td class="tab_claro_blanco">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td colspan="7" nowrap><hr/></td>
            </tr>
            <tr>
                <td nowrap>Estatus del Fideicomiso</td>
                <td>
                    <select name="ctoEstatusFideicomiso" id="ctoEstatusFideicomiso" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2000}" next="ctoEstatusActividad" required message="Este es un campo obligatorio"></select>
                </td>
                <td nowrap>Estatus de Actividad</td>
                <td>
                    <select name="ctoEstatusActividad" id="ctoEstatusActividad" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2012}" next="ctoEstatusHogan" required message="Este es un campo obligatorio"></select>
                </td>
                <td nowrap>Estatus HOGAN</td>
                <td>
                    <select name="ctoEstatusHogan" id="ctoEstatusHogan" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2013}" next="ctoManejaMonExt" required message="Este es un campo obligatorio"></select>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td nowrap>Maneja Mon. Ext.</td>
                <td>
                    <select name="ctoManejaMonExt" id="ctoManejaMonExt" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2014}" next="ctoSubEstatusAct" required message="Este es un campo obligatorio"></select>
                </td>
                <td nowrap>Sub-Estatus de Actividad</td>
                <td>
                    <select name="ctoSubEstatusAct" id="ctoSubEstatusAct" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2015}" next="ctoRiskRating" required message="Este es un campo obligatorio"></select>
                </td>
                <td nowrap>Risk Rating / RAM</td>
                <td>
                    <select name="ctoRiskRating" id="ctoRiskRating" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2016}" next="ctoTipoRemediacion" required message="Este es un campo obligatorio"></select>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td nowrap>Tipo de Remediacion</td>
                <td>
                    <select name="ctoTipoRemediacion" id="ctoTipoRemediacion" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2017}" next="ctoSubEstatusReme" required message="Este es un campo obligatorio"></select>
                </td>
                <td nowrap>Estatus de Remediacion</td>
                <td>
                    <input type="text" name="ctoEstatusRemediacion" id="ctoEstatusRemediacion" size="10" maxlength="50"/>
                </td>
                <td nowrap>GRID</td>
                <td>
                    <input type="text" name="ctoGrid" id="ctoGrid" size="10" maxlength="50" required message="Este es un campo obligatorio"/>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td nowrap>&nbsp;</td>
                <td nowrap>&nbsp;</td>  
                <td nowrap>Sub-Estatus Remediacion</td>
                <td>
                    <select name="ctoSubEstatusReme" id="ctoSubEstatusReme" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2018}" next="loadCatalogo"></select>
                </td>
                <td nowrap>Fecha Ultima de Revision</td>
                <td>
                    <input type="text" name="ctoFechaUltimaRev" id="ctoFechaUltimaRev" size="10" maxlength="50" required message="Este es un campo obligatorio"/>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td nowrap>Fecha Proxima de Revision</td>
                <td>
                    <input type="text" name="ctoFechaProxRev" id="ctoFechaProxRev" size="10" maxlength="50" required message="Este es un campo obligatorio"/>
                </td>
                <td>&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr align="center">
        <td>
            <table>
                <tr>
                    <td style="text-align: right;"><input type="button" value="  Aceptar  " name="cmdAceptar" id="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="display: none;"/></td>
                    <td style="text-align: left;"><input type="button" value="  Cancelar " name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipal();" style="display: none;"/></td>
                </tr>
            </table>
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
