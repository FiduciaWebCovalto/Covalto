<FORM name="frmCharolaSolicitudes" id="frmCharolaSolicitudes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Instrucciones Recurrentes</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="95%" style="text-align:left" class="texto" border="0">
            <tr>
              <td width="35%">&nbsp;</td>
              <td width="10%">Fideicomiso</td>
              <td><input type="text" name="paramContrato" id="paramContrato" size="10" onblur="verNomFiso();"/></td>
              <td width="30%"><div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div></td>
              <td width="25%">&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Tipo de Operacion</td>
              <td>
                <select name="paramTipoOperacion" id="paramTipoOperacion">
                    <option value="">-- Seleccione --</option>
                    <option value="MONETARIA HIJA">MONETARIA HIJA</option>
                    <option value="MONETARIA PADRE">MONETARIA PADRE</option>
                </select>
              </td>
              <td>&nbsp;</td>
              <td width="25%">&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Estatus</td>
              <td>
                <select size="1" name="paramEstatus" id="paramEstatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo31" next="formsLoaded"></select>
              </td>
              <td>&nbsp;</td>
              <td width="25%">&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Folio Padre</td>
              <td><input id="paramFolioPadre" name="paramFolioPadre" size="10"/></td>
              <td>
                <input id="paramNombreUsuario" name="paramNombreUsuario" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1" style="visibility:hidden"/>
              </td>
              <td width="25%">&nbsp;</td>
            </tr>  
            <tr>
                <td colspan="5">
                    <!--input type="hidden" id="paramEstatus" name="paramEstatus" value="ACTIVO" size="1"/-->
                    <input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
                    <input type="text" name="Perfil" id="Perfil" tipo="Num" value="<%=session.getAttribute("puestoId")!=null?session.getAttribute("puestoId").toString():"0"%>" style="visibility:hidden" size="1"/>
                    <input type="text" name="paramIdEtapa" id="paramIdEtapa" value="5" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdTipoSolicitud" id="paramIdTipoSolicitud" value="M" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramTipoSolicitud" id="paramTipoSolicitud" value="1" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramIdEtapaOrigen" id="paramIdEtapaOrigen" value="4" size="1" style="visibility:hidden"/>
                    <input type="text" name="paramOrder" id="paramOrder" value="S" size="1" style="visibility:hidden"/>
                </td>
            </tr>
            <tr>
              <td colspan="5" align="center" valign="middle">
                <input type="button" name="cmdAceptar" value="Buscar" value="Limpiar" class="btn btn-primary" ref="qry.admon.instrucciones.recurrentes" fun="loadTableElement" tabla="tblRegCharSol" param="paramQueryAdmon" onclick="consultar(this, frmCharolaSolicitudes, false);"/>
                <input type="button" name="cmdLimpiar" id="cmdLimpiar" value="Limpiar" class="btn btn-warning" onclick="cargaPantallaInstrucciones();"/>
                <input type="button" name="cmdModificar" id="cmdModificar" value="Modificar" class="btn btn-primary" onclick="validarModificarMonto();"/>
              </td>
            </tr>
            <tr>
                <td colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
    <tr>
        <td align="center">
            <table cellspacing="1" cellpadding="0" border="0">
              <tr align="left" class="cabeceras">
                <td width="100px">&nbsp;</td>
                <td width="50px">Garantia</td>
                <td width="100px">Fideicomiso</td>
                <td width="100px">Folio</td>
                <td width="250px">Tipo Operacion</td>
                <td width="400px">Monto</td>
                <td width="400px">Moneda</td>
                <td width="400px">Cuenta Cargo</td>
                <td width="500px">Beneficiario</td>
                <td width="400px">Concepto</td>
                <td width="300px">Periodicidad</td>
                <td width="300px">Estatus</td>
                <td width="300px">Fecha Final</td>
              </tr>
            </table>
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width:1150px">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegCharSol" dataInfo="arrTblDatCharSol" keys="insNumContrato,insNumFolioInst,insCveStInstruc,insNumOper,insTxtComentario,fusuNombreUsuario,ateNomEjecutivo,ctoCveStContrat,eageFolioPadre,monto" fun="clickTablaCharSol" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda" rowFunction="rowInstruccion">
                </table>
            </div>
        </td>
    </tr>
    <tr>
        <td align="center" valign="middle">&nbsp;</td>
    </tr>
    <tr id="trNuevoMonto" style="display: none;" align="center">
        <td align="center" valign="middle">
            <table width="550px" style="text-align:left" class="texto" border="0">
                <tr>
                    <td width="200px">Nuevo monto de la instruccion:</td>
                    <td width="100px"><input type="text" name="txtMonto" id="txtMonto" size="14" maxlength="16" style="text-align: right;" tipo="Money" prec="16.2" reqPrecValue/></td>
                    <td width="250px">
                        <input type="BUTTON" name="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="autorizaRechaza(3);">
                        <input type="BUTTON" name="cmdCancelar" value="Cancelar" class="btn btn-danger" onclick="hide('trNuevoMonto');">
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td align="center" valign="middle">&nbsp;</td>
    </tr>
    <tr>
        <td align="center" valign="middle">            
            <input type="BUTTON" name="cmdAutoriza" value="Autorizar" class="btn btn-primary" onclick="autorizaRechaza(1);">
            <input type="BUTTON" name="cmdRechaza" value="Rechazar" class="btn btn-danger" onclick="autorizaRechaza(2);">
        </td>
    </tr>
  </table>
</FORM>