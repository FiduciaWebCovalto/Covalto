<!--Version de Formalizacion/Proyectos-->
<FORM name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;" class="texto">
      <tr>
        <td align="center" height="100%" class="titulo">Fiscal</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      
          <tr>
            <td width="30%">No. Proyecto</td>
            <td nowrap width="15%">
              <input type="text" name="fperAntFiso" id="fperAntFiso" tipo="Num" size="10" maxlength="10"  required message="El Numero de Prospecto es un campo obligatorio" /> <!---->
             <input type="text" name="fperTipo" id="fperTipo" tipo="Num" size="10" maxlength="10"  value="1" style="visibility:hidden"/> <!---->              
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
            &nbsp;
            </td>
          </tr>   
          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap>
                <input type="checkbox" name="fperMenor2" id="fperMenor2" class="check" tv="1" fv="0"/>Menos a 2,000,000.00
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" >
                <input type="checkbox" name="fperMenor210" id="fperMenor210" class="check" tv="1" fv="0"/>Entre 2,000,000.00 y 10,000,000.00
            </td>
          </tr>   

          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                <input type="checkbox" name="fperMenor10" id="fperMenor10" class="check" tv="1" fv="0"/>Mas de 10,000,000.00
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                <input type="checkbox" name="fperMenor37" id="fperMenor37" class="check" tv="1" fv="0"/>Monto Aprox. 37,000,000.00
            </td>
          </tr>   

          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                <input type="checkbox" name="fperAporTercero" id="fperAporTercero" class="check" tv="1" fv="0"/>La aportacion del Tercero es por unica ocasion?
             </td>
            <td colspan="2">Indicar el Monto</td>
            <td align="left" width="15%">
                <input type="text" name="fperAporTerceroMonto" id="fperAporTerceroMonto"  size="30" maxlength="30" /> <!---->
            </td>
          </tr> 

          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                <input type="checkbox" name="fperAporTerPer" id="fperAporTerPer" class="check" tv="1" fv="0"/>La aportacion del Tercero es periodica?
             </td>
            <td colspan="2">Indicar Periodicidad</td>
            <td align="left" width="15%">
                <input type="text" name="fperAporPeriodicidad" id="fperAporPeriodicidad"  size="30" maxlength="30" /> <!---->
            </td>
          </tr> 


          <tr align="left">
            <td width="30%">Indicar el Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperAporTerPermonto" id="fperAporTerPermonto"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr > 
          
          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                <input type="checkbox" name="fperBenefAdic" id="fperBenefAdic" class="check" tv="1" fv="0"/>Otorgara el Tercero algun beneficio adic al Cliente por contratar el prod o servicio?
             </td>
            <td colspan="2">En caso afirmativo Espeficiar</td>
            <td align="left" width="15%">
                <input type="text" name="fperBenefAdicDesc" id="fperBenefAdicDesc"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>  
          
          
          <tr align="left">
            <td width="30%">Efectivo</td>
            <td nowrap width="15%">
                &nbsp;
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Ingresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperEfectivoMontoDep" id="fperEfectivoMontoDep"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Ingrsos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperEfectivoNumDep" id="fperEfectivoNumDep"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Egresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperEfectivoMontoRet" id="fperEfectivoMontoRet"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Egresos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperEfectivoNumRet" id="fperEfectivoNumRet"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Origen</td>
            <td nowrap width="15%">
                <input type="text" name="fperEfectivoOrigen" id="fperEfectivoMontoRet"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Destino</td>
            <td align="left" width="15%">
                <input type="text" name="fperEfectivoDestino" id="fperEfectivoNumRet"  size="30" maxlength="30" /> <!---->
            </td>
          </tr> 

          <tr align="left">
            <td width="30%">>&nbsp;</td>
            <td nowrap width="15%">
                &nbsp;
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr> 

          <tr align="left">
            <td width="30%">Transferencias Internacionales</td>
            <td nowrap width="15%">
                &nbsp;
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Ingresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperTransIntMontoDep" id="fperTransIntMontoDep"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Ingrsos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperTransIntNumDep" id="fperTransIntNumDep"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Egresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperTransIntMontoRet" id="fperTransIntMontoRet"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Egresos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperTransIntNumRet" id="fperTransIntNumRet"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Origen</td>
            <td nowrap width="15%">
                <input type="text" name="fperTransIntOrigen" id="fperTransIntOrigen"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Destino</td>
            <td align="left" width="15%">
                <input type="text" name="fperTransIntDestino" id="fperTransIntDestino"  size="30" maxlength="30" /> <!---->
            </td>
          </tr> 
          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                &nbsp;
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr> 
          <tr align="left">
            <td width="30%">Transferencias entre Cuentas</td>
            <td nowrap width="15%">
                &nbsp;
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Ingresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperTransCtasMontoDep" id="fperTransCtasMontoDep"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Ingrsos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperTransCtasNumDep" id="fperTransCtasNumDep"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Egresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperTransCtasMontoRet" id="fperTransCtasMontoRet"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Egresos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperTransCtasNumRet" id="fperTransCtasNumRet"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Origen</td>
            <td nowrap width="15%">
                <input type="text" name="fperTransCtasOrigen" id="fperTransCtasOrigen"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Destino</td>
            <td align="left" width="15%">
                <input type="text" name="fperTransCtasDestino" id="fperTransCtasDestino"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>
          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                &nbsp;
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr> 
          <tr align="left">
            <td width="30%">SPEI</td>
            <td nowrap width="15%">
                &nbsp;
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Ingresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperSpeiMontoDep" id="fperSpeiMontoDep"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Ingrsos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperSpeiNumDep" id="fperSpeiNumDep"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Egresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperSpeiMontoRet" id="fperSpeiMontoRet"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Egresos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperSpeiNumRet" id="fperSpeiNumRet"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Origen</td>
            <td nowrap width="15%">
                <input type="text" name="fperSpeiOrigen" id="fperSpeiOrigen"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Destino</td>
            <td align="left" width="15%">
                <input type="text" name="fperSpeiDestino" id="fperSpeiDestino"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>
          <tr align="left">
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
                &nbsp;
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr> 
          <tr align="left">
            <td width="30%">CHEQUES</td>
            <td nowrap width="15%">
                &nbsp;
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
                &nbsp;
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Ingresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperChMontoDep" id="fperChMontoDep"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Ingrsos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperChNumDep" id="fperChNumDep"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Egresos Monto</td>
            <td nowrap width="15%">
                <input type="text" name="fperChMontoRet" id="fperChMontoRet"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Egresos Num Operaciones</td>
            <td align="left" width="15%">
                <input type="text" name="fperChNumRet" id="fperChNumRet"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>            
          <tr align="left">
            <td width="30%">Origen</td>
            <td nowrap width="15%">
                <input type="text" name="fperChOrigen" id="fperChOrigen"  size="30" maxlength="30" /> <!---->
             </td>
            <td colspan="2">Destino</td>
            <td align="left" width="15%">
                <input type="text" name="fperChDestino" id="fperChDestino"  size="30" maxlength="30" /> <!---->
            </td>
          </tr>

      <tr>
        <td colspan="5" align="center">
          <input type="BUTTON" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="BUTTON" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalFinalidadesContrato();" style="visibility:hidden"/>
        </td>
      </tr>
      
  </table>
</FORM>
