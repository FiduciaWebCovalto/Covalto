
function validacionFS(existeToken) 
	{
	if( document.reprogramacionFS.cboOrigen.selectedIndex==0)    
 	  {
   	   alert("Selecciona el Origen de los Recursos");
   	   document.reprogramacionFS.cboEjercicio.focus();
   	  }
	   else if( document.reprogramacionFS.txtAcuerdo.value=="")    
     		{	
     		 alert("Debes indicar el Acuerdo del Comite Técnico");
      		document.reprogramacionFS.txtAcuerdo.focus(); 
     		}
			
	 else if(validaConcepto(document.reprogramacionFS.txtAcuerdo.value))    
     		{	
     		alert("La coma, comilla simple y comillas  no son caracteres validos");
      		document.reprogramacionFS.txtAcuerdo.focus(); 
     		}	
       else if( document.reprogramacionFS.cboEjercicio.selectedIndex==0)    
 	  {
   	   alert("Selecciona un Ejercicio Origen");
   	   document.reprogramacionFS.cboEjercicio.focus();
   	  }
      
       else if( document.reprogramacionFS.cboEje.selectedIndex==0)    
     		{	
     		 alert("selecciona el Eje ");
      		document.reprogramacionFS.cboEje.focus(); 
     		}
	else if( document.reprogramacionFS.cboPrograma.selectedIndex==0)    
     		{	
     		 alert("selecciona el Programa del Eje");
      		document.reprogramacionFS.cboPrograma.focus(); 
     		}
	else if( document.reprogramacionFS.cboProyecto.selectedIndex==0)    
     		{	
     		 alert("selecciona el Proyecto del Programa");
      		document.reprogramacionFS.cboProyecto.focus(); 
     		}
	else if( document.reprogramacionFS.cboAccion.selectedIndex==0)    
     		{	
     		 alert("selecciona la Accion del Proyecto");
      		document.reprogramacionFS.cboAccion.focus(); 
     		}  

       else if( document.reprogramacionFS.cboEjeD.selectedIndex==0)    
     		{	
     		 alert("selecciona el Eje ");
      		document.reprogramacionFS.cboEjeD.focus(); 
     		}
	else if( document.reprogramacionFS.cboProgramaD.selectedIndex==0)    
     		{	
     		 alert("selecciona el Programa del Eje");
      		document.reprogramacionFS.cboProgramaD.focus(); 
     		}
	else if( document.reprogramacionFS.cboProyectoD.selectedIndex==0)    
     		{	
     		 alert("selecciona el Proyecto del Programa");
      		document.reprogramacionFS.cboProyectoD.focus(); 
     		}
	else if( document.reprogramacionFS.cboAccionD.selectedIndex==0)    
     		{	
     		 alert("selecciona la Accion del Proyecto");
      		document.reprogramacionFS.cboAccionD.focus(); 
     		}    
	else if( document.reprogramacionFS.txtImporteR.value=="")    
      		{
	        alert("Escribe el Importe a Asignar");
      		document.reprogramacionFS.txtImporteR.focus();
	        }
	else if(parseFloat(document.reprogramacionFS.txtImporteR.value)>parseFloat(document.reprogramacionFS.saldoO.value))
		{
		alert("El Importe a Asignar debe ser menor o igual al Saldo Disponible");
      		document.reprogramacionFS.txtImporteR.focus();
		}
	else if(parseFloat(document.reprogramacionFS.txtImporteR.value)==0)
		{
		alert("El Importe a Asignar debe ser mayor a 0");
      		document.reprogramacionFS.txtImporteR.focus();
		}	
	else if(document.reprogramacionFS.cboEjercicio.value==document.reprogramacionFS.cboEjercicioD.value&& 
		document.reprogramacionFS.cboEje.value==document.reprogramacionFS.cboEjeD.value && 
		document.reprogramacionFS.cboPrograma.value==document.reprogramacionFS.cboProgramaD.value &&
		document.reprogramacionFS.cboProyecto.value==document.reprogramacionFS.cboProyectoD.value && 
		document.reprogramacionFS.cboAccion.value==document.reprogramacionFS.cboAccionD.value)
		{
		   alert("El Recursos Presupuestales Origen y Destino deben ser diferentes");
	   	   document.reprogramacionFS.cboEjercicioD.focus();
		}
	else{
		//valida si el usuario usa token
		//1=si
		//0=no
		if(existeToken==1)
			{
			mostrarToken(); 
			return;
			}
		
	  	 document.reprogramacionFS.action="confirmarInst_FS7.jsp";
	     document.reprogramacionFS.submit();
     	   }

}






function cancelar() 
{
document.reprogramacionFS.cboEjercicio.selectedIndex=0;    
document.reprogramacionFS.cboEjercicioD.selectedIndex=0;   
document.reprogramacionFS.txtAcuerdo.value="";   
document.reprogramacionFS.submit();
   
}


function aceptarToken() 
	{
	if(document.reprogramacionFS.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.reprogramacionFS.txtToken.focus();
		return;
		}	
   if((document.reprogramacionFS.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.reprogramacionFS.txtToken.value="";
		document.reprogramacionFS.txtToken.focus();
		return;
		}	
	if(isNaN(document.reprogramacionFS.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.reprogramacionFS.txtToken.value="";
		document.reprogramacionFS.txtToken.focus();
		return;
		}		
	document.reprogramacionFS.action="confirmarInst_FS7.jsp";
	document.reprogramacionFS.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.reprogramacionFS.txtToken.focus();
}

function ocultarToken() 
{
document.reprogramacionFS.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}

function Mostrar()
	{
	   document.reprogramacionFS.submit();
	}

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
	if(concepto.charAt(i)=='\'')
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