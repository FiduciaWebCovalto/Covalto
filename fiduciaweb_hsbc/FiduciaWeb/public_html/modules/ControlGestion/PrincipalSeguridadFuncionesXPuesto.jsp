<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Asignaci&oacute;n Funciones Perfil</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto">
            <tr>
              <td width="33%">&nbsp;</td>
              <td width="5%">Perfil</td>
              <td>
                <!--select size="1" name="paramPuesto" id="paramPuesto" ref="clavePerfil" fun="loadComboElement" keyValue="fperIdPerfil" theValue="fperNombrePerfil" next="formsLoaded" param="paramOrderPerfil" required message="El Perfil es un dato obligatorio"/-->
                <select size="1" name="paramPuesto" id="paramPuesto" ref="clavePerfil" fun="loadComboElement" keyValue="pueNumPuesto" theValue="pueNomPuesto" next="formsLoaded" param="paramOrderPerfil" required message="El Perfil es un dato obligatorio"/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
                <input type="text" name="paramorderPuesto" id="paramorderPuesto" size="2" value="s" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;
                <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosFuncionesXPuestoPerfil" fun="loadTableElementSpecial" tabla="tablaRegistrosFuncionesXPuesto" onclick="if(fvMantenimientoFuncionesXPuesto.checkForm()) consultar(this, GI('frmDatos'), false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmDatos'));"/>
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
                <input type="BUTTON" value="Editar Funciones" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="if(fvMantenimientoFuncionesXPuesto.checkForm()) cargaMantenimientoSeguridadFuncionesXPuesto(1,GI('paramPuesto'));"/>
                <input type="BUTTON" value="   Consultar    " id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="if(fvMantenimientoFuncionesXPuesto.checkForm()) cargaMantenimientoSeguridadFuncionesXPuesto(2,GI('paramPuesto'));"/>
                <!--input type="BUTTON" value=" Refrescar Men� " id="cmdRefrescarMenu" name="cmdRefrescarMenu" class="btn btn-primary" onclick="refrescarMenu();"/-->
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosFuncionesXPuesto" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaFuncionesXPuestoData" keys="fperIdPerfil" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>Id Funci&oacute;n</td>
                    <td>Funci&oacute;n</td>                  
                  </tr>                  
                  </thead>
                   <tbody></tbody>
                  </table>
                </div>
              </td>
            </tr>  
          </table>
          
             
          
        </td>
      </tr>
  </table>
</FORM>
