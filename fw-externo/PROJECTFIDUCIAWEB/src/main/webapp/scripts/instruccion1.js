function validaConcepto(concepto)
{
var longitudConcepto=concepto.length;
if(longitudConcepto>0)
   {
   var espacio=0;
   for(var i=0;i<longitudConcepto;i++)
	{
	espacio++;
	if(concepto.charAt(i)==',')
		 return true;
	if(concepto.charAt(i)=="'\'")
		 return true;	 
	if(concepto.charAt(i)=='\"')
		 return true;	 	 
	if(concepto.charAt(i)==' ')
 		espacio=0;
	
			
	if(espacio>25)
		i=i+longitudConcepto;
	}
	
   if(espacio>25)
        {
		return true;	
	}
   }
return false;
}


	function validacion(iOpcion,existeToken) 
{

  document.getElementById("divCamposCuentas1").style.visibility="hidden";
  document.getElementById("divCamposCuentas2").style.visibility="hidden";
  document.getElementById("divCamposCuentas3").style.visibility="hidden";
  document.getElementById("divCamposCuentas4").style.visibility="hidden";
  document.getElementById("divCamposCuentas5").style.visibility="hidden";
  document.getElementById("divCamposCuentas6").style.visibility="hidden";
  
/*if(document.Deposito.cboCuentaD.selectedIndex==0)    
	{
	alert('Selecciona la Cuenta <%=session.getAttribute("empresa_9")%> en donde se depositaron los recursos');
	document.Deposito.cboCuentaD.selectedIndex=0; 
	document.Deposito.cboCuentaD.focus();		
	return;	
	}*/
if(document.Deposito.txtImporteD.value=="")
	{
	alert("Debes indicar el Importe del Deposito");
	document.Deposito.txtImporteD.focus();
	return;
    }
    
if(document.Deposito.cboFormasL.selectedIndex==0)
	{
	alert("Debes Seleccionar una forma de Deposito.");
	document.Deposito.txtImporteD.focus();
	return;
    }

if(document.Deposito.cboContratoD.selectedIndex==0&&document.Deposito.cboCtaCheques.selectedIndex==0)
	{
	alert("Debes Seleccionar a donde se Abonara.");
	document.Deposito.cboContratoD.focus();
	return;
    }
		
if(document.Deposito.cboConceptoD.selectedIndex==0)    
	{
	alert("Selecciona el Concepto del Deposito");
	document.Deposito.cboConceptoD.focus();
	return;
	}
	
if( document.Deposito.cboConceptoD.value=="otro" && document.Deposito.txtConceptoD.value=="")    
	{
	alert("Debes indicar el Concepto del Deposito");
	document.Deposito.txtConceptoD.focus();
	return;
	}  
if( document.Deposito.cboConceptoD.value=="otro" && validaConcepto(document.Deposito.txtConceptoD.value))
	{
	alert("Verificar la redaccion del concepto");
	document.Deposito.txtConceptoD.focus();
	return;
	} 
	//*******************************************Modificado por cubo*******************************************
	if(document.Deposito.cboTipoD.selectedIndex==0)    
	{
		alert("Selecciona Tipo de Persona que realiza el Deposito");
		document.Deposito.cboTipoD.focus();
		return;
	}
	//**********************************************************************************************************

 if( iOpcion == 1 ) 
 { 
    if(document.Deposito.cboPersona.selectedIndex==0) {
       alert("Por favor selecciona la persona");
       document.Deposito.cboPersona.focus();
       return;  
    }
 }

/*if(document.Deposito.cboContratoD.selectedIndex==0)    
	{
	alert("Selecciona el Contrato del Dep�sito");
	document.Deposito.cboContratoD.focus();
	return;
	}*/
//valida si el usuario usa token
//1=si
//0=no
if(existeToken==1)
	{
	mostrarToken(); 
	return;
	}
document.Deposito.action="confirmarInst_1.jsp";
document.Deposito.submit();	
}

