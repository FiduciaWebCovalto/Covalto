<FORM name="frmPrincipalGarantias" id="frmPrincipalGarantias" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Bienes</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" align="center" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Fideicomiso:</td>
            <td>
              <input type="text" name="paramIdFideicomiso" id="paramIdFideicomiso" tipo="Num" size="10" maxlength="10" onblur="consultaNombreFideicomiso('nomFideicomiso',this);"/>
            </td>
            <td width="45%">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Sub Fiso:</td>
            <td colspan="2">
              <input type="text" name="paramSubfiso" id="paramSubfiso" size="10" maxlength="10"/>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Tipo de Bien: </td>
            <td>
              <select size="1" id="paramGarantia" name="paramGarantia" ref="claves" fun="loadComboElement" keyValue="cveNumSecClave" theValue="cveDescClave" param="clavesCombo38" next="formsLoaded"/>
            </td>
            <td width="45%">
              <div id="Fideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">Descripcion</td>
            <td>
                <input type="text" name="paramStatus" id="paramStatus" size="80" maxlength="255"/>
            </td>
            <td width="45%">
              <div id="Fideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>   
            <td width="15%">&nbsp;</td>
          </tr>
           <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">&nbsp;</td>
            <td>&nbsp;
            </td>
            <td width="45%">
              <div id="nomFideicomiso2" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
            <td width="15%">&nbsp;</td>
          <tr>
            <td width="30%">&nbsp;</td>
            <td nowrap width="15%">&nbsp;</td>
            <td colspan="2">&nbsp;
            </td>
            <td align="left" width="15%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="5" align="center">
              <input type="text" name="paramDescBien" id="paramDescBien" size="2" value="s" style="visibility:hidden"/>
            
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              <input type="text" name="paramIdGar" id="paramIdGar" size="10" style="visibility:hidden"/>
              <input type="text" name="paramIdBienGar" id="paramIdBienGar" size="10" style="visibility:hidden"/>
              <input type="text" name="paramCveTipoGar" id="paramCveTipoGar" size="10" style="visibility:hidden"/>
              <input type="text" name="paramFiso" id="paramFiso" size="10" style="visibility:hidden"/>
              
              
            </td>
          </tr>
          <tr>
            <td colspan="5" align="center">&nbsp;
              <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="Aceptar" class="btn btn-primary" ref="funRegistroGarantias" fun="loadTableElement" tabla="tablaRegistrosGarantias" onclick="consultaGarantia(this);">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalGarantias'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="5" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="5" align="center">
              <input type="BUTTON" value="   Alta    " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoGarantias(1);"/>
              <input type="BUTTON" value=" Modificar " id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoGarantias(2);"/>
              <input type="BUTTON" value=" Consulta  " name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoGarantias(4)"/>
               <!--eliminarRegistro()-->
              <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/>
            </td>
          </tr>
          <tr>
            <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
          </tr>
          
          <!----------------------->
          <!----- GARANTIAS ------->
          
          <tr align="center">
            <td colspan="5" class="subtitulo">Clasificacion Bien<hr/></td>
          </tr>

           <tr align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                    <table width="100%" border="0" cellspacing="1" cellpadding="0" class="texto" width=513px id="tablaRegistrosGarantias" dataInfo="tablaGarantiasData" keys="fgarIdFideicomiso,fgarIdSubcuenta,fgarCveGarantia,fgarCveGarantia2" fun="clickTabla" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                        <thead>
                          <tr align="left" class="cabeceras">
                          <td>&nbsp;</td>
                          <td>Fideicomiso</td>
                          <td>Id Bien</td>
                          <!--<td width="100px">Otros</td>-->
                          <td>Importe</td>
                          <td>Imp. Garantizado</td>
                           <td>Estatus</td>              
                          </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
              </td>
            </tr>            
          

          <!------------------------>
          <!-- BIENES EN GARANTIA -->
          
          <tr align="center">
            <td colspan="5" class="subtitulo">Subclasificacion de Bienes<hr/></td>
          </tr>
          <tr>
            <td colspan="5" align="center">
              <input type="BUTTON" value="Registro de Bien" id="cmdRegistro" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoBienesGar(1);"/>
              <!--input type="BUTTON" value="Revaluacion" id="cmdRevaluacion" name="cmdRevaluacion" class="btn btn-primary" onclick="cargaMantenimientoBienesGar(3);"/-->
              <input type="BUTTON" value="Salida de Bien" id="cmdSalidaBien" name="cmdSalidaBien" class="btn btn-danger" onclick="cargaMantenimientoBienesGar(5);"/> <!--eliminarRegistro()-->
              <input type="BUTTON" value="Modificar" id="cmdModificarBien" name="cmdModificarBien" class="btn btn-success" onclick="cargaMantenimientoBienesGar(2);"/>
              <input type="BUTTON" value="Consulta"  id="cmdConsultarBien" name="cmdConsultarBien" class="btn btn-info" onclick="cargaMantenimientoBienesGar(4)"/>
              <!--<input type="BUTTON" value="Imagenes" id="cmdImagenes" name="cmdImagenes" class="btn btn-primary" onclick="cargaMantenimientoBienesFideicomitidos(6)"/>-->
              <input type="BUTTON" value="Aceptar" id="cmdAceptarBienesGar" name="cmdAceptarBienesGar" class="btn btn-primary" ref="consultarBienesGar" fun="loadTableElement" tabla="tablaRegistrosBienesGar" onclick="consultar(this, GI('frmPrincipalGarantias'), false);" style="visibility:hidden;position:absolute;">
              
            </td>
          </tr>
          <tr>
            <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
          </tr>
          
           <tr align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                    <table width="100%" border="0" cellspacing="1" cellpadding="0" class="texto" width=513px id="tablaRegistrosBienesGar" dataInfo="tablaBienesGarData" keys="fgrsIdFideicomiso,fgrsIdSubcuenta,forsIdGarantia,forsCveTipoGarantia,forsCveTipoBien,disponibleBien" fun="clickTablaBienesGar" radioWidth="23px" >
                        <thead>
                          <tr align="left" class="cabeceras">
                          <td>&nbsp;</td>
                          <td>Fideicomiso</td>
                          <td>Clasificacion</td>
                          <td>Apodo</td>
                          <td>Calle</td>
                          <td>Num Int</td>
                          <td>Num Ext</td>
                          <td>Colonia</td>
                          <td>Pais</td>
                          <td>Estado</td>
                          <td>Delegacion</td>                  
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

