/*REPORTES DINAMICOS*/
var API_URL_REPDIN = `${window.API_BASE_URL}/api/reportes`;
var BEARER_TOKEN_REPDIN = localStorage.getItem('token');
        // Cargar lista de reportes al iniciar
        document.getElementById('btnUpload').addEventListener('click', function(event) {
            event.preventDefault();
            CargaReportes();
        });
        
document.addEventListener('DOMContentLoaded', async () => {
    try {
        await CargaReportes(); // Ejecuta tu función asíncrona
    } catch (error) {
        console.error('Error al cargar los reportes:', error);
    }
});
        
        async function CargaReportes() {  
            try {
                const response = await fetch(`${API_URL_REPDIN}`, {
                method: 'GET',
                headers: {
                'Authorization': `Bearer ${BEARER_TOKEN_REPDIN}`,
                'Content-Type': 'application/json'
                }
                });
                
                const reportes = await response.json();
                const select = document.getElementById('selectReporte');
                reportes.forEach(rep => {
                    const option = document.createElement('option');
                    option.value = rep.idReporte;
                    option.textContent = rep.nombre;
                    select.appendChild(option);
                });
            } catch (error) {
                console.error("Error cargando reportes:", error);
            }
        }
        // Cargar datos y columnas del reporte seleccionado
        async function cargarVistaPrevia() {
            const idReporte = document.getElementById('selectReporte').value;
            if (!idReporte) return;

            try {
                const response = await fetch(`${API_URL_REPDIN}/ejecutar/${idReporte}`, {
                method: 'GET',
                headers: {
                'Authorization': `Bearer ${BEARER_TOKEN_REPDIN}`,
                'Content-Type': 'application/json'
                }
                });                
                const data = await response.json();

                const cabecera = document.getElementById('tablaCabecera');
                const cuerpo = document.getElementById('tablaCuerpo');

                cabecera.innerHTML = '';
                cuerpo.innerHTML = '';

                // Crear columnas (encabezado)
                data.columnas.forEach(col => {
                    const th = document.createElement('th');
                    th.textContent = col.ALIAS_VISUAL;
                    cabecera.appendChild(th);
                });

                // Crear filas (datos)
                data.datos.forEach(rowObj => {
                    const tr = document.createElement('tr');
                    data.columnas.forEach(col => {
                        const td = document.createElement('td');
                        // Aseguramos coincidencia de keys en minúsculas para estandarizar Oracle
                        const colKey = col.NOMBRE_COLUMNA;//.toLowerCase(); 
                        td.textContent = rowObj[colKey] !== undefined ? rowObj[colKey] : '';
                        tr.appendChild(td);
                    });
                    cuerpo.appendChild(tr);
                });

                // Mostrar botón de descarga
                document.getElementById('btnExportar').classList.remove('d-none');
            } catch (error) {
                console.error("Error ejecutando el reporte:", error);
            }
        }

document.getElementById('btnExportar').addEventListener('click', function(event) {
    // 1. Evitar que el botón recargue la página
    event.preventDefault();
    descargarExcel();
});   
        // Redirigir para la descarga de Excel
       function descargarExcel() {
            const idReporte = document.getElementById('selectReporte').value;
            if (idReporte) {
                window.location.href = `${API_URL_REPDIN}/excel/${idReporte}`;
            }
        }