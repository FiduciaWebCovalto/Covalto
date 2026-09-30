<FORM name="frmDatosRPP" id="frmDatosRPP" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Charola RPP</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
        <tr>
            <td height="100%">
                <table width="100%" class="texto" border="0" style="text-align:left">
                    <tr>
                        <td>Fideicomiso</td>
                        <td><input type="text" name="insNumContrato" id="insNumContrato" size="20" disabled="disabled"/></td>
                        <td>Apodo</td>
                        <td><input type="text" name="ctoNomContrato" id="ctoNomContrato" size="50" disabled="disabled"/></td>
                    </tr>
                    <tr>
                        <td>Folio</td>
                        <td><input type="text" name="insNumFolioInst" id="insNumFolioInst" size="20" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Fecha de Generacion</td>
                        <td><input type="text" name="fbisFechaIni" id="fbisFechaIni" size="20" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Operacion</td>
                        <td><input type="text" name="insTxtComentario" id="insTxtComentario" size="50" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Fecha del Documento</td>
                        <td><input type="text" name="fdfFecha" id="fdfFecha" size="50" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Numero de Escritura</td>
                        <td><input type="text" name="fdfNumEscritura" id="fdfNumEscritura" size="50" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Notaria</td>
                        <td><input type="text" name="fdfNotaria" id="fdfNotaria" size="50" disabled="disabled"/></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td>Promotor</td>
                        <td><input type="text" name="ateNomEjecutivo" id="ateNomEjecutivo" size="50" disabled="disabled"/></td>
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
            <td align="center" height="100%" class="titulo">Datos RPP</td>
        </tr>
        <tr>
            <td height="100%">
                <table width="60%" class="texto" border="0" style="text-align:left">
                    <tr>
                        <td width="25%">Folio Mercantil Electronico</td>
                        <td width="25%">
                            <input name="fdfFolioMe" id="fdfFolioMe" size="15" maxlength="50" required message="Este campo es obligatorio"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Fecha del Inscripcion</td>
                        <td width="25%">
                            <input type="text" id="fdfFechaInscripcion" name="fdfFechaInscripcion" maxlength="10" size="10" required message="La Fecha es un campo obligatorio"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Foja</td>
                        <td width="25%">
                            <input name="fdfFoja" id="fdfFoja" size="15" maxlength="50" required message="Este campo es obligatorio"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Volumen</td>
                        <td width="25%">
                            <input type="text" name="fdfVolumen" id="fdfVolumen" size="15" maxlength="50" required message="Este campo es obligatorio"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Partida</td>
                        <td width="25%">
                            <input type="text" name="fdfPartida" id="fdfPartida" size="15" maxlength="50" required message="Este campo es obligatorio"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Libro</td>
                        <td width="25%">
                            <input type="text" name="fdfLibro" id="fdfLibro" size="15" maxlength="50" required message="Este campo es obligatorio"/>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%">Localidad RPP</td>
                        <td width="25%">
                            <input type="text" name="fdfLocalidadRpp" id="fdfLocalidadRpp" size="15" maxlength="50" required message="Este campo es obligatorio"/>
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
               <input type="BUTTON" name="cmdRegresar" value="Regresar" class="btn btn-danger" onclick="cargaPantallaRPP();">
               <input type="BUTTON" name="cmdFinalizar" value="Finalizar" class="btn btn-primary" onclick="guardarRPP();">
            </td>
        </tr>
      </table>
</FORM>