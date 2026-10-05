
  <FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Reserva</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
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
                  <select size="1" name="fiso" id="fiso" ref="cmbFideicomisoTrac" fun="loadComboElement" keyValue="femiNumFideicomiso" theValue="femiNomFideicomiso"   param="cmbFideicomisoTrac" next="formsLoaded"  required message="El Fideicomiso es un campo obligatorio"/>
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
              <td colspan="10">
              <table class="texto">
                <tr>
                  <td>Tipo de Movimiento:</td>
                  <td>
                    <input type="radio" name="rdTipoMovimiento" id="rdTipoMovimiento" class="radio" style="visibility:hidden" value="1" value2="1" onclick="cargaObjetosTipoMovimiento(this);" checked/>&nbsp;
                  </td>
                  <td>
                    <input type="radio" name="rdTipoMovimiento" id="rdTipoMovimiento2" class="radio" value="2" required message="El Tipo de Movimiento es un campo obligatorio"  onclick="cargaObjetosTipoMovimiento(this);"/>&nbsp;Venta
                  </td>
                  <td colspan="2">&nbsp;</td>
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
                    <td width="150px">Cto Inver</td>
                    <td width="150px">Pizarra</td>
                    <td width="150px">Serie</td>
                    <td width="150px">Cup&oacute;n</td>
                    <td width="150px">No. Titulos</td>
                    <td width="150px">Precio</td>
                    <td width="150px">Importe</td>
                    <td width="150px">Status</td>
                  </tr>
                </table>
                <div style="height:580px; overflow:auto; position:relative; vertical-align:top; width:840px;">
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
