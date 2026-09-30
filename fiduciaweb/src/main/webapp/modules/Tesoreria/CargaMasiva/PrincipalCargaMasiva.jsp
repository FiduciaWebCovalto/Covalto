
  <FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Carga de Contratos de Inversion</td>
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
          </tr>            
            <tr>
              <td width="10%">&nbsp;</td>
              <td width="80%">
                <input type="text" name="txtFechaValor" id="txtFechaValor" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="cmbTipoLiq" maxlength="10" tipo="Fecha" required message="La Fecha Valor es un campo obligatorio" style="width:150px;"/>
              </td> 
              
            </tr>
            
          <tr valign="middle">
            <td colspan="4" align="center" class="subtitulo" width="30%">
              <a id="ligaArchivo" href="#" style="visibility:hidden">Archivo</a>
            </td>
          </tr>
            <tr>
              <td width="10%">&nbsp;</td>
              <td width="80%">
                    
                <iframe id="frameUpload" name="frameUpload" align="center" style="z-index:1;visibility:visible;" src="<%=request.getContextPath()%>/modules/Tesoreria/\CargaMasiva/InformacionMasivaSATUpload.do" frameborder="0" scrolling="no" width="600" height="50" AllowTransparency></iframe>
                <div id="dvInterface" class="texto"></div>

              </td> 
              
            </tr>
           
            <tr>
              <td width="10%">&nbsp;</td>
              <td width="80%" colspan="5">
                
                  <input type="button" value="Subir Archivo " name="cmdCargar" class="btn btn-primary" onclick="subirArchivo();" >
                  <input type="button" value="Aplicar" name="cmdAplicar" class="btn btn-primary" onclick="funAplicaComprasVentas();" ><!--style="visibility:hidden"/>-->
                  <input type="button" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="resetPantallaCarga()" ><!--style="visibility:hidden"/>-->
                     
              </td>     
            </tr>  
           
          </table>
        </td>
      </tr>
    
  </table>
</FORM>
