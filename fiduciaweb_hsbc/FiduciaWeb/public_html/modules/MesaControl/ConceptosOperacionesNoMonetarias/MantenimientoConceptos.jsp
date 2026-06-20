<form name="frmMantenimientoConceptos" id="frmMantenimientoConceptos" onsubmit=" ">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
        <tr>
            <td align="center" height="100%" class="titulo" id="tituloMantenimiento">Mantenimiento a Catalogo
                                                                                     Operaciones No Monetarias</td>
        </tr>
         
        <tr>
            <td height="25">&nbsp;</td>
        </tr>
         
        <tr>
            <td height="100%">
                <table width="100%" class="texto">
                    <tr id="trconpIdPersona">
                        <td width="20%">&nbsp;</td>
                        <td>Tipo Operacion</td>
                        <td colspan="4">
                            <select size="1" name="ftopNumOper" id="ftopNumOper" ref="qryOperacionesNoMonetarias"
                                    fun="loadComboElement" keyvalue="ftopNumOper" thevalue="ftopNombreTipoper"
                                    next="conpTipoDato" required="required"
                                    message="El Tipo de Persona es un campo obligatorio"
                                    onchange="consultaNextIdConcepto()"></select>
                        </td>
                    </tr>
                     
                    <tr>
                        <td>&nbsp;</td>
                        <td>Concepto</td>
                        <td colspan="4">
                            <input type="text" name="conpNombre" id="conpNombre" required="required"
                                   message="El Concepto es un campo obligatorio" maxlength="100" size="30"/>
                        </td>
                    </tr>
                     
                    <tr>
                        <td>&nbsp;</td>
                        <td>Comentario</td>
                        <td colspan="4">
                            <textarea id="conpComentario" name="conpComentario" onkeydown="validaLongitud(this,250);"
                                      style="width:250px"></textarea>
                        </td>
                    </tr>
                     
                    <tr id="trconpTipoDato">
                        <td>&nbsp;</td>
                        <td>Tipo Dato</td>
                        <td colspan="4">
                            <select size="1" name="conpTipoDato" id="conpTipoDato" ref="conETDatInd"
                                    fun="loadComboElement" keyvalue="eindDescripcion" thevalue="eindDescripcion"
                                    param="cmbTipoDato" next="conpTabla" required="required"
                                    message="El Tipo de Dato es un campo obligatorio"></select>
                        </td>
                    </tr>
                     
                    <tr id="trconpTabla">
                        <td>&nbsp;</td>
                        <td>Criterio de seleccion</td>
                        <td colspan="4">
                            <select size="1" name="conpTabla" id="conpTabla" ref="conETDatInd" fun="loadComboElement"
                                    keyvalue="eindDescripcion" thevalue="eindDescripcion" param="cmbCriterio"
                                    next="conpEstatus"
                                    onchange="GI('conpBaseCheck').checked=((this.selectedIndex!=0)?true:false);"></select>
                             
                            <input type="checkbox" name="conpBaseCheck" id="conpBaseCheck" class="check"
                                   disabled="disabled" tv="1" fv="0"/>Se obtiene de base 
                            <input type="hidden" name="conpBase" id="conpBase" value="0"/>
                        </td>
                    </tr>
                     
                    <tr>
                        <td>
                            &nbsp; 
                            <input type="hidden" name="conpIdConcepto" id="conpIdConcepto" maxlength="100" size="20"
                                   style="position:absolute;"/>
                        </td>
                        <td>Estatus</td>
                        <td colspan="4">
                            <select size="1" name="conpEstatus" id="conpEstatus" ref="claves" fun="loadComboElement"
                                    keyvalue="cveDescClave" thevalue="cveDescClave" param="cmbStatus"
                                    next="loadCatalogo" required="required"
                                    message="El Estatus es un campo obligatorio"></select>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
         
        <tr>
            <td align="center">
                <input type="button" value="Aceptar " name="cmdAceptar" value="Aceptar" class="btn btn-primary"
                       onclick="AltaOModificaInfo();" style="visibility:hidden"/>
                 
                <input type="button" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger"
                       onclick="cargaPrincipalConceptos()" style="visibility:hidden;position:absolute"/>
            </td>
        </tr>
    </table>
</form>