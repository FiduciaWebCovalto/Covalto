<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.RetirosDB"/>
<jsp:useBean id="Moneda"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="Moneda2"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="TipoPago"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="ct"  class="mx.com.inscitech.clients.negocio.nAcuerdos"/>
<jsp:useBean id="nombreSubCuenta"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">

<%@ include file="sesionInstrucc.jsp" %>
<%
String temporal;
//CUENTAS POR COBRAR
String GeneraArchivo = request.getParameter("GeneraArchivo")==null?"":request.getParameter("GeneraArchivo");
String pagosM=request.getParameter("pagosM");

String comboSeleccionado = request.getParameter("hiddentxtCombo")==null?"":request.getParameter("hiddentxtCombo");
                System.out.println("FormaLiquNvo "+request.getParameter("cboFormasL"));
                System.out.println("radioTipoPersonaNvo "+request.getParameter("radioTipoPersona"));
////////////////////
//int numFiso=Integer.parseInt( ((String)session.getAttribute( "NumFid" )).substring(0,((String)session.getAttribute( "NumFid" )).indexOf("-") ) );
int numFiso=Integer.parseInt( ((String)session.getAttribute( "NumFid" )) );
boolean bComiteTecnico= ct.aplica(numFiso,(String)session.getAttribute( "permiso" ));
	int l=0;
  DecimalFormat num = new DecimalFormat("############0.00");
	String contrato = (request.getParameter("cboContratoR")==null)?"":request.getParameter("cboContratoR").trim();
	String concepto = (request.getParameter("cboConceptoR")==null)?"":request.getParameter("cboConceptoR").trim();
	String liquidacion = (request.getParameter("cboFormasL")==null)?"":request.getParameter("cboFormasL").trim();
	String persona = (request.getParameter("txtBeneficiarioChequeR")==null)?"":request.getParameter("txtBeneficiarioChequeR").trim();
	String conceptop = (request.getParameter("cboConceptoP")==null)?"":request.getParameter("cboConceptoP").trim();
        
        String sTipoOperaRequest = (request.getParameter("cboTipoOperacion")==null)?"":request.getParameter("cboTipoOperacion").trim();
	String sCuentaCargoRAPRequest = (request.getParameter("cboCuentaCargoRAP")==null)?"":request.getParameter("cboCuentaCargoRAP").trim();
        
	System.out.println("Valor de Nueva cuenta"+request.getParameter("txtCuentaClabeSpei"));
  NumberFormat nf = null; 
  DecimalFormatSymbols dfs;
  
  nf = NumberFormat.getInstance();
  dfs = new DecimalFormatSymbols();
  dfs.setDecimalSeparator('.');
  dfs.setGroupingSeparator(',');
      
  ((DecimalFormat)nf).setDecimalFormatSymbols(dfs);
  nf.setMaximumFractionDigits(2);
  nf.setMinimumFractionDigits(2);
  nf.setMaximumIntegerDigits(12);
  nf.setMinimumIntegerDigits(1);
	
	int iHon =0;	
	String sTipoCont="0";
	//sTipoCont=(String)session.getAttribute("TpoCont");
	
   int i;
   i= 0;
	
	String forma=request.getParameter("cboFormasL");
	String opcion=(request.getParameter("iOpcion")==null)?"":request.getParameter("iOpcion").trim();
	String hidden=(request.getParameter("txtHiddenPersona")==null)?"0":request.getParameter("txtHiddenPersona").trim();
	
	String sCta[]=null;
	String sData []=null;
	String sCtaAnt=null;
	String sPais[] = null;
	String sMoneda[] = null;

	String pagosM2=request.getParameter("pagosM");
	String onChangeBusquedaPersona=request.getParameter("onChangeBusquedaPersona")==null?"":request.getParameter("onChangeBusquedaPersona");
	String txtNombrePersonaSpei=request.getParameter("txtNombrePersonaSpei")==null?"":request.getParameter("txtNombrePersonaSpei");
        String cboCuentaPagoR=request.getParameter("cboCuentaPagoR")==null?"":request.getParameter("cboCuentaPagoR");
//Forma de Liquidaci�n
if(forma != null && pagosM == null)
	{	forma=forma.trim();
						
        if(forma.equals("3")||forma.equals("17") ) {     
                if(request.getParameter("radioTipoPersona")!=null)        
                {
                    System.out.println("Debug");
                    System.out.println("Valor de onChangeBusquedaPersona"+onChangeBusquedaPersona);
                    System.out.println("Valor de radioTipoPersona"+request.getParameter("radioTipoPersona"));
                    System.out.println("Valor de cboCuentaPagoR ants: "+cboCuentaPagoR);
                    System.out.println("Valor de eval cbo: "+(cboCuentaPagoR!=null&&cboCuentaPagoR.length()>0));
                    if(request.getParameter("radioTipoPersona").equals("1")&&
                    !(cboCuentaPagoR!=null&&cboCuentaPagoR.length()>0)){//busqueda cuentas por fiso
                            sCta = BD.getData(14,(String)session.getAttribute( "NumFid" )); 
                    } 
                    else if(request.getParameter("radioTipoPersona").equals("4")&&
                    txtNombrePersonaSpei!=null&&txtNombrePersonaSpei.length()>0&&
                    cboCuentaPagoR.length()==0){//busqueda cuentas por titular
                            sCta = BD.getData(52,(String)session.getAttribute( "NumFid" )+"&2="+txtNombrePersonaSpei); 
                    }else if((request.getParameter("radioTipoPersona").equals("4")||
                    request.getParameter("radioTipoPersona").equals("1"))&&
                    (cboCuentaPagoR!=null&&cboCuentaPagoR.length()>0)){//busqueda de plaza y asignacion de la cuenta seleccionada
                            System.out.println("Valor de cboCuentaPagoR: "+cboCuentaPagoR);
                            if(sCta==null){
                                sCta=new String[1];
                                sCta[0]=cboCuentaPagoR;
                            }    
                            System.out.println("Valor de sCta: "+sCta[0]);
                            String []sProv=new String[3];
                            String []sData1={null};
                            sProv=cboCuentaPagoR.split("\\|");
                            sCtaAnt = cboCuentaPagoR;
                            for(String info : sProv){
                                System.out.println("Info de la cuenta seleccionada: "+info);
                            }
                            sData1=BD.getData(53,sProv[2].substring(0,3)+"&id2="+sProv[2].substring(3,6)); 
                            sData=new String[3];
                            sData[0]=sProv[2];
                            sData[1]=sData1[0];
                            sData[2]=sProv[0];
                            for(String info : sData){
                                System.out.println("Info de la sData seleccionada: "+info);
                            }
                    }
                 } 					
        }   

        //SWIFT
        if(forma.equals("21")) {   
                   sPais =BD.getData(4,"");
                   sMoneda =BD.getData(51,"");
        }

	}//fin cboFormasL != null
  
  
  String onChangeCombo=request.getParameter("onChangeCombo")==null?"":request.getParameter("onChangeCombo");
   String arrfiso[] = null;
   arrfiso=session.getAttribute("Fideicomiso").toString().replaceAll(" ","").split("-");
   int fiso=Integer.parseInt("0"+arrfiso[0]);
   String numContrato=request.getParameter("cboContratoR")==null?"0":request.getParameter("cboContratoR");
   String arrNomCont[]=null;
   String arrayNombreSubCuenta[]={"",""};
   if(onChangeCombo.equals("TRUE")&&numContrato!=null){
           //Esta version no maneja subfiso por cuenta de inversion
          arrayNombreSubCuenta[0]="";
          arrayNombreSubCuenta[1]="";
   }
