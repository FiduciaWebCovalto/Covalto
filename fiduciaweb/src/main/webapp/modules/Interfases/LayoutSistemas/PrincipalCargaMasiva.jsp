
  
<form name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
        <tr>
            <td rowspan="7" width="10%" height="100%">&nbsp;</td>
            <td height="100%">&nbsp;</td>
            <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        </tr>
         
        <tr>
            <td align="center" height="100%" class="titulo">Carga Masiva</td>
        </tr>
         
        <tr>
            <td height="100%">&nbsp;</td>
        </tr>
         
        <tr>
            <td height="100%">
                <table class="texto">
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap="nowrap" colspan="5">&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </td>
        </tr>
         
        <tr>
            <td width="80%">
                <input type="text" name="txtFechaValor" id="txtFechaValor" size="10" ref="conFecCon"
                       fun="loadTxtElementX" thevalue="fecha" next="cmbTipoLiq" maxlength="10" tipo="Fecha"
                       required="required" message="La Fecha Valor es un campo obligatorio" style="width:150px;"/>
            </td>
        </tr>
         
        <tr valign="middle">
            <td colspan="4" align="center" class="subtitulo" width="30%">
                <a id="ligaArchivo" href="#" style="visibility:hidden">Archivo</a>
            </td>
        </tr>
         
        <tr valign="middle">
            <td width="20%">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="4" align="center" class="subtitulo" width="30%">Casa de Bolsa</td>
        </tr>
         
        <tr valign="middle">
            <td width="20%">&nbsp;</td>
            <td width="20%" align="left">
                <input type="checkbox" name="chkCBSPEI" id="chkCBSPEI" class="check"/>&nbsp;<label for="chkCBSPEI">SPEI MXN O USD</label>
            </td>
            
        </tr>
         
        <tr>
            <td width="20%">&nbsp;</td>
            <td width="20%" align="left">
                <input type="checkbox" name="chkCBMXN" id="chkCBMXN" class="check" />&nbsp;<label for="chkCBMXN">Cheque MXN</label>
            </td>
        </tr>
         
        <tr>
            <td width="20%">&nbsp;</td>
            <td width="20%" align="left">
                <input type="checkbox" name="chkCBUSD" id="chkCBUSD" class="check" />&nbsp;<label for="chkCBUSD">Cheque USD</label>
            </td>
        </tr>
         
        <tr valign="middle">
            <td width="20%">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="4" align="center" class="subtitulo" width="30%">Contratos Banco</td>
        </tr>
         
        <tr valign="middle">
            <td width="20%">&nbsp;</td>
            <td width="20%" align="left">
                <input type="checkbox" name="chkBSPEI" id="chkBSPEI" class="check"/>&nbsp;<label for="chkBSPEI">Banco Pago Spei</label>
            </td>
            
        </tr>
        <tr>
            <td width="10%">&nbsp;</td>
            <td width="80%">
                <iframe id="frameUpload" name="frameUpload" align="center" style="z-index:1;visibility:visible;"
                        src="<%=request.getContextPath()%>/modules/Interfases/\LayoutSistemas/InformacionMasivaSATUpload.do"
                        frameborder="0" scrolling="no" width="600" height="50" allowtransparency="AllowTransparency"></iframe>
                <div id="dvInterface" class="texto"></div>
            </td>
        </tr>
        <tr valign="middle">
            <td width="20%">&nbsp;</td>
        </tr>
        <tr>
            <td width="10%">&nbsp;</td>
            <td width="80%" colspan="5">
                <input type="button" value="Subir Archivo " name="cmdCargar" class="btn btn-primary" onclick="subirArchivo();"/>
                 
                <input type="button" value="Aplicar" name="cmdAplicar" class="btn btn-primary"
                       onclick="funAplicaComprasVentas();"/><!--style="visibility:hidden"/>-->
                 
                <input type="button" value="Cancelar" name="cmdCancelar" class="btn btn-danger"
                       onclick="resetPantallaCarga()"/><!--style="visibility:hidden"/>-->
            </td>
        </tr>
    </table>
</form>