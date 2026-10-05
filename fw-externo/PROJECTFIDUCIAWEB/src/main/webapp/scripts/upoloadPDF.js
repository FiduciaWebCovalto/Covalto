
        async function uploadFile() {          
            const fileInput = document.getElementById('pdfFile');
            const statusMessage = document.getElementById('statusMessage');
            const submitBtn = document.getElementById('btnEnviar');
            const token = localStorage.getItem('token'); 
            const usuario = localStorage.getItem('usuario'); 
             var id = '<%= Folio %>'; 
            // 1. Recuperar credenciales del almacenamiento local

            if (fileInput.files.length === 0) return;

            // Crear FormData para enviar archivos vía AJAX
            const formData = new FormData();
            formData.append('file', fileInput.files[0]);
            formData.append('id', id);
            formData.append('usuario', usuario);
            formData.append('token', token);


            statusMessage.innerHTML = '<div class="alert alert-info">Subiendo...</div>';

            try {

                const response = await 
                fetch('uploadServlet', {
                method: 'POST',
                body: formData
                });
                
                const result = await response.json();
                console.log('Respuesta del Servlet:', result);

                if (result=="200") {                    
                    statusMessage.innerHTML = 'Archivo subido con éxito!';
                    statusMessage.style.color = 'green';

                    // Habilitar el botón de submit final
                    submitBtn.disabled = false;
                } else if (result=="800")
                {
                    statusMessage.innerHTML = 'El archivo ya se subio';
                    statusMessage.style.color = 'red';
                }
                 else {
                    //throw new Error('Error en el servidor');
                    submitBtn.disabled = true;
                }            
            } catch (error) {
                statusMessage.innerHTML = 'Error al subir el archivo.';
                statusMessage.style.color = 'red';
            }

        }