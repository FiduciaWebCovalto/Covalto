<!--Version de Formalizacion/Proyectos-->
<FORM name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Evidencias de Aprobaciones</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap width="9%">No. Prospecto</td>
              <td width="8%">
                <input type="text" name="fevNumProspecto" id="fevNumProspecto" tipo="Num" size="10" maxlength="10" required message="El Numero de Proyecto es un campo obligatorio" onblur="verificacionExistenciaRegistro();" /> <!---->
              </td>
              <td width="40%">
              <!--input type="text" name="txtNomProyecto" id="txtNomProyecto" tipo="AlphaNumeric" size="40"style="visibility:hidden"/!-->
                <div id="txtNomProyecto" class="textoNegrita" >&nbsp;</div>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td nowrap width="9%">COnfirmacion NGT</td>
              <td width="8%">
                    <a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
                    <div style="visibility:hidden"><a id="docLink" href="#" target="_new">Liga para ver documentos</a></div>              
              </td>
              <td width="5%">&nbsp;</td>
              <td align="right" width="5%">&nbsp;</td>
            </tr>  
            <tr>
              <td width="25%">&nbsp;</td>
              <td nowrap width="9%">Folio Legal Express de Proyecto Aprobado</td>
              <td width="8%">
                <input type="text" name="fevFolioLegalExpress" id="fevFolioLegalExpress" tipo="Num" size="10" maxlength="10" required message="El Num de Folio es un campo obligatorio"/>
              </td>
              <td width="5%">&nbsp;</td>
              <td align="right" width="5%">&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="BUTTON" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="BUTTON" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalFinalidadesContrato();" style="visibility:hidden"/>
        </td>
      </tr>
  </table>
</FORM>
