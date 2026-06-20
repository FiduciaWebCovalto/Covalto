
function abrir()
{

   window.open( "formatos/formato_confirma_TEF.doc","FORMATO_DE_CONFIRMACION_CUENTA","top=20,left=20,width=750,height=420,menubar=YES,scrollbars=YES");
}

function digitoVerificador() {
   var digito = 0;
	 var suma = 0;
   var digitoVerificador = "00" + document.RegistrarCuenta.txtCuenta.value;
       
       //DIGITO 3
       digito = digitoVerificador.substr(2,1);
			 digito = digito * 3;
			 suma = digito;
       
			 //DIGITO 4
       digito = digitoVerificador.substr(3,1);
			 digito = digito * 7;
			 suma += digito;
			 
       //DIGITO 5
			 digito = digitoVerificador.substr(4,1);
			 digito = digito * 1;
			 suma += digito;
			 
       //DIGITO 6
			 digito = digitoVerificador.substr(5,1);
			 digito = digito * 3;
			 suma += digito;
			 
       //DIGITO 7
			 digito = digitoVerificador.substr(6,1);
			 digito = digito * 7;
			 suma += digito;
			
       //DIGITO 8
			 digito = digitoVerificador.substr(7,1);
			 digito = digito * 1;
			 suma += digito;
			 
       //DIGITO 9
			 digito = digitoVerificador.substr(8,1);
			 digito = digito * 3;
			 suma += digito;
			
       //DIGITO 10
			 digito = digitoVerificador.substr(9,1);
			 digito = digito * 7;
			 suma += digito;
			 
       //DIGITO 11
			 digito = digitoVerificador.substr(10,1);
			 digito = digito * 1;
			 suma += digito;
			 
       //DIGITO 12
			 digito = digitoVerificador.substr(11,1);
			 digito = digito * 3;
			 suma += digito;
			 
       //DIGITO 13
			 digito = digitoVerificador.substr(12,1);
			 digito = digito * 7;
			 suma += digito;
			 
       //DIGITO 14
			 digito = digitoVerificador.substr(13,1);
			 digito = digito * 1;
			 suma += digito;
			 
       //DIGITO 15
			 digito = digitoVerificador.substr(14,1);
			 digito = digito * 3;
			 suma += digito;
			 
       //DIGITO 16
			 digito = digitoVerificador.substr(15,1);
			 digito = digito * 7;
			 suma += digito;
			 
       //DIGITO 17
			 digito = digitoVerificador.substr(16,1);
			 digito = digito * 1;
			 suma += digito;
			
       
       //DIGITO 18
			 digito = digitoVerificador.substr(17,1);
			 digito = digito * 3;
			 suma += digito;
			 
       //DIGITO 19
			 digito = digitoVerificador.substr(18,1);
			 digito = digito * 7;
			 suma += digito;
			 
       suma = suma % 10;
			 
       if( suma > 0 )
			    digito = 10 - suma;
			 else
			    digito = suma;
				
			//DIGITO 20
      suma = digitoVerificador.substr( 19,1 ) 
			
		  //VALIDACION DIGITO
      if( digito != suma ) {
			   return true;
			}
}/*************************TERMINA FUNCION*****************************/

function validarFormatoRFCFisica() {
     
	 var rfc = document.RegistrarCuenta.txtRFC.value;
	 var patron1 = /[A-Z]/
	 var patron2 = /\s/
     //if( rfc.length == 12 ) {
        for ( var intCaracter = 0; intCaracter < rfc.length; intCaracter++ ) {
            if( intCaracter <= 1 )  
				{
				if(rfc.substr(intCaracter, 1)=="&")
					{
					 continue;
					}
				else
                 if( patron1.test(rfc.substr(intCaracter, 1)) ) 
				 	{ 
				     continue;
				 	}
				else{
					 return 1;  
                	 }
            }
			
			if( intCaracter == 2 )  
					{
					if(rfc.substr(intCaracter, 1)=="&")
					{
					 continue;
					}
				else
                 	if( (patron1.test(rfc.substr(intCaracter, 1))) || 
				    	 (patron2.test(rfc.substr(intCaracter, 1))) ) 
						 	{ 
					     	continue;
						 }
					else{
					 return 1;  
                 		}
            }
			
			else if( intCaracter >= 5 && intCaracter <= 7)  {
                 if( isNaN( rfc.substr(intCaracter, 1)) == true) {
                     return 1;  
                 }
            }  
        }  
       /*
       }else{
          return 2;
       } 
       */
       return 0;              
}
////
function validarFormatoRFCMoral() {
     
	 var rfc = document.RegistrarCuenta.txtRFC.value;
	 var patron1 = /[A-Z]/
	 var patron2 = /\s/
//     if( rfc.length == 13 ) {
        for ( var intCaracter = 0; intCaracter < rfc.length; intCaracter++ ) {
            if( intCaracter <= 2 )  
				{
				if(rfc.substr(intCaracter, 1)=="&")
					{
					 continue;
					}
				else
                 if( patron1.test(rfc.substr(intCaracter, 1)) ) 
				 	{ 
				     continue;
				 	}
				else{
					 return 1;  
                	 }
            }
			
			if( intCaracter == 3 )  
					{
					if(rfc.substr(intCaracter, 1)=="&")
					{
					 continue;
					}
				else
                 	if( (patron1.test(rfc.substr(intCaracter, 1))) || 
				    	 (patron2.test(rfc.substr(intCaracter, 1))) ) 
						 	{ 
					     	continue;
						 }
					else{
					 return 1;  
                 		}
            }
			
			else if( intCaracter >= 4 && intCaracter <= 9 )  {
                 if( isNaN( rfc.substr(intCaracter, 1)) == true) {
                     return 1;  
                 }
            }  
        }  
  /*
       }else{
          return 2;
       }  
  */
       return 0;
 } /******************************TERMINA FUNCION ********************************/  
 
