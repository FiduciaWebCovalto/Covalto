		
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

function inicioRetiro()
  {
	document.Retiro.cboFormasL.selectedIndex=0;
	document.Retiro.submit();
  }
  


function Mostrar()
{  
	
  
  document.Retiro.action = "FI_Instruccion2.jsp"; //#formaPago
	document.Retiro.submit();
	document.Retiro.txtFormaLiq.value= document.Retiro.cboFormasL.options[document.Retiro.cboFormasL.selectedIndex]
	document.Retiro.txtFormaLiq.value= document.Retiro.cboFormasL.options[document.Retiro.cboFormasL.selectedIndex].text
}


function OcultarCpto()
{   	
	document.Retiro.txtFormaLiq.value= document.Retiro.cboFormasL.options[document.Retiro.cboFormasL.selectedIndex]
	document.Retiro.txtConceptoR.value= ""
	document.Retiro.txtFormaLiq.value= document.Retiro.cboFormasL.options[document.Retiro.cboFormasL.selectedIndex].text 	
}

function cancelar() 
{
  document.Retiro.cboContratoR.selectedIndex=0;
  document.Retiro.txtImporteR.value="";
  document.Retiro.cboConceptoR.selectedIndex=0;
  document.Retiro.cboFormasL.selectedIndex=0;
  document.Retiro.submit();   
}


function mostrarhonorarios() 
{
	document.Retiro.action = "FI_Instruccion2.jsp"; //#formaPago
	document.Retiro.submit();
}

function validaHonorarios(iOpt,sImp) 
{	
	var importe=0.00;
	
	if(iOpt==1){
	
	  if(document.Retiro.txtMontHonor1.value=="" ) {
					alert("Capture el importe");
					document.Retiro.txtMontHonor1.focus();
					return 0;
				         }
				
      if (!isNaN(document.Retiro.txtMontHonor1.value))
					importe= parseFloat(document.Retiro.txtMontHonor1.value);
			else {
					alert("Formato incorrecto del importe")					
					document.Retiro.txtMontHonor1.focus();          
					document.Retiro.txtMontHonor1.value = "";
					return 0;
				}
					
			
			
      importe = formato(importe,2)
			document.Retiro.txtIVA1.value = formato((importe * .15),2);
			document.Retiro.txtImporteR.value = formato(parseFloat(importe) + parseFloat(document.Retiro.txtIVA1.value),2);
      document.Retiro.txtMontHonor1.value = importe;
			return 0;
	}
	
//Actualiza la suma de los honorarios con recibo
	if(iOpt==2){
	
		if(document.Retiro.txtIVA1.value=="" ) {
					alert("Capture el importe");
					document.Retiro.txtIVA1.focus();
					return 0;
				}
				
      if (!isNaN(document.Retiro.txtIVA1.value))
					importe= parseFloat(document.Retiro.txtIVA1.value);
			else {
					alert("Formato incorrecto del importe")
					document.Retiro.txtIVA1.focus();
					document.Retiro.txtIVA1.value="";					
					return 0;
				}
					
			
			
      importe = formato(importe,2);
      document.Retiro.txtIVA1.value=importe; 
			document.Retiro.txtImporteR.value = parseFloat(importe) + parseFloat(document.Retiro.txtMontHonor1.value);
      
			return 0;
	}
	
	if(iOpt==3){
	
	  if(document.Retiro.txtMontHonor2.value=="") {
					alert("Capture el importe");
					document.Retiro.txtMontHonor2.focus();					
					return 0;
				}
				
      if (!isNaN(document.Retiro.txtMontHonor2.value))
					importe= parseFloat(document.Retiro.txtMontHonor2.value);
			else {
					alert("Formato incorrecto del importe")
					document.Retiro.txtMontHonor2.focus();
					return 0;
				}
					
	
			
      importe = formato(parseFloat(importe),2);	
			document.Retiro.txtIVA2.value = formato((parseFloat(importe) * .15),2);
			document.Retiro.txtRetISR.value = formato((parseFloat(importe) * .10),2);		
			document.Retiro.txtRetIVA.value = formato((parseFloat(importe) * .10),2);
			
			document.Retiro.txtImporteR.value = formato( ( (parseFloat(importe) + parseFloat(document.Retiro.txtIVA2.value) ) - parseFloat(document.Retiro.txtRetISR.value) - parseFloat(document.Retiro.txtRetIVA.value) ),2);
      document.Retiro.txtMontHonor2.value = importe;
			return 0;								
	}	
	
	// Actualiza suma de honorarios con factura
	if(iOpt==4){
	
	  	if(sImp.value=="") {
					alert("Capture el importe");
					sImp.value="";
					sImp.focus();
					return 0;
				}
				
      if (!isNaN(sImp.value))
					importe= parseFloat(sImp.value);
			else {
					alert("Formato incorrecto del importe")
					sImp.value="";
					sImp.focus();
					return 0;
				}
					
	
			
      importe = formato(importe,2);
      sImp.value = importe;
      document.Retiro.txtImporteR.value =  formato((parseFloat(document.Retiro.txtMontHonor2.value) + parseFloat(document.Retiro.txtIVA2.value))- parseFloat(document.Retiro.txtRetISR.value) - parseFloat(document.Retiro.txtRetIVA.value),2);
			return 0;								
	}	
		
	
}

