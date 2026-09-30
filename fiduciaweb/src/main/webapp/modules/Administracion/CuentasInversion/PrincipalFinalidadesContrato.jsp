<FORM name="frmDatosFinalidadesContratoConsulta" id="frmDatosFinalidadesContratoConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="0" cellpadding="0" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Cuentas Bancarias y de Inversion</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap width="6%">No. Fideicomiso</td>
              <td width="8%">
                <input type="text" name="paramNumFideicomiso" id="paramNumFideicomiso" tipo="Num" size="10" maxlength="10" onblur="mostrarDatosInformativos(1);"/> <!--paramNumFiso-->
              </td>
              <td colspan="3" width="10%">
                <input type="text" name="txtNomProyecto" id="txtNomProyecto" tipo="AlphaNumeric" size="40"style="visibility:hidden"/>
                <div id="txtNomProyecto" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
              </td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap width="6%">Intermediario</td>
              <td width="8%">
                  <select size="1" name="paramIntermediario" id="paramIntermediario" ref="conNumIntNomInt" fun="loadComboElement" keyValue="intIntermediario" theValue="intIntermediario" next="paramStatus">
                  </select>
              </td>
              <td colspan="3" width="10%">&nbsp;</td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap width="6%">Cuenta Bancaria o de Inv.</td>
              <td width="8%">
                <input type="text" name="paramCuenta" id="paramCuenta" size="20" maxlength="20" /> <!--paramNumFiso-->
              </td>
              <td colspan="3" width="10%">
                &nbsp;
                </td>
            </tr>
            <tr valign="middle">
              <td width="25%">&nbsp;</td>
              <td nowrap width="6%">Status</td>
              <td width="8%">
              <select size="1" name="paramStatus" id="paramStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo31" next="formsLoaded"/> <!---->
              </td>
              <td colspan="3" width="10%">
                &nbsp;
                </td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                    <td width="112"  align="center" valign="middle">
                        <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosCuentasInversion" fun="loadTableElement" tabla="tablaRegistrosFinalidadesContrato" onclick="consultar(this, frmDatosFinalidadesContratoConsulta, false);"  />
                    </td>
                    <td width="112" align="center" valign="middle">
                    
                        <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosFinalidadesContratoConsulta);"/>
                    </td>
                    <td width="112" align="center" valign="middle">
                        <input type="button" value="Descargar" name="cmdDownload" id="cmdDownload" class="btn btn-info"onclick="doDownload();" />
                    </td>
                </tr>
            </table>
                
                
              </td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">
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
              <td width="20%" colspan="6" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                    <table id="tablaRegistrosFinalidadesContrato" width="100%" border="0" cellspacing="1" cellpadding="0" class="texto" width=513px dataInfo="tablaFinalidadesContratoData" keys="fciNumFideicomiso,fciNumCta,fciTipoCta" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                        <thead>
                          <tr align="left" class="cabeceras">
                            <td width="23px" align="center">&nbsp;</td>
                            <td width="200px">Fideicomiso</td>
                            <td width="250px">No. Cuenta</td>
                            <td width="250px">Tipo Cuenta</td>
                            <td width="250px">Institucion</td>
                            <td width="250px">Moneda</td>
                            <td width="200px">Estatus</td>
                            <td width="200px">Fecha Alta</td>
                            <td width="200px">Estatus</td>                    
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

    <div style="visibility:hidden;">
        <form id="frmExport" method="POST" action="DatosFiduciarios.xls" target="iframeDownload">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
            <input type="hidden" id="jsonExport" name="json" value="" />
            <input type="hidden" name="headers" value="Fideicomiso,No. Cuenta,Tipo Cuenta,Institucion,Moneda,Estatus,Fecha Alta,Estatus" />
        </form>
        <iframe name="iframeDownload" src=""></iframe>
    </div>