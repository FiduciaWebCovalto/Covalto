<!-- CartaAceptacion.jsp-->
<!-- 01/Dic/2018 EAC - Creacion de archivo dummy -->
<%@ page contentType="text/html; charset=UTF-8" %>

<%
java.util.List consulta = (java.util.List)request.getAttribute("consulta");
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Reporte para Validar WorkFlow</title>
    <!-- Bootstrap CSS -->
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">    

</head>
<body>
   <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        
<script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js"></script>

    <h2>Informacion del Fideicomiso <%=request.getParameter("Fideicomiso")%></h2>
    <!-- Contenedor de la tabla -->
    <div id="table-container" class="table-responsive"></div>

    <!-- jQuery y Bootstrap Bundle -->
 <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        

    
    <script>
    // 3. Cargar el Servlet automáticamente al cargar la página
    window.onload = function() {
                const parametros = new URLSearchParams(window.location.search);
                var Headers = [""];
                var id=parametros.get('opcion');
                // 2. Recuperar el valor de un parámetro específico
                const fiso = parametros.get('Fideicomiso');     
                console.log("fiso"+fiso);
                switch (id) {
                case "2":
                    Headers = ["Personalidad", "Nombre", "Tipo"];
                    recInformacion("1", fiso,Headers,"Fideicomitentes");
                    recInformacion("2", fiso,Headers,"Fideicomisarios");
                    recInformacion("3", fiso,Headers,"Terceros");
                    break;
                case "1":
                    Headers = ["Folio", "Fecha", "Tipo","Importe"];
                    recInformacion("4", fiso,Headers,"Historico de Movimientos");
                    break;                    
                case "3":
                    Headers = [ "Fecha", "Nombre","Finalidad"];
                    recInformacion("5", fiso,Headers,"Comite Tecnico");
                    break;                    

                default:
                    console.log("opcion no valida");
                }
                
    };
    function recInformacion(opcion, fiso,Headers,Titulo){
            const datos = {
            param1: opcion,
            param2: fiso
            };
            const params = new URLSearchParams();
            Object.keys(datos).forEach(key => params.append(key, datos[key]))
            fetch('proceso', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded',
                },
                body: params
            })
            .then(response => response.text()) // Convertir respuesta a texto
            .then(data => {
                    creatabla(data,Headers,Titulo);
            })
            .catch(error => console.error('Error:', error));     
    }
    function creatabla(data,Headers,Titulo){
        // Actualizar la página sin recargar
        const dataArreglada = JSON.parse(data);
        console.log(dataArreglada);
        const container = document.getElementById('table-container');
        
        // Crear elemento tabla con clases de Bootstrap
        const table = document.createElement('table');
        table.className = 'table table-striped table-bordered table-hover';

        // 2. Crear el caption dinámicamente
        let caption = table.createCaption();
        caption.textContent = Titulo;
        caption.style.fontWeight = 'bold'; // Opcional: estilizar        
        // --- A. Crear Header (thead) ---
        const thead = document.createElement('thead');
        thead.classList.add('table-info'); // Estilo oscuro para el header
        const headerRow = document.createElement('tr');
        
        Headers.forEach(headerText => {
        const th = document.createElement('th');
        th.innerText = headerText;
        headerRow.appendChild(th);
        });
        thead.appendChild(headerRow);
        table.appendChild(thead);                
        
        const tbody = document.createElement('tbody');
        dataArreglada.forEach(filaString => {
            // 3. Hacer split en cada elemento
            console.log("filaString: "+filaString);
            const datosDivididos = filaString.split("-");
            
            // 4. Crear una fila de tabla (<tr>)
            const tr = document.createElement('tr');
        
            // 5. Crear celdas (<td>) y nuevas columnas
            datosDivididos.forEach(dato => {
                console.log("dato: "+dato);
                const td = document.createElement('td');
                td.textContent = dato; // Insertar el dato dividido
                tr.appendChild(td);
            });
            console.log("agrega tbdy");
            // 6. Añadir la fila completa al cuerpo de la tabla
            tbody.appendChild(tr);
        });
        console.log("agrega table");
        table.appendChild(tbody);
        console.log("agrega container");
        // Agregar tabla al contenedor
        container.appendChild(table);
    }
</script>

</body>
</html>