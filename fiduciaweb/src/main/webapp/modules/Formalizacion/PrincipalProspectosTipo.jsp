<form name="frmDatosProspectosConsulta" id="frmDatosProspectosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
        <tr>
            <td align="center" height="100%" class="titulo">Prospectos Tipo Persona</td>
        </tr>
        <tr>
            <td height="100%">&nbsp;</td>
        </tr>
        <tr>
            <td height="100%">
                <table width="90%" class="texto" align="center">
                    <tr>
                        <td width="20%">&nbsp;</td>
                        <td>N&uacute;mero de Prospecto</td>
                        <td>
                            <input type="text" name="paramNumProspecto" id="paramNumProspecto" tipo="Num" size="10" maxlength="10"/>
                        </td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td width="10%">&nbsp;</td>
                    </tr>
                    <tr>
                        <td width="20%">&nbsp;</td>
                        <td>Tipo de Persona</td>
                        <td>
                            <select size="1" name="paramTipoPersona" id="paramTipoPersona" ref="claves" fun="loadComboElement" keyvalue="cveNumSecClave" thevalue="cveDescClave"
                                    param="clavesCombo140"></select>
                        </td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td width="10%">&nbsp;</td>
                    </tr>
                    <tr>
                        <td width="100%" colspan="6" align="center" valign="middle">
                            &nbsp;
                            <table width="224" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" id="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" onmouseover="this.className='boton_leftSobre'"
                                               onmouseout="this.className='boton_left';" ref="muestraProspectosTipo" fun="loadTableElement" tabla="tablaRegistrosProspectosTipo"
                                               onclick="consultar(this, GI('frmDatosProspectosConsulta'), false);"/>
                                    </td>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" name="cmdLimpiar" value="Limpiar" class="btn btn-warning" onmouseover="this.className='boton_rightSobre'"
                                               onmouseout="this.className='boton_right';" onclick="RF(GI('frmDatosProspectosConsulta'));"/>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="6" align="center">&nbsp;</td>
                    </tr>
                    <tr>
                        <td colspan="6" align="center">
                            <table cellpadding="0" cellspacing="0">
                                <tr>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" onmouseover="this.className='boton_leftSobre'"
                                               onmouseout="this.className='boton_left';" class="boton_left" onclick="cargaMantenimientoProspectos(1);"/>
                                    </td>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" onmouseover="this.className='boton_middleSobre'"
                                               onmouseout="this.className='boton_middle';" class="boton_middle" onclick="cargaMantenimientoProspectos(2);"/>
                                    </td>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" onmouseover="this.className='boton_middleSobre'"
                                               onmouseout="this.className='boton_middle'" class="boton_middle" onclick="eliminarRegistro();"/>
                                    </td>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" onmouseover="this.className='boton_rightSobre'"
                                               onmouseout="this.className='boton_right';" class="boton_right" onclick="cargaMantenimientoProspectos(3);"/>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td colspan="6" align="center">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="6" height="37">
                <table cellspacing="0" cellpadding="0" border="0" width="100%" align="center" class="texto">
                    <tr class="cabeceras">
                        <td width="23">&nbsp;</td>
                        <td width="42">N&uacute;mero Prospecto</td>
                        <td width="364">Tipo Persona</td>
                        <td width="131">Clave</td>
                        <td width="118">N&uacute;mero Persona</td>
                        <td width="111">Nombre</td>
                    </tr>
                </table>
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                    <table id="tablaRegistrosProspectosTipo" border="0" cellspacing="0" cellpadding="0" datainfo="tablaProspectosData" keys="prpNumProspecto,prpTipoPersona"
                           fun="clickTabla" radiowidth="23" norecordsmsg="No existen Registros para estos criterios de busqueda"></table>
                </div>
            </td>
        </tr>
    </table>
</form>