%>
<HTML>
<HEAD><TITLE>Retiro - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
</script>
<script language="JavaScript" SRC='scripts/general.js'></script>
<script  language="JavaScript" >




             function onChangeComboNomSubCta(){
                  document.Retiro.action = "FI_Instruccion2.jsp?onChangeCombo=TRUE"; 
                  
                   document.Retiro.hiddentxtCombo.value = (document.Retiro.cboContratoR.selectedIndex==0)?"":"contrato"; 
                  
                  document.Retiro.cboCtaCheques.selectedIndex=0;
                  document.Retiro.cboCtaCheques.options[0].text = "-1";
                  
									document.Retiro.submit();
              }
			  
             function onChangeComboBusquedaPersona(){
                  document.Retiro.action = "FI_Instruccion2.jsp?onChangeBusquedaPersona=TRUE&&radioTipoPersona=4&&txtNombrePersonaSpei="+document.Retiro.txtNombrePersonaSpei.value; 
				  document.Retiro.submit();
              }			  
              
            
  // -----------codigo agregado--------------------------------------------
              function onChangeCuentaCheques()
              {
                document.Retiro.action = "FI_Instruccion2.jsp?onChangeCombo=TRUE"; 
                
                document.Retiro.hiddentxtCombo.value = (document.Retiro.cboCtaCheques.selectedIndex==0)?"":"cheques"; 
                document.Retiro.hiddentxtIdSubcuenta.value="";
                document.Retiro.hiddentxtNomSubcuenta.value="";
                document.Retiro.txtIdSubcuenta.value="";
                document.Retiro.txtNomSubcuenta.value="";
                
                document.Retiro.cboContratoR.selectedIndex=0;
                document.Retiro.cboContratoR.options[0].text = "-1";
                
                document.Retiro.submit();
              }
              
              function ocultaCamposCombo()
              {
                var comboSeleccionado = '<%=comboSeleccionado%>';
                
                if(comboSeleccionado=="contrato")
                {
                  document.getElementById("divCamposCuentas1").style.visibility="visible";
                  document.getElementById("divCamposCuentas2").style.visibility="visible";
                  document.getElementById("divCamposCuentas3").style.visibility="visible";
                  document.getElementById("divCamposCuentas4").style.visibility="visible";
                  document.getElementById('cbosub').style.visibility='hidden';
                  document.getElementById('etisub').style.visibility='hidden';
                }
                else
                {
                  document.getElementById("divCamposCuentas1").style.visibility="hidden";
                  document.getElementById("divCamposCuentas2").style.visibility="hidden";
                  document.getElementById("divCamposCuentas3").style.visibility="hidden";
                  document.getElementById("divCamposCuentas4").style.visibility="hidden";
                  document.getElementById('cbosub').style.visibility='visible';
                  document.getElementById('etisub').style.visibility='visible';
                }
              }  
              
              
              function cambioTitular(combo)
                {
                  if(combo.selectedIndex!=0)
                    document.Retiro.txtTitular.value = combo.options[combo.selectedIndex].text;
                    
                  else
                    document.Retiro.txtTitular.value = "";
                }
              
              
      
                
              
              function TerceroD()
              {
                  document.Retiro.action = "FI_Instruccion2.jsp#tipoPersona"; 
                  document.Retiro.submit();
              }
            function FideicomisarioD()
              {
                  document.Retiro.action = "FI_Instruccion2.jsp#tipoPersona"; 
                  document.Retiro.submit();
              }
              
            function LimpiaCombo(){
            
            
                  document.Retiro.action = "FI_Instruccion2.jsp#tipoPersona"; 
                  document.Retiro.submit();
            }
            
            function FideicomitenteD()
            {
              document.Retiro.action = "FI_Instruccion2.jsp#tipoPersona";        
              document.Retiro.submit();
            }	
   
  // -----------codigo agregado--------------------------------------------   

            function generar() {
              document.Retiro.action = "FI_Instruccion2.jsp?GeneraArchivo=Recibir Archivo";
              document.Retiro.submit();  
              return true;
            }//function generar
						function ABAR()
							{
								document.Retiro.action = "FI_Instruccion2.jsp#codigoSWIFT";
                				document.Retiro.txtCodigoSWIFT.value = document.getElementById("rdCodigoSWIFTABA").value;
								document.Retiro.submit();
							}	
						function IBANR()
							{
									document.Retiro.action = "FI_Instruccion2.jsp#codigoSWIFT"; 
                  					document.Retiro.txtCodigoSWIFT.value = document.getElementById("rdCodigoSWIFTIBAN").value;
									document.Retiro.submit();
							}

	function altaPersona(opcion) {
	   if(opcion)
		   document.Retiro.iOpcion.value = 2;
		document.Retiro.action = "FI_Instruccion2.jsp";//#formaPago
		document.Retiro.submit();
	}
	
	function validaAltaPersona() {
	   if(document.Retiro.txtPersonaR.value == "") {
           Swal.fire('error', 'Debe capturar el nombre de la persona!', 'error')
		 document.Retiro.txtPersonaR.focus();
		} 
	  else {
		 document.Retiro.txtHiddenPersona.value = 2;
		 document.Retiro.action = "FI_Instruccion2.jsp?txtPersonaR="+document.Retiro.txtPersonaR.value;
		 document.Retiro.submit();
	  }  
	}


function validacion(existeToken) 
	{
  
  
  document.getElementById("divCamposCuentas1").style.visibility="hidden";
  document.getElementById("divCamposCuentas2").style.visibility="hidden";
  document.getElementById("divCamposCuentas3").style.visibility="hidden";
  document.getElementById("divCamposCuentas4").style.visibility="hidden";
  document.getElementById('cbosub').style.visibility='hidden';
  document.getElementById('etisub').style.visibility='hidden';

<%if(request.getParameter("cboConceptoR")!=null && request.getParameter("cboConceptoR").trim().equals("Otro"))
		{%>
			if(document.Retiro.txtConceptoR.value=="")    
				    {
                                        Swal.fire('error', 'Escribe el Concepto del Retiro!', 'error')
					document.Retiro.txtConceptoR.focus();
					 return;
					}
			if(validaConcepto(document.Retiro.txtConceptoR.value))    
				{
                                        Swal.fire('error', 'Favor de verificar la  redacci�n del Concepto.\nLa coma,comilla simple y comillas no son caracteres validos', 'error')
					document.Retiro.txtConceptoR.focus();
					 return;
				}
					<%}%>

<%if(bComiteTecnico)
	{%>			
if( document.Retiro.cboAcuerdosComiteTec.selectedIndex==0)    
			{
      		Swal.fire({text: 'Seleccionar el acuerdo de comite', icon: 'error'});
      		document.Retiro.cboAcuerdosComiteTec.focus();
			 return;
	        }			
<%}%>				
if( document.Retiro.cboFormasL.selectedIndex==0)    
 			{
                        Swal.fire('error', 'Selecciona una Forma de Pago!', 'error')
      		document.Retiro.cboFormasL.focus();
			return;
	        }

<%if(pagosM==null)
			{%>
if( document.Retiro.cboFormasL.selectedIndex>0 && <%="'"+(forma==null?"Selecciona Forma":forma)+"'"%>!= document.Retiro.cboFormasL.value  )   
			{
                        Swal.fire('error', 'Espera a que se termine de cargar la pagina!', 'error')
			 return;
	        }
		<%}		

if(forma!=null && pagosM==null) {
	forma=forma.trim();
	//SWIFT
	if(forma.equals("21"))
		{%>
    
	if(validaConcepto(document.Retiro.txtCiudadDSwiftR.value))    
      		{
	        Swal.fire({text: 'Informacion incorrecta en el Pais', icon: 'error'});
      		document.Retiro.txtCiudadDSwiftR.focus();
			return;
	        }		
	if(validaConcepto(document.Retiro.txtBancoDSwiftR.value))    
      		{
	        Swal.fire({text: 'Informacion incorrecta en el Banco', icon: 'error'});
      		document.Retiro.txtBancoDSwiftR.focus();
			return;
	        }			
        
	 if(validaConcepto(document.Retiro.txtPlazaSwiftR.value))    
      		{
	        Swal.fire({text: 'Informacion incorrecta en la Plaza', icon: 'error'});
      		document.Retiro.txtPlazaSwiftR.focus();
			return;
	        }	
				
	if(isNaN(document.Retiro.txtSucursalSwiftR.value))
					  {
					  Swal.fire({text: 'Incorpora la Sucursal', icon: 'error'});
					  document.Retiro.txtSucursalSwiftR.value="";
					  document.Retiro.txtSucursalSwiftR.focus();
					  return;	
					  }
	if(isNaN(document.Retiro.txtCuentaSwiftR.value))   
						{
					  Swal.fire({text: 'Informacion incorrecta en la Cuenta SWIFT', icon: 'error'});
					  document.Retiro.txtCuentaSwiftR.value="";
					  document.Retiro.txtCuentaSwiftR.focus();
					  return;
					  }
	  if(validaCodigo(document.Retiro.txtBranchSwiftR.value))    
	  				{
		        Swal.fire({text: 'Informacion incorrecta en el Branch', icon: 'error'});
    	  		document.Retiro.txtBranchSwiftR.focus();
				return;
	    	    }
						

   
	  if(validaCodigo(document.Retiro.txtCodigoSwiftR.value))     
	  			{
	        	Swal.fire({text: 'Informacion incorrecta en el Codigo', icon: 'error'});
	      		document.Retiro.txtCodigoSwiftR.focus();
				return;
	        	}		
	if(validaConcepto(document.Retiro.txtNombreBSwiftR.value))     
			{
	        Swal.fire({text: 'Informacion incorrecta en el Nombre del Beneficiario', icon: 'error'});
      		document.Retiro.txtNombreBSwiftR.focus();
			return;
	        }		
	 if(validaConcepto(document.Retiro.txtDomicilioBSwiftR.value))
					{
					Swal.fire({text: 'Informacion incorrecta en la Ciudad', icon: 'error'});	
					document.Retiro.txtDomicilioBSwiftR.focus();
					return;
					 }
	   if(validaConcepto(document.Retiro.txtTelefonoBSwiftR.value))
					{
					Swal.fire({text: 'Informacion incorrecta en el Telefono', icon: 'error'});
					document.Retiro.txtTelefonoBSwiftR.focus();
					return;
					 }					
		<%}   
		
	}//fin cboForma != null
%>

//valida si el usuario usa token
//1=si
//0=no
if(existeToken==1)
	{
	mostrarToken(); 
	return;
	}
	
	
 document.Retiro.action="confirmarInst_2.jsp";
 document.Retiro.submit();
}

