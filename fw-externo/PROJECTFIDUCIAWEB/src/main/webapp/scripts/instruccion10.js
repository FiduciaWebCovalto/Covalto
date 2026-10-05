

function validacion(existeToken) 
{

var contratoOrigen=document.Traspaso.cboContratoOrigenTC.options[document.Traspaso.cboContratoOrigenTC.selectedIndex].text;
var contratoDestino=document.Traspaso.cboContratoDestinoTC.options[document.Traspaso.cboContratoDestinoTC.selectedIndex].text;
var subOrigen =document.Traspaso.cboSubCuentaOrigen;
var subDestino =document.Traspaso.cboSubCuentaDestino;


if(document.Traspaso.cboContratoOrigenTC.selectedIndex==0)    
	{
	alert("Selecciona la cuenta bancaria Origen");
	document.Traspaso.cboContratoOrigenTC.focus();
	 return;
	}
if(document.Traspaso.cboContratoDestinoTC.selectedIndex==0)    
	{
	alert("Selecciona la cuenta bancaria Destino");
	document.Traspaso.cboContratoDestinoTC.focus();
	 return;
	}
if(subOrigen.selectedIndex==0)    
	{
	alert("Selecciona la Subcuenta Origen");
	subOrigen.focus();
	 return;
	}
if(subDestino.selectedIndex==0)    
	{
	alert("Selecciona la Subcuenta Destino");
	subDestino.focus();
	 return;
	}    
  
if(document.Traspaso.cboContratoOrigenTC.selectedIndex==document.Traspaso.cboContratoDestinoTC.selectedIndex) 
     {
     if(confirm("La cuenta bancaria Origen y la cuenta bancaria Destino son iguales.\n¿Desea continuar?")){
     }else{document.Traspaso.cboContratoOrigenTC.selectedIndex=0;
     document.Traspaso.cboContratoDestinoTC.selectedIndex=0;
     document.Traspaso.cboContratoOrigenTC.focus();	
	  return;}
     }
if(((parseInt(contratoOrigen)<6000000 && contratoOrigen!="1060140")||parseInt(contratoOrigen)>6999999) && ((parseInt(contratoDestino)>=6000000&&parseInt(contratoDestino)<=6999999)||contratoDestino=="1060140")) 
     {
     alert("No se puede traspasar de una cuenta Bancaria en Moneda Nacional  a  otra cuenta en Dolares");
     document.Traspaso.cboContratoDestinoTC.selectedIndex=0;
     document.Traspaso.cboContratoDestinoTC.focus();	
	  return;
     }

if(((parseInt(contratoDestino)<6000000 && contratoDestino!="1060140")||parseInt(contratoDestino)>6999999) && ((parseInt(contratoOrigen)>=6000000&&parseInt(contratoOrigen)<=6999999)||contratoOrigen=="1060140")) 
     {
     alert("No se puede traspasar de un cuenta en Dolares a otra en Moneda Nacional");
     document.Traspaso.cboContratoDestinoTC.selectedIndex=0;
     document.Traspaso.cboContratoDestinoTC.focus();
	 return;
     }
if(document.Traspaso.txtImporteTC.value=="")    
	{
	alert("Debes indicar el Importe del Traspaso");
	document.Traspaso.txtImporteTC.focus();
	return;
	}

//valida si el usuario usa token
//1=si
//0=no
if(existeToken==1)
	{
	mostrarToken(); 
	return;
	}

document.Traspaso.submit();


}

function cancelar() 
  {
  document.Traspaso.cboContratoOrigenTC.selectedIndex=0;
  document.Traspaso.cboContratoDestinoTC.selectedIndex=0;
  document.Traspaso.txtImporteTC.value="";    
  document.Traspaso.cboContratoOrigenTC.focus();
  }


function aceptarToken() 
	{
	if(document.Traspaso.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.Traspaso.txtToken.focus();
		return;
		}	
   if((document.Traspaso.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.Traspaso.txtToken.value="";
		document.Traspaso.txtToken.focus();
		return;
		}	
	if(isNaN(document.Traspaso.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.Traspaso.txtToken.value="";
		document.Traspaso.txtToken.focus();
		return;
		}		
	document.Traspaso.action="confirmarInst_10.jsp";
	document.Traspaso.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.Traspaso.txtToken.focus();
}

function ocultarToken() 
{
document.Traspaso.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}
