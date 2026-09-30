  <table cellspacing="0" cellpadding="0" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Garantias Liquidas</td>
      </tr>
      <tr>
        <td height="100%">
                <!--<input type="hidden" id="paramurlReporte" name="paramurlReporte" value="/modules/Administracion/GarantiasLiquidas/ConstanciaGarantiasLiquidas.jsp"/></td>
                
                <input type="hidden" id="paramUsuario" name="paramUsuario" value="<%=session.getAttribute("userid").toString()%>"/>
                <input type="hidden" id="refSP" name="refSP" value="repRepContratosInv"/>
                <input type="hidden" id="refQry" name="refQry" value="getRepContratosInv"/>
                <input type="hidden" id="paramsendToJSP" name="paramsendToJSP" value="true"/>-->
                                
      </tr>
      <tr>
        <td>
          <hr>        
        </td>
            </tr>
            <tr>
              <td valign="top">
                  <table cellpading=0 cellspacing=0>
                    <tr>
                      <td width="168" align="right" height="500" style="vertical-align:top;">
                        
                          <table border =0 cellpadding=0 cellspacing=0 width="168" >
                            <tr id="gar_0" class="pestaniaKYC" claseOriginal="pestaniaKYC" onmouseover="cambiaClassFila(this)" siSeleccionada="NO" onmouseout="cambiaClassFila(this)" onclick="clickPestania(this,'1,2,3,4,5,6')">
                              <td align=center style="font-size: 11px; font-family: Arial, Helvetica, sans-serif;color: #FFFFFF;">Constancias</td>
                            </tr>
                            <tr id="gar_1" class="pestaniaKYC" claseOriginal="pestaniaKYC" onmouseover="cambiaClassFila(this)"  siSeleccionada="NO" onmouseout="cambiaClassFila(this)" onclick="clickPestania(this,'0,2,3,4,5,6')">
                              <td align=center style="font-size: 11px; font-family: Arial, Helvetica, sans-serif;color: #FFFFFF;">Liberaci�n Garant�as</td>
                            </tr>
                            <tr id="gar_2" class="pestaniaKYC" claseOriginal="pestaniaKYC" onmouseover="cambiaClassFila(this)"  siSeleccionada="NO" onmouseout="cambiaClassFila(this)" onclick="clickPestania(this,'0,1,3,4,5,6')">
                              <td align=center style="font-size: 11px; font-family: Arial, Helvetica, sans-serif;color: #FFFFFF;">Distribuci�n Intereses</td>
                            </tr>
                            <tr id="gar_3" class="pestaniaKYC" claseOriginal="pestaniaKYC" onmouseover="cambiaClassFila(this)"  siSeleccionada="NO" onmouseout="cambiaClassFila(this)" onclick="clickPestania(this,'0,1,2,4,5,6')">
                              <td align=center style="font-size: 11px; font-family: Arial, Helvetica, sans-serif;color: #FFFFFF;">Liberaci�n Intereses</td>
                            </tr>
                            <tr id="gar_4" class="pestaniaKYC" claseOriginal="pestaniaKYC" onmouseover="cambiaClassFila(this)"  siSeleccionada="NO" onmouseout="cambiaClassFila(this)" onclick="clickPestania(this,'0,1,2,3,5,6')">
                              <td align=center style="font-size: 11px; font-family: Arial, Helvetica, sans-serif;color: #FFFFFF;">Reposici�n Constancias</td>
                            </tr>
                            <tr id="gar_5" class="pestaniaKYC" claseOriginal="pestaniaKYC" onmouseover="cambiaClassFila(this)"  siSeleccionada="NO" onmouseout="cambiaClassFila(this)" onclick="clickPestania(this,'0,1,2,3,4,6')">
                              <td align=center style="font-size: 11px; font-family: Arial, Helvetica, sans-serif;color: #FFFFFF;">Estados de Cuenta</td>
                            </tr>
                            <tr id="gar_6" class="pestaniaKYC" claseOriginal="pestaniaKYC" onmouseover="cambiaClassFila(this)"  siSeleccionada="NO" onmouseout="cambiaClassFila(this)" onclick="clickPestania(this,'0,1,2,3,4,5')">
                              <td align=center style="font-size: 11px; font-family: Arial, Helvetica, sans-serif;color: #FFFFFF;">Contabilizar Disposiciones</td>
                            </tr>
                          </table>
                          
                      </td>
                      <td align="center" height="500" style="background-color:#E4E4E4;" valign="top">
                        <div id="contenedorGarLiq" style="vertical-align:top;width:950"><br>
                            <form id="frmConsulta" name="frmConsulta" onsubmit=" ">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
                              
                            <input type="hidden" id="paramOrder" name="paramOrder" value="s" style="position:absolute;"/>
                            <input type="hidden" id="paramDisposicion" name="paramDisposicion" value="" style="position:absolute;"/>
                            <input type="hidden" id="paramCredito" name="paramCredito" value="" style="position:absolute;"/>
                            
                              <table align="center" class="texto" border="0"  cellpadding="0" cellspacing=0>
                                <tr valign="middle">
                                  <td nowrap>Fideicomiso;&nbsp;</td>
                                  <td>
                                    <select id="paramFideicomiso" name="paramFideicomiso" ref="conNumFidNomFid" fun="loadComboElement" keyValue="ctoNumContrato" theValue="ctoNomContrato" next="" param="conNumFidNomFid" required onchange="cargaComboCredito(id)"  message="El Fideicomiso es un campo obligatorio"/>
                                  </td>
                                  <td width="5%">&nbsp;</td>
                                  <td>
                                  <table width="224" cellpadding="0" cellspacing="0">
                                    <tr>
                                    <td width="112"  align="center" valign="middle">
                                      <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="conNumCredito" fun="loadTableElement" tabla="tablaCreditos" onclick="consultaDatos();">
                                      </td>
                                      <td width="112" align="center" valign="middle">
                                      <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="onButtonClick('Administracion.GarantiasLiquidas.PrincipalGarantiasLiquidas','');"/>
                                    </td>
                                    </tr>
                                    <!--<tr>
                                      <td width="100%" colspan="5" align="center" valign="middle">
                                      &nbsp;
                                        <input type="BUTTON" value="Constancia" id="cmdConstancia" name="cmdConstancia" class="btn btn-primary" onclick="generaConstancia();">
                                      </td>
                                    </tr>-->
                                </table> 
                                  </td>
                                </tr>
                                </table>
                              </form>
                                <!--CREDITOS-->
                                <BR>
                                <div class="subtitulo">CREDITO</div>
                                <table cellspacing="0" cellpadding="0" border="0">
                                  <tr class="cabeceras">
                                    <td nowrap width="23">&nbsp;</td>
                                    <td nowrap width="70">Id</td>
                                    <td nowrap width="100">Tipo</td>
                                    <td nowrap width="70">Importe</td>
                                    <td nowrap width="30">%Ga</td>
                                    <td nowrap width="70">ImpGar</td>
                                    <td nowrap width="50">No.Disp</td>
                                    <td nowrap width="70">ImpDisp</td>
                                    <td nowrap width="70">ImpGarApo</td>
                                    <td nowrap width="70">ImpGarLib</td>
                                    <td nowrap width="50">Moneda</td>
                                  </tr>
                                </table>
                                <div style="height:40px; width:673px; overflow:auto; position:relative; vertical-align:top;100%">
                                  <table id="tablaCreditos" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaCreditosData" keys="fcreIdCredito" fun="clickTablaCreditos" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de b�squeda">
                                  </table>
                                </div> 
                                
                                 <input type="BUTTON" value="Consultar" id="cmdConsultarDis" name="cmdConsultarDis" ref="consultaDisposicion" fun="loadTableElement" tabla="tablaDisposiciones" onclick="consultar(this, frmConsulta, false);" style="position:absolute;visibility:hidden;"/>
                 
                                <!--DISPOSICIONES-->
                                <BR>
                                
                                <div class="subtitulo">DISPOSICION</div>
                                <table cellspacing="0" cellpadding="0" border="0">
                                  <tr class="cabeceras">
                                    <td nowrap width="23">&nbsp;</td>
                                    <td nowrap width="100">Disposici�n</td>
                                    <td nowrap width="100">Fecha</td>
                                    <td nowrap width="100">Importe</td>
                                    <td nowrap width="100">Garantia</td>
                                    <td nowrap width="100">No. Beneficiarios</td>
                                    <td nowrap width="100">Acci�n Tomada</td>
                                    <td nowrap width="100">Estatus</td>
                                  </tr>
                                </table>
                                <div style="height:100px; width:723px; overflow:auto; position:relative; vertical-align:top;100%">
                                  <table id="tablaDisposiciones" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaDisposicionesData" keys="gliqIdDisposicion" fun="clickTablaDisposicion" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de b�squeda">
                                  </table>
                                </div>
                                
                                <!--BENEFICIARIOS-->
                                <BR>
                                <div class="subtitulo">MINISTRACION</div>
                                  <input type="BUTTON" value="Consultar" id="cmdConsultarBen" name="cmdConsultarBen" ref="consultaBeneficiarios" fun="loadTableElementGarLiq" tabla="tablaBeneficiarios" onclick="consultar(this, frmConsulta, false);" style="position:absolute;visibility:hidden;"/>
                 
                                <table cellspacing="0" cellpadding="0" border="0" align="center">
                                  <tr class="cabeceras">
                                    <td nowrap width="23">&nbsp;</td>
                                    <td nowrap width="30">Sec</td>
                                    <td nowrap width="50">Id</td>
                                    <td nowrap width="140">Nombre</td>
                                    <td nowrap width="70">ImpCred</td>
                                    <td nowrap width="30">%G</td>
                                    <td nowrap width="60">ImpGar</td>
                                    <td nowrap width="60">ImpLib</td>
                                    <td nowrap width="60">ImpInt</td>
                                    <td nowrap width="70">FolioC</td>
                                    <td nowrap width="70">FolioL</td>
                                    <td nowrap width="80">TipoMov</td>
                                    <td nowrap width="60">ImpMovC</td>
                                    <td nowrap width="60">ImpMovL</td>
                                    <td nowrap width="50">Estatus</td>
                                  </tr>
                                </table>
                                <div style="height:150px; width:933px; overflow:auto;vertical-align:top;100%">
                                  <table id="tablaBeneficiarios" border="0" cellspacing="0" cellpadding="0" dataInfo="tablaBeneficiariosData" keys="glbeImpCredito,glbeImpGarliq,glbeImpIntereses" fun="" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de b�squeda">
                                  </table>
                                </div>
                                <br>
                                
                                <div id="div_opciones" align=center>
                                  <input type=hidden id="sumImpCredito"/><input type=hidden id="sumImpGarliq"/>
                                </div>
                                
                                <!--<input type=hidden id="sumImpCredito"/><input type=hidden id="sumImpGarliq"/>-->
                        </div>
                      </td>
                    </tr>
                  </table>
              </td>
            </tr>
          </table>
        </td>
      </tr>
  </table>
