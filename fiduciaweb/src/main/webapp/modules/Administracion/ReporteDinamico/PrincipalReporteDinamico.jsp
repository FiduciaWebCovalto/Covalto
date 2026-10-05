<form name="frmCargaMasiva" id="frmCargaMasiva" >
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      <td height="100%">&nbsp;</td>
      <td rowspan="7" width="10%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td align="center" height="100%" class="titulo">Reportes Dinamicos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td width="60%" height="100%">
          <div class="container mt-5">
        
            <!-- Selector de Reportes -->
            <div class="row mb-4">
                <div class="col-md-4">  
                    <button id="btnUpload" type="button" class="btn btn-success" >Cargar Reportes</button>
                    <label for="selectReporte" class="form-label">Seleccione un Reporte:</label>
                    <select id="selectReporte" class="form-select" onchange="cargarVistaPrevia()">
                        <option value="" disabled selected>Elija una opcion...</option>
                    </select>
                </div>
                <div class="col-md-8 d-flex align-items-end">
                    <button id="btnExportar" class="btn btn-success d-none" onclick="descargarExcel()">
                        <i class="bi bi-file-earmark-excel"></i> Descargar Excel
                    </button>
                </div>
            </div>
        
            <!-- Vista Previa de la Tabla -->
            <div class="card">
                <div class="card-header">
                    Vista Previa de Datos
                </div>
                <div class="contenedor-scroll shadow-sm">
                    <table class="table table-bordered table-striped mb-0 text-center" 
                    style="min-width: 1000px;" id="tablaReporte">
                        <thead class="bg-primary">
                            <tr id="tablaCabecera">
                                <!-- Las columnas se generarán por JS -->
                            </tr>
                        </thead>
                        <tbody id="tablaCuerpo">
                            <!-- Los datos se generarán por JS -->
                        </tbody>
        
                    </table>
                </div>
            </div>
        </div>
      </td>
    </tr>
  </table>
</form>