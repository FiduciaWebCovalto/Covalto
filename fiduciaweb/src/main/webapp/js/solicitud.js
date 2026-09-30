document.getElementById('solicitud').addEventListener('submit', async function(e) {
    e.preventDefault(); // Evitar que la página se recargue

    // 1. Obtener datos
    const user = document.getElementById('typeEmail').value;
    const message = document.getElementById('message');
    const url = `${window.API_BASE_URL}/api/auth/forgot-password`;
    try {
        // 2. Consumir API REST (POST)
        const response = await fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ email: user })
        });

        const data = await response.json();

        //console.log(data.token);
        if (response.ok) {
            message.textContent = 'Correo Enviado Correctamente!';
            message.style.color = 'blue';
        } else {
            message.textContent = data.message || 'Correo incorrecto';
            message.style.color = 'red';
        }
    } catch (error) {
        console.error('Error:', error);
        message.textContent = 'Error al conectar con el servidor';
    }
});
