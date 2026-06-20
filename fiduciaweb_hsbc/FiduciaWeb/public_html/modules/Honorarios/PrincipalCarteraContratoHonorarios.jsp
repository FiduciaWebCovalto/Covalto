<FORM name="frmCarteraHonorariosConsulta" id="frmCarteraHonorariosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Cartera por Fideicomiso</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="40%">&nbsp;</td>
              <td width="10%">No Fideicomiso</td>
              <td>
                <input type="text" name="paramNumFiso" id="paramNumFiso" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="15%" colspan="4">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;
                <input type="BUTTON" id="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosCarteraHonorarios" fun="loadTableElement" tabla="tablaRegistrosCarteraHonorarios" onclick="consultar(this, GI('frmCarteraHonorariosConsulta'), false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="BUTTON" value="Limpiar" name="cmdLimpiar" size="20%" class="btn btn-primary" onclick="RF(GI('frmCarteraHonorariosConsulta'));"/>
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
                <input type="BUTTON" value="Consultar" name="cmdConsultar" id="cmdConsultar" class="btn btn-primary" onclick="cargaPrincipalComposicionCarteraHonorarios();"/>
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle" class="subtitulo">DETALLE DE LA CARTERA</td>
            </tr>
            
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosCarteraHonorarios" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaCarteraHonorariosData" keys="carNumContrato,carCvePersFid,carNumPersFid,carCveTipoHono" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td >&nbsp;</td>
                    <td >Tipo Persona</td>
                    <td >No.</td>
                    <td >Tipo Honorario</td>
                    <td >Periodo Actual</td>
                    <td >30 D&iacute;as</td>
                    <td >60 D&iacute;as</td>
                    <td >90 D&iacute;as</td>
                    <td >Reserva</td>                 
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
