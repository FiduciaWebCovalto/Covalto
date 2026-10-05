<%@ page isErrorPage="true"%>
<%exception.printStackTrace();%>
<TD colspan="2" valign="middle" align="center" class="titulo">
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <FORM name="frmReportes" id="frmReportes" onsubmit="">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">
          Ocurrio un error interno al procesar su solicitud.
          <br/>
          Por favor consulte al administrador del sistema.
          <br/><br/>
          <%=mx.com.inscitech.fiducia.common.services.ConfigurationService.getInstance().getProperty("mailAdministrador")%>
        </td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="BUTTON" value="Aceptar " name="cmdAceptar" class="btn btn-primary"/>
          <!--input type="BUTTON" value="Cancelar" name="cmdCancelar" class="btn btn-primary" onclick="();"/!-->
        </td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
    </form>
  </table>
</TD>
