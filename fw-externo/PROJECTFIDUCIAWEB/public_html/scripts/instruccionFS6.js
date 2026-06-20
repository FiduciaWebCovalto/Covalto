function ObtenerDatos(iCbo)
{
   if (iCbo == 1)
   {
      if(document.CompromisoCan.cboEjercicio.selectedIndex==0) 
      {
         document.CompromisoCan.cboEjercicio.focus();
      }
      else
      {
         document.CompromisoCan.submit();
      }
   }
   else if(iCbo==2)
   {
      if (document.CompromisoCan.cboEje.selectedIndex==0) 
      {
         document.CompromisoCan.cboEje.focus();
      }
      else
      {
         document.CompromisoCan.submit();
      }
   }
   else if(iCbo==3)
   {
      if (document.CompromisoCan.cboPrograma.selectedIndex==0) 
      {
         document.CompromisoCan.cboPrograma.focus();
      }
      else
      {
         document.CompromisoCan.submit();
      }
   }
   else if(iCbo==4)
   {
      if (document.CompromisoCan.cboProyecto.selectedIndex==0) 
      {
         document.CompromisoCan.cboProyecto.focus();
      }
      else
      {
         document.CompromisoCan.submit();
      }
   }
   else if(iCbo==5)
   {
      if (document.CompromisoCan.cboAccion.selectedIndex==0) 
      {
         document.CompromisoCan.cboAccion.focus();
      }
      else
      {
         document.CompromisoCan.submit();
      }
   }
}

function cancelar() 
{
   document.CompromisoCan.cboEjercicio.selectedIndex=0;
   document.CompromisoCan.cboEje.selectedIndex=0;
   document.CompromisoCan.cboPrograma.selectedIndex=0;
   document.CompromisoCan.cboProyecto.selectedIndex=0;
   document.CompromisoCan.cboAccion.selectedIndex=0;
   document.CompromisoCan.txtImporte1.value="";
   document.CompromisoCan.txtImporte2.value="";
   document.CompromisoCan.txtImporte3.value="";
   document.CompromisoCan.txtImpFed.value="";
   document.CompromisoCan.txtImpEst.value="";
   document.CompromisoCan.txtImpRen.value="";
   document.CompromisoCan.txtImporte.value="";
   document.CompromisoCan.txtAcuerdo.value="";
}

function ValidarDatos(existeToken)
{
   if(document.CompromisoCan.cboEjercicio.selectedIndex==0)
   {
      alert("Selecciona un Ejercicio");   
      document.CompromisoCan.cboEjercicio.focus();
      return;
   }
   else if(document.CompromisoCan.cboEje.selectedIndex==0)
   {
      alert("Selecciona un Eje");
      document.CompromisoCan.cboEje.focus();
      return;
   }     
   else if(document.CompromisoCan.cboPrograma.selectedIndex==0)
   {
      alert("Selecciona un Programa");
      document.CompromisoCan.cboPrograma.focus();
      return;
   }     
   else if(document.CompromisoCan.cboProyecto.selectedIndex==0)
   {
      alert("Selecciona un Proyecto");
      document.CompromisoCan.cboProyecto.focus();
      return;
   }     
   else if(document.CompromisoCan.cboAccion.selectedIndex==0)
   {
      alert("Selecciona una Accion");
      document.CompromisoCan.cboAccion.focus();
      return;
   }
   else if(document.CompromisoCan.txtAcuerdo.value=="")
   {
      alert("Indica el Acuerdo de Comite o Carta de Instrucción");
      document.CompromisoCan.txtAcuerdo.focus();
      return;
   }
   else if(validaConcepto(document.CompromisoCan.txtAcuerdo.value))
   {
      alert("La coma, comilla simple y comillas  no son caracteres validos");
      document.CompromisoCan.txtAcuerdo.focus();
      return;
   }
   else if(document.CompromisoCan.txtImporte1.value=="" && document.CompromisoCan.txtImporte2.value==""  && document.CompromisoCan.txtImporte3.value=="")
   {
      alert("Debes indicar el monto a comprometer");
      document.CompromisoCan.txtImporte1.focus();
      return;
   }
  else
   {
	//valida si el usuario usa token
	//1=si
	//0=no
	if(existeToken==1)
		{
		mostrarToken(); 
		return;
		}
	   
      document.CompromisoCan.action="confirmarInst_FS6.jsp";
      document.CompromisoCan.submit();
   }
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

function aceptarToken() 
	{
	if(document.CompromisoCan.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.CompromisoCan.txtToken.focus();
		return;
		}	
   if((document.CompromisoCan.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.CompromisoCan.txtToken.value="";
		document.CompromisoCan.txtToken.focus();
		return;
		}	
	if(isNaN(document.CompromisoCan.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.CompromisoCan.txtToken.value="";
		document.CompromisoCan.txtToken.focus();
		return;
		}		
	document.CompromisoCan.action="confirmarInst_FS6.jsp";
	document.CompromisoCan.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.CompromisoCan.txtToken.focus();
}

function ocultarToken() 
{
document.CompromisoCan.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}