function mostrarconcepto()
{  //alert(document.Retiro.cboConceptoR.text);
   if (document.Retiro.cboConceptoR.options[document.Retiro.cboConceptoR.selectedIndex].text == "Otro")
  //if (document.Retiro.cboConceptoR.text == "Otro")
   {
      document.Retiro.action="FI_Instruccion2.jsp";
      document.Retiro.submit();
   }
}

function mostrarhonorarios() 
{
	
  iHon = document.Retiro.txtHon.value;
  
  if( iHon == 0 ) {
    document.Retiro.txtImporteR.value = "";
    document.Retiro.action = "FI_Instruccion2.jsp"; //#formaPago
    document.Retiro.submit();
  } 
  
  if( iHon == 1 ) {
    document.Retiro.txtImporteR.value = "";
    document.Retiro.txtMontHonor1.value = "";
    document.Retiro.txtIVA1.value = "";
    document.Retiro.action = "FI_Instruccion2.jsp"; //#formaPago
    document.Retiro.submit();
  } 
  if( iHon == 2 ) {
    document.Retiro.txtImporteR.value = "";
    document.Retiro.txtMontHonor2.value = "";
    document.Retiro.txtIVA2.value = "";
    document.Retiro.txtRetISR.value = "";		
		document.Retiro.txtRetIVA.value = "";
    document.Retiro.action = "FI_Instruccion2.jsp"; //#formaPago
    document.Retiro.submit();
  }
}

 function formato(value, precision) {
    value = "" + value //convert value to string
    precision = parseInt(precision);
    var whole = "" + Math.round(value * Math.pow(10, precision));
    var decPoint = whole.length - precision;
    if(decPoint != 0){
       result = whole.substring(0, decPoint);
       result += ".";
       result += whole.substring(decPoint, whole.length);
    }
    else {
       result = 0;
       result += ".";
       result += whole.substring(decPoint, whole.length);
    }
    return result;
}

document.addEventListener('DOMContentLoaded', function () {
    const formulario = document.getElementById('Retiro');

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
            const seleccionado = document.querySelector('input[name="radioTipoPersona"]:checked');
            const campoA = document.getElementById('cboContratoR');
            const campoB = document.getElementById('cboCtaCheques');
            //asignacion de valores alfanumericos a concepto y forma de liquidacion
            const campoC = document.getElementById('cboConceptoR');
            const campoD = document.getElementById('cboFormasL');
            document.getElementById("txtConcepto").value = campoC.options[campoC.selectedIndex].text;
            document.getElementById("txtFormaLiq").value = campoD.options[campoD.selectedIndex].text;
  
            //SPEI
            /*if(document.getElementById("txtCuentaClabeSpei").value!=""){//no hay cuenta seleccionada
                document.getElementById("txtCuentaClabeSpeiHidden").value=
                document.getElementById("txtCuentaClabeSpei").value;
                document.getElementById("txtTitularCuentaClabeSpeiHidden").value=
                document.getElementById("txtTitularCuentaClabeSpei").value;
            }*/
  
            const aLleno = campoA.value.trim() !== "";
            const bLleno = campoB.value.trim() !== "";
            if(document.getElementById('cboContratoR').value===""&&
            document.getElementById('cboCtaCheques').value===""){
            Swal.fire('error', 'Debe seleccionar un Origen de Recursos!', 'error')
            event.preventDefault(); // Detiene el envío
            event.stopPropagation();
            }
            else if(document.getElementById('cboCtaCheques').value!==""&&
            document.getElementById('cboSubCtas').value===""){
            Swal.fire('error', 'Debe seleccionar una SubCuenta!', 'error')
            event.preventDefault(); // Detiene el envío
            event.stopPropagation();
            }
            else if (!seleccionado&&selececcionado!=null) {
            Swal.fire('error', 'Debe seleccionar un Tipo de Persona!', 'error')
            event.preventDefault(); // Detiene el envío
            event.stopPropagation();  
            }
            else {
                event.preventDefault(); // Evita la recarga tradicional para usar AJAX/Fetch
                document.getElementById('Retiro').submit();
            }
        }

        formulario.classList.add('was-validated'); // Aplica estilos visuales de bootstrap
    }, false);
});

document.getElementById('btnEnviar').addEventListener('click', function() {
    // Aquí puedes realizar validaciones antes de enviar
    console.log("Enviando formulario de forma síncrona...");
    
    // Dispara el envío tradicional POST
    document.getElementById('Retiro').submit();
});


function validarVostro(cuentaVostro) {
    // Limpiar espacios en blanco
    const cuentaLimpia = cuentaVostro.toString().trim();

    // Expresión regular: Alfanumérico, longitud entre 8 y 20
    const regexVostro = /^[a-zA-Z0-9]{8,20}$/;

    if (!regexVostro.test(cuentaLimpia)) {
    console.log("resultado negativo validarVostro");
        return false;
    }
console.log("resultado positivo validarVostro");
    return true;
}

