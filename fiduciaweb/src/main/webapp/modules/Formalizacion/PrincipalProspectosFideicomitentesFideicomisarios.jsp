<FORM name="frmDatosFideicomitentesConsulta" id="frmDatosFideicomitentesConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Fideicomitentes/Fideicomisarios</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto">
            <tr valign="middle">
              <td width="30%">&nbsp;</td>
              <td width="16%" nowrap>Prospecto</td>
              <td width="216">
                <input type="text" name="paramProspecto" id="paramProspecto" tipo="Num" size="10" maxlength="10"/> <!--onblur="mostrarDatosInformativos(1);"-->
              </td>
              <td width="217">&nbsp;<!--<input type="text" name="txtNomProspecto" id="txtNomProspecto" tipo="AlphaNumeric" size="40">-->
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr valign="middle">
              <td width="30%">&nbsp;</td>
              <td width="16%" nowrap>N&uacute;m. Fideicomitente/Fideicomisario</td>
              <td width="216">
                <input type="text" name="paramNumFideicomitente" id="paramNumFideicomitente" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td width="217">&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="16%" nowrap>Nombre</td>
              <td colspan="2">
                <input type="text" name="paramNombreFideicomitente" id="paramNombreFideicomitente" size="80" maxlength="100"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="16%" nowrap>Status</td>
              <td width="216">
                <select id="paramStatus" name="paramStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo31"/>
              </td>
              <td width="217">&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
                <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" id="Aceptar" name="CmdAceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosFideicomProspecto" fun="loadTableElement" tabla="tablaRegistrosFideicomitentes" onclick="consultar(this, GI('frmDatosFideicomitentesConsulta'), false);"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmDatosFideicomitentesConsulta'));"/>
                </td>
                </tr>
              </table>
                
                
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoFideicomitentes(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoFideicomitentes(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoFideicomitentes(3)"/> </td>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Validar Listas" id="cmdValidar" name="cmdValidar" class="boton_right" onclick="validacatalogoAlterno()"/> </td>                  
                  </td>
                </tr>
              </table>   
               
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr align="center">
              <td colspan="5">
                <table cellspacing="0" cellpadding="0" border="0" class="texto">
                  <tr class="cabeceras">
                    <td width="23" align="center">&nbsp;</td>
                    <td width="60">Prospecto</td>
                    <td width="100">Tipo Persona</td>
                    <td width="80">Secuencial</td>
                    <td width="100">Nombre</td>
                    <td width="100">Ap Paterno</td>
                    <td width="100">Ap Materno</td>                    
                    <td width="100">Status</td>
                    <td width="100px">Listas Negras</td>  
                  </tr>
                </table>
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                  <table id="tablaRegistrosFideicomitentes" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaFideicomitentesData" keys="fidNumProspecto,fidSecuencialPersona,fidCvePersona,fidNomPersona,fidRfcPersona,fidCurpPersona,fidApPaterno,fidApMaterno" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  </table>
                </div>
              </td>
            </tr>
          </table>
        </td>
      </tr>
  </table>
</FORM>