<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento Parametrizaci�n de Ventanas</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%"  width="100%">
        <table width="90%" align="center" class="texto" border="0">
          <tr valign="middle">
            <td valign="middle" nowrap colspan="4">&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>No. Ventana</td>
            <td valign="middle" width="8%" nowrap>
              <input type="text" name="patIdVentana" id="patIdVentana" size="5" maxlength="5" tipo="Num" required message="El n�mero de Ventana es obligatorio"/>
            </td>
            <td valign="middle" width="8%" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="middle" height="6" width="5%" nowrap>Pizarra</td>
            <td valign="middle" height="6" width="8%" colspan="2">
              <select name="patIdPizarra" id="patIdPizarra" ref="conPriEmi" fun="loadComboElement" keyValue="emiNomPizarra" theValue="emiNomPizarra" next="patIdCupon" param="cmbPizarra" required message="La Pizarra es un campo obligatorio"/>
            </td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Tipo de Par�metro</td>
            <td valign="middle" width="8%" nowrap>
              <select size="1" name="patIdCupon" id="patIdCupon" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave"  param="clavesCombo703" next="cargaDatosVentana" required message="El tipo de par�metro es un campo obligatorio"/>
            </td>
            <td valign="middle" width="8%" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Serie</td>
            <td valign="middle" width="8%" nowrap>
              <input type="text" name="patIdSerie" id="patIdSerie" size="10" maxlength="25"/>
            </td>
            <td valign="middle" width="8%" nowrap>&nbsp;</td>
          </tr>
          
          
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td valign="middle" nowrap colspan="2">
              
              <table class="texto" cellspacing=0 cellpadding=1>
                  <tr valign="middle">
                    <td valign="middle" nowrap colspan="5" class="subtitulo">
                      Horario Ventana<hr/>  
                    </td>
                  </tr>
                  <tr valign="middle">
                    <td width="5%" valign="middle" nowrap>Hora Inicio</td>
                    <td valign="middle" width="8%" nowrap>
                      <input type="text" id="patHoraInicio" name="patHoraInicio" maxlength="5" size="8" value="00:00" required message="La Hora Inicio es un campo obligatorio formato (hh:mm)"/>
                    </td>
                    <td valign="middle" width="8%" nowrap>Hora Fin</td>
                    <td width="5%" valign="middle" nowrap>
                      <input type="text" id="patHoraFin" name="patHoraFin" maxlength="5" size="8" value="00:00" required message="La Hora Fin es un campo obligatorio formato (hh:mm)"/>
                    </td>
                  </tr>
              </table>
              
            </td>
            <td valign="middle" width="8%" nowrap>&nbsp;</td>
          </tr>
          
        </table>
      </td>
    </tr>
    <tr>
      <td colspan="5" height="100%">&nbsp;&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="ejecutaOperacion();" style="visibility:hidden"/>
        <input type="BUTTON" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="regresar()" style="visibility:hidden"/>
      </td>
    </tr>
  </table>
</FORM>
