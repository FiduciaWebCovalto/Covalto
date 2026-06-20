<FORM name="frmMantenimientoGarantias" id="frmMantenimientoGarantias" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento Garantias</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" align="center" class="texto">
          <tr>
            <td >Fideicomiso:</td>
            <td  >
              <input type="text" name="fgarIdFideicomiso" id="fgarIdFideicomiso" tipo="Num" size = "10" maxlength="10" required message = "Valor obligatorio" onblur="consultaNombreFideicomiso('nomFideicomiso',this);"/>
            </td>
            <td><div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div></td>
            <td >&nbsp;     
            </td>
          </tr>
          <tr>
            <td >Sub. Fiso:</td>
            
            <td  >
              <input type="text" name="fgarIdSubcuenta" id="fgarIdSubcuenta" tipo="Num" size = "10" maxlength="10"/>
            </td>
            <td>&nbsp;</td>
            <td >&nbsp;     
            </td>
            <td ><input type="hidden" id="paramUsuario" name="paramUsuario" value="<%=session.getAttribute("userid").toString()%>"/></td>
          </tr>
          <tr>
            <td >Tipo de Bien:</td>
            <td  >
                <select size="1" name="fgarCveGarantia" id="fgarCveGarantia" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" param="clavesCombo38" next="fgarCveStatus" required message = "Valor obligatorio"/>
            </td>
            <td  >&nbsp;</td>
            <td  >
              &nbsp;
            </td>
            <td ><input type="hidden" id="paramMesAbierto" name="paramMesAbierto" value="<%=session.getAttribute("mesAbiertoLbl")%>"/></td>
          </tr>
           <tr>
            <td  >Descripcion </td>
            <td  >
              <textarea cols="35" name="fgarTexGarantia" id="fgarTexGarantia"/></textarea>
            </td>
            <td  >&nbsp;</td>
            <td  >
              &nbsp;
            </td>
            <td >&nbsp;</td>
          </tr>
           <tr>
            <td >Comentario</td>
            <td  >
              <textarea cols="35" name="fgarTexComentario" id="fgarTexComentario"></textarea>
            </td>
            <td  >&nbsp;</td>
            <td  >
              &nbsp;
            </td>
            <td >&nbsp;</td>
          </tr>
           <tr>
            <td >Importe Bien</td>
            <td  >
              <input type="text" name="fgarImpGarantia" id="fgarImpGarantia" tipo="Money" value="0.0" prec="16.4" size="20" maxlength="20"/>
            </td>
            <td>&nbsp;</td>
            <td >&nbsp;
            </td>
            <td >&nbsp;</td>
          </tr>
          <tr>
            <td >Estatus</td>
            <td  >
              <select size="1" name="fgarCveStatus" id="fgarCveStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="loadCatalogo" param="clavesCombo31"/>
            </td>
            <td colspan="2">
              
            </td>
            <td align="left" >&nbsp;</td>
          </tr>
          <tr>
            <td >&nbsp;</td>
            <td  >&nbsp;
             </td>
            <td colspan="2">
              
            </td>
            <td align="left" >&nbsp;</td>
          </tr>
          <tr>
            <td >&nbsp;</td>
            <td  >
              <input type="text" name="fcoDiaDia" id="fcoDiaDia" size="2" style="visibility:hidden"/>
              <input type="text" name="fcoMesDia" id="fcoMesDia" size="2" style="visibility:hidden"/>
              <input type="text" name="fcoAnoDia" id="fcoAnoDia" size="4" style="visibility:hidden"/>
             </td>
            <td colspan="2">
              
            </td>
            <td align="left" >&nbsp;</td>
          </tr>
           <tr>
            <td colspan="5" align="center">
              
      </td>
    </tr>
     <tr>
            <td colspan="5" align="center">
              <input type="button" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="button" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="onButtonClickPestania('Garantias.Garantias.PrincipalGarantias','')" style="visibility:hidden"/>
            </td>
          </tr>
    <tr>
    </tr>
  </table>
</FORM>