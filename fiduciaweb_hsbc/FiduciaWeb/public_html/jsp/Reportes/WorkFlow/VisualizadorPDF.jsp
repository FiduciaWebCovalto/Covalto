<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Visualizador PDF</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">    
</head>
<body>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        
<script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js"></script>

<div class="container mt-5">
    <!-- Modal Bootstrap -->
    <div class="modal fade" id="pdfModal" tabindex="-1">
        <div class="modal-dialog modal-xl">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Vista Previa</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                </div>
                <div class="modal-body">
                    <iframe id="pdfFrame" src="" style="width:100%; height:80vh;" frameborder="0"></iframe>
                </div>
            </div>
        </div>
    </div>
</div>
    <!-- jQuery y Bootstrap Bundle -->
 <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        

    
<script>
window.onload = function() {
        const parametros = new URLSearchParams(window.location.search);
        var id=parametros.get('folio');
        var id2=parametros.get('id2');
        var id3=parametros.get('id3');
        var opcion=(id2!=null?"2":"1");
        const token = localStorage.getItem('token'); 
        const usuario = localStorage.getItem('usuario');        
        console.log("id: "+id)
        console.log("id2: "+id2)
        console.log("id3: "+id3)
        console.log("token: "+token)
        console.log("usuario: "+usuario)
        if(!id) return;
        
        // Llamar a nuestro Servlet pasándole el ID
            const datos = {
            param1: opcion,
            param2: id,
            param3: id2,
            param4: id3,
            param5: token,
            param6: usuario
            };
            const params = new URLSearchParams();
            Object.keys(datos).forEach(key => params.append(key, datos[key]))
            fetch('PdfConsumer', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded',
                },
                body: params
            })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Error al descargar el PDF');
                }
                // PASO CLAVE: Convertir la respuesta a un Blob (binary large object)
                return response.blob(); 
                })
            .then(blob => {
                //console.log("blob: "+response)
                // Crear una URL local a partir del Blob
                const blobUrl = URL.createObjectURL(blob);
                
                document.getElementById('pdfFrame').src =blobUrl;
                
                // Opcional: Liberar memoria al terminar
                // iframe.onload = () => URL.revokeObjectURL(blobUrl);
                })
            .catch(error => {
                console.error('Error:', error);
                Swal.fire('warning', 'No se puedo cargar el PDF.', 'warning')
                });
        
/*        var pdfUrl = '/PdfConsumer?id=' + id;
        document.getElementById('pdfFrame').src = pdfUrl;
*/        
        // Mostrar Modal
        var myModal = new bootstrap.Modal(document.getElementById('pdfModal'));
        myModal.show();
}
    function loadPdf() {
    }
</script>
</body>
</html>