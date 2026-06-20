<!--Version de Formalizacion/Proyectos-->
<FORM name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;" class="texto">
      <tr>
        <td colspan="4" align="center" height="100%" class="titulo">Firmantes</td>
      </tr>
      <tr>
        <td colspan="4" height="100%">&nbsp;</td>
      </tr>
          <tr>
            <td>Fideicomiso</td>
            <td nowrap>
              <input type="text" name="ffIdFideicomiso" id="ffIdFideicomiso" tipo="Num" size="10" maxlength="10" /> <!---->
             </td>
            <td>Tipo Cuenta</td>
            <td align="left">
            <input type="text" name="frdsTipoCta" id="frdsTipoCta" size="50" maxlength="50" /> <!---->
            </td>
          </tr>  
          <tr>
            <td>No. Cuenta</td>
            <td nowrap>
              <input type="text" name="ffNo" id="ffNo" tipo="Num" size="10" maxlength="10"  required message="El Numero de Fideicomiso es un campo obligatorio" /> <!---->
             </td>
            <td>&nbsp;</td>
            <td align="left">&nbsp;</td>
          </tr>
          <tr>
            <td>Nombre</td>
            <td nowrap>
              <input type="text" name="ffNombre" id="ffNombre" size="60" maxlength="60"  required message="El Nombre es un campo obligatorio" /> <!---->
             </td>
            <td>Titularidad</td>
            <td align="left">
              <select size="1" name="ffTitularidad" id="ffTitularidad" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesComboTitularidad"  next="ffTipoDeFirma"/> <!---->
            </td>
          </tr>	  
          <tr>
            <td>Tipo de Firma</td>
            <td nowrap>
              <select size="1" name="ffTipoDeFirma" id="ffTipoDeFirma" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesComboTipoFirma"  next="loadCatalogo"/> <!---->
             </td>
            <td>&nbsp;</td>
            <td align="left">&nbsp;</td>
          </tr>  
      <tr>
        <td colspan="4" height="100%">&nbsp;</td>
      </tr>		  
      <tr>
        <td colspan="4" align="center">
          <input type="BUTTON" value="Aceptar " name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalFinalidadesContrato();" style="visibility:hidden"/>
        </td>
      </tr>
      
  </table>
