

function validacion() {



   if(document.CambioPwd.txtAnterior.value == "") 

   {

      alert("Debes indicar tu contraseña anterior");

      document.CambioPwd.txtAnterior.focus();			

   }

   else if(document.CambioPwd.txtNueva.value=="") 

   {

      alert("Debes indicar tu contraseña nueva");

      document.CambioPwd.txtNueva.focus();				

   }

   else if(document.CambioPwd.txtConfirmar.value=="") 

   {

      alert("Debes indicar la confirmación de tu contraseña");

      document.CambioPwd.txtConfirmar.focus();				  	

   }

   else if(document.CambioPwd.txtNueva.value!=document.CambioPwd.txtConfirmar.value) 

   {

      alert("Los campos de \"Contraseña Nueva\" y \"Confimar Contraseña\" no coinciden");

      document.CambioPwd.txtNueva.value="";

      document.CambioPwd.txtConfirmar.value="";

      document.CambioPwd.txtNueva.focus();	

   }



   else if(document.CambioPwd.txtAnterior.value==document.CambioPwd.txtNueva.value) 

   {

      alert("La contraseña nueva debe ser diferente a la actual");

      document.CambioPwd.txtAnterior.value="";

      document.CambioPwd.txtNueva.value="";

      document.CambioPwd.txtConfirmar.value="";

      document.CambioPwd.txtAnterior.focus();	

   }

   else if((document.CambioPwd.txtNueva.value).length!=8&&(document.CambioPwd.txtConfirmar.value).length!=8) 

      {

      alert("La Contraseña debe ser de 8 caracteres");

      document.CambioPwd.txtNueva.value="";

      document.CambioPwd.txtConfirmar.value="";

      document.CambioPwd.txtNueva.focus();	

     }

  else if((document.CambioPwd.txtNueva.value).length==8&&(document.CambioPwd.txtConfirmar.value).length==8&&document.CambioPwd.txtNueva.value==document.CambioPwd.txtConfirmar.value) 

      {

	var Case=0;

     	
/*
     for(var i=0;i<(document.CambioPwd.txtConfirmar.value).length;i++)

	if((document.CambioPwd.txtConfirmar.value).charCodeAt(i)>64&&(document.CambioPwd.txtConfirmar.value).charCodeAt(i)<91)

		{

		Case=1;

		}

*/

	if(Case==1)

	{

	      alert("El formato de la contraseña debe ser en minusculas");

	      document.CambioPwd.txtNueva.value="";

	      document.CambioPwd.txtConfirmar.value="";

	      document.CambioPwd.txtNueva.focus();



	}



	else

  	 {

	 document.CambioPwd.submit();

   	 }

	

     }

   



  

}





function cancelar()

{



   document.CambioPwd.txtAnterior.value="";

   document.CambioPwd.txtNueva.value="";

   document.CambioPwd.txtConfirmar.value="";

   document.CambioPwd.txtAnterior.focus();	

}