function aceptarToken() 
	{
	if(document.Retiro.txtToken.value=="")
		{
		Swal.fire({text: 'Introduce el Token', icon: 'error'});
		return;
		}	
   if((document.Retiro.txtToken.value).length<6)
		{
		Swal.fire({text: 'Longitud incorrecta en el Token', icon: 'error'});
		document.Retiro.txtToken.value="";
		return;
		}	
	if(isNaN(document.Retiro.txtToken.value))
		{
		Swal.fire({text: 'Valores no Numericos en el Token', icon: 'error'});
		document.Retiro.txtToken.value="";
		return;
		}		
	document.Retiro.action="confirmarInst_2.jsp";
	document.Retiro.submit();
	}	
	
function mostrarToken() 
{
document.getElementById("datos").style.visibility = 'hidden';
token.style.visibility = 'visible';
document.Retiro.txtToken.focus();

}

function ocultarToken() 
{

document.Retiro.cboContratoR.selectedIndex=0;
document.Retiro.cboCtaCheques.selectedIndex=0; 
document.Retiro.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}

</script>
</HEAD>
<body class="bg-light">
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
  
<div class="table-responsive" style="max-height: 900px; overflow-y: auto;">
                <table id="fisosDisponibles"  class="table table-responsive table-hover"> 
     <TBODY>
    <TR > 
      <TD valign="top" align="center"> 
	  <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute("Fideicomiso") %><a name="top"></a></td>
          </tr>
        </table>
        <table width="655" border="0">
          <tr> 
            <td width="649" class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Retiro</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> 
            <form name="Retiro" id="Retiro" method="post" action="confirmarInst_2.jsp" 
            class="needs-validation" novalidate>
            <input class="form-control" type="hidden" name="txtTitular" id="txtTitular" value="">
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
                                    <input class="form-control" type="password" name="txtToken" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  value="<%=request.getParameter("txtToken")!=null?request.getParameter("txtToken"):""%>"></td>
                                </tr>
                                <tr> 
                                  <td>&nbsp;</td>
                                  <td>&nbsp;</td>
                                </tr>
                                <tr> 
                                  <td colspan="2" align="center"> <input class="form-control" type="button" name="AceptarToken" value="Aceptar" onClick="aceptarToken()" class="btn btn-primary"> 
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="form-control" type="button" name="CancelarToken" value="Cancelar" onClick="ocultarToken();" class="btn btn-danger"> 
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
                <table width="495" id="datos">
                  <tr> 
                    <td height="20"  colspan="2" align="left" class="subtitulo">Retiro:</td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="2"><input class="form-control" maxlength="125" name="txtHiddenPersona" value="" type="hidden" size="30">
                      &nbsp; <input class="form-control" type="hidden" value="1" name="iOpcion"></td>
                  </tr>
                  <tr> 
                    <td align="right"  class="texto" >Fecha:</td>
                    <td class="texto">
                    <input class="form-control" type="hidden" name="txtFecha" maxlength=10 size="8" 
                    value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" class="texto"> 
                      <input class="form-control" type="button" id="cboCalendarioI" name="cboCalendarioI"  style=" WIDTH: 100px" 
                      value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha%>" onChange="Retiro.txtFecha.value=Retiro.cboCalendarioI.value;"><input class="form-control" type="button" id="lanzaCalendarioI" name="lanzaCalendarioI"  style=" WIDTH: 15px"   class="botonCbo" value="v"> 
                      <SCRIPT type=text/javascript>
																						// script que define y configura el calendario-
																						Calendar.setup({
																							inputField     :    "cboCalendarioI",      // id del campo de texto
																							ifFormat       :    "%d/%m/%Y",       // formato de la fecha, cuando se escriba en el campo de texto
																							button         :    "lanzaCalendarioI"   // el id del bot�n que lanzar� el calendario
																						});					
																   </SCRIPT> &nbsp; 
                    
                    </td>
                  </tr>
                  
                  <tr> 
                    <td width="150" height="180" class="texto" align="right"> No. Contrato 
                      de Inversi&oacute;n:</td>
                    <td  class="texto"> 
                    
                    <select class="form-select"  name="cboContratoR" id="cboContratoR" method="post" action=""
                    tabindex="1" onchange="onChangeComboNomSubCta();">
                        <option value="">Selecciona un Contrato</option>
                        <%
					  String cboContratos[]= BD.getData(3,(String)session.getAttribute( "NumFid" )); 
					  if(cboContratos!=null)
							for(l=0;l<cboContratos.length;l++)
								{%>
                        <option value="<%=cboContratos[l]%>" <%=contrato.equals(cboContratos[l].trim())?"selected":""%>><%=cboContratos[l]%></option>
                        <%}%>
                      </select> 
                      </td>
                  </tr>
                 <tr> 
                    <td  class="texto" align="right"><div id="divCamposCuentas1" style="visibility:hidden;">Id Subcuenta:</div></td>
                    <td height="3" width="345" class="texto"> 
                       <div id="divCamposCuentas2" style="visibility:hidden;"> <input class="form-control" type="text" name="txtIdSubcuenta" size="13"  style=" WIDTH: 130px;" maxlength="20"  value="<%=arrayNombreSubCuenta[0].equals("")?request.getParameter("hiddentxtIdSubcuenta")==null?"":request.getParameter("hiddentxtIdSubcuenta"):arrayNombreSubCuenta[0]%>" disabled="disabled" /> 
                        <input class="form-control" type="hidden" name="hiddentxtIdSubcuenta" size="13"  style=" WIDTH: 130px" maxlength="20"  value="<%=arrayNombreSubCuenta[0].equals("")?request.getParameter("hiddentxtIdSubcuenta")==null?"":request.getParameter("hiddentxtIdSubcuenta"):arrayNombreSubCuenta[0]%>"/> 
                        <input class="form-control" type="hidden" name="hiddentxtCombo" size="13"  style=" WIDTH: 130px;" maxlength="20"  value="<%=(request.getParameter("hiddentxtCombo")==null)?"":request.getParameter("hiddentxtCombo")%>"/> 
                      </div>
                    </td>
                  </tr>
                  <tr> 
                    <td  class="texto" align="right"><div id="divCamposCuentas3" style="visibility:hidden;">Nombre Subcuenta:</div></td>
                    <td height="3" width="345" class="texto"> 
                       <div id="divCamposCuentas4" style="visibility:hidden;"> <input class="form-control" type="text" name="txtNomSubcuenta" size="13"  style=" WIDTH: 130px;" maxlength="20"  value="<%=arrayNombreSubCuenta[1].equals("")?request.getParameter("hiddentxtNomSubcuenta")==null?"":request.getParameter("hiddentxtNomSubcuenta"):arrayNombreSubCuenta[1]%>" disabled="disabled"/> 
                        <input class="form-control" type="hidden" name="hiddentxtNomSubcuenta" size="13"  style=" WIDTH: 130px" maxlength="20"  value="<%=arrayNombreSubCuenta[1].equals("")?request.getParameter("hiddentxtNomSubcuenta")==null?"":request.getParameter("hiddentxtNomSubcuenta"):arrayNombreSubCuenta[1]%>"/> 
                      </div>
                    </td>
                  </tr>
				  
                  <tr> 
                    <td class="texto" align="right">Cuenta de Cheques</td>
                    <td class="texto">
                      
                      <select class="form-select" name="cboCtaCheques" id="cboCtaCheques" onchange="onChangeCuentaCheques()">
                        <option value="">Selecciona Cuenta de Cheque</option>
                          <% 
                            temporal=request.getParameter("cboCtaCheques");   
          
                            if(request.getParameter("cboCtaCheques")!=null&&!temporal.equals("Selecciona Cuenta de Cheque"))
                              out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),request.getParameter("cboCtaCheques")));//request.getParameter("cboCtaCheques")
                            else
                              out.print(BD.DataCombos(50,(String)session.getAttribute("NumFid"),""));
                        %>
                        
                      </select>
                      
                    </td>
                  </tr>
                  
                  <tr>
                  
                    <td style="visibility:hidden" id="etisub"  class="texto" align="right">Subcuenta de Cheque</td>
                    <td style="visibility:hidden" id="cbosub">
                        <select class="form-select" name="cboSubCtas" id="cboSubCtas">
                          <option value="">Selecciona una Subcta</option>
                            <% 
                              temporal=request.getParameter("cboSubCtas");   
                              if(request.getParameter("cboSubCtas")!=null&&!temporal.equals("Selecciona una Subcta"))
                                out.print(Moneda.DataCombos(49,(String)session.getAttribute("NumFid"),request.getParameter("cboSubCtas")));//request.getParameter("cboCtaCheques")
                              else
                                out.print(Moneda.DataCombos(49,(String)session.getAttribute("NumFid"),""));
                          %>
                          
                        </select> 
                    </td>
                    </div>
                  </tr>
                  <tr> 
                    <td width="150" class="texto" align="right">Concepto: </td>
                    <td  class="texto"> 
                    <class="mb-3">
                    <select class="form-select" name="cboConceptoR" id="cboConceptoR" onchange="asignarTexto();" required>
                        <option value="">Selecciona un Concepto</option>
                        <%
                          String cboConceptos[][]= BD.getDataFormas(1, (String)session.getAttribute( "NumFid"),""); 
                        if(cboConceptos!=null)
                                for(l=0;l<cboConceptos.length;l++)
                                        {%>
                        <option value="<%=cboConceptos[l][0]%>" <%=concepto.equals(cboConceptos[l][0].trim())?"selected":""%>><%=cboConceptos[l][1]%></option>
                        <%}%>
                      </select>
                      <div class="invalid-feedback">
                            Por favor, seleccione un Concepto.
                            </div>
                            </div>
                      <input class="form-control" name="txtConcepto" id="txtConcepto" type="hidden" maxlength="125"> 
                    </td>
                  </tr>
                  <tr> 
                    <td  class="texto" align="right">Descripcion: </td>
                    <td class="texto">
                    <class="mb-3">
                    <input class="form-control" maxlength=128 name="txtConceptoR"  
                    size="30" style="WIDTH: 300px"  tabindex="3" 
                    value="<%=request.getParameter("txtConceptoR")!=null?request.getParameter("txtConceptoR"):""%>" required> 
                    <div class="invalid-feedback">
                    Por favor, seleccione la Descripcion.
                    </div>
                    </div>
                    </td>
                  </tr>
				  
                  <tr> 
                    <td></td>
                    <td align="left"><font class="mensaje">Max. 125 caracteres</font></td>
                  </tr>
				  <%if(bComiteTecnico)
				  			{

							%>
                  <tr>
                    <td height="29" align="right"  class="textoNegrita"> No. de Acuerdo 
                      del Comite T&eacute;cnico:</td>
			          <td ><select class="form-select"  name="cboAcuerdosComiteTec" method="post" action=""  tabindex="4">
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
                      </select></td>
                  </tr>
				  <%}%>

                 <!--SECCION CUENTAS POR COBRAR-->
            <tr> 
              <td class="texto" align="right">
              <a name="pagosM"></a>Adjuntar Formato de Instruccion:
              </td>
              <td colspan="2" class="texto"> 
              <input class="form-check-input" name="pagosMIntercam" type="checkbox"  value="S" <%=request.getParameter("pagosMIntercam")!=null && request.getParameter("pagosMIntercam").equals("S")?"checked ":" "%> onClick="Mostrar();"/>
              </td>
            </tr>
                 
         
                
                 <!--SECCION CUENTAS POR COBRAR-->

				    <tr> 
                  <% 
                  //INICIA SECCION
                  if(iHon==1 || iHon==2)
				  			 {
							 if ((forma!=null && !forma.trim().equals("21")) || forma==null )
								{
							  %>
                
                                        <td width="150" class="texto" align="right"> Importe:</td>
                    <td width="333" class="texto"> <input class="form-control" type="text"
                    name="txtImporteR" size="25" class="texto3" <%=iHon!=0? "readonly":""%>  
                    value="<%=request.getParameter("txtImporteR")!=null?request.getParameter("txtImporteR"):""%>"   
                    onKeyUp="validaNum(this.form.txtImporteR);"   onBlur="formatImporte(this.form.txtImporteR)" required>  
                      &nbsp; </td>
                    		    <%			
								 }
					           } 
					    else 
						 		{ 
							if ((forma!=null && !forma.trim().equals("21")) || forma==null )
								{
								%>
                  <tr> 
                    <td class="texto" align="right">Divisa:</td>
                    <td class="texto"> 
                    <class="mb-3">
                    <select class="form-select" name="cboDivisa"  tabindex="5" required>
                        <option value="">Selecciona Divisa </option>
                        <%
						                temporal=request.getParameter("cboDivisa");   
                		       	if(request.getParameter("cboDivisa")!=null&&!temporal.equals("Selecciona Divisa"))
                              out.print(Moneda.DataCombos(4,"",request.getParameter("cboDivisa")));
                        		else
                      				out.print(Moneda.DataCombos(4,"",""));
  								      %>
                        
                      </select> 
                      
                      <div class="invalid-feedback">
                            Por favor, seleccione la Divisa.
                            </div>
                            </div>
                        </td>
                  </tr>                
 					<tr> 
                    <td width="150" class="texto" align="right"> Importe:</td>
                    <td width="333" class="texto"> 
                    <class="mb-3">
                    <input class="form-control" 
                    type="text" name="txtImporteR" size="25"  
                    <%=iHon!=0? "readonly":""%>  
                    value="<%=request.getParameter("txtImporteR")!=null?request.getParameter("txtImporteR"):""%>"   
                    onKeyUp="validaNum(this.form.txtImporteR);"   
                    onBlur="formatImporte(this.form.txtImporteR)"  tabindex="6" required/>
                        <div class="invalid-feedback">
                        Por favor, seleccione el Importe.
                        </div>
                        </div>

                      &nbsp; </td>
                    		<%}
							}%>
                     <input class="form-control" type="hidden" value="<%=iHon%>" name="txtHon" size="5">
                    </tr>

				
                  <tr> 
                    <td width="150" height="24" align="right"  class="texto"> 
                      Forma de liquidaci&oacute;n:</td>

                    <td  class="texto"> 
                    <class="mb-3">
                        <select class="form-select" name="cboFormasL" 
                        id="cboFormasL" onChange="<%=pagosM==null?"Mostrar()":""%>"  tabindex="7" required>
                        <option value="">Selecciona una Forma</option>
                        <%

                        if(pagosM!=null)
                          i=10;

						String cboLiquidacion[][]= BD.getDataFormas(3,(String)session.getAttribute("NumFid"),""); 							
						if(cboLiquidacion!=null)
							for(l=0;l<cboLiquidacion.length;l++)
							{%>
                        <option value="<%=cboLiquidacion[l][0]%>" <%=forma!=null && forma.trim().equals(cboLiquidacion[l][0].trim())?"selected":""%>> <%=cboLiquidacion[l][1]%></option>
                        <%}%>
                      </select>
                      <div class="invalid-feedback">
                            Por favor, seleccione Forma de liquidaci&oacute;n.
                            </div>
                            </div>
                      <span class="texto">
                      <input class="form-control" maxlength="89" name="txtFormaLiq"  id="txtFormaLiq" 
                      type="hidden" size="20"   value="">
                      </span> </td>
                  </tr>
                  <tr> 
                    <td height="21" colspan="2" class="texto">&nbsp; </td>
                  </tr>

                  <tr> 
                    <td  colspan="2" class="texto"> 

                      <%if(forma!=null && pagosM==null)
                        {
                        forma=forma.trim();
                        if(forma.equals("1")||forma.equals("31")||forma.equals("2")||forma.equals("11"))
                        {%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="2" ><a name="formaPago"><%=forma.equals("11")?"AVISO AFECTACION":"CHEQUE"%></a></td>
                        </tr>
                        <tr> 
                          <td colspan="2" class="texto">&nbsp;</td>
                        </tr>
                            <input class="form-control" type="hidden" name="txtNomBeneficiario"  
                            id="txtNomBeneficiario" size="30" value="">  
                        <%if(sTipoCont.equals("0"))  {%>
                        <tr> 

                          <td class="texto" align="right">Nombre del Beneficiario:</td>
                          <td  class="texto"> 
                          <class="mb-3">
                              <select class="form-select" name="txtBeneficiarioChequeR" 
                              id="txtBeneficiarioChequeR" onchange="asignarBeneficiario();" required>
                              <option value="">Selecciona una Persona</option>
                              <%											
								                 String sNomPer[]= BD.getData(7,(String)session.getAttribute("NumFid" )); 
									
							                	 if(sNomPer!=null)
								   	               for(l=0;l<sNomPer.length;l++)
									              {%>
                              <option value="<%=sNomPer[l]%>" <%=persona.equals(sNomPer[l].trim())?"selected":""%>><%=sNomPer[l]%></option>
                              <%}%>
                            </select> 
                             <div class="invalid-feedback">
                            Por favor, seleccione el Nombre del Beneficiario.
                            </div>
                            </div>
                            </td>
                        </tr>
                        
                        <%} else {%>
                        <%if(hidden.equals("2")) { 
                          opcion = "2";
						          }    
                       if(opcion.equals("2") && request.getParameter("txtPersonaR")!=null) {
					                 if(!request.getParameter("txtPersonaR").equals("")){
							                BD.insertaTercero((String)session.getAttribute("NumFid"),
							                BD.obtenNumTercero((String)session.getAttribute("NumFid")),request.getParameter("txtPersonaR"),fecha);						
							             }
						               opcion = "1" ;						 
                      }     					   
                    %>
                        <tr> 
                          <td class="texto" align="right">Nombre del Beneficiario:</td>
                          <td  class="texto"> 
                          <class="mb-3">
                          <select class="form-select" name="cboNomPer" 
                          id="cboNomPer" onchange="asignarBeneficiario();" required>
                              <option value="">Selecciona una Persona</option>
                              <%											
								                 String sNomPer[]= BD.getData(7,(String)session.getAttribute("NumFid" )); 
									
							                	 if(sNomPer!=null)
								   	               for(l=0;l<sNomPer.length;l++)
									              {%>
                              <option value="<%=sNomPer[l]%>" <%=persona.equals(sNomPer[l].trim())?"selected":""%>><%=sNomPer[l]%></option>
                              <%}%>
                            </select> 
                            <div class="invalid-feedback">
                            Por favor, seleccione la Persona.
                            </div>
                            </div>
                            </td>
                        </tr>
                    
                        <%if(opcion.equals("2")) {%>
                        <tr> 
                          <td colspan="2" ><a name="formaPago">PERSONA:</a></td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Nombre de la Persona:</td>
                          <td  class="texto">
                          <class="mb-3">
                          <input class="form-control" maxlength="125" 
                          name="txtPersonaR"  type="text" size="30" required>
                          <div class="invalid-feedback">
                            Por favor, seleccione el Nombre de la Persona.
                            </div>
                            </div>
                          
                          </td>
                        </tr>
                        <%}%>
                        <tr> 
                          <td colspan="2" class="texto">&nbsp;</td>
                        </tr>
                        <%}%>
                      </table>
                      
                      <%}
                      %>
                      <%//CIERRE
                                            
                                            
                      
                       //SECCION REPETIDA  31 EXPEDICION CHEQUE DE CAJA 
                                            if(forma.equals("31"))
								{%>
                      
                         <tr> 
                            <td class="texto" align="right">Nombre persona para recibir cheque:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtperschequeCaja" 
                            value="<%=request.getParameter("txtperschequeCaja")!=null?request.getParameter("txtperschequeCaja"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione el Nombre persona para recibir cheque.
                            </div>
                            </div>
                            </td>
                          </tr> 
                         <tr> 
                          <td colspan="2" ><a name="formaPago">"Direccion de Envio"</a></td>
                        </tr> 
                        <tr> 
                            <td class="texto" align="right">Calle o Avenida:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtCalleCaja" 
                            value="<%=request.getParameter("txtCalleCaja")!=null?request.getParameter("txtCalleCaja"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione la Calle o Avenida.
                            </div>
                            </div>
                            
                            </td>
                          </tr>
                          <tr> 
                            <td class="texto" align="right">Numero Exterior:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtNumExtCaja" 
                            value="<%=request.getParameter("txtNumExtCaja")!=null?request.getParameter("txtNumExtCaja"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione el Numero Exterior.
                            </div>
                            </div>
                            </td>
                            
                          </tr>
                          <tr> 
                            <td class="texto" align="right">Numero Interior:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtNumIntCaja" 
                            value="<%=request.getParameter("txtNumIntCaja")!=null?request.getParameter("txtNumIntCaja"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione el Numero Interior.
                            </div>
                            </div>
                            </td>
                          </tr>
                          <tr> 
                            <td class="texto" align="right">Colonia:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtColoniaCaja" 
                            value="<%=request.getParameter("txtColoniaCaja")!=null?request.getParameter("txtColoniaCaja"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione la Colonia.
                            </div>
                            </div>
                            </td>
                            
                          </tr>
                          <tr> 
                            <td class="texto" align="right">Delegacion o Municipio:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtDeleCaja" 
                            value="<%=request.getParameter("txtDeleCaja")!=null?request.getParameter("txtDeleCaja"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione la Delegacion o Municipio.
                            </div>
                            </div>
                            </td>
                          </tr>
                          <tr> 
                            <td class="texto" align="right">Codigo postal:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtCpCaja" 
                            value="<%=request.getParameter("txtCpCaja")!=null?request.getParameter("txtCpCaja"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione el Codigo postal.
                            </div>
                            </div>
                            </td>
                          </tr>
                          <tr> 
                            <td class="texto" align="right">Estado:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtEstadoCaja" 
                            value="<%=request.getParameter("txtEstadoCaja")!=null?request.getParameter("txtEstadoCaja"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione el Estado.
                            </div>
                            </div>
                            </td>
                          </tr>
                          <tr> 
                            <td class="texto" align="right">Ciudad:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtCiudadCaja" 
                            value="<%=request.getParameter("txtCiudadCaja")!=null?request.getParameter("txtCiudadCaja"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione la Ciudad.
                            </div>
                            </div>
                            
                            </td>
                          </tr>

                      
                      <%}//CIERRE                        
                        //para SPEI
                        if(forma.equals("3") ||forma.equals("17") )
                        {%>
                      <table width="100%" border="0">
                        <tr> 
                          <td colspan="2" ><a name="formaPago"> 
                            <%
							String sForma23 = null;
									 sForma23 = "SPEI";
								  %>
                            <%=sForma23%> :</a> </td>
                        </tr>
                  <input class="form-control" type="hidden" name="txtCuentaClabeSpeiHidden"  
                  id="txtCuentaClabeSpeiHidden" size="30" value="">  
                  <input class="form-control" type="hidden" name="txtTitularCuentaClabeSpeiHidden" 
                  id="txtTitularCuentaClabeSpeiHidden" size="30" value="">     
				<tr> 
                    <td  class="texto" align="right">Tipo de Persona:</td>
                  <tr> 
                    <td class="texto" align="right">&nbsp;</td>
                    <td align="left"  class="texto"><input class="form-check-input" type="radio" 
                    name="radioTipoPersona" id="radioTipoPersona" 
                    value="1" 
                    <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("1")?"checked ":" "%> onClick="TerceroD();">
                      Fideicomiso </td>
                  </tr>
                  <tr> 
                    <td class="texto" align="right">&nbsp;</td>
                    <td align="left"  class="texto">
                    <input class="form-check-input" type="radio" name="radioTipoPersona" id="radioTipoPersona" 
                    value="4" <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("4")?"checked ":" "%> onClick="TerceroD();">
                      Buscar Cuenta </td>
                  </tr>	
                  <tr> 
                    <td class="texto" align="right">&nbsp;</td>
                    <td align="left"  class="texto">
                    
                    <input class="form-check-input" type="radio" name="radioTipoPersona" 
                    id="radioTipoPersona" value="5" <%=request.getParameter("radioTipoPersona")!=null && request.getParameter("radioTipoPersona").equals("5")?"checked ":" "%> onClick="TerceroD();">
                      Agregar Cuenta </td>
                  </tr>					  
                                <%
                                String temporal2="";
                                temporal2=request.getParameter("radioTipoPersona");
                                System.out.println("Valor de radioTipoPersona combo "+temporal2);				  
                                if(temporal2!=null&&(temporal2.equals("4")||temporal2.equals("5")) ){
                                System.out.println("Valor de txtNombrePersonaSpei caja "+request.getParameter("txtNombrePersonaSpei"));				  
                                if(temporal2.equals("4")&&sData==null){	
                                %>
				<tr> 
                  <td  class="texto" align="right">Nombre Beneficiario:</td>
                  <td align="left" class="texto"> 
                  <input class="form-control" maxlength=128 name="txtNombrePersonaSpei" id="txtNombrePersonaSpei" 
                  size="30" style="WIDTH: 300px"  tabindex="3" onblur="onChangeComboBusquedaPersona();" 
                  value="<%=request.getParameter("txtNombrePersonaSpei")!=null?request.getParameter("txtNombrePersonaSpei"):""%>" required>     
                  <input class="form-control" type="hidden" name="txtNombrePersonaSpeiHidden"  size="30"  value="<%=request.getParameter("txtNombrePersonaSpei")!=null?request.getParameter("txtNombrePersonaSpei"):""%>">     
                 </tr>				
				<%}
				else if(temporal2.equals("5")){
					%>
				<tr> 
                 <input class="texto" type="hidden" name="Agregarcuenta"  value="1">
                  <td  class="texto" align="right">Cuenta CLABE o Vostro:</td>
                  <td align="left" class="texto"> 
                  <input type="text" class="form-control" pattern="\d*" maxlength=128 name="txtCuentaClabeSpei" 
                  id="txtCuentaClabeSpei" size="30" onblur="funcionpato(this.value);validaNumSinFoco(this);">     
   
                 </tr>	
				<tr> 
                  <td  class="texto" align="right">Titular:</td>
                  <td align="left" class="texto"> 
                  <input class="form-control" maxlength=128 name="txtTitularCuentaClabeSpei"  
                  size="30" style="WIDTH: 300px"  tabindex="1" 
                  value="<%=request.getParameter("txtTitularCuentaClabeSpei")!=null?
                  request.getParameter("txtTitularCuentaClabeSpei"):""%>" required>     

                 </tr>					 
                        <%}
                        }
                        System.out.println("Valor de sCta para condicion"+sCta);
                        System.out.println("Valor de sData para condicion"+sData);
                        if(sCta!=null){
                            System.out.println("Valor de sData para condicion"+sData);
                            %>
                        <tr> 
                        <td width="31%" align="right" class="texto">N&uacute;mero de cuenta:</td>
                        <td width="69%"  class="texto"> 
                                <select class="form-select"  name="cboCuentaPagoR" id="cboCuentaPagoR" 
                                onChange="asignarTitular();" required>
                                        <option value="">Selecciona Cuenta <%for(int j=0;j<sCta.length;j++){%></option>
                                        <%if(sCtaAnt!=null){%>
                                        <option value="<%=sCta[j]%>" <%=sCtaAnt.trim().equals(sCta[j].trim())?"selected":""%>><%=sCta[j]%>
                                        <%}else{%>
                                        <option value="<%=sCta[j]%>"><%=sCta[j]%>
                                        <%}%>
                                        </option>
                                                                                                                                                <%}%>
                                </select>
                        </td>
                        </tr>
                        <%                      if(sCtaAnt!=null)
						 if (!sCtaAnt.equals("") &&  !sCtaAnt.equals("Selecciona Cuenta") ) {
							if(sData[0]!=null)
								{%>
                        <input class="form-control" type="hidden" name="txtCveBancoPagoR"  value="<%=sData[0]%>">
                        <input class="form-control" type="hidden" name="txtCuentaPagoR" value="<%=sCtaAnt%>">
                        <input class="form-control" type="hidden" name="txtPlazaPagoR" value="<%=sData[1]%>">
                        <input class="form-control" type="hidden" name="txtTitularPagoR" value="<%=sData[2]%>">
                        <input class="form-control" type="hidden" name="txtRfcPagoR" value="">
                        <input class="form-control" type="hidden" name="txtNumPagoR" value="">
            
                        <tr> 
                          <td class="texto" align="right">Plaza:</td>
                          <td  class="textoNegrita"> <%=sData[1]%></td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Titular de la Cuenta:</td>
                          <td  class="textoNegrita"><%=sData[2]%></td>
                        </tr>
                        <%}
							}
							else
							{%>
                        <input class="form-control" type="hidden" name="txtPlazaPagoR" value="">
                        <input class="form-control" type="hidden" name="txtTitularPagoR" value="">
                        <%
						}
            }%>
                      </table>
                      <%}  
                      if(forma.equals("21"))
                    {%>
                    <input class="form-control" type="hidden" name="txtImporteR" size="25"    value="<%=request.getParameter("txtImporteTSwiftR")!=null?request.getParameter("txtImporteTSwiftR"):""%>" >
                      <table width="100%" border="0" >
                        <tr> 
                          <td  colspan="2"><a name="formaPago">SWIFT: </a></td>
                        </tr>
                    
                        <tr> 
                          <td colspan="2" height="30" class="mensaje">(SOLO PARA 
                            TRANSFERENCIAS EN MONEDA EXTRANJERA)</td>
                        </tr>
                        
                        <tr> 
                          <td  colspan="2">&nbsp;</td>
                        </tr>
                        <tr> 
                          <td class="textoNegrita"  colspan="2">Banco Domiciliario:</td>
                        </tr>
                        <tr> 
                          <td width="31%" align="right" class="texto">Pa&iacute;s:</td>
                          <td width="69%" class="texto"> 
                          <div class="mb-3">
                          <select class="form-select" name="cboPaisDSwiftR" required>
                              <option value="">Selecciona Pais</option>
                              <% if(sPais!=null)
                                for(l=0;l<sPais.length;l++)
                                {%>
                                <option value="<%=sPais[l]%>" <%=request.getParameter("cboPaisDSwiftR")!=null 		
                                &&	request.getParameter("cboPaisDSwiftR").trim().equals(sPais[l].trim())?"selected":""%>>
                                <%=sPais[l]%></option>
                                <%}%>
                            </select> 
                            <div class="invalid-feedback">
                            Por favor, seleccione el Pais.
                            </div>
                            </div>
                            </td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Ciudad:</td>
                          <td class="texto"> <input class="form-control" maxlength=50 name="txtCiudadDSwiftR"
                          style=" WIDTH: 200px" 
                          value="<%=request.getParameter("txtCiudadDSwiftR")!=null?request.getParameter("txtCiudadDSwiftR"):""%>" required> 
                          </td>
                        </tr>
                        <tr>
                          <td class="texto" align="right">Nombre del Banco:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <input class="form-control" maxlength=50 name="txtBancoDSwiftR"  style=" WIDTH: 200px"  value="<%=request.getParameter("txtBancoDSwiftR")!=null?request.getParameter("txtBancoDSwiftR"):""%>" required> 
                          <div class="invalid-feedback">
                            Por favor, seleccione el Nombre del Banco.
                            </div>
                            </div>
                          </td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Plaza:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <input class="form-control" maxlength=50  name="txtPlazaSwiftR"  style=" WIDTH: 200px"  value="<%=request.getParameter("txtPlazaSwiftR")!=null?request.getParameter("txtPlazaSwiftR"):""%>" required> 
                          <div class="invalid-feedback">
                            Por favor, seleccione el Pais.
                            </div>
                            </div>
                          </td>
                        </tr>
                        <tr> 
                          <td  class="texto"> </td>
                          <td class="mensaje"> Colocar No. de Plaza o Ciudad y 
                            Estado.</td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Sucursal:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <input class="form-control" type="text"  name="txtSucursalSwiftR" style=" WIDTH: 100px"  maxlength="5" value="<%=request.getParameter("txtSucursalSwiftR")!=null?request.getParameter("txtSucursalSwiftR"):""%>" required> 
                          <div class="invalid-feedback">
                            Por favor, seleccione la Sucursal.
                            </div>
                            </div>
                          </td>
                        </tr>
                        
                        <tr> 
                          <td class="texto" align="right">N&uacute;mero de Cuenta:</td>
                          <td class="texto">
                          <class="mb-3">
                          <input class="form-control" maxlength="50" name="txtCuentaSwiftR" 
                          style=" WIDTH: 200px" 
                          value="<%=request.getParameter("txtCuentaSwiftR")!=null?request.getParameter("txtCuentaSwiftR"):""%>"/required> 
                          <div class="invalid-feedback">
                            Por favor, seleccione el N&uacute;mero de Cuenta.
                            </div>
                            </div>
                          </td>
                        </tr>
                        <tr> 
                            <td class="texto" align="right">Pago Unico:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtPagoUnico" 
                            value="<%=request.getParameter("txtPagoUnico")!=null?request.getParameter("txtPagoUnico"):""%>" required> </td>
                            <div class="invalid-feedback">
                            Por favor, seleccione el Pago Unico.
                            </div>
                            </div>
                          </tr>
                        
                        <tr> 
                          <td class="texto" align="right">Branch:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <input class="form-control" maxlength="30" name="txtBranchSwiftR"
                          size="25"  style=" WIDTH: 300px"  
                          value="<%=request.getParameter("txtBranchSwiftR")!=null?request.getParameter("txtBranchSwiftR"):""%>" required/> 
                          <div class="invalid-feedback">
                            Por favor, seleccione el Branch.
                            </div>
                            </div>
                          </td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Moneda Extranjera:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <select class="form-select" name="cboMonedaSwiftR" required>
                              <option value="">Selecciona Moneda</option>
                              <% if(sMoneda!=null)
							for(l=0;l<sMoneda.length;l++)
									{
									if(!sMoneda[l].trim().equals("MONEDA NACIONAL"))
										{
									%>
                              <option value="<%=sMoneda[l]%>" <%=request.getParameter("cboMonedaSwiftR")!=null 		&&	request.getParameter("cboMonedaSwiftR").trim().equals(sMoneda[l].trim())?"selected":""%>><%=sMoneda[l]%></option>
                              <%	}
							  }%>
                            </select> 
                            <div class="invalid-feedback">
                            Por favor, seleccione la Moneda.
                            </div>
                            </div>
                            </td>
                        <tr> 
                          <td  align="right" style="font-family: Arial, Helvetica, sans-serif; color: #C60000; 
                          font-size: 11px; font-weight: bold;"  >Importe 
                            a transferir en Moneda Extranjera:</td>
                          <td class="texto">
                          <class="mb-3">
                          <input class="form-control" type="text"  name="txtImporteTSwiftR"
                          size="13" maxlength="20"  
                          value="<%=request.getParameter("txtImporteTSwiftR")!=null?request.getParameter("txtImporteTSwiftR"):""%>" required/> 
                          <div class="invalid-feedback">
                            Por favor, seleccione el Importe a transferir en Moneda Extranjera.
                            </div>
                            </div>
                          </td>
                        </tr>
                       
                        <tr> 
                          <td  class="texto" align="right">C&oacute;digo SWIFT 
                            ABA o IBAN:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <input class="form-control" maxlength=30 name="txtCodigoSwiftR"  
                          style=" WIDTH: 300px"  
                          value="<%=request.getParameter("txtCodigoSwiftR")!=null?request.getParameter("txtCodigoSwiftR"):""%>" required> 
                          <div class="invalid-feedback">
                            Por favor, seleccione el C&oacute;digo SWIFT ABA o IBAN.
                            </div>
                            </div>
                          </td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">&nbsp;</td>
                         
                          <td class="texto">&nbsp; <label class="mensaje">(ABA 
                            PARA AMERICA O IBAN PARA EUROPA)</label> </td>
                          
                        </tr>
                        <tr> 
                          <td class="texto" align="right"/>&nbsp;&nbsp;&nbsp;&nbsp; 
                          <td class="texto"> 
                          <input class="form-check-input" type="radio" name="rdCodigoSWIFT" id="rdCodigoSWIFTABA" value="ABA" <%=request.getParameter("rdCodigoSWIFT") != null && request.getParameter("rdCodigoSWIFT").equals("ABA")?"checked ":" "%> onClick="ABAR();"/>
                            &nbsp;ABA&nbsp;&nbsp; 
                            <input class="form-check-input" type="radio" name="rdCodigoSWIFT" id="rdCodigoSWIFTIBAN" value="IBAN" <%=request.getParameter("rdCodigoSWIFT") != null && request.getParameter("rdCodigoSWIFT").equals("IBAN")?"checked ":" "%> onClick="IBANR();"/>
                            &nbsp;IBAN&nbsp;&nbsp; 
                            <input class="form-control" type="hidden" name="txtCodigoSWIFT" value="<%=request.getParameter("txtCodigoSWIFT") != null?request.getParameter("txtCodigoSWIFT"):""%>"/> 
                          </td>
                        </tr>
                        
                        <tr> 
                          <td  class="textoNegrita" align="left" colspan="2">Datos 
                            Beneficiario:</td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Nombre:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <input class="form-control" maxlength=50 name="txtNombreBSwiftR"  style=" WIDTH: 200px" value="<%=request.getParameter("txtNombreBSwiftR")!=null?request.getParameter("txtNombreBSwiftR"):""%>" required> 
                          <div class="invalid-feedback">
                            Por favor, seleccione el Nombre.
                            </div>
                            </div>
                          </td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Pa&iacute;s:</td>
                          <td class="texto">
                          <class="mb-3">
                          <select class="form-select" name="cboPaisBSwiftR" required>
                              <option value="">Selecciona Pais</option>
                              <% if(sPais!=null)
							for(l=0;l<sPais.length;l++)
									{%>
                              <option value="<%=sPais[l]%>" <%=request.getParameter("cboPaisBSwiftR")!=null 		&&	request.getParameter("cboPaisBSwiftR").trim().equals(sPais[l].trim())?"selected":""%>><%=sPais[l]%></option>
                              <%}%>
                            </select> 
                            <div class="invalid-feedback">
                            Por favor, seleccione el Pais.
                            </div>
                            </div>
                            </td>
                        </tr>
                        <tr> 
                          <td  class="texto" align="right">Ciudad:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <input class="form-control" maxlength=50 
                          name="txtCiudadBSwiftR"  style=" WIDTH: 200px" 
                          value="<%=request.getParameter("txtCiudadBSwiftR")!=null?request.getParameter("txtCiudadBSwiftR"):""%>" required> 
                          <div class="invalid-feedback">
                            Por favor, seleccione la Ciudad.
                            </div>
                            </div>
                          
                          </td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Domicilio:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <input class="form-control" maxlength=100 name="txtDomicilioBSwiftR"  style=" WIDTH: 300px"  
                          value="<%=request.getParameter("txtDomicilioBSwiftR")!=null?request.getParameter("txtDomicilioBSwiftR"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione el Domicilio.
                            </div>
                            </div>                          
                          </td>
                        </tr>
                        <tr> 
                          <td class="texto" align="right">Tel&eacute;fono:</td>
                          <td class="texto"> 
                          <class="mb-3">
                          <input class="form-control" maxlength=15 name="txtTelefonoBSwiftR"
                          style=" WIDTH: 100px"  
                          value="<%=request.getParameter("txtTelefonoBSwiftR")!=null?request.getParameter("txtTelefonoBSwiftR"):""%>" required> 
                          <div class="invalid-feedback">
                            Por favor, seleccione el Tel&eacute;fono.
                            </div>
                            </div>
                          </td>
                        </tr>
                        <tr> 
                            <td class="texto" align="right">Referencia pago:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" 
                            name="txtSWreferenciapago8" 
                            value="<%=request.getParameter("txtSWreferenciapago8")!=null?request.getParameter("txtSWreferenciapago8"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione la Referencia pago.
                            </div>
                            </div>                            
                            </td>
                          </tr> 
                        <tr> 
                            <td class="texto" align="right">Referencia pago 2:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtSWreferenciapago82" 
                            value="<%=request.getParameter("txtSWreferenciapago82")!=null?request.getParameter("txtSWreferenciapago82"):""%>" required> 
                            <div class="invalid-feedback">
                            Por favor, seleccione la Referencia pago 2.
                            </div>
                            </div>        
                            </td>
                          </tr>
                            <tr> 
                            <td class="texto" align="right">Referencia pago 3:</td>
                            <td  class="textoNegrita"> 
                            <class="mb-3">
                            <input class="form-control" type="text" name="txtSWreferenciapago83" 
                            value="<%=request.getParameter("txtSWreferenciapago83")!=null?request.getParameter("txtSWreferenciapago83"):""%>" required> </td>
                            <div class="invalid-feedback">
                            Por favor, seleccione la Referencia pago 3.
                            </div>
                            </div>                             
                          </tr>
                        
                        
                        
                      </table>
                      <%}   
                    }//fin cboForma != null                        
                    %>
                    </td>
                    </tr>
                  <%
                        if(request.getParameter("pagosMIntercam")!=null && request.getParameter("pagosMIntercam").equals("S") && sCaptura.equals("NO"))
                          {
                          %>   
                          <tr><td>
                        <form name="RetiroMasivo" method="post" target="Oculto2" enctype="multipart/form-data" action="<%=request.getContextPath()%>/UploadFileDepositos" value="<%=request.getParameter("RetiroMasivo")!=null?request.getParameter("RetiroMasivo"):""%>">                           

                              <tr align="center" > 
                                <td align="right"  colspan="2">
                                <DIV align="center">
                                  <P class="texto">
                                     Selecciona archivo:<input class="form-control"  name="archivo" value="<%=request.getParameter("archivo")!=null?request.getParameter("archivo"):""%>" type="file"/>&nbsp;&nbsp;&nbsp;
                                    <input class="form-control" class="boton" value="Enviar" type="submit"/><br><br>
                                  </P>
                                </DIV>    
                                </td> 
                                

                                  <DIV align="center">
                                    <P>&nbsp;</P>
                                    <div style="visibility:hidden; position:absolute; right:0px">
                                  <iframe name="Oculto2"  height="1" width="1" frameborder="0" allowtransparency="yes" scrolling="no"></iframe>
                                  </div>
                                  </P></DIV>
                               
                              </tr>
                          </form>        
                          </td></tr>
                        <%     
                         }    
                        %>  
                    <tr> 
                    <td colspan="2" align="center"> 
                    <button type="submit" class="btn btn-primary">Aceptar</button>
                    <script language="JavaScript" SRC='scripts/instruccion2.js' defer/>

                    </td>
                    </tr>
                    </form>

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
                      <td align="middle" class="ref" >|<a class="ref">ASPECTOS 
                        LEGALES</a>|</td>
                    </tr>
                  </tbody>
                </table>
             </td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</body>
  <script language="JavaScript">
	 if( document.Retiro.cboContratoR.selectedIndex==0)    
   	  			  document.Retiro.cboContratoR.focus();   
	<%if(forma!=null && !forma.equals("21"))
				{%>		
         else if( document.Retiro.txtConceptoR.value=="")
           		document.Retiro.txtConceptoR.focus(); 
              
       else if( document.Retiro.txtImporteR.value=="")
           		document.Retiro.txtImporteR.focus(); 
     	   <%}%>
	  else if( document.Retiro.cboConceptoR.selectedIndex==0)   	    
		      document.Retiro.cboConceptoR.focus(); 
			  
	<%if(bComiteTecnico)
			{%>		  
	else if( document.Retiro.cboAcuerdosComiteTec.selectedIndex==0)    
      		document.Retiro.cboAcuerdosComiteTec.focus(); 			  
			<%}%>
