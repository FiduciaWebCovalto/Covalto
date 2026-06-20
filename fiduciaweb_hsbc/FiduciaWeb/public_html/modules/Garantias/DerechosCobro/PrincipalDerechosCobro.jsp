<FORM name="frmPrincipalGarantias" id="frmPrincipalGarantias" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Derechos de Cobro</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" align="center" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Fideicomiso:</td>
            <td>
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" tipo="Num" size="10" maxlength="10" onblur="consultaNombreFideicomiso('nomFideicomiso',this);"/>
            </td>
            <td width="45%">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Id Credito:</td>            
            <td width="45%">
              <input type="text" name="paramCredito" id="paramCredito" size="10" maxlength="10"/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Estado</td>
            <td>
              <select size="1" name="paramStatus" id="paramStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="cmbTipoGarantia" param="clavesCombo31"/>
            </td>
            <td width="45%">
              <div id="Fideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
           <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">&nbsp;</td>
            <td>&nbsp;
            </td>
            <td width="45%">
              <div id="nomFideicomiso2" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="15%">&nbsp;</td>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">&nbsp;</td>
            <td colspan="2">&nbsp;
            </td>
            <td align="left" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="5" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              <input type="text" name="paramIdGar" id="paramIdGar" size="10" style="visibility:hidden"/>
              <input type="text" name="paramIdBienGar" id="paramIdBienGar" size="10" style="visibility:hidden"/>
              <input type="text" name="paramCveTipoGar" id="paramCveTipoGar" size="10" style="visibility:hidden"/>
              <input type="text" name="paramFiso" id="paramFiso" size="10" style="visibility:hidden"/>
              
              
            </td>
          </tr>
          <tr>
            <td colspan="5" align="center">&nbsp;
              <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="Aceptar" class="btn btn-primary" ref="conNumCredito" fun="loadTableElement" tabla="tablaRegistrosGarantias" onclick="consultaGarantia(this);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalGarantias'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="5" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
          </tr>
          
          <!----------------------->
          <!----- GARANTIAS ------->
          
          <tr align="center">
            <td colspan="5" class="subtitulo">Creditos<hr/></td>
          </tr>
          <tr align="center">
            <td colspan="5">
              <table cellspacing="0" cellpadding="0" border="0">
                <tr align="left" class="cabeceras">
                  <td width="23px">&nbsp;</td>
                  <td width="100px">Fideicomiso</td>
                  <td width="100px">Institucion</td>
                  <td width="100px">Id Credito</td>
                  <td width="100px">Importe Credito</td>
                  <td width="100px">Disponible</td>
                   <td width="100px">Estatus</td>
                </tr>
              </table>
              <div style="height:323px; overflow:auto; position:relative; vertical-align:top; width:623px;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tablaRegistrosGarantias" dataInfo="tablaGarantiasData" keys="fcreIdFideicomiso,fcreIdCredito" fun="clickTabla" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                </table>
              </div>
            </td>
          </tr>
        
          
          <!------------------------>
          <!-- PAGARES ASOCIADOS AL CREDITO -->
          <tr align="center">
            <td colspan="5" class="subtitulo">Pagares Asociados al Credito<hr/></td>
          </tr>          
          <tr>
            <td colspan="5" align="center">&nbsp;
              <input type="BUTTON" value="Aceptar" id="cmdAceptarBienesGar" name="cmdAceptarBienesGar" class="btn btn-primary" ref="consultaBeneficiarios" fun="loadTableElement" tabla="tablaRegistrosBienesGar" onclick="consultar(this, GI('frmPrincipalGarantias'), false);" style="visibility:hidden;position:absolute;">
            </td>
          </tr>
          
          <tr>
            <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
          </tr>
          <tr align="center">
            <td colspan="5">
              <table cellspacing="0" cellpadding="0" border="0">
                <tr align="left" class="cabeceras">
                  <td width="23px">&nbsp;</td>
                  <td width="100px">Fideicomiso</td>
                  <td width="100px">Id Credito</td>
                  <td width="100px">Id Pagare</td>
                  <td width="200px">Nombre Beneficiario</td>
                  <td width="100px">Descripcion</td>
                  <td width="100px">Importe Pagare</td>
                  <td width="100px">Disp. Pagare</td>
                  <td width="100px">Fecha Suscripcion</td>                  
                  <td width="100px">Fecha Vencimiento</td>
                  <td width="100px">Fecha Prorroga</td>
                  <td width="100px">Monto Prorroga</td>
                   <td width="100px">Estatus</td>
                </tr>
              </table>
              <div style="height:323px; overflow:auto; position:relative; vertical-align:top; width:1323px;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tablaRegistrosBienesGar" dataInfo="tablaBienesGarData" keys="glbeIdFideicomiso,glbeIdCredito,glbeIdBeneficiario" fun="clickTablaBienesGar" radioWidth="23px" >
                </table>
              </div>
            </td>
          </tr>
          <tr align="center">
            <td colspan="3">&nbsp;</td>
            <td align="right"><div id="dvSaldoBien" style="font-weight:bolder;"></div></td>
            <td>&nbsp;</td>
          </tr>
                    
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