<a id="linkConstancia" href="#" style="visibility:hidden" target="_new">Archivo</a> 

<!--
<FORM name="frmConstancias" id="frmConstancias" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
                                        <table class="texto" style="font-size:12px;">
                                          <tr>
                                            <td >
                                              Fecha Inicio:&nbsp;<input type="text" id="consFechaIni" name="consFechaIni" tipo="Fecha" size=10 required message="La Fecha de Inicio es un campo obligatorio">
                                            </td>
                                            <td >
                                              Fecha Vigencia:&nbsp;<input type="text" id="consFechaVig" name="consFechaVig" tipo="Fecha" size=10 required message="La Fecha de Vigencia es un campo obligatorio">
                                            </td>
                                            <td >
                                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            </td>
                                            <td>
                                              Total Cr�dito:&nbsp;<input type=text id="sumImpCredito" size=10 required message="El Total Cr�dito es un campo obligatorio"/>
                                            </td>
                                            <td >
                                              Garant�a Liquida:&nbsp;<input type=text id="sumImpGarliq" size=10 required message="La Garant�a Liquida es un campo obligatorio"/>
                                            </td>
                                            <td >
                                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            </td>
                                            <td >
                                              <input type=button class="btn btn-primary" value="Aceptar" onclick="if(fvConstanciasGarLiq.checkForm())alert('llamaPaquete')"/>
                                            </td>
                                          </tr>
                                        </table>
                                    </FORM>
                                    <input type=hidden id="sumImpIntereses"/>

-->