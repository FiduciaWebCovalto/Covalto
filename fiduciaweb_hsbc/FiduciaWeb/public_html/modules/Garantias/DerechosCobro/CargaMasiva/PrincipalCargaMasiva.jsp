<form name="frmCargaMasiva" id="frmCargaMasiva" onsubmit="" enctype="multipart/form-data">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      <td height="100%">&nbsp;</td>
      <td rowspan="7" width="10%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td align="center" height="100%" class="titulo">Carga Masiva Pagares</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table align="center" class="texto" width="100%">
         <tr>
            <td width="20%">&nbsp;</td>
            <td width="15%">Fideicomiso</td>
            <td width="15%">
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" tipo="Num" required message="El Fideicomiso es un campo obligatorio" onblur="consultaDatosFideicomiso(this)"/>
            </td>
            <td nowrap>
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td>&nbsp;
            </td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td>
              <input type="text" name="txtFechaContable" id="txtFechaContable" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="formsLoaded" maxlength="10" tipo="Fecha" style="visibility:hidden"/>
            </td>
            <td>
              <input type="text" name="NombreArchivo" id="NombreArchivo" size="15" style="visibility:hidden"/>
            </td>
            <td width="15%">&nbsp;</td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td nowrap>
              &nbsp;
            <td nowrap>
              <input type="radio" name="rdTipoMovimiento" id="rdDerechoCobro" value="5" class="radio" onclick="asignaValueRadio2Master('rdTipoMovimiento',this)"/>Derechos Cobro</td>            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td colspan="3">&nbsp;</td>
            <td width="15%">&nbsp;</td>
          </tr>
            <tr valign="middle">
              <td colspan="4" align="center" class="subtitulo" width="30%">
                <a id="ligaArchivo" href="#" style="visibility:hidden">Archivo</a>
              </td> 
            </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td colspan="3" align="center">
              <iframe id="frameUpload" name="frameUpload" align="center" style="z-index:1;visibility:visible;" src="<%=request.getContextPath()%>/modules/Honorarios/\CargaProvisiones/InformacionMasivaSATUpload.do" frameborder="0" scrolling="no" width="600" height="50" allowtransparency="AllowTransparency"></iframe><!--iframe id="frameUpload" name="frameUpload" align="center" style="z-index:1;" src="<%=request.getContextPath()%>/modules/Tesoreria/Interfaces/TasUpload.do" frameborder="0" scrolling="no" width="600" height="50" AllowTransparency></iframe-->
              </iframe>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td align="center">&nbsp;
        <input type="button" value="Cargar" name="cmdCargar" id="cmdCargar" class="btn btn-primary" onclick="subirArchivo();" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      
        <input type="button" value="Aplicar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="ejecutaCargaMasiva();" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" value="Limpiar" name="cmdLimpiar" id="cmdLimpiar" class="btn btn-primary" onclick="limpiar()" />
      </td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</form>