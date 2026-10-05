function muestraCamposFormaInversion(obj) {
    document.Inversion.action = "FI_Instruccion14.jsp";
    document.Inversion.submit();
}

function validacion(existeToken) {
    /*
    var contratoOrigen=document.Traspaso.cboContratoOrigenTC.options[document.Traspaso.cboContratoOrigenTC.selectedIndex].text;
    var contratoDestino=document.Traspaso.cboContratoDestinoTC.options[document.Traspaso.cboContratoDestinoTC.selectedIndex].text;
    var subOrigen =document.Traspaso.cboSubCuentaOrigen;
    var subDestino =document.Traspaso.cboSubCuentaDestino;

    if(document.Traspaso.cboContratoOrigenTC.selectedIndex==0) {
        alert("Selecciona el Contrato de Inversi�n Origen");
        document.Traspaso.cboContratoOrigenTC.focus();  
        return;
    }
    if(document.Traspaso.cboContratoDestinoTC.selectedIndex==0) {
	alert("Selecciona el Contrato de Inversi�n Destino");
	document.Traspaso.cboContratoDestinoTC.focus();
        return;
    }
    if(subOrigen.selectedIndex==0) {
	alert("Selecciona la Subcuenta Origen");
	subOrigen.focus();
        return;
    }
    if(subDestino.selectedIndex==0) {
	alert("Selecciona la Subcuenta Destino");
	subDestino.focus();
	return;
    }
    if(document.Traspaso.cboContratoOrigenTC.selectedIndex==document.Traspaso.cboContratoDestinoTC.selectedIndex) {
        alert("El Contrato de Inversi�n Origen y el Contrato de Inversi�n Destino\nDeben ser distintos");
        document.Traspaso.cboContratoOrigenTC.selectedIndex=0;
        document.Traspaso.cboContratoDestinoTC.selectedIndex=0;
        document.Traspaso.cboContratoOrigenTC.focus();	
        return;
    }
    if(((parseInt(contratoOrigen)<6000000 && contratoOrigen!="1060140")||parseInt(contratoOrigen)>6999999) && ((parseInt(contratoDestino)>=6000000&&parseInt(contratoDestino)<=6999999)||contratoDestino=="1060140")) {
        alert("No se puede traspasar de un Contrato en Moneda Nacional  a  un Contrato en Dolares");
        document.Traspaso.cboContratoDestinoTC.selectedIndex=0;
        document.Traspaso.cboContratoDestinoTC.focus();	
        return;
    }

    if(((parseInt(contratoDestino)<6000000 && contratoDestino!="1060140")||parseInt(contratoDestino)>6999999) && ((parseInt(contratoOrigen)>=6000000&&parseInt(contratoOrigen)<=6999999)||contratoOrigen=="1060140")) {
        alert("No se puede traspasar de un Contrato en Dolares a un Contrato en Moneda Nacional");
        document.Traspaso.cboContratoDestinoTC.selectedIndex=0;
        document.Traspaso.cboContratoDestinoTC.focus();
        return;
    }
    
    if(document.Traspaso.txtImporteTC.value=="") {
	alert("Debes indicar el Importe del Traspaso");
	document.Traspaso.txtImporteTC.focus();
	return;
    }
*/
    //valida si el usuario usa token
    //1=si
    //0=no
    if(existeToken == 1) {
        mostrarToken(); 
        return;
    }
    document.Inversion.submit();
}

function cancelar() {
    document.Inversion.cboContratoOrigenTC.selectedIndex = 0;
    document.Inversion.cboContratoDestinoTC.selectedIndex = 0;
    document.Inversion.txtImporteTC.value = "";    
    document.Inversion.cboContratoOrigenTC.focus();
}

function aceptarToken() {
    if(document.Inversion.txtToken.value == "") {
        Swal.fire('error', 'Es necesario que digite su Token!', 'error')
        document.Inversion.txtToken.focus();
        return;
    }
    
    if((document.Inversion.txtToken.value).length < 6){
        Swal.fire('error', 'La longitud del Token es invalida!', 'error')
        document.Inversion.txtToken.value = "";
        document.Inversion.txtToken.focus();
        return;
    }	
    if(isNaN(document.Inversion.txtToken.value)) {
        Swal.fire('error', 'El Token es un dato numerico!', 'error')
        document.Inversion.txtToken.value= "";
        document.Inversion.txtToken.focus();
        return;
    }
    document.Inversion.action="confirmarInst_14.jsp";
    document.Inversion.submit();
}	
	
function mostrarToken() {
    datos.style.visibility = 'hidden';
    token.style.visibility = 'visible';
    document.Inversion.txtToken.focus();
}

function ocultarToken() {
    document.Inversion.txtToken.value="";
    datos.style.visibility = 'visible';
    token.style.visibility = 'hidden';
}


document.addEventListener('DOMContentLoaded', function () {
    const formulario = document.getElementById('Inversion');

    formulario.addEventListener('submit', function (event) {
        // 1. Validar campos obligatorios con Bootstrap
        if (!formulario.checkValidity()) {
            event.preventDefault(); // Detiene el envío
            event.stopPropagation();
            
            // Muestra alerta de error
            Swal.fire({
                icon: 'error',
                title: 'Campos Obligatorios',
                text: 'Por favor completa todos los campos requeridos.',
                confirmButtonText: 'Aceptar'
            });
        } else {
            event.preventDefault(); // Evita la recarga tradicional para usar AJAX/Fetch
              document.getElementById('Inversion').submit();
               
        }

        formulario.classList.add('was-validated'); // Aplica estilos visuales de bootstrap
    }, false);
});

document.getElementById('btnEnviar').addEventListener('click', function() {
    // Aquí puedes realizar validaciones antes de enviar
    console.log("Enviando formulario de forma síncrona...");
    
    // Dispara el envío tradicional POST
    document.getElementById('Inversion').submit();
});