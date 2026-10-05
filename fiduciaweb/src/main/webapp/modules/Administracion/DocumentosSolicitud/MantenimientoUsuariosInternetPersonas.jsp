<FORM name="frmMantenimientoUsuariosInternetPersonas" id="frmMantenimientoUsuariosInternetPersonas" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td align="center" height="100%" class="titulo">Solicitudes</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table id="tabs" cellpadding="0" cellspacing="0" border="0">
          <tr>
            <td class="tab_blanco_azul"><img src="imagenes/spacer.gif" width="37" height="1"/></td>
            <td class="tab_relleno_azul" onclick="cambiaTab(this, 'cargaMantenimientoUsuariosInternetPersonas(2)');">Datos Solicitud</td>
            <td class="tab_azul_claro"><img src="imagenes/spacer.gif" width="34" height="1"/></td>
            <td class="tab_relleno_claro" onclick="cambiaTab(this, 'cargaMantenimientoAsignacionFideicomisos()');">Asignacion Documentos</td>
            <td class="tab_claro_blanco"><img src="imagenes/spacer.gif" width="35" height="1"/></td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="151">
        <table cellspacing="2" cellpadding="3" border="0" width="100%" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="6%" nowrap>Numero Solicitud</td>
            <td width="5%">
             <input type="text" name="ftopNumOper" id="ftopNumOper" size="50" maxlength="50" />              
            </td>
            <td>
              &nbsp;
            </td>
            <td>&nbsp;</td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="6%" nowrap>Nombre Solicitud</td>
            <td colspan="3">
              <input type="text" name="ftopNombreTipoper" id="ftopNombreTipoper" size="50" maxlength="50"/>                            
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="6%" nowrap>Status</td>
            <td colspan="3">
            <input type="text" name="ftopStatus" id="ftopStatus" size="50" maxlength="50"/>                            
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();"/>
        <input type="BUTTON" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalSeguridadUsuariosInternet();"/>
      </td>
    </tr>
  </table>
</FORM>