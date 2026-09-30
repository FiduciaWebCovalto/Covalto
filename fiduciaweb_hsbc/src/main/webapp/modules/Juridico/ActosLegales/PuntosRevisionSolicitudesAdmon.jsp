<FORM name="frmPtosSol" id="frmPtosSol" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Charola Actos Legales <br>Confirmacion Firma</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
        <tr>
            <td height="100%">
                <table width="100%" class="texto" border="0" style="text-align:left">
                    <tr>
                        <td width="25%" id="divRMCliente"></td>
                        <td width="25%" colspan="2"><input type="text" name="fusuNombreUsuario" id="fusuNombreUsuario" size="40" disabled="disabled"/></td>
                        <td width="20%">&nbsp;</td>
                        <td width="30%">&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Tipo de Operacion</td>
                        <td colspan="2"><input type="text" name="txtComentario" id="txtComentario" size="50" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td rowspan="4" nowrap="nowrap">
                           <input type="radio" class="radio" name="rdReporte" value="0" id="rd1"> Expediente Digital<br>
                           <input type="radio" class="radio" name="rdReporte" value="1" id="rd2"> Historico de Operaciones<br>
                           <input type="radio" class="radio" name="rdReporte" value="2" id="rd3"> Partes del Fideicomiso<br>
                           <input type="radio" class="radio" name="rdReporte" value="3" id="rd4"> Comite Tecnico
                        </td>
                    </tr>
                    <tr>
                        <td>Estatus del Fideicomiso</td>
                        <td><input type="text" name="ctoCveStContrat" id="ctoCveStContrat" size="20" disabled="disabled"/></td>
                        <td>Documentacion del Folio</td>
                        <td><input type="FILE" id="fileTest" name="fileTest" style="width:300px;"/></td>
                    </tr>
                    <tr>
                        <td>URGENTE</td>
                        <td><input type="text" name="redFlag" id="redFlag" size="20" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Fideicomiso</td>
                        <td><input type="text" name="insNumContrato" id="insNumContrato" size="20" disabled="disabled"/></td>
                        <td>Apodo</td>
                        <td><input type="text" name="txtNomContraro" id="txtNomContraro" size="50" disabled="disabled"/></td>
                    </tr>
                    <tr>
                        <td>Folio</td>
                        <td><input type="text" name="insNumFolioInst" id="insNumFolioInst" size="20" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td style="text-align:center">
                        <input type="BUTTON" name="cmdReporte" value="Reporte" class="btn btn-primary" onclick="generaReporteAuxiliar();"/></td>
                    </tr>
                    <tr>
                        <td>Concepto</td>
                        <td colspan="2"><input type="text" name="txtConcepto" id="txtConcepto" size="40" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td colspan="3">
                            <textarea name="txtComentarioLegal" id="txtComentarioLegal" style="width:400px;height:60px" onkeydown="validaLongitud(this,200);"></textarea>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
          </td>
        </tr>
        <tr>
            <td width="90%" colspan="5" align="center" valign="middle">
                &nbsp;<input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
            </td>
        </tr>
        <tr align="center">
          <td colspan="5">
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width: 100%">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegPtosRev" dataInfo="arrTblDatPtoRev" keys="fpurIdPuntorev,fpurDescripcion,frxoReferencia,frxoFolioAutorizado,frxoDelegadoFiduciario,frxoObservacion,frxoRevCorrecta,frxoCausaRechazo" fun="clickTablaPtoRev" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda" rowFunction="rowPuntoRevision">
                    <thead>
                      <tr align="left" class="cabeceras">
                        <td width="50px">&nbsp;</td>
                        <td width="50px">Id</td>
                        <td width="550px">Punto de Revision</td>
                        <td width="50px">Referencia</td>
                        <td width="50px">Folio LE Autorizado</td>
                        <td width="200px">Delegado Fiduciario</td>
                        <td width="1px" style="display: none;">Observaciones</td>
                        <td width="50px">Cumple</td>
                        <td width="400px">Causa del Rechazo</td>
                        <td width="200px">Estatus</td>
                      </tr>
                    </thead>
                    <tbody></tbody>
                </table>
            </div>
          </td>
        </tr>
        <tr align="center"><td colspan="5">&nbsp;</td></tr>
        <tr align="center">
          <td colspan="5">
            <table width="90%" cellspacing="1" cellpadding="0" border="0" class="texto">
              <tr>
                <td>Observaciones <br>(Punto de Revision):</td>
                <td>
                  <textarea name="txtObservacionesGlobal" id="txtObservacionesGlobal" style="width:600px;height:80px" onkeydown="validaLongitud(this,200);" onblur="setObservaciones(this)"></textarea>
                </td>
              </tr>
           </table>
           </td>
        </tr>
        <tr align="center"><td colspan="5"><div id="dvreporte"><a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a></div></td></tr>
        <tr align="center">
            <td colspan="5">
               <!--input type="BUTTON" name="cmdGuardar" value="Guardar" class="btn btn-primary" onclick="guardar(1);"-->
               <input type="BUTTON" name="cmdGuardar" value="Guardar Revisiones" class="btn btn-primary" onclick="guardarRevisiones();">
               <input type="BUTTON" name="cmdRegresar" value="Regresar" class="btn btn-danger" onclick="cargaPantallaInstrucciones();">
               <!--input type="BUTTON" name="cmdReporte" value="Reporte Finalidades" class="btn btn-primary" onclick="generaReporte();"/-->
            </td>
        </tr>
        <tr><td align="center" valign="middle">&nbsp;</td></tr>
        <tr>
            <td align="center" valign="middle">
                <input type="BUTTON" name="cmdAutoriza" value="Aceptar" class="btn btn-primary" onclick="autorizaRechaza(1);">
                <input type="BUTTON" name="cmdRechaza" value="Cancelar" class="btn btn-danger" onclick="autorizaRechaza(2);">
            </td>
        </tr>
      </table>
</FORM>
<div id="divControlesPR" style="display:none">
    <div id="divReferencia">
        <input type="text" name="txtReferencia" id="txtReferencia" size="15" maxlength="50" required message="Este campo es obligatorio"/>
    </div>
    <div id="divFolioAutorizado">
        <select name="cboFolioAutorizado" id="cboFolioAutorizado">
            <option value="S" selected="selected">Si</option>
            <option value="N">No</option>
        </select>
    </div>
    <div id="divDelegadoFiduciario">
        <select size="1" name="cboDelegadoFiduciario" id="cboDelegadoFiduciario" ref="muestraDatosPersonalOrdenado" fun="loadComboElement" keyValue="perNomUsuario" theValue="perNomUsuario" next="cboCausaRechazo" required message="Este campo es obligatorio">
        </select>
    </div>
    <div id="divCumple">
        <select name="cboCumple" id="cboCumple" onchange="aplicaReglasCumple()">
            <option value="S" selected="selected">Si</option>
            <option value="N">No</option>
        </select>
    </div>
    <div id="divCausaRechazo">
        <select size="1" name="cboCausaRechazo" id="cboCausaRechazo" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" next="cargaTablaParaPtosRev" param="clavesCombo1075" disabled="disabled" message="Este campo es obligatorio">
        </select>
    </div>
    <div id="divObservaciones">
        <textarea name="txtObservaciones" id="txtObservaciones" style="width:200px;height:50px; display: none;"></textarea>
    </div>
    <input  id="paramEtapa" name="paramEtapa" size="10" />
</div>