function convertirMayusculas( objeto ) {
   var strMayusculas = objeto.value;
   objeto.value = strMayusculas.toUpperCase();

}  /*****************************TERMINA FUNCION **********************************/

/////Mensaje de que debe de haber tipo de cambio antes de autorizar
function autorizar()
{
var TipoCambio=document.formaAutorizar.fdpoTipoCambioFirme.value;
if(document.formaAutorizar.fdpoTipoCambioFirme.value=="")
{
    alert("Debes indicar el Tipo de Cambio de cierre u operación");
    document.formaAutorizar.fdpoTipoCambioFirme.focus();		
	return;
}
}

/// 
function validacion(existeToken) 
{
    // -- MONEDAS ---- //
    var monedaIndex = document.RegistrarCuenta.cboMoneda.selectedIndex;
    var valMoneda = document.RegistrarCuenta.cboMoneda.options[monedaIndex].value;
    valMoneda = valMoneda.substring(0, valMoneda.indexOf('-') );
  
  // -- MONEDAS ---- //
  
    var sCorreo=document.RegistrarCuenta.txtCorreo.value;
      
   if(valMoneda==1)// es MONEDA NACIONAL
   {
                 
              if(document.RegistrarCuenta.txtCuenta.value=="") 
          
               {
          
              alert("Debes indicar el Número de Cuenta");
              document.RegistrarCuenta.txtCuenta.focus();		
            return;
               }
          
             if(isNaN(document.RegistrarCuenta.txtCuenta.value))
          
               {
          
              alert("El formato del Número de Cuenta no es valido\nDebe ser numérico");
          
              document.RegistrarCuenta.txtCuenta.value="";
          
              document.RegistrarCuenta.txtCuenta.focus();		
             return;
               }
          
          
            if((document.RegistrarCuenta.txtCuenta.value).length < 18)
          
               {
          
              alert("Número de Cuenta no valido\nEscriba los 18 Dígitos de la Cuenta Interbancaria");
          
              document.RegistrarCuenta.txtCuenta.value="";
          
              document.RegistrarCuenta.txtCuenta.focus();		
            return;
               }
               
            if(document.RegistrarCuenta.cboBanco.value!='164-BANXICO')
            { 
              
              if( digitoVerificador() ==  true)
              {
                alert("EL DIGITO VERIFICADOR DEL NUMERO DE CUENTA NO ES VALIDO PARA LIQUIDACIONES CON CUENTA CLABE ");
          
                document.RegistrarCuenta.txtCuenta.value = ""
          
                document.RegistrarCuenta.txtCuenta.focus(); 
                return;
              }
            }
    }
    else // es MONEDA EXTRANJERA
    {
        document.RegistrarCuenta.txtCuenta.value = document.RegistrarCuenta.txtNCuenta.value;
    }
    

   if(document.getElementById('rTP0').checked || document.getElementById('rTP1').checked ||document.getElementById('rTP2').checked ||document.getElementById('rTP3').checked)
   {
   
   
    if(document.getElementById('rTP0').checked){ 
      if(document.RegistrarCuenta.txtTitular.value=="")   
        {
  
        alert("Debes indicar el Nombre del Titular de la Cuenta");
  
        document.RegistrarCuenta.txtTitular.focus();
      return;
        }
    }
    else
    {
        if(document.RegistrarCuenta.cboTipoD.selectedIndex==0)  
        {
  
        alert("Debes seleccionar el Nombre del Titular de la Cuenta");
      return;
        }  
    
    }
    }else{ alert('seleccione un tipo de persona')}
    
  /*  if(validarFormatoRFC() == 2 )  
		{
    
    alert("La longitud del RFC debe ser de 13 posiciones");
		
    document.RegistrarCuenta.txtRFC.value = "";
    
    document.RegistrarCuenta.txtRFC.focus(); 
    	return;
    	}
    
      
     if(validarFormatoRFC() == 1 )  
	 	{
    
     alert("Por favor verifique el formato para el RFC ya que es incorrecto");
		
     document.RegistrarCuenta.txtRFC.value = "";
     
     document.RegistrarCuenta.txtRFC.focus(); 
    	return;
    }
  */  
    if(!ValidarCorreo(sCorreo))
   		{
	
	   alert("La cuenta de correo no es válida");
   
	   document.RegistrarCuenta.txtCorreo.focus();
		return;
   		}
      
      document.getElementById('tipoPersona').style.visibility= "hidden";
      document.getElementById('cboTipoD').style.visibility= "hidden";
      document.getElementById('tdtitular').style.visibility= "hidden";
      document.getElementById('txtTitular').style.visibility= "hidden";

	//valida si el usuario usa token
	//1=si
	//0=no
	if(existeToken==1)
		{
		mostrarToken(); 
		return;
		}


      document.RegistrarCuenta.submit();

}


