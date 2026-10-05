<FORM name="frmPtosSol" id="frmPtosSol" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Validar Cuentas Bancarias y de Inversion<br>Puntos de Revision</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
        <tr>
            <td height="100%">
                <table width="100%" class="texto" border="0" style="text-align:left">
                    <tr>
                      <td width="20%">&nbsp;</td>
                      <td width="10%">Fideicomiso</td>
                      <td><input type="text" name="paramContrato" id="paramContrato" size="10" onchange="verNomFiso();" disabled="disabled"/></td>
                      <td width="30%"></td>
                    </tr>
                    <tr>
                      <td width="20%">&nbsp;</td>
                      <td width="10%">No. Cuenta</td>
                      <td><input type="text" name="fciNumCta" id="fciNumCta" size="10" onchange="verNomFiso();" disabled="disabled"/></td>
                      <td width="30%"></td>
                    </tr>
                    <tr>
                      <td width="20%">&nbsp;</td>
                      <td width="10%">Tipo Cuenta</td>
                      <td><input type="text" name="fciTipoCta" id="fciTipoCta" size="10" onchange="verNomFiso();" disabled="disabled"/></td>
                      <td width="30%"></td>
                    </tr>
                    <tr>
                      <td width="20%">&nbsp;</td>
                      <td width="10%">Institucion</td>
                      <td>
                      <input type="text" name="fciInstitucion" id="fciInstitucion" size="10"  disabled="disabled"/>
                      </td>
                      <td width="30%">&nbsp;</td>
                    </tr>  
                    <tr>
                      <td width="20%">&nbsp;</td>
                      <td width="25%">Moneda</td>
                      <td><input type="text" name="monNomMoneda" id="monNomMoneda" size="20" maxlength="20"  disabled="disabled"/></td>
                      <td width="30%">&nbsp;</td>
                    </tr>
                    <tr>
                      <td width="20%">&nbsp;</td>
                      <td width="25%">Fecha alta</td>
                      <td><input type="text" name="fbisFechaIni" id="fbisFechaIni" size="20" maxlength="20"  disabled="disabled"/></td>
                      <td width="30%">&nbsp;</td>
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
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegPtosRev"
                dataInfo="arrTblDatPtoRev" 
                keys="fpurIdPuntorev,fpurDescripcion,
                frxoRevCorrecta,frxoCausaRechazo,frxoObservacion,fciFeDeAp" 
                fun="clickTablaPtoRev" 
                radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda" 
                rowFunction="rowPuntoRevision">
                    <thead>
                      <tr align="left" class="cabeceras">
                        <td width="50px">&nbsp;</td>
                        <td width="50px">Id</td>
                        <td width="550px">Punto de Revision</td>
                        <td width="50px">Cumple</td>
                        <td width="400px">Causa del Rechazo</td>
                        <td width="200px">Observaciones</td>
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
        <tr align="center"><td colspan="5"><a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a></td></tr>
        <tr align="center">
            <td colspan="5">
               <input type="BUTTON" name="cmdGuardar" id="cmdGuardar" value="Guardar Revisiones" class="btn btn-primary" onclick="guardarRevisiones();">
               <input type="BUTTON" name="cmdRegresar" id="cmdRegresar" value="Regresar" class="btn btn-danger" onclick="cargaPantallaInstrucciones();">
            </td>
        </tr>
        <tr><td align="center" valign="middle">&nbsp;</td></tr>
        <tr>
            <td align="center" valign="middle">
                <input type="BUTTON" name="cmdAutoriza" id="cmdAutoriza" value="Aceptar" class="btn btn-primary" onclick="autorizaRechaza(1);">
                <input type="BUTTON" name="cmdRechaza"  id="cmdRechaza" value="Cancelar" class="btn btn-danger" onclick="autorizaRechaza(2);">
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
    <div id="divCausaRechazo" >
        <select size="1" id="cboCausaRechazo" style="display:none" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" next="hideWaitLayer" param="clavesCombo1075" disabled="disabled" message="Este campo es obligatorio">
        </select>
    </div>
    <div id="divObservaciones">
        <textarea id="txtObservaciones" style="width:200px;height:50px; display: none;"></textarea>
    </div>
    <input  id="paramEtapa" size="10" value="12" style="display:none" />