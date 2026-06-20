<!--Version de Formalizacion/Proyectos-->

<FORM name="frmDatosFinalidadesContratoConsulta" id="frmDatosFinalidadesContratoConsulta" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Activar Fideicomiso</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto">
            <tr>
              <td width="25%">&nbsp;</td>
              <td nowrap width="6%">No. Proyecto</td>
              <td width="8%">
                <input type="text" name="paramNumProspecto" id="paramNumProspecto" tipo="Num" size="10" maxlength="10"/>
              </td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">
              <table width="224" cellpadding="0" cellspacing="0">
                <tr>
                <td width="112"  align="center" valign="middle">
                  <input type="BUTTON" value="Aceptar" id="cmdAceptar" name="cmdAceptar" class="btn btn-primary" ref="muestraDatosFinalidadesContratoTablero" fun="loadTableElement" tabla="tablaRegistrosFinalidadesContrato" onclick="consultar(this, GI('frmDatosFinalidadesContratoConsulta'), false);" />
                  </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Limpiar" id="cmdLimpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosFinalidadesContratoConsulta);"/>
                </td>
                  <td width="112" align="center" valign="middle">
                  <input type="BUTTON" value="Activa Fideicomiso" id="cmdActiva" name="cmdActiva" class="btn btn-info" onclick="ejecutaFuncionConstitucion()" />
                </td>
                </td>
                  <td width="112" align="center" valign="middle">
                  <input type="button" value="Ver Docto" id="cmdDocumento" name="cmdDocumento" class="btn btn-info" onclick="validaDocumento();" />
                </td>
                </tr>
            </table>
                
                
              </td>
            </tr>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">&nbsp;</td>
            <tr>
              <td width="20%" colspan="6" align="center" valign="middle">&nbsp;</td>
            </tr>
            
            <tr  align="center">
              <td colspan="6">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tablaRegistrosFinalidadesContrato" border="0" cellspacing="0"
                  class="texto" style="width:100%;"   width=513px  cellpadding="0"
                  dataInfo="tablaFinalidadesContratoData" keys="ftaNumProspecto,antNumContrato,semaforo" 
                  fun="clickTabla" radioWidth="23"
                  NoRecordsMsg="No existen Registros para estos criterios de búsqueda" rowFunction="rowInstruccion">
                  <thead>
                  <tr align="left" class="cabeceras">
                    <td>&nbsp;</td>
                    <td>Aprobado</td>
                    <td>Prospecto</td>
                    <td>Fideicomiso</td>
                    <td>Aprueba MCF</td>
                    <td>Contrato</td>
                    <td>Fines</td>                    
                    <td>Pol Inversion</td>
                    <td>Honorarios</td>
                    <td>Aprueba Hono</td>
                    <td>Fiscal</td>               
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
    <tr>
            <td colspan="8" align="center">
                <div id="divUpload" class="card shadow d-flex justify-content-center" style="width: 45rem;" >
                <div class="card-header bg-primary text-white">
                <h4 class="mb-0">Subir Contrato al Expediente Electronico</h4>
                </div>
                <div class="card-body">
                <form id="uploadForm" enctype="multipart/form-data">
                <div class="mb-3">
                <label for="pdfFile" class="form-label">Seleccionar PDF</label>
                <input class="form-control" type="file" id="pdfFile" 
                name="pdfFile" accept="application/pdf" required>
                </div>
                <button type="button" id="btnUpload" class="btn btn-success">Subir</button>
                </form>
                <input type="hidden" name="pdfName" id="hiddenPdfName"> 
                <!-- Área para mostrar mensajes -->
                <div id="statusMessage" class="mt-3"></div>
                </div>
                </div>
                
                <!--FIN SECCION PARA SUBIR PDF-->
            </td>
          </tr>         
  </table>
</FORM>
