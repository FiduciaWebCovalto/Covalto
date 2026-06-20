<FORM name="frmDatosAvisosHonorariosConsulta" id="frmDatosAvisosHonorariosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Cat&aacute;logo para los Avisos de Cobro</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="30%">&nbsp;</td>
              <td width="10%">No. Fideicomiso</td>
              <td width="25%">
                <input type="text" name="paramNumFiso" id="paramNumFiso" tipo="Num" size="10" maxlength="10" onblur="consultaNombreFideicomiso('nomFideicomiso',this);"/>
              </td>
               <td width="45%">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="10%">Dirigido a</td>
              <td>
                <input type="text" name="paramDirigidoA" id="paramDirigidoA" tipo="AlphaNumeric" size="50" maxlength="255"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="10%">Ciudad</td>
              <td>
                <input type="text" name="paramCiudad" id="paramCiudad" tipo="AlphaNumeric" size="50" maxlength="50"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" id="Aceptar" name="Aceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosAvisosHonorarios" fun="loadTableElement" tabla="tablaRegistrosDatosAvisosHonorarios" onclick="consultar(this, GI('frmDatosAvisosHonorariosConsulta'), false);"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" name="cmdLimpiar" size="20%" class="btn btn-warning" onclick="RF(GI('frmDatosAvisosHonorariosConsulta'));"/>
                </td>
                </tr>
            </table>
                
                
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoDatosAvisosHonorarios(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoDatosAvisosHonorarios(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoDatosAvisosHonorarios(3)"/> </td>                   
                  </td>
                </tr>
            </table>                  
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosDatosAvisosHonorarios" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaDatosAvisosHonorariosData" keys="davNumContrato" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>&nbsp;</td>
                    <td>Contrato</td>
                    <td>Dirigido a</td>
                    <td>Cargo</td>
                    <td>Ciudad/Estado</td>                  
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
  </table>
</FORM>
