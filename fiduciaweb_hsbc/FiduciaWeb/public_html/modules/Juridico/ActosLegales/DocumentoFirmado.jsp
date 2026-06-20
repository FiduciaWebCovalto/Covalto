<FORM name="frmDocumentoFirmado" id="frmDocumentoFirmado" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Charola Actos Legales <br>Carga Documento Firmado</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
        <tr>
            <td height="100%">
                <table width="100%" class="texto" border="0" style="text-align:left">
                    <tr>
                        <td width="25%" id="divRMCliente"></td>
                        <td width="25%" colspan="2"><input type="text" name="fusuNombreUsuario" id="fusuNombreUsuario" size="40" disabled="disabled"/></td>
                        <td width="20%">&nbsp;</td>
                        <td width="30%">&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Tipo de Operacion</td>
                        <td colspan="2"><input type="text" name="txtComentario" id="txtComentario" size="50" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td width="30%">&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Estatus del Fideicomiso</td>
                        <td><input type="text" name="ctoCveStContrat" id="ctoCveStContrat" size="20" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>URGENTE</td>
                        <td><input type="text" name="redFlag" id="redFlag" size="20" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Fideicomiso</td>
                        <td><input type="text" name="insNumContrato" id="insNumContrato" size="20" disabled="disabled"/></td>
                        <td>Apodo</td>
                        <td><input type="text" name="txtNomContraro" id="txtNomContraro" size="50" disabled="disabled"/></td>
                    </tr>
                    <tr>
                        <td>Folio</td>
                        <td><input type="text" name="insNumFolioInst" id="insNumFolioInst" size="20" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Concepto</td>
                        <td colspan="2"><input type="text" name="txtConcepto" id="txtConcepto" size="40" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
          </td>
        </tr>
        <tr>
            <td width="90%" colspan="5" align="center" valign="middle">
                &nbsp;<input type="hidden" id="txtuserId" name="txtusername" value="<%=session.getAttribute("userid")!=null?session.getAttribute("userid").toString():"0"%>" size="1"/>
            </td>
        </tr>
        
        <tr>
            <td>
                <input type="radio" name="rdTipoAdmon" id="fdfTipo" class="radio" value2="P" onclick="asignaValueRadio2Master('fdfTipo',this); muestraCamposTipoDocumento();" required message="Este campo es obligatorio"/>
                <label for="fdfTipo">Documento Publico</label>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="radio" name="rdTipoAdmon" id="fdfTipoR" class="radio" value="R" onclick="asignaValueRadio2Master('fdfTipo',this); muestraCamposTipoDocumento();"/>
                <label for="fdfTipoR">Documento Privado</label> 
            </td>
        </tr>
        <tr>
            <td width="90%" colspan="5" align="center" valign="middle">
                &nbsp;
            </td>
        </tr>
        <tr id="divCamposTipoDocumento" style="display: none">
            <td height="100%">
                <table width="85%" class="texto" border="0" style="text-align:left">
                    <tr>
                        <td width="25%">Nombre Documento DMP</td>
                        <td width="25%">
                            <select size="1" name="fdfNombre" id="fdfNombre" ref="muestraDatosDocumentos" fun="loadComboElement" keyValue="fdocIdDocumento" theValue="fdocNombre" next="fdfDelegadoFiduciario" required message="Este campo es obligatorio">
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Fecha del Documento</td>
                        <td width="25%">
                            <input type="text" id="fdfFecha" name="fdfFecha" maxlength="10" size="10" required message="La Fecha es un campo obligatorio"/>
                        </td>
                    </tr>
                    <tr id="divNumEscritura" style="display: none">
                        <td width="25%">Numero de Escritura</td>
                        <td width="25%">
                            <input name="fdfNumEscritura" id="fdfNumEscritura" size="15" maxlength="50" message="Este campo es obligatorio"/>
                        </td>
                    </tr>
                    <tr id="divNotaria" style="display: none">
                        <td width="25%">Notaria</td>
                        <td width="25%">
                            <input type="text" name="fdfNotaria" id="fdfNotaria" size="15" maxlength="50" message="Este campo es obligatorio"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Documento Original / Copia</td>
                        <td width="25%">
                            <select name="fdfOriginalCopia" id="fdfOriginalCopia" required message="Este campo es obligatorio">
                                <option value="-1" selected="selected">-- Seleccione --</option>
                                <option value="O">Original</option>
                                <option value="C">Copia</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Anexos</td>
                        <td width="25%">
                            <select name="fdfAnexos" id="fdfAnexos" required message="Este campo es obligatorio">
                                <option value="-1" selected="selected">-- Seleccione --</option>
                                <option value="S">Si</option>
                                <option value="N">No</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Delegado Fiduciario</td>
                        <td width="25%">
                            <select size="1" name="fdfDelegadoFiduciario" id="fdfDelegadoFiduciario" ref="muestraDatosPersonalOrdenado" fun="loadComboElement" keyValue="perNomUsuario" theValue="perNomUsuario" next="buscaCatalogoDocumentoFirmado" required message="Este campo es obligatorio">
                            </select>
                        </td>
                    </tr>                    
                    <tr>
                        <td>Observaciones</td>
                        <td>
                          <textarea name="fdfObservaciones" id="fdfObservaciones" style="width:600px;height:80px" onkeydown="validaLongitud(this,200);"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>Adjuntar Documento</td>
                        <td><input type="FILE" id="fileTest" name="fileTest" style="width:300px;"/></td>
                    </tr>
                </table>
          </td>
        </tr>
        <tr align="center"><td colspan="5"><a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a></td></tr>
        <tr align="center">
            <td colspan="5">
               <!--input type="BUTTON" name="cmdGuardar" value="Guardar" class="btn btn-primary" onclick="guardar(1);"-->
               <input type="BUTTON" name="cmdFinalizar" value="Finalizar" class="btn btn-primary" onclick="guardarDocumentoFirmado();">
               <input type="BUTTON" name="cmdRegresar" value="Regresar" class="btn btn-danger" onclick="cargaPantallaInstrucciones();">
               <!--input type="BUTTON" name="cmdReporte" value="Reporte Finalidades" class="btn btn-primary" onclick="generaReporte();"/-->
            </td>
        </tr>
      </table>
</FORM>