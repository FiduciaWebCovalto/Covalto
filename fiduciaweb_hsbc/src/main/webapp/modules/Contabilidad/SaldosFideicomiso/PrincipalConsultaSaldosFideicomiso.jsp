<form name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Saldos por Fideicomiso</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" align="center" class="texto">
          <tr>
            <td width="25%" nowrap>&nbsp;</td>
            <td nowrap colspan="2">Fideicomiso</td>
            <td nowrap colspan="2">
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" tipo="Num" required message="El Fideicomiso es un campo obligatorio" onblur="cargaMoneda();"/>
            </td>
            <td width="10%" nowrap colspan="5">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam"></div>
            </td>
            <td width="20%" nowrap>&nbsp;</td>
          </tr>
          <tr>
            <td align="center" width="25%">&nbsp;</td>
            <td width="5%">Cuenta</td>
            <td width="5%">Scta</td>
            <td width="5%">Sscta</td>
            <td width="5%">Ssscta</td>
            <td width="5%">Aux1</td>
            <td width="5%">Aux2</td>
            <td width="5%">Aux3</td>
            <td align="center">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" width="25%">&nbsp;</td>
            <td width="5%">
              <input type="text" name="paramNumCtam" id="paramNumCtam" size="4" maxlength="4" tipo="Num"/>
            </td>
            <td width="5%">
              <input type="text" name="paramNumScta" id="paramNumScta" size="4" maxlength="2" tipo="Num"/>
            </td>
            <td width="5%">
              <input type="text" name="paramNumSscta" id="paramNumSscta" size="4" tipo="Num"/>
            </td>
            <td width="5%">
              <input type="text" name="paramNumSsscta" id="paramNumSsscta" size="4" maxlength="2" tipo="Num"/>
            </td>
            <td width="5%">
              <input type="text" name="paramNumSssscta" id="paramNumSssscta" size="4" maxlength="4" tipo="Num"/>
            </td>
            <td width="5%">
              <input type="text" name="paramNumSsssscta" id="paramNumSsssscta" size="4" tipo="Num"/>
            </td>
            <td width="5%">
              <input type="text" name="paramNumAux1" id="paramNumAux1" size="18" maxlength="8" tipo="Num"/>
            </td>
            <td width="5%">
              <input type="text" name="paramNumAux2" id="paramNumAux2" size="18" maxlength="8" tipo="Num"/>
            </td>
            <td width="5%">
              <input type="text" name="paramNumAux3" id="paramNumAux3" size="18" maxlength="12" tipo="Num"/>
            </td>
            <td align="center">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" width="25%">&nbsp;</td>
            <td colspan=2>
              <input type="checkbox" name="paramMesAnterior" id="paramMesAnterior" onclick="asignaTabla(this);" class="check"/>&nbsp;Mes Anterior
            </td>
            <td colspan="7">
              <input type="checkbox" name="smayor" id="smayor" onclick="soloMayor(this)" class="check"/>&nbsp;Solo Mayores
            </td>
            <td align="center">&nbsp;</td>
          </tr>
          <tr>
             <td align="center">&nbsp;</td>
             <td align="center">&nbsp;</td>
             <td align="center">&nbsp;</td>
             <td align="center">&nbsp;</td>
    <td nowrap>Moneda</td>
    <td nowrap>
      <!--select size="1" name="ctamClasifProd" id="ctamClasifProd" ref="cves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" param="cmbClasProductoParam" next="ctamCveStCtamat" defaultValue="0"/-->
      <select size="1" name="paramMoneda" id="paramMoneda" ref="conNumMonNomMon2" fun="loadComboElement"  keyValue="monNumPais" theValue="monNomMoneda" next="formsLoaded"/>
    </td>
    <td align="center">&nbsp;</td>
    <td align="center">&nbsp;</td>
    <td align="center">&nbsp;</td>
    <td align="center">&nbsp;</td>
  </tr>
          <tr>
            <td colspan="11" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="11">
              <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="conPriSalFid" fun="loadTableElement" tabla="tblRegPriSalFid" onclick="if(fvCat.checkForm())consultarSaveParameters(this, frmDatos, true);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" value="Limpiar" name="cmdLimpiar" id="cmdLimpiar" class="btn btn-primary" onclick="limpiar(frmDatos);"/>
              <input type="button" value="Descargar" name="cmdDownload" id="cmdDownload" class="btn btn-info"onclick="doDownload();" />
            </td>
          </tr>
          <tr>
            <td colspan="11" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="11">
              <input type="button" value="Consultar" name="cmdConsultar" id="cmdConsultar" class="btn btn-primary" onclick="cargaPrincipalConsultarConsultaSaldosFideicomiso(4);"/>
            </td>
          </tr>
          <tr>
            <td colspan="11" align="center">&nbsp;</td>
          </tr>
            <tr  align="center">
              <td colspan="6">
                <div style="height:500px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPriSalFid" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="arrTblSalFidDat" keys="salNumCtam,salNumScta,salNumSscta,salNumSsscta,salNumSssscta,salNumSsssscta,salNumAux1,salNumAux2,salNumAux3" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Cta</td>
                  <td>Scta</td>
                  <td>Sscta</td>
                  <td>Ssscta</td>
                  <td>Nombre Cuenta</td>
                  <td>Aux1</td>
                  <td>Aux2</td>
                  <td>Aux3</td>
                  <td>Saldo Ant.</td>
                  <td>Cargos</td>
                  <td>Abonos</td>
                  <td>Saldo Actual</td>
                  <td>Moneda</td>              
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

    <div style="visibility:hidden;">
        <form id="frmExport" method="POST" action="DatosFiduciarios.xls" target="iframeDownload">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
            <input type="hidden" id="jsonExport" name="json" value="" />
            <input type="hidden" name="headers" value="Cta,Scta,SScta,SSScta,SSSScta,Nombre Cuenta,Aux1,Aux2,Aux3,Saldo Ant.,Cargos,Abonos,Saldo Actual,Moneda" />
        </form>
        <iframe name="iframeDownload" src=""></iframe>
    </div>