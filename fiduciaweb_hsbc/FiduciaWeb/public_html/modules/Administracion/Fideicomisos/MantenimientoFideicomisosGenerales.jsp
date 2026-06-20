<FORM name="frmMantenimiento" id="frmMantenimiento" onsubmit=" ">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="0" border="0" width="100%" align="left" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Fideicomiso</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="100%" class="texto" border="0" style="text-align: left;">
            <tr>
              <td nowrap>&nbsp;</td>
              <td nowrap>Num. Fideicomiso</td>
              <td>
                <input type="text" name="ctoNumContrato" id="ctoNumContrato" tipo="Num" size="10" maxlength="10" disabled="disabled"/>
              </td>
              <td nowrap>Apodo</td>
              <td colspan="2">
                <input type="text" name="ctoNomContrato" id="ctoNomContrato" size="50" maxlength="100" disabled="disabled"/>
              </td>
              <td>&nbsp;</td>
            </tr>
            <tr>
                <td colspan="7" nowrap><hr/></td>
            </tr>
            <tr valign="middle">
                <td class="subtitulo" nowrap colspan="7" align="left">
                    <table id="tabs" cellpadding="0" cellspacing="0" border="0">
                        <tr>
                            <td class="tab_blanco_azul">&nbsp;</td>
                            <td class="tab_relleno_azul" onclick="cambiaTab(this, 'cargarPantallaMantenimientoTab(1)');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Datos Generales&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td class="tab_azul_claro">&nbsp;</td>
                            <td class="tab_relleno_claro" onclick="cambiaTab(this, 'cargarPantallaMantenimientoTab(2)');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Estatus KYC&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td class="tab_claro_claro_der">&nbsp;</td>
                            <td class="tab_relleno_claro" onclick="cambiaTab(this, 'cargarPantallaMantenimientoTab(3)');">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tipos de Bloqueo&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td class="tab_claro_blanco">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td colspan="7" nowrap><hr/></td>
            </tr>
            <tr>
              <td nowrap>Num. Anterior Legacy</td>
              <td>
                <input type="text" name="ctoNumAntLegacy" id="ctoNumAntLegacy" size="10" maxlength="50"/>
              </td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>Fecha Consitucion</td>
              <td><input type="text" name="ctoFecConst" id="ctoFecConst" tipo="Fecha" size="10" maxlength="10" required message="Este es un campo obligatorio"/></td>
            </tr>
            <tr>
              <td nowrap>Tipo Negocio</td>
              <td colspan="3">
                    <select size="1" name="ctoCveTipoNeg" id="ctoCveTipoNeg" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="ctoLinNeg" param="{'llaveClave':36}" onchange="actualizaComboClasProd();" required message="Este es un dato obligatorio"></select>
              </td>
              <td>&nbsp;</td>
                <td nowrap>Linea de Negocio</td>
                <td>
                    <select size="1" name="ctoLinNeg" id="ctoLinNeg" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2003}" next="ctoCveClasProd" required message="Este es un campo obligatorio"></select>
                </td>
            </tr>
            <tr>
              <td nowrap>Clasificaci&oacute;n Producto</td>
              <td colspan="3">
                    <select size="1" name="ctoCveClasProd" id="ctoCveClasProd" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':37}" next="ctoEmpresa" required message="Este es un dato obligatorio"></select>
              </td>
              <td>&nbsp;</td>
              
                <td nowrap>Empresa</td>
                <td>
                    <select name="ctoEmpresa" id="ctoEmpresa" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2005}" next="ctoNumProducto" required message="Este es un campo obligatorio"></select>
                </td>
            </tr>
            <tr>
              <td nowrap>Producto</td>
              <td colspan="3">
                    <select name="ctoNumProducto" id="ctoNumProducto" ref="claveProducto" fun="loadComboElement" keyValue="prlNumProducto" theValue="prlNomProducto" next="ctoSucursal" param="parametroComboProducto" required message="Este es un dato obligatorio"></select>
              </td>
                <td>&nbsp;</td>
                <td nowrap>Sucursal</td>
                <td>
                    <select name="ctoSucursal" id="ctoSucursal" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2006}" next="ctoPromFid" required message="Este es un campo obligatorio"></select>
                </td>
            </tr>
            <tr>
                <td nowrap>Promotor Fiduciario</td>
                <td colspan="2">
                    <select name="ctoPromFid" id="ctoPromFid" ref="clavePromotor" fun="loadComboElement" keyValue="ejeNumEjecAtenc" theValue="ejeNomEjecutivo" next="ctoPromCliSpe" required message="Este es un campo obligatorio"></select>
                </td>
                <td>&nbsp;</td>
                <td nowrap>RM de la Linea de Negocio</td>
                <td colspan="2">
                    <input type="text" name="ctoRmLinNeg" id="ctoRmLinNeg" tipo="AlphaNumeric" size="50" maxlength="500"/>
                </td>
            </tr>    
            <tr>
                <td nowrap>Promotor CS</td>
                <td colspan="3">
                    <select size="1" name="ctoPromCliSpe" id="ctoPromCliSpe" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2007}" next="ctoPromCliMan" required message="Este es un campo obligatorio"></select>
                </td>
                <td nowrap>&nbsp;</td>
                <td colspan="2">
                    &nbsp;
                </td>
            </tr>
            <tr>
                <td nowrap>Promotor CM</td>
                <td colspan="3">
                    <select size="1" name="ctoPromCliMan" id="ctoPromCliMan" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2009}" next="ctoSubdirector"></select>
                </td>
                <td nowrap>&nbsp;</td>
                <td colspan="2">
                    &nbsp;
                </td>
            </tr>
            <tr>
                <td nowrap>Subdirector</td>
                <td colspan="3">
                    <select size="1" name="ctoSubdirector" id="ctoSubdirector" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2019}" next="ctoTipoEscritura"></select>
                </td>
                <td nowrap>&nbsp;</td>
                <td colspan="2">
                    &nbsp;
                </td>
            </tr>
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
              <td >
                <input type="checkbox" name="ctoJuiciosChk" id="ctoJuiciosChk" class="check" tv="1" fv="0"/>&nbsp;Juicios
              </td>
                <td nowrap>Obs. del Juicio</td>
                <td>
                    <textarea name="ctoObsJuicio" id="ctoObsJuicio" style="width:250px;height:40px" onkeydown="validaLongitud(this,30);" disabled="disabled" message="Este es un campo obligatorio"></textarea>
                </td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
              <td>
                <input type="radio" name="rdCtoTipoCont" id="ctoTipoCont" class="radio" value2="CONTRATO PRIVADO" onclick="habilitaCamposTipoContrato(1, this);" required message="Este es un campo obligatorio"/>&nbsp;Contrato Privado
              </td>
                <td nowrap>Comentarios</td>
                <td colspan="3">
                    <textarea name="ctoContPrivComen" id="ctoContPrivComen" style="width:250px;height:40px" onkeydown="validaLongitud(this,255);" disabled="disabled" message="Este es un campo obligatorio"></textarea>
                </td>
                <td>Fecha del Contrato</td>
                <td><input type="text" name="ctoFecContrato" id="ctoFecContrato" tipo="Fecha" size="10" maxlength="10" disabled="disabled" message="Este es un campo obligatorio"/></td>
            </tr>
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
              <td>
                <input type="radio" name="rdCtoTipoCont" id="ctoTipoCont2" class="radio" value="ESCRITURA PUBLICA" onclick="habilitaCamposTipoContrato(2, this)"/>&nbsp;Escritura Publica
              </td>
              <td>Tipo de Escritura</td>
              <td>
                <select size="1" name="ctoTipoEscritura" id="ctoTipoEscritura" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="{'llaveClave':2011}" next="ctoNumNotario" disabled="disabled" message="Este es un campo obligatorio"></select>
              </td>
              <td>No. Escritura</td>
              <td>
                <input type="text" name="ctoNumEscritura" id="ctoNumEscritura" tipo="AlphaNumeric" size="10" maxlength="25" disabled="disabled" message="Este es un campo obligatorio"/>
              </td>
              <td>Fecha de Escritura</td>
              <td>
                <input type="text" name="ctoEscPubFec" id="ctoEscPubFec" tipo="Fecha" size="10" maxlength="10" disabled="disabled" message="Este es un campo obligatorio"/>
              </td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Nombre del Notario</td>
              <td colspan="3">
                <select size="1" name="ctoNumNotario" id="ctoNumNotario" ref="muestraDatosNotarios" fun="loadComboElement" keyValue="notNumNotario" theValue="notNomNotario" next="loadCatalogo" disabled="disabled" onchange="consultaDatosNotario()" message="Este es un campo obligatorio"></select>
              </td>
              <td>No. Notario</td>
              <td>
                <input type="text" name="ctoNoNotario" id="ctoNoNotario" size="10" maxlength="10" disabled="disabled">
              </td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Estado</td>
              <td>
                <input type="text" name="ctoEdoNotario" id="ctoEdoNotario" size="10" maxlength="10" disabled="disabled"/>
              </td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>Localidad</td>
              <td>
                <input type="text" name="ctoLocNotario" id="ctoLocNotario" size="10" maxlength="10" disabled="disabled"/>
              </td>
            </tr>
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td class="subtitulo" colspan="5">Datos de RPP</td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td colspan="7">&nbsp;</td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td width="25%">No. Folio</td>
                <td width="25%">
                    <input type="text" name="ctoRppFolio" id="ctoRppFolio" size="15" maxlength="50"/>
                </td>
                <td width="25%">Lugar de Registro</td>
                <td width="25%">
                    <input type="text" name="ctoRppLugReg" id="ctoRppLugReg" size="15" maxlength="50"/>
                </td>
                <td width="25%">Fecha Inscripcion RPP</td>
                <td width="25%">
                    <input type="text" name="ctoRppFecIns" id="ctoRppFecIns" maxlength="10" size="10"/>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td width="25%">Partida</td>
                <td width="25%">
                    <input type="text" name="ctoRppPartida" id="ctoRppPartida" size="15" maxlength="50"/>
                </td>
                <td width="25%">Volumen</td>
                <td width="25%">
                    <input type="text" name="ctoRppVolumen" id="ctoRppVolumen" size="15" maxlength="50"/>
                </td>
                <td width="25%">Fojas</td>
                <td width="25%">
                    <input type="text" name="ctoRppFojas" id="ctoRppFojas" size="15" maxlength="50"/>
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td width="25%">Libro</td>
                <td width="25%">
                    <input type="text" name="ctoRppLibro" id="ctoRppLibro" size="15" maxlength="50"/>
                </td>
                <td width="25%">Seccion</td>
                <td width="25%">
                    <input type="text" name="ctoRppSeccion" id="ctoRppSeccion" size="15" maxlength="50"/>
                </td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr align="center">
        <td>
            <table>
                <tr>
                    <td style="text-align: right;"><input type="button" value="  Aceptar  " name="cmdAceptar" id="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="display: none;"/></td>
                    <td style="text-align: left;"><input type="button" value="  Cancelar " name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipal();" style="display: none;"/></td>
                </tr>
            </table>
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
