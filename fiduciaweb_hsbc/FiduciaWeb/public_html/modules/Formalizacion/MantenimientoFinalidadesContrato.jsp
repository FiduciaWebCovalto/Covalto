<!--Version de Formalizacion/Proyectos-->
<FORM name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Finalidades</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap width="9%">N&uacute;m. Proyecto</td>
              <td width="8%">
                <input type="text" name="finNumContrato" id="finNumContrato" tipo="Num" size="10" maxlength="10" required message="El Numero de Proyecto es un campo obligatorio" onblur="verificacionExistenciaRegistro(true);" /> <!---->
              </td>
              <td width="40%">
              <input type="text" name="txtNomProyecto" id="txtNomProyecto" tipo="AlphaNumeric" size="40"style="visibility:hidden"/>
                <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <!--<tr>
              <td width="25%">&nbsp;</td>
              <td nowrap width="9%">N&uacute;m. Finalidad</td>
              <td width="8%">
                <input type="text" name="finFolioFinalidaAnteproy" id="finFolioFinalidaAnteproy" tipo="Num" size="10" maxlength="10" required message="El N�m. Finalidad es un campo obligatorio"/>
              </td>
              <td width="5%">&nbsp;</td>
              <td align="right" width="5%">&nbsp;</td>
            </tr>-->
            <tr>
              <td width="25%">&nbsp;</td>
              <td nowrap width="9%">Fecha:</td>
              <td width="20%" colspan="2">&nbsp;</td>
              <td width="5%">&nbsp;</td>
            </tr>            
            <tr>    
              <td align="center" width="25%">&nbsp;
              </td>
              <td nowrap colspan="3">&nbsp;&nbsp;
              <input type="text" name="finNomDictador" id="finNomDictador" tipo="Fecha" size="10" maxlength="10" required message="La Fecha es un campo obligatorio"/>
              <td width="5%">&nbsp;</td>
            </tr>

            <tr>
              <td width="25%">&nbsp;</td>
              <td nowrap width="9%">Texto:</td>
              <td width="20%" colspan="2">&nbsp;</td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td align="center" width="25%">&nbsp;
              </td>
              <td nowrap colspan="3">&nbsp;&nbsp;
              <textarea name="finTxtComentario" id="finTxtComentario" style="width:800px;height:200px" required message="El Comentario es un campo obligatorio"></textarea></td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td nowrap width="9%">&nbsp;</td>
              <td nowrap width="8%">&nbsp;</td>
              <td nowrap>&nbsp;</td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr style="visibility:hidden">
              <td class="subtitulo" width="25%">&nbsp;</td>
              <td class="subtitulo" nowrap width="1%" colspan="3">Establecida Por</td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>            
            <tr style="visibility:hidden">
              <td width="25%">&nbsp;</td>
              <td nowrap width="9%">&nbsp;</td>
              <td colspan="2">&nbsp;</td>
              <td width="5%">&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">
            <input type="text" name="finCveTipoFinal" id="finCveTipoFinal" size="50" tipo="Letras" value="ADMINISTRATIVAS" maxlength="50" style="visibility:hidden"/>
          <input type="text" name="finNumDictador" id="finNumDictador" size="50" value="0" maxlength="50" style="visibility:hidden"/>
          <input type="text" name="finCveStFinalid" id="finCveStFinalid" tipo="Letras" size="25" maxlength="25" value="ACTIVO" style="visibility:hidden"/>
        </td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="BUTTON" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="BUTTON" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalFinalidadesContrato();" style="visibility:hidden"/>
        </td>
      </tr>
  </table>
</FORM>
