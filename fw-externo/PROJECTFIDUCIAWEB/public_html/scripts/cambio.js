document.getElementById('cambio').addEventListener('submit', async function(e) {
    e.preventDefault(); // Evitar que la página se recargue

    // 1. Obtener datos
    const cod = document.getElementById('codigo').value;
    const pass = document.getElementById('password').value;
    const message = document.getElementById('message');

    try {
        // 2. Consumir API REST (POST)
        const response = await fetch(`${window.API_BASE_URL}/api/auth/reset-password`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ code: cod, newPassword: pass })
        });

        const data = await response.json();

        //console.log(data.token);
        if (response.ok) {
            console.log("Entra a redireccionar");
            // Guardar token en localStorage
            localStorage.setItem('token', data.token);
            message.textContent = 'Contraseña reestablecida correctamente!';
            message.style.color = 'blue';
        } else {
            message.textContent = data.message || 'Credenciales incorrectas';
            message.style.color = 'red';
        }
    } catch (error) {
        console.error('Error:', error);
        message.textContent = 'Error al conectar con el servidor';
    }
});
