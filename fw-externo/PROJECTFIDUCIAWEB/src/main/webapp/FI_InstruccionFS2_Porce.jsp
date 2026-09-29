<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.RetirosDB"/>
<jsp:useBean id="ct"  class="com.bancomext.negocio.nAcuerdos"/>
<%@ include file="sesionInstrucc.jsp" %>

<%
	String radioTipoPersona=request.getParameter("radioTipoPersona");
%>

<%
int numFiso=Integer.parseInt((String)session.getAttribute( "NumFid" ));
int l=0;
double saldoE=0.0;
double saldoF=0.0;
double saldoTotal=0.0;
String forma=request.getParameter("cboFormaR");
String tokenid=(String)session.getAttribute("token");
String opcion=(request.getParameter("iOpcion")==null)?"":request.getParameter("iOpcion").trim();
String hidden=(request.getParameter("txtHiddenPersona")==null)?"0":request.getParameter("txtHiddenPersona").trim();
String sTercero= (request.getParameter("txtPersonaR")==null)?"":request.getParameter("txtPersonaR").trim();	

String pagosM=request.getParameter("pagosM");
String sCta[]=null;
String sData []=null;
String sCtaAnt=null;
String sPais[] = null;
String sMoneda[] = null;
String persona = (request.getParameter("cboNomPer")==null)?"":request.getParameter("cboNomPer").trim();

String sTipoCont="0";
sTipoCont=(String)session.getAttribute("TpoCont");
int i;
i= (int)Integer.parseInt(sTipoCont);

String Ejercicio=request.getParameter("cboEjercicio")!=null ? request.getParameter("cboEjercicio").trim() : "";
String Eje=request.getParameter("cboEje");
		 Eje=Eje!=null && !Eje.trim().equals("Selecciona un Eje") ? Eje.substring(0,Eje.indexOf('-')).trim() : "";
String Programa=request.getParameter("cboPrograma");
		 Programa=Programa!=null && !Programa.trim().equals("Selecciona un Programa") ? Programa.substring(0,Programa.indexOf('-')).trim(): "";
String Proyecto=request.getParameter("cboProyecto");
     	 Proyecto=Proyecto!=null && !Proyecto.trim().equals("Selecciona un Proyecto") ? Proyecto.substring(0,Proyecto.indexOf('-')).trim(): "";
String Accion=request.getParameter("cboAccion");
		Accion=Accion!=null && !Accion.trim().equals("Selecciona una Accion") ? Accion.substring(0,Accion.indexOf('-')).trim() : "";
String Comprometido=request.getParameter("comprometido")!=null?request.getParameter("comprometido"):"NO";				   

//Importes Porcentuales
if(!Accion.equals(""))
				  {    
					int  tipoSaldo=2; 
					if(Comprometido.equals("NO"))
							tipoSaldo=1;
					saldoE=BD.getSaldoRecursos((String)session.getAttribute( "NumFid" ),Ejercicio,Eje,Programa,Proyecto,Accion,"2",tipoSaldo);
					saldoF=BD.getSaldoRecursos((String)session.getAttribute( "NumFid" ),Ejercicio,Eje,Programa,Proyecto,Accion,"1",tipoSaldo);
					if(saldoE<0 && saldoF>=0 )
							saldoTotal=saldoF;//+ saldoR;
					else 	if(saldoF<0 && saldoE>=0 )
								saldoTotal=saldoE;//+ saldoR;
							else
								saldoTotal=saldoE+saldoF;//+ saldoR;
					 }

//Forma de Liquidaci�n
if(forma!=null  &&  pagosM==null)
	{
			forma=forma.trim();
			if(forma.equals("3"))
				{
				}
			if(forma.equals( "SPEUA"))
				{
				sData=new String[5];
				sCtaAnt = (request.getParameter("cboCuentaSpeuaR")==null)?"":request.getParameter("cboCuentaSpeuaR");
				sCta =BD.getData(9,(String)session.getAttribute( "NumFid" )); 
				
				if (!sCtaAnt.equals("") && !sCtaAnt.equals("Selecciona Cuenta"))
					   {
 					    sData=BD.getDataCuenta(3,sCtaAnt);
     					}
					} //termina 
			if(forma.equals("18"))
				{ 
				sData=new String[5];
   				sCtaAnt = (request.getParameter("cboCuentaSiacR")==null)?"":request.getParameter("cboCuentaSiacR");
				sCta = BD.getData(11+i,(String)session.getAttribute( "NumFid" )); 
  	  		    if (!sCtaAnt.equals("") && !sCtaAnt.equals("Selecciona Cuenta"))
   						{
     			     sData=BD.getDataCuenta(1,sCtaAnt);
      					 }
				}   		
			if(forma.equals("19"))
				{ 
				sData=new String[5];
   				sCtaAnt = (request.getParameter("cboCuentaTbcR")==null)?"":request.getParameter("cboCuentaTbcR");
   				//Cuentas bancomer
			   sCta = BD.getData(9+i,(String)session.getAttribute( "NumFid" )); 
			   if (!sCtaAnt.equals("") && !sCtaAnt.equals("Selecciona Cuenta"))
				   {
      			     sData=BD.getDataCuenta(2,sCtaAnt);
     				 }
				}   
			if(forma.equals("20") ||  forma.equals("23")){ 
				sData=new String[5];//informacion de la cuenta seleccionada
 				sCtaAnt=(request.getParameter("cboCuentaPagoR")==null)?"":request.getParameter("cboCuentaPagoR");
				 //arreglo con las cuentas TEF del Fiso
				sCta = BD.getData(13+i,(String)session.getAttribute( "NumFid" ) + " AND cdp_rfc IS NOT NULL "); 
			 	if (!sCtaAnt.equals("") && !sCtaAnt.trim().equals("Selecciona Cuenta")) { 
			    	  sData=BD.getDataCuenta(3,sCtaAnt);//recupera datos de la cuenta seleccionada    
     				}
				}   
			if(forma.equals("21")) {   
				   sPais =BD.getData(4,"");
				   sMoneda =BD.getData(3,"");
   				}   
   				
      if(forma.equals("24") || forma.equals("25") || forma.equals("26")){
		sData=new String[5];//informacion de la cuenta seleccionada
		sCtaAnt=(request.getParameter("cboCuentaPagoR")!=null)?request.getParameter("cboCuentaPagoR"):"";
		//arreglo con las cuentas Bancomer CIE del Fiso
		sCta = BD.getData(26,(String)session.getAttribute( "NumFid" ) + "," + forma); 
		if (!sCtaAnt.equals("") && !(sCtaAnt.trim().equals("Selecciona Cuenta") || sCtaAnt.trim().equals("Selecciona Convenio"))){ 
			sData=BD.getDataCuenta(4,sCtaAnt);//recupera datos de la cuenta seleccionada
        }
      }
      
	}//fin cboForma != null
%>
<HTML>
<HEAD><TITLE>Retiro - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" SRC='scripts/general.js'>
</script>
<script language="JavaScript" SRC='scripts/instruccion2FS_Porce.js'>
</script>
<script  language="JavaScript" >
						function ABAR()
							{
								document.RetiroFS.action = "FI_InstruccionFS2_Porce.jsp#codigoSWIFT";
                				document.RetiroFS.txtCodigoSWIFT.value = document.getElementById("rdCodigoSWIFTABA").value;
								document.RetiroFS.submit();
							}	
						function IBANR()
							{
									document.RetiroFS.action = "FI_InstruccionFS2_Porce.jsp#codigoSWIFT"; 
                  					document.RetiroFS.txtCodigoSWIFT.value = document.getElementById("rdCodigoSWIFTIBAN").value;
									document.RetiroFS.submit();
							}

	function altaPersona(opcion) {
	   if(opcion)
		document.RetiroFS.iOpcion.value = 2;
		document.RetiroFS.action = "FI_InstruccionFS2_Porce.jsp#formaPago";
		document.RetiroFS.submit();
	}
	
	function validaAltaPersona() {
	   if(document.RetiroFS.txtPersonaR.value == "") {
		 alert("Debe capturar el nombre de la persona");
		 document.RetiroFS.txtPersonaR.focus();
		} 
	  else {
		 document.RetiroFS.txtHiddenPersona.value = 2;
		 document.RetiroFS.action = "FI_InstruccionFS2_Porce.jsp#formaPago?txtPersonaR="+document.RetiroFS.txtPersonaR.value;
		 document.RetiroFS.submit();
	  }  
	}

