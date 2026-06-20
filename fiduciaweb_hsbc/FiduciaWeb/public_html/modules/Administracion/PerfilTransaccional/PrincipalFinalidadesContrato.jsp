<!--Version de Formalizacion/Proyectos-->

<FORM name="frmDatosFinalidadesContratoConsulta" id="frmDatosFinalidadesContratoConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Perfil Transaccional</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="left">
              <td width="10%">&nbsp;</td>
              <td nowrap width="6%">No. Fideicomiso</td>
              <td width="8%">
                <input type="text" name="paramNumero" id="paramNumero" tipo="Num" size="10" maxlength="10" onblur="mostrarDatosInformativos(1);" required/> <!--paramNumFiso-->
              </td>
              <td width="10%">
                &nbsp;              
                </td>
            </tr>   
            
            <tr valign="left">
              <td>&nbsp;</td>
              <td nowrap width="6%">Nombre</td>
              <td width="8%">
                <input type="text" name="paramNombre" id="paramNombre" tipo="Num" size="10" maxlength="10" onblur="mostrarDatosInformativos(1);" required/> <!--paramNumFiso-->
              </td>
              <td width="10%">
                &nbsp;
                </td>
            </tr>             
            
            <tr>
              <td width="20%" colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%" colspan="4" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosPerfilTransaccionalC" fun="loadTableElement" tabla="tablaRegistrosFinalidadesContrato" onclick="consultar(this, GI('frmDatosFinalidadesContratoConsulta'), false);" />
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosFinalidadesContratoConsulta);"/>
                </td>
                </tr>
            </table>
                
                
              </td>
            </tr>
            <tr>
              <td width="20%" colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%" colspan="4" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoFinalidadesContrato(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoFinalidadesContrato(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro()"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoFinalidadesContrato(3)"/> </td>                   
                  </td>
                </tr>
            </table>
                
              </td>
            </tr>
            <tr>
              <td width="20%" colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr align="center">
              <td colspan="4">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                    <table id="tablaRegistrosFinalidadesContrato" border="0" cellspacing="0" cellpadding="0" width=723px dataInfo="tablaFinalidadesContratoData" keys="fperAntFiso,fperTipo" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                        <thead>
                          <tr align="left" class="cabeceras">
                            <td width="23px" align="center">&nbsp;</td>
                            <td width="90px">No.Fideicomiso</td>
                            <td width="350px">Nombre</td>
                            <td width="90px">Tipo Negocio</td>
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
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
  </table>
</FORM>
