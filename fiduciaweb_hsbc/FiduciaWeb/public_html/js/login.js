var loginURL = ctxRoot + '/login.do';
document.getElementById('frmLoginExterno').addEventListener('submit', async function(e) {
    e.preventDefault(); // Evitar que la página se recargue

    const url = `${window.API_BASE_URL}/api/auth/login`; 
    console.log(url)
    // 1. Obtener datos
    const user = document.getElementById('email').value;
    const pass = document.getElementById('password').value;
    const message = document.getElementById('message');

    try {
        // 2. Consumir API REST (POST)
        const response = await fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ email: user, password: pass })
        });

        const  { data } = await response.json();
        
        
        console.log(data);
        console.log(response.status);
        if (response.ok) {
            localStorage.setItem('token', data.token);
            localStorage.setItem('nomusuario', data.usuNomUsuario);
            localStorage.setItem('nompuesto', data.usuNomPuesto);
            localStorage.setItem('numpuesto', data.usuNumPuesto);
            localStorage.setItem('numusuario', data.usuNumUsuario);
            localStorage.setItem('usuario', user);
            localStorage.setItem('fecha', data.fecha);
            
            var accessData = {};
            accessData.username = user;
            accessData.password = "PwdValido";//GI('password').value;
            accessData.expired = 0;
            //makeAjaxRequest(loginURL, {}, validateResponse, {}, accessData);
            window.location.href = 'index.jsp?username='+ encodeURIComponent(user)+'&puestoId='+data.usuNumPuesto+'&fecha='+data.fecha;
        } 
        else if(response.status==404){
            message.textContent = 'El usuario no se encuentra registrado';
            message.style.color = 'red';
        }
        else if(response.status==400){
            message.textContent = 'La contraseña es incorrecta.';
            message.style.color = 'red';
        }
        else {
            message.textContent = response.statusText || 'Error en el servidor.';
            message.style.color = 'red';
        }
    } catch (error) {
        /*if(response.statusCode==404){
            console.error(response.message);
            message.textContent = response.message;
            message.style.color = 'red';
        }
        else{*/
            console.log('Error:'+error);
            message.textContent = 'Error al conectar con el servidor';
            message.style.color = 'red';
        //}
    }
});

function validateResponse(el, data) {
    var response = JSON.parse(data);
    var dvMensajes = GI('dvMensajesLogin');
    var msgHTML = '<h1>No Message<\/h1>';
    
    response.valid = true;//momentaneo de 24112024

    if(response.valid) {
        window.location = ctxRoot + '/principal.do';
    } else {
        hideWaitLayer();
        switch(response.responseCode) {
            case 'NVLD':
                msgHTML = '<h2 class="redH2">Usuario o Contrase&ntilde;a no v&aacute;lidos<\/h2>';
                break;
            case 'BLKD':
                msgHTML = '<h2 class="redH2">El Usuario ha sido bloqueado!<\/h2>';
                break;
            case 'PWDC':
                msgHTML = '<h2>La contrase&ntilde;a ha expirado, es necesario cambiarla<\/h2>';
                window.location.hash = '#cambiaPassword';
                break;
            default:
                break;                
        }
        
        dvMensajes.innerHTML = msgHTML;
    }
}
    