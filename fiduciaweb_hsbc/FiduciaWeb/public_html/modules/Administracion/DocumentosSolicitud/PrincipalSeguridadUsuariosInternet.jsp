<FORM name="frmPrincipalSeguridadUsuariosInternet" id="frmPrincipalSeguridadUsuariosInternet" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Solicitudes</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%" nowrap>No. Solicitud</td>
            <td>
              <input type="text" name="paramOperacion" id="paramOperacion" tipo="Num" size="15" maxlength="10"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%" nowrap>Nombre</td>
            <td>
              <input type="text" name="paramDescripcion" id="paramDescripcion" tipo="AlphaNumeric" size="50" maxlength="50" onblur="convertirMayusculas(this)"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosTipoPer" fun="loadTableElement" tabla="tablaRegistrosDatosUsuariosInternet" onclick="consultar(this, GI('frmPrincipalSeguridadUsuariosInternet'), false);"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalSeguridadUsuariosInternet'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoUsuariosInternetPersonas(3);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr align="center">
            <td colspan="4">
              <table cellspacing="0" cellpadding="0" border="0">
                <tr class="cabeceras">
                  <td width="23px">&nbsp;</td>
                  <td width="100px">Numero Solicitud</td>
                  <td width="200px">Nombre Solicitud</td>
                  <td width="50px">Status</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:373px;">
                <table id="tablaRegistrosDatosUsuariosInternet" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaDatosUsuariosInternetData" keys="ftopNumOper" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                </table>
              </div>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</FORM>
