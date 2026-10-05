<FORM name="frmCondonacionHonorarios2" id="frmCondonacionHonorarios2" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Condonaci&oacute;n</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="30%">&nbsp;</td>
              <td width="30%">Fecha Condonacion</td>
              <td width="25%" colspan="2">
                <input type="text" name="txtFechaCondonacion" id="txtFechaCondonacion" tipo="Fecha" size="15"  required message="La Fecha de Condonacion es un dato obligatorio"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">Fideicomiso</td>
              <td colspan="2">
                <input type="text" name="decNumContrato" id="decNumContrato" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="30%">Importe Condonacion</td>
              <td colspan="2">
                <input type="text" name="txtImpCondonacion" id="txtImpCondonacion" tipo="Money" size="20" onblur="validaNoSeaMayor();" required message="El Importe de Condonaci�n es un dato obligatorio"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">
                <input type="text" name="decFecCalcHono" id="decFecCalcHono" tipo="AlphaNumeric" size="5" style="visibility:hidden"/>
                <input type="text" name="decCveTipoHono" id="decCveTipoHono" tipo="AlphaNumeric" size="5" style="visibility:hidden"/>
                <input type="text" name="decImpRemHonor" id="decImpRemHonor" tipo="Num" size="5" style="visibility:hidden"/>
                <input type="text" name="decCvePersFid" id="decCvePersFid" tipo="AlphaNumeric" size="5" style="visibility:hidden"/>
                <input type="text" name="decNumPersFid" id="decNumPersFid" tipo="Num" size="5" style="visibility:hidden"/>
                <input type="text" name="decDiaPerDel" id="decDiaPerDel" tipo="AlphaNumeric" size="5" style="visibility:hidden"/>
                <input type="text" name="decMesPerDel" id="decMesPerDel" tipo="AlphaNumeric" size="5" style="visibility:hidden"/>
                <input type="text" name="decAnoPerDel" id="decAnoPerDel" tipo="AlphaNumeric" size="5" style="visibility:hidden"/>
                <input type="text" name="decDiaPerAl" id="decDiaPerAl" tipo="AlphaNumeric" size="5" style="visibility:hidden"/>
                <input type="text" name="decMesPerAl" id="decMesPerAl" tipo="AlphaNumeric" size="5" style="visibility:hidden"/>
                <input type="text" name="decAnoPerAl" id="decAnoPerAl" tipo="AlphaNumeric" size="5" style="visibility:hidden"/>
                <input type="text" name="decNumSecuencial" id="decNumSecuencial" tipo="Num" size="5" style="visibility:hidden"/>
                <input type="text" name="txtFechaDel" id="txtFechaDel" tipo="AlphaNumeric" size="12" style="visibility:hidden"/>
                <input type="text" name="txtFechaAl" id="txtFechaAl" tipo="AlphaNumeric" size="12" style="visibility:hidden"/>
                <input type="text" name="folio" id="folio" tipo="AlphaNumeric" size="12" style="visibility:hidden"/>

        </td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="BUTTON" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="aplicaFuncion();"/>
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-primary" onclick="cargaPrincipalCondonacionHonorarios();"/>
        </td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
  </table>
</FORM>
