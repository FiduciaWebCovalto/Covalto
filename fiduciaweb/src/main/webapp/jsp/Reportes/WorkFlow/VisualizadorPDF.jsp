<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Visualizador PDF</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <!-- SweetAlert2 -->
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <!-- PDF.js (Local con fallback a CDN) -->
    <script src="${pageContext.request.contextPath}/js/pdfjs/pdf.min.js"></script>
    <script>
        if (typeof pdfjsLib === 'undefined') {
            document.write('<script src="https://cdnjs.cloudflare.com/ajax/libs/pdf.js/3.11.174/pdf.min.js"><\/script>');
        }
    </script>
    <style>
        body {
            background-color: #323639;
        }
        .modal-content {
            height: 92vh;
            max-height: 92vh;
            display: flex;
            flex-direction: column;
            border-radius: 8px;
            overflow: hidden;
            background-color: #323639;
        }
        .modal-body {
            position: relative;
            background-color: #525659;
            padding: 0;
            flex: 1 1 auto;
            display: flex;
            flex-direction: column;
            overflow: hidden;
        }
        .pdf-toolbar {
            background-color: #323639;
            color: #f1f1f1;
            padding: 6px 14px;
            display: flex;
            align-items: center;
            justify-content: space-between;
            flex-wrap: wrap;
            gap: 10px;
            border-bottom: 1px solid rgba(255, 255, 255, 0.12);
            z-index: 10;
        }
        .pdf-toolbar .btn {
            color: #e0e0e0;
            border-color: rgba(255, 255, 255, 0.25);
            padding: 3px 10px;
            font-size: 0.82rem;
            transition: all 0.2s ease;
        }
        .pdf-toolbar .btn:hover {
            background-color: rgba(255, 255, 255, 0.18);
            color: #fff;
            border-color: rgba(255, 255, 255, 0.4);
        }
        .pdf-toolbar .btn-primary {
            background-color: #0d6efd;
            border-color: #0d6efd;
            color: #fff;
        }
        .pdf-toolbar .btn-primary:hover {
            background-color: #0b5ed7;
            border-color: #0a58ca;
        }
        .pdf-scroll-container {
            flex: 1 1 auto;
            overflow-y: auto;
            overflow-x: auto;
            padding: 20px 10px;
            display: flex;
            flex-direction: column;
            align-items: center;
            background-color: #525659;
        }
        .pdf-page-wrapper {
            background-color: #fff;
            box-shadow: 0 4px 14px rgba(0, 0, 0, 0.4);
            margin-bottom: 20px;
            display: inline-block;
            border-radius: 3px;
            transition: transform 0.2s ease;
        }
        .pdf-canvas {
            display: block;
        }
        .modal-overlay {
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            z-index: 25;
        }
        #loadingIndicator {
            background-color: #525659;
        }
        #errorIndicator {
            background-color: rgba(33, 37, 41, 0.96);
            z-index: 30;
        }
        .badge-nav {
            font-size: 0.85rem;
            color: #ddd;
            font-weight: 500;
        }
    </style>
