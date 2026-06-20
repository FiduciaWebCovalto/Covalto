<form name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Asientos Contables</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td>Cuenta</td>
            <td>Scta</td>
            <td>Sscta</td>
            <td>Ssscta</td>
            <td>Sssscta</td>
            <td>Aux1</td>
            <td>Aux2</td>
            <td>Aux3</td>
            <td>Folio</td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
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
              <input type="text" name="paramNumSssscta" id="paramNumSssscta" size="4" maxlength="4" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumAux1" id="paramNumAux1" size="8" maxlength="8" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumAux2" id="paramNumAux2" size="8" maxlength="8" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumAux3" id="paramNumAux3" size="8" maxlength="12" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramFolio" id="paramFolio" size="5"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td>D&iacute;a</td>
            <td>Mes</td>
            <td>A&ntilde;o</td>
            <td>Transaccion</td>
            <td colspan="2">Descripci&oacute;n</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;
            </td>
            <td>
              <input type="text" name="paramDia" id="paramDia" size="2" maxlength="2" tipo="Num" value="<%=session.getAttribute("fechaContable").toString().split("/")[0]%>"/>
            </td>
            <td>
              <input type="text" name="paramMes" id="paramMes" size="2" maxlength="2" tipo="Num" value="<%=session.getAttribute("fechaContable").toString().split("/")[1]%>"/>
            </td>
            <td>
              <input type="text" name="paramAno" id="paramAno" size="4" maxlength="4" tipo="Num" value="<%=session.getAttribute("fechaContable").toString().split("/")[2]%>" required message="El A�o es un campo obligatorio"/>
            </td>
            <td>
              <input type="text" name="paramTransaccion" id="paramTransaccion" size="5" maxlength="5" tipo="Num"/>
            </td>
            <td colspan="6">
              <input type="text" name="paramDescripcion" id="paramDescripcion" size="50" onblur="convertirMayusculas(this)"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;
            </td>
            <td colspan="3">
              <input type="checkbox" name="chkTotalCA" id="chkTotalCA" class="check" />&nbsp;Total Cargos/Abonos
              </td>
            <td colspan="2">
            </td>
            <td colspan="2">
              <input type="checkbox" name="chkStatus" id="chkStatus" onclick="cambiaStatus(this,paramStatus);" class="check"/>&nbsp;Cancelados
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;
            </td>
             <td colspan="3">
              <input type="checkbox" name="chkSoloTotalCA" id="chkSoloTotalCA" class="check" />&nbsp;Solo Totales (Cargos/Abonos)
            </td>
            <td colspan="7" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              <input type="text" name="paramStatus" id="paramStatus" size="2" value="ACTIVO" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="11" align="center">
              <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="conPriAsi" fun="loadTableElementAsientos" tabla="tblRegPriAsi" onclick="if(fvCat.checkForm()&&soloTotales())consultarCount(this, frmDatos, true);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" value="Limpiar" name="cmdLimpiar" id="cmdLimpiar" class="btn btn-primary" onclick="limpiar(frmDatos);"/>
              <input type="button" value="Descargar" name="cmdDownload" id="cmdDownload" class="btn btn-info"onclick="doDownload();" />
            </td>
          </tr>
          <tr>
            <td colspan="11">&nbsp;</td>
          </tr>
          
            <tr  align="center">
              <td colspan="6">
                <div style="height:500px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPriAsi" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="arrTblAsiDat" keys="salNumCtam,salNumScta,salNumSscta,salNumSsscta,salNumSssscta,salNumSsssscta,salNumAux1,salNumAux2,salNumAux3" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>Folio</td>
                  <td>Operacion</td>
                  <td>Fecha</td>
                  <td>Tran.</td>
                  <td>Cta</td>
                  <td>Scta.</td>
                  <td>Sscta.</td>
                  <td>Ssscta.</td>
                  <td>Sssscta.</td>
                  <td>Aux1</td>
                  <td>Aux2</td>
                  <td>Aux3</td>
                  <td>C/A</td>
                  <td>Importe</td>
                  <td>Descripcion</td>
                  <td>Status</td>                 
                  </tr>                  
                  </thead>
                   <tbody></tbody>
                  </table>
                </div>
              </td>
            </tr>           
          
          <tr>
            <td height="100%" align="center" class="texto" colspan="11">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" class="texto" colspan="2">&nbsp;</td>
            
            <td height="100%" align="center" class="texto"><b>Total Cargos:</b></td>
            <td height="100%" align="center" class="texto">
              <input type="text" name="tCargos" id="tCargos" size="20" maxlength="20" value="0.0" tipo="Num"/>
            </td>
            <td height="100%" align="center" class="texto"><b>Total Abonos:</b></td>
            <td height="100%" align="center" class="texto">
              <input type="text" name="tAbonos" id="tAbonos" size="20" maxlength="20" value="0.0" tipo="Num"/>
            </td>
            <td height="100%" align="center" class="texto"><b>Diferencia</b></td>
            <td height="100%" align="center" class="texto">
              <input type="text" name="tDiferencia" id="tDiferencia" size="20" maxlength="20" value="0.0" tipo="Num"/>
            </td>
            <td height="100%" align="center" class="texto" colspan="1">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" class="texto">&nbsp;</td>
            <td height="100%" align="center" class="texto">&nbsp;</td>
            <td height="100%" align="center" class="texto" colspan="2" nowrap>
              <div id="dv1"></div>
            </td>
            <td height="100%" align="center" class="texto" colspan="2">
              <input type="text" name="txt1" id="txt1" size="15" style="visibility:hidden"/>
            </td>
            <td height="100%" align="right" class="texto" nowrap colspan="2">
              <div id="dv2"></div>
            </td>
            <td height="100%" class="texto" colspan="2">
              <input type="text" name="txt2" id="txt2" size="15" style="visibility:hidden"/>
            </td>
            <td height="100%" align="center" class="texto">&nbsp;</td>
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
            <input type="hidden" name="headers" value="Folio, Operacion, Fecha , Tran,  Cta,Scta,Sscta, Ssscta,Sssscta,Sssssscta,Aux1,Aux2,Aux3,C/A,Importe,Descripcion,Status" />
        </form>
        <iframe name="iframeDownload" src=""></iframe>
    </div>