<%if(request.getParameter("cboConceptoR")!=null && request.getParameter("cboConceptoR").trim().equals("Otro"))
						{%>
							
    else if( document.Retiro.txtConceptoR.value=="")    	    
		      document.Retiro.txtConceptoR.focus(); 
			 <%}%> 
    else if( document.Retiro.cboFormasL.selectedIndex==0)   
				document.Retiro.cboFormasL.focus(); 
<%

if(forma!=null && pagosM==null)
{
	forma=forma.trim();  
	if(forma.equals("24"))
		{
			%>
			if(document.Retiro.txtReferencia.value	=="")
   					document.Retiro.txtReferencia.focus();
			<%
                }			   

	//SWIFT
	if(forma.equals("21"))
		{%>
		else if(document.Retiro.cboPaisDSwiftR.selectedIndex==0)
					document.Retiro.cboPaisDSwiftR.focus();
		else if(document.Retiro.txtCiudadDSwiftR.value=="")
					document.Retiro.txtCiudadDSwiftR.focus();
		else if(document.Retiro.txtCiudadDSwiftR.value=="")
					document.Retiro.txtCiudadDSwiftR.focus();
		else if(document.Retiro.txtBancoDSwiftR.value=="")
					document.Retiro.txtBancoDSwiftR.focus();
		else if(document.Retiro.txtPlazaSwiftR.value=="")
					document.Retiro.txtPlazaSwiftR.focus();									
		else if(document.Retiro.txtSucursalSwiftR.value=="")
					document.Retiro.txtSucursalSwiftR.focus();				
      else if(document.Retiro.txtCuentaSwiftR.value=="")
					document.Retiro.txtCuentaSwiftR.focus();
      else if(document.Retiro.txtCuentaSwiftR.value=="")
					document.Retiro.txtCuentaSwiftR.focus();
      else if(document.Retiro.txtCuentaSwiftR.value=="")
					document.Retiro.txtCuentaSwiftR.focus();
      else if(document.Retiro.txtBranchSwiftR.value=="")
					document.Retiro.txtBranchSwiftR.focus();										
      else if(document.Retiro.cboMonedaSwiftR.selectedIndex==0)
					document.Retiro.cboMonedaSwiftR.focus();
     else if( document.Retiro.txtImporteTSwiftR.value=="")
          		document.Retiro.txtImporteTSwiftR.focus(); 
    else if(document.Retiro.txtCodigoSwiftR.value=="")
					document.Retiro.txtCodigoSwiftR.focus();
    else if(document.Retiro.txtNombreBSwiftR.value=="")
					document.Retiro.txtNombreBSwiftR.focus();
    else if(document.Retiro.txtCiudadBSwiftR.value=="")
					document.Retiro.txtCiudadBSwiftR.focus();
    else if(document.Retiro.txtDomicilioBSwiftR.value=="")
					document.Retiro.txtDomicilioBSwiftR.focus();
    else if(document.Retiro.txtTelefonoBSwiftR.value=="")
					document.Retiro.txtTelefonoBSwiftR.focus();
	<%}   
	}//fin cboForma != null
%>

</script>

</BODY></HTML>
<script>
ocultaCamposCombo();// funcion que oculta cambos de contratos
</script>