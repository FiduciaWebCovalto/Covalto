<FORM name="frmDatosFideicomitentesConsulta" id="frmDatosFideicomitentesConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Vincular CIS de las Partes</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="100%" class="texto" style="text-align:left" border="0">
            <tr>
              <td width="25%">&nbsp;</td>
              <td width="25%" nowrap>No. Prospecto</td>
              <td>
                <input type="text" name="paramProyecto" id="paramProyecto" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td width="25%">&nbsp;</td>
            </tr>
            <tr>
              <td width="30%">&nbsp;</td>
              <td width="16%" nowrap>Nombre o Denominacion Social</td>
              <td>
                <input type="text" name="paramNombreFideicomitente" id="paramNombreFideicomitente" size="50" maxlength="50"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="100%" colspan="4" align="center" valign="middle">
                <input type="text" name="paramOrder" id="paramOrder" size="1" value="s" style="visibility:hidden"/>
                <input type="text" name="paramCIS" id="paramCIS" size="1" value="SIN_CIS" style="visibility:hidden"/>
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="4" align="center" valign="middle">
                  <table width="224" cellpadding="0" cellspacing="0">
                    <tr>
                    <td width="112"  align="center" valign="middle">
                      <input type="BUTTON" id="Aceptar" name="CmdAceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosFideicomitentes" fun="loadTableElement" tabla="tablaRegistrosFideicomitentes" onclick="consultar(this, GI('frmDatosFideicomitentesConsulta'), false);"/>
                      </td>
                      <td width="112" align="center" valign="middle">
                      <input type="BUTTON" value="Limpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmDatosFideicomitentesConsulta'));"/>
                    </td>
                    </tr>
                  </table>
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="100%" colspan="4" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <!--td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoFideicomitentes(1)"/> </td-->
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoFideicomitentes(2)"/> </td>
                   <!--td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td-->
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" onmouseover="this.className='boton_middleSobre'" onmouseout="this.className='boton_middleSobre';" class="boton_middle" onclick="cargaMantenimientoFideicomitentes(3)"/> </td>                  
                   <!--td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Propietario R." id="cmdConsultarKYCP" name="cmdConsultarKYCP" onmouseover="this.className='boton_middleSobre'" onmouseout="this.className='boton_middleSobre';" class="boton_middle" onclick="cargaMantenimientoFideicomitentes(4)"/> </td-->
                   <!--td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Actualiza Conceptos" id="cmdReplicaKYC" name="cmdReplicaKYC" class="boton_right" onclick="llamaReplica();"/> </td-->                  
                   <!--td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Det. Riesgo" id="cmdRiesgo" name="cmdRiesgo" class="boton_right" onclick="invocaRiesgo();"/> </td-->
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Correo MCF Aprobacion" id="cmdCorreoMCFAprobacion" name="cmdCorreoMCFAprobacion" class="boton_right" onclick="enviarCorreoMCFAprobacion();"/> </td>
                </tr>
              </table>   
              </td>
            </tr>
            <tr>
              <td width="100%" colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr align="center">
              <td colspan="4">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                    <table id="tablaRegistrosFideicomitentes" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaFideicomitentesData" keys="afbCvePersona,afbNumFidben,afbAnteproyecto" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                        <thead>
                          <tr class="cabeceras">
                            <td width="23" align="center">&nbsp;</td>
                            <td width="50">Prospecto</td>
                            <td width="50">ID</td>
                            <td width="300">Nombre o Denominacion Social</td>
                            <td width="300">Tipo de Parte</td>
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