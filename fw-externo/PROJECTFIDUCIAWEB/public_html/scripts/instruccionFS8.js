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
function validaImporte(importe) 
{
if(importe.length>0)    
		{
		var p=0;
		for(var i=0;i<importe.length;i++)
	  	   {
		   if(importe.charAt(i)=='.')
		     {
		     p++;
		     if(p>1)
		       {
			alert("El formato del importe no es valido\nEjemplos:1000\n               1000.00\n ");return false;	  
		       }
		      }
				
                if((isNaN(importe.charAt(i)) && importe.charAt(i)!='.' && importe.charAt(i)!=',' ) || importe.charAt(i)==',' )
		     {
		     alert("El formato del importe no es valido\nEjemplos:1000\n               1000.00\n "); return false;	  
		     }				
						}
	 return true;  			
     }
	else return false	;
}


 function suma()

  {
	 		var importe1=0.00;
			var importe2=parseFloat(document.AsignacionFS.saldoRP.value);
			var importe3=parseFloat(document.AsignacionFS.saldoDA.value);
			var importeTotal=0.00;
	if (validaImporte(document.AsignacionFS.txtImporteA.value)==true)
			importe1= parseFloat(document.AsignacionFS.txtImporteA.value);
	 	else
		 	document.AsignacionFS.txtImporteA.value="";
	
			 
	 if(!isNaN(importe1) && importe1<=importe3)
		{
		importeTotal= importe1+importe2;
		}
	 else{
	     importeTotal=importe2;
	     if(importe1>importe3)	
		{
		alert("El el Importe a Asignar debe ser menor al Saldo disponible por Asignar");
		document.AsignacionFS.txtImporteA.value="";
		}

	     }
							
							
	
	document.AsignacionFS.txtImporteRP.value=importeTotal;
	document.AsignacionFS.txtImporteRPA.value=importeTotal;			
	
  setTimeout("suma()");
  }

function validacion(existeToken) 
	{
	if(document.AsignacionFS.txtAcuerdoComite.value=="")
		{
		 alert("Debes indicar el Acuerdo del Comite Técnico");
		 document.AsignacionFS.txtAcuerdoComite.focus();

		}
	else if(validaConcepto(document.AsignacionFS.txtAcuerdoComite.value))
		{
		 alert("La coma, comilla simple y comillas  no son caracteres validos");
		 document.AsignacionFS.txtAcuerdoComite.focus();

		}

	else if( document.AsignacionFS.cboEjercicio.selectedIndex==0)    
 	  {
   	   alert("Selecciona un Ejercicio");
   	   document.AsignacionFS.cboEjercicio.focus();
   	  }
      
       else if( document.AsignacionFS.cboEje.selectedIndex==0)    
     		{	
     		 alert("selecciona el Eje del Retiro");
      		document.AsignacionFS.cboEje.focus(); 
     		}
	else if( document.AsignacionFS.cboPrograma.selectedIndex==0)    
     		{	
     		 alert("selecciona el Programa del Eje");
      		document.AsignacionFS.cboPrograma.focus(); 
     		}
	else if( document.AsignacionFS.cboProyecto.selectedIndex==0)    
     		{	
     		 alert("selecciona el Proyecto del Programa");
      		document.AsignacionFS.cboProyecto.focus(); 
     		}
	else if( document.AsignacionFS.cboAccion.selectedIndex==0)    
     		{	
     		 alert("selecciona la Accion del Proyecto");
      		document.AsignacionFS.cboAccion.focus(); 
     		}      
	else if( document.AsignacionFS.txtImporteA.value=="0")    
      		{
	        alert("Escribe el Importe a Asignar");
      		document.AsignacionFS.txtImporteA.focus();
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

	  	 document.AsignacionFS.action="confirmarInst_FS8.jsp";
	    	document.AsignacionFS.submit();
     	   }

}


function aceptarToken() 
	{
	if(document.AsignacionFS.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.AsignacionFS.txtToken.focus();
		return;
		}	
   if((document.AsignacionFS.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.AsignacionFS.txtToken.value="";
		document.AsignacionFS.txtToken.focus();
		return;
		}	
	if(isNaN(document.AsignacionFS.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.AsignacionFS.txtToken.value="";
		document.AsignacionFS.txtToken.focus();
		return;
		}		
	document.AsignacionFS.action="confirmarInst_FS8.jsp";
	document.AsignacionFS.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.AsignacionFS.txtToken.focus();
}

function ocultarToken() 
{
document.AsignacionFS.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}




function cancelar() 
{
document.AsignacionFS.cboEjercicio.selectedIndex=0;    
document.AsignacionFS.submit();
   
}






function Mostrar()
{

   document.AsignacionFS.action = "#RP";
   document.AsignacionFS.submit();
}
