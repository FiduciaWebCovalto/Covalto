document.getElementById('formUsuarioAlta').addEventListener('submit', async function(e) {
    e.preventDefault(); // Evitar que la página se recargue

    // 1. Obtener datos
    const mail = document.getElementById('email').value;
    const importe = document.getElementById('fusuImpMaximo').value;
    const status = document.getElementById('fusuStatus').value;
    const perfil = document.getElementById('fperIdPerfil').value;
    const nombre = document.getElementById('fusuNombreUsuario').value;

    const message = document.getElementById('message');
    const datosNuevos = {
        email: mail,
        fusuImpMaximo: importe,
        fusuStatus:status,
        fperIdPerfil:perfil,
        fusuNombreUsuario:nombre,
        password:'Covalto2026'
    };
    try {
        // 2. Consumir API REST (POST)
        const response = await fetch(`${window.API_BASE_URL}/api/auth/register`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(datosNuevos)
        });

        const data = await response.json();

        //console.log(data.token);
        if (response.ok) {
            Swal.fire('success', 'Operacion realizada correctamente!', 'success');
            message.textContent = 'Usuario creado Correctamente!';
            message.style.color = 'blue';
        } else {
            Swal.fire('error', 'El usuario no se pudo crear, contacte al Administrador.', 'error');
            message.textContent = data.message || 'El usuario no se pudo crear, contacte al Administrador.';
            message.style.color = 'red';
        }
    } catch (error) {
        console.error('Error:', error);
        message.textContent = 'Error al conectar con el servidor';
    }
});
