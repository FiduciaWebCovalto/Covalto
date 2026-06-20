<FORM name="frmMantenimientoBienesGar" id="frmMantenimientoBienesGar" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Mantenimiento de Bienes</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td width="80%" height="100%">
        <table width="100%" align="center" class="texto" border="0">
          <tr>
            <td nowrap>Fideicomiso:</td>
            <td nowrap width="15%">
              <input type="text" name="fgrsIdFideicomiso" id="fgrsIdFideicomiso" tipo="Num" size = "10" maxlength="10" onblur="consultaNombreFideicomiso('nomFideicomiso',this);" required message = "Valor obligatorio"/>
            </td>
            <td width="45%"><!--div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam" next="consultaConceptosAsignados"-->&nbsp;</div>
            </td>
            <td width="15%">
                <input type="hidden" id="paramUsuario" name="paramUsuario" value="<%=session.getAttribute("userid").toString()%>"/>
                <input type="text" name="fcoDiaDia" id="fcoDiaDia" size="2" style="visibility:hidden"/>
                <input type="text" name="fcoMesDia" id="fcoMesDia" size="2" style="visibility:hidden"/>
                <input type="text" name="fcoAnoDia" id="fcoAnoDia" size="4" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td width="20%">Tipo de Bien:</td>
            <td nowrap width="15%">
              <input type="text" name="forsCveTipoGarantia2" id="forsCveTipoGarantia2" size="50" maxlength="50" />
                  <select size="1" name="forsCveTipoGarantia" id="forsCveTipoGarantia" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" param="clavesCombo38" next="loadClaveBien" style="visibility:hidden">
                  </select>
            </td>
            <td>SubCuenta:</td>
            <td width="45%">
              <input type="text" name="fgrsIdSubcuenta" id="fgrsIdSubcuenta" tipo="Num" size="10" maxlength="10" required message="Valor obligatorio"/>
            </td>
          </tr>
          <tr>
            <td width="20%">Id Bien:</td>
            <td nowrap width="15%">
              <input type="text" name="forsIdGarantia" id="forsIdGarantia" tipo="Num" size = "10" maxlength="10" required message = "Valor obligatorio"/>
            </td>
            <td width="15%"><input type="hidden" id="paramMesAbierto" name="paramMesAbierto" value="<%=session.getAttribute("mesAbiertoLbl")%>"/></td>
            <td>&nbsp;</td>
          </tr>
           <tr>
            <td nowrap width="25%">Clave de Bien:</td>
            <td nowrap width="15%">
              <select size="1" name="forsCveTipoBien" id="forsCveTipoBien" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" param="parametroComboEstado" next="next" required message = "Valor obligatorio">
              </select>
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr id="filaforsMue" style="visibility:hidden">
            <td colspan="4">
                <table width="100%" align="center" class="texto" border="0">
                    <tr>
                            <td width="20%">Csc</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueCsc" id="forsMueCsc" tipo="Num" size="10" maxlength="10" />
                            </td>
                            <td colspan="2">Tipo de Documento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueTipoDoc" id="forsMueTipoDoc"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Tipo de Copia</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueTipoCopia" id="forsMueTipoCopia"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Numero del Documento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueNumeroDoc" id="forsMueNumeroDoc"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Fecha de Expedicion</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueFechaExp" id="forsMueFechaExp" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                            <td colspan="2">Fecha de Vencimiento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueFechaVenc" id="forsMueFechaVenc" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Moneda</td>
                            <td nowrap width="15%">
                                <select name="forsMueMoneda" id="forsMueMoneda" ref="conNumMonNomMon" fun="loadComboElement" keyValue="monNomMoneda" theValue="monNomMoneda" next="forsMueEstatus">
                                </select>
                            </td>
                            <td colspan="2">Valor Total del documento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueValorDoc" id="forsMueValorDoc" tipo="Num" size="10" maxlength="10" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Descripcion del documento</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueDescDoc" id="forsMueDescDoc"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Quien expide el documento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueQuienExpDocu" id="forsMueQuienExpDocu"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">A favor de quien se expide el documento</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueFavExpDoc" id="forsMueFavExpDoc"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Endoso a</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueEndoso" id="forsMueEndoso"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Fecha de endoso</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueFecEndoso" id="forsMueFecEndoso" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                            <td colspan="2">Fecha de Entrada</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueFecEntrada" id="forsMueFecEntrada" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Fecha de Salida</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueFecSalida" id="forsMueFecSalida" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                            <td colspan="2">Estatus</td>
                            <td align="left" width="15%">
                                <select size="1" name="forsMueEstatus" id="forsMueEstatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formLoadedBienesGar" param="clavesCombo31">
                                </select>
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Importe Total Muebles</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueImpTotMueb" id="forsMueImpTotMueb" tipo="Num" size="10" maxlength="10" />
                            </td>
                            <td colspan="2"></td>
                            <td align="left" width="15%">
                            </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr id="filaforsInm" style="visibility:hidden">
            <td colspan="4">
                <table width="100%" align="center" class="texto" border="0">
                    <tr>
                            <td width="20%">Csc</td>
                            <td nowrap width="15%">
                                <input type="text" name="forsInmCsc" id="forsInmCsc" tipo="Num" size="10" maxlength="10" />
                            </td>
                            <td colspan="2"></td>
                            <td align="left" width="15%">
                                <input type="text" name="forsInmSubmateria" id="forsInmSubmateria"  size = "30" maxlength="255"  style="visibility:hidden" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Estatus</td>
                            <td nowrap width="15%">
                                <select size="1" name="forsInmEstatus" id="forsInmEstatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="forsInmMoneda" param="clavesCombo31">
                                </select>
                            </td>
                            <td colspan="2">Moneda</td>
                            <td align="left" width="15%">
                                <select name="forsInmMoneda" id="forsInmMoneda" ref="conNumMonNomMon" fun="loadComboElement" keyValue="monNomMoneda" theValue="monNomMoneda" next="forsInmPais">
                                </select>
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Importe</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsInmImporte" id="forsInmImporte" tipo="Num" size="10" maxlength="10" required message="El Importe es un campo obligatorio"/>
                            </td>
                            <td colspan="2">Beneficiario</td>
                            <td align="left" width="15%">
                                <input type="text" name="forsInmBeneficiario" id="forsInmBeneficiario"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Unidad / Apodo del inmueble</td>
                            <td nowrap width="15%">
                                <input type="text" name="forsInmUniApodoInm" id="forsInmUniApodoInm"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Calle o Avenida</td>
                            <td align="left" width="15%">
                                <input type="text" name="forsInmCalleAv" id="forsInmCalleAv"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Num. ext. / Mza.</td>
                            <td nowrap width="15%">
                                <input type="text" name="forsInmNumExtMza" id="forsInmNumExtMza"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Num. int. / Lt.</td>
                            <td align="left" width="15%">
                                <input type="text" name="forsInmNumIntLt" id="forsInmNumIntLt"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Colonia</td>
                            <td nowrap width="15%">
                                <input type="text" name="forsInmColonia" id="forsInmColonia"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Pais</td>
                            <td align="left" width="15%">
                                <select name="forsInmPais" id="forsInmPais" ref="clavePaisCat" fun="loadComboElement" keyValue="paiNomPais" theValue="paiNomPais" next="forsInmEstado" >
                                </select>
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Estado</td>
                            <td nowrap width="15%">
                                <select size="1" name="forsInmEstado" id="forsInmEstado" ref="claveEstado" fun="loadComboElement" keyValue="edoNomEstado" theValue="edoNomEstado" next="formLoadedBienesGar">
                                </select>        
                            </td>
                            <td colspan="2">Ciudad</td>
                            <td align="left" width="15%">
                                <input type="text" name="forsInmCiudad" id="forsInmCiudad"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Delegacion o Municipio</td>
                            <td nowrap width="15%">
                                <input type="text" name="forsInmDelMun" id="forsInmDelMun"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">C.P.</td>
                            <td align="left" width="15%">
                                <input type="text" name="forsInmCp" id="forsInmCp" tipo="Num" size="10" maxlength="10" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Superficie</td>
                            <td nowrap width="15%">
                                <input type="text" name="forsInmSuperficie" id="forsInmSuperficie" tipo="Num" size="10" maxlength="10" />
                            </td>
                            <td colspan="2">Sub-tipo</td>
                            <td align="left" width="15%">
                                <input type="text" name="forsInmSubTipo" id="forsInmSubTipo"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Fecha valor</td>
                            <td nowrap width="15%">
                                <input type="text" name="forsInmFecValor" id="forsInmFecValor" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                            <td colspan="2">Clave Catastral</td>
                            <td align="left" width="15%">
                                <input type="text" name="forsInmClaveCatas" id="forsInmClaveCatas"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Cuenta Predial</td>
                            <td nowrap width="15%">
                                <input type="text" name="forsInmCuentaPred" id="forsInmCuentaPred"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Pendientes de Predial</td>
                            <td align="left" width="15%">
                                <input type="checkbox" name="forsInmPenPredialChk" id="forsInmPenPredialChk" class="check" tv="1" fv="0"  />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Embargo</td>
                            <td nowrap width="15%">
                                <input type="checkbox" name="forsInmEmbargoChk" id="forsInmEmbargoChk" class="check" tv="1" fv="0"  />
                            </td>
                            <td colspan="2">Importe Total Inmuebles</td>
                            <td align="left" width="15%">
                                <input type="text" name="forsInmImpTotInm" id="forsInmImpTotInm" tipo="Num" size="10" maxlength="10" />
                            </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr id="filaforsVal" style="visibility:hidden">
            <td colspan="4">
                <table width="100%" align="center" class="texto" border="0">
                    <tr>
                            <td width="20%">Csc</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueCsc" id="forsMueCsc" tipo="Num" size="10" maxlength="10" />
                            </td>
                            <td colspan="2">Tipo de Documento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueTipoDoc" id="forsMueTipoDoc"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Tipo de Copia</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueTipoCopia" id="forsMueTipoCopia"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Numero del Documento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueNumeroDoc" id="forsMueNumeroDoc"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Fecha de Expedicion</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueFechaExp" id="forsMueFechaExp" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                            <td colspan="2">Fecha de Vencimiento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueFechaVenc" id="forsMueFechaVenc" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Moneda</td>
                            <td nowrap width="15%">
                                <select name="forsMueMoneda" id="forsMueMoneda" ref="conNumMonNomMon" fun="loadComboElement" keyValue="monNomMoneda" theValue="monNomMoneda" next="forsMueEstatus">
                                </select>
                            </td>
                            <td colspan="2">Valor Total del documento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueValorDoc" id="forsMueValorDoc" tipo="Num" size="10" maxlength="10" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Descripcion del documento</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueDescDoc" id="forsMueDescDoc"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Quien expide el documento</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueQuienExpDocu" id="forsMueQuienExpDocu"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">A favor de quien se expide el documento</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueFavExpDoc" id="forsMueFavExpDoc"  size = "30" maxlength="255" />
                            </td>
                            <td colspan="2">Endoso a</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueEndoso" id="forsMueEndoso"  size = "30" maxlength="255" />
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Fecha de endoso</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueFecEndoso" id="forsMueFecEndoso" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                            <td colspan="2">Fecha de Entrada</td>
                            <td align="left" width="15%">
                    <input type="text" name="forsMueFecEntrada" id="forsMueFecEntrada" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Fecha de Salida</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueFecSalida" id="forsMueFecSalida" tipo="Fecha" size="10" maxlength="10"/>
                            </td>
                            <td colspan="2">Estatus</td>
                            <td align="left" width="15%">
                                <select size="1" name="forsMueEstatus" id="forsMueEstatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formLoadedBienesGar" param="clavesCombo31">
                                </select>
                    <!--input type="text" name="forsMueEstatus" id="forsMueEstatus"  size = "30" maxlength="255" /-->
                            </td>
                    </tr>
                    <tr>
                            <td width="20%">Importe Total Muebles</td>
                            <td nowrap width="15%">
                                    <input type="text" name="forsMueImpTotMueb" id="forsMueImpTotMueb" tipo="Num" size="10" maxlength="10" />
                            </td>
                            <td colspan="2"></td>
                            <td align="left" width="15%">
                            </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr id="filaforsDer" style="visibility:hidden">
            <td colspan="4">
                <table width="100%" align="center" class="texto" border="0">
                <tr>
                        <td width="20%">Csc</td>
                        <td nowrap width="15%">
                                <input type="text" name="forsDerCsc" id="forsDerCsc" tipo="Num" size="10" maxlength="10" />
                        </td>
                        <td colspan="2">Administrador</td>
                        <td align="left" width="15%">
                <input type="text" name="forsDerAdministrador" id="forsDerAdministrador"  size = "30" maxlength="255" />
                        </td>
                </tr>
                <tr>
                        <td width="20%">No. de Cr&eacute;dito</td>
                        <td nowrap width="15%">
                                <input type="text" name="forsDerNoCedito" id="forsDerNoCedito" tipo="Num" size="10" maxlength="10" />
                        </td>
                        <td colspan="2">Nombre de Acreditado</td>
                        <td align="left" width="15%">
                <input type="text" name="forsDerNomAcredi" id="forsDerNomAcredi"  size = "30" maxlength="255" />
                        </td>
                </tr>
                <tr>
                        <td width="20%">Importe</td>
                        <td nowrap width="15%">
                                <input type="text" name="forsDerImporte" id="forsDerImporte" tipo="Num" size="10" maxlength="10" required message="El Importe es un campo obligatorio"/>
                        </td>
                        <td colspan="2">Moneda</td>
                        <td align="left" width="15%">
                            <select name="forsDerMoneda" id="forsDerMoneda" ref="conNumMonNomMon" fun="loadComboElement" keyValue="monNomMoneda" theValue="monNomMoneda" next="forsDerEstado">
                            </select>
                        </td>
                </tr>
                <tr>
                        <td width="20%">Estatus de Credito</td>
                        <td nowrap width="15%">
                                <input type="text" name="forsDerEstatusCred" id="forsDerEstatusCred"  size = "30" maxlength="255" />
                        </td>
                        <td colspan="2">Fecha valor</td>
                        <td align="left" width="15%">
                <input type="text" name="forsDerFecValor" id="forsDerFecValor" tipo="Fecha" size="10" maxlength="10"/>
                        </td>
                </tr>
                <tr>
                        <td width="20%">Direccion del Inmueble</td>
                        <td nowrap width="15%">
                                <input type="text" name="forsDerDirInmueble" id="forsDerDirInmueble"  size = "30" maxlength="255" />
                        </td>
                        <td colspan="2">Estado</td>
                        <td align="left" width="15%">
                            <select size="1" name="forsDerEstado" id="forsDerEstado" ref="claveEstado" fun="loadComboElement" keyValue="edoNomEstado" theValue="edoNomEstado" next="forsDerEstatus">
                            </select>
                        </td>
                </tr>
                <tr>
                        <td width="20%">Estatus</td>
                        <td nowrap width="15%">
                            <select size="1" name="forsDerEstatus" id="forsDerEstatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formLoadedBienesGar" param="clavesCombo31">
                            </select>
                        </td>
                        <td colspan="2">Importe Total Derechos</td>
                        <td align="left" width="15%">
                <input type="text" name="forsDerImpTotDer" id="forsDerImpTotDer" tipo="Num" size="10" maxlength="10" />
                        </td>
                </tr>
            </table>
          </td>
        </tr>
        <tr>
            <td colspan="5" align="center">
                <input type="button" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfoBienesGar();" style="visibility:hidden"/>
                <input type="button" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="onButtonClickPestania('Garantias.Garantias.PrincipalGarantias','')" style="visibility:hidden"/>
            </td>
          </tr> 
        </table>
      </td>
    </tr>
  </table>
</FORM>