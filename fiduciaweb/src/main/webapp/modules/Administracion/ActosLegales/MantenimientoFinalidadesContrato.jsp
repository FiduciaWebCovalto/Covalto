<!--Version de Formalizacion/Proyectos-->
<FORM name="frmDatosFinalidadesContratoMantenimiento" id="frmDatosFinalidadesContratoMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">&nbsp;</td>
        <td align="center" height="100%" class="titulo">Actos Legales</td>
        <td align="center" height="100%" class="titulo">&nbsp;</td>
        <td align="center" height="100%" class="titulo">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      
          <tr align="left">
            <td width="30%">No. Fideicomiso:</td>
            <td nowrap width="15%">
              <input type="text" name="falNumFideicomiso" id="falNumFideicomiso" tipo="Num" size="10" maxlength="10"  required message="El Numero de Fideicomiso es un campo obligatorio" onblur="verificacionExistenciaRegistro(true);"/> <!---->
             <input type="text" name="falApodo" id="falApodo" value="" maxlength="10"  value="0" style="visibility:hidden"/> <!---->              
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
            &nbsp;
            </td>
          </tr>
          <tr align="left">
            <td width="30%">Tipo de Documento:</td>
            <td nowrap width="15%">
                <select size="1" name="falTipoDocumento" id="falTipoDocumento" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1095"  next="falTipoConvenio" onblur="deshabilitacampos(this)"   required message="Tipo de Documento es un campo obligatorio"/> <!---->
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
            &nbsp;
            </td>
          </tr align="left">            
          <tr align="left">
            <td width="30%">Tipo de Convenio:</td>
            <td nowrap width="15%">
                <select size="1" name="falTipoConvenio" id="falTipoConvenio" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1096"  next="falTipoEscritura"/> <!---->
             </td>
            <td colspan="2">Fecha</td>
            <td align="left" width="15%">
            <input type="text" name="falFecha" id="falFecha" tipo="Fecha" size="10" maxlength="10"/>
            </td>
          </tr>  
          
          <tr align="left">
            <td width="30%">Comentarios:</td>
            <td nowrap width="15%">
                <textarea name="falComentarios" id="falComentarios" style="width:400px;height:200px" ></textarea></td>
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
            &nbsp;
            </td>
          </tr>           
          
          <tr>
            <td width="30%">Num Escritura:</td>
            <td nowrap width="15%">
                <input type="text" name="falNumEscritura" id="falNumEscritura" tipo="Num" size="10" maxlength="10"   /> <!---->
             </td>
            <td colspan="2">Fecha Escritura:</td>
            <td align="left" width="15%">
              <input type="text" name="falFechaEscritura" id="falFechaEscritura" tipo="Fecha" size="10" maxlength="10"/>
            </td>
          </tr>
          <tr>
            <td width="30%">Tipo Escritura:</td>
            <td nowrap width="15%">
                <select size="1" name="falTipoEscritura" id="falTipoEscritura" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo1097"  next="falNombreNotario"/> <!---->
             </td>
            <td colspan="2">Num Notario:</td>
            <td align="left" width="15%">
              <input type="text" name="falNumeroNotario" id="falNumeroNotario" size="30" maxlength="30"/>
            </td>
          </tr>   
          <tr>
            <td width="30%">Nombre Notario:</td>
            <td nowrap width="15%">
                <select size="1" name="falNombreNotario" id="falNombreNotario" ref="claveNotarios" fun="loadComboElement" keyValue="notNomNotario" theValue="notNomNotario" param="clavesCombo1095"  next="loadCatalogo"/> <!---->
             </td>
            <td colspan="2">Ciudad o Localidad de Notaria:</td>
            <td align="left" width="15%">
              <input type="text" name="falCiudadNotaria" id="falCiudadNotaria" size="50" maxlength="50"/>
            </td>
          </tr>   
          <tr>
            <td width="30%">Estado</td>
            <td nowrap width="15%">
                <input type="text" name="falEstadoNotaria" id="falEstadoNotaria" size="70" maxlength="70"/>
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
              &nbsp;
            </td>
          </tr> 
          
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">
            Datos de RPP
             </td>
            <td colspan="2">&nbsp;</td>
            <td align="left" width="15%">
              &nbsp;
            </td>
          </tr>           

          <tr>
            <td width="30%">Fecha Inscripcion:</td>
            <td nowrap width="15%">
                <input type="text" name="falFechaInscripcion" id="falFechaInscripcion" tipo="Fecha" size="10" maxlength="10"/>
             </td>
            <td colspan="2">Lugar de Registro:</td>
            <td align="left" width="15%">
              <input type="text" name="falLugarRegistro" id="falLugarRegistro" size="70" maxlength="70"/>
            </td>
          </tr>           

          <tr>
            <td width="30%">No. Folio:</td>
            <td nowrap width="15%">
                <input type="text" name="falNumFolio" id="falNumFolio" size="50" maxlength="50"/>
             </td>
            <td colspan="2">Partida:</td>
            <td align="left" width="15%">
              <input type="text" name="falPartida" id="falPartida" size="50" maxlength="50"/>
            </td>
          </tr> 


          <tr>
            <td width="30%">Volumen:</td>
            <td nowrap width="15%">
                <input type="text" name="falVolumen" id="falVolumen" size="50" maxlength="50"/>
             </td>
            <td colspan="2">Fojas:</td>
            <td align="left" width="15%">
              <input type="text" name="falFojas" id="falFojas" size="50" maxlength="50"/>
            </td>
          </tr> 

          <tr>
            <td width="30%">Libro:</td>
            <td nowrap width="15%">
                <input type="text" name="falLibro" id="falLibro" size="50" maxlength="50"/>
             </td>
            <td colspan="2">Seccion:</td>
            <td align="left" width="15%">
              <input type="text" name="falSeccion" id="falSeccion" size="50" maxlength="50"/>

            </td>
          </tr> 
          
      <tr>
        <td colspan="5" align="center">
          <input type="BUTTON" value="Aceptar " id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="BUTTON" value="Cancelar" id="cmdCancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipalFinalidadesContrato();" style="visibility:hidden"/>
        </td>
      </tr>
      
  </table>
</FORM>
