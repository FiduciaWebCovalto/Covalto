<form name="frmCargaMasiva" id="frmCargaMasiva" onsubmit="" enctype="multipart/form-data">
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
        <table align="center" class="texto" width="100%">
         <tr>
            <td width="15%">Fideicomiso
                &nbsp;
                <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" tipo="Num" required message="El Fideicomiso es un campo obligatorio" onblur="consultaDatosFideicomiso(this)"/>
                &nbsp;
                <div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div>              
            </td>
          </tr>
          <tr>
            <td>
              <input type="text" name="txtFechaContable" id="txtFechaContable" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="formsLoaded" maxlength="10" tipo="Fecha" style="visibility:hidden"/>
              <input type="text" name="NombreArchivo" id="NombreArchivo" size="15" style="visibility:hidden"/>
            </td>
          </tr>
          
          <tr>
              <td align="center">
              <div class="card shadow d-flex justify-content-center" style="width: 45rem;">
                    <div class="card-header bg-primary text-white">
                     <h4 class="mb-0">Cargar Bienes</h4>
                    </div>    
                     <div class="card-body">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option1" value="1" checked>
                            <label class="form-check-label" for="option1">Individualizaci&oacute;n Inmuebles</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option2" value="4">
                            <label class="form-check-label" for="option2">Liberaci&oacute;n</label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="importType" id="option2" value="5">
                            <label class="form-check-label" for="option2">Adquirentes</label>
                        </div>                        
                    </div>
                </div> 
                </td>
              </tr>

        <tr>
          <td align="center">
            <div id="previewContainer" style="display:none;max-height: 300px; overflow-y: auto;max-width: 800px;" class="overflow-auto">
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
                <button id="btnUpload"  class="btn btn-success" >Aplicar en Firme</button>
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
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>

    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</form>