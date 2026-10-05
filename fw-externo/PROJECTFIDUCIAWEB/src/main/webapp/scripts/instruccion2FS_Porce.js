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


  function porcentajes(porEstatal,porFederal)
  {
  var porE=porEstatal/100;
  var porF=porFederal/100;
  var importeTotal=0.00; 			
  if (!isNaN(document.RetiroFS.txtImporteR.value))
			{
			importeTotal= document.RetiroFS.txtImporteR.value;
			document.RetiroFS.txtImporte1P.value=parseFloat(importeTotal*porE);
			document.RetiroFS.txtImporte1P.value=parseInt(document.RetiroFS.txtImporte1P.value)+(Math.round(((document.RetiroFS.txtImporte1P.value-parseInt(document.RetiroFS.txtImporte1P.value))*100))/100);
			document.RetiroFS.txtImporte2P.value=parseFloat(importeTotal*porF);
    		document.RetiroFS.txtImporte2P.value=parseInt(document.RetiroFS.txtImporte2P.value)+(Math.round(((document.RetiroFS.txtImporte2P.value-parseInt(document.RetiroFS.txtImporte2P.value))*100))/100);
			
			document.RetiroFS.txtImporte1.value=document.RetiroFS.txtImporte1P.value;
			document.RetiroFS.txtImporte2.value=document.RetiroFS.txtImporte2P.value;
			  if (parseFloat(importeTotal)!=(parseFloat(document.RetiroFS.txtImporte1P.value)+parseFloat(document.RetiroFS.txtImporte2P.value)))
				  {
				  if(porE>porF && parseFloat(importeTotal*porE)>0)
					{
					document.RetiroFS.txtImporte1P.value = parseFloat(importeTotal)-parseFloat(document.RetiroFS.txtImporte2P.value);
					document.RetiroFS.txtImporte1P.value = parseInt(document.RetiroFS.txtImporte1P.value)+(Math.round(((document.RetiroFS.txtImporte1P.value-parseInt(document.RetiroFS.txtImporte1P.value))*100))/100);
					document.RetiroFS.txtImporte1.value  = document.RetiroFS.txtImporte1P.value;
					}
				   if(porE<porF  && parseFloat(importeTotal*porF)>0)
					{
					document.RetiroFS.txtImporte2P.value = parseFloat(importeTotal)-parseFloat(document.RetiroFS.txtImporte1P.value);
					document.RetiroFS.txtImporte2P.value = parseInt(document.RetiroFS.txtImporte2P.value)+(Math.round(((document.RetiroFS.txtImporte2P.value-parseInt(document.RetiroFS.txtImporte2P.value))*100))/100);
					document.RetiroFS.txtImporte2.value = document.RetiroFS.txtImporte2P.value;
					}
				  }
			}
	 	else
			{
		 	document.RetiroFS.txtImporte1P.value="0.00";
			document.RetiroFS.txtImporte2P.value="0.00";					
			document.RetiroFS.txtImporte1.value="0.00";
			document.RetiroFS.txtImporte2.value="0.00";			
			}
  setTimeout("porcentajes("+porEstatal+","+porFederal+")",0);
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

function inicioRetiro()
  {
  document.RetiroFS.cboFormaR.selectedIndex=0;
  document.RetiroFS.submit();
  }
  
function saldo()
  {
  alert("La Accion no tiene Saldos...\nSelecciona otra Accion");
  document.RetiroFS.cboAccion.focus();
 }

function Mostrar(forma)
{
	if(forma==0)
	   	document.RetiroFS.action = "FI_InstruccionFS2_Porce.jsp";
	else if(forma==2)
	   	document.RetiroFS.action = "FI_InstruccionFS2_Porce.jsp#pagosM";	
	else
	   	document.RetiroFS.action = "FI_InstruccionFS2_Porce.jsp#formaPago";
	document.RetiroFS.submit();
}

