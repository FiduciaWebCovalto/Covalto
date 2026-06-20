<FORM name="frmPtosSol" id="frmPtosSol" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Puntos de Revision de Instruccion Monetaria Incompleta</td>
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
                           <input type="radio" class="radio" name="rdReporte" id="rd1"> Expediente Digital<br>
                           <input type="radio" class="radio" name="rdReporte" id="rd2"> Historico de Operaciones<br>
                           <input type="radio" class="radio" name="rdReporte" id="rd3"> Partes del Fideicomiso<br>
                           <input type="radio" class="radio" name="rdReporte" id="rd4"> Apoderados / Representantes<br>
                           <input type="radio" class="radio" name="rdReporte" id="rd5"> Comite Tecnico
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
                        <td style="text-align:center"><input type="BUTTON" name="cmdReporte" value="Reporte" class="btn btn-primary" onclick="generaReporte();"/></td>
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
            <table cellspacing="1" cellpadding="0" border="0">
              <tr align="left" class="cabeceras">
                <td width="50px">&nbsp;</td>
                <td width="50px">Id</td>
                <td width="550px">Punto de Revision</td>
                <td width="50px">Cumple</td>
                <td width="50px">Excepcion</td>
                <td width="400px">Causa del Rechazo</td>
                <td width="50px">Rechazo Subsanable</td>
                <td width="200px">Facultado</td>
                <td width="1px" style="display: none;">Observaciones</td>
                <td width="200px">Estatus</td>
              </tr>
            </table>
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegPtosRev" dataInfo="arrTblDatPtoRev" keys="fpurIdPuntorev,fpurDescripcion,frxoRevCorrecta,frxoExcepcion,frxoCausaRechazo,frxoSubsanable,frxoFacultado,frxoObservacion" fun="clickTablaPtoRev" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda" rowFunction="rowPuntoRevision">
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
        <tr align="center"><td colspan="5"><a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a></td></tr>
        <tr align="center">
            <td colspan="5">
               <!--input type="BUTTON" name="cmdGuardar" value="Guardar" class="btn btn-primary" onclick="guardar(1);"-->
               <input type="BUTTON" name="cmdGuardar" value="Guardar Revisiones" class="btn btn-primary" onclick="guardarRevisiones();">
               <input type="BUTTON" name="cmdRegresar" value="Regresar" class="btn btn-danger" onclick="cargaPantallaInstrucciones();">
               <input type="BUTTON" name="cmdReporte" value="Reporte Finalidades" class="btn btn-primary" onclick="generaReporteFinalidades();"/>
            </td>
        </tr>
        <tr><td align="center" valign="middle">&nbsp;</td></tr>
        <tr>
            <td align="center" valign="middle">
                <input type="BUTTON" name="cmdAutoriza" value="Aceptar" class="btn btn-primary" onclick="autorizaRechaza(1);">
                <!--input type="BUTTON" name="cmdIncompleto" value="Incompleta" class="btn btn-success" onclick="autorizaRechaza(3);"-->
                <input type="BUTTON" name="cmdRevision" value="En Revision" class="btn btn-warning" onclick="autorizaRechaza(4);">
                <input type="BUTTON" name="cmdRechaza" value="Cancelar" class="btn btn-danger" onclick="autorizaRechaza(2);">
            </td>
        </tr>
      </table>
</FORM>
<div id="divCumple">
    <select id="cboCumple" style="display:none" onchange="aplicaReglasCumple()">
        <option value="S" selected="selected">Si</option>
        <option value="N">No</option>
    </select>
</div>
<div id="divExcepcion">
    <select id="cboExcepcion" style="display:none" disabled="disabled" onchange="aplicaReglasExcepcion()">
        <option value="S">Si</option>
        <option value="N" selected="selected">No</option>
    </select>
</div>
<div id="divCausaRechazo">
    <select id="cboCausaRechazo" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" next="hideWaitLayer" param="clavesCombo1075" style="display:none" disabled="disabled" message="Especifique la Causa del Rechazo">
    </select>
</div>
<div id="divSubsanable">
    <select id="cboSubsanable" style="display:none" disabled="disabled">
        <option value="S">Si</option>
        <option value="N" selected="selected">No</option>
    </select>
</div>
<input  id="paramEtapa" name="paramEtapa" size="10" style="display:none" />
<div id="divObservaciones" style="display: none;">
    <textarea id="txtObservaciones" style="width:200px;height:50px; display: none;"></textarea>
</div>