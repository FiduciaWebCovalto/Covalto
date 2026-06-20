/*--
--Valida el formato del importe al escribirlo
*/
window.alert = function(message) {
    Swal.fire({
        title: '¡Aviso!',
        text: message,
        icon: 'info', // puede ser 'warning', 'error', 'success'
        confirmButtonText: 'Aceptar'
    });
};
function validaCodigo(codigo)
{
var longitudCodigo=codigo.length;
if(longitudCodigo>0)
   {
   for(var i=0;i<longitudCodigo;i++)
	{
	if(codigo.charAt(i)==',')
		 return true;
	if(codigo.charAt(i)=='\'')
		 return true;	 
	if(codigo.charAt(i)=='\"')
		 return true;	 	 
	}
	
   }
return false;
}


function formatImporte(objeto)
{
                var importe=objeto.value;
                var posEntero =objeto.value.indexOf(".");
				
				if(posEntero==-1 &&objeto.value.length>0 )
					{
					objeto.value=importe+".00"
				    posEntero =objeto.value.indexOf(".");
					}
					
				var entero=objeto.value.substring(0,posEntero);   
				var dec=objeto.value.substring(posEntero,objeto.value.length);   
				
			    if(posEntero==0)
					{
					entero="0";
					}
				if(dec.length>2)
					{
					dec=objeto.value.substring(posEntero,posEntero+3);
					}
			    		
				objeto.value=entero+dec;

				if(isNaN(objeto.value))
					{
					alert("El formato del importe no es valido\nEjemplos:1000\n               1000.00\n ");
					objeto.value="";
					objeto.focus();
					}
				else	
				if(parseFloat(objeto.value)==0) 
					{
					alert("El importe no es valido, debe ser mayor a cero ");
					objeto.value="";
					objeto.focus();
					}
				
        	
}	

function validaNum(objeto)
{
          
		        var posEntero =objeto.value.indexOf("."); 
				var texto=objeto.value.substring(objeto.value.length-1,objeto.value.length);    
				 if (isNaN(parseInt(texto)) && texto!="." ) {
					  objeto.value=objeto.value.substring(0,objeto.value.length-1);
					  objeto.focus();
 								}
				if (posEntero>0)
					{
					if (objeto.value.substring(posEntero+1,objeto.value.length).length>2)
						{
						objeto.value=objeto.value.substring(0,objeto.value.length-1);
					  	objeto.focus();
						}
					}
			
									
			
}

function validaNumSinFoco(input)
{
          
    // Reemplaza cualquier cosa que NO sea un número (0-9) por nada
    const valorLimpio = input.value.replace(/[^0-9]/g, '');
    
    if (input.value !== valorLimpio) {
        Swal.fire('error', 'Solo se permiten numeros!', 'error');
        input.value = valorLimpio; // Limpia el campo automáticamente
        //input.focus(); // Opcional: devuelve el foco al campo
    }
                            
			
									
			
}


function ValidaFecha(sFecha)
{
   var iLen = sFecha.length;
   if (iLen != 10)
   {
      alert("El formato es dd/mm/yyyy");
      return false;
   }

   for (i = 0 ; i < 10; i++)
   {
      if (i==2 || i ==5)
      {
         if (sFecha.substr(2,1) != "/" &&  sFecha.substr(5,1) != "/")
         {
            alert("La fecha no es v�lida. El formato es dd/mm/yyyy");
            return false;
         }
      }
      else
      {
         if (sFecha.charCodeAt(i)<48 || sFecha.charCodeAt(i)>57 )
         {
            alert("La fecha no es v�lida. El formato es dd/mm/yyyy");
            return false;
         }
      }
   }

   var iDia = sFecha.substr(0,2);
   var iMes = sFecha.substr(3,2);
   var iAnio = sFecha.substr(6,4);
   var iNumDias;

   if ( iDia<1 || iMes<0 || iAnio< 1000 ) 
   {
      alert("La fecha no es v�lida. El formato es dd/mm/yyyy");
      return false;
   }


   if ( iMes<1 || iMes>12)
   {
      alert("El mes no es v�lido.");
      return false;
   }

   if (iMes ==2)
   {
      if ( (iAnio + 1900) % 4 == 0 )
      {
         iNumDias = 29;
      }
      else
      {
         iNumDias = 28;
      }
   }
   else
   {
      if ( (iMes%2 != 0  && iMes < 8) || (iMes%2 == 0  && iMes >= 8))
      {
         iNumDias = 31;         
      }
      else
      {
         iNumDias = 30;
      }
   }

   if (iDia > iNumDias)
   {
      alert("El d�a no es v�lido.");
      return false;
   }

   return true;
}


function campoObligatorioLista(parm,nombreCampo){
    var val;
    if (parm.selectedIndex == 0||parm == ""){ 
        alert("El campo"+nombreCampo+" es obligatorio"); 
        parm.focus();
        return false;
    }
    return true;
}