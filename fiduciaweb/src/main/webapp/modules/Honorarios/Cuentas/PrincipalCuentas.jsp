<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Contratos de Inversi&oacute;n</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto">
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">No. Fideicomiso</td>
            <td>
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" maxlength="10" disabled/>
            </td>
            <td colspan="4">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="8" align="center">&nbsp;
            <input type="BUTTON" value="Regresar" id="cmdRegresar" name="cmdRegresar" class="btn btn-primary" ref="conPriDirFid" fun="loadTableElement" tabla="tblReg" onclick="cargaMantenimientoFideicomitentes(operacion);"/>
            <input type="BUTTON" value="Asignar Contrato de Inversion" id="cmdAsignar" name="cmdAsignar" class="btn btn-primary" ref="" fun="loadTableElement" tabla="tblReg" onclick="cargaMantenimientoCuentas(operacion);"/></td>
          </tr>
          <tr>
            <td align="center" colspan="8">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCuentas(1)"/>
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
                  <td width="23" nowrap>&nbsp;</td>
                  <td width="40" nowrap>Fideicomiso</td>
                  <td width="23" nowrap>&nbsp;</td>
                  <td width="300" nowrap>Inversion</td>
                </tr>
              </table>
              <div style="height:150px; overflow:auto; position:relative; vertical-align:top;">
                <table id="tblReg" border="0" cellspacing="0" cellpadding="0" dataInfo="arrTblDat" keys="pacNumCto,pacCtoInver" fun="clickTabla2" radioWidth="23">
                </table>
              </div>
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</FORM>