function validarCLABE(clabe) {
console.log("entro validarCLABE");
    // 1. Limpiar espacios o guiones si los hay
    const clabeLimpia = clabe.toString().replace(/\s/g, '').replace(/-/g, '');

    // 2. Validar formato básico: exactamente 18 dígitos numéricos
    if (!/^\d{18}$/.test(clabeLimpia)) {
        return { valido: false, mensaje: "La CLABE debe contener 18 dígitos numéricos." };
    }

    // 3. Algoritmo de Dígito de Control
    const pesos = [3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7, 1, 3, 7];
    let suma = 0;
    for (let i = 0; i < 17; i++) {
        suma += (parseInt(clabeLimpia[i]) * pesos[i]) % 10;
    }
    const digitoCalculado = (10 - (suma % 10)) % 10;
    const digitoReal = parseInt(clabeLimpia[17]);
    console.log("intermedio clabe clabe");
    if (digitoCalculado !== digitoReal) {
    console.log("resultado negativo clabe");
        return false;
    }
console.log("resultado positivo clabe");
    return true;
}

document.addEventListener("DOMContentLoaded", function() {
    const input = document.getElementById('txtCuentaClabeSpei2');
});
input.addEventListener('blur', async (e) => {
    // 1. Mostrar estado de "cargando"
    console.log('Validando...');

    // 2. Esperar la función asíncrona
    const esValido = await generaClabe(e.target.value);

    // 3. Actuar tras la resolución
    if (!esValido) {
        console.log('Correcto...');
        //e.target.value=""; // Re-enfocar si es necesario
    }
});

function funcionpato(valor){

if(valor.length<18){
    Swal.fire('error', 'Longitud de Cuenta incorrecta!', 'error');
    document.Retiro.txtCuentaClabeSpei.value="";
    
}
if(!generaClabe(valor)){
    console.log("resultado negativo");
    document.Retiro.txtCuentaClabeSpei.value="";
}else{
console.log("resultado positivo");
}
}
async function generaClabe(clabe)
{
//return true;
console.log("entro a validar");
    if(!validarCLABE(clabe)){
        console.log("paso validacion clabe");
        const result = await Swal.fire({
            title: 'La cuenta CLABE no cumple con el formato, se validara la Vostro, deseas continuar?',
            text: "No podras revertir esto.",
            icon: 'warning',
            showCancelButton: true,
            confirmButtonText: 'Si, aceptar',
            cancelButtonText: 'Cancelar',
            allowOutsideClick: false // Evita cerrar al hacer clic fuera
        });   
        if (result.isConfirmed) {
           if(!validarVostro(clabe)){
                const result2 = await Swal.fire({
                title: 'La cuenta Vostro no cumple con el formato!',
                text: "No podras revertir esto.",
                icon: 'warning',
                showCancelButton: false,
                confirmButtonText: 'Aceptar',
                cancelButtonText: 'Cancelar',
                allowOutsideClick: false // Evita cerrar al hacer clic fuera
                }); 
                if (result2.isConfirmed) {
                    document.Retiro.txtCuentaClabeSpei.value="";
                    return false;
                }
           }
           
        } else {
            // Código a ejecutar cuando cancelan
            console.log("cancelo la primera")
            document.Retiro.txtCuentaClabeSpei.value="";
            return false;
        }
    }
    return true;
}


function asignarTexto() {
  // 1. Obtener el elemento select
  var select = document.getElementById("cboConceptoR");
  // 2. Obtener la opción seleccionada
  var selectedOption = select.options[select.selectedIndex];
  // 3. Obtener el texto (no el valor)
  var text = selectedOption.text;
  // 4. Asignarlo al hidden
  document.getElementById("txtConcepto").value = text;
  
  console.log("Texto seleccionado: " + text);
}


function asignarTitular() {
  // 1. Obtener el elemento select
  var select = document.getElementById("cboCuentaPagoR");
  // 2. Obtener la opción seleccionada
  console.log("Valor del select "+select.options[select.selectedIndex].text)
  var selectedOption = select.options[select.selectedIndex].text.split("|");
  // 3. Obtener el texto (no el valor)
  var text = selectedOption[2];
  var text1 = selectedOption[0];

  // 4. Asignarlo al hidden
  
  console.log("Texto seleccionado: " + text);
  console.log("Texto1 seleccionado: " + text1);

    document.getElementById("txtCuentaClabeSpeiHidden").value=text;
    document.getElementById("txtTitularCuentaClabeSpeiHidden").value=text1;


}

function asignarBeneficiario() {
  // 1. Obtener el elemento select
  var select = document.getElementById("txtBeneficiarioChequeR");
  // 2. Obtener la opción seleccionada
  var selectedOption = select.options[select.selectedIndex];
  // 3. Obtener el texto (no el valor)
  var text = selectedOption.text;
  // 4. Asignarlo al hidden
  document.getElementById("txtNomBeneficiario").value = text;
  
  console.log("Texto seleccionado: " + text);
}