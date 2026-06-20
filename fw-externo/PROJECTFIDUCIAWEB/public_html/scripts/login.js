document.getElementById('frmLoginExterno').addEventListener('submit', async function(e) {
    e.preventDefault(); // Evitar que la página se recargue

    // 1. Obtener datos
    const user = document.getElementById('email').value;
    const pass = document.getElementById('password').value;
    const message = document.getElementById('message');

    try {
        // 2. Consumir API REST (POST)
        console.log(`${window.API_BASE_URL}/api/auth/login`)
        const response = await fetch(`${window.API_BASE_URL}/api/auth/login`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ email: user, password: pass })
        });

        const  { data } = await response.json();
        
        
        //console.log(data);
        if (response.ok) {
          /*  console.log(data.statusCode)
            console.log(typeof data.token);
            console.log(JSON.stringify(data.token))

            console.log("Entra a redireccionar");
*/
            localStorage.setItem('token', data.token);
            localStorage.setItem('usuario', user);
            
            //}
            
            // Redirigir a otra página html
            window.location.href = 'index.jsp?email='+ encodeURIComponent(user);
        } else if(response.status==404){
            message.textContent = 'El usuario no se encuentra registrado';
            message.style.color = 'red';
        }
        else if(response.status==400){
            message.textContent = 'La contrasena es incorrecta.';
            message.style.color = 'red';
        }
        else {
            message.textContent = response.statusText || 'Error en el servidor.';
            message.style.color = 'red';
        }
    } catch (error) {
        console.error('Error:', error);
        message.textContent = 'Error al conectar con el servidor';
        message.style.color = 'red';
    }
});
