<!--Version de Formalizacion/Proyectos-->
<FORM name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;" class="texto">
      <tr>
        <td colspan="4" align="center" height="100%" class="titulo">Cuentas Bancarias y de Inversion</td>
      </tr>
      <tr>
        <td colspan="4" height="100%">&nbsp;</td>
      </tr>
          <tr>
            <td width="30%">No. Fideicomiso</td>
            <td width="20%" nowrap>
              <input type="text" name="fciNumFideicomiso" id="fciNumFideicomiso" tipo="Num" size="10" maxlength="10"  required message="El Numero de Fideicomiso es un campo obligatorio" onchange="CargaComboCuentas();"/> <!---->
           </td>
            <td width="30%">&nbsp;</td>
            <td width="20%">&nbsp;</td>
          </tr>  

          <tr>
            <td>No. de Cuenta</td>
            <td nowrap>
              <input type="text" name="fciNumCta" id="fciNumCta" size="10" maxlength="10"  required message="El Numero de Cuenta es un campo obligatorio" /> <!---->
             </td>
            <td nowrap>Tipo de Cuenta</td>
            <td align="left">
              <select size="1" name="fciTipoCta" id="fciTipoCta" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1132"  next="fciIntermediario" required message="El Tipo de Cuenta es un campo obligatorio"/> <!---->
            </td>
          </tr>  
		  
		  <tr>
            <td>Titular de la Cuenta</td>
            <td nowrap>
              <input type="text" name="fciTitDeCta" id="fciTitDeCta"  size="50" maxlength="50"  required message="El Titular es un campo obligatorio" /> <!---->
             </td>
            <td>Intermediario</td>
            <td align="left">
              <select size="1" name="fciIntermediario" id="fciIntermediario" ref="conNumIntNomInt" fun="loadComboElement" keyValue="intIntermediario" theValue="intIntermediario" next="fciMoneda" required message="El Intermediario es un campo obligatorio" />
            </td>
          </tr>   	
		  
			  
          <tr>
            <td>Moneda</td>
            <td nowrap>
              <select name="fciMoneda" id="fciMoneda" ref="conNumMonNomMon" fun="loadComboElement" keyValue="monNumPais" theValue="monNomMoneda" next="fciPais" required message="La Moneda es un campo obligatorio"/>
             </td>
            <td>Pa&iacute;s</td>
            <td align="left">
              <select name="fciPais" id="fciPais" ref="clavePaisCat" fun="loadComboElement" keyValue="paiNumPais" theValue="paiNomPais" next="fciEstatusFisIsr" />
            </td>
          </tr>  	

          <tr>
            <td>Fecha de Apertura</td>
            <td nowrap>
              <input type="text" name="fciFeDeAp" id="fciFeDeAp"  tipo="Fecha" size="10"   required message="El Numero de Prospecto es un campo obligatorio" /> <!---->
             </td>
            <td>CLABE</td>
            <td align="left">
              <input type="text" name="fciClabe" id="fciClabe" size="18" maxlength="18" /> <!---->
            </td>
          </tr> 


          <tr>
            <td>Estatus Fiscal ISR</td>
            <td nowrap>
                <select size="1" name="fciEstatusFisIsr" id="fciEstatusFisIsr" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1113"  next="fciFormaManejo"/> <!---->
             </td>
            <td>RFC Cuenta</td>
            <td align="left">
              <input type="text" name="fciRfcDeLaCta" id="fciRfcDeLaCta"  size="20" maxlength="20"  required message="El RFC es un campo obligatorio" /> <!---->
            </td>
          </tr> 

          <tr>
            <td>Domicilio Cuenta</td>
            <td nowrap>
                <input type="text" name="fciDomDeLaCta" id="fciDomDeLaCta" size="50" maxlength="50"  required message="El Domicilio es un campo obligatorio" /> <!---->
             </td>
            <td>Forma Manejo</td>
            <td align="left">
              <select size="1" name="fciFormaManejo" id="fciFormaManejo" ref="cves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="cmbFormaManejoParam" next="fciCtaRel"/>
            </td>
          </tr>   	

          <tr>
            <td>Cuenta Relacionada</td>
            <td nowrap>
              <select name="fciCtaRel" id="fciCtaRel" ref="muestraCuentaBancaria" fun="loadComboElement" keyValue="fcbaClabeCba" theValue="fcbaClabeCba"  param="fideo" next="fciEstatus"/>
                        
             </td>
            <td>Status</td>
            <td align="left">
                <select name="fciEstatus" id="fciEstatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo31" next="fciContratoEnviado" required message="El Status es un campo obligatorio">
                </select>
                <input type="text" name="fciUsuario" id="fciUsuario"  value="<%=session.getAttribute("userid")%>" style="visibility:hidden"/>
            </td>
          </tr> 		  
		  
          <tr>
            <td>Status Hogan</td>
            <td nowrap>
              <input type="text" name="fciEstatusHogan" id="fciEstatusHogan" size="10" maxlength="10"  /> <!---->
             </td>
            <td nowrap>Nombre Cuenta</td>
            <td align="left">
              <input type="text" name="fciNombreCta" id="fciNombreCta" size="50" maxlength="50"  required message="El Nombre de la Cuenta es un campo obligatorio" /> <!---->
          </tr>
         <tr>
            <td>Observaci&oacute;n</td>
            <td nowrap>
              <input type="text" name="fciObservac" id="fciObservac" size="50" maxlength="50"  required message="La Observacion es un campo obligatorio" /> <!---->
             </td>
            <td nowrap>Contrato Enviado</td>
            <td align="left">
              <select size="1" name="fciContratoEnviado" id="fciContratoEnviado" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1115"  next="loadCatalogo"/> <!---->
            </td>
          </tr>
         <tr>
            <td>Monto del Embargo</td>
            <td nowrap>
                <input type="text" name="fciMontoEmbargo" id="fciMontoEmbargo" size="50" maxlength="50"  required message="Monto del Embargo es un campo obligatorio" />
            </td>
          </tr> 
      <tr>
        <td colspan="4" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td colspan="4" align="center">
          <input type="BUTTON" value="Servicios" name="cmdServicios" id="cmdServicios" class="btn btn-primary" onclick="cargaPrincipalPantallasAlternas(1);" style="visibility:hidden"/>
          <input type="BUTTON" value="Firmantes" name="cmdFirmantes" id="cmdFirmantes" class="btn btn-primary" onclick="cargaPrincipalPantallasAlternas(2);" style="visibility:hidden"/>
          <input type="BUTTON" value="Ejecutivos" name="cmdEjecutivos" id="cmdEjecutivos" class="btn btn-primary" onclick="cargaPrincipalPantallasAlternas(3);" style="visibility:hidden"/>          
        </td>
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
</FORM>

            