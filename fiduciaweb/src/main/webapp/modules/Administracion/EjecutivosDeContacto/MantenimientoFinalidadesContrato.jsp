<!--Version de Formalizacion/Proyectos-->
<FORM name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;" class="texto">
      <tr>
        <td colspan="4" align="center" height="100%" class="titulo">Ejecutivos</td>
      </tr>
      <tr>
        <td colspan="4" height="100%">&nbsp;</td>
      </tr>
          <tr>
            <td>No. Fideicomiso</td>
            <td nowrap>
              <input type="text" name="fedcIdFideicomiso" id="fedcIdFideicomiso" tipo="Num" size="10" maxlength="10" /> <!---->
             </td>
            <td>Tipo Cuenta</td>
            <td align="left">
            <input type="text" name="frdsTipoCta" id="frdsTipoCta" size="50" maxlength="50" /> <!---->
            </td>
          </tr>  
          <tr>
            <td>No. Cuenta</td>
            <td nowrap>
              <input type="text" name="fedcNo" id="fedcNo" tipo="Num" size="10" maxlength="10"  required message="El Numero de Fideicomiso es un campo obligatorio" /> <!---->
             </td>
            <td>&nbsp;</td>
            <td align="left">
            &nbsp;
            </td>
          </tr>
          <tr>
            <td>Nombre</td>
            <td nowrap>
              <input type="text" name="fedcNombre" id="fedcNombre" size="50" maxlength="50"  required message="El Nombre es un campo obligatorio" /> <!---->
             </td>
            <td>E Mail</td>
            <td align="left">
              <input type="text" name="fedcEMail" id="fedcEMail"  size="50" maxlength="50"  required message="El Correo es un campo obligatorio" /> <!---->
            </td>
          </tr>
          <tr>
            <td>Domicilio</td>
            <td nowrap>
              <input type="text" name="fedcDomicilio" id="fedcDomicilio"  size="50" maxlength="50"   /> <!---->
             </td>
            <td>Telefono 1</td>
            <td align="left">
              <input type="text" name="fedcTelefono1" id="fedcTelefono1"  size="50" maxlength="50" required message="El Num de Telefono es un campo obligatorio"/> <!---->
            </td>
          </tr>  
	<tr>
            <td>Ext 1</td>
            <td nowrap>
              <input type="text" name="fedcExt" id="fedcExt" tipo="Num" size="10" maxlength="10"  required message="El Num de Ext es un campo obligatorio" /> <!---->
             </td>
            <td>Telefono 2</td>
            <td align="left">
                  <input type="text" name="fedcTelefono2" id="fedcTelefono2" size="50" maxlength="50"/>
            </td>
         </tr> 
         <tr>
            <td>Ext 2</td>
            <td nowrap>
              <input type="text" name="fedcExt2" id="fedcExt2" tipo="Num" size="10" maxlength="10"/>
             </td>
            <td>Tel Celular</td>
            <td align="left">
              <input type="text" name="fedcTelefonoCelular" id="fedcTelefonoCelular" size="50" maxlength="50"/>
            </td>
          </tr>
          <tr>
            <td>Observaciones</td>
            <td nowrap>
              <input type="text" name="fedcObservaciones" id="fedcObservaciones"  size="50" maxlength="100"/>
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
