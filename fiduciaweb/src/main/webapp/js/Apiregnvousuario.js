document.addEventListener("DOMContentLoaded", function() {
    const boton = document.getElementById("cmdAceptar");
    if (boton) {
        boton.addEventListener("click", altaModUsuarios);
    }
});


async function altaModUsuarios() {
  e.preventDefault(); // Evitar que la página se recargue
  console.log("entro a la funcion altaModUsuarios")      
  if(operacion==1 && fvMantenimientoUsuariosInternet.checkForm()) { //Se trata de una alta
    const token=document.getElementById('usuTokenChk').value;
    console.log("token: "+token);
    const datosNuevos = {
        usuEmail: GI("usuEmail").value,
        usuNumUsuario: GI("usuNumUsuario").value,
        usuToken: 0,
        usuCveStUsuario: "ACTIVO",
        usuNumPuesto: GI("usuNumPuesto").value,
        usuNomPuesto: GI("usuNomPuesto").value,
        usuNomUsuario: GI("usuNomUsuario").value,
        usuMontoAutorizado: GI("usuMontoAutorizado").value,
        usuPassword:'Covalto2026',
        perTelefono:GI("perTelefono").value,
        perExpLaboral:GI("perExpLaboral").value,
        perNivelEstudios:GI("perNivelEstudios").value,
        perRfc:GI("perRfc").value,
        perDireccion:GI("perDireccion").value
    };
    try {
        // 2. Consumir API REST (POST)
        const url = `${window.API_BASE_URL}/api/auth/register`; 
        console.log(url)        
        const response = await fetch(url, {
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
  }  
  else if(operacion==2 && fvMantenimientoUsuariosInternet.checkForm()) {//Se trata de una modificación
    catUsuarios.setOnUpdate(modificaCatalogoPersonal);
    var Token;
    if(GI("usuNumPuesto").value==3000 || GI("usuNumPuesto").value==3002 || GI("usuNumPuesto").value==3005)
      Token=0;
    else
      Token=1;    
    GI("usuTokenChk").checked=Token;  
    catUsuarios.modificaCatalogo();
    catPersonal.modificaCatalogo();
    operacionExitosa();
  }  
    
}
