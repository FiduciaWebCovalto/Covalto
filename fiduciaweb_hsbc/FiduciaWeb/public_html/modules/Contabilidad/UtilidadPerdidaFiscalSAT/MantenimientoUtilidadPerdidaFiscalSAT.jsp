<form name="frmDatos2" id="frmDatos2">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Utilidad / P&eacute;rdida
                                                      / Ingresos /
                                                      Aportaciones SAT</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td width="38%">&nbsp;</td>
            <td nowrap width="10%">Fideicomiso</td>
            <td>
              <input type="text" name="fsaNumContrato" id="fsaNumContrato" size="10" maxlength="10" tipo="Num" onblur="validarPkAlta(this);" required message="El Fideicomiso es un campo obligatorio"/>
            </td>
              <td valign="middle" colspan="5">
                <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
              </td>
          </tr>
          <tr>
            <td width="38%">&nbsp;</td>
            <td nowrap width="10%">A&ntilde;o</td>
            <td>
              <input type="text" name="fsaAno" id="fsaAno" size="4" maxlength="4" tipo="Num" required message="El A�o es un campo obligatorio" onblur="if(this.value.length < 4&&this.value.length >0){alert('Introduzca un A�o valido!');this.focus();}"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="38%">&nbsp;</td>
            <td nowrap width="10%">Mes</td>
            <td>
              <input type="text" name="fsaMes" id="fsaMes" size="2" maxlength="2" tipo="Num" required message="El Mes es un campo obligatorio" onblur="if(this.value > 12){alert('Introduzca un Mes valido!');this.focus();}"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="38%">&nbsp;</td>
            <td nowrap width="10%">Tipo Dato</td>
            <td>
              <select size="1" name="fsaTipo" id="fsaTipo" required message="EL Tipo es un campo obligatorio">
                <option value="-1">-- Seleccione --</option>
                <option value="UTILIDAD">UTILIDAD</option>
                <option value="PERDIDA">PERDIDA</option>
                <option value="INGRESO">INGRESO</option>
                <option value="APORTACION">APORTACION</option>
              </select>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="38%">&nbsp;</td>
            <td nowrap width="10%">Tipo Persona</td>
            <td>

              <select size="1" name="fsaTipoPers" id="fsaTipoPers" required message="EL Tipo de Persona es un campo obligatorio">
                <option value="-1">-- Seleccione --</option>
                <option value="1">FIDEICOMISO</option>
                <option value="2">FIDEICOMITENTE</option>
                <option value="3">FIDEICOMISARIO</option>
              </select>            
            </td>
            <td>&nbsp;</td>
          </tr>          
          <tr>
            <td width="38%">&nbsp;</td>
            <td nowrap width="10%">Numero Persona</td>
            <td>
              <input type="text" name="fsaNumTipoPers" id="fsaNumTipoPers" size="2" maxlength="2" tipo="Num" required message="EL Numero de Persona es un campo obligatorio"  reqPrecValue/>
            </td>
            <td>&nbsp;</td>
          </tr>          
          <tr>
            <td width="38%">&nbsp;</td>
            <td nowrap width="10%">Importe</td>
            <td>
              <input type="text" name="fsaImporte" id="fsaImporte" size="19" maxlength="19" tipo="Money" prec="14.2" required message="El Importe es un campo obligatorio" reqPrecValue/>
            </td>
            <td>&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="ejecutaOperacionUtilidadPerdida();" style="visibility:hidden"/>
        <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="onButtonClickPestania('Contabilidad.UtilidadPerdidaFiscalSAT.PrincipalUtilidadPerdidaFiscalSAT','');" style="visibility:hidden"/>
      </td>
    </tr>
  </table>
</form>
