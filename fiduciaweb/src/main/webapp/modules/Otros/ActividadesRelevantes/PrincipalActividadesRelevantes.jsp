<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table width="100%" style="height:auto;">
    <tr>
      <td align="center" class="titulo">Parametrizaci�n PLD</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table align="center" class="texto" width="90%">
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Fideicomiso</td>
            <td>
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" tipo="Num" size="10" maxlength="10" onblur="verificacionActivo(this);"/>
            </td>
            <td width="25%">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Tipo Operaci�n</td>
            <td>
              <select name="paramTipoOperacion" id="paramTipoOperacion" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" next="paramStatus" param="clavesCombo702"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td width="25%">&nbsp;</td>
            <td width="20%">Status</td>
            <td>
              <select size="1" name="paramStatus" id="paramStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo31" next="formsLoaded"/>
            </td>
            <td width="25%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="qryActividadesRelevantes" fun="loadTableElement" tabla="tblReg" onclick="consultar(this,frmDatos, false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
              <input type="BUTTON" value="   Alta  " name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoActividadesRelevantes(1);"/>
              <input type="BUTTON" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoActividadesRelevantes(2);"/>
              <input type="BUTTON" value="   Baja  " name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoActividadesRelevantes(3);"/>
              <input type="BUTTON" value="Consultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoActividadesRelevantes(4);"/>
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
                  <td width="80" nowrap>Fiso</td>
                  <td width="200" nowrap>Tipo Operaci�n</td>
                  <td width="80" nowrap>Dep�sitos</td>
                  <td width="80" nowrap>Retiros</td>
                  <td width="80" nowrap>Dep�sitos Eftvo.</td>
                  <td width="150" nowrap>Status</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:693px;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblReg" dataInfo="arrTblDat" keys="farIdTipoOperacion,farIdContrato" fun="clickTabla" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de b�squeda">
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
