<FORM name="frmPagoHonorariosConsulta" id="frmPagoHonorariosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Cobro de Honorarios</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="40%">&nbsp;</td>
              <td width="8%">No. Fideicomiso</td>
              <td colspan="4">
                <input type="text" name="paramNumCto" id="paramNumCto" tipo="Num" size="10"/>
              </td>
              <td width="8%">&nbsp;</td>
            </tr>
            <tr>
              <td width="15%" colspan="7">
                <input type="text" name="paramCveCalifHono" id="paramCveCalifHono" size="10" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td width="15%" align="center" colspan="7">&nbsp;
                <input type="BUTTON" id="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosComposicionCartera" fun="loadTableElement" tabla="tablaRegistrosPagoHonorarios" onclick="validacionesPorContrato();"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="BUTTON" value="Limpiar" name="cmdLimpiar" size="20%" class="btn btn-warning" onclick="cargaPrincipalPagoHonorarios()"/>
              </td>
            </tr>
            <tr>
              <td colspan="7" align="center" valign="middle">
                <input type="text" name="paramorder" id="paramorder" size="1" value="s" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td colspan="7" align="center" valign="middle">
                <input type="BUTTON" value=" Pagar " name="cmdPagar" size="20%" class="btn btn-primary" onclick="cargaPrincipalPagoHonorariosConsulta2();"/>
              </td>
            </tr>
            <tr>
              <td colspan="7" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="7" align="center" valign="middle" class="subtitulo">COMPOSICION DE CARTERA POR FIDEICOMISO</td>
            </tr>
            
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosPagoHonorarios" border="0" cellspacing="0" class="texto" 
                  style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaPagoHonorariosData"
                  keys="decCveTipoHono,decNumPersFid,decCvePersFid,decNumContrato,decFecCalcHono,decNumSecuencial,folio" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>&nbsp;</td>
                    <td>Persona Fid.</td>
                    <td>No.</td>
                    <td>Honorarios</td>
                    <td>Fecha C&aacute;lculo</td>
                    <td>Secuencia</td>
                    <td>Orig. Honor</td>
                    <td>Rem. Honor.</td>
                    <td>Calif. Hono.</td>
                  </tr>                  
                  </thead>
                   <tbody></tbody>
                  </table>
                </div>
              </td>
            </tr>            
            
            <tr>
              <td valign="middle" width="40%">&nbsp;</td>
              <td valign="middle" colspan="3" width="55%">&nbsp;</td>
              <td valign="middle" width="20%" align="right">&nbsp;</td>
              <td valign="middle">
                <div id="txtTotCartera" class="textoNegrita"/>
              </td>
              <td valign="middle" width="8%">&nbsp;</td>
            </tr>
            <tr>
              <td valign="middle" width="40%">&nbsp;</td>
              <td valign="middle" colspan="3" width="55%">&nbsp;</td>
              <td valign="middle" width="30%" align="right">&nbsp;</td>
              <td valign="middle">&nbsp;</td>
              <td valign="middle" width="8%">&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
  </table>
</FORM>
