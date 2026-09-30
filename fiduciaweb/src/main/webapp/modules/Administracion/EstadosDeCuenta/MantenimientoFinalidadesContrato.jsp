<!--Version de Formalizacion/Proyectos-->
<FORM name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="" style="margin-block-end: auto;">
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;border-spacing: 0 5px;border-collapse: separate;">
        <tr>
            <td colspan="3" align="center" height="100%" class="titulo"><br/>Ejecutivos</td>
        </tr>
        <tr>
            <td colspan="3" style="height:45px;">&nbsp;</td>
        </tr>
        <tr>
            <td width="30%">No. Fideicomiso</td>
            <td nowrap width="15%">
                <input type="text" name="fecIdFideicomiso" id="fecIdFideicomiso" tipo="Num" size="10" maxlength="10" onblur="CargaComboCuentas()"/>
            </td
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td width="30%">N&uacute;mero de Cuenta</td>
            <td nowrap width="15%">
                <select size="1" name="fecNumCuenta" id="fecNumCuenta" ref="conCuentasInversion" 
                        fun="loadComboElement" keyValue="fciNumCta" theValue="fciNumCta" next="formsLoaded" 
                        required message="La cuenta es un campo obligatorio"/>            
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td width="30%">A&ntilde;o</td>
            <td align="left" width="15%">
                <input type="text" name="fecAno" id="fecAno" tipo="Num" size="10" maxlength="10"  required message="El Año es un campo obligatorio" />
            </td>
            <td>&nbsp;</td>
        </tr>  
        <tr>
            <td width="30%">Mes</td>
            <td nowrap width="15%">
                <input type="text" name="fecMes" id="fecMes" tipo="Num" size="10" maxlength="10"  required message="El Mes es un campo obligatorio" />
            </td>
            <td>&nbsp;</td>
        </tr>  		  
    </table>        
</form>
<form id="frmUploadPDF" name="frmUploadPDF" enctype="multipart/form-data" method="POST" action="<%=request.getContextPath()%>/upload.do" target="frameUpload">
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;border-spacing: 0 5px;border-collapse: separate;">
        <tr>
            <td width="30%">Archivo PDF</td>
            <td nowrap width="15%">
                <input type="file" name="edoCta" id="edoCta" accept="application/pdf" required />
                <input type="hidden" name="processor" value="mx.com.inscitech.fiducia.business.upload.processors.LoadEstadoCuentaProcessor" />
                <input type="hidden" name="fecUsuario" id="fecUsuario" value="<%=session.getAttribute("userid")%>" />
                <input type="hidden" name="fecStatus" id="fecStatus" value="PENDIENTE" />
                <input type="hidden" name="fisoId" id="fisoId" value="" />
                <input type="hidden" name="noCta" id="noCta" value="" />
                <input type="hidden" name="year" id="year" value="" />
                <input type="hidden" name="month" id="month" value="" />
            </td>
            <td>&nbsp;</td>
        </tr>  		  
        <tr>
            <td colspan="3" style="height:45px;">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="3" align="center">
                <input type="BUTTON" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
                <input type="BUTTON" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalFinalidadesContrato();" style="visibility:hidden"/>
            </td>
        </tr>
    </table>
</form>
<div style="visibility: hidden;">
    <iframe id="frameUpload" name="frameUpload" align="middle" style="z-index:1;" src="#" frameborder="0" scrolling="no"></iframe>
</div>        