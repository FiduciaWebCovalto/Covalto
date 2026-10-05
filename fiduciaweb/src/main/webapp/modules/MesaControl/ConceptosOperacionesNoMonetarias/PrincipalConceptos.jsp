<form name="frmPrincipalConceptos" id="frmPrincipalConceptos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
    <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
        <tr>
            <td align="center" height="100%" class="titulo">Conceptos Operaciones No Monetarias</td>
        </tr>
         
        <tr>
            <td height="100%">&nbsp;</td>
        </tr>
         
        <tr>
            <td height="100%">
                <table width="100%" class="texto">
                    <tr>
                        <td width="15%">Tipo Operacion</td>
                        <td colspan="4" align="left">
                            <select size="1" name="paramNumOperacion" id="paramNumOperacion"
                                    ref="qryOperacionesNoMonetarias" fun="loadComboElement" keyvalue="ftopNumOper"
                                    thevalue="ftopNombreTipoper" next="formsLoaded"></select>
                        </td>
                    </tr>
                     
                    <tr>
                        <td colspan="4" align="center">
                            <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary"
                                   ref="qryConceptosOperacionesNoMonetarias" fun="loadTableElement"
                                   tabla="tablaConsultaConceptos"
                                   onclick="consultar(this, GI('frmPrincipalConceptos'), false);"/>
                             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<!--principalAdquirentes-->
                             
                            <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning"
                                   onclick="RF(GI('frmPrincipalConceptos'));"/>
                        </td>
                    </tr>
                     
                    <tr>
                        <td colspan="4">&nbsp;</td>
                    </tr>
                     
                    <tr>
                        <td colspan="4" align="center">
                            <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary"
                                   onclick="cargaMantenimientoConceptos(1);"/>
                             
                            <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success"
                                   onclick="cargaMantenimientoConceptos(2);"/>
                             
                            <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger"
                                   onclick="eliminarRegistro();"/>
                             
                            <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info"
                                   onclick="cargaMantenimientoConceptos(3);"/>
                        </td>
                    </tr>
                     
                    <tr>
                        <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
                    </tr>
                     

                    
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaConsultaConceptos" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="tablaConceptosData" keys="ftopNumOper,conpIdConcepto" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                                    <td>&nbsp;</td>
                                    <td>Num. Operacion</td>
                                    <td>Id Concepto</td>
                                    <td>Nombre</td>
                                    <td>Viene de BD?</td>
                                    <td>Estatus</td>
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
</form>