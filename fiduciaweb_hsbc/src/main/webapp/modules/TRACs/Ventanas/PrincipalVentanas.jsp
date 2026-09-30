<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table width="100%" style="height:auto;">
    <tr>
      <td align="center" class="titulo">Parametrizaci�n de Ventanas</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table align="center" class="texto" width="90%">
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Ventana</td>
            <td>
              <input type="text" name="paramNumVentana" id="paramNumVentana" tipo="Num" size="10" maxlength="10"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Pizarra</td>
            <td>
              <select name="paramVarPizarra" id="paramVarPizarra" ref="conPriEmi" fun="loadComboElement" keyValue="emiNomPizarra" theValue="emiNomPizarra" next="formsLoaded" param="cmbPizarra" required message="La Pizarra es un campo obligatorio"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Serie</td>
            <td>
              <input type="text" name="paramVarSerie" id="paramVarSerie" size="10" maxlength="25"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr>
          <!--tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Cup�n</td>
            <td>
              <input type="text" name="paramNumCupon" id="paramNumCupon" size="8" maxlength="10" tipo="Num"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr-->
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="qryVentanasTrack" fun="loadTableElement" tabla="tblReg" onclick="consultar(this,frmDatos, false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
              <input type="BUTTON" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoVentanas(2);"/>
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
                  <td width="100" nowrap>Ventana</td>
                  <td width="200" nowrap>Pizarra</td>
                  <td width="150" nowrap>Tipo Par�metro</td>
                  <td width="100" nowrap>Serie</td>
                  <td width="100" nowrap>Hora Ini.</td>
                  <td width="100" nowrap>Hora Fin</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:773px;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblReg" dataInfo="arrTblDat" keys="patIdVentana,patIdPizarra,patIdSerie,patIdCupon,patHoraInicio,patHoraFin" fun="clickTabla" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de b�squeda">
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
