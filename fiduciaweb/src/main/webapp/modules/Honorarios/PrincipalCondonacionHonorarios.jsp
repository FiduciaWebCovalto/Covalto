<FORM name="frmCondonacionHonorarios" id="frmCondonacionHonorarios" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Condonaci&oacute;n / Quebranto</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="40%">&nbsp;</td>
              <td width="10%">No. Fideicomiso</td>
              <td>
                <input type="text" name="paramNumCto" id="paramNumCto" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td width="15%">&nbsp;</td>
            </tr>
            <tr>
              <td width="15%" colspan="4" align="center">
                <input name="paramCveCalifHono" id="paramCveCalifHono" tipo="AlphaNumeric" size="10" value="PENDIENTE" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td width="15%" align="center" colspan="4">&nbsp;
                <input type="BUTTON" id="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosComposicionCartera" fun="loadTableElement" tabla="tablaRegistrosCondonacionHonorarios" onclick="validacionesPorContrato();"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="BUTTON" value="Limpiar" name="cmdLimpiar" size="20%" class="btn btn-warning" onclick="RF(GI('frmCondonacionHonorarios'));"/>
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
                <input type="BUTTON" value=" Condonar/Quebranto " name="cmdCondonar" size="20%" class="btn btn-primary" onclick="cargaPrincipalCondonacionHonorarios2();"/>
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle" class="subtitulo">COMPOSICION DE CARTERA POR FIDEICOMISO</td>
            </tr>            
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosCondonacionHonorarios" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaCondonacionoHonorariosData" keys="decCveTipoHono,decNumPersFid,decCvePersFid,decNumContrato,decFecCalcHono,decNumSecuencial,folio" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
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
          </table>
        </td>
      </tr>
  </table>
</FORM>
