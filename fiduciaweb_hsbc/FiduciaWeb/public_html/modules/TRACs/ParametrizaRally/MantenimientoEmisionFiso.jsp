<FORM name="frmDatosMantenimiento" id="frmDatosMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Parametrizacion Rally</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table class="texto">
            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%">&nbsp;</td>
              <td nowrap>&nbsp;
                            </td>
                            <td nowrap>&nbsp;</td>
                            <td nowrap colspan="4">
                              &nbsp;&nbsp;
                            </td>
              <td width="10%">&nbsp;</td>
            </tr>
           <tr id="dvConsultaFiso">
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%">Identificacion Rally</td>
              <td  >
                <input type="text" name="fvfwIdOperSisVal" id="fvfwIdOperSisVal" size="10" maxlength="10"  />
              </td>
              <td nowrap width="15%">&nbsp;</td>
              <td nowrap colspan="3">
                 &nbsp;
              </td>
              <td nowrap width="10%">&nbsp;</td>
            </tr>  
           <tr id="dvConsultaFiso">
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%">Identificacion FiduciaWeb</td>
              <td  >
                <input type="text" name="fvfwIdOperSisFw" id="fvfwIdOperSisFw" size="10" maxlength="10"  />
              </td>
              <td nowrap width="15%">&nbsp;</td>
              <td nowrap colspan="3">
                 &nbsp;
              </td>
              <td nowrap width="10%">&nbsp;</td>
            </tr>  
            <tr id="dvAltaEmision">
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%">Tipo Operacion</td>
              <td nowrap>
                  <select size="1" name="fvfwTipoOper" id="fvfwTipoOper" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="loadCatalogo" param="clavesCombo1004" required message="El Tipo de Operacion es un campo obligatorio"/>
              </td>
              <td nowrap width="15%">&nbsp;</td>
              <td nowrap colspan="3">
                &nbsp;
              </td>
              <td nowrap width="10%">&nbsp;</td>
            </tr>
           <tr id="dvConsultaFiso">
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%">No. Operacion Contable</td>
              <td  >
                <input type="text" name="fvfwNumOperacion" id="fvfwNumOperacion" tipo="Num" size="10" maxlength="10" />
              </td>
              <td nowrap width="15%">&nbsp;</td>
              <td nowrap colspan="3">
                 &nbsp;
              </td>
              <td nowrap width="10%">&nbsp;</td>
            </tr>             

            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap colspan="7"><hr></td>
              <td width="10%">&nbsp;</td>
            </tr>            
            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap colspan="7">&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="15%">
                <input type="text" name="txtEmisora" id="txtEmisora" size="10" style="visibility:hidden"/>
              </td>
              <td width="15%">
                <input type="text" name="txtSerie" id="txtSerie" size="10" style="visibility:hidden"/>
              </td>
              <td align="center" width="15%">
                <input type="text" name="txtCupon" id="txtCupon" size="10" style="visibility:hidden"/>
                <input type="text" name="nomFideicomiso" id="nomFideicomiso" size="10" style="visibility:hidden"/>
              </td>  
            </tr>            
          
           
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="button" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden" ><!--style="visibility:hidden"/>-->
          <input type="button" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipal();" ><!--style="visibility:hidden"/>-->
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
