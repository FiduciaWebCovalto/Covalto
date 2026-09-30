<FORM name="frmMantenimientoCatalogoSubCuentas" id="frmMantenimientoCatalogoSubCuentas" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento Catalogo Documentos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table cellspacing="2" cellpadding="3" border="0" width="100%" class="texto">
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="8%" nowrap>No. Documento</td>
            <td width="20%">
              <input type="text" name="fdocIdDocumento" id="fdocIdDocumento" tipo="Num" size="10" maxlength="10" required message="El Numero de Solicitud es un campo obligatorio" onblur="verificaExistenciaRegistro();"/>
            </td >
            <td width="35%">
              &nbsp;
            </td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="8%" nowrap>No. Documento Padre</td>
            <td width="20%">
              <input type="text" name="fdocPadre" id="fdocPadre" tipo="Num" size="50" maxlength="10"/>
            </td >
            <td width="35%">
              &nbsp;
            </td>
          </tr>          
          <tr>
            <td width="35%">C</td>
            <td width="8%" nowrap>Nombre Documento</td>
            <td>
              <input type="text" name="fdocNombre" id="fdocNombre" tipo="AlphaNumeric" size="50" maxlength="500" required message="La descripcion es obligatoria"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="8%" nowrap>Status</td>
            <td>
              <select size="1" name="fdocStatus" id="fdocStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="loadCatalogo" param="clavesCombo31" required message="El Status es un campo obligatorio"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="BUTTON" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="showWaitLayer(); cargaPrincipalCatalogosGeneralEstructuraGeograficaPaises();" />
      </td>
    </tr>
  </table>
</FORM>
