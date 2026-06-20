document.addEventListener('DOMContentLoaded', cargarMenu);

async function cargarMenu() {
    try {
    const idPerfilUsuario = localStorage.getItem('numpuesto'); // Este valor se obtendría de la sesión del usuario
    const BEARER_TOKEN = localStorage.getItem('token');
    const url = `${window.API_BASE_URL}/api/menu/usuario/${idPerfilUsuario}`; 
    console.log(url)
        const response = await fetch(url, {
            method: 'GET',
            headers: {
                'Authorization': `Bearer ${BEARER_TOKEN}`,
                'Content-Type': 'application/json'
            }
        });

        if (!response.ok) throw new Error('Error al obtener el menú');
        
        const menuData = await response.json();
        //console.log(menuData)
        var contenedormenu = document.getElementById('menu-contenedor');
        contenedormenu.innerHTML = generarMenu(menuData);
    } catch (error) {
        //console.error('Error:', error);
    }
}
    
    /**
     * Función recursiva para generar los elementos del menú
     */
    function generarMenu(items) {
    let html = '';
    
    items.forEach(item => {
        const tieneHijos = item.submenus && item.submenus.length > 0;
        
        if (tieneHijos) {
            // Generar nodo padre con submenú colapsable de Bootstrap
            const idCollapse = `collapse-${item.ffunIdFuncion}`;
            html += `
                <li class="nav-item w-100">
                    <a class="nav-link d-flex justify-content-between align-items-center" data-bs-toggle="collapse" href="#${idCollapse}" role="button" aria-expanded="false">
                        <div>
                            <i class="${item.icono}"></i>
                            <span>${item.ffunNomMenu}</span>
                        </div>
                        <i class="fa-solid fa-chevron-down fs-7"></i>
                    </a>
                    <div class="collapse submenu" id="${idCollapse}">
                        <ul class="nav flex-column">
                            ${generarMenu(item.submenus)} <!-- Llamado recursivo -->
                        </ul>
                    </div>
                </li>
            `;
        } else {
            // Generar enlace final (hoja)
            html += `
                <li class="nav-item w-100">
                    <a href="javascript:onButtonClickPestania('${item.ffunNombreFuncion}')" class="nav-link">
                        <i class="${item.icono}"></i>
                        <span>${item.ffunNomMenu}</span>
                    </a>
                </li>
            `;
        }
    });
    
    return html;
}