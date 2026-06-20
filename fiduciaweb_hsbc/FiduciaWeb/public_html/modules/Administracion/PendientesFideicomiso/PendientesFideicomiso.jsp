<FORM name="frmCharolaSolicitudes" id="frmCharolaSolicitudes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Pendientes por Fideicomiso</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="95%" style="text-align:left" class="texto" border="0">
            <tr>
              <td width="35%">&nbsp;</td>
              <td width="10%">Fideicomiso</td>
              <td><input type="text" name="paramContrato" id="paramContrato" size="10" onblur="verNomFiso();"/></td>
              <td width="30%"><div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div></td>
              <td width="25%">&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>Tipo de Carga</td>
              <td>
                <select name="paramTipoCarga" id="paramTipoCarga" onchange="setTablaResultados(this.value);">
                    <option value="">-- Seleccione --</option>
                    <option value="EMBARGO">EMBARGO</option>
                    <option value="PODERES">PODERES</option>
                    <option value="RDCL">RDCL</option>
                    <!--option value="REMEDIACION">REMEDIACION</option-->
                    <!--option value="PREDIALES">PREDIALES</option-->
                    <option value="JUICIOS">JUICIOS</option>
                    <option value="DOC_FALTANTE">DOC FALTANTE</option>
                </select>
              </td>
              <td>&nbsp;</td>
              <td width="25%">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="5" align="center" valign="middle">
                <input type="button" name="cmdAceptar" value="Consultar" value="Limpiar" class="btn btn-primary" ref="qry.admon.pendientesFideicomiso." fun="loadTableElement" tabla="tblResultados" param="paramQueryAdmon" onclick="validaTipoCarga(this, frmCharolaSolicitudes, false);"/>
                <input type="button" name="cmdLimpiar" value="Limpiar" id="cmdLimpiar" class="btn btn-primary" onclick="cargaPantallaPrincipal();"/>
              </td>
            </tr>
            <tr>
                <td colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
          </table>
        </td>
      </tr>
    <tr align="center">
        <td align="center">
            <table cellspacing="1" cellpadding="0" border="0" id="tblEMBARGO" style="display: none;">
              <tr align="left" class="cabeceras">
                <td width="23px">&nbsp;</td>
                <td width="200px">Tipo de Embargo</td>
                <td width="200px">Monto del Embargo</td>
                <td width="200px">Oficio Embargo</td>
                <td width="200px">Fecha del Embargo</td>
                <td width="200px">Comentarios Legal</td>
              </tr>
            </table>
            <table cellspacing="1" cellpadding="0" border="0" id="tblPODERES" style="display: none;">
              <tr align="left" class="cabeceras">
                <td width="23px">&nbsp;</td>
                <td width="200px">Apoderado</td>
                <td width="200px">Fecha de Poder</td>
                <td width="200px">Escritura</td>
                <td width="200px">Periodicidad</td>
                <td width="200px">Fecha de Vencimiento</td>
                <td width="200px">Facultades</td>
              </tr>
            </table>
            <table cellspacing="1" cellpadding="0" border="0" id="tblRDCL" style="display: none;">
              <tr align="left" class="cabeceras">
                <td width="23px">&nbsp;</td>
                <td width="200px">Tipo de RDC</td>
                <td width="200px">Fecha de Ultima RDC</td>
              </tr>
            </table>
            <!--table cellspacing="1" cellpadding="0" border="0" id="tblREMEDIACION" style="display: none;">
              <tr align="left" class="cabeceras">
                <td width="23px">&nbsp;</td>
                <td width="200px">RAM</td>
                <td width="200px">Tipo de RAM</td>
                <td width="200px">Periodic Review</td>
                <td width="200px">Categoria</td>
              </tr>
            </table>
            <table cellspacing="1" cellpadding="0" border="0" id="tblPREDIALES" style="display: none;">
              <tr align="left" class="cabeceras">
                <td width="23px">&nbsp;</td>
                <td width="200px">Manzana</td>
                <td width="200px">Lote</td>
                <td width="200px">Direccion</td>
                <td width="200px">Clave Catastral</td>
              </tr>
            </table-->
            <table cellspacing="1" cellpadding="0" border="0" id="tblJUICIOS" style="display: none;">
              <tr align="left" class="cabeceras">
                <td width="23px">&nbsp;</td>
                <td width="200px">Num Juicio</td>
                <td width="200px">Partes</td>
              </tr>
            </table>
            <table cellspacing="1" cellpadding="0" border="0" id="tblDOC_FALTANTE" style="display: none;">
              <tr align="left" class="cabeceras">
                <td width="23px">&nbsp;</td>
                <td width="200px">Tipo de Fideicomiso</td>
                <td width="200px">Tipo de Documento</td>
                <td width="200px">Detalle</td>
                <td width="200px">Prioridad</td>
              </tr>
            </table>
            <div style="height:250px; overflow:auto; position:relative; vertical-align:top">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblResultados" dataInfo="tblData" keys="key" fun="clickTablaResultados" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                </table>
            </div>
        </td>
    </tr>
    <tr>
        <td align="center" valign="middle">&nbsp;</td>
    </tr>
    <tr align="center">
	<td>
            <a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
	</td>
    </tr>		  
    <tr align="center"><td><a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a></td></tr>
  </table>
</FORM>