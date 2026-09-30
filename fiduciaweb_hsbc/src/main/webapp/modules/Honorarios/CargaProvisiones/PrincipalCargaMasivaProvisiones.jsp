
  <FORM name="frmDatos" id="frmDatos">
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Carga Masiva</td>
      </tr>        
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table class="texto">
            <tr>
              <td nowrap colspan="5">&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            
            <tr>
              <td width="10%">
              Fideicomiso:&nbsp;<input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" maxlength="10" tipo="Num"/>
              </td>
            </tr>            
            <tr>
              <td>
              Fecha del:&nbsp; <input type="text" name="txtFechaValor" id="txtFechaValor" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha"  maxlength="10" tipo="Fecha"/>
              </td>
            </tr>
            <tr>
              <td>
              Fecha al:&nbsp;
              <input type="text" name="txtFechaValor1" id="txtFechaValor1" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" maxlength="10" tipo="Fecha"/>
              </td>
            </tr>            

            <tr>
              <td align="center">
              <div class="card shadow d-flex justify-content-center" style="width: 45rem;">
                    <div class="card-header bg-primary text-white">
                     <h4 class="mb-0">Cargar Honorarios Fiduciarios</h4>
                    </div>    
                     <div class="card-body">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option1" value="1" checked>
                            <label class="form-check-label" for="option1">Provision</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option2" value="2">
                            <label class="form-check-label" for="option2">Cobro</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option3" value="3">
                            <label class="form-check-label" for="option3">Condonacion/Quebranto</label>
                        </div>
                    </div>
                </div> 
                </td>
              </tr>
        <tr>
          <td align="center">
            <div id="previewContainer" style="display:none;max-height: 300px; overflow-y: auto;" class="overflow-auto">
            <h3>Previsualizacion</h3>
            <div class="table-responsive" id="tablePreview"></div>
            
            </div>
          </td>
        </tr>                
        <tr>
            <td align="center">
                <div id="divUpload" class="card shadow d-flex justify-content-center" style="width: 45rem;" >
                <div class="card-body">
                <form id="uploadForm" enctype="multipart/form-data">
                <div class="mb-3">
                <label for="excelFile" class="form-label">Seleccionar Excel</label>
                <input class="form-control" type="file" id="excelFile" 
                name="excelFile" accept=".xlsx, .csv">
                </div>               
                <button id="btnUpload"  class="btn btn-success" style="display: none;">Aplicar en Firme</button>
                </form>
                <input type="hidden" name="pdfName" id="hiddenPdfName"> 
                <!-- Área para mostrar mensajes -->
                <div id="statusMessage" class="mt-3"></div>
                </div>
                </div>
                <!--FIN SECCION PARA SUBIR PDF-->
            </td>
          </tr>                       
              <tr>
                <td  align="center">
                <div class="card shadow d-flex justify-content-center" style="width: 45rem;">
                    <div class="card-header bg-primary text-white">
                     <h4 class="mb-0">Descargar Honorarios Fiduciarios</h4>   
                    </div>                      
                     <div class="card-body">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importTypeDescarga" id="option1" value="1" checked>
                            <label class="form-check-label" for="option1">Cartera</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importTypeDescarga" id="option2" value="2">
                            <label class="form-check-label" for="option2">Provision</label>
                        </div>
                      </div>  
                </div>
                <button id="btnDescargar"  class="btn btn-warning" 
                <i class="bi bi-file-earmark-excel"></i> Descargar Excel
                </button>

              </td>            
            </tr>  
          </table>
        </td>
      </tr>
  </table>
</FORM>
