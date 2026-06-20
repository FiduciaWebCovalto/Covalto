
  <FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Carga de
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                Poliza
                                                        Liquidador
                                                        </td>
      </tr>
   
      <tr>
        <td height="100%"><a id="ligaArchivo" href="#" style="visibility:hidden" target="_new">Archivo</a></td>
      </tr>
      <tr>
        <td height="100%">
          <table class="texto">
            <tr>
              <td>&nbsp;</td>
              <td nowrap colspan="5">&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>
              <table class="texto">
              <tr>
                <td nowrap>Fideicomiso</td>
                <td nowrap>
                  <select size="1" name="fiso" id="fiso" ref="cmbFideicomisoTrac" fun="loadComboElement" keyValue="femiNumFideicomiso" theValue="femiNomFideicomiso"   param="cmbFideicomisoTrac" next="cmbInterfase" onblur="cargaCmbContratoInversion(this,cmbContratoInversion);" required message="El Fideicomiso es un campo obligatorio"/>
                </td>
                <td nowrap>&nbsp;</td>
                <td nowrap>Fecha</td>
                <td nowrap>
                  <input type="text" id="fechaVal" name="fechaVal" maxlength="10" size="10" tipo="Fecha" required message="La Fecha Aplicación es un campo obligatorio"/>
                </td>
              </tr>
              </table>
             </td>               
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>
              <table class="texto">
              <tr>
                <td nowrap>&nbsp;</td>
                <td nowrap>
                  &nbsp;
                </td>
                <td nowrap>&nbsp;</td>
                <td nowrap>Descripcion</td>
                <td nowrap>
                  <select size="1" name="cmbInterfase" id="cmbInterfase" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo1006"/>
                </td>
              </tr>
              </table>
             </td>               
            </tr>            
            <tr>
              <td>&nbsp;</td>
              <td>
              <table class="texto">
              <tr>
                <td nowrap>&nbsp;</td>
                <td nowrap>
                <input type="text" id="cmbContratoInversion" name="cmbContratoInversion" maxlength="10" size="10" value="0" style="visibility:hidden"/>
                </td>
                <td nowrap>&nbsp;</td>
                <td nowrap>&nbsp;</td>
                <td nowrap>&nbsp;</td>
              </tr>
              </table>
             </td>               
            </tr>
            <tr>
              <td width="10%">&nbsp;</td>
              <td width="80%">
                    
                  <iframe id="frameUpload" name="frameUpload" align="center" style="z-index:1;visibility:visible;" src="<%=request.getContextPath()%>/modules/TRACs/ComprasVentasMas/ComprasVentasUpload.do" frameborder="0" scrolling="no" height="50" AllowTransparency></iframe>
              </td> 
              
            </tr>
           
            <tr>
              <td width="10%">&nbsp;</td>
              <td width="80%" colspan="5">
                
                  <input type="button" value="Subir Archivo " name="cmdCargar" class="btn btn-primary" onclick="subirArchivo();" >
                  <input type="button" value="Cargar Archivo " name="cmdPreview" class="btn btn-primary" onclick="generaPreviewArchivo();" >
                  <input type="button" value="Aplicar" name="cmdAplicar" class="btn btn-primary" onclick="funAplicaComprasVentas();" ><!--style="visibility:hidden"/>-->
                  <input type="button" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="resetPantallaCarga()" ><!--style="visibility:hidden"/>-->
                     
              </td>     
            </tr>  
            <tr>
              <td width="10%">&nbsp;</td>
              <td width="80%" colspan="5">
                <table cellspacing="0" cellpadding="0" border="0">
                  <tr align="left" class="cabeceras">
                    <td width="20px">&nbsp;</td>
                    <td width="150px">Descripcion</td>   
                    <td width="150px">Fecha</td>                                        
                    <td width="150px">Cuenta</td>                    
                    <td width="150px">Saldo</td>
                    <td width="150px">Tipo</td>
                  </tr>
                </table>
                <div style="height:580px; overflow:auto; position:relative; vertical-align:top; width:770px;">
                <table id="tablaPreviewComprasVentas" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaPreviewData" keys="" fun="clickTabla" radioWidth="23">
                  </table>
                </div>
              </td>
            </tr>
           
          </table>
        </td>
      </tr>
    
  </table>
</FORM>
