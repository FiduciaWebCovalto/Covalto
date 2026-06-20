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





function suma()
  {
	 		var importe1= document.RetiroFS.txtImporte1.value;
			var importe2= document.RetiroFS.txtImporte2.value;
			var importe3= document.RetiroFS.txtImporte3.value;
			var importeTotal=0.00;
			
			if (importe1.length>0)
				{
				if(!isNaN(importe1))importe1= parseFloat(document.RetiroFS.txtImporte1.value);
				}
			else
				{
				importe1=parseFloat("0.00");
				}
				
			if (importe2.length>0)
				{
				if(!isNaN(importe2))importe2= parseFloat(document.RetiroFS.txtImporte2.value);
				}
			else
				{
				importe2=parseFloat("0.00");
				}
						
			if (importe3.length>0)
				{
				if(!isNaN(importe3))importe3= parseFloat(document.RetiroFS.txtImporte3.value);
				}
			else
				{
				importe3=parseFloat("0.00");
				}
			
			 importeTotal= importe1+importe2+importe3;
		
									
									
			if(importeTotal>parseInt(importeTotal))
					{
					document.RetiroFS.txtImporte.value=parseInt(importeTotal)+(Math.round(((importeTotal-parseInt(importeTotal))*100))/100);
					document.RetiroFS.txtImporteR.value=parseInt(importeTotal)+(Math.round(((importeTotal-parseInt(importeTotal))*100))/100);			
					}
			else	{
					document.RetiroFS.txtImporte.value=importeTotal+".00";
					document.RetiroFS.txtImporteR.value=importeTotal+".00";							
					}
										
		  setTimeout("suma()", 0);
  }


function inicioRetiro()
  {
  document.RetiroFS.cboFormaR.selectedIndex=0;
  document.RetiroFS.submit();
  }
  


function Mostrar(forma)
{
	if(forma==0)
	   	document.RetiroFS.action = "FI_InstruccionFS2_Imp.jsp";
	else if(forma==2)
	   	document.RetiroFS.action = "FI_InstruccionFS2_Imp.jsp#pagosM";	
	else
	   	document.RetiroFS.action = "FI_InstruccionFS2_Imp.jsp#formaPago";
	document.RetiroFS.submit();
}

function cancelar() 
{
  document.RetiroFS.cboEjercicio.selectedIndex=0;
  document.RetiroFS.cboEje.selectedIndex=0;
  document.RetiroFS.cboPrograma.selectedIndex=0;
  document.RetiroFS.cboProyecto.selectedIndex=0;
  document.RetiroFS.cboAccion.selectedIndex=0;
  document.RetiroFS.cboFormaR.selectedIndex=0;
  document.RetiroFS.txtImporteR.value="";
  document.RetiroFS.txtMetaR.value="";
  document.RetiroFS.submit();   
}