<TD colspan="2" valign="middle" align="center" class="titulo">
    <FORM name="frmReportes" id="frmReportes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
      <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
        <tr>
          <td rowspan="7" width="10%" height="100%">&nbsp;</td>
          <td height="100%">&nbsp;</td>
          <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        </tr>
        <tr>
          <td align="center" height="100%" class="titulo">Reportes de Honorarios</td>
        </tr>
        <tr>
          <td height="100%">&nbsp;</td>
        </tr>
        <tr>
          <td height="100%">
            <table width="90%" align="center" class="texto" border="0">
              <tr valign="middle">
                <td align="right" nowrap>Seleccione el Reporte</td>
                <td align="center">
                  <select id="slcReportes" name="slcReportes" onchange="cargaReporte(this.value)" required>
                    <option value="-1">-- Seleccione --</option>
                    <option value="IngresosFideicomiso">Avance sobre el presupuesto de Ingresos desglosado por Fideicomiso</option>
                    <option value="DevengadosNoCobrados">Devengados No cobrados a 30,60 y 90 dias</option>
                  </select>
                </td>
              </tr>
              <tr>
                <td colspan="2">
                  <hr/>
                </td>
              </tr>
              <tr>
                <td colspan="2">
                  <div id="dvReporte" class="texto"></div>
                </td>
              </tr>
            </table>
          </td>
        </tr>
        <tr>
          <td width="60%" height="100%">&nbsp;</td>
        </tr>
        <tr>
          <td height="100%" align="center">
            <input type="BUTTON" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="ejecutaReporte();"/>
            <!--input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-primary" onclick="();"/!-->
          </td>
        </tr>
        <tr>
          <td height="100%">&nbsp;</td>
        </tr>
      </table>

      <input type="hidden" id="paramRepInfoUrlLogo" name="paramRepInfoUrlLogo" value="<%="http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()+"/imagenes/logo_bn.jpg"%>" />
      <input type="hidden" id="paramRepInfoFechaReporte" name="paramRepInfoFechaReporte" value="<%=mx.com.inscitech.fiducia.common.util.DateTimeUtils.formatDateTimeFromPattern("dd' de 'MMMMM' del 'yyyy", new java.util.Date(), java.util.Locale.getDefault())%>"/>
    
    </form>
  
  
  <a id="linkReporte" href="#" style="visibility:hidden">Archivo</a>
</TD>
