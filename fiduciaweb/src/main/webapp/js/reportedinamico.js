const API_URL = `${window.API_BASE_URL}/api/reportes`;

document.addEventListener('DOMContentLoaded', cargarReportes);

async function cargarReportes() {
    const BEARER_TOKEN = localStorage.getItem('token');
    const res = await fetch(API_URL, {
        method: 'GET',
        headers: {
            'Authorization': `Bearer ${BEARER_TOKEN}`,
            'Content-Type': 'application/json'
        }
    });    
    const reportes = await res.json();
    let tbody = document.getElementById('tablaReportes');
    tbody.innerHTML = '';
    
    reportes.forEach(rep => {
        tbody.innerHTML += `
            <tr>
                <td>${rep.idReporte}</td>
                <td>${rep.nombre}</td>
                <td>${rep.descripcion}</td>
                <td>
                    <button class="btn btn-warning btn-sm" onclick="editarReporte(${rep.idReporte})">Editar</button>
                    <button class="btn btn-danger btn-sm" onclick="eliminarReporte(${rep.idReporte})">Eliminar</button>
                </td>
            </tr>
        `;
    });
}

function nuevoReporte() {
    const miFormulario = document.getElementById('formReporte');
  // Solo ejecuta reset si el elemento realmente existe
  if (miFormulario !== null) {
    miFormulario.reset();
  } else {
    console.error('El formulario no se encontró en el DOM.');
  }

    //document.getElementById('formReporte').reset();
    document.getElementById('idReporte').value = '';
    document.getElementById('contenedorColumnas').innerHTML = '';
    new bootstrap.Modal(document.getElementById('modalReporte')).show();
}

function agregarFilaColumna(datos = {}) {
    let contenedor = document.getElementById('contenedorColumnas');
    let tr = document.createElement('tr');
    tr.innerHTML = `
        <td><input type="text" class="form-control form-control-sm nombreColumna" value="${datos.nombreColumna || ''}" required></td>
        <td><input type="text" class="form-control form-control-sm aliasVisual" value="${datos.aliasVisual || ''}" required></td>
        <td>
            <select class="form-select form-select-sm esFiltro" onchange="toggleTipoFiltro(this)">
                <option value="N" ${datos.esFiltro === 'N' ? 'selected' : ''}>No</option>
                <option value="Y" ${datos.esFiltro === 'Y' ? 'selected' : ''}>Sí</option>
            </select>
        </td>
        <td>
            <select class="form-select form-select-sm tipoFiltro" ${datos.esFiltro === 'N' ? 'disabled' : ''}>
                <option value="TEXT" ${datos.tipoFiltro === 'TEXT' ? 'selected' : ''}>Texto</option>
                <option value="NUMBER" ${datos.tipoFiltro === 'NUMBER' ? 'selected' : ''}>Número</option>
                <option value="DATE" ${datos.tipoFiltro === 'DATE' ? 'selected' : ''}>Fecha</option>
            </select>
        </td>
        <td><input type="number" class="form-control form-control-sm orden" value="${datos.orden || 0}" style="width: 60px;"></td>
        <td><button type="button" class="btn btn-danger btn-sm" onclick="this.closest('tr').remove()">X</button></td>
    `;
    contenedor.appendChild(tr);
}

function toggleTipoFiltro(select) {
    let tipoSelect = select.closest('tr').querySelector('.tipoFiltro');
    if (select.value === 'Y') {
        tipoSelect.disabled = false;
    } else {
        tipoSelect.disabled = true;
        tipoSelect.value = 'TEXT';
    }
}

async function editarReporte(id) {
    const res = await fetch(`${API_URL}/${id}`);
    const rep = await res.json();
    
    document.getElementById('idReporte').value = rep.idReporte;
    document.getElementById('nombre').value = rep.nombre;
    document.getElementById('descripcion').value = rep.descripcion;
    document.getElementById('queryBase').value = rep.queryBase;
    
    document.getElementById('contenedorColumnas').innerHTML = '';
    rep.columnas.forEach(col => agregarFilaColumna(col));
    
    new bootstrap.Modal(document.getElementById('modalReporte')).show();
}

async function guardarReporte() {
    let id = document.getElementById('idReporte').value;
    let metodo = id ? 'PUT' : 'POST';
    let url = id ? `${API_URL}/${id}` : API_URL;

    let columnas = [];
    document.querySelectorAll('#contenedorColumnas tr').forEach(row => {
        columnas.push({
            nombreColumna: row.querySelector('.nombreColumna').value,
            aliasVisual: row.querySelector('.aliasVisual').value,
            esFiltro: row.querySelector('.esFiltro').value,
            tipoFiltro: row.querySelector('.tipoFiltro').value,
            orden: parseInt(row.querySelector('.orden').value)
        });
    });

    let data = {
        nombre: document.getElementById('nombre').value,
        descripcion: document.getElementById('descripcion').value,
        queryBase: document.getElementById('queryBase').value,
        columnas: columnas
    };

    await fetch(url, {
        method: metodo,
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    });

    bootstrap.Modal.getInstance(document.getElementById('modalReporte')).hide();
    cargarReportes();
}

async function eliminarReporte(id) {
    if(confirm('¿Seguro que deseas eliminar este reporte?')) {
        await fetch(`${API_URL}/${id}`, { method: 'DELETE' });
        cargarReportes();
    }
}