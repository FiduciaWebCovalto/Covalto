<FORM name="frmDatosMantenimientoProspectos" id="frmDatosMantenimientoProspectos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="left" style="height:auto;">
        <tr>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td align="center" height="100%" class="titulo">Prospectos</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>
                <table width="100%" border="0" style="text-align: left;" class="texto">
                    <tr>
                        <td style="width: 1%;">&nbsp;</td>
                        <td style="width: 20%;" nowrap>No. Prospecto</td>
                        <td style="width: 30%;">
                            <input type="text" name="prsNumProspecto" id="prsNumProspecto" tipo="Num" size="10" maxlength="10" required message="El No. Prospecto es un campo obligatorio" onblur="verificaExistaProspecto();"/>
                        </td>
                        <td style="width: 1%;">&nbsp;</td>
                        <td style="width: 20%;" nowrap>Nombre o Raz&oacute;n Social</td>
                        <td style="width: 30%;">
                            <input type="text" name="prsNomProspecto" id="prsNomProspecto" size="50" maxlength="50" required message="El Nombre o Razon Social es un campo obligatorio"/>
                        </td>
                        <td style="width: 1%;">&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td nowrap>Tipo de Persona</td>
                        <td>
                            <select size="1" name="prsTipoPers" id="prsTipoPers" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="prsTipoNegocio" param="clavesComboTipoPersona" required message="El Tipo de Persona es un campo obligatorio"></select>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td style="width: 1%;">&nbsp;</td>
                        <td class="subtitulo" colspan="5">Datos Generales</td>
                        <td style="width: 1%;">&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Rol de la Parte</td>
                        <td>
                            <input type="text" name="prsRolParte" id="prsRolParte" size="50" maxlength="50" required message="El Rol de la Parte es un campo obligatorio"/>
                        </td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>CIS del Fideicomiso</td>
                        <td>
                            <input type="text" name="prsCisFid" id="prsCisFid" size="50" maxlength="50" message="El CIS del Fideicomiso es un campo obligatorio"/>
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>&nbsp;</td>
                        <td>
                            &nbsp;
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Tipo Negocio</td>
                        <td>
                            <select size="1" name="prsTipoNegocio" id="prsTipoNegocio" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="prsLinNeg" param="clavesComboTipoNegocio"  required message="El Tipo de Negocio es un dato obligatorio"></select>
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>Linea de Negocio</td>
                        <td>
                            <select size="1" name="prsLinNeg" id="prsLinNeg" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesComboLineaNegocio" next="prsCveAreaInst" required message="La Linea de Negocio es un campo obligatorio"></select>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Caracteristicas</td>
                        <td>
                            <input type="text" name="prsCaracteristicas" id="prsCaracteristicas" tipo="AlphaNumeric" size="50" maxlength="500"/>
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>Empresa</td>
                        <td>
                            <select size="1" name="prsCveAreaInst" id="prsCveAreaInst" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesComboEmpresa" next="prsNumProducto" required message="La Empresa es un campo obligatorio"></select>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Producto</td>
                        <td>
                            <select size="1" name="prsNumProducto" id="prsNumProducto" ref="claveProducto" fun="loadComboElement" keyValue="prlNumProducto" theValue="prlNomProducto" param="paramComboProducto" next="prsSucursal" required message="El Producto es un campo obligatorio"></select>
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>Sucursal</td>
                        <td>
                            <select size="1" name="prsSucursal" id="prsSucursal" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesComboSucursal" next="prsEjecAsig" required message="La Sucursal es un campo obligatorio"></select>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Promotor Fiduciario</td>
                        <td>
                            <select size="1" name="prsEjecAsig" id="prsEjecAsig" ref="clavePromotor" fun="loadComboElement" keyValue="ejeNumEjecAtenc" theValue="ejeNomEjecutivo" next="loadCatalogo" required message="El Promotor Fiduciario es un campo obligatorio"></select>
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>RM de la Linea de Negocio</td>
                        <td>
                            <input type="text" name="prsRmLinNeg" id="prsRmLineaNegocio" tipo="AlphaNumeric" size="50" maxlength="500"/>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Promotor Client Specialist</td>
                        <td>
                            <input type="text" name="prsProCliSpe" id="prsProCliSpe" tipo="AlphaNumeric" size="50" maxlength="500" required message="El Promotor Client Specialist es un campo obligatorio"/>
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>&nbsp;</td>
                        <td>
                            &nbsp;
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Promotor Client Manager</td>
                        <td>
                            <input type="text" name="prsProCliMan" id="prsProCliMan" tipo="AlphaNumeric" size="50" maxlength="500"/>                            
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>&nbsp;</td>
                        <td>
                            &nbsp;
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Datos del Contacto / Nombre</td>
                        <td>
                            <input type="text" name="prsNomContacto" id="prsNomContacto" size="50" maxlength="50" required message="Datos del Contacto / Nombre es un campo obligatorio"/>
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>Datos del Contacto / Telefono 1</td>
                        <td>
                            <input type="text" name="prsTelCasa" id="prsTelCasa" size="50" maxlength="50" required message="Datos del Contacto / Telefono 1 es un campo obligatorio"/>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Datos del Contacto / Celular</td>
                        <td>
                            <input type="text" name="prsTelContacto" id="prsTelContacto" size="50" maxlength="50"/>
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>Datos del Contacto / Tel&eacute;fono 2</td>
                        <td>
                            <input type="text" name="prsTelOficina" id="prsTelOficina" size="50" maxlength="50"/>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td nowrap>Datos del Contacto / Correo</td>
                        <td>
                            <input type="text" name="prsFaxContacto" id="prsFaxContacto" size="50" maxlength="50" required message="Datos del Contacto / Correo es un campo obligatorio"/>
                        </td>
                        <td>&nbsp;</td>
                        <td nowrap>Fecha Inicio Negociacion</td>
                        <td>
                            <input type="text" name="prsFecProspecto" id="prsFecProspecto" tipo="Fecha" size="10" maxlength="10" required message="La Fecha Inicio Negociacion es un campo obligatorio"/>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td colspan="5" style="text-align: center;">Estatus
                            <input type="text" name="prsCveStatus" id="prsCveStatus" size="10" maxlength="25" value="ACTIVO" disabled class="inputLocked"/>
                        </td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td height="100%" align="center">
                <input type="BUTTON" value="Aceptar " id="cmdAceptar"  class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
                <input type="BUTTON" value="Cancelar"  id="cmdCancelar"  class="btn btn-danger" onclick="cargaPrincipalProspectos();" style="visibility:hidden"/>
            </td>
        </tr>
    </table>
</FORM>
