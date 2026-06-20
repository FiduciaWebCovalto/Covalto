<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Creditos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" align="center" class="texto">


          <tr>
            <td>&nbsp;</td>
            <td>Credito</td>
            <td><input type="text" name="paramFolio" id="paramFolio" size="20" maxlength="20" /></td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
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
                  <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="Aceptar" class="boton_left" ref="qryParamCreditos" fun="loadTableElement" tabla="tabla" onclick="if(fvMantenimiento.checkForm())consultar(this, GI('frmDatos'), false);">
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatos);"/>
                </td>
                </tr>
            </table> 
            </td>
          </tr>
          <tr>
            <td colspan="5" align="center">&nbsp;</td>
          </tr>
          <tr>
              <td width="100%" colspan="5" align="center" valign="middle">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimiento(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimiento(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimiento(3)"/> </td>                   
                  </td>
                </tr>
                </table>  
                
              </td>
            </tr>
          <tr>
            <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
          </tr>
          <tr align="center">
            <td colspan="8">
              <table cellspacing="0" cellpadding="0" border="0">
                <tr align="left" class="cabeceras">
                  <td width="23px">&nbsp;</td>
                  <td width="100px">Producto</td>
                  <td width="300px">Cliente</td>                  
                  <td width="200px">Credito</td>
                  <td width="200px">Monto</td>
                  <td width="100px">Tasa</td>
                  <td width="100px">Fecha Otorg.</td>
                  <td width="100px">Fecha Venc.</td>
                  <td width="100px">Moneda.</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top;">
                <table id="tabla" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaData" keys="idProducto,idCredito,idCliente" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
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
