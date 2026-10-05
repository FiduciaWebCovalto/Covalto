async function uploadFile() {

            const fileInput = document.getElementById('pdfFile');
            const statusMessage = document.getElementById('statusMessage');
            const submitBtn = document.getElementById('btnEnviar');

            if (fileInput.files.length === 0) return;

            // Crear FormData para enviar archivos vía AJAX
            const formData = new FormData();
            formData.append('pdfFile', fileInput.files[0]);

            statusMessage.innerHTML = '<div class="alert alert-info">Subiendo...</div>';

            try {
                // Invocación al Servlet usando Fetch API
                const response = await fetch('UploadServlet', {
                    method: 'POST',
                    body: formData
                });

                if (response.ok) {
                    const result = await response.json();
                    statusMessage.innerHTML = 'Archivo subido con éxito: ' + result.fileName;
                    statusMessage.style.color = 'green';

                    // Habilitar el botón de submit final
                    submitBtn.disabled = false;
                    document.getElementById('hiddenPdfName').value = result.fileName;
                } else {
                    throw new Error('Error en el servidor');
                    submitBtn.disabled = true;
                }
            } catch (error) {
                status.innerHTML = 'Error al subir el archivo.';
                status.style.color = 'red';
                console.error(error);
            }

}