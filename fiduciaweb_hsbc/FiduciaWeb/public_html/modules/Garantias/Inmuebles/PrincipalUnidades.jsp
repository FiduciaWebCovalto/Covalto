<FORM name="frmPrincipalUnidades" id="frmPrincipalUnidades" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Individualizaci&oacute;n de Inmuebles (Unidades Condominales)</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="8%" nowrap>Fideicomiso:</td>
            <td>
              <!--<input type="text" name="paramNumUsuario" id="paramNumUsuario" tipo="Num" size="10" maxlength="10"/>-->
               <input type="text" name="paramNumFideicomiso" id="paramNumFideicomiso" tipo="Num" size="10" maxlength="10" onblur="consultaNombreFideicomiso('nomFideicomiso',this);"/>
            </td>
            <td width="45%">
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>
            </td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="8%" nowrap>Unidad:</td>
            <td>
              <!--<input type="text" name="paramNumUsuario" id="paramNumUsuario" tipo="Num" size="10" maxlength="10"/>-->
               <input type="text" name="paramNumUnidad" id="paramNumUnidad"  size="10" maxlength="10"/>
            </td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="8%" nowrap>Calle:</td>
            <td>
              <!--<input type="text" name="paramNumUsuario" id="paramNumUsuario" tipo="Num" size="10" maxlength="10"/>-->
               <input type="text" name="paramCalle" id="paramCalle"  size="25" maxlength="255"/>
            </td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td width="8%" nowrap>Status:</td>
            <td>
              <select size="1" name="paramCveStatus" id="paramCveStatus" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesCombo560"/>
            </td>
          </tr>
          
          <tr>
            <td colspan="4" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="prinUnidades" fun="loadTableElement" tabla="tablaConsultaUnidades" onclick="consultar(this, GI('frmPrincipalUnidades'), false);"/> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="RF(GI('frmPrincipalUnidades'));"/>
            </td>
          </tr>
          <tr>
            <td colspan="4">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoUnidades(1);"/>
              <input type="BUTTON" value="Modificar" id="cmdModificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoUnidades(2);"/>
              <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="eliminarRegistro();"/>
              <input type="BUTTON" value="Consultar" id="cmdConsultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoUnidades(3);"/>
               <input type="button" name="cmdExportarExcel" id="cmdExportarExcel" value="Exportar Excel" class="btn btn-primary" onclick="doDownload();"/>            

            </td>
          </tr>
           <tr>
            <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
          </tr>
          
          <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaConsultaUnidades" border="0" cellspacing="0" class="texto" style="width:100%;"   width=513px  cellpadding="0" dataInfo="arregloParametrosUnidades" keys="funiIdFideicomiso,funiIdSubcuenta,funiIdBien,funiIdEdificio,funiIdDepto" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Fideicomiso</td>
                  <td>Sub Cta.</td>
                  <td>Id Garantia</td>
                  <td>Id Bien</td>
                  <td>Edificio</td>
                  <td>Num. Unidad</td>
                  <td>Registro Contable</td>
                  <td>Moneda</td>
                  <td>Status</td>
                   
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
        <input type="hidden" id="jsonExport" name="json" value="" />
        <input type="hidden" name="headers" value="Status,Registro Contable,Fideicomiso,Sub Cta.,Id Garantia,Id Bien,Edificio,Num. Unidad,Moneda" />
    </form>
    <iframe name="iframeDownload" src=""></iframe>
</div>