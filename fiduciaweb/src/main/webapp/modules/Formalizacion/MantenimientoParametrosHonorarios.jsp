<FORM name="frmParametrosHonorariosMantenimiento" id="frmParametrosHonorariosMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Mantenimiento a Par&aacute;metros de Honorarios</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="25%">No. Proyecto</td>
              <td width="33%" colspan="2">
                <input type="text" name="pacNumContrato" id="pacNumContrato" tipo="Num" size="10" onblur="mostrarDatosInformativos(2);" required message="El No. Proyecto es un campo obligatorio"/>
              </td>
              <td width="11%">&nbsp;</td>
              <td width="3%">
               &nbsp;
              </td>
              <td width="37%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
                <td colspan="5" width="11%">
                    <input type="text" name="txtNomFiso" id="txtNomFiso" tipo="Num" size="10"  style="visibility:hidden"/>
                </td>
            </tr>
            
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="33%" colspan="2">
                &nbsp;
              </td>
              <td width="11%">&nbsp;</td>
              <td width="3%">
                &nbsp;
              </td>
              <td width="37%">&nbsp;</td>
            </tr>
            <tr>
                <td width="25%">&nbsp;</td>
                <td colspan="3" width="11%">
                   &nbsp;
                </td>
                <td width="33%" colspan="2">&nbsp;</td>
            </tr>
            <tr>
              <td width="11%" colspan="6">
                <hr/>
              </td>
            </tr>
            <tr valign="middle">
              <td class="subtitulo" width="25%" colspan="6">Aceptacion</td>
            </tr>
            <tr>
              <td width="25%" colspan="3">&nbsp;</td>
              <td width="11%">&nbsp;</td>
              <td width="3%">&nbsp;</td>
              <td width="37%">&nbsp;</td>
            </tr>
            <tr>
              <td align="left" width="20%">
                <input type="radio" name="rdAcepFormaCalc" id="rdAcepImpFijo" class="radio" onclick="opcionesRadios(this);" required message="La Forma de Calculo es un campo obligatorio"/>Cuota Fija
              </td>
              <td align="left" valign="middle" width="20%">
                <input type="radio" name="rdAcepFormaCalc" id="rdAcepPorcPactado" class="radio" onclick="opcionesRadios(this);"/>Porcentaje
              </td>
              <td align="left" width="20%" valign="middle">
                <input type="radio" name="rdAcepFormaCalc" id="rdAcepExento" class="radio" onclick="opcionesRadios(this);"/>Exento
              </td>
              <td align="left" width="20%" valign="middle">&nbsp;</td>
              <td align="left" width="20%" valign="middle">&nbsp;</td>
              <td align="left" width="20%" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">Moneda</td>
              <td>
                <select size="1" name="pacNumMonedaAcep" id="pacNumMonedaAcep" ref="claveMoneda" fun="loadComboElement" keyValue="monNumPais" theValue="monNomMoneda" next="pacNumMoneda"></select>
              </td>
              <td>&nbsp;</td>
              <td width="11%"></td>
              <td width="3%">&nbsp;</td>
              <td width="37%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%" colspan="3">&nbsp;</td>
              <td width="11%">&nbsp;</td>
              <td width="3%">&nbsp;</td>
              <td width="37%">&nbsp;</td>
            </tr>
            <tr valign="middle">
              <td class="subtitulo" width="25%" colspan="6">Forma de C&aacute;lculo</td>
            </tr>
            <tr>
              <td width="25%" colspan="3">&nbsp;</td>
              <td width="11%">&nbsp;</td>
              <td width="3%">&nbsp;</td>
              <td width="37%">&nbsp;</td>
            </tr>
            <tr>
              <td align="left" width="20%">
                <input type="radio" name="rdFormaCalc" id="rdImpFijo" class="radio" onclick="opcionesRadios(this);" required message="La Forma de Calculo es un campo obligatorio"/>Cuota Fija
              </td>
              <td align="left" valign="middle" width="20%">
                <input type="radio" name="rdFormaCalc" id="rdPorcPactado" class="radio" onclick="opcionesRadios(this);"/>Porcentaje
              </td>
              <td align="left" valign="middle" width="20%">
                <input type="radio" name="rdFormaCalc" id="rdTblCalc" class="radio" onclick="opcionesRadios(this);"/>Tabulador
              </td>
              <td align="left" width="20%" valign="middle">
                <input type="radio" name="rdFormaCalc" id="rdPorcMillar" class="radio" onclick="opcionesRadios(this);"/>Cuota Fija vs Porcentaje
              </td>
              <td align="left" width="20%" valign="middle">
                <input type="radio" name="rdFormaCalc" id="rdExento" class="radio" onclick="opcionesRadios(this);"/>Exento
              </td>
              <td align="left" width="20%" valign="middle">
                <input type="radio" name="rdFormaCalc" id="rdOtro" class="radio" onclick="opcionesRadios(this);"/>Otro Esquema
              </td>
            </tr>
            <tr>
              <td align="left" width="20%">
                <input type="text" name="pacImpFijoHono" id="pacImpFijoHono" tipo="Money" size="17" maxlength="17" prec="14.2" reqPrecValue message="El Importe Fijo es un campo obligatorio" style="visibility:hidden"/>
              </td>
              <td align="left" valign="middle" width="20%">
                <div id="dvImpFijoPerAct" style="visibility:hidden">
                    Periodo Actualizacion
                    <select size="1" name="pacImpFijoPerAct" id="pacImpFijoPerAct">                    
                        <option value="-1">-- Seleccione --</option>
                        <option value="Anual">Anual</option>
                        <option value="Cada 2 Años">Cada 2 A&ntilde;os</option>
                        <option value="Cada 3 Años">Cada 3 A&ntilde;os</option>
                        <option value="Cada 5 Años">Cada 5 A&ntilde;os</option>
                    </select>
                </div>
              </td>
              <td align="left" valign="middle">
                <div id="dvSaldo" style="visibility:hidden">
                  <input type="radio" name="rdTabla" id="rdTblSaldo" class="radio" onclick="opcionesRadios(this);" message="La Tabla es un campo obligatorio"/>Tabla Saldo
                </div>
              </td>
              <td align="left" valign="middle">
                <div id="dvValor" style="visibility:hidden">
                  <input type="radio" name="rdTabla" id="rdTblValor" class="radio" onclick="opcionesRadios(this);"/>Tabla Valor
                </div>
              </td>
              <td align="left" width="20%" valign="middle">&nbsp;</td>
              <td align="left" width="20%" valign="middle">
                <input type="text" name="pacCveFormaCalc" id="pacCveFormaCalc" size="10" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td width="20%" colspan="2">
                <div id="dvINPC" style="visibility:hidden">
                  <input type="checkbox" name="pacInpcChk" id="pacInpcChk" class="check" tv="1" fv="0"/>INPC
                  <input type="checkbox" name="pacCpiChk" id="pacCpiChk" class="check" tv="1" fv="0"/>CPI
                  <input type="checkbox" name="pacDiezChk" id="pacDiezChk" class="check" tv="1" fv="0"/>10 %
                  <input type="checkbox" name="pacUdiChk" id="pacUdiChk" class="check" tv="1" fv="0"/>UDI
                  <input type="checkbox" name="pacSinActChk" id="pacSinActChk" class="check" tv="1" fv="0"/>Sin Actualizacion
                </div>
              </td>
              <td width="10%" colspan="3">
                <div id="dvImpMin" style="visibility:hidden">
                  Importe M&iacute;nimo&nbsp;<input type="text" name="pacImpMinHono" id="pacImpMinHono" tipo="Money" size="17" maxlength="17" prec="14.2" reqPrecValue message="El Importe M�nimo es un campo obligatorio"/>
                </div>
                <br>
                <div id="dvImpMax" style="visibility:hidden">
                  Importe M&aacute;ximo&nbsp;<input type="text" name="pacImpMaximo" id="pacImpMaximo" tipo="Money" size="17" maxlength="17" prec="14.2" reqPrecValue message="El Importe M�ximo es un campo obligatorio"/>
                </div>
              </td>
              <td width="20%">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="6">
                <hr/>
              </td>
            </tr>
            <tr>
              <td width="25%">Moneda</td>
              <td>
                <select size="1" name="pacNumMoneda" id="pacNumMoneda" ref="claveMoneda" fun="loadComboElement" keyValue="monNumPais" theValue="monNomMoneda" next="pacCvePeriodCob"></select>
              </td>
              <td>Frecuencia de Cobro</td>
              <td>
                <select size="1" name="pacCvePeriodCob" id="pacCvePeriodCob" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="pacExibilidad" param="clavesCombo9"></select>
              </td>
              <td>Exigibilidad</td>
              <td>
                <select size="1" name="pacExibilidad" id="pacExibilidad" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="pacCvePersCob" param="clavesCombo1119"></select>
              </td>
            </tr>
            <tr>
              <td width="25%">A Quien se Cobra</td>
              <td>
                <select size="1" name="pacCvePersCob" id="pacCvePersCob" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="pacCveStPacahon" param="clavesCombo10"></select>
              </td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>D&iacute;a de Corte</td>
              <td>
                <input type="text" name="pacDiaCalcClte" id="pacDiaCalcClte" tipo="AlphaNumeric" size="2" maxlength="2" required message="El Dia de Corte es un campo obligatorio"/>
              </td>
              <td width="11%">&Uacute;ltimo C&aacute;lculo</td>
              <td width="3%">
                <input type="text" name="pacFecUltCalc" id="pacFecUltCalc" tipo="Fecha" size="10"/>
              </td>
              <td width="25%">Fecha Prox. Calc.</td>
              <td width="33%" colspan="3">
                <input type="text" name="txtFecProxCalc" id="txtFecProxCalc" tipo="Fecha" size="10" maxlength="10" onchange="descomponeFecha(this,GI('pacDiaCalcHono'),GI('pacMesCalcHono'),GI('pacAnoCalcHono'));"/>
                <input name="pacDiaCalcHono" id="pacDiaCalcHono" tipo="Num" size="2" style="visibility:hidden"/>
                <input name="pacMesCalcHono" id="pacMesCalcHono" tipo="Num" size="2" style="visibility:hidden"/>
                <input name="pacAnoCalcHono" id="pacAnoCalcHono" tipo="Num" size="4" style="visibility:hidden"/>
                
                 <input name="ahoCveEstado" id="ahoCveEstado" value="ACTIVO" style="visibility:hidden"/>
                  <input name="ahoNumOper" id="ahoNumOper" value="30003" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td>Estatus</td>
              <td>
                <select size="1" name="pacCveStPacahon" id="pacCveStPacahon" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="loadCatalogo" param="clavesCombo31" required message="El Status es un campo obligatorio"></select>
              </td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
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
          <input type="BUTTON" value="Aceptar " name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalParametrosHonorarios();" style="visibility:hidden"/>
        </td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
  </table>
</FORM>
