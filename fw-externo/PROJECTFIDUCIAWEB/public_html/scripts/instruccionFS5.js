
function ObtenerDatos(iCbo)
{
   if (iCbo == 1)
   {
      if(document.Compromiso.cboEjercicio.selectedIndex==0) 
      {
         document.Compromiso.cboEjercicio.focus();
      }
      else
      {
         document.Compromiso.submit();
      }
   }
   else if(iCbo==2)
   {
      if (document.Compromiso.cboEje.selectedIndex==0) 
      {
         document.Compromiso.cboEje.focus();
      }
      else
      {
         document.Compromiso.submit();
      }
   }
   else if(iCbo==3)
   {
      if (document.Compromiso.cboPrograma.selectedIndex==0) 
      {
         document.Compromiso.cboPrograma.focus();
      }
      else
      {
         document.Compromiso.submit();
      }
   }
   else if(iCbo==4)
   {
      if (document.Compromiso.cboProyecto.selectedIndex==0) 
      {
         document.Compromiso.cboProyecto.focus();
      }
      else
      {
         document.Compromiso.submit();
      }
   }
   else if(iCbo==5)
   {
      if (document.Compromiso.cboAccion.selectedIndex==0) 
      {
         document.Compromiso.cboAccion.focus();
      }
      else
      {
         document.Compromiso.submit();
      }
   }
}

function cancelar() 
{
   document.Compromiso.cboEjercicio.selectedIndex=0;
   document.Compromiso.cboEje.selectedIndex=0;
   document.Compromiso.cboPrograma.selectedIndex=0;
   document.Compromiso.cboProyecto.selectedIndex=0;
   document.Compromiso.cboAccion.selectedIndex=0;
   document.Compromiso.txtImporte1.value="";
   document.Compromiso.txtImporte2.value="";
   document.Compromiso.txtImporte3.value="";
   document.Compromiso.txtImpFed.value="";
   document.Compromiso.txtImpEst.value="";
   document.Compromiso.txtImpRen.value="";
   document.Compromiso.txtImporte.value="";
   document.Compromiso.txtAcuerdo.value="";
   document.Compromiso.txtConcepto.value="";
}

function ValidarDatos(existeToken)
{
   if(document.Compromiso.cboEjercicio.selectedIndex==0)
   {
      alert("Selecciona un Ejercicio");   
      document.Compromiso.cboEjercicio.focus();
      return;
   }
   else if(document.Compromiso.cboEje.selectedIndex==0)
   {
      alert("Selecciona un Eje");
      document.Compromiso.cboEje.focus();
      return;
   }     
   else if(document.Compromiso.cboPrograma.selectedIndex==0)
   {
      alert("Selecciona un Programa");
      document.Compromiso.cboPrograma.focus();
      return;
   }     
   else if(document.Compromiso.cboProyecto.selectedIndex==0)
   {
      alert("Selecciona un Proyecto");
      document.Compromiso.cboProyecto.focus();
      return;
   }     
   else if(document.Compromiso.cboAccion.selectedIndex==0)
   {
      alert("Selecciona una Accion");
      document.Compromiso.cboAccion.focus();
      return;
   }
   else if(document.Compromiso.txtAcuerdo.value=="")
   {
      alert("Debes indicar el Acuerdo de Comite o Carta de Instruccion");
      document.Compromiso.txtAcuerdo.focus();
      return;
   }
   else if(validaConcepto(document.Compromiso.txtAcuerdo.value))
   {
      alert("La coma, comilla simple y comillas  no son caracteres validos");
      document.Compromiso.txtAcuerdo.focus();
      return;
   }
   else if(document.Compromiso.txtImporte1.value=="" && document.Compromiso.txtImporte2.value==""  && document.Compromiso.txtImporte3.value=="")
   {
      alert("Debes indicar el monto a comprometer");
      document.Compromiso.txtImporte1.focus();
      return;
   }
   else if(document.Compromiso.txtConcepto.value!="" && validaConcepto(document.Compromiso.txtConcepto.value))
       {
       alert("Favor de verificar la  redacción del Concepto de Gasto, la coma,comilla simple y comillas no son caracteres validos");
       document.Compromiso.txtConcepto.focus();
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
	   
      document.Compromiso.action="confirmarInst_FS6.jsp";
      document.Compromiso.submit();
   }
}
function aceptarToken() 
	{
	if(document.Compromiso.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.Compromiso.txtToken.focus();
		return;
		}	
   if((document.Compromiso.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.Compromiso.txtToken.value="";
		document.Compromiso.txtToken.focus();
		return;
		}	
	if(isNaN(document.Compromiso.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.Compromiso.txtToken.value="";
		document.Compromiso.txtToken.focus();
		return;
		}		
	document.Compromiso.action="confirmarInst_FS6.jsp";
	document.Compromiso.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.Compromiso.txtToken.focus();
}

function ocultarToken() 
{
document.Compromiso.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

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