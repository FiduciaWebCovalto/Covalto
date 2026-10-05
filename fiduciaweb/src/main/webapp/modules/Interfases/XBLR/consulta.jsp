<form name="frmDatosXBLR" id="frmDatosXBLR" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo"><br/><br/>Archivo XBLR</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <br/><br/>
        <table width="90%" class="texto">
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Fecha</td>
            <td>
              <input type="text" name="paramFECHA" id="paramFECHA" size="10" maxlength="10" tipo="Fecha" message="La Fecha es un campo obligatorio" required/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">No. Fideicomiso</td>
            <td>
              <input type="text" name="paramFISO" id="paramFISO" size="10" tipo="Num" maxlength="70" message="El número de fideicomiso es un campo obligatorio" required/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" colspan="4">&nbsp;
              <br/><br/>
              <input type="BUTTON" value="Generar Archivo" id="cmdArchivo" name="cmdArchivo" class="boton_left" onclick="generarArchivo();">
              &nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" name="cmdLimpiar" class="btn btn-warning"  onclick="limpiar();"/>
              <div stle="visibility:hidden;">
                <a id="lnkExcelDownload" href="modules/Interfases/XBLR/reporteXBLR.do" />
              </div>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</form>
