<FORM name="frmDocumentos" id="frmDocumentos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">Documentos de Evaluacion Proyecto Negocio</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr>
                            
          <td width="100%" height="34"> <table width="100%" class="texto">
              <tr> 
                <td> Proyecto 
                  <input type="text" name="txtNumContrato" id="txtNumContrato2" size="20" disabled="disabled"/>
                  - 
                  <input type="text" name="txtNomContraro" id="txtNomContraro2" size="80" disabled="disabled"/> 
                </td>
              </tr>
            </table></td>
                        </tr>
                        <tr>
                         <td width="100%">
                               <hr size="2">
                                <table width="1000" class="texto">
                                    <tr>
                                       <td width="50%" align="center" colspan="2">TIPO DE INTRUCCION</td>
                                        <td width="25%" align="center">FOLIO</td>
                                        <td width="25%" align="center">ESTATUS INSTRUCCION</td>
                                    </tr>
                                    <tr>
                                       <td width="50%" align="center" colspan="2">
                                         <input type="text" name="insCveTipoInstr" id="insCveTipoInstr" size="80" disabled="disabled"/>
                                        </td>
                                        <td width="25%" align="center">
                                          <input type="text" name="insNumFolioInst" id="insNumFolioInst" size="40" disabled="disabled"/>
                                        </td>
                                        <td width="25%" align="center">
                                          <input type="text" name="insCveStInstruc" id="insCveStInstruc" size="40" disabled="disabled"/>
                                        </td>
                                    </tr>
                                    <tr>
                                       <td width="50%" align="center" colspan="2">TIPO DE SOLICITUD</td>
                                        <td width="25%" align="center"></td>
                                        <td width="25%" align="center"></td>
                                    </tr>                                    
                                    <tr>
                                       <td width="50%" align="center" colspan="2">
                                         <input type="text" name="txtInsOperacion" id="txtInsOperacion" size="80" disabled="disabled"/>
                                        </td>
                                        <td width="25%" align="center">
                                        <input  id="paramEtapa" name="paramEtapa" size="10" style="visibility:hidden" /></input></td>
                                        <td width="25%" align="center">
                                        </td>
                                    </tr>    
                                    <tr>
                                       <td width="50%" align="center" colspan="2">PROMOTOR</td>
                                        <td width="25%" align="center">PRODUCTO</td>
                                        <td width="25%" align="center"></td>
                                    </tr>  
                                    <tr>
                                       <td width="50%" align="center" colspan="2">
                                         <input type="text" name="txtPromotor" id="txtPromotor" size="80" disabled="disabled"/>
                                        </td>
                                        <td width="25%" align="center">
                                        <input type="text" name="txtProducto" id="txtProducto" size="80" disabled="disabled"/>
                                        <td width="25%" align="center">
                                        </td>
                                    </tr>  
                                    <tr>
                                       <td width="50%" align="center" colspan="2">PERSONA</td>
                                        <td width="25%" align="center">CLASIFICACION</td>
                                        <td width="25%" align="center"></td>
                                    </tr>  
                                    <tr>
                                       <td width="50%" align="center" colspan="2">
                                         <input type="text" name="txtPersona" id="txtPersona" size="100" disabled="disabled"/>
                                        </td>
                                        <td width="25%" align="center">
                                        <input type="text" name="txtClasificacion" id="txtClasificacion" size="80" disabled="disabled"/>
                                        <td width="25%" align="center">
                                        </td>
                                    </tr>                                    
                                    </table>
            <table width="1000" class="texto">                                 
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr style="visibility:visible">
			<td width="25%">&nbsp;</td>
			<td colspan="2">
				Documento:&nbsp;&nbsp;
				<select size="1" name="cboNombre" id="cboNombre" ref="qryDocumentsCbo" fun="loadComboElement" keyValue="fdocIdDocumento" theValue="fdocNombre" param = "paramsQryDocumentsCbo" next="fin" onchange="cargaTablaParaDocumentos();" required message="Seleccione un documento"/>
				<!--input type="BUTTON" id="btnViewDoc" name="btnViewDoc" value="  Agregar Documento  " class="btn btn-primary"/-->				
				<div style="visibility:hidden"><a id="docLink" href="#" target="_new">Liga para ver documentos</a></div>
			</td>
                        <td colspan="2">>&nbsp;</td>
			<td nowrap>&nbsp;</td>
		</tr>
		<tr align="center"><td colspan="5">
			<td>
				<a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
			</td>
		</tr>

            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr align="center">
              <td colspan="5">
                <table cellspacing="1" cellpadding="0" border="0">
                  <tr align="left" class="cabeceras">
                    <td width="25px"></td>
                    <td width="100px">Punto de Revision</td>
                    <td width="400px">Descripcion</td>
                    <td width="50px">Cumple</td>
                    <td width="600px">Observaciones</td>
                  </tr>
                </table>
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top;width:1175px">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegDocumentos" dataInfo="arrTblDatPtoRev" keys="fetaIdEtapa,fpurIdPuntorev" fun="clickTablaPtoRev" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                </table>
              </td>
            </tr>
            <tr align="center"><td colspan="5">&nbsp;</td></tr>
            <tr align="center">
              <td colspan="5">
                <table width="90%" cellspacing="1" cellpadding="0" border="0" class="texto">
                  <tr>
                    <td>Cumple:</td>
                    <td>
                       <input type="radio" class="radio" name="rdCorrecto" id="rdSi" required message="Valor obligatorio";> SI&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       <input type="radio" class="radio" name="rdCorrecto" id="rdNo"> NO
                    </td>
                    <td>&nbsp;</td>
                    <td>Observaciones:</td>
                    <td>
                      <textarea name="txtObservaciones" id="txtObservaciones" style="width:600px;height:80px" onkeydown="validaLongitud(this,255);"></textarea>
                    </td>
                  </tr>
               </table>
               </td>
            </tr>
            <tr align="center"><td colspan="5">&nbsp;</td></tr>
            <tr align="center"><td colspan="5">
               <input type="BUTTON" name="btnGuardar" value="Guardar" class="btn btn-primary" onclick="guardar(2);"/>
               <input type="BUTTON" name="btnRegresar" value="Regresar" class="btn btn-danger" onclick="regresarAlaCharola2();"/>
               <input type="BUTTON" name="cmdReporte" value="Reporte Finalidades" class="btn btn-primary" onclick="generaReporteFinalidades();"/>
            </td></tr>
          </table>
        </td>
      </tr>
  </table>
</FORM>