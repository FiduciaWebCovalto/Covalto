
function getEventosFeeder() { 
  var fecha=localStorage.getItem('fecha');
  var usuario=localStorage.getItem('numusuario');
  fecha=ctxFeccont
  var objEventosFeeder = JSON.parse("{}");
  objEventosFeeder.id = "qryConsultaAgendaFeeder";
  objEventosFeeder.numUsu=usuario;
  objEventosFeeder.fecEvento=fecha.trim();
  objEventosFeeder.order = "s";
  
  var url = ctxRoot+"/getRef.do?json="+JSON.stringify(objEventosFeeder);
  //alert(url)
  makeAjaxRequest(url,"html",getEventosFeederRes,null);
}

function getEventosFeederRes(obj, result) {
  var feedEventos = JSON.parse(result);
  var nfeeds = feedEventos.length;
  var nfeedsuser = 0;
  console.log("nfeeds: "+nfeeds)
    // 1. Crear elemento tabla y añadir clases de Bootstrap
    
    /*const contenedor = document.createElement('div');
    contenedor.style.width = '350px';         // O un ancho fijo, ej: '500px'
    contenedor.style.maxWidth = '350px';     // Ancho máximo para que no se salga de su área
    contenedor.style.height = '250px';       // Altura fija o máxima
    contenedor.style.overflow = 'auto';      // Habilita el scroll (horizontal y vertical) solo si es necesario
    //contenedor.style.border = '1px solid #ccc'; // Opcional: para visualizar el borde del área
    */
    
    const tabla = document.createElement('table');
    // 3. Darle estilo a la tabla para que funcione correctamente con el scroll
    tabla.style.fontSize = '8px'; // Fuente pequeña
    tabla.style.width='500px';
    tabla.style.borderCollapse = 'collapse';   
    // 4. Ensamblar los elementos
    //contenedor.appendChild(tabla);
    //document.body.appendChild(contenedor);    
    tabla.classList.add('table', 'table-primary', 'table-bordered', 'table-hover','table-sm');
    const thead = document.createElement('thead');
    const tr = document.createElement('tr');
    const headers = ['Fecha', 'Status', 'Evento'];
    headers.forEach(headerText => {
        const th = document.createElement('th');
        th.textContent = headerText;
        
        // Aplicar estilos sticky a cada celda th (más compatible)
        th.style.position = 'sticky';
        th.style.top = '0';
        th.style.backgroundColor = 'white'; // Fondo para no transparencia
        th.style.zIndex = '1'; // Asegurar que quede por encima
        th.style.boxShadow = '0 2px 2px -1px rgba(0, 0, 0, 0.4)'; // Opcional: sombra
        
        tr.appendChild(th);
    });
    
    thead.appendChild(tr);
    tabla.appendChild(thead);

    // 3. Crear tbody
    const tbody = document.createElement('tbody');  
    for(s = 0; s < nfeeds; s++) {
        var feedEvento = feedEventos[s]; 
        console.log(feedEventos[s])
        const fila = document.createElement('tr');
            fila.innerHTML =
            `
            <td>${feedEvento.eageFecEvento}</td>
            <td>${feedEvento.eageCveStatus}</td>
            <td>${feedEvento.eageDesEvento}</td>
        `;

            tbody.appendChild(fila);
        tabla.appendChild(tbody);
    }
    // 5. Insertar en el contenedor HTML
    document.getElementById('dvFeeder').appendChild(tabla);
        
}