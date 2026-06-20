<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table width="100%" style="height:auto;">
    <tr>
      <td align="center" class="titulo">Parametrizaci�n de
                                                      Interfase A2K vs FiduciaWeb</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table align="center" class="texto" width="90%">
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Clave A2K</td>
            <td>
              <input type="text" name="paramClaveA2K" id="paramClaveA2K" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Tipo de Operacion</td>
            <td>
              <select size="1" name="paramTipoOPer" id="paramTipoOPer" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave"  param="clavesCombo1003" next="formsLoaded" required message="El tipo de Operacion es un campo obligatorio"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Clave FiduciaWeb</td>
            <td>
              <input type="text" name="paramFiduciaWeb" id="paramFiduciaWeb" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="qryParamInterfase" fun="loadTableElement" tabla="tblReg" onclick="consultar(this,frmDatos, false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" value="Limpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatos);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="   Alta  " name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoVentanas(1);"/>
              <!--input type="BUTTON" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoVentanas(2);"/-->
              <input type="BUTTON" value="   Baja  " name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoVentanas(3);"/>
              <input type="BUTTON" value="Consultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoVentanas(4);"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr align="center">
            <td colspan="4">
              <table border="0" cellpadding="0" cellspacing="0">
                <tr class="cabeceras" align="left">
                  <td align="center" width="23" nowrap>&nbsp;</td>
                  <td width="150" nowrap>Clave A2K</td>
                  <td width="150" nowrap>Clave FiduciaWeb</td>
                  <td width="150" nowrap>Tipo Operacion</td>
                  <td width="100" nowrap>Num Operacion</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:573px;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblReg" dataInfo="arrTblDat" keys="fvfwIdOperSisVal,fvfwIdOperSisFw,fvfwTipoOper,fvfwNumOperacion" fun="clickTabla" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                </table>
              </div>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</FORM>
