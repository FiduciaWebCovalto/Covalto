<form name="frmDatosContactosFideicomisosConsulta" id="frmDatosContactosFideicomisosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
        <tr>
            <td height="100%">&nbsp;</td>
        </tr>
         
        <tr>
            <td align="center" height="100%" class="titulo">C&eacute;dula Administrativa</td>
        </tr>
         
        <tr>
            <td height="100%">&nbsp;</td>
        </tr>
         
        <tr>
            <td height="100%">
                <table align="center" class="texto" width="100%">
                    <tr valign="middle">
                        <td width="30%">&nbsp;</td>
                        <td nowrap="nowrap" width="15%">Fideicomiso</td>
                        <td>
                            <input type="text" name="paramNumFiso" id="paramNumFiso" tipo="Num" size="10" maxlength="10"
                                   onblur="mostrarDatosInformativos(1);"/>
                        </td>
                    </tr>
                     
                    <tr>
                        <td colspan="6" align="center">
                            <table width="224" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar"
                                               class="boton_left" onmouseover="this.className='boton_leftSobre'"
                                               onmouseout="this.className='boton_left';"
                                               ref="muestraDatosReglasOperacion" fun="loadTableElement"
                                               tabla="tablaRegistrosReglasOpera"
                                               onclick="consultar(this, GI('frmDatosContactosFideicomisosConsulta'), false);"/>
                                    </td>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar"
                                               class="boton_right" onmouseover="this.className='boton_rightSobre'"
                                               onmouseout="this.className='boton_right';"
                                               onclick="RF(GI('frmDatosContactosFideicomisosConsulta'));"/>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                     
                    <tr>
                        <td colspan="6" align="center">
                            <table cellpadding="0" cellspacing="0">
                                <tr>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta"
                                               onmouseover="this.className='boton_leftSobre'"
                                               onmouseout="this.className='boton_left';" class="boton_left"
                                               onclick="cargaMantenimientoContactosFideicomisos(1)"/>
                                    </td>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar"
                                               onmouseover="this.className='boton_middleSobre'"
                                               onmouseout="this.className='boton_middle';" class="boton_middle"
                                               onclick="cargaMantenimientoContactosFideicomisos(2)"/>
                                    </td>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja"
                                               onmouseover="this.className='boton_middleSobre'"
                                               onmouseout="this.className='boton_middle'" class="boton_middle"
                                               onclick="eliminarRegistro();"/>
                                    </td>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar"
                                               onmouseover="this.className='boton_middleSobre'"
                                               onmouseout="this.className='boton_middle';" class="boton_middle"
                                               onclick="cargaMantenimientoContactosFideicomisos(3)"/>
                                    </td>
                                    <td width="112" align="center" valign="middle">
                                        <input type="BUTTON" value="Ficha Tecnica" id="cmdFicha" name="cmdFicha"
                                               onmouseover="this.className='boton_rightSobre'"
                                               onmouseout="this.className='boton_right';" class="boton_right"
                                               onclick="generaFichaSP()"/>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
         
        <tr>
            <td colspan="6">&nbsp;</td>
        </tr>
         
        <tr align="center">
            <td colspan="6">
                <table cellspacing="0" cellpadding="0" border="0">
                    <tr class="cabeceras">
                        <td width="23px" nowrap="nowrap">&nbsp;</td>
                        <td width="90px" nowrap="nowrap">No. Fideicomiso</td>
                        <td width="90px" nowrap="nowrap">No. de Regla</td>
                        <td width="100px" nowrap="nowrap">Tipo de Regla</td>
                        <td width="300px" nowrap="nowrap">Descripcion</td>
                        <td width="90px" nowrap="nowrap">Status</td>
                    </tr>
                </table>
                <div style="height:150px; overflow:auto; position:relative; vertical-align:top;width:890px">
                    <table id="tablaRegistrosReglasOpera" border="0" cellspacing="0" cellpadding="0"
                           datainfo="tablaReglasOpera" keys="froNumFideicom,froSecNumFideicom" fun="clickTabla"
                           radiowidth="23" norecordsmsg="No existen Registros para estos criterios de búsqueda"></table>
                </div>
            </td>
        </tr>
    </table>
    <tr>
        <td width="60%" height="100%">&nbsp;</td>
    </tr>
</form>
<a id="linkReporte" href="#" style="visibility:hidden">Archivo</a> 
<a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a> 