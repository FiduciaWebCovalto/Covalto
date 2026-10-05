<form name="frmDatosInterfase" id="frmDatosInterfase">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Instrucciones Programadas</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="98%" align="center" class="texto">
          <tr valign="middle">
            <td align="left">&nbsp;</td>
            <td align="right">Fideicomiso</td>
            <td align="left" style="width:360px;">
              <input type="text" id="paramfipNumFiso" name="paramfipNumFiso" tipo="Numero" size="25" message="El Fideicomiso es un campo obligatorio" next="conNomFidActivo" style="width:120px;"/><!--onblur="cargaCmbSubCta(this);" -->
              <span id="nomFideicomiso" class="textoNegrita" ref="conNomFidActivo" fun="asignaValor2DivFideicomiso" theValue="ctoTipoAdmon" param="divNombreFideicomisoParam">&nbsp;</span>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <!--tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Tipo de Operaci&oacute;n</td>
            <td align="left">            
              <select id="paramfipTipoOperacion" name="paramfipTipoOperacion" tipo="Numero" style="width:300px;" title="Tipo de Operacion" >
                <option value="-1">-- Seleccione --</option>
                <option value="1">DEPOSITO</option>
                <option value="2">RETIRO</option>
                <option value="3">TRASPASO</option>
              </select>
            </td>
            <td align="left">&nbsp;</td>            
          </tr-->
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Cuenta Origen</td>
            <td align="left">
              <input type="text" id="paramfipCtaOrigen" name="paramfipCtaOrigen" size="25" style="width:120px;"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr valign="middle">
            <td>&nbsp;</td>
            <td align="right">Cuenta Origen</td>
            <td align="left">
              <input type="text" id="paramfipCtaDestino" name="paramfipCtaDestino" size="25" style="width:120px;"/>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr>
            <td style="height:20px;" colspan="3">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td colspan="2" align="center">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="112"  align="center" valign="middle">
                    <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="Aceptar" class="boton_left" ref="muestraDatosIP" fun="loadTableElement" tabla="tablaFisoIP" onclick="consultar(this, GI('frmDatosInterfase'), false);">
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar();"/>
                  </td>
                </tr>
              </table> 
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr>
            <td style="height:20px;" colspan="3">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td colspan="2" align="center">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMntoIP(1)"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMntoIP(2)"/>
                  </td>
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="Eliminar" id="cmdEliminar" name="cmdEliminar" class="boton_middle" onclick="eliminar()"/>
                  </td>                   
                  <td width="112" align="center" valign="middle">
                    <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMntoIP(4)"/>
                  </td>                   
                </tr>
              </table>
            </td>
            <td align="left">&nbsp;</td>            
          </tr>
          <tr>
            <td style="height:20px;" colspan="3">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4">
              <table cellspacing="0" cellpadding="0" border="0" width="100%">
                <tr align="left" class="cabeceras">
                  <td style="width:30px;text-align:center;">&nbsp;&nbsp;No.</td>
                  <td style="width:220px;text-align:center;">Fideicomiso</td>
                  <!--td style="width:300px;">Sub Cuenta</td-->
                  <td style="width:130px;text-align:center;">Cuenta Origen</td>
                  <td style="width:130px;text-align:center;">Cuenta Destino</td>
                  <td style="width:90px;text-align:center;">Importe</td>
                  <!--td style="width:300px;">Periocidad</td-->
                  <td style="width:67px;text-align:center;">Fecha Inicio</td>
                  <td style="width:65px;text-align:center;">Fecha Fin</td>
                  <!--td style="width:300px;">Feriado</td-->
                  <td style="width:180px;text-align:center;">Concepto</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top;">
                <table id="tablaFisoIP" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaFisoIPData" keys="fipFolio" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                </table>
              </div>
            <td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</form>