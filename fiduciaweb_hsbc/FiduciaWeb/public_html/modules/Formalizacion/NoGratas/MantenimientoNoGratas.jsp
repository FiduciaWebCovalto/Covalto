<FORM name="frmDatosMantenimientoFideicomitentes" id="frmDatosMantenimientoFideicomitentes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Personas no Gratas</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
          <table border="0" width="100%" class="texto">
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Secuencial</td>
              <td>
                <input type="text" name="pngNumSec" id="pngNumSec" tipo="Num" size="10" maxlength="10" disabled/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Nombre de la Persona</td>
              <td>
                <input type="text" name="pngNombre" id="pngNombre" size="50" maxlength="250"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
      </tr>
      <tr align="center">
      <td width="10%">&nbsp;</td>
        <td height="100%">
          <input type="button" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();"/>
        </td>
        <td height="100%">
            <input type="BUTTON" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalProspectosFideicomitentes();" />
        </td>
      </tr>
      
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
