<FORM name="frmDatosFideicomisariosConsulta" id="frmDatosFideicomisariosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Fideicomisarios</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td width="7%" nowrap>Fideicomiso</td>
              <td>
                <input type="text" name="paramFideicomiso" id="paramFideicomiso" tipo="Num" size="10" maxlength="10" onblur="verificacionActivo();"/>
              </td>
                <td><div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td width="7%" nowrap>No. Fideicomisario</td>
              <td>
                <input type="text" name="paramFideicomisario" id="paramFideicomisario" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td>&nbsp;</td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="7%" nowrap>Nombre</td>
              <td colspan="2">
                <input type="text" name="paramNombre" id="paramNombre" size="50" maxlength="50" onblur="this.value=this.value.toUpperCase()"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="7%" nowrap>Status</td>
              <td colspan="2">
                <select size="1" name="paramStatus" id="paramStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo31"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">                
                  <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosFideicomisariosAdministracion" fun="loadTableElement" tabla="tablaRegistrosFideicomisarios" onclick="consultar(this, GI('frmDatosFideicomisariosConsulta'), false);">
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosFideicomisariosConsulta);"/>
                </td>
                </tr>
            </table> 
                
                
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
                <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoFideicomisarios(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoFideicomisarios(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoFideicomisarios(3)"/> </td>                   
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
                <table cellspacing="0" cellpadding="0" border="0">
                  <tr align="left" class="cabeceras">
                    <td width="23px" align="center" nowrap>&nbsp;</td>
                    <td width="100px" nowrap>No. Fideicomiso</td>
                    <td width="300px" nowrap>Fideicomisario</td>
                    <td width="220px" nowrap>Representante</td>
                    <td width="90px" nowrap>Status</td>
                  </tr>
                </table>
                <div style="height:150px; overflow:auto; position:relative; vertical-align:top; width:733px;">
                  <table id="tablaRegistrosFideicomisarios" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaFideicomisariosData" keys="benNumContrato,benBeneficiario" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de b�squeda">
                  </table>
                </div>
              </td>
            </tr>
          </table>
        </td>
      </tr>
  </table>
</FORM>
