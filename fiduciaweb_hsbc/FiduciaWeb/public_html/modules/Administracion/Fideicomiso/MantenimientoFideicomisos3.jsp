<FORM name="frmDatosMantenimientoFideicomisos2" id="frmDatosMantenimientoFideicomisos2" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" align="center" style="height:auto;">
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td align="center" height="100%" class="titulo">Fideicomisos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto" border="0">
          <tr valign="middle">
            <td width="25%">N&uacute;m. Fideicomiso</td>
            <td>
              <input type="text" name="ctoNumContrato" id="ctoNumContrato" tipo="Num" size="10" maxlength="10" required message="El N�mero de Fideicomiso es un campo obligatorio"/>
            </td>
            <td width="11%">Cto. Eje</td>
            <td width="3%">
              <input type="text" name="ctoNumCtoEje" id="ctoNumCtoEje" tipo="Num" size="10" maxlength="10"/>
            </td>
          </tr>
          <tr>
            <td width="25%">Nombre</td>
            <td colspan="3" width="11%">
              <input type="text" name="ctoNomContrato" id="ctoNomContrato" size="50" maxlength="80" required message="El Nombre es un campo obligatorio"/>
            </td>
          </tr>
          <tr>
            <td width="25%">Tipo de Persona</td>
            <td width="33%">
              <select size="1" name="ctoCveTipoPer" id="ctoCveTipoPer" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="ctoNumNotario" param="clavesCombo23" required message="El Tipo de Persona es un campo obligatorio"/>
            </td>
            <td width="11%">&nbsp;</td>
            <td width="3%">
              <input type="text" name="ctoNumCliente" id="ctoNumCliente" tipo="Num" size="10" maxlength="10" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td width="11%" colspan="4">
              <hr/>
            </td>
          </tr>
          <tr valign="middle">
            <td class="subtitulo" width="25%" colspan="4">
            <table id="tabs" cellpadding="0" cellspacing="0" border="0" style="visibility:hidden">
                <tr>
                  <td class="tab_blanco_claro">&nbsp;</td>
                  <td class="tab_relleno_claro" onclick="cambiaTab(this, 'cargaMantenimientoFideicomisosTab()');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Caracter&iacute;sticas&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                  <td class="tab_claro_azul">&nbsp;</td>
                  <td class="tab_relleno_azul" onclick="cambiaTab(this, 'cargaMantenimientoFideicomisos2Tab()');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Caracter&iacute;sticas Adicionales&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                  <td class="tab_azul_blanco">&nbsp;</td>
                </tr>
              </table>
            </td>
          </tr>
          <tr>
            <td width="11%" colspan="4">
              <hr/>
            </td>
          </tr>
          <tr align="left">
            <td width="30%">Estatus del Fideicomiso:</td>
            <td nowrap width="15%">
                <select size="1" name="ctoEstatusFideicomiso" id="ctoEstatusFideicomiso" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1100"  next="ctoEstatusActividad"/> <!---->
             </td>
            <td colspan="2">Estatus de Actividad</td>
            <td align="left" width="15%">
                <select size="1" name="ctoEstatusActividad" id="ctoEstatusActividad" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1101"  next="ctoEstatusHogan"/> <!---->
            </td>
          </tr> 
          <tr align="left">
            <td width="30%">Estatus Hogan:</td>
            <td nowrap width="15%">
                <select size="1" name="ctoEstatusHogan" id="ctoEstatusHogan" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1102"  next="ctoManejaMonExt"/> <!---->
             </td>
            <td colspan="2">Maneja Mon. Ext.</td>
            <td align="left" width="15%">
                <select size="1" name="ctoManejaMonExt" id="ctoManejaMonExt" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1103"  next="ctoSubEstatusAct"/> <!---->
            </td>
          </tr> 
          <tr align="left">
            <td width="30%">Sub-Estatus Actividad:</td>
            <td nowrap width="15%">
                <select size="1" name="ctoSubEstatusAct" id="ctoSubEstatusAct" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1104"  next="ctoRiskRating"/> <!---->
             </td>
            <td colspan="2">Risk Rating/RAM</td>
            <td align="left" width="15%">
                <select size="1" name="ctoRiskRating" id="ctoRiskRating" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1105"  next="ctoTipoRemediacion"/> <!---->
            </td>
          </tr> 
          <tr align="left">
            <td width="30%">Tipo de Remediacion:</td>
            <td nowrap width="15%">
                <select size="1" name="ctoTipoRemediacion" id="ctoTipoRemediacion" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1106"  next="ctoEstatusRemediacion"/> <!---->
             </td>
            <td colspan="2">Estatus de Remediacion:</td>
            <td align="left" width="15%">
                <select size="1" name="ctoEstatusRemediacion" id="ctoEstatusRemediacion" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1107"  next="ctoSubEstatusReme"/> <!---->
            </td>
          </tr> 
          <tr align="left">
            <td width="30%">GRID:</td>
            <td nowrap width="15%">
                <input type="text" name="ctoGrid" id="ctoGrid" tipo="Num" size="10" maxlength="10"   /> <!---->
             </td>
            <td colspan="2">Sub-Estatus de Remediacion:</td>
            <td align="left" width="15%">
                <select size="1" name="ctoSubEstatusReme" id="ctoSubEstatusReme" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1108"  next="loadComboElement"/> <!---->
            </td>
          </tr> 
          <tr align="left">
            <td width="30%">Fecha Ultima Revision:</td>
            <td nowrap width="15%">
                <input type="text" name="ctoFechaUltimaRev" id="ctoFechaUltimaRev"  size="10" maxlength="10"   /> <!---->
             </td>
            <td colspan="2">Fecha Proxima Revision:</td>
            <td align="left" width="15%">
                <input type="text" name="ctoFechaProxRev" id="ctoFechaProxRev"  size="10" maxlength="10"   /> <!---->
            </td>
          </tr> 


    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value=" Aceptar  " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
        <input type="BUTTON" value=" Cancelar " id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="showWaitLayer(); cargaPrincipalFideicomisos();" style="visibility:hidden"/>
        <!--input type="BUTTON" value=" Atenci�n " id="cmdAtencion" name="cmdAtencion" class="btn btn-primary" onclick="cargaPrincipalAtencionFideicomisos();" style="visibility:hidden"/>
        <input type="BUTTON" value="Honorarios" id="cmdHonorarios" name="cmdHonorarios" class="btn btn-primary" onclick="cargaConsultaHonorariosFideicomisos();" style="visibility:hidden"/-->
      </td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
