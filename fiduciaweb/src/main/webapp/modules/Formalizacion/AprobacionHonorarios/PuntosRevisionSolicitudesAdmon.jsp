<FORM name="frmPtosSol" id="frmPtosSol" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Puntos de Revision de Aprobacion Honorarios</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
        <tr>
            <td height="100%">
                <table width="100%" class="texto" border="0" style="text-align:left">
                    <tr>
                        <td width="30%">&nbsp;</td>
                        <td width="15%">No. Prospecto</td>
                        <td width="25%"><input type="text" name="pacNumContrato" id="pacNumContrato" size="10" disabled="disabled"/></td>
                        <td width="30%">&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>Nombre</td>
                        <td><input type="text" name="antNomNegocio" id="antNomNegocio" size="50" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>Tipo de Negocio</td>
                        <td><input type="text" name="antCveTipoNeg" id="antCveTipoNeg" size="20" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
          </td>
        </tr>
        <tr>
            <td width="90%" colspan="5" align="center" valign="middle">
                &nbsp;<input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
                <input type="text" name="paramIdEtapa" id="paramIdEtapa" value="11" size="1" style="visibility:hidden"/>
            </td>
        </tr>
        <tr align="center">
          <td colspan="5">
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width:100%">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegPtosRev" dataInfo="arrTblDatPtoRev" keys="fpurIdPuntorev,fpurDescripcion,frxoRevCorrecta,frxoObservacion" fun="clickTablaPtoRev" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda" rowFunction="rowPuntoRevision">
                    <thead>
                      <tr align="left" class="cabeceras">
                        <td width="23px">&nbsp;</td>
                        <td width="23px">Id</td>
                        <td width="550px">Punto de Revision</td>
                        <td width="100px">Cumple</td>
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
                  <textarea name="txtObservaciones" id="txtObservaciones" style="width:600px;height:80px" onkeydown="validaLongitud(this,255);"></textarea>
                </td>
                <td>
                    <input type="BUTTON" name="cmdGuardar" value="Guardar Revision" class="btn btn-primary" onclick="guardarRevision();">
                </td>
              </tr>
           </table>
           </td>
        </tr>
        <tr align="center"><td colspan="5"><a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a></td></tr>
        <tr align="center">
            <td colspan="5">
               <input type="BUTTON" name="cmdRegresar" value="Regresar" class="btn btn-danger" onclick="cargaPantallaAprobacionHonorarios();">
            </td>
        </tr>
        <tr><td align="center" valign="middle">&nbsp;</td></tr>
        <tr>
            <td align="center" valign="middle">
                <input type="BUTTON" name="cmdAutoriza" value="Autorizar" class="btn btn-primary" onclick="autorizaRechaza(1);">
                <input type="BUTTON" name="cmdRechaza" value="Rechazar" class="btn btn-danger" onclick="autorizaRechaza(2);">
            </td>
        </tr>
      </table>
</FORM>
<div id="divCumple">
    <select id="cboCumple" style="display:none">
        <option value="S" selected="selected">Si</option>
        <option value="N">No</option>
    </select>
</div>
<div id="divObservaciones" style="display: none;">
    <textarea id="txtObservaciones" style="width:200px;height:50px; display: none;"></textarea>
</div>