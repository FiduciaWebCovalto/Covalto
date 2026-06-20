


	function validacion(iOpcion,existeToken) 
{



if(document.Deposito.txtConceptoD.selectedIndex==0)    
	{
	alert("Selecciona el Concepto del Dep�sito");
	document.Deposito.cboConceptoD.focus();
	return;
	}
	

//valida si el usuario usa token
//1=si
//0=no

document.Deposito.action="confirmarInst_13.jsp";
document.Deposito.submit();	
}

function aceptarToken() 
	{
	if(document.Deposito.txtToken.value=="")
		{
		alert("Es necesario que digite su NAFIN-LLAVE");
		document.Deposito.txtToken.focus();
		return;
		}	
   if((document.Deposito.txtToken.value).length<6)
		{
		alert("La longitud de la NAFIN-LLAVE es invalida");
		document.Deposito.txtToken.value="";
		document.Deposito.txtToken.focus();
		return;
		}	
	if(isNaN(document.Deposito.txtToken.value))
		{
		alert("La NAFIN-LLAVE es un dato numerico");
		document.Deposito.txtToken.value="";
		document.Deposito.txtToken.focus();
		return;
		}		
	document.Deposito.action="confirmarInst_13.jsp";
	document.Deposito.submit();
	}	
	
function mostrarToken() 
{
/*datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.Deposito.txtToken.focus();*/
}

function ocultarToken() 
{
d/*ocument.Deposito.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';*/

}

function cancelar() 
 {
 document.Deposito.txtConceptoD.selectedIndex=0;    
}


function mostrarconcepto()
{  
   if (document.Deposito.cboConceptoD.options[document.Deposito.cboConceptoD.selectedIndex].value == "otro")
   {
      document.Deposito.action="FI_Instruccion1.jsp";
      document.Deposito.submit();
   }
}

document.addEventListener('DOMContentLoaded', function () {
    const formulario = document.getElementById('Deposito');

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
              document.getElementById('Deposito').submit();
               
        }

        formulario.classList.add('was-validated'); // Aplica estilos visuales de bootstrap
    }, false);
});

document.getElementById('btnEnviar').addEventListener('click', function() {
    // Aquí puedes realizar validaciones antes de enviar
    console.log("Enviando formulario de forma síncrona...");
    
    // Dispara el envío tradicional POST
    document.getElementById('Deposito').submit();
});
