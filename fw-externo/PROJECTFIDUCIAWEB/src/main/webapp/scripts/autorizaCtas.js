
function detalle(folio,existeToken)
	{
   document.CuenPen.txtFolio.value = folio;
	//valida si el usuario usa token
	//1=si
	//0=no
	if(existeToken==1)
		{
		mostrarToken(); 
		return;
		}
   document.CuenPen.submit();
	}


function aceptarToken() 
	{
	if(document.CuenPen.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.CuenPen.txtToken.focus();
		return;
		}	
   if((document.CuenPen.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.CuenPen.txtToken.value="";
		document.CuenPen.txtToken.focus();
		return;
		}	
	if(isNaN(document.CuenPen.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.CuenPen.txtToken.value="";
		document.CuenPen.txtToken.focus();
		return;
		}
				
	document.CuenPen.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.CuenPen.txtToken.focus();
}

function ocultarToken() 
{
document.CuenPen.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}
