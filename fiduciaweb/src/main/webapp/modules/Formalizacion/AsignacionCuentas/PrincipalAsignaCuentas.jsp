<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Asignaci&oacute;n de Cuentas</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" border="0" class="texto" style="text-align: left;">
          <tr>
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">No. Prospecto</td>
            <td nowrap>
              <input type="text" name="paramnumProspecto" id="paramnumProspecto" size="10" maxlength="10"/>
            </td>
            <td nowrap width="60%">
              <input type="text" name="prsNomProspecto" id="prsNomProspecto" size="50" maxlength="50"/>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="5" align="center">&nbsp;
            <input type="BUTTON" value="Regresar" id="cmdRegresar" name="cmdRegresar" class="btn btn-primary" ref="qryCuentasProspecto" fun="loadTableElement" tabla="tblReg" onclick="cargaPrincipalProspectos();"/></td> <!--ref="conPriDirFid"-->            
          </tr>
          <tr>
            <td align="center" colspan="8">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCuentas(1);"/>
              <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoCuentas(3);"/>
            </td>
          </tr>
          <tr>
            <td colspan="5">&nbsp;</td>
          </tr>
     
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblReg"  border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0"  dataInfo="arrTblDatProsp" keys="pccNumCuenta" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>No. Cuenta</td>
                  <td>Banco</td>
                  <td>Moneda</td>
                  <td>Tipo de Cuenta</td>
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
