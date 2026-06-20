<form name="frmMantenimientoTransacciones" id="frmMantenimientoTransacciones" action="EnvioNotificacion.do" method="POST" enctype="multipart/form-data" target="frmEnvio">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento a Envio de Notificaciones</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td width="15%">&nbsp;</td>
            <td nowrap>No. Notificacion</td>
            <td>
              <input type="text" name="fnotSecuencial" id="fnotSecuencial" size="10" maxlength="10" tipo="Num"/>
              <input type="hidden" name="fnotSecuencialHdn" id="fnotSecuencialHdn" value="1"/>
            </td>
            <td colspan="2" nowrap>&nbsp;</td>
            <td nowrap>&nbsp;</td>
            <td width="15%">&nbsp;</td>
          </tr>		  
          <tr>
            <td width="15%">&nbsp;</td>
            <td nowrap>Nombre</td>
            <td colspan="4">
              <input type="text" name="fnotNombre" id="fnotNombre" size="70" maxlength="70" tipo="AlphaNumeric" required message="El nombre de la Notificacion es un campo obligatorio"/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td colspan="5" nowrap>
              <hr/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td nowrap>Descripci&oacute;n</td>
            <td>
              <input type="text" name="fnotDescripcion" id="fnotDescripcion" size="60" maxlength="255"  required message="La Descripcion de la Notificacion es un campo obligatorio"/>
              <input type="text" name="paramGuia" id="paramGuia" maxlength="2" size="2" style="visibility:hidden"/>
            </td>
            <td colspan="3">&nbsp;</td>
            <td width="15%">&nbsp;</td>
          </tr>

          <tr>
            <td width="15%">&nbsp;</td>
            <td nowrap colspan="5">&nbsp;
            <select size="0" name="cmbMinimoDatoGuia" id="cmbMinimoDatoGuia" fun="loadComboElement" keyValue="dtrKeyAplDato" theValue="dtrCveAplDato" style="visibility:hidden"/></td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td nowrap>Status</td>
            <td>
              <select size="1" name="fnotCveStNotif" id="fnotCveStNotif" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbStatusParam" next="cveTransacciones" required message="El status es un campo obligatorio"/>
            </td>
            <td colspan="3">&nbsp;</td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td colspan="3">&nbsp;</td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr id="trArchivo" style="visibility:hidden;">
            <td width="15%">&nbsp;</td>
            <td nowrap>Adjuntar Archivo</td>
            <td>
              <input type="file" accept="*.pdf,application/pdf" name="archivoPDF" size="70" />
            </td>
            <td colspan="3">&nbsp;</td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td colspan="3">&nbsp;</td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td align="left" class="subtitulo" width="15%">&nbsp;</td>
            <td align="left" class="subtitulo" colspan="5">&nbsp;Clientes Destinatarios</td>
            <td align="left" class="subtitulo" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td rowspan="1" colspan="3" align="center">
              <select size="11" name="cveTransacciones" id="cveTransacciones" ref="conAuxsEnvio" fun="loadComboElement" keyValue="conNumSecContac" theValue="dtrCveAplDato" next="asignaPK2ObjHTML"/>
            </td>
            <td align="center" nowrap rowspan="1">
              <P align="center">
                <input type="button" value="Agregar" name="cmdAgregar" id="cmdAgregar" onclick="agregarClave(GI('cveTransacciones'),GI('cmbDatoTran'));" style="visibility:hidden"/>
              </P>
              <P>
                <input type="button" value="Quitar " name="cmdQuitar" id="cmdQuitar" onclick="quitarClave(GI('cmbDatoTran'));" style="visibility:hidden"/>
              </P>
            </td>
            <td rowspan="1" align="center">
              <select size="11" name="cmbDatoTran" id="cmbDatoTran" fun="loadComboElement" keyValue="dtrKeyAplDato" theValue="dtrCveAplDato"/>
            </td>
            <td rowspan="1" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td align="left" class="subtitulo" width="15%">&nbsp;</td>
            <td align="center" class="subtitulo" colspan="5">&nbsp;</td>
            <td align="left" class="subtitulo" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="7">
              <input type="button" value="Aceptar " name="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="ejecutaOperacionTransaccion();" style="visibility:hidden"/>
              <input type="button" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="onButtonClickPestania('Interfases.Transacciones.PrincipalTransacciones','')" style="visibility:hidden"/>
              <input type="button" value="Enviar" name="cmdEnviar" id="cmdEnviar" class="btn btn-primary" onclick="doEnvioTransaccion();" style="visibility:hidden"/>              
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</form>
<iframe id="frmEnvio" name="frmEnvio" style="visibility:hidden" src="" width="10px" height="10px"></iframe>

