<FORM name="frmPresupuestoAnualHonorariosConsulta" id="frmPresupuestoAnualHonorariosConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td align="center" height="100%" class="titulo">Presupuesto de Honorarios</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
          
          <tr>
              <td width="40%">&nbsp;</td>
              <td width="10%">A&ntilde;o</td>
              <td>
                <input type="text" name="paramAnoRegistro" id="paramAnoRegistro" tipo="Num" size="4" maxlength="4" onBlur="cargaProm()" required/>
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
          
            <tr valign="middle">
              <td width="40%">&nbsp;</td>
              <td width="10%">Promotor</td>
              <td>
                <!--<input type="text" name="paramNumFiso" id="paramNumFiso" tipo="Num" size="10" required/>-->
                <select size="1" name="paramNumFiso" id="paramNumFiso" fun="loadComboElement" keyValue="ejeNumEjecAtenc" theValue="ejeNomEjecutivo" next="formsLoaded" required message="El Promotor"/>
                <!--select size="1" name="paramNumFiso" id="paramNumFiso" ref="clavePromotor" fun="loadComboElement" keyValue="ejeNumEjecAtenc" theValue="ejeNomEjecutivo" next="formsLoaded"/-->
              </td>
              <td width="5%">&nbsp;</td>
            </tr>
            <tr>
              <td width="25%" colspan="4">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" id="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="muestraDatosPresupuestoAnualHonorarios" fun="loadTableElement" tabla="tablaRegistrosPresupuestoAnualHonorarios" onclick="consultar(this, GI('frmPresupuestoAnualHonorariosConsulta'), false);"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" name="cmdLimpiar" size="20%" class="btn btn-warning" onclick="RF(GI('frmPresupuestoAnualHonorariosConsulta'));"/>
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
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoPresupuestoAnualHonorarios(1)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoPresupuestoAnualHonorarios(2)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoPresupuestoAnualHonorarios(3)"/> </td>                   
                  </td>
                </tr>
            </table>               
              </td>
            </tr>
            <tr>
              <td colspan="4" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr align="center">
              <td colspan="4">
                <table cellspacing="0" cellpadding="0" border="0">
                  <tr align="left" class="cabeceras">
                    <td width="23px" align="center">&nbsp;</td>
                    <td width="220px">Promotor</td>
                    <td width="200px">Nombre</td>
                    <td width="90px">Anual</td>
                    <td width="60px">ENE</td>
                    <td width="60px">FEB</td>
                    <td width="60px">MAR</td>
                    <td width="60px">ABR</td>
                    <td width="60px">MAY</td>
                    <td width="60px">JUN</td>
                    <td width="60px">JUL</td>
                    <td width="60px">AGO</td>
                    <td width="60px">SEP</td>
                    <td width="60px">OCT</td>
                    <td width="60px">NOV</td>
                    <td width="60px">DIC</td>
                    <td width="200px">Comentario</td>
                    <td width="100px">Status</td>
                  </tr>
                </table>
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:1650;">
                  <table id="tablaRegistrosPresupuestoAnualHonorarios" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaPresupuestoAnualHonorariosData" keys="prhNumContrato,prhAnoRegistro" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
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
      <tr>
        <td height="100%" align="center">&nbsp;
        </td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
  </table>
</FORM>
