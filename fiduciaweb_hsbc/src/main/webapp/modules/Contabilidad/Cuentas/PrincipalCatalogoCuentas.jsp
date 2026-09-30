<!--
//PrincipalCatalogoCuentas.jsp
//#01 2008-SEP-22: Se modificaron los tamanos de las columnas
-->
<form name="frmDatosCatalogoCuentas" id="frmDatosCatalogoCuentas" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" width="70%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Cat&aacute;logo de Cuentas</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="70%" class="texto" align="center">
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">&nbsp;</td>
            <td>Cuenta</td>
            <td>Scta</td>
            <td>Sscta</td>
            <td>Ssscta</td>
            <td>Sssscta</td>
            <td>Ssssscta</td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">&nbsp;</td>
            <td>
              <input type="text" name="paramNumCtam" id="paramNumCtam" size="4" maxlength="4" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumScta" id="paramNumScta" size="4" maxlength="2" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumSscta" id="paramNumSscta" size="4" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumSsscta" id="paramNumSsscta" size="4" maxlength="2" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumSsssscta" id="paramNumSssscta" size="4" maxlength="4" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumSsssscta" id="paramNumSsssscta" size="4" tipo="Num"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">Nombre</td>
            <td colspan="6">
              <input type="text" name="paramNomCta" id="paramNomCta" size="69" tipo="AlphaNumeric"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="10%">&nbsp;</td>
            <td colspan="6">
              <input type="checkbox" class="check" id="paramNumCtamFOSEG" value="-1" onclick="if(this.checked){this.value=7000;paramNumCtamNoFOSEG.value='';}else{this.value='';paramNumCtamNoFOSEG.value=7000;}"/>
              &nbsp;Cuentas 7000
            </td>
            <td colspan="6">
              <input type="checkbox" class="check" id="paramCtasMayor" value="-1" onclick="if(this.checked){this.value='ok'}"/>
              &nbsp;Cuentas de mayor
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="9" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              <input type="text" name="paramNumCtamNoFOSEG" id="paramNumCtamNoFOSEG" size="4" maxlength="4" tipo="Num" value="7000" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="9" align="center">&nbsp;
            <input type="button" value="Aceptar" name="cmdAceptar" class="btn btn-primary" ref="conPriCatCue" fun="loadTableElement" tabla="tblRegPriCatCue" onclick="enCeros();consultarCount(this, frmDatosCatalogoCuentas, false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="button" value="Limpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosCatalogoCuentas);"/></td>
          </tr>
          <tr>
            <td colspan="9">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="9" align="center">
              <input type="BUTTON" value="   Alta  " name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCatalogoCuentas(1);"/>
              <input type="BUTTON" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoCatalogoCuentas(2);"/>
              <input type="BUTTON" value="  Baja   " name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoCatalogoCuentas(3)"/>
              <input type="BUTTON" value="Consultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoCatalogoCuentas(4);"/>
            </td>
          </tr>
          <tr>
            <td colspan="9">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:800px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPriCatCue" border="0" cellspacing="0" class="texto" style="width:100%;"   width=800px  cellpadding="0" dataInfo="arrTblCatCueDat" keys="cueNumCtam,cueNumScta,cueNumSscta,cueNumSsscta,cueNumSssscta,cueNumSsssscta,cueNumAux1,cueNumAux2,cueNumAux3" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Cuenta</td>
                  <td>Sc1</td>
                  <td>Sc2</td>
                  <td>Sc3</td>
                  <td>Sc4</td>
                  <td>Sc5</td>
                  <td>Aux1</td>
                  <td>Aux2</td>
                  <td>Aux3</td>
                  <td>Nombre</td>
                  <td>Acr</td>
                  <td>Deu</td>
                  <td>Movto</td>
                  <td>Acum Rubro</td>
                  <td>Status</td-->
                   
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
</form>
