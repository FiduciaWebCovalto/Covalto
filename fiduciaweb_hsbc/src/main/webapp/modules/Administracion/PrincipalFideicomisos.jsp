<FORM name="frmDatosFideicomisosConsulta" id="frmDatosFideicomisosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Fideicomisos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" align="center" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Fideicomiso</td>
            <td>
              <input type="text" name="paramNumFideicomiso" id="paramNumFideicomiso" tipo="Num" size="10" maxlength="10" onblur="consultaNombreFideicomiso('nomFideicomiso',this);"/>
            </td>
            <td width="45%">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Nombre</td>
            <td colspan="2">
              <input type="text" name="paramNombre" id="paramNombre" size="50" maxlength="80"/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Tipo Persona</td>
            <td colspan="2">
              <select size="1" name="paramTipoPersona" id="paramTipoPersona" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="paramTipoNegocio" param="clavesCombo23"/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Tipo Negocio</td>
            <td colspan="2">
              <select size="1" name="paramTipoNegocio" id="paramTipoNegocio" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="paramClasifProducto" param="clavesCombo36"/>
            </td>
            <td align="left" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Clasif. Producto</td>
            <td colspan="2">
              <select size="1" name="paramClasifProducto" id="paramClasifProducto" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo37"/>
            </td>
            <td align="left" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="5" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="5" align="center">
            <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="Aceptar" class="boton_left" ref="muestraDatosFideicomisos" fun="loadTableElement" tabla="tablaRegistrosFideicomisos" onclick="consultar(this, GI('frmDatosFideicomisosConsulta'), false);">
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosFideicomisosConsulta);"/>
                </td>
                </tr>
            </table> 
            </td>
          </tr>
          <tr>
            <td colspan="5" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="5" align="center">
            <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Define Fiso   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="DefineFideicomiso()"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoFideicomisos(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="alert('No es posible dar de baja. Ver proceso de extinci�n');"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoFideicomisos(3)"/> </td>                   
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
                  <td width="23px">&nbsp;</td>
                  <td width="80px">Fideicomiso</td>
                  <td width="100px">Tipo Negocio</td>
                  <td width="360px">Nombre</td>
                  <td width="100px">Tipo Persona</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:700px;">
                <table id="tablaRegistrosFideicomisos" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaFideicomisosData" keys="ctoNumContrato" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de b�squeda">
                </table>
              </div>
            </td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>