function validacion(existeToken) 
	{
	var Meta= document.RetiroFS.txtMetaR.value;
	var longitudMeta=Meta.length;
	document.RetiroFS.txtFormaLiq.value= document.RetiroFS.cboFormaR.options[document.RetiroFS.cboFormaR.selectedIndex].text 

	if( document.RetiroFS.cboEjercicio.selectedIndex==0)    
 	  {
   	   alert("Selecciona un Ejercicio");
   	   document.RetiroFS.cboEjercicio.focus();
	   return;
   	  }
      
      if( document.RetiroFS.cboEje.selectedIndex==0)    
     		{	
     		 alert("Selecciona el Eje del Retiro");
      		document.RetiroFS.cboEje.focus(); 
			return;
     		}
	if( document.RetiroFS.cboPrograma.selectedIndex==0)    
     		{	
     		 alert("Selecciona el Programa del Eje");
      		document.RetiroFS.cboPrograma.focus(); 
			return;
     		}
	if( document.RetiroFS.cboProyecto.selectedIndex==0)    
     		{	
     		 alert("Selecciona el Proyecto del Programa");
      		document.RetiroFS.cboProyecto.focus(); 
			return;
     		}
	if( document.RetiroFS.cboAccion.selectedIndex==0)    
     		{	
     		 alert("Selecciona la Accion del Proyecto");
      		document.RetiroFS.cboAccion.focus(); 
			return;
     		}
     if( document.RetiroFS.txtImporteR.value=="")
     		{	
     		 alert("Debes indicar el Importe del Retiro");
      		document.RetiroFS.txtImporteR.focus(); 
			return;
     		}
		 	
	if( document.RetiroFS.cboAcuerdosComiteTec.selectedIndex==0)    
     		{	
     		 alert("Debes indicar el Acuerdo del Comite T�cnico");
      		document.RetiroFS.cboAcuerdosComiteTec.focus(); 
			return;
     		}

    if( document.RetiroFS.txtMetaR.value=="")    
		      {
		      alert("Debes indicar el Concepto del Retiro");
		      document.RetiroFS.txtMetaR.focus(); 
			  return;
		       }
	if( validaConcepto(document.RetiroFS.txtMetaR.value))
		{
		alert("Favor de verificar la  redacci�n del Concepto.\nLa coma, comilla simple y comillas no son caracteres validos");
		document.RetiroFS.txtMetaR.focus();
		return;
		  }
	if( document.RetiroFS.cboFormaR.selectedIndex==0)    
      		{
	        alert("Selecciona una Forma de Pago");
      		document.RetiroFS.cboFormaR.focus();
			return;
	        }
	<%if(pagosM==null)
			{%>		
    if( document.RetiroFS.cboFormaR.selectedIndex>0 && <%="'"+(forma==null?"Selecciona Forma":forma)+"'"%>!= document.RetiroFS.cboFormaR.value  )    
      		{
	        alert("Espera a que se termine de cargar la pagina");
			return;
	        }		
			
		<%}
if(forma!=null  &&  pagosM==null)
	{
	forma=forma.trim();
	if(forma.equals( "3"))
	{
			if(sTipoCont.equals("1")) {%>
			
			if( document.RetiroFS.cboBancoChequeR.selectedIndex==0)    
				{
				alert("Selecciona un Banco");
				document.RetiroFS.cboBancoChequeR.focus();
				return;
				}					
			if( document.RetiroFS.cboNomPer.selectedIndex==0)    
					{
					alert("Debes indicar el Nombre del Beneficiario");
					document.RetiroFS.cboNomPer.focus();
					return;
					}		
			<%}
				else		
		{%>
		
			if( document.RetiroFS.cboBancoChequeR.selectedIndex==0)    
      			{
		        alert("Selecciona un Banco");
    	  		document.RetiroFS.cboBancoChequeR.focus();
				return;
	    	    }

		if( document.RetiroFS.txtBeneficiarioChequeR.value=="")    
      		{
	        alert("Debes indicar el Nombre del Beneficiario");
      		document.RetiroFS.txtBeneficiarioChequeR.focus();
			return;
	        }
			
	   if(validaConcepto(document.RetiroFS.txtBeneficiarioChequeR.value))    
      		{
	        alert("La coma, comilla simple y comillas no son caracteres validos");
      		document.RetiroFS.txtBeneficiarioChequeR.focus();
			return;
	        }
		<%}
	}
	if(forma.equals( "SPEUA"))
		{ 
		if(sCta!=null)
			{%> 
			
			if(document.RetiroFS.cboCuentaSpeuaR.selectedIndex==0)    
			  		{
    			   alert("Selecciona el N�mero de Cuenta");
    			   document.RetiroFS.cboCuentaSpeuaR.focus();	
				   return;
   					}
	 	  if(document.RetiroFS.cboCuentaSpeuaR.selectedIndex!=0&&document.RetiroFS.txtPlazaSpeuaR.value==""&&document.RetiroFS.txtTitularSpeuaR.value=="")    
   					{
					document.RetiroFS.cboCuentaSpeuaR.selectedIndex=0;
    	 		  	 alert("Selecciona un N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
				 	 document.RetiroFS.cboCuentaSpeuaR.focus();
					 return;
					}
			if(document.RetiroFS.cboCuentaSpeuaR.selectedIndex!=0&&document.RetiroFS.txtPlazaSpeuaR.value=="null"&&document.RetiroFS.txtTitularSpeuaR.value=="null")    
    	  			{
					document.RetiroFS.cboCuentaSpeuaR.selectedIndex=0;
	    	        alert("Selecciona un N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
   		    	    document.RetiroFS.cboCuentaSpeuaR.focus();		
					return;
                	}
				<%}
			} 
	if(forma.equals("18"))
			{%>
				if(document.RetiroFS.cboCuentaSiacR.selectedIndex==0)    
						{
						alert("Selecciona el N�mero de Cuenta Banxico");
						document.RetiroFS.cboCuentaSiacR.focus();
						return;
						}
				if(document.RetiroFS.cboCuentaSiacR.selectedIndex!=0&&document.RetiroFS.txtInstitucionSiacR.value=="")    
						{
						document.RetiroFS.cboCuentaSiacR.selectedIndex=0; 	
						document.RetiroFS.cboCuentaSiacR.focus();
						alert("Selecciona un N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
						return;
						}
				if(document.RetiroFS.cboCuentaSiacR.selectedIndex!=0&&document.RetiroFS.txtInstitucionSiacR.value=="null")    
						{
						document.RetiroFS.cboCuentaSiacR.selectedIndex=0; 	
						document.RetiroFS.cboCuentaSiacR.focus();
						alert("Selecciona un N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
						return;
						}						
												
			<%}   
	if(forma.equals("19"))
		{%>
			if(document.RetiroFS.cboCuentaTbcR.selectedIndex==0)    
				{
				alert("Selecciona el No. de Cuenta");
				document.RetiroFS.cboCuentaTbcR.focus();
				return;
				}
		
			if(document.RetiroFS.cboCuentaTbcR.selectedIndex!=0&&document.RetiroFS.txtPlazaTbcR.value==""&&document.RetiroFS.txtTitularTbcR.value=="")    
				{
				document.RetiroFS.cboCuentaTbcR.selectedIndex=0; 	
				document.RetiroFS.cboCuentaTbcR.focus();
				alert("Selecciona un N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
				return;
				}
			if(document.RetiroFS.cboCuentaTbcR.selectedIndex!=0&&document.RetiroFS.txtPlazaTbcR.value=="null"&&document.RetiroFS.txtTitularTbcR.value=="null")    
				{
				document.RetiroFS.cboCuentaTbcR.selectedIndex=0; 	
				document.RetiroFS.cboCuentaTbcR.focus();
				alert("Selecciona un N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
				return;
				}
		<%}   
	if(forma.equals("20") ||  forma.equals("23"))
		{%>
		
		if(document.RetiroFS.cboCuentaPagoR.value=="" || document.RetiroFS.cboCuentaPagoR.value=="Selecciona Cuenta")    
				{
				alert("Selecciona n�mero de Cuenta");
				document.RetiroFS.cboCuentaPagoR.focus();
				return;
				}
		if(document.RetiroFS.cboCuentaPagoR.selectedIndex!=0&&document.RetiroFS.txtPlazaPagoR.value==""&&document.RetiroFS.txtTitularPagoR.value=="")    
				{
				document.RetiroFS.cboCuentaPagoR.selectedIndex=0; 	
				document.RetiroFS.cboCuentaPagoR.focus();
				alert("Selecciona un N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
				return;
				}
		if(document.RetiroFS.cboCuentaPagoR.selectedIndex!=0&&document.RetiroFS.txtPlazaPagoR.value=="null"&&document.RetiroFS.txtTitularPagoR.value=="null")    
				{
				document.RetiroFS.cboCuentaPagoR.selectedIndex=0; 	
				document.RetiroFS.cboCuentaPagoR.focus();
				alert("Selecciona un N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
				return;
				}	
		<%}

	if(forma.equals("24") || forma.equals("25") || forma.equals("26"))
	
		{%>
		if(document.RetiroFS.cboCuentaPagoR.value=="" || document.RetiroFS.cboCuentaPagoR.value == "Selecciona Cuenta"|| document.RetiroFS.cboCuentaPagoR.value == "Selecciona Convenio")
				{
				<%if(request.getParameter("cboFormaR").trim().equals("26")){%>
					alert("Selecciona N�mero de Cuenta");
				<%}else{%>
					alert("Selecciona N�mero de Convenio");
				<%}%>
				document.RetiroFS.cboCuentaPagoR.focus();				
				return;
				}
		if(document.RetiroFS.cboCuentaPagoR.selectedIndex != 0 && document.RetiroFS.txtPlazaPagoR.value == "" && document.RetiroFS.txtTitularPagoR.value == "")    
				{
				document.RetiroFS.cboCuentaPagoR.selectedIndex=0; 	
				document.RetiroFS.cboCuentaPagoR.focus();
				<%if(request.getParameter("cboFormaR").trim().equals("26")){%>
					alert("Selecciona N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
				<%}else{%>
					alert("Selecciona N�mero de Convenio y espera a que se cargue la informaci�n correspondiente");
				<%}%>
				return;
				}
		if(document.RetiroFS.cboCuentaPagoR.selectedIndex != 0 && document.RetiroFS.txtPlazaPagoR.value == "null" && document.RetiroFS.txtTitularPagoR.value == "null")    
				{
				document.RetiroFS.cboCuentaPagoR.selectedIndex = 0; 	
				document.RetiroFS.cboCuentaPagoR.focus();
				<%if(request.getParameter("cboFormaR").trim().equals("26")){%>
					alert("Selecciona N�mero de Cuenta y espera a que se cargue la informaci�n correspondiente");
				<%}else{%>
					alert("Selecciona N�mero de Convenio y espera a que se cargue la informaci�n correspondiente");
				<%}%>
				return;
				}
		if(document.RetiroFS.cboCuentaPagoR.value!="" && document.RetiroFS.cboCuentaPagoR.value != "Selecciona Cuenta" && document.RetiroFS.cboCuentaPagoR.value != "Selecciona Convenio")
				{
				<%if(forma.trim().equals("24")){%>
					if(document.RetiroFS.txtReferencia.value == ""){
						alert("Deben indicar la Referencia del Convenio");
						document.RetiroFS.txtReferencia.focus();				
						return;
					}
				<%}%>
			}
		<%}

	if(forma.equals("21"))
		{%>
		if(document.RetiroFS.cboPaisDSwiftR.selectedIndex==0)    
				{
				alert("Selecciona el Pa�s del Banco Domiciliario");
				document.RetiroFS.cboPaisDSwiftR.focus();
				return;
				}
		if(document.RetiroFS.txtCiudadDSwiftR.value=="")    
				{
				alert("Debes indicar la ciudad del Banco Domiciliario");
				document.RetiroFS.txtCiudadDSwiftR.focus();
				return;
				}
	    if(validaConcepto(document.RetiroFS.txtCiudadDSwiftR.value))    
      		{
	        alert("La coma, comilla simple y comillas no son caracteres validos");
      		document.RetiroFS.txtCiudadDSwiftR.focus();
			return;
	        }				
		if(document.RetiroFS.txtBancoDSwiftR.value=="")    
				{
				alert("Debes indicar el Banco");
				document.RetiroFS.txtBancoDSwiftR.focus();
				return;
				}
	   if(validaConcepto(document.RetiroFS.txtBancoDSwiftR.value))    
      		{
	        alert("La coma, comilla simple y comillas no son caracteres validos");
      		document.RetiroFS.txtBancoDSwiftR.focus();
			return;
	        }				
		if(document.RetiroFS.txtPlazaSwiftR.value=="")    
				{
				alert("Debes indicar la Plaza del Banco Domiciliario");
				document.RetiroFS.txtPlazaSwiftR.focus();
				return;
				}
	  if(validaConcepto(document.RetiroFS.txtPlazaSwiftR.value))    
      		{
	        alert("La coma, comilla simple y comillas no son caracteres validos");
      		document.RetiroFS.txtPlazaSwiftR.focus();
			return;
	        }				
	if(document.RetiroFS.txtSucursalSwiftR.value=="")    
				{
				alert("Debes indicar la Sucursal del Banco Domiciliario");
				document.RetiroFS.txtSucursalSwiftR.focus();
				return;
				}
			
	  if(isNaN(document.RetiroFS.txtSucursalSwiftR.value))
					  {
					  alert("El formato de la Sucursal del Banco Domiciliario no es valido\nDebe ser Num�rico");
					  document.RetiroFS.txtSucursalSwiftR.value="";
					  document.RetiroFS.txtSucursalSwiftR.focus();	
					  return;
					  }
	 if(document.RetiroFS.txtCuentaSwiftR.value=="")    
				{
				alert("Debes indicar el N�mero de Cuenta del Banco Domiciliario");
				document.RetiroFS.txtCuentaSwiftR.focus();
				return;
				}
	 if(isNaN(document.RetiroFS.txtCuentaSwiftR.value))
					  {
					  alert("El formato del N�mero de Cuenta no es valido\nDebe ser Num�rico");
					  document.RetiroFS.txtCuentaSwiftR.value="";
					  document.RetiroFS.txtCuentaSwiftR.focus();
					  return;
					  }
	if(document.RetiroFS.txtBranchSwiftR.value=="")    
				{
				alert("Debes indicar el Branch del Banco Domiciliario");
				document.RetiroFS.txtBranchSwiftR.focus();
				return;
				}
	  if(validaCodigo(document.RetiroFS.txtBranchSwiftR.value))    
      		{
	        alert("La coma, comilla simple y comillas no son caracteres validos");
      		document.RetiroFS.txtBranchSwiftR.focus();
			return;
	        }				
		if(document.RetiroFS.cboMonedaSwiftR.selectedIndex==0)    
				{
				alert("Selecciona el tipo de  Moneda");
				document.RetiroFS.cboMonedaSwiftR.focus();
				return;
				}
		if(document.RetiroFS.txtImporteR.value=="0.00")    
				{
				alert("Debes indicar el Importe del Retiro");
				document.RetiroFS.txtImporte1.focus();
				return;
				}

		if(document.RetiroFS.txtCodigoSwiftR.value=="")    
				{
				alert("Debes indicar el C�digo Swift ABA o IBAN");
				document.RetiroFS.txtCodigoSwiftR.focus();	
				return;
				}
    if(document.RetiroFS.txtCodigoSWIFT.value == ""){
				alert("Debes indicar el Tipo de C�digo Swift (ABA O IBAN).");
				document.RetiroFS.txtCodigoSwiftR.focus();
				return;
		}

	    if(validaCodigo(document.RetiroFS.txtCodigoSwiftR.value))    
      		{
	        alert("La coma, comilla simple y comillas no son caracteres validos");
      		document.RetiroFS.txtCodigoSwiftR.focus();
			return;
	        }				
		if(document.RetiroFS.txtNombreBSwiftR.value=="")    
				{
				alert("Debes indicar el Nombre del Beneficiario");
				document.RetiroFS.txtNombreBSwiftR.focus();	
				return;
				}
	  if(validaConcepto(document.RetiroFS.txtNombreBSwiftR.value))    
      		{
	        alert("La coma, comilla simple y comillas no son caracteres validos");
      		document.RetiroFS.txtNombreBSwiftR.focus();
			return;
	        }				
	  if(document.RetiroFS.cboPaisBSwiftR.selectedIndex==0)    
				{
				alert("Selecciona el Pa�s del Beneficiario");
				document.RetiroFS.cboPaisBSwiftR.focus();	
				return;
				}
	   if(document.RetiroFS.txtCiudadBSwiftR.value=="")    
				{
				alert("Debes indicar la Ciudad en la que radica el Beneficiario");
				document.RetiroFS.txtCiudadBSwiftR.focus();
				return;
				}
	  if(validaConcepto(document.RetiroFS.txtCiudadBSwiftR.value))    
      		{
	        alert("La coma, comilla simple y comillas no son caracteres validos");
      		document.RetiroFS.txtCiudadBSwiftR.focus();
			return;
	        }				
	 if(document.RetiroFS.txtDomicilioBSwiftR.value=="")    
				{
				alert("Debes indicar el Domicilio del Beneficiario");
				document.RetiroFS.txtDomicilioBSwiftR.focus();
				return;
				}
	  if( validaConcepto(document.RetiroFS.txtDomicilioBSwiftR.value))
					{
					alert("Favor de verificar la redacci�n del Domicilio\na coma, comilla simple y comillas no son caracteres validos");
					document.RetiroFS.txtDomicilioBSwiftR.focus();
					return;
					  }
	if(document.RetiroFS.txtTelefonoBSwiftR.value=="")    
						{
						alert("Debes indicar el Tel�fono del Beneficiario");
						document.RetiroFS.txtTelefonoBSwiftR.focus();
						return;
						}
	  if(validaConcepto(document.RetiroFS.txtTelefonoBSwiftR.value))    
      		{
	        alert("La coma, comilla simple y comillas no son caracteres validos");
      		document.RetiroFS.txtTelefonoBSwiftR.focus();
			return;
	        }						
		<%}   
	}//fin cboForma != null
%>

if(existeToken==1)
	{
	mostrarToken(); 
	return;
	}
	   document.RetiroFS.action="confirmarInst_FS2.jsp";
	   document.RetiroFS.submit();

}


function aceptarToken() 
	{
	if(document.RetiroFS.txtToken.value=="")
		{
		alert('Es necesario que digite su  <%=session.getAttribute("empresa_9")%>-LLAVE');
		document.RetiroFS.txtToken.focus();
		return;
		}	
   if((document.RetiroFS.txtToken.value).length<6)
		{
		alert('La longitud de la  <%=session.getAttribute("empresa_9")%>-LLAVE es invalida');
		document.RetiroFS.txtToken.value="";
		document.RetiroFS.txtToken.focus();
		return;
		}	
	if(isNaN(document.RetiroFS.txtToken.value))
		{
		alert('La  <%=session.getAttribute("empresa_9")%>-LLAVE es un dato numerico');
		document.RetiroFS.txtToken.value="";
		document.RetiroFS.txtToken.focus();
		return;
		}		
	document.RetiroFS.action="confirmarInst_FS2.jsp";
	document.RetiroFS.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.RetiroFS.txtToken.focus();
}

function ocultarToken() 
{
document.RetiroFS.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';
 
}
</script>			
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_findObj(n, d) { 
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImgRestore() { 
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { 
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</HEAD>
<body  class="bg-light"vLink="#052206" leftMargin="0" 
topMargin="0" marginwidth="0" marginheight="0"  
<%if(request.getParameter("cboAccion")!=null &&  !request.getParameter("cboAccion").trim().equals("Selecciona una Accion")) 
	{%>
onLoad="porcentajes(<%=saldoTotal>0 && saldoE>=0?((saldoE/saldoTotal)*100)+"":"0"%>,<%=saldoTotal>0  && saldoF>=0?((saldoF/saldoTotal)*100)+"":"0"%>);MM_preloadImages('imagenes/consultas2.gif','imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif')" 
<%}%>>
	<div id="reloj" 
style="position:absolute; top: 100; left: 100"></div>
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD  vAlign="top" background="imagenes/msur01.png"
          > <DIV align="right"><FONT color="#FFFFFF"
            size=-7 
            face="Arial, Helvetica, sans-serif"> 01 800 623 4672 &nbsp;&nbsp;</FONT>&nbsp;&nbsp;<A 
            href="mailto:info@bancomext.com"><FONT color="#FFFFFF"size=-7 
            face="Arial, Helvetica, sans-serif">info@bancomext.com&nbsp;&nbsp;&nbsp;</FONT></A> 
        </DIV></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=sysFecha%></TD>
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image10" width="104" height="17" border="0"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones2.gif" name="Instrucciones"  border="0"></a><a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes1','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes1"  border="0" id="Reportes1"></a><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones1','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones1"  border="0" id="Opciones1"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir1','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir1"  border="0" id="Salir1"></a></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top"  width="176"> 
        <%@ include file="menuInstrucciones.jsp" %>
      </TD>
      <TD valign="top" align="center"> <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="90%" border="0">
          <tr> 
            <td class="texto">&nbsp; 	</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Retiro</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> <form name="RetiroFS"  method="post" action="">
                <table width="50%" border="0" cellspacing="1" cellpadding="1" align="center">
                  <tr> 
                    <td><div id="token" style="position:absolute; visibility:hidden;"   align="center"> 
                        <table width="305" border="1" cellpadding="1" cellspacing="1" bordercolor="#666666" bgcolor="#999999" align="center">
                          <tr> 
                            <td align="center"><table width="300" border="0" cellspacing="1" cellpadding="1" class="texto" bgcolor="#CCCCCC" align="center"  background="imagenes/fondoSubMenu.png">
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td width="43%">&nbsp;</td>
                                  <td width="57%">&nbsp;</td>
                                </tr>
                                <tr align="center"> 
                                  <td colspan="2" class="textoNegritaWhite">Introduzca 
                                    su <%=session.getAttribute("empresa_9")%>-LLAVE: 
                                    <input type="password" name="txtToken" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  value="<%=request.getParameter("txtToken")!=null?request.getParameter("txtToken"):""%>"></td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td colspan="2" align="center"> <input type="button" name="AceptarToken" value="Aceptar" onClick="aceptarToken()" class="btn btn-primary"> 
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="button" name="CancelarToken" value="Cancelar" onClick="ocultarToken();" class="btn btn-danger"> 
                                  </td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                              </table></td>
                          </tr>
                        </table>
                      </div></td>
                  </tr>
                </table>
                <table width="595" height="568" id="datos">
                  <tr> 
                    <td height="20"  colspan="3" align="left" class="subtitulo">Retiro 
                      por Aplicaci&oacute;n de Porcentajes: 
						<input maxlength="125" name="txtHiddenPersona" value="" type="hidden" size="30"> 
						<input type="hidden" value="1" name="iOpcion"> 			
					  </td>
                  </tr>
                  <tr> 
                    <td height="5" colspan="3">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td    height="18" align="right"  class="texto">Ejercicio: 
                      &nbsp; </td>
                    <td width="357" colspan="2"  class="texto"> <select name="cboEjercicio" id="select" onChange="Mostrar(0)";>
                        <option>Selecciona un Ejercicio</option>
                        <%
					  
					  String cboEjercicio[]= BD.getData(15,(String)session.getAttribute( "NumFid" )); 
					  if(cboEjercicio!=null)
							for(l=0;l<cboEjercicio.length;l++)
								{%>
                        <option value="<%=cboEjercicio[l]%>" <%=Ejercicio.equals(cboEjercicio[l].trim())?"selected":""%>><%=cboEjercicio[l]%></option>
                        <%}%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="5" colspan="3" align="right" class="subtitulo">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21"class="subtitulo"> Registro Presupuestal: dfsdf</td>
                    <td colspan="2"  class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" align="right" class="texto">Eje: </td>
                    <td colspan="2"  class="textoCbo"><select name="cboEje" id="cboEje" onChange="Mostrar(0)"; style=" WIDTH: 330px;">
                        <option>Selecciona un Eje</option>
                        <%if(!Ejercicio.equals(""))
                		               {
						
							String cboEje[]= BD.getData(16,(String)session.getAttribute( "NumFid" )+","+Ejercicio); 
							if(cboEje!=null)		 
							for(l=0;l<cboEje.length;l++)
									{%>
                        <option value="<%=cboEje[l].trim()%>" <%=request.getParameter("cboEje")!=null && request.getParameter("cboEje").trim().equals(cboEje[l].trim())?"selected":""%>><%=cboEje[l]%></option>
                        <%}	
                        				}
							%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Programa:</td>
                    <td colspan="2"  class="texto"><select name="cboPrograma" id="cboPrograma" onChange="Mostrar(0)"; style=" WIDTH: 330px;">
                        <option>Selecciona un Programa</option>
                        <%if(!Eje.equals(""))
                		               {
						
										String cboPrograma[]= BD.getData(17,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje); 
									   if(cboPrograma!=null)
										for(l=0;l<cboPrograma.length;l++)
												{%>
                        <option value="<%=cboPrograma[l].trim()%>" <%=request.getParameter("cboPrograma")!=null && request.getParameter("cboPrograma").trim().equals(cboPrograma[l].trim())?"selected":""%>><%=cboPrograma[l]%></option>
                        <%}	
                        				}%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Proyecto:</td>
                    <td colspan="2"  class="texto"><select name="cboProyecto" id="cboProyecto" onChange="Mostrar(0)"; style=" WIDTH: 330px;">
                        <option>Selecciona un Proyecto</option>
                        <%if(!Programa.equals(""))
                		               {
						
									  String cboProyecto[]= BD.getData(18,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa); 
									 if(cboProyecto!=null)
										for(l=0;l<cboProyecto.length;l++)
												{%>
                        <option value="<%=cboProyecto[l].trim()%>" <%=request.getParameter("cboProyecto")!=null && request.getParameter("cboProyecto").trim().equals(cboProyecto[l].trim())?"selected":""%>><%=cboProyecto[l]%></option>
                        <%}	
                        				}%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">Acci&oacute;n:</td>
                    <td colspan="2"  class="texto"><select name="cboAccion" id="cboAccion" style=" WIDTH: 330px;"   onChange="Mostrar(0)">
                        <option value="Selecciona una Accion">Selecciona una Acci&oacute;n 
                        <%	if(!Proyecto.equals(""))
                		               {
						
											 String cboAccion[]= BD.getData(19,(String)session.getAttribute( "NumFid" )+","+Ejercicio+":"+Eje+"-"+Programa+"_"+Proyecto); 
											 if(cboAccion!=null)
											for(l=0;l< cboAccion.length;l++)
													{%>
                        <option value="<%=cboAccion[l].trim()%>" <%=request.getParameter("cboAccion")!=null && request.getParameter("cboAccion").trim().equals(cboAccion[l].trim())?"selected":""%>><%=cboAccion[l]%></option>
                        <%}	
                        				}
							%>
                      </select></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="texto">&nbsp;</td>
                    <td colspan="2"  class="texto">&nbsp;</td>
                  </tr>
                  <%if(forma==null || (forma!=null && !forma.equals("21")) ||  pagosM!=null)
			{   %>
                  <tr> 
                    <td height="24" align="right" class="texto">Comprometido:</td>
                    <td colspan="2"  class="texto"> <input name="comprometido" type="checkbox"  value="SI" <%=Comprometido.equals("SI")||request.getParameter("cboEjercicio")==null?"checked":""%>  onClick="Mostrar(0);"></td>
                  </tr>
                  <tr> 
                    <td height="24" align="right" class="textoNegrita">Importe 
                      Total a Retirar:</td>
                    <td colspan="2"  class="texto"> <input name="txtImporteR" type="text" id="txtImporte" size="30"  value="<%=request.getParameter("txtImporteR")!=null?request.getParameter("txtImporteR"):""%>"   onKeyUp="validaNum(this.form.txtImporteR);"   onBlur="formatImporte(this.form.txtImporteR)"> 
                    </td>
                  </tr>
                  <tr> 
                    <td height="23" colspan="3" align="right"  class="texto"> 
                      <table width="100%">
                        <tr> 
                          <td width="146" height="21"   class="subtitulo">Origen 
                            :</td>
                          <td width="88" align="left"  class="texto2"><b>Saldo 
                            Acci&oacute;n:</b></td>
                          <td width="91" align="left" class="texto2"><b>Porcentaje:</b></td>
                          <td width="142" align="left"  class="texto2" ><b>Importe 
                            a Retirar:</b></td>
                        </tr>
                        <tr  class="texto2"> 
                          <td height="26" align="right" class="texto2">Estatal:&nbsp;&nbsp;</td>
                          <td> <%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoE)%> 
                          </td>
                          <td> <%=saldoTotal>0  && saldoE>=0 ?((saldoE/saldoTotal)*100)+"":"0"%> 
                            % </td>
                          <td> <input name="txtImporte1P" type="text" id="txtImporte1P" size="22"  value="<%=request.getParameter("txtImporte1P")!=null?request.getParameter("txtImporte1P"):""%>" disabled> 
                            <input name="txtImporte1" type="hidden" id="txtImporte1" size="18"  value="<%=request.getParameter("txtImporte1")!=null?request.getParameter("txtImporte1"):""%>"></td>
                        </tr>
                        <tr  class="texto2"> 
                          <td height="24" align="right" class="texto2">Federal:&nbsp;&nbsp;</td>
                          <td > <%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoF)%> 
                          </td>
                          <td ><%=saldoTotal>0  && saldoF>=0 ?((saldoF/saldoTotal)*100)+"":"0"%> 
                            % </td>
                          <td ><input name="txtImporte2P" type="text" id="txtImporte2P"  size="22"  value="<%=request.getParameter("txtImporte2P")!=null?request.getParameter("txtImporte2P"):""%>" disabled> 
                            <input name="txtImporte2" type="hidden" id="txtImporte2" size="18"  value="<%=request.getParameter("txtImporte2")!=null?request.getParameter("txtImporte2"):""%>"></td>
                        </tr>
                        <tr> 
                          <td height="23"  align="right" class="textoNegrita"> 
                            Saldo Total:&nbsp;</td>
                          <td colspan="3"  class="texto"> <%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoTotal)%> 
                            <input type="hidden" name="saldoAccion" value="<%=saldoTotal%>"> 
                          </td>
                        </tr>
                      </table></td>
                  </tr>
                  <%}//importe de todas las formas menos SWIFT%>
                  <tr> 
                    <td align="right"  class="textoNegrita">No. de Acuerdo del 
                      Comite T&eacute;cnico:</td>
                    <td colspan="2" class="texto"> 
				   <select  name="cboAcuerdosComiteTec" method="post" action="">
                        <option value="">Selecciona un Acuerdo</option>
                        <%
							 ct.setVtrIntDato1(numFiso);
							 ct.setVtrStrDato2("CUMPLIDO");//sea diferente a cumplido
							 ct.querySelect(101);
							for(int r=0;r<ct.getSize();r++)
								{
								 ct.setIndex (r);
								%>
                        <option value="<%=ct.getVtrStrDato2()+" T"+ct.getVtrStrDato3().substring(0,1)+" "+ct.getVtrStrDato4()%>" <%=request.getParameter("cboAcuerdosComiteTec")!=null && request.getParameter("cboAcuerdosComiteTec").equals(ct.getVtrStrDato2()+" T"+ct.getVtrStrDato3().substring(0,1)+" "+ct.getVtrStrDato4())?"selected":""%> >
						<%=ct.getVtrStrDato4()+" ("+(ct.getVtrStrDato12().length()>25?ct.getVtrStrDato12().substring(0,25):ct.getVtrStrDato12())+") "+ct.getVtrStrDato2()%>
						</option>
                        <%}%>
                      </select>
				   
				   </td>
                  </tr>
                  <tr> 
                    <td height="23" align="right"  class="texto"> Concepto: </td>
                    <td colspan="2" class="texto"> <input maxlength=125 name="txtMetaR"  size="60" value="<%=request.getParameter("txtMetaR")!=null?request.getParameter("txtMetaR"):""%>"> 
                    </td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto">&nbsp;</td>
                    <td colspan="2" class="mensaje">Favor de indicar el Concepto 
                      de este Pago en 125 caracteres m&aacute;ximo.</td>
                  </tr>
				   <% if(i==0) 
				 {%> 
                  <tr> 
                    <td class="texto" align="right"><a name="pagosM"></a>Pagos 
                      Multiples:</td>
	                    <td colspan="2" class="texto"> 
							<input name="pagosM" type="checkbox"  value="S" <%=request.getParameter("pagosM")!=null && request.getParameter("pagosM").equals("S")?"checked ":" "%> onClick="Mostrar(2)";>
						</td>
                  </tr>
				 <%}%>
                  <tr> 
                    <td width="200" height="24" align="right"  class="texto"> 
                      Forma de liquidaci&oacute;n:</td>
                    <td colspan="2" class="texto"> <select name="cboFormaR" onChange="<%=pagosM==null?"Mostrar(1)":""%>">
                      <option value="Selecciona Forma">Selecciona Forma</option>
                      <%									
							if(pagosM!=null)
								i=10;										
							 String cboLiquidacion[][]= BD.getDataFormas(2+i, (String)session.getAttribute("NumFid"), ""); 													
							if(cboLiquidacion!=null)
								for(l=0;l<cboLiquidacion.length;l++)
								{%>
                      <option value="<%=cboLiquidacion[l][0]%>" 
						  <%=forma!=null && forma.trim().equals(cboLiquidacion[l][0].trim())?"selected":""%>> <%=cboLiquidacion[l][1]%></option>
                      <%}%>
                    </select> <input maxlength="89" name="txtFormaLiq"  type="hidden" size="20"   value="<%=request.getParameter("txtFormaLiq")!=null?request.getParameter("txtFormaLiq"):""%>"></td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3" class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3" class="texto"> 
                      <%if(forma!=null && pagosM==null)
				  		{
							forma=forma.trim();
							if(forma.equals( "3"))
								{%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="3" ><a name="formaPago">CHEQUE:</a></td>
                        </tr>
                        <tr> 
                          <td colspan="3" class="texto">&nbsp;</td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Cheque a cargo de:</td>
                          <td colspan="2" class="texto"> 
						  
							<select name="cboBancoChequeR">
                              <option >Selecciona Banco</option>
                              <option <%=request.getParameter("cboBancoChequeR")!=null && request.getParameter("cboBancoChequeR").trim().equals("BANCOMER")?"selected":""%> value="BANCOMER">BANCOMER (USD)</option>
                              <option <%=request.getParameter("cboBancoChequeR")!=null && request.getParameter("cboBancoChequeR").trim().equals("INVERLAT")?"selected":""%> value="INVERLAT">INVERLAT (MN)</option>
                              <option <%=request.getParameter("cboBancoChequeR")!=null && request.getParameter("cboBancoChequeR").trim().equals("BANCOMEXT")?"selected":""%> value="BANCOMEXT">BANCOMEXT (MN) </option>
                            </select>
							</td>
                        </tr>
						<%if(sTipoCont.equals("0"))  {%>
                        <tr> 
                          <td class="texto" align="right">Nombre del Beneficiario:</td>
                          <td  class="texto"> 								              											   
								<input maxlength="125" name="txtBeneficiarioChequeR"  type="text" size="30"   value="<%=request.getParameter("txtBeneficiarioChequeR")!=null?request.getParameter("txtBeneficiarioChequeR"):""%>">
                          </td>						  						  
                        </tr>
						<%} else  {%>						
						
						<%if(hidden.equals("2")) { 
                 opcion = "2";
						     System.out.println("1 Opcion: " + opcion);
             }    
              if(opcion.equals("2") && !sTercero.equals("")) {
					       System.out.println("2 !!!! Opcion: " + opcion);
						     System.out.println("Text: " + request.getParameter("txtPersonaR"));
						
                 BD.insertaTercero((String)session.getAttribute("NumFid"),
                 BD.obtenNumTercero((String)session.getAttribute("NumFid")),
                 request.getParameter("txtPersonaR"),fecha);						
						     opcion = "0" ;						 
              }%>												
						  <tr> 
                          <td class="texto" align="right">Nombre del Beneficiario:</td>
                          <td  class="texto">   
                            <select name="cboNomPer">
                              <option>Selecciona una Persona</option>
                              <%											
								                String sNomPer[]= BD.getData(7,(String)session.getAttribute("NumFid" )); 									
								               if(sNomPer!=null)
									             for(l=0;l<sNomPer.length;l++)
									             {%>
                                 <option value="<%=sNomPer[l]%>" <%=persona.equals(sNomPer[l].trim())?"selected":""%>><%=sNomPer[l]%></option>
                             <%}%>
                            </select>
							</td>						  						  
                        </tr>
						
						  <tr> 
                          <td colspan="2" class="texto">&nbsp;</td>
                        </tr>
						
						 <tr>
                            <td colspan="2" align="right"><a href="javascript:altaPersona(true)"><u> Capturar Persona</u></a></td>
                          </tr>
						  
					<%if(opcion.equals("2")) {%>												  
						<tr>
                          <td colspan="2" ><a name="persona">PERSONA:</a></td>
                        </tr>
                        <tr>
                          <td class="texto" align="right">Nombre de la Persona:</td>
                          <td  class="texto"><input maxlength="125" name="txtPersonaR"  type="text" size="30">
                          </td>
                        </tr>
					<%}%>
					
						<%}%>

                        <tr> 
                          <td colspan="3" class="texto">&nbsp;</td>
                        </tr>
                      </table>
                      <%}
							if(forma.equals( "SPEUA"))
									{%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="3" ><a name="formaPago">SPEUA:</a></td>
                        </tr>
                        <tr> 
                          <td colspan="3" height="24" class="mensaje">(SOLO PARA 
                            IMPORTES MAYORES A $50,000.00)</td>
                        </tr>
                        <tr> 
                          <td colspan="3" >&nbsp;</td>
                        </tr>
                        <%if(sCta==null)
													{%>
                        <tr> 
                          <td colspan="3" class="subtitulo" align="center" >NO TIENE 
                            REGISTRADO NINGUN NUMERO DE CUENTA SPEUA</td>
                        </tr>
                        <%}
												else
													{%>
                        <tr> 
                          <td width="17%" align="right" class="texto">N&uacute;mero 
                            de cuenta:</td>
                          <td width="83%" colspan="2" class="texto"> <select name="cboCuentaSpeuaR"  onChange="Mostrar(1)";>
                              <option value="Selecciona Cuenta">Selecciona Cuenta 
                              <%
										for(int j=0;j<sCta.length;j++)
											{%>
                              <option value="<%=sCta[j]%>" <%=sCtaAnt.trim().equals(sCta[j].trim())?"selected":""%>><%=sCta[j]%></option>
                              <%}
										%>
                            </select> </td>
                        </tr>
                        <%}
												 if (!sCtaAnt.equals("") &&  !sCtaAnt.equals("Selecciona Cuenta") )
											   {
											%>
                        <input type="hidden" name="txtPlazaSpeuaR" <%out.println("value=\""+ sData[1] +"\"");%> >
                        <input type="hidden" name="txtCveBancoSpeuaR" <%out.println("value=\""+ sData[0] +"\"");%> >
                        <input type="hidden" name="txtTitularSpeuaR" <%out.println("value=\""+ sData[3] +"\"");%> >
                        <tr> 
                          <td  class="texto" align="right"> Plaza:</td>
                          <td colspan="2" class="textoNegrita" ><%=sData[1]%></td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Titular de la Cuenta:</td>
                          <td colspan="2" class="textoNegrita"><%=sData[3]%></td>
                        </tr>
                        <%}
										else {%>
                        <input type="hidden" name="txtPlazaSpeuaR" value="" >
                        <input type="hidden" name="txtCveBancoSpeuaR" value="">
                        <input type="hidden" name="txtTitularSpeuaR" value="" >
                        <%}%>
                      </table>
                      <%} 
							if(forma.equals("18"))
									{%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="3" ><a name="formaPago"> SIAC(Banxico):</a></td>
                        </tr>
                        <tr> 
                          <td colspan="3" class="texto">&nbsp;</td>
                        </tr>
                        <%
										if(sCta==null)
											{%>
                        <tr> 
                          <td colspan="3" class="subtitulo" align="center" >NO TIENE 
                            REGISTRADO NINGUN NUMERO DE CUENTA SIAC</td>
                        </tr>
                        <%}
										else
											{%>
                        <tr> 
                          <td width="32%" align="right" class="texto">N&uacute;mero 
                            de cuenta Banxico:</td>
                          <td width="68%" colspan="2" class="texto"> <select name="cboCuentaSiacR" onChange="Mostrar(1)";>
                              <option value="Selecciona Cuenta">Selecciona Cuenta 
                              <%
															for(int j=0;j<sCta.length;j++)
															{%>
                              <option value="<%=sCta[j]%>" <%=sCtaAnt.trim().equals(sCta[j].trim())?"selected":""%>><%=sCta[j]%></option>
                              <%}%>
                            </select> </td>
                        </tr>
                        <%}
											  if (!sCtaAnt.equals("") &&  !sCtaAnt.equals("Selecciona Cuenta") )
												  {
												  %>
                        <input type="hidden" name="txtInstitucionSiacR" <%out.println("value=\""+ sData[3] +"\"");%> >
                        <tr> 
                          <td class="texto" align="right">Titular de la cuenta:</td>
                          <td colspan="2" class="textoNegrita"><%=sData[3]%></td>
                        </tr>
                        <% } 
											else {%>
                        <input type="hidden" name="txtInstitucionSiacR" value="" >
                        <%}%>
                      </table>
                      <%}   
							if(forma.equals("19"))
										{%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="3"><a name="formaPago">TBC-BANCOMER:</a></td>
                        </tr>
                        <tr> 
                          <td colspan="3" class="texto">&nbsp;</td>
                        </tr>
                        <%
										if(sCta==null)
											{%>
                        <tr> 
                          <td colspan="3" class="subtitulo" align="center" >NO TIENE 
                            REGISTRADO NINGUN NUMERO DE CUENTA TBC-BANCOMER</td>
                        </tr>
                        <%}
										else
											{%>
                        <tr> 
                          <td width="32%" align="right"  class="texto">N&uacute;mero 
                            de cuenta:</td>
                          <td width="68%" colspan="2" class="texto"> <select name="cboCuentaTbcR"  onChange="Mostrar(1)";>
                              <option value="Selecciona Cuenta">Selecciona Cuenta 
                              <%
									for(int j=0;j<sCta.length;j++)
										{%>
                              <option value="<%=sCta[j]%>" <%=sCtaAnt.trim().equals(sCta[j].trim())?"selected":""%>><%=sCta[j]%></option>
                              <%}
									%>
                            </select> </td>
                        </tr>
                        <%}
									 if (!sCtaAnt.equals("") &&  !sCtaAnt.equals("Selecciona Cuenta") )
										   {
										%>
                        <input type="hidden" name="txtPlazaTbcR" <%out.println("value=\""+ sData[1] +"\"");%>>
                        <input type="hidden" name="txtTitularTbcR" <%out.println("value=\""+ sData[3] +"\"");%> >
                        <tr> 
                          <td  class="texto" align="right">Plaza:</td>
                          <td colspan="2"  class="textoNegrita"><%=sData[1]%></td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Titular de la Cuenta:</td>
                          <td colspan="2" class="textoNegrita"><%=sData[3]%></td>
                        </tr>
                        <%}
									else {%>
                        <input type="hidden" name="txtPlazaTbcR" value="" >
                        <input type="hidden" name="txtTitularTbcR" value="" >
                        <%}%>
                        <tr> 
                          <td colspan="3" class="texto">&nbsp;</td>
                        </tr>
                      </table>
                      <%}   
							if(forma.equals("20") ||  forma.equals("23"))
									{%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="3" ><a name="formaPago">
						   <%
						  	if(forma.equals("20"))
						  		out.print("TRANSFERENCIA ELECTRONICA DE FONDOS:");
							else
								out.print("SPEI:");
							%>
						  </a></td>
                        </tr>
                        <tr> 
                          <td colspan="3" align="right"><a href="Registrar_Cuenta.jsp"><u>Registrar 
                            Cuenta</u></a></td>
                        </tr>
                        <tr> 
                          <td colspan="3" class="texto">&nbsp;</td>
                        </tr>
                        <%
										if(sCta==null)
												{%>
                        <tr> 
                          <td height="40" colspan="3" align="center" class="subtitulo" >ESTA 
                            FORMA DE LIQUIDACION ES UNICAMENTE PARA CUENTAS PREVIAMENTE 
                            REGISTRADAS </td>
                        </tr>
                        <%}
										else
											{%>
                        <tr> 
                          <td width="18%" align="right" class="texto">N&uacute;mero 
                            de cuenta:</td>
                          <td width="82%" colspan="2" class="texto"> <select name="cboCuentaPagoR"  onChange="Mostrar(1)";>
                              <option value="Selecciona Cuenta">Selecciona Cuenta 
                              <%
															for(int j=0;j<sCta.length;j++)
																	{%>
                              <option value="<%=sCta[j]%>" <%=sCtaAnt.trim().equals(sCta[j].trim())?"selected":""%>><%=sCta[j]%></option>
                              <%}%>
                            </select> </td>
                        </tr>
                        <%}
										 if (!sCtaAnt.equals("") &&  !sCtaAnt.equals("Selecciona Cuenta") )
										  	{
											if(sData[0]!=null)
												{%>
                        <input type="hidden" name="txtCveBancoPagoR"  value="<%=sData[0]%>">
                        <input type="hidden" name="txtCuentaPagoR" value="<%=sCtaAnt%>">
                        <input type="hidden" name="txtPlazaPagoR" value="<%=sData[1]%>">
                        <input type="hidden" name="txtTitularPagoR" value="<%=sData[3]%>">
                        <input type="hidden" name="txtRfcPagoR" value="<%=sData[4]%>">
                        <tr> 
                          <td class="texto" align="right">Plaza:</td>
                          <td colspan="2" class="textoNegrita"> <%=sData[1]%></td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Titular de la Cuenta:</td>
                          <td colspan="2" class="textoNegrita"><%=sData[3]%></td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">RFC:</td>
                          <td colspan="2" class="textoNegrita"><%=sData[4]%></td>
                        </tr>
                        <%}
										}
									else
										{%>
                        <input type="hidden" name="txtPlazaPagoR" value="">
                        <input type="hidden" name="txtTitularPagoR" value="">
                        <%
										}%>
                      </table>
                      <%}
            
                      if(forma.equals("24") || forma.equals("25") || forma.equals("26"))
                      {%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="3" ><a name="formaPago">
                      <%
                        if(forma.equals("24"))
                          out.print("BANCOMER CIE:");
                        else if(forma.equals("25"))
                          out.print("TRANSFERENCIA BANCO DE MEXICO:");
                        else if(forma.equals("26"))
                          out.print("CUENTAS INTERNAS:");
                      %>
                          </a></td>
                        </tr>
                        <tr> 
                          <td colspan="3" align="right"><a href="Registrar_Cuenta.jsp"><u>Registrar Cuenta</u></a></td>
                        </tr>
                        <tr> 
                          <td colspan="3" class="texto">&nbsp;</td>
                        </tr>
                        <%
                        if(sCta==null){%>
                          <tr> 
                            <td height="40" colspan="3" align="center" class="subtitulo" >ESTA 
                            FORMA DE LIQUIDACION ES UNICAMENTE PARA CUENTAS PREVIAMENTE REGISTRADAS </td>
                          </tr>
                        <%}
                      else{%>
                        <tr> 
                          <td width="18%" align="right" class="texto"><%=forma.trim().equals("26")?"N�mero de Cuenta:":"N�mero Convenio:"%></td>
                          <td width="82%" colspan="2" class="texto">
                            <select name="cboCuentaPagoR"  onChange="Mostrar(1)";>
                              <option value="Selecciona Cuenta">Selecciona <%=forma.trim().equals("26")?"Cuenta":"Convenio"%> 
                              <%
                                for(int j=0;j<sCta.length;j++)
    														{%>
                                  <option value="<%=sCta[j]%>" <%=sCtaAnt.trim().equals(sCta[j].trim())?"selected":""%>><%=sCta[j]%></option>
                              <%}%>
                            </select>
                          </td>
                        </tr>
                      <%}
                      if(!sCtaAnt.trim().equals("Selecciona Cuenta") && !sCtaAnt.trim().equals("Selecciona Convenio"))
										  {
                        if(sData[0]!=null)
												{%>
                          <input type="text" name="txtCveBancoPagoR"  value="<%=sData[0]%>">
                          <input type="text" name="txtCuentaPagoR" value="<%=sCtaAnt%>">
                          <input type="text" name="txtPlazaPagoR" value="<%=sData[1]%>">
                          <input type="text" name="txtTitularPagoR" value="<%=sData[3]%>">
                          <input type="text" name="txtRfcPagoR" value="<%=sData[4]%>">
                          <%
                          if(forma.trim().equals("24")){
                          %>
                          <tr> 
                            <td class="texto" align="right">Referencia:</td>
                            <td colspan="2" class="textoNegrita"><input type="text" name="txtReferencia" value="<%=request.getParameter("txtReferencia")!=null?request.getParameter("txtReferencia"):""%>"></td>
                          </tr>
                          <%
                          }
                          %>
                          <tr> 
                            <td  class="texto" align="right"><%=forma.trim().equals("26")?"�rea Titular:":"Titular de la Cuenta:"%></td>
                            <td colspan="2" class="textoNegrita"><%=sData[3]%></td>
                          </tr>
                          <%
                          if(!forma.trim().equals("26")){
                          %>
                          <tr> 
                            <td class="texto" align="right">RFC:</td>
                            <td colspan="2" class="textoNegrita"><%=sData[4]%></td>
                          </tr>
                          <%
                          }%>
                        <%}
                      }
                    else
										{%>
                      <input type="hidden" name="txtPlazaPagoR" value="">
                      <input type="hidden" name="txtTitularPagoR" value="">
                    <%}%>
                  </table>
                <%}
            
							if(forma.equals("21"))
										{%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="2"><a name="formaPago">SWIFT: </a></td>
                        </tr>
            
                        <tr>
                      		<td colspan="2" height="30" class="mensaje">(SOLO PARA TRANSFERENCIAS EN MONEDA EXTRANJERA)</td>
                    	</tr>
            
                        <tr> 
                          <td colspan="2" >&nbsp;</td>
                        </tr>
                        <tr> 
                          <td class="textoNegrita" colspan="2">Banco Domiciliario:</td>
                        </tr>
                        <tr> 
                          <td width="31%" align="right" class="texto">Pa&iacute;s:</td>
                          <td width="69%" class="texto"> <select name="cboPaisDSwiftR">
                              <option>Selecciona Pa�s</option>
                              <% if(sPais!=null)
							for(l=0;l<sPais.length;l++)
									{%>
                              <option value="<%=sPais[l]%>" <%=request.getParameter("cboPaisDSwiftR")!=null 		&&	request.getParameter("cboPaisDSwiftR").trim().equals(sPais[l].trim())?"selected":""%>><%=sPais[l]%></option>
                              <%}%>
                            </select> </td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Ciudad:</td>
                          <td class="texto"> <input maxlength=50 name="txtCiudadDSwiftR"   style=" WIDTH: 200px" value="<%=request.getParameter("txtCiudadDSwiftR")!=null?request.getParameter("txtCiudadDSwiftR"):""%>"> 
                          </td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Nombre del Banco:</td>
                          <td class="texto"> <input maxlength=50 name="txtBancoDSwiftR"  style=" WIDTH: 200px"  value="<%=request.getParameter("txtBancoDSwiftR")!=null?request.getParameter("txtBancoDSwiftR"):""%>"> 
                          </td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Plaza:</td>
                          <td class="texto"> <input maxlength=50  name="txtPlazaSwiftR"  style=" WIDTH: 200px"  value="<%=request.getParameter("txtPlazaSwiftR")!=null?request.getParameter("txtPlazaSwiftR"):""%>"> 
                          </td>
                        </tr>
                        <tr> 
                          <td  class="texto"> </td>
                          <td class="mensaje"> Colocar No. de Plaza o Ciudad y 
                            Estado.</td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Sucursal:</td>
                          <td class="texto"> <input type="text" name="txtSucursalSwiftR" style=" WIDTH: 100px"  maxlength="5" value="<%=request.getParameter("txtSucursalSwiftR")!=null?request.getParameter("txtSucursalSwiftR"):""%>"> 
                          </td>
                        </tr>
            
                        <tr>
                          <td class="texto" align="right">N&uacute;mero de Cuenta:</td>
                          <td class="texto">
                            <input maxlength="50" name="txtCuentaSwiftR" style=" WIDTH: 200px" value="<%=request.getParameter("txtCuentaSwiftR")!=null?request.getParameter("txtCuentaSwiftR"):""%>"/>
                          </td>
                        </tr>
            
                        <tr> 
                          <td class="texto" align="right">Branch:</td>
                          <td class="texto"> <input maxlength="30" name="txtBranchSwiftR" size="25"  style=" WIDTH: 300px"  value="<%=request.getParameter("txtBranchSwiftR")!=null?request.getParameter("txtBranchSwiftR"):""%>"> 
                          </td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Moneda:</td>
                          <td class="texto"><select name="cboMonedaSwiftR">
                              <option>Selecciona Moneda</option>
                              <% if(sMoneda!=null)
							for(l=0;l<sMoneda.length;l++)
									{
									if(!sMoneda[l].trim().equals("MONEDA NACIONAL"))
										{
									%>
                              <option value="<%=sMoneda[l]%>" <%=request.getParameter("cboMonedaSwiftR")!=null 		&&	request.getParameter("cboMonedaSwiftR").trim().equals(sMoneda[l].trim())?"selected":""%>><%=sMoneda[l]%></option>
                              <%}
								
									}%>
                            </select> </td>
                        </tr>
                        <tr> 
                          <td height="24" align="right" class="texto">Comprometido</td>
                          <td colspan="2"  class="texto"> <input name="comprometido" type="checkbox"  value="SI" <%=(request.getParameter("comprometido")!=null || request.getParameter("cboEjercicio")==null  || (request.getParameter("cboEjercicio")!=null && request.getParameter("cboEje").equals("Selecciona un Ejercicio")))?"checked ":" "%>  onClick="Mostrar(1);">
                          </td>
                        </tr> 
                        <tr> 
                          <td height="24" align="right"  style="font-family: Arial, Helvetica, sans-serif; color: #C60000; font-size: 11px; font-weight: bold;" >Importe 
                            Total a Retirar en Moneda Extranjera:</td>
                          <td colspan="2"  class="texto"> <input name="txtImporteR" type="text" id="txtImporteR" size="30"  value="<%=request.getParameter("txtImporteR")!=null?request.getParameter("txtImporteR"):""%>" onKeyUp="validaNum(this.form.txtImporteR);"  onBlur="formatImporte(this.form.txtImporteR)"> 
                          </td>
                        </tr>
                        <tr> 
                          <td colspan="2" align="right" class="texto2"> <table width="100%">
                              <tr> 
                                <td width="141" height="21"  align="right"  class="subtitulo">Origen 
                                  :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                                <td width="88" align="left"  class="texto2"><b>Saldo 
                                  Acci&oacute;n:</b></td>
                                <td width="90" align="left" class="texto2"><b>Porcentaje:</b></td>
                                <td width="142" align="left"  class="texto2" ><b>Importe 
                                  a Retirar en M.E.:</b></td>
                              </tr>
                              <tr  class="texto2"> 
                                <td height="26" align="right" class="texto2">Estatal:&nbsp;&nbsp;</td>
                                <td> <%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoE)%> 
                                </td>
                                <td> <%=saldoTotal>0?((saldoE/saldoTotal)*100)+"":"0"%> 
                                  % </td>
                                <td> <input name="txtImporte1P" type="text" id="txtImporte1P" size="22"  value="<%=request.getParameter("txtImporte1P")!=null?request.getParameter("txtImporte1P"):""%>" disabled> 
                                  <input name="txtImporte1" type="hidden" id="txtImporte1" size="18"  value="<%=request.getParameter("txtImporte1")!=null?request.getParameter("txtImporte1"):""%>"></td>
                              </tr>
                              <tr  class="texto2"> 
                                <td height="24" align="right" class="texto2">Federal:&nbsp;&nbsp;</td>
                                <td > <%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoF)%> 
                                </td>
                                <td ><%=saldoTotal>0?((saldoF/saldoTotal)*100)+"":"0"%> 
                                  % </td>
                                <td ><input name="txtImporte2P" type="text" id="txtImporte2P"  size="22"  value="<%=request.getParameter("txtImporte2P")!=null?request.getParameter("txtImporte2P"):""%>" disabled> 
                                  <input name="txtImporte2" type="hidden" id="txtImporte2" size="18"  value="<%=request.getParameter("txtImporte2")!=null?request.getParameter("txtImporte2"):""%>"></td>
                              </tr>
                              <tr> 
                                <td height="23"  align="right" class="textoNegrita"> 
                                  Saldo Total Accion:&nbsp;</td>
                                <td colspan="3"  class="texto"> <%=NumberFormat.getCurrencyInstance(Locale.US).format(saldoTotal)%> 
                                  <input type="hidden" name="saldoAccion" value="<%=saldoTotal%>"> 
                                </td>
                              </tr>
                            </table></td>
                        </tr>
            
                        <tr> 
                          <td  class="texto" align="right">C&oacute;digo SWIFT ABA o 
                            IBAN:</td>
                          <td class="texto">  
                            <input maxlength=30 name="txtCodigoSwiftR"  style=" WIDTH: 300px"  value="<%=request.getParameter("txtCodigoSwiftR")!=null?request.getParameter("txtCodigoSwiftR"):""%>">
                             </td>
                        </tr>
            
						<tr> 
                          <td  class="texto" align="right">&nbsp;</td>
            
                         	<td class="texto">&nbsp; 
                            	<label class="mensaje">(ABA PARA AMERICA O IBAN PARA EUROPA)</label>
                         	</td>
            
                        </tr>
            
                        <tr>
                        	<td class="texto" align="right"/>&nbsp;&nbsp;&nbsp;&nbsp;
                          	<td class="texto">
                            	<input type="radio" name="rdCodigoSWIFT" id="rdCodigoSWIFTABA" value="ABA" <%=request.getParameter("rdCodigoSWIFT") != null && request.getParameter("rdCodigoSWIFT").equals("ABA")?"checked ":" "%> onClick="ABAR();"/>&nbsp;ABA&nbsp;&nbsp;
                            	<input type="radio" name="rdCodigoSWIFT" id="rdCodigoSWIFTIBAN" value="IBAN" <%=request.getParameter("rdCodigoSWIFT") != null && request.getParameter("rdCodigoSWIFT").equals("IBAN")?"checked ":" "%> onClick="IBANR();"/>&nbsp;IBAN&nbsp;&nbsp;
                              	<input type="hidden" name="txtCodigoSWIFT" value="<%=request.getParameter("txtCodigoSWIFT") != null?request.getParameter("txtCodigoSWIFT"):""%>"/>
                          	</td>
                        </tr>
            
                        <tr> 
                          <td colspan="2" >&nbsp;</td>
                        </tr>
                        <tr> 
                          <td colspan="2" class="textoNegrita" align="left">Datos 
                            Beneficiario:</td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Nombre:</td>
                          <td class="texto"> <input maxlength=50 name="txtNombreBSwiftR"  style=" WIDTH: 200px" value="<%=request.getParameter("txtNombreBSwiftR")!=null?request.getParameter("txtNombreBSwiftR"):""%>"> 
                          </td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Pa&iacute;s:</td>
                          <td class="texto"> <select name="cboPaisBSwiftR">
                              <option>Selecciona Pa�s</option>
                              <% if(sPais!=null)
							for(l=0;l<sPais.length;l++)
									{%>
                              <option value="<%=sPais[l]%>" <%=request.getParameter("cboPaisBSwiftR")!=null 		&&	request.getParameter("cboPaisBSwiftR").trim().equals(sPais[l].trim())?"selected":""%>><%=sPais[l]%></option>
                              <%}%>
                            </select> </td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Ciudad:</td>
                          <td class="texto"> <input maxlength=50 name="txtCiudadBSwiftR"  style=" WIDTH: 200px"  value="<%=request.getParameter("txtCiudadBSwiftR")!=null?request.getParameter("txtCiudadBSwiftR"):""%>"> 
                          </td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Domicilio:</td>
                          <td class="texto"> <input maxlength=100 name="txtDomicilioBSwiftR"  style=" WIDTH: 300px"  value="<%=request.getParameter("txtDomicilioBSwiftR")!=null?request.getParameter("txtDomicilioBSwiftR"):""%>"> 
                          </td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Tel&eacute;fono:</td>
                          <td class="texto"> <input maxlength=15 name="txtTelefonoBSwiftR"  style=" WIDTH: 100px"  value="<%=request.getParameter("txtTelefonoBSwiftR")!=null?request.getParameter("txtTelefonoBSwiftR"):""%>"> 
                          </td>
                        </tr>
                      </table>
                      <%}   
								
								}//fin cboForma != null
								
								%>
                    </td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="3" class="texto">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td colspan="3" align="center"> 
                      <%

	
  if(opcion.equals("2")) {
 %>
                      <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:validaAltaPersona()" class="boton">
                      <% 
  } else {
  
	if(pagosM==null && forma!=null && (forma.trim().equals("SPEUA") || forma.trim().equals("18") || forma.trim().equals("19") || forma.trim().equals("20") || forma.trim().equals("23") || forma.trim().equals("24") || forma.trim().equals("25") || forma.trim().equals("26")))
	
		{
		if(sCta==null)
			{%>
                    <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:inicioRetiro()" class="boton">
                      <%}
		else
			{
				 if(saldoTotal==0  && request.getParameter("cboAccion")!=null &&  !request.getParameter("cboAccion").trim().equals("Selecciona una Accion")){%>
                      <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:saldo()" class="boton">
                      <%}
				 else
				 {%>
                       <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:validacion(<%=(String)session.getAttribute("token")%>)" class="boton">
				 <%
				 }	  
			}
		}//formas de cuentas   
		else				
				{
				if(saldoTotal==0  && request.getParameter("cboAccion")!=null &&  !request.getParameter("cboAccion").trim().equals("Selecciona una Accion")){%>
                      <input type="button" name="Aceptar2" value="Aceptar" onClick="javascript:saldo()" class="boton">
                      <%
						}
						else
						{%>
					<input type="button" name="Aceptar2" value="Aceptar" onClick="javascript:validacion(<%=(String)session.getAttribute("token")%>)" class="boton">	
						<%  
						}
				} }//ninguna,formas cheque y swift
				%>
                     &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton"> 
                    </td>
                  </tr>
                </table>
               
                <table border=0 cellpadding=0 cellspacing=1 class=texto_menu_inf width=530 align="center">
                  <tr> 
                    <td height="12" colspan="9" class="texto_menu_inf" align="center"></td>
                  </tr>
                  <tr> 
                    <td width="482" height="12" colspan="9" class="texto_menu_inf" align="center"></td>
                  </tr>
                  <tr align=middle valign=center> 
                    <td class=texto_menu_inf colspan="9" height="30" align="center"><a  href="#top"><img  border=0 height=11 src="imagenes/arriba.gif" width=59></a></td>
                  </tr>
                  <tr align=middle> 
                    <td class=texto_menu_inf colspan=9 height=7 align="center"><img height=1 src="imagenes/cnaranja01.gif" width=400></td>
                  </tr>
                  <tr> 
                    <td class=texto_menu_inf colspan=9 height=7>&nbsp;</td>
                  </tr>
                </table>
                <table border=0 cellpadding=0 cellspacing=1 >
                  <tbody>
                    <tr> 
                      <td align="middle" class="ref" >|<a  href="FI_Legales.jsp" class="ref">ASPECTOS 
                        LEGALES</a>|</td>
                    </tr>
                  </tbody>
                </table>
              </form></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
<script language="JavaScript">
	 if( document.RetiroFS.cboEjercicio.selectedIndex==0)    
   	  			  document.RetiroFS.cboEjercicio.focus();   
     else if( document.RetiroFS.cboEje.selectedIndex==0)    	
      		document.RetiroFS.cboEje.focus(); 
	else if( document.RetiroFS.cboPrograma.selectedIndex==0)    
      		document.RetiroFS.cboPrograma.focus(); 
	else if( document.RetiroFS.cboProyecto.selectedIndex==0)    	
      		document.RetiroFS.cboProyecto.focus(); 
	else if( document.RetiroFS.cboAccion.selectedIndex==0)    	
       		document.RetiroFS.cboAccion.focus(); 
	<%if(forma!=null && !forma.equals("21"))
				{%>		
	 else if(document.RetiroFS.txtImporteR.value=="" )
         document.RetiroFS.txtImporteR.focus();
		   <%}%>
	else if( document.RetiroFS.cboAcuerdosComiteTec.selectedIndex==0)    
      		document.RetiroFS.cboAcuerdosComiteTec.focus(); 		
    else if( document.RetiroFS.txtMetaR.value=="")    	    
		      document.RetiroFS.txtMetaR.focus(); 
    else if( document.RetiroFS.cboFormaR.selectedIndex==0)   
				document.RetiroFS.cboFormaR.focus(); 
<%
if(forma!=null && pagosM==null)
	{
	forma=forma.trim();
	if(forma.equals( "3"))
	{
    if(sTipoCont.equals("1"))
     {%>
        else if( document.RetiroFS.cboBancoChequeR.selectedIndex==0) {
	     		document.RetiroFS.cboBancoChequeR.focus();
		  	}					
				else if( document.RetiroFS.cboNomPer.selectedIndex==0)    {
			  	document.RetiroFS.cboNomPer.focus();
				}		
   <%} 
     else 
	   {%>   
        
		    else if( document.RetiroFS.cboBancoChequeR.selectedIndex==0) 
				   document.RetiroFS.cboBancoChequeR.focus(); 
		    else if( document.RetiroFS.txtBeneficiarioChequeR.value="") 
				   document.RetiroFS.txtBeneficiarioChequeR.focus();		 
		<%}
  }  
	if(forma.equals( "SPEUA"))
		{
		if (sCta!=null)
			{%>
			if(document.RetiroFS.cboCuentaSpeuaR.selectedIndex	==0)
   					document.RetiroFS.cboCuentaSpeuaR.focus();
			<%} 
			} 
	if(forma.equals("18"))
		{
		if (sCta!=null)
			{%>
			if(document.RetiroFS.cboCuentaSiacR.selectedIndex==0)
   					document.RetiroFS.cboCuentaSiacR.focus();
			<%} 
		}   	
	if(forma.equals("19"))
		{
		if (sCta!=null)
			{%>
			if(document.RetiroFS.cboCuentaTbcR.selectedIndex==0)
		 	document.RetiroFS.cboCuentaTbcR.focus();
		<%}
		}   
	if(forma.equals("20"))
		{
		if (sCta!=null)
			{%>
			if(document.RetiroFS.cboCuentaPagoR.selectedIndex==0)
		 	document.RetiroFS.cboCuentaPagoR.focus();
			
		<%}
	 }
	
	if(forma.equals("24"))
		{
		if (sCta!=null)
			{%>
			if(document.RetiroFS.cboCuentaPagoR.selectedIndex==0)
		 	document.RetiroFS.cboCuentaPagoR.focus();
			
		<%}
	 }
	if(forma.equals("25"))
		{
		if (sCta!=null)
			{%>
			if(document.RetiroFS.cboCuentaPagoR.selectedIndex==0)
		 	document.RetiroFS.cboCuentaPagoR.focus();
			
		<%}
	 }
	if(forma.equals("26"))
		{
		if (sCta!=null)
			{%>
			if(document.RetiroFS.cboCuentaPagoR.selectedIndex==0)
		 	document.RetiroFS.cboCuentaPagoR.focus();
			
		<%}
	 }
	
	if(forma.equals("21"))
		{%>
		else if(document.RetiroFS.cboPaisDSwiftR.selectedIndex==0)
					document.RetiroFS.cboPaisDSwiftR.focus();
		else if(document.RetiroFS.txtCiudadDSwiftR.value=="")
					document.RetiroFS.txtCiudadDSwiftR.focus();
		else if(document.RetiroFS.txtCiudadDSwiftR.value=="")
					document.RetiroFS.txtCiudadDSwiftR.focus();
		else if(document.RetiroFS.txtBancoDSwiftR.value=="")
					document.RetiroFS.txtBancoDSwiftR.focus();
		else if(document.RetiroFS.txtPlazaSwiftR.value=="")
					document.RetiroFS.txtPlazaSwiftR.focus();									
		else if(document.RetiroFS.txtSucursalSwiftR.value=="")
					document.RetiroFS.txtSucursalSwiftR.focus();				
      else if(document.RetiroFS.txtCuentaSwiftR.value=="")
					document.RetiroFS.txtCuentaSwiftR.focus();
      else if(document.RetiroFS.txtCuentaSwiftR.value=="")
					document.RetiroFS.txtCuentaSwiftR.focus();
      else if(document.RetiroFS.txtCuentaSwiftR.value=="")
					document.RetiroFS.txtCuentaSwiftR.focus();
      else if(document.RetiroFS.txtBranchSwiftR.value=="")
					document.RetiroFS.txtBranchSwiftR.focus();										
      else if(document.RetiroFS.cboMonedaSwiftR.selectedIndex==0)
					document.RetiroFS.cboMonedaSwiftR.focus();
	else if(document.RetiroFS.txtImporteR.value=="" )
		         document.RetiroFS.txtImporteR.focus();
    else if(document.RetiroFS.txtCodigoSwiftR.value=="")
					document.RetiroFS.txtCodigoSwiftR.focus();
    else if(document.RetiroFS.txtNombreBSwiftR.value=="")
					document.RetiroFS.txtNombreBSwiftR.focus();
    else if(document.RetiroFS.txtCiudadBSwiftR.value=="")
					document.RetiroFS.txtCiudadBSwiftR.focus();
    else if(document.RetiroFS.txtDomicilioBSwiftR.value=="")
					document.RetiroFS.txtDomicilioBSwiftR.focus();
    else if(document.RetiroFS.txtTelefonoBSwiftR.value=="")
					document.RetiroFS.txtTelefonoBSwiftR.focus();
	<%}   
	}//fin cboForma != null
%>

</script>

</BODY></HTML>
