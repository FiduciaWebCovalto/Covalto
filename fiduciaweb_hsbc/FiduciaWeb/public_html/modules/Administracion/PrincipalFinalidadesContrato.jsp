<FORM name="frmDatosFinalidadesContratoConsulta" id="frmDatosFinalidadesContratoConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Finalidades</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto">
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap width="6%">No. Fideicomiso</td>
              <td width="8%">
                <input type="text" name="paramNumFiso" id="paramNumFiso" tipo="Num" size="10" maxlength="10" onblur="consultaNombreFideicomiso('nomFideicomiso',this);"/>
              </td>
              <td colspan="3" width="10%">
                <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
              </td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td nowrap width="6%">No. Finalidad</td>
              <td width="8%">
                <input type="text" name="paramNumFinalidad" id="paramNumFinalidad" tipo="Num" size="10" maxlength="10"/>
                <input type="text" name="paramDictador" id="paramDictador" size="50" value="1" maxlength="50" style="visibility:hidden"/>
              </td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosFinalidadesContrato" fun="loadTableElement" tabla="tablaRegistrosFinalidadesContrato" onclick="consultar(this, GI('frmDatosFinalidadesContratoConsulta'), false);">
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosFinalidadesContratoConsulta);"/>
                </td>
                </tr>
            </table>
                
                
              </td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoFinalidadesContrato(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoFinalidadesContrato(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoFinalidadesContrato(3)"/> </td>                   
                  </td>
                </tr>
            </table>
                
              </td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosFinalidadesContrato" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaFinalidadesContratoData" keys="finNumContrato,finCveTipoFinal,finFolioFinalida" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>&nbsp;</td>
                    <td>Fideicomiso</td>
                    <td>Texto</td>
                    <td>Status</td>
                    <td>Folio</td>                    
                  </tr>                  
                  </thead>
                   <tbody></tbody>
                  </table>
                </div>
              </td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
  </table>
</FORM>
