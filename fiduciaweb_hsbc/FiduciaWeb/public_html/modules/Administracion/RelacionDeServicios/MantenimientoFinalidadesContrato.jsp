<!--Version de Formalizacion/Proyectos-->
<form name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;" class="texto">
        <tr>
            <td align="center" height="100%" class="titulo" colspan="4">Servicios</td>
        </tr>
        <tr>
            <td height="100%" colspan="4">&nbsp;</td>
        </tr>
        <tr>
            <td>Fideicomiso</td>
            <td nowrap="nowrap">
                <input type="text" name="frdsIdFidei" id="frdsIdFidei" tipo="Num" size="10" maxlength="10"/><!---->
            </td>
            <td>Tipo Cuenta</td>
            <td align="left">
                <input type="text" name="frdsTipoCta" id="frdsTipoCta" size="50" maxlength="50"/><!---->
            </td>
        </tr>
        <tr>
            <td>No. Cuenta</td>
            <td nowrap="nowrap">
                <input type="text" name="frdsNo" id="frdsNo" tipo="Num" size="10" maxlength="10" required="required" message="El Numero de Fideicomiso es un campo obligatorio"/><!---->
            </td>
            <td>&nbsp;</td>
            <td align="left">&nbsp;</td>
        </tr>
        <tr>
            <td>Servicio</td>
            <td nowrap="nowrap">
                <select size="1" name="frdsServicio" id="frdsServicio" ref="claves" fun="loadComboElement" keyvalue="cveDescClave" thevalue="cveDescClave" param="clavesComboServicio" next="formsLoaded" required="required"></select>
            </td>
            <td>Contrato / Afiliacion</td>
            <td align="left">
                <input type="text" name="frdsContratoafiliacion" id="frdsContratoafiliacion" size="50" maxlength="50" required="required" message="El Contrato Filiacion es un campo obligatorio"/><!---->
            </td>
        </tr>
        <tr>
            <td>Detalle</td>
            <td nowrap="nowrap">
                <input type="text" name="frdsDetalle" id="frdsDetalle" size="50" maxlength="100" required="required" message="El Detalle es un campo obligatorio"/><!---->
            </td>
            <td>&nbsp;</td>
            <td align="left">&nbsp;</td>
        </tr>
        <tr>
            <td height="100%" colspan="4">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="4" align="center">
                <input type="BUTTON" value="Aceptar " name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
                <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalFinalidadesContrato();" style="visibility:hidden"/>
            </td>
        </tr>
    </table>
</form>