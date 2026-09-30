
<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Carga de Precios en
                                                        Efectivo</td>
      </tr>
      <tr>
        <td height="20">&nbsp;</td>
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
                  <select size="1" name="fiso" id="fiso" ref="cmbFideicomisoTrac" fun="loadComboElement" keyValue="femiNumFideicomiso" theValue="femiNomFideicomiso"   param="cmbFideicomisoTrac" next="tipoPrecio"  required message="El Fideicomiso es un campo obligatorio"/>
                </td>
                <td nowrap>&nbsp;</td>
                <td nowrap>Fecha</td>
                <td nowrap>
                  <input type="text" id="txtFechaPrecios" name="txtFechaPrecios" maxlength="10" size="10" tipo="Fecha" required message="La Fecha Aplicación es un campo obligatorio"/>
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
                <td nowrap>Tipo de Precio</td>
                <td nowrap>
                  <select size="1" name="tipoPrecio" id="tipoPrecio" ref="conETDatInd" fun="loadComboElement" keyValue="eindIdSubindice" theValue="eindDescripcion"   param="indicesCombo662" next="formsLoaded"  required message="El Tipo de Precio es un campo obligatorio" />
                </td>
              </tr>
              </table>
             </td> 
              
            </tr>
            <tr>
              <td width="10%">&nbsp;</td>
              <td width="80%">
                    
                  <iframe id="frameUpload" name="frameUpload" align="center" style="z-index:1;visibility:visible;" src="<%=request.getContextPath()%>/modules/TRACs/Precios/PreciosUpload.do" frameborder="0" scrolling="no" height="50" AllowTransparency></iframe>
              </td>     
            </tr>
           
            <tr>
              <td width="10%">&nbsp;</td>
              <td width="80%">
                
                  <input type="button" value="Subir Archivo " name="cmdCargar" class="btn btn-primary" onclick="subirArchivo();" >
                  <input type="button" value="Cargar Archivo " name="cmdPreview" class="btn btn-primary" onclick="generaPreviewArchivo();" >
                  <input type="button" value="Aplicar Precio " name="cmdAplicar" class="btn btn-primary" onclick="funAplicaPrecio();" ><!--style="visibility:hidden"/>-->
                  <input type="button" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="resetPantallaCarga()" ><!--style="visibility:hidden"/>-->
                     
              </td>     
            </tr>  
            <tr>
              <td width="10%">&nbsp;</td>
              <td width="80%">
                <table cellspacing="0" cellpadding="0" border="0">
                  <tr align="left" class="cabeceras">
                    <td width="20px">&nbsp;</td>
                    <td width="150px">Fiso</td>
                    <td width="150px">SubFiso</td>
                    <td width="150px">CtoInver</td>
                    <td width="150px">Importe</td>
                    <td width="150px">Operacion</td>
                    <td width="150px">Status</td>
                  </tr>
                </table>
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:920px;">
                <table id="tablaPreviewPrecios" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaPreviewData" keys="" fun="clickTabla" radioWidth="23">
                  </table>
                </div>
              </td>
            </tr>
           
          </table>
        </td>
      </tr>
    
  </table>
</html>