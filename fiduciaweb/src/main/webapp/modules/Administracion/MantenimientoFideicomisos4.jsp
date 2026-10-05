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
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                <input type="checkbox" name="ctoPendientesPredialChk" id="ctoPendientesPredialChk" class="check" tv="1" fv="0"/>Pendientes de Predial
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                <input type="checkbox" name="ctoEmbargoChk" id="ctoEmbargoChk" class="check" tv="1" fv="0"/>Embargo
            </td>
          </tr> 


          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                <input type="checkbox" name="ctoPendientesRendCuentaChk" id="ctoPendientesRendCuentaChk" class="check" tv="1" fv="0"/>Pendientes de REnd. de Cuentas
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                <input type="checkbox" name="ctoPendientesContablesChk" id="ctoPendientesContablesChk" class="check" tv="1" fv="0"/>Pendientes Contables
            </td>
          </tr> 

          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                <input type="checkbox" name="ctoCsemChk" id="ctoCsemChk" class="check" tv="1" fv="0"/>CSEM Cat A
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                <input type="checkbox" name="ctoHonorariosPendChk" id="ctoHonorariosPendChk" class="check" tv="1" fv="0"/>Honorarios Pendientes
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