function aceptarToken() 
	{
    
	if(document.RegistrarCuenta.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.RegistrarCuenta.txtToken.focus();
		return;
		}	
   if((document.RegistrarCuenta.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.RegistrarCuenta.txtToken.value="";
		document.RegistrarCuenta.txtToken.focus();
		return;
		}	
	if(isNaN(document.RegistrarCuenta.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.RegistrarCuenta.txtToken.value="";
		document.RegistrarCuenta.txtToken.focus();
		return;
		}		
	document.RegistrarCuenta.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.RegistrarCuenta.txtToken.focus();
}

function ocultarToken() 
{
document.RegistrarCuenta.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

if(document.getElementById('rTP0').checked==false)
    {
      document.getElementById('tipoPersona').style.visibility= "visible";
      document.getElementById('cboTipoD').style.visibility= "visible";
    }
    else 
    {
      document.getElementById('tdtitular').style.visibility= "visible";
      document.getElementById('txtTitular').style.visibility= "visible";
    }

}
function cancelar() {


     document.RegistrarCuenta.txtCuenta.value=""; 

     document.RegistrarCuenta.txtTitular.value=""; 

     document.RegistrarCuenta.txtRFC.value=""; 

     document.RegistrarCuenta.txtCorreo.value=""; 

     document.RegistrarCuenta.txtCuenta.focus();

}

function validacionTercero(existeToken) 
{

    if(document.RegistrarCuenta.txtRFC.value=="") 

     {
      alert("Debes indicar el RFC del Tercero");
      document.RegistrarCuenta.txtRFC.focus();		
      return;
     }
       
    if(!validaLongitud(document.RegistrarCuenta.txtRFC.value))  
		{
    alert("La longitud del RFC debe ser al menos de 13 posiciones para personas morales y de 12 posiciones para personas físicas");		
    document.RegistrarCuenta.txtRFC.value = "";    
    document.RegistrarCuenta.txtRFC.focus(); 
    	return;
    }
    
    if(document.RegistrarCuenta.txtRFC.value.length==13 && validarFormatoRFCMoral() == 1)  
	 	{
    
     alert("Por favor verifique el formato para el RFC ya que es incorrecto");
		
     document.RegistrarCuenta.txtRFC.value = "";
     
     document.RegistrarCuenta.txtRFC.focus(); 
    	return;
    }
          
    else if(document.RegistrarCuenta.txtRFC.value.length==12 && validarFormatoRFCFisica() == 1)  
	 	{
    
     alert("Por favor verifique el formato para el RFC ya que es incorrecto");
		
     document.RegistrarCuenta.txtRFC.value = "";
     
     document.RegistrarCuenta.txtRFC.focus(); 
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

      document.RegistrarCuenta.submit();
      
    }

//////////////////////////////////////
function cancelarTerceros() {

     document.RegistrarCuenta.txtCuenta.value=""; 

     document.RegistrarCuenta.txtRFC.value=""; 
     
     document.RegistrarCuenta.txtConvenio.value=""; 
}

function ValidarCorreo(sCorreo)
{

   if (sCorreo=="")

   {

      return true;

   }

   var c64=0;
   var c46=0;

   

   var iLen = sCorreo.length;

   for (i = 0 ; i < iLen; i++)

   {

      

      if (sCorreo.charCodeAt(i) == 64)

      {

         c64=1;

      }
      

      

      if ((c64==1 && sCorreo.charCodeAt(i) == 64 && sCorreo.charCodeAt(i+1) == 46 )||(c64==1 && sCorreo.charCodeAt(i) == 64 && sCorreo.charCodeAt(i+1) == 46 && sCorreo.charCodeAt(i+2) == 46))

      {

         return false;

      }

      if (c64==1 && sCorreo.charCodeAt(i) == 46)

      {

         c46=1;

      }
      if ((c46==1 && sCorreo.charCodeAt(i) == 46 && sCorreo.charCodeAt(i-1) == 64 )||(c46==1 && sCorreo.charCodeAt(i) == 46 && sCorreo.charCodeAt(i+1) == 46))

      {

         return false;

      }
      

   }


if(sCorreo.charCodeAt(iLen-1) == 46)

	{

         return false;

        }

if(c64==0)
	{
	return false;
	}
if(c46==0)
	{
	return false;
	}

   

   return true;

}


function validaLongitud(rfc) {
//var rfc = document.RegistrarCuenta.txtRFC.value;
 if (rfc.length == 12 || rfc.length == 13)
  return true;
else 
  return false;
}