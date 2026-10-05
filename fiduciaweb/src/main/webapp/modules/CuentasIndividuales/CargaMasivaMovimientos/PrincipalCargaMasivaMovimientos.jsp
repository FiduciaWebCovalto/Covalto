<form name="frmDatos" id="frmDatos" onsubmit="" enctype="multipart/form-data">
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;"> 
    <tr>
      <td align="center" height="100%" class="titulo">Carga Masiva de Movimientos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table align="center" class="texto" width="100%">
          <tr>
            <td width="20%" nowrap>
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" maxlength="10" tipo="Num" value="<%=session.getAttribute("fideicomisoCtasInd")!=null?session.getAttribute("fideicomisoCtasInd").toString():"0"%>"/>
              <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomisoCtasIndiv" param="divNombreFideicomisoParam" next="divReedireccion">&nbsp;</div>              
            </td>
          </tr>

          <tr>
            <td width="20%" nowrap>Fecha de Movimientos &nbsp;
                <input type="text" name="txtFechaMovimientos" id="txtFechaMovimientos" size="10" maxlength="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="txtFechaContable" tipo="Fecha"/>
                <input type="text" name="txtFechaContable" id="txtFechaContable" size="6" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="formsLoaded" maxlength="10" tipo="Fecha" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="2">
              <input type="text" name="NombreArchivo" id="NombreArchivo" size="5" style="visibility:hidden" />
            </td>
          </tr>
          
            <tr>
              <td align="center">
              <div class="card shadow d-flex justify-content-center" style="width: 45rem;">
                    <div class="card-header bg-primary text-white">
                     <h4 class="mb-0">Cargar Cuentas Individuales</h4>
                    </div>    
                     <div class="card-body">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option1" value="D" checked>
                            <label class="form-check-label" for="option1">Dep&oacute;sitos</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option2" value="R">
                            <label class="form-check-label" for="option2">Retiros</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option3" value="DF">
                            <label class="form-check-label" for="option3">Dep&oacute;sitos FOFAES</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option4" value="RF">
                            <label class="form-check-label" for="option4">Retiros FOFAES</label>
                        </div>      
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option5" value="TF">
                            <label class="form-check-label" for="option5">Traspaso FOFAES</label>
                        </div> 
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option6" value="CFM" checked>
                            <label class="form-check-label" for="option6">Cifras Control Mensuales</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option7" value="CFA">
                            <label class="form-check-label" for="option7">Cifras Control Acumuladas</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option8" value="RC">
                            <label class="form-check-label" for="option8">Reversion Carga</label>
                        </div>      
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option9" value="EAL">
                            <label class="form-check-label" for="option9">Alta Empleado</label>
                        </div>                         
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option3" value="EBA">
                            <label class="form-check-label" for="option10">Baja Empleado</label>
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
                <button id="btnUpload"  class="btn btn-success">Aplicar en Firme</button>
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
                 <h4 class="mb-0">Descargar Cuentas Individuales</h4>   
                </div>                      
                 <div class="card-body">
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="importTypeDescarga" id="option1" value="DescargaCifrasM" checked>
                        <label class="form-check-label" for="option1">Descarga Cifras Mensuales</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="importTypeDescarga" id="option2" value="DescargaCifrasR2">
                        <label class="form-check-label" for="option2">Descarga Totales Rendimientos</label>
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
  <a id="ligaArchivo" href="#"/>  
</form>
