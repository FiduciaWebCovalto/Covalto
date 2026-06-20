

function validacion(existeToken) 
{
   
   if( document.pagoHonorarios.cboCuentaPH.selectedIndex==0)    
		   {
			  document.pagoHonorarios.cboCuentaPH.focus();	
			  alert('Selecciona la Cuenta <%=session.getAttribute("empresa_9")%> en la que se depositaron los recursos');
			  return;
		   }
   if(document.pagoHonorarios.cboContratoPH.value=="-1")    
		   {
			  alert("Selecciona el Número de Contrato de Inversión");
			  document.pagoHonorarios.cboContratoPH.focus();
			  return;	
		   }
   if(document.pagoHonorarios.cboDivisa.selectedIndex==0)    
		   {
			  alert("Selecciona la Divisa");
			  document.pagoHonorarios.cboDivisa.focus();
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

   	document.pagoHonorarios.action="confirmarInst_4.jsp";
   	document.pagoHonorarios.submit();     

}

function cancelar() 
 {
 document.pagoHonorarios.cboCuentaPH.selectedIndex=0;    
 document.pagoHonorarios.cboCuentaPH.focus();	  
 }



function aceptarToken() 
	{
	if(document.pagoHonorarios.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.pagoHonorarios.txtToken.focus();
		return;
		}	
   if((document.pagoHonorarios.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.pagoHonorarios.txtToken.value="";
		document.pagoHonorarios.txtToken.focus();
		return;
		}	
	if(isNaN(document.pagoHonorarios.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.pagoHonorarios.txtToken.value="";
		document.pagoHonorarios.txtToken.focus();
		return;
		}		
	document.pagoHonorarios.action="confirmarInst_4.jsp";
	document.pagoHonorarios.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.pagoHonorarios.txtToken.focus();
}

function ocultarToken() 
{
document.pagoHonorarios.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}



