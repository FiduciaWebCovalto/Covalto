<form name="frmDatosInterfase" id="frmDatosInterfase" onsubmit=" ">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Circulo de Credito</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto">
          <tr valign="middle">
            <td align="left" class="subtitulo" width="29%">&nbsp;</td>
            <td align="left" class="subtitulo" colspan="2">&nbsp;</td>
            <td align="left" class="subtitulo" width="24%">&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td colspan="4" align="center" class="subtitulo" width="30%">
              <a id="ligaArchivo" href="modules/Interfases/PrevencionLavado/reporte.csv" style="visibility:hidden">Archivo</a>
            </td>
          </tr>
          <tr valign="middle">
            <td align="left" width="19%">&nbsp;</td>
            <td align="right" width="13%">Fecha</td>
            <td align="left" width="44%">
              <input type="text" name="txtFechaValor" id="txtFechaValor" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="cmbTipoLiq" maxlength="10" tipo="Fecha" required message="La Fecha Valor es un campo obligatorio"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

          <tr valign="middle">
            <td align="left" width="19%">&nbsp;</td>
            <td align="right" width="13%">Cr&eacute;dito</td>
            <td align="left" width="44%">
              <input type="text" name="txtCredito" id="txtCredito" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="cmbTipoLiq" maxlength="10" tipo="Fecha" required message="La Fecha Valor es un campo obligatorio"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

        </table>
      </td>
    </tr>

    <tr>
      <td align="center">&nbsp;
        <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="ejecutaFuncion();"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" value="Limpiar" name="cmdLimpiar" id="cmdLimpiar" class="btn btn-primary" onclick="onButtonClickPestania('Interfases.PrevencionLavado.PrincipalPrevencionLavado','');"/>
      </td>
    </tr>
  </table>
</form>
