<FORM name="frmPrincipalSaldosInversionista" id="frmPrincipalSaldosInversionista">
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Saldos de Inversionistas</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" align="center" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="5%" nowrap>
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" maxlength="10" tipo="Num" value="<%=session.getAttribute("fideicomisoCtasInd")!=null?session.getAttribute("fideicomisoCtasInd").toString():"0"%>"/>
            </td>
            <td colspan="5">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomisoCtasIndiv" param="divNombreFideicomisoParam" next="divReedireccion">&nbsp;</div>
            </td>
            <td nowrap width="15%" colspan="4">
              <div id="divReedireccion" class="textoNegrita" ref ="refer" fun="reedireccionar();" next="asignaNivel">&nbsp;</div>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="5%" nowrap>Mes</td>
            <td colspan="5">
              <input type="text" name="paramMes" id="paramMes" size="2" maxlength="2" tipo="Num" required message="El mes es un campo obligatorio"/>
              <input type="text" name="txtLonNiv1" id="txtLonNiv1" size="1" ref="conLonNivFid" fun="loadTxtElementX" theValue="longitudNivel" param="divNombreFideicomisoParam" next="asignaNivel" style="visibility:hidden"/>
              <input type="text" name="txtLonNiv2" id="txtLonNiv2" size="1" ref="conLonNivFid" fun="loadTxtElementX" theValue="longitudNivel" param="divNombreFideicomisoParam" next="asignaNivel" style="visibility:hidden"/>
              <input type="text" name="txtLonNiv3" id="txtLonNiv3" size="1" ref="conLonNivFid" fun="loadTxtElementX" theValue="longitudNivel" param="divNombreFideicomisoParam" next="formsLoaded" style="visibility:hidden"/>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="5%" nowrap>A&ntilde;o</td>
            <td colspan="5">
              <input type="text" name="paramAno" id="paramAno" size="4" maxlength="4" tipo="Num" required message="El a�o es un campo obligatorio"/>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="5%" nowrap>Clave Inversionista</td>
            <td colspan="5">
              <input type="text" name="paramCveInversionista" id="paramCveInversionista" size="30" maxlength="30" tipo="AlphaNumeric"/>
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="5%" nowrap>Inversionista</td>
            <td colspan="5">
              <input type="text" name="paramInversionista" id="paramInversionista" size="50" maxlength="100" tipo="AlphaNumeric" />
            </td>
            <td width="20%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="8" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="8" align="center">
              <input type="BUTTON" id="Aceptar" name="Aceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosSaldosInversionistas" fun="loadTableElement" tabla="tablaSaldosInversionista"  onclick="consultar(this, GI('frmPrincipalSaldosInversionista'), false);" NoRecordsMsg="No existen Registros para estos criterios de b�squeda"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" name="cmdLimpiar" size="20%" class="btn btn-warning" onclick="RF(GI('frmPrincipalSaldosInversionista'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="8" align="center">&nbsp;
            </td>
          </tr>
          
          <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaSaldosInversionista" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaSaldosInversionistaData" keys="datDato" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Inversionista</td>
                  <td>Saldo Inicial</td>
                  <td>Dep&oacute;sitos</td>
                  <td>Retiros</td>
                  <td>Saldo Actual</td>
                  <td>N&uacute;m Dep&oacute;sitos</td>
                  <td>N&uacute;m Retiros</td>
                   
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
