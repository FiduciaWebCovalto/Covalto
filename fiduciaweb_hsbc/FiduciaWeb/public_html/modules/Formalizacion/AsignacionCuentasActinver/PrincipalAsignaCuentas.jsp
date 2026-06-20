<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Asignaci&oacute;n de Cuentas de Actinver</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto">
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">No. Prospecto</td>
            <td>
              <input type="text" name="paramnumProspecto" id="paramnumProspecto" size="10" maxlength="10"/>
            </td>
            <td colspan="4">
              <div id="nomProspect" class="textoNegrita" ref="conNomFid">&nbsp;</div>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          
          <tr>
            <td colspan="8" align="center">&nbsp;
            <input type="BUTTON" value="Regresar" id="cmdRegresar" name="cmdRegresar" class="btn btn-primary" ref="qryCuentasProspecto2" fun="loadTableElement" tabla="tblReg" onclick="cargaMantenimientoProspectos(operacion);"/></td> <!--ref="conPriDirFid"-->            
          </tr>
          <tr>
            <td align="center" colspan="8">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCuentas(1);"/>
              <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoCuentas(3);"/>
            </td>
          </tr>
          <tr>
            <td colspan="8">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="8" align="center">
              <table cellspacing="0" cellpadding="0" border="0" class="texto">
                <tr class="cabeceras">
                  <td width="15" nowrap>&nbsp;</td>
                  <td width="60" nowrap>ID</td>
                  <td width="80" nowrap>No. Cuentas</td>
                  <td width="200" nowrap>&nbsp; No. Cuentas Casa de Bolsa</td>
                </tr>
              </table>
              <div style="height:150px; overflow:auto; position:relative; vertical-align:top;">
                <table id="tblReg" border="0" cellspacing="0" cellpadding="0" dataInfo="arrTblDatProsp" keys="prsIdCuentas" fun="clickTablaProsp" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                </table>
              </div>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</FORM>