</head>
<body>

    <div class="container-fluid p-0">
        <!-- Modal Bootstrap para visualizacion de PDF -->
        <div class="modal fade" id="pdfModal" tabindex="-1" aria-labelledby="modalTitle" aria-hidden="true" data-bs-backdrop="static">
            <div class="modal-dialog modal-xl modal-dialog-centered">
                <div class="modal-content shadow-lg border-0">
                    <div class="modal-header bg-dark text-white py-2 border-secondary flex-shrink-0">
                        <h5 class="modal-title fs-6 text-truncate d-flex align-items-center gap-2" id="modalTitle">
                            <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" class="bi bi-file-earmark-pdf text-danger" viewBox="0 0 16 16">
                                <path d="M14 14V4.5L9.5 0H4a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2zM9.5 3A1.5 1.5 0 0 0 11 4.5h2V14a1 1 0 0 1-1 1H4a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h5.5v2z"/>
                                <path d="M4.603 14.087a.81.81 0 0 1-.438-.42c-.195-.388-.13-.776.08-1.157.26-.47.66-.757 1.155-.865.378-.083.74-.08 1.108.006.184.043.342.12.473.23.238.2.333.456.287.755-.052.338-.285.578-.696.72-.45.155-.953.18-1.469.071-.166-.035-.332-.09-.5-.16z"/>
                            </svg>
                            <span>Vista Previa de Documento</span>
                        </h5>
                        <button type="button" class="btn-close btn-close-white" onclick="cerrarVentana()" aria-label="Cerrar" title="Cerrar ventana"></button>
                    </div>

                    <div class="modal-body">
                        <!-- Barra de Herramientas del Visor PDF -->
                        <div id="viewerControls" class="pdf-toolbar d-none flex-shrink-0">
                            <!-- Navegacion de Paginas -->
                            <div class="d-flex align-items-center gap-1">
                                <button type="button" class="btn btn-sm btn-outline-light" onclick="prevPage()" title="Pagina anterior">
                                    &lt;
                                </button>
                                <span class="badge-nav mx-1">
                                    Pagina <span id="currentPageLabel">1</span> de <span id="totalPagesLabel">1</span>
                                </span>
                                <button type="button" class="btn btn-sm btn-outline-light" onclick="nextPage()" title="Pagina siguiente">
                                    &gt;
                                </button>
                            </div>

                            <!-- Controles de Zoom -->
                            <div class="d-flex align-items-center gap-1">
                                <button type="button" class="btn btn-sm btn-outline-light" onclick="zoomOut()" title="Reducir zoom">
                                    -
                                </button>
                                <span id="zoomPercentLabel" class="badge-nav mx-1" style="min-width: 44px; text-align: center;">125%</span>
                                <button type="button" class="btn btn-sm btn-outline-light" onclick="zoomIn()" title="Aumentar zoom">
                                    +
                                </button>
                                <button type="button" class="btn btn-sm btn-outline-light ms-1" onclick="fitWidth()" title="Ajustar al ancho">
                                    Ajustar Ancho
                                </button>
                                <button type="button" class="btn btn-sm btn-outline-light" onclick="resetZoom()" title="Restablecer escala a 100%">
                                    100%
                                </button>
                            </div>

                            <!-- Acciones: Imprimir, Pestana, Descargar, Cerrar -->
                            <div class="d-flex align-items-center gap-2">
                                <button type="button" class="btn btn-sm btn-outline-light" onclick="printPdf()" title="Imprimir documento">
                                    Imprimir
                                </button>
                                <a id="btnOpenNewTab" href="#" target="_blank" class="btn btn-sm btn-outline-light" title="Abrir en pestana nueva">
                                    Abrir pestana
                                </a>
                                <a id="btnDownload" href="#" download="documento.pdf" class="btn btn-sm btn-primary" title="Descargar archivo PDF">
                                    Descargar
                                </a>
                                <button type="button" class="btn btn-sm btn-outline-danger" onclick="cerrarVentana()" title="Cerrar ventana">
                                    Cerrar
                                </button>
                            </div>
                        </div>

                        <!-- Contenedor scrollable con las paginas en Canvas -->
                        <div id="pdfScrollContainer" class="pdf-scroll-container">
                            <div id="pdfCanvasContainer" class="d-flex flex-column align-items-center"></div>
                        </div>

                        <!-- Spinner de Carga (Overlay absoluto) -->
                        <div id="loadingIndicator" class="modal-overlay text-center text-white py-5">
                            <div class="spinner-border text-light mb-3" role="status" style="width: 3.2rem; height: 3.2rem;">
                                <span class="visually-hidden">Cargando...</span>
                            </div>
                            <h6 id="loadingTitle" class="fw-semibold mb-1">Cargando documento PDF...</h6>
                            <p class="fs-6 mb-0 text-white-50">Por favor espere mientras se procesa la vista previa.</p>
                        </div>

                        <!-- Indicador de Error (Overlay absoluto) -->
                        <div id="errorIndicator" class="modal-overlay d-none">
                            <div class="card border-danger shadow-lg p-4 text-center bg-white" style="max-width: 90%; width: 460px;">
                                <div class="text-danger mb-3">
                                    <svg xmlns="http://www.w3.org/2000/svg" width="48" height="48" fill="currentColor" class="bi bi-exclamation-triangle" viewBox="0 0 16 16">
                                        <path d="M7.938 2.016A.13.13 0 0 1 8.002 2a.13.13 0 0 1 .063.016.146.146 0 0 1 .054.057l6.857 11.667c.036.06.035.124.002.183a.163.163 0 0 1-.054.06.145.145 0 0 1-.066.017H1.146a.145.145 0 0 1-.066-.017.163.163 0 0 1-.054-.06.176.176 0 0 1 .002-.183L7.884 2.073a.147.147 0 0 1 .054-.057zm1.044-.45a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566z"/>
                                        <path d="M7.002 12a1 1 0 1 1 2 0 1 1 0 0 1-2 0zM7.1 5.995a.905.905 0 1 1 1.8 0l-.35 3.507a.552.552 0 0 1-1.1 0z"/>
                                    </svg>
                                </div>
                                <h5 class="text-danger fw-bold mb-2">No se pudo cargar el documento</h5>
                                <p id="errorMessage" class="text-muted mb-4 fs-6">Ocurrio un error al consultar el archivo.</p>
                                <div class="d-flex justify-content-center gap-2">
                                    <button type="button" class="btn btn-outline-danger px-4" onclick="loadPdf()">Reintentar</button>
                                    <button type="button" class="btn btn-secondary px-4" onclick="cerrarVentana()">Cerrar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Iframe oculto para impresion limpia -->
    <iframe id="printFrame" style="display:none; width:0; height:0; border:none;" src="about:blank"></iframe>

    <!-- Bootstrap Bundle con Popper -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>

    <script>
        // Configuracion del Worker de PDF.js
        const contextPath = '${pageContext.request.contextPath}' || '';
        if (typeof pdfjsLib !== 'undefined') {
            try {
                pdfjsLib.GlobalWorkerOptions.workerSrc = (contextPath ? contextPath : '') + '/js/pdfjs/pdf.worker.min.js';
            } catch (_) {
                pdfjsLib.GlobalWorkerOptions.workerSrc = 'https://cdnjs.cloudflare.com/ajax/libs/pdf.js/3.11.174/pdf.worker.min.js';
            }
        }

        let currentBlobUrl = null;
        let pdfModalInstance = null;
        let pdfDoc = null;
        let totalPages = 0;
        let currentScale = 1.25;
        let renderedPages = new Set();
        let currentRawData = null;
        let currentCleanFileName = 'documento.pdf';

        window.onload = function() {
            const modalEl = document.getElementById('pdfModal');
            pdfModalInstance = new bootstrap.Modal(modalEl);

            // Al cerrar el modal, invocar el cierre de la ventana/pestana
            modalEl.addEventListener('hidden.bs.modal', function () {
                cerrarVentana();
            });

            // Detectar pagina visible durante el scroll
            const scrollContainer = document.getElementById('pdfScrollContainer');
            scrollContainer.addEventListener('scroll', handleScrollUpdate);

            loadPdf();
        };

        /**
         * Cierra la ventana o pestana del navegador y libera los recursos del visor.
         */
        function cerrarVentana() {
            cleanupPdf();
            try {
                window.close();
            } catch (_) {}
            try {
                window.open('', '_self', '');
                window.close();
            } catch (_) {}
            setTimeout(function() {
                if (!window.closed && window.history.length > 1) {
                    window.history.back();
                }
            }, 250);
        }

        /**
         * Limpia y garantiza que el nombre del PDF no tenga extensiones duplicadas (.pdf.pdf).
         */
        function cleanPdfFileName(name, defaultName) {
            if (!name || typeof name !== 'string') {
                return defaultName || 'documento.pdf';
            }
            let clean = name.trim().replace(/^["']|["']$/g, '').trim();
            while (clean.toLowerCase().endsWith('.pdf.pdf')) {
                clean = clean.substring(0, clean.length - 4);
            }
            if (!clean.toLowerCase().endsWith('.pdf')) {
                clean = clean + '.pdf';
            }
            return clean;
        }

        function cleanupPdf() {
            if (currentBlobUrl) {
                URL.revokeObjectURL(currentBlobUrl);
                currentBlobUrl = null;
            }
            pdfDoc = null;
            totalPages = 0;
            currentRawData = null;
            renderedPages.clear();

            const container = document.getElementById('pdfCanvasContainer');
            if (container) {
                container.innerHTML = '';
            }
            const controls = document.getElementById('viewerControls');
            if (controls) {
                controls.classList.add('d-none');
            }
            const btnDownload = document.getElementById('btnDownload');
            if (btnDownload) {
                btnDownload.removeAttribute('href');
            }
            const btnOpenNewTab = document.getElementById('btnOpenNewTab');
            if (btnOpenNewTab) {
                btnOpenNewTab.removeAttribute('href');
            }
            const printFrame = document.getElementById('printFrame');
            if (printFrame) {
                printFrame.src = 'about:blank';
            }
        }

        function loadPdf() {
            const parametros = new URLSearchParams(window.location.search);

            const id = parametros.get('folio') || parametros.get('id');
            const id2 = parametros.get('id2') || parametros.get('fiso');
            const id3 = parametros.get('id3') || parametros.get('persona');
            const opcion = parametros.get('opcion') || parametros.get('caso') || (id2 != null ? "2" : "1");

            const token = localStorage.getItem('token');
            const usuario = localStorage.getItem('usuario');

            console.log("VisualizadorPDF - Parametros:", { id, id2, id3, opcion, usuario });

            // Mostrar el modal
            if (pdfModalInstance) {
                pdfModalInstance.show();
            }

            const loadingEl = document.getElementById('loadingIndicator');
            const errorEl = document.getElementById('errorIndicator');
            const titleEl = document.getElementById('modalTitle');
            const loadingTitle = document.getElementById('loadingTitle');

            // Resetear estados visuales
            loadingEl.classList.remove('d-none');
            errorEl.classList.add('d-none');
            cleanupPdf();

            if (!id || id.trim() === '') {
                showError("No se proporciono el numero de folio o identificador del documento.");
                return;
            }

            const displayLabel = (opcion === "2") 
                ? "Contrato " + (id2 ? id2 : id) 
                : "Documento " + id;

            titleEl.querySelector('span').textContent = "Cargando " + displayLabel + "...";
            loadingTitle.textContent = "Cargando " + displayLabel + "...";

            // Preparar parametros para PdfConsumer
            const datos = {
                param1: opcion,
                param2: id.trim(),
                param3: id2 ? id2.trim() : "",
                param4: id3 ? id3.trim() : "",
                param5: token ? token.trim() : "",
                param6: usuario ? usuario.trim() : ""
            };

            const params = new URLSearchParams();
            Object.keys(datos).forEach(key => params.append(key, datos[key]));

            fetch('PdfConsumer', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded',
                    'Accept': 'application/pdf, application/json, */*'
                },
                body: params
            })
            .then(async response => {
                if (!response.ok) {
                    let detalleError = "Error al descargar el PDF (HTTP " + response.status + ")";
                    try {
                        const errJson = await response.json();
                        if (errJson.message) {
                            detalleError = errJson.message;
                        } else if (errJson.error) {
                            detalleError = errJson.error;
                        }
                    } catch (_) {
                        try {
                            const errTxt = await response.text();
                            if (errTxt && errTxt.trim().length > 0 && !errTxt.startsWith("<!DOCTYPE")) {
                                detalleError = errTxt.trim();
                            }
                        } catch (__) {}
                    }
                    throw new Error(detalleError);
                }

                // Extraer nombre de archivo y limpiarlo de duplicaciones
                let defaultFileName = (opcion === "2") ? "Contrato_" + (id2 || id) + ".pdf" : "Documento_" + id + ".pdf";
                let fileName = defaultFileName;
                const disposition = response.headers.get('Content-Disposition') || response.headers.get('content-disposition');
                if (disposition) {
                    const match = /filename\*?=['"]?(?:UTF-8'')?([^;\r\n"']+)['"]?/i.exec(disposition);
                    if (match && match[1]) {
                        fileName = match[1].trim();
                    }
                }
                fileName = cleanPdfFileName(fileName, defaultFileName);
                currentCleanFileName = fileName;

                // Extraer bytes como ArrayBuffer
                const arrayBuffer = await response.arrayBuffer();
                return { arrayBuffer, fileName };
            })
            .then(async ({ arrayBuffer, fileName }) => {
                currentRawData = arrayBuffer;

                // Crear Blob y URL local para descarga / impresion
                const pdfBlob = new Blob([arrayBuffer], { type: 'application/pdf' });
                currentBlobUrl = URL.createObjectURL(pdfBlob);

                // Configurar botones de accion
                const btnDownload = document.getElementById('btnDownload');
                btnDownload.href = currentBlobUrl;
                btnDownload.download = fileName;

                const btnOpenNewTab = document.getElementById('btnOpenNewTab');
                btnOpenNewTab.href = currentBlobUrl;

                titleEl.querySelector('span').textContent = "Vista Previa: " + fileName;

                // Renderizar documento usando PDF.js (HTML5 Canvas nativo)
                if (typeof pdfjsLib !== 'undefined') {
                    await renderWithPdfJs(arrayBuffer);
                } else {
                    console.warn("PDF.js no disponible, ejecutando visor nativo en cascada.");
                    fallbackToNativeViewer(currentBlobUrl, fileName);
                }
            })
            .catch(error => {
                console.error("Error al procesar PDF:", error);
                showError(error.message || "No se pudo recuperar el archivo PDF.");
            });
        }

        /**
         * Renderiza el PDF utilizando Mozilla PDF.js en elementos HTML5 Canvas.
         * Garantiza compatibilidad 100% independiente de las politicas o plugins del navegador.
         */
        async function renderWithPdfJs(arrayBuffer) {
            try {
                const loadingTask = pdfjsLib.getDocument({ data: arrayBuffer });
                pdfDoc = await loadingTask.promise;
                totalPages = pdfDoc.numPages;

                document.getElementById('totalPagesLabel').textContent = totalPages;
                document.getElementById('currentPageLabel').textContent = '1';
                document.getElementById('zoomPercentLabel').textContent = Math.round(currentScale * 100) + '%';
                document.getElementById('viewerControls').classList.remove('d-none');

                const container = document.getElementById('pdfCanvasContainer');
                container.innerHTML = '';
                renderedPages.clear();

                // Construir contenedores de todas las paginas
                for (let num = 1; num <= totalPages; num++) {
                    const pageDiv = document.createElement('div');
                    pageDiv.className = 'pdf-page-wrapper';
                    pageDiv.id = 'page-' + num;

                    const canvas = document.createElement('canvas');
                    canvas.className = 'pdf-canvas';
                    canvas.id = 'canvas-' + num;

                    pageDiv.appendChild(canvas);
                    container.appendChild(pageDiv);
                }

                // Renderizar inmediatamente la primera pagina y ocultar spinner
                await renderPage(1);
                document.getElementById('loadingIndicator').classList.add('d-none');

                // Renderizar las siguientes paginas en segundo plano
                for (let num = 2; num <= totalPages; num++) {
                    await renderPage(num);
                }

            } catch (err) {
                console.error("Fallo al renderizar con PDF.js, intentando visor nativo:", err);
                fallbackToNativeViewer(currentBlobUrl, currentCleanFileName);
            }
        }

        /**
         * Renderiza una pagina especifica en su canvas correspondiente.
         */
        async function renderPage(num) {
            if (!pdfDoc) return;
            const page = await pdfDoc.getPage(num);
            const canvas = document.getElementById('canvas-' + num);
            if (!canvas) return;

            const context = canvas.getContext('2d');
            const viewport = page.getViewport({ scale: currentScale });

            // Soporte para pantallas HiDPI / Retina
            const outputScale = window.devicePixelRatio || 1;
            canvas.width = Math.floor(viewport.width * outputScale);
            canvas.height = Math.floor(viewport.height * outputScale);
            canvas.style.width = Math.floor(viewport.width) + 'px';
            canvas.style.height = Math.floor(viewport.height) + 'px';

            const transform = (outputScale !== 1) ? [outputScale, 0, 0, outputScale, 0, 0] : null;

            const renderContext = {
                canvasContext: context,
                transform: transform,
                viewport: viewport
            };

            await page.render(renderContext).promise;
            renderedPages.add(num);
        }

        /**
         * Visor nativo en caso de falla extrema de PDF.js.
         */
        function fallbackToNativeViewer(blobUrl, fileName) {
            const container = document.getElementById('pdfCanvasContainer');
            if (!container) return;

            document.getElementById('viewerControls').classList.remove('d-none');
            container.innerHTML = `
                <object data="${blobUrl}" type="application/pdf" style="width: 100%; height: 78vh; border: none;">
                    <embed src="${blobUrl}" type="application/pdf" style="width: 100%; height: 78vh; border: none;" />
                    <iframe src="${blobUrl}" style="width: 100%; height: 78vh; border: none;">
                        <div class="d-flex flex-column align-items-center justify-content-center h-100 text-white p-4 text-center">
                            <p class="fs-5 mb-3">Tu navegador no soporta la visualización incrustada de este archivo.</p>
                            <a href="${blobUrl}" download="${fileName}" class="btn btn-primary">Descargar Documento</a>
                        </div>
                    </iframe>
                </object>
            `;
            document.getElementById('loadingIndicator').classList.add('d-none');
        }

        // ==========================================
        // Controles de Navegacion y Zoom
        // ==========================================

        function zoomIn() {
            if (currentScale >= 3.0) return;
            currentScale = Math.round((currentScale + 0.25) * 100) / 100;
            updateZoomDisplay();
            reRenderAllPages();
        }

        function zoomOut() {
            if (currentScale <= 0.5) return;
            currentScale = Math.round((currentScale - 0.25) * 100) / 100;
            updateZoomDisplay();
            reRenderAllPages();
        }

        function resetZoom() {
            currentScale = 1.0;
            updateZoomDisplay();
            reRenderAllPages();
        }

        async function fitWidth() {
            if (!pdfDoc) return;
            try {
                const page = await pdfDoc.getPage(1);
                const container = document.getElementById('pdfScrollContainer');
                const availableWidth = container.clientWidth - 50;
                const unscaled = page.getViewport({ scale: 1.0 });
                currentScale = Math.round((availableWidth / unscaled.width) * 100) / 100;
                if (currentScale < 0.5) currentScale = 0.5;
                if (currentScale > 3.0) currentScale = 3.0;
                updateZoomDisplay();
                reRenderAllPages();
            } catch (e) {
                console.error("Error en fitWidth:", e);
            }
        }

        function updateZoomDisplay() {
            const label = document.getElementById('zoomPercentLabel');
            if (label) {
                label.textContent = Math.round(currentScale * 100) + '%';
            }
        }

        async function reRenderAllPages() {
            if (!pdfDoc) return;
            for (let num = 1; num <= totalPages; num++) {
                await renderPage(num);
            }
        }

        function prevPage() {
            const current = getCurrentVisiblePage();
            if (current > 1) {
                scrollToPage(current - 1);
            }
        }

        function nextPage() {
            const current = getCurrentVisiblePage();
            if (current < totalPages) {
                scrollToPage(current + 1);
            }
        }

        function scrollToPage(num) {
            const pageEl = document.getElementById('page-' + num);
            if (pageEl) {
                pageEl.scrollIntoView({ behavior: 'smooth', block: 'start' });
                document.getElementById('currentPageLabel').textContent = num;
            }
        }

        function getCurrentVisiblePage() {
            const container = document.getElementById('pdfScrollContainer');
            const pages = container.querySelectorAll('.pdf-page-wrapper');
            for (let i = 0; i < pages.length; i++) {
                const rect = pages[i].getBoundingClientRect();
                if (rect.top <= 250 && rect.bottom >= 150) {
                    return (i + 1);
                }
            }
            return 1;
        }

        function handleScrollUpdate() {
            if (!pdfDoc) return;
            const current = getCurrentVisiblePage();
            const label = document.getElementById('currentPageLabel');
            if (label && label.textContent !== String(current)) {
                label.textContent = current;
            }
        }

        function printPdf() {
            if (!currentBlobUrl) return;
            const printFrame = document.getElementById('printFrame');
            if (printFrame) {
                printFrame.src = currentBlobUrl;
                printFrame.onload = function() {
                    try {
                        printFrame.contentWindow.focus();
                        printFrame.contentWindow.print();
                    } catch (_) {
                        window.open(currentBlobUrl, '_blank');
                    }
                };
            } else {
                window.open(currentBlobUrl, '_blank');
            }
        }

        function showError(mensaje) {
            const loadingEl = document.getElementById('loadingIndicator');
            if (loadingEl) loadingEl.classList.add('d-none');
            const controls = document.getElementById('viewerControls');
            if (controls) controls.classList.add('d-none');
            const container = document.getElementById('pdfCanvasContainer');
            if (container) container.innerHTML = '';
            const errorEl = document.getElementById('errorIndicator');
            if (errorEl) errorEl.classList.remove('d-none');
            document.getElementById('errorMessage').textContent = mensaje;
            document.getElementById('modalTitle').querySelector('span').textContent = "Error al Cargar Documento";

            if (typeof Swal !== 'undefined') {
                Swal.fire({
                    icon: 'warning',
                    title: 'Atención',
                    text: mensaje,
                    confirmButtonColor: '#3085d6',
                    confirmButtonText: 'Aceptar'
                });
            }
        }
    </script>
</body>
</html>
