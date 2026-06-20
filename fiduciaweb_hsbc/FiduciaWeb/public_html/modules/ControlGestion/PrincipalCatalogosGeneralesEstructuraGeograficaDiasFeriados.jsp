<FORM name="frmPrincipalCatalogosGeneralesEstructuraGeograficaDiasFeriados" id="frmPrincipalCatalogosGeneralesEstructuraGeograficaDiasFeriados" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Principal D&iacute;as Feriados</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table cellspacing="2" cellpadding="3" border="0" width="100%" class="texto">
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="5%">Pa&iacute;s</td>
            <td>
              <select size="1" name="paramPais" id="paramPais" ref="clavePais" fun="loadComboElement" keyValue="paiNumPais" theValue="paiNomPais" next="formsLoaded"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="5%">D&iacute;a</td>
            <td>
              <input type="text" name="paramDiaFeriado" id="paramDiaFeriado" tipo="Num" size="2" maxlength="2"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="5%">Mes</td>
            <td>
              <input type="text" name="paramMesFeriado" id="paramMesFeriado" tipo="Num" size="2" maxlength="2"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td width="5%">A&ntilde;o</td>
            <td>
              <input type="text" name="paramAnoFeriado" id="paramAnoFeriado" tipo="Num" size="4" maxlength="4"/>
            </td>
            <td width="5%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosDiasFeriados" fun="loadTableElement" tabla="tablaRegistrosDatosDiasFeriados" onclick="consultar(this, GI('frmPrincipalCatalogosGeneralesEstructuraGeograficaDiasFeriados'), false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalCatalogosGeneralesEstructuraGeograficaDiasFeriados'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCatalogosGeneralesEstructuraGeograficaDiasFeriados(1)"/>
              <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoCatalogosGeneralesEstructuraGeograficaDiasFeriados(2)"/>
              <input type="BUTTON" value="  Baja   " id="cmdBajar" name="cmdBajar" class="btn btn-primary" onclick="eliminarRegistro()"/>
              <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoCatalogosGeneralesEstructuraGeograficaDiasFeriados(3)"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosDatosDiasFeriados" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaDatosDiasFeriadosData" keys="ferFecMes,ferFecDia,ferFecAno,ferNumPais" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Pa&iacute;s</td>
                  <td>D&iacute;a</td>
                  <td>Mes</td>
                  <td>A&ntilde;o</td>
                  <td>Descripci&oacute;n</td>
                  <td>Status</td>
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
