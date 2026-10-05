<FORM name="frmINPCHonorariosConsulta" id="frmINPCHonorariosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Cat&aacute;logo INPC</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="40%">&nbsp;</td>
              <td width="4%">A&ntilde;o</td>
              <td>
                <input type="text" name="paramAno" id="paramAno" tipo="Num" size="4" maxlength="4"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td width="40%">&nbsp;</td>
              <td width="4%">Mes</td>
              <td>
                <input type="text" name="paramMes" id="paramMes" tipo="Num" size="2" maxlength="2"/>
              </td>
              <td width="30%">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" id="Aceptar" name="Aceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosINPCHonorarios" fun="loadTableElement" tabla="tablaRegistrosINPCHonorarios" onclick="consultar(this, GI('frmINPCHonorariosConsulta'), false);"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" name="cmdLimpiar" size="20%" class="btn btn-warning" onclick="RF(GI('frmINPCHonorariosConsulta'));"/>
                </td>
                </tr>
            </table>
                
                
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoINPCHonorarios(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoINPCHonorarios(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoINPCHonorarios(3)"/> </td>                   
                  </td>
                </tr>
            </table>                
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosINPCHonorarios" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaINPCHonorariosData" keys="inpcAno,inpcMes" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>&nbsp;</td>
                    <td>A&ntilde;o</td>
                    <td>Mes</td>
                    <td>Indice</td>               
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