function aceptarToken() 
	{
	if(document.Deposito.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.Deposito.txtToken.focus();
		return;
		}	
   if((document.Deposito.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.Deposito.txtToken.value="";
		document.Deposito.txtToken.focus();
		return;
		}	
	if(isNaN(document.Deposito.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.Deposito.txtToken.value="";
		document.Deposito.txtToken.focus();
		return;
		}		
	document.Deposito.action="confirmarInst_1.jsp";
	document.Deposito.submit();
	}	
	
function mostrarToken() 
{
document.getElementById("datos").style.visibility = 'hidden';
token.style.visibility = 'visible';
document.Deposito.txtToken.focus();
}

function ocultarToken() 
{
document.Deposito.cboContratoD.selectedIndex=0;
document.Deposito.cboCtaCheques.selectedIndex=0; 
document.Deposito.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}

function cancelar() 
 {
 

 document.Deposito.cboCuentaD.selectedIndex=0;    
 document.Deposito.txtImporteD.value="";
 document.Deposito.txtConceptoD.value="";
 document.Deposito.cboConceptoD.selectedIndex=0;    
 document.Deposito.cboContratoD.selectedIndex=0;    
 document.Deposito.cboTipoD.selectedIndex=0;
 document.Deposito.cboCuentaD.focus();  
 alert("si")
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
        
            const campoA = document.getElementById('cboContratoD');
            const campoB = document.getElementById('cboCtaCheques');
            alert(document.getElementById('cboContratoD').value)
            alert(document.getElementById('cboCtaCheques').value)
            const aLleno = campoA.value.trim() !== "";
            const bLleno = campoB.value.trim() !== "";
            console.log("aLleno "+aLleno);
            console.log("bLleno "+bLleno);
            if(document.getElementById('cboContratoD').value===""&&
            document.getElementById('cboCtaCheques').value===""){
            Swal.fire('error', 'Debe seleccionar una Forma de Abono!', 'error')
            event.preventDefault(); // Detiene el envío
            event.stopPropagation();
            }
            else if(document.getElementById('cboCtaCheques').value!==""&&
            document.getElementById('cboSubCtas').value===""){
            Swal.fire('error', 'Debe seleccionar una SubCuenta!', 'error')
            event.preventDefault(); // Detiene el envío
            event.stopPropagation();
            }
            else {
                event.preventDefault(); // Evita la recarga tradicional para usar AJAX/Fetch
                document.getElementById('Deposito').submit();
            }
        
           formulario.classList.add('was-validated'); // Aplica estilos visuales de bootstrap    
        }

        
    }, false);
});

document.getElementById('btnEnviar').addEventListener('click', function() {
    // Aquí puedes realizar validaciones antes de enviar
    console.log("Enviando formulario de forma síncrona...");
    
    // Dispara el envío tradicional POST
    document.getElementById('Deposito').submit();
});

document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('Deposito');
    const campoA = document.getElementById('cboContratoD');
    const campoB = document.getElementById('cboCtaCheques');

    // Función que valida ambos campos
    const validarConjunto = () => {
        const aLleno = campoA.value.trim() !== "";
        const bLleno = campoB.value.trim() !== "";

        // LÓGICA: Si uno está lleno, el otro también debe estarlo.
        if ((aLleno && !bLleno) && (!aLleno && bLleno)) {
            campoA.classList.add('is-invalid');
            campoB.classList.add('is-invalid');
            return false;
        } else {
            campoA.classList.remove('is-invalid');
            campoB.classList.remove('is-invalid');
            campoA.classList.add('is-valid');
            campoB.classList.add('is-valid');
            return true;
        }
    };

    // Validar al escribir
    campoA.addEventListener('input', validarConjunto);
    campoB.addEventListener('input', validarConjunto);

    // Validar al enviar
    form.addEventListener('submit', event => {
        if (!validarConjunto()) {
            event.preventDefault(); // Evita el envío
            event.stopPropagation();
        }
        form.classList.add('was-validated');
    }, false);
});