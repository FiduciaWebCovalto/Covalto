<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento Parametrizaci�n PLD</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%"  width="100%">
        <table width="100%" align="center" class="texto" border="0">
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>No. Fideicomiso</td>
            <td valign="middle" width="8%" nowrap>
              <input type="text" name="farIdContrato" id="farIdContrato" size="5" maxlength="5" tipo="Num" required message="El n�mero de Fideicomiso es obligatorio" onblur="verificacionActivo(this);"/>
            </td>
            <td valign="middle" width="8%" nowrap>
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Moneda</td>
            <td valign="middle" width="8%" nowrap>
              <input type="text" name="txtMoneda" id="txtMoneda" size="30" maxlength="50"/>
            </td>
            <td valign="middle" width="8%" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="middle" height="6" width="5%" nowrap>Tipo Operaci�n</td>
            <td valign="middle" height="6" width="8%" colspan="2">
              <select name="farIdTipoOperacion" id="farIdTipoOperacion" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" next="farValidaMonedaEftvo" param="clavesCombo702" required message="El Tipo Operaci�n es obligatorio"/>
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          
          <!--  DEPOSITOS  -->
          
          <tr>
            <td valign="middle" height="6"  colspan="5" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="left" height="6" width="5%" colspan="3" class="subtitulo">
                DEPOSITOS<hr/>
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="middle" height="6" width="5%" nowrap>
              Valida Dep�sitos
            </td>
            <td valign="middle" height="6" width="8%" colspan="2">
              <input type="checkbox" name="farValidaDepositoChk" id="farValidaDepositoChk" class="check" tv="1" fv="2"/>
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="left" height="6" width="5%" colspan="3" class="subtitulo">
                Moneda Nacional
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Individual de Dep�sitos</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpDeposito" id="farImpDeposito" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Acumulado Mensual de Dep�sitos</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpMesDeposito" id="farImpMesDeposito" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="left" height="6" width="5%" colspan="3" class="subtitulo">
                Moneda Extranjera
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Individual de Dep�sitos Ext.</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpDepositoExt" id="farImpMesDepositoExt" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Acumulado Mensual de Dep�sitos Ext.</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpMesDepositoExt" id="farImpMesDepositoExt" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          
          <!--  RETIROS  -->
          
          <tr>
            <td valign="middle" height="6"  colspan="5" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="left" height="6" width="5%" colspan="3" class="subtitulo">
                RETIROS<hr/>
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="middle" height="6" width="5%" nowrap>
              Valida Retiros
            </td>
            <td valign="middle" height="6" width="8%" colspan="2">
              <input type="checkbox" name="farValidaRetiroChk" id="farValidaRetiroChk" class="check" tv="1" fv="2"/>
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="left" height="6" width="5%" colspan="3" class="subtitulo">
                Moneda Nacional
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Individual de Retiros</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpRetiro" id="farImpRetiro" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Acumulado Mensual de Retiros</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpMesRetiro" id="farImpMesRetiro" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="left" height="6" width="5%" colspan="3" class="subtitulo">
                Moneda Extranjera
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Individual de Retiros Ext.</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpRetiroExt" id="farImpRetiroExt" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Acumulado Mensual de Retiros Ext.</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpMesRetiroExt" id="farImpMesRetiroExt" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          
          <!--  DEPOSITOS EFECTIVO  -->
          
          <tr>
            <td valign="middle" height="6"  colspan="5" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="left" height="6" width="5%" colspan="3" class="subtitulo">
                DEPOSITOS EN EFECTIVO<hr/>
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="middle" height="6" width="5%" nowrap>
              Valida D�positos en Efectivo
            </td>
            <td valign="middle" height="6" width="8%" colspan="2">
              <input type="checkbox" name="farValidaDepositoEftvoChk" id="farValidaDepositoEftvoChk" class="check" tv="1" fv="2"/>
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <!--tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="left" height="6" width="5%" colspan="3" class="subtitulo">
                Moneda Nacional
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Individual de D�positos en Efectivo</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpDepositoEftvo" id="farImpDepositoEftvo" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Acumulado Mensual de D�positos en Efectivo</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpMesDepositoEftvo" id="farImpMesDepositoEftvo" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr-->
          
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td align="left" height="6" width="5%" colspan="3" class="subtitulo">
                Moneda Extranjera
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Moneda de Dep�sito en Efectivo</td>
            <td valign="middle" width="8%" colspan="2">
              <select size="1" name="farValidaMonedaEftvo" id="farValidaMonedaEftvo" ref="claveMoneda" fun="loadComboElement" keyValue="monNumPais" theValue="monNomMoneda" next="farCveStActividad"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Individual de D�positos en Efectivo <br>Ext.</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpDepositoEftvoExt" id="farImpDepositoEftvoExt" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          <tr valign="middle">
            <td width="8%" valign="middle" nowrap>&nbsp;</td>
            <td width="5%" valign="middle" nowrap>Importe Acumulado Mensual de D�positos en Efectivo <br>Ext.</td>
            <td valign="middle" width="8%" colspan="2">
              <input type="text" name="farImpMesDepositoEftvoExt" id="farImpMesDepositoEftvoExt" size="10" maxlength="18" tipo="Num"/>
            </td>
            <td width="5%" valign="middle" nowrap>&nbsp;</td>
          </tr>
          
          
          
          <tr valign="middle">
            <td valign="middle" colspan="5">&nbsp;</td>
          </tr>
          <tr>
            <td valign="middle" height="6" width="8%" nowrap>&nbsp;</td>
            <td valign="middle" height="6" width="5%" nowrap>Estatus</td>
            <td valign="middle" height="6" width="8%" colspan="2">
              <select size="1" name="farCveStActividad" id="farCveStActividad" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo31" next="asignaValues2ObjHTML" required message="El Status es obligatorio"/>
            </td>
            <td valign="middle" height="6" width="5%" nowrap>&nbsp;</td>
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
