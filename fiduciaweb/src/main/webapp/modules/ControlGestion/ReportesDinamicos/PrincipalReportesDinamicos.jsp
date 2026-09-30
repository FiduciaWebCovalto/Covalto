<form name="frmDatosOperacionesNoExistentes" id="frmDatosOperacionesNoExistentes" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Reportes Dinamicos</td>
    </tr>
    <tr>
      <td height="100%">
           <!-- Botón para nuevo reporte -->
    <button class="btn btn-primary" onclick="nuevoReporte()">Alta</button>
    <button class="btn btn-warning" onclick="cargarReportes()">Aceptar</button>
    <!-- Tabla de Reportes -->
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Descripcion</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody id="tablaReportes">
            <!-- Los datos se llenan mediante JS -->
        </tbody>
    </table>

    <!-- Modal para Edición/Creación -->
    <div class="modal fade" id="modalReporte" tabindex="-1">
        <div  class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Configurar Reporte</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                </div>
                <div class="modal-body">
                    <form id="formReporte" novalidate>
                        <input type="hidden" id="idReporte">
                        <div class="mb-3">
                            <label class="form-label" id="labelnombre" for="nombre">Nombre del Reporte</label>
                            <input type="text" class="form-control" id="nombre" required>
                        </div>
                        <div class="mb-3">
                            <label class="form-label" id="labeldescripcion" for="descripcion">Descripcion</label>
                            <input type="text" class="form-control" id="descripcion" name="descripcion">
                        </div>
                        <div class="mb-3">
                            <label class="form-label" id="labelquerybase" for="queryBase">Query Base (SQL para Oracle)</label>
                            <textarea class="form-control" id="queryBase" name="queryBase" required></textarea>
                        </div>

                        <hr>
                        <h5>Columnas del Reporte</h5>
                        <button type="button" class="btn btn-secondary btn-sm mb-2" onclick="agregarFilaColumna()">+ Agregar Columna</button>
                        <table class="table table-sm">
                            <thead>
                                <tr>
                                    <th>Columna DB</th>
                                    <th>Alias Visual</th>
                                    <th>Es Filtro?</th>
                                    <th>Tipo Filtro</th>
                                    <th>Orden</th>
                                    <th>Acción</th>
                                </tr>
                            </thead>
                            <tbody id="contenedorColumnas">
                                <!-- Filas de columnas generadas dinámicamente -->
                            </tbody>
                        </table>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                    <button type="button" class="btn btn-success" onclick="guardarReporte()">Guardar</button>
                </div>
            </div>
        </div>
    </div>
      </td>
    </tr>
  </table>
</form>
