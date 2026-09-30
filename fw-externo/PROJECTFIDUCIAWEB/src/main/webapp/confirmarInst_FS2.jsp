<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.RetirosDB"/>
<%@ include file="sesionInstrucc.jsp" %> 
<%@ include file="parametrosToken.jsp" %>
<%
 String alerta="";
 boolean  bRetiro=true;  
 NumberFormat nftp;
 nftp = NumberFormat.getCurrencyInstance(Locale.US);
 bRetiro=false;  


/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
    <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/
	String sFolio=BD.getFolio(2);
 	String sFolioFS=BD.getFolioFOSEG();
 
	String sOperacion= "0";   
	String sBeneficiario = "";   
	String sLiq81[]=BD.getData(1,request.getParameter("cboFormaR"));
	String sPersona = "0";   
	String sTipoCont="0";
  String sNomBanco = "";
  int iNumBanco = 0;
  int iCveParam3 = 0;

  iCveParam3 = BD.obtenDatosEscritura(9,request.getParameter("cboFormaR"));
  iNumBanco = BD.obtenDatosEscritura(10,Integer.toString(iCveParam3));
  sNomBanco = BD.obtenNombreBanco(iNumBanco);
  
	sTipoCont=(String)session.getAttribute("TpoCont");
	int i;
	i= (int)Integer.parseInt(sTipoCont);
	
	String sEje="0";	
	sEje=request.getParameter("cboEje");
	sEje=sEje.substring(0,sEje.indexOf('-')).trim();
	
	String sPrograma[]=BD.getData(20,sEje);

 
%>
<%@ include file="mensajePKI.jsp" %>
<%
//RECIBE EL IMPORTE  REDONDEADO DESDE JAVASCRIPT
 sImporteT = NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteR")!=null&&!request.getParameter("txtImporteR").trim().equals("")?request.getParameter("txtImporteR"):"0.00").doubleValue(); 
 
if (sImporteT<0.01)
       	   {
	   alerta="El importe de tu operaci�n no es valido, por favor captura nuevamente el importe total";
	   bRetiro=false;  
	   }
	   
 
%>

<HTML>
<HEAD><TITLE>Confirmar de Retiro  - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
<script LANGUAJE="JavaScript">
function cancelar()
		{
		parent.location='FI_Instrucciones.jsp'
		}
function confirmar()
{
   <%
   if(request.getParameter("pagosM")!=null&&request.getParameter("pagosM").equals("S") && !((String)session.getAttribute("permiso")).equals("CLIENTE CAPTURA"))
   {
   %>
      if(document.Retiro.Pkcs7.value=="SI")
      {
         Sign();
      }
      else
      {
         alert("Deber hacer click en  Enviar Archivo de Pagos Multiples");
      }
   <%
   }
   else
   {
      if(!((String)session.getAttribute("permiso")).equals("CLIENTE CAPTURA"))
      {
   %>
         Sign();
   <%}
      else{%>
         document.Retiro.action="instruccionFS2.jsp";
         document.Retiro.submit();
   <%}
   }%>
}

<%
if(request.getParameter("pagosM")!=null&&request.getParameter("pagosM").equals("S"))
{
%>
   function pagosMultiples()	  
   {
      location.href="mailto:fiducia@bancomext.com?subject=Archivo%20de%20Pagos%20Multiples%20%20Fideicomiso:<%=session.getAttribute("Fideicomiso")%>&body=FOSEG:%20%20<%=session.getAttribute( "Fideicomiso" )%>%0D%0A%0D%0A<%=session.getAttribute( "NomUser" )%>:%0D%0A%0D%0AFavor%20de%20Adjuntar%20el%20Archivo%20de%20Pagos%20Multiples%20necesario%20para%20realizar%20la:%0D%0A%0D%0AINSTRUCCION%20DE%20RETIRO:%0D%0A%0D%0A%20%20Forma%20de%20Liquidaci�n:<%=request.getParameter("cboFormaR")%>%0D%0A%20%20Folio%20de%20Operaci�n:<%=sFolio%>";
      document.Retiro.Pkcs7.value="SI";
   }
<%
}
%>	  

function Sign()
{    
if(bName == "Microsoft Internet Explorer")
   {
      var ToSignText;
      var pkcs7_="";
      var estatus;
           ToSignText=<%=mensaje%>
      SeguriSIGN.Who=document.domain;
      pkcs7_=SeguriSIGN.Firma(ToSignText);
      if(SeguriSIGN.status == 2000)   
         {
         document.Retiro.Pkcs7.value=pkcs7_;
         document.Retiro.SignedText.value="NONE";
         if(SeguriSIGN.File!="")
            alert("El archivo seleccionado fue:"+SeguriSIGN.File);
         }
      else
         {
         if(SeguriSIGN.status != 0)
            alert("Error del proceso de la Firma:"+SeguriSIGN.status);
         else if(SeguriSIGN.status == 0)
            alert("Para poder realizar la Instrucci�n de Retiro\n Es necesaria su Firma Digital ");  
         }
   if(SeguriSIGN.status == 2000)
      {
      document.Retiro.action="instruccionFS2.jsp";
      document.Retiro.submit();
      }
   }
  else{ 
   	if (bName == "Netscape") 
   {
      var ToSignText;
      var pkcs7_="";
      ToSignText=<%=mensaje%>
      pkcs7_=crypto.signText(ToSignText,"ask");
      if(pkcs7_!="error:UserCancel" && pkcs7_!="error:internalError" && pkcs7_!="error:noMatchingCert")
         {
         document.Retiro.Pkcs7.value=pkcs7_;
         document.Retiro.SignedText.value=escape(ToSignText);
         document.Retiro.action="instruccionFS2.jsp";
         document.Retiro.submit();
         }
      else    {

         if(pkcs7_=="error:internalError")
            {
            alert("Verifique que la AC que emitio el certificado este instalada o habilitada");
            }
         else   {
            if(pkcs7_=="error:userCancel")
               alert("El proceso de firma fue cancelado por el usuario");
            else
               if(pkcs7_=="error:noMatchingCert")
                  alert("Es posible que la base de datos de certificados no este inicializada o este vacia");   
            }
              }
          }
      }    
}

function MM_swapImgRestore() { 
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { 
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}}
function MM_findObj(n, d) { 
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}
function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

//-->
</script></HEAD>
<body  class="bg-light"leftMargin="0"  topMargin="0" marginwidth="0" marginheight="0"> 
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD vAlign="top" background="imagenes/msur01.png"
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
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176">
        <%@ include file="menuInstrucciones.jsp" %>
      </TD>
      <TD valign="top" align="center"> 
	  <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
		
        <table width="593" border="0">
          <tr> 
            <td class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Confirmar 
              Retiro </td>
          </tr>
	    </table>
		<table width="593" border="0">
				 <tr> 
            			<td height="21" align="center" class="alerta"><%=alerta%> </td>
          		</tr>
		</table>
		  <%try
		  		 {%>
		  <table width="593" border="0">
		  		<%if(!BD.getImporteMaxRetiro((String)session.getAttribute("NumUser"),(String)request.getParameter("txtImporteR")))
				{	
				%>
                 <tr>
                   <td class="alerta" align="center">El importe solicitado es superior al Maximo Autorizado</td>
                 </tr>
				 <%}%>		  
                 <% if((saldoCF<sImporteF && sImporteF>0)  || ( saldoCE<sImporteE && sImporteE>0) || ( saldoCR<sImporteR && sImporteR>0) )
			        {
                  %>

            <tr> 
          <td class="alerta" align="center">EL SALDO DEL CONTRATO DE INVERSION  
			<%=(saldoCE<sImporteE  && sImporteE>0)?" ESTATAL ":" "%> 
            <%=((saldoCE<sImporteE && sImporteE>0) && (((saldoCF<sImporteF && sImporteF>0) && (saldoCR>=sImporteR && sImporteR>0)) || ((saldoCR<sImporteR && sImporteR>0)  && (saldoCF>=sImporteF && sImporteF>0))))?"  Y ":"" %> 
            <%=((saldoCE<sImporteE && sImporteE>0) && saldoCF<sImporteF && saldoCR<sImporteR)?", ":""%> 
            <%=(saldoCF<sImporteF && sImporteF>0)?" FEDERAL ":" "%> 
			<%=(((saldoCF<sImporteF && sImporteF>0) && (saldoCE<sImporteE && sImporteE>0) && (saldoCR<sImporteR && sImporteR>0))|| ((saldoCF<sImporteF && sImporteF>0) &&  (saldoCR<sImporteR && sImporteR>0)  && (saldoCE>=sImporteE && sImporteE>0)))?" Y ":""%> 
            <%= (saldoCR<sImporteR && sImporteR>0)?" RENDIMIENTOS ":""%> ES INSUFICIENTE
           <BR>NO SE PUEDE 
            REALIZAR EL RETIRO</td>
        </tr>
        <%}%>
         <% 
		 int numFiso=Integer.parseInt((String)session.getAttribute( "NumFid" ));
						 //Datos Acuerdo Comite T�cnico
		 String datosComiteTec=request.getParameter("cboAcuerdosComiteTec")!=null?request.getParameter("cboAcuerdosComiteTec"):"";
		 String fechaSesion=datosComiteTec.substring(0,10);
		 String tipoSesion=datosComiteTec.substring(11,13).equals("TO")?"O":"E";
		 String noAcuerdo=datosComiteTec.substring(14,datosComiteTec.length());
		 double saldoDisponibleAcuerdoCT=BD.getSaldoDisponibleAcuerdoCT(numFiso,fechaSesion,tipoSesion,noAcuerdo);
		 if(saldoDisponibleAcuerdoCT<sImporteT )
			        {
					
                  %>
        <tr> 
          <td class="alerta" align="center">EL SALDO DISPONIBLE DEL ACUERDO No. <%=noAcuerdo%>, ES INSUFICIENTE           </td> 
		</tr>
        <%}%>
          <tr> 
            <td  align="center" valign="top"><table width="100%"  border="0">
                <tr> 
                  <td  align="center"  valign="top" >
				    <form name="Retiro"  method="post" action="">
                      <input type="hidden" name="adjuntar" value="no">
                      <input type="hidden" name="Pkcs7">
                      <input type="hidden" name="SignedText">
                      <input type="hidden" name="txtFolio" value="<%=sFolio%>">
                      <input type="hidden" name="txtFolioFS" value="<%=sFolioFS%>">
                      <input type="hidden" name="cboEjercicio" value="<%=request.getParameter("cboEjercicio")%>">
                      <input type="hidden" name="txtImporte1" value="<%=sImporteE%>">
                      <input type="hidden" name="txtImporte2" value="<%=sImporteF%>">
                      <input type="hidden" name="txtImporte3" value="<%=sImporteR%>">
                      <input type="hidden" name="txtImporteR" value="<%=sImporteT%>">
                      <input type="hidden" name="cboAcuerdosComiteTec" value="<%=request.getParameter("cboAcuerdosComiteTec")%>">
					  <input type="hidden" name="txtFechaSesion" value="<%=fechaSesion%>">
					  <input type="hidden" name="txtTipoSesion" value="<%=tipoSesion%>">
					  <input type="hidden" name="txtNoAcuerdo" value="<%=noAcuerdo%>">
                      <input type="hidden" name="comprometido" value="<%=request.getParameter("comprometido")!=null?request.getParameter("comprometido"):"NO"%>">
                      <input type="hidden" name="cboEje" value="<%=request.getParameter("cboEje")%>">
                      <input type="hidden" name="cboPrograma" value="<%=request.getParameter("cboPrograma")%>">
                      <input type="hidden" name="cboProyecto" value="<%=request.getParameter("cboProyecto")%>">
                      <input type="hidden" name="cboAccion" value="<%=request.getParameter("cboAccion")%>">
                      <input type="hidden" name="txtMetaR" value="<%=request.getParameter("txtMetaR")%>">
                      <input type="hidden" name="txtNomBanco" value="<%=sNomBanco%>">
                      <%if(request.getParameter("pagosM")!=null)
				{%>
                      <input type="hidden" name="pagosM" value="<%=request.getParameter("pagosM")!=null?"S":"N"%>">
                      <%}%>
                      <input type="hidden" name="cboFormaR" value="<%=request.getParameter("cboFormaR")%>">
					  <input type="hidden" name="txtFormaLiq" value="<%=request.getParameter("txtFormaLiq")%>">
					  <input type="hidden" name="txtPrograma" value="<%=sPrograma[0]%>">
					  
					  
                  <%if(!(request.getParameter("cboFormaR")).equals("21") && request.getParameter("pagosM")==null) 					  
                    {%>
                      <input type="hidden" name="txtImporteR" value="<%=sImporteT%>">
                      <%}%>
                      <%
           if(request.getParameter("cboFormaR")!=null)
			   {%>
			  <input type="hidden" name="cboFormaR" value="<%=request.getParameter("cboFormaR")%>">
			  <%} 

		 if((request.getParameter("cboFormaR")).equals("22")&&request.getParameter("cboFormaR")!=null) {
					String sTipoPersona[][]= BD.getDataFormas(4,(String)session.getAttribute("NumFid"),Integer.toString(3));  
	                sOperacion = "3"+sTipoPersona[0][1]+((String)sLiq81[0]).trim()+sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					sBeneficiario = request.getParameter("txtBeneficiarioChequeR");
		}

		if((request.getParameter("cboFormaR")).equals("3")&&request.getParameter("cboFormaR")!=null) {
       	if(i==1) {									
					String sTipoPersona[][]= BD.getDataFormas(5,(String)session.getAttribute("NumFid"),(String)request.getParameter("cboNomPer"));  
					sOperacion = 3+sTipoPersona[0][1]+ ((String)sLiq81[0]).trim()+ sPrograma[0].trim()+"01"+"60";								
					sPersona = sTipoPersona[0][1];
					sBeneficiario = request.getParameter("cboNomPer");							
					}
				else {
					String sTipoPersona[][]= BD.getDataFormas(4,(String)session.getAttribute("NumFid"),request.getParameter("cboFormaR"));  
					sOperacion = "3"+sTipoPersona[0][1]+((String)sLiq81[0]).trim()+sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					sBeneficiario = request.getParameter("txtBeneficiarioChequeR");
					}
				}
         
                        { %>
                      <input type="hidden" name="txtBeneficiarioChequeR" value="<%=sBeneficiario%>">
                      <input type="hidden" name="cboBancoChequeR" value="<%=request.getParameter("cboBancoChequeR")%>">
                      <%} 
            if((request.getParameter("cboFormaR")).equals("SPEUA")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null)
                         {%>
                      <input type="hidden" name="txtPlazaSpeuaR" value="<%=request.getParameter("txtPlazaSpeuaR")%>">
                      <input type="hidden" name="cboCuentaSpeuaR" value="<%=request.getParameter("cboCuentaSpeuaR")%>">
                      <input type="hidden" name="txtTitularSpeuaR" value="<%=request.getParameter("txtTitularSpeuaR")%>">
                      <input type="hidden" name="txtCveBancoSpeuaR" value="<%=request.getParameter("txtCveBancoSpeuaR")%>">
                      <%} 

		 if((request.getParameter("cboFormaR")).equals("18")&&request.getParameter("cboFormaR")!=null ) {
             	if(i==1) {				
					String sTipoPersona[][]= BD.getDataFormas(7,(String)session.getAttribute("NumFid"),(String)request.getParameter("cboCuentaSiacR") + " AND CDP_CVE_BANCO=164 ");  
					sOperacion = "3"+sTipoPersona[0][1] + ((String)sLiq81[0]).trim() + sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					sBeneficiario = request.getParameter("txtInstitucionSiacR");							
					}
				else {
					String sTipoPersona[][]= BD.getDataFormas(4,(String)session.getAttribute("NumFid"),request.getParameter("cboFormaR"));  
					sOperacion = "3"+sTipoPersona[0][1]+((String)sLiq81[0]).trim()+sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					}
			}
                     {%>
                      <input type="hidden" name="cboCuentaSiacR" value="<%=request.getParameter("cboCuentaSiacR")%>">
                      <input type="hidden" name="txtInstitucionSiacR" value="<%=request.getParameter("txtInstitucionSiacR")%>">
                      <%} 


		 if((request.getParameter("cboFormaR")).equals("19") && request.getParameter("cboFormaR")!=null)		 

		 	{
             	if(i==1) {
					String sTipoPersona[][]= BD.getDataFormas(7,(String)session.getAttribute("NumFid"),(request.getParameter("cboCuentaTbcR")).substring((request.getParameter("cboCuentaTbcR")).indexOf('|')+2,(request.getParameter("cboCuentaTbcR")).length()) + " AND CDP_CVE_BANCO=12 ");  
					sOperacion = "3"+sTipoPersona[0][1]+ ((String)sLiq81[0]).trim()+ sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					sBeneficiario = request.getParameter("txtTitularTbcR");							
					}
				else {
					String sTipoPersona[][]= BD.getDataFormas(4,(String)session.getAttribute("NumFid"),request.getParameter("cboFormaR"));  
					sOperacion = "3"+sTipoPersona[0][1]+((String)sLiq81[0]).trim()+sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					sBeneficiario = request.getParameter("txtTitularTbcR");
					}
				
				if(request.getParameter("pagosM")==null)
					{%>
						  <input type="hidden" name="txtPlazaTbcR" value="<%=request.getParameter("txtPlazaTbcR")%>">
						  <input type="hidden" name="cboCuentaTbcR" value="<%=request.getParameter("cboCuentaTbcR")%>">
						  <input type="hidden" name="txtTitularTbcR" value="<%=request.getParameter("txtTitularTbcR")%>">
					<%} 
			} 
			

		// SE INCORPORA LA FORMA DE LIQUIDACION SPEI LA CUAL SUSTITUYE SPEUA Y FUNCIONA COMO TEF			        
		 if(((request.getParameter("cboFormaR")).equals("20")  || (request.getParameter("cboFormaR")).equals("23") || (request.getParameter("cboFormaR")).equals("19") || (request.getParameter("cboFormaR")).equals("27"))){
		 //----------------------------------------------------------------------------------------------------------------------
             	if(i==1) {
					String sCuentaTEF =  request.getParameter("txtCuentaPagoR").substring(request.getParameter("txtCuentaPagoR").indexOf('|')+2,request.getParameter("txtCuentaPagoR").length());
					String sTipoPersona[][]= BD.getDataFormas(7,(String)session.getAttribute("NumFid"), "'" + sCuentaTEF.substring(sCuentaTEF.indexOf('|')+2,sCuentaTEF.length()) + "'");  
					sOperacion = 3+sTipoPersona[0][1]+ ((String)sLiq81[0]).trim()+ sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					sBeneficiario = ""; 							
					}
				else {
					String sTipoPersona[][]= BD.getDataFormas(4,(String)session.getAttribute("NumFid"),request.getParameter("cboFormaR"));  
					sOperacion = "3"+sTipoPersona[0][1]+((String)sLiq81[0]).trim()+sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					sBeneficiario = request.getParameter("txtTitularTbcR");
					}
				}
			
		if(((request.getParameter("cboFormaR")).equals("24")  || (request.getParameter("cboFormaR")).equals("25") || (request.getParameter("cboFormaR")).equals("26")) && request.getParameter("pagosM")==null){
             	if(i==1){
					String sCuentaTEF =  request.getParameter("txtCuentaPagoR").substring(request.getParameter("txtCuentaPagoR").indexOf('|')+2,request.getParameter("txtCuentaPagoR").length());
					String sTipoPersona[][]= BD.getDataFormas(7,(String)session.getAttribute("NumFid"), "'" + sCuentaTEF.substring(sCuentaTEF.indexOf('|')+2,sCuentaTEF.length()) + "'");  
					sOperacion = "3"+nftp.format(Integer.parseInt(sTipoPersona[0][1]))+ ((String)sLiq81[0]).trim()+ sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					sBeneficiario = ""; 
					}
				else {
					String sTipoPersona[][]= BD.getDataFormas(4,(String)session.getAttribute("NumFid"),request.getParameter("cboFormaR"));  
					sOperacion = "3"+nftp.format(Integer.parseInt(sTipoPersona[0][1]))+((String)sLiq81[0]).trim()+sPrograma[0].trim()+"01"+"60";
					sPersona = sTipoPersona[0][1];
					sBeneficiario = request.getParameter("txtTitularTbcR")!=null?request.getParameter("txtTitularTbcR"):"";				
					}
				}

				  {%>
                      <input type="hidden" name="txtCveBancoPagoR" value="<%=request.getParameter("txtCveBancoPagoR")%>">
                      <input type="hidden" name="txtCuentaPagoR" value="<%=request.getParameter("txtCuentaPagoR")%>">
                      <input type="hidden" name="txtPlazaPagoR" value="<%=request.getParameter("txtPlazaPagoR")%>">
                      <input type="hidden" name="txtTitularPagoR" value="<%=request.getParameter("txtTitularPagoR")%>">
                      <input type="hidden" name="txtRfcPagoR" value="<%=request.getParameter("txtRfcPagoR")%>"> 
                      <input type="hidden" name="txtReferencia" value="<%=request.getParameter("txtReferencia")%>">
                    
                  <%}   
	  if((request.getParameter("cboFormaR")).equals("21")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null)
	  				  {
					if(i==1) {
            sOperacion = "-1";
						sPersona = "0"; 
						sBeneficiario = "0"; 					
						}
					else {
            sOperacion = "-1"; 
						sPersona = "0"; 
						sBeneficiario = "0";
					}
				}

	  
	  {%>
                      <input type="hidden" name="cboContratoR" value="<%=request.getParameter("cboContratoR")%>">
                      <input type="hidden" name="cboConceptoR" value="<%=request.getParameter("cboConceptoR")%>">
                      <input type="hidden" name="txtBancoDSwiftR" value="<%=request.getParameter("txtBancoDSwiftR")%>">
                      <input type="hidden" name="cboPaisDSwiftR" value="<%=request.getParameter("cboPaisDSwiftR")%>">
                      <input type="hidden" name="txtCiudadDSwiftR" value="<%=request.getParameter("txtCiudadDSwiftR")%>">
                      <input type="hidden" name="txtPlazaSwiftR" value="<%=request.getParameter("txtPlazaSwiftR")%>">
                      <input type="hidden" name="txtSucursalSwiftR" value="<%=request.getParameter("txtSucursalSwiftR")%>">
                      <input type="hidden" name="txtCuentaSwiftR" value="<%=request.getParameter("txtCuentaSwiftR")%>">
                      <input type="hidden" name="txtBranchSwiftR" value="<%=request.getParameter("txtBranchSwiftR")%>">
                      <input type="hidden" name="cboMonedaSwiftR" value="<%=request.getParameter("cboMonedaSwiftR")%>">
                      <input type="hidden" name="txtImporte1S" value="<%=sImporteE%>">
                      <input type="hidden" name="txtImporte2S" value="<%=sImporteF%>">
                      <input type="hidden" name="txtImporte3S" value="<%=sImporteR%>">
                      <input type="hidden" name="txtImporteRS" value="<%=sImporteT%>">
                      <input type="hidden" name="txtCodigoSwiftR" value="<%=request.getParameter("txtCodigoSwiftR")%>">
                      <input type="hidden" name="txtNombreBSwiftR" value="<%=request.getParameter("txtNombreBSwiftR")%>">
                      <input type="hidden" name="cboPaisBSwiftR" value="<%=request.getParameter("cboPaisBSwiftR")%>">
                      <input type="hidden" name="txtCiudadBSwiftR" value="<%=request.getParameter("txtCiudadBSwiftR")%>">
                      <input type="hidden" name="txtDomicilioBSwiftR" value="<%=request.getParameter("txtDomicilioBSwiftR")%>">
                      <input type="hidden" name="txtTelefonoBSwiftR" value="<%=request.getParameter("txtTelefonoBSwiftR")%>">    
                      <input type="hidden" name="txtCodigoSWIFT" value="<%=request.getParameter("txtCodigoSWIFT")%>">
                  

            <%}%>					  
					<input type="hidden" name="txtOperacion" value="<%=sOperacion%>">
					<input type="hidden" name="txtNumPersona" value="<%=sPersona%>">					  
					  
                      <table width="90%"  border="0" bordercolor="#FFFFFF">
                        <tr   > 
                          <td colspan="3" bgcolor="#999966"   class="celda01" align="center">DATOS 
                            GENERALES </td>
                        </tr>
                        <tr class="celda02"   > 
                          <td >En espera de Autorizaci�n: </td>
                          <td colspan="2"  ><%=sCaptura.equals("SI") || BD.firmasMancomunadas((String)session.getAttribute("NumFid"))?"SI":"NO"%></td>
                        </tr>
                        <tr class="celda02"  > 
                          <td width="31%" > Ejercicio:</td>
                          <td colspan="2" > <%=request.getParameter("cboEjercicio")!=null?request.getParameter("cboEjercicio"):""%>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  colspan="3"  class="celda01" >Registro Presupuestal:</td>
                        </tr>
                        <tr class="celda02"> 
                          <td  align="right">Eje:</td>
                          <td colspan="2"   > 
                            <%  if(request.getParameter("cboEje")!=null)
                                out.print(request.getParameter("cboEje"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td align="right">Programa:</td>
                          <td colspan="2"   > 
                            <%  if(request.getParameter("cboPrograma")!=null)
                                out.print(request.getParameter("cboPrograma"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02" > 
                          <td align="right"> Proyecto: </td>
                          <td colspan="2"   > 
                            <%  if(request.getParameter("cboProyecto")!=null)
                                out.print(request.getParameter("cboProyecto"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  align="right">Accion:</td>
                          <td colspan="2"   > 
                            <%  if(request.getParameter("cboAccion")!=null)
                                out.print(request.getParameter("cboAccion"));
                  %>                          </td>
                        </tr>
                        <%if(!(request.getParameter("cboFormaR")).equals("21")) 
           		 {%>
                        <tr class="celda02"> 
                          <td  >Comprometido:</td>
                          <td colspan="2"   ><%=request.getParameter("comprometido")!=null?request.getParameter("comprometido"):"NO"%></td>
                        </tr>
                        <tr  class="celda02"> 
                          <td class="celda01">Origen de los Recursos:</td>
                          <td width="41%" class="celda01" >Importe: </td>
                          <td width="28%" ><span class="celda01">Presupuesto</span>:</td>
                        </tr>
                        <tr class="celda02" > 
                          <td height="23" align="right">Estatal: </td>
                          <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteE)%><%=(saldoCE<sImporteE)?"<br><font class=\"texto2\" >[Saldo disponible del Contrato de Inversi�n: <b>"+NumberFormat.getCurrencyInstance(Locale.US).format(saldoCE)+"</b>]</font>":""%></td>
                          <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(SaldoE)%></td>
                        </tr>
                        <tr class="celda02"> 
                          <td align="right">Federal:</td>
                          <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteF)%><%=(saldoCF<sImporteF)?"<br><font class=\"texto2\" >[Saldo disponible del Contrato de Inversi�n: <b>"+NumberFormat.getCurrencyInstance(Locale.US).format(saldoCF)+"</b>]</font>":""%></td>
                          <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(SaldoF)%></td>
                        </tr>
                        <tr class="celda02" > 
                          <td align="right" > Rendimientos: </td>
                          <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteR)%><%=(saldoCR<sImporteR)?"<br><font class=\"texto2\" >[Saldo disponible del Contrato de Inversi�n:<b> "+NumberFormat.getCurrencyInstance(Locale.US).format(saldoCR)+"</b>]</font>":""%></td>
                          <td ><%=NumberFormat.getCurrencyInstance(Locale.US).format(SaldoR)%></td>
                        </tr>
                        <tr class="celda02"> 
                          <td align="right" class="celda01">Importe Total del 
                            Retiro:</td>
                          <td colspan="2" ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteT)%></td>
                        </tr>
                        <%}%>
                        <tr class="celda02" > 
 	
                          <td>Acuerdo del Comite T&eacute;cnico: </td>
                          <td colspan="2" > <%=request.getParameter("cboAcuerdosComiteTec")%>                          </td>
                        </tr>
                        <tr class="celda02" > 
                          <td>Concepto:</td>
                          <td colspan="2" > 
                            <%  if(request.getParameter("txtMetaR")!=null)
                                out.print(request.getParameter("txtMetaR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02" > 
                          <td > Pagos Multiples: </td>
                          <td colspan="2" > <%=request.getParameter("pagosM")!=null?"SI":"N0"%> 
                            &nbsp; </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Forma de Liquidaci&oacute;n:</td>
                          <td colspan="2" > 
                            <%if(request.getParameter("txtFormaLiq")!=null)
                                       out.print(request.getParameter("txtFormaLiq"));%>                          </td>
                        </tr>
                        <tr > 
                          <td colspan="3" class="textoNegrita">&nbsp;</td>
                        </tr>
                        <tr bgcolor="#999966"> 
                          <td  colspan="3" align="center"   class="celda01"><b>DETALLE 
                            LIQUIDACI&Oacute;N </b></td>
                        </tr>
                        <%
        
		 if((request.getParameter("cboFormaR")).equals("3")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
                  {%>
                        <tr class="celda02"> 
                          <td >Nombre del Beneficiario:</td>
                          <td colspan="2"  > 
                        <% 	if(i==1)                        
							 out.print(request.getParameter("cboNomPer"));					
						else					
							out.print(request.getParameter("txtBeneficiarioChequeR"));						
							%>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Cheque a Cargo de:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("cboBancoChequeR")!=null)
                        out.print(request.getParameter("cboBancoChequeR"));%>                          </td>
                        </tr>
                        <%
                  }
          if((request.getParameter("cboFormaR")).equals("SPEUA")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
                  { 
            %>
                        <tr class="celda02"> 
                          <td >Plaza:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtPlazaSpeuaR")!=null)
                                 out.print(request.getParameter("txtPlazaSpeuaR"));%>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td >N&uacute;mero de Cuenta:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("cboCuentaSpeuaR")!=null)
                                 out.print(request.getParameter("cboCuentaSpeuaR").substring(request.getParameter("cboCuentaSpeuaR").indexOf('|')+2,request.getParameter("cboCuentaSpeuaR").length()) );
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Titular de la Cuenta:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtTitularSpeuaR")!=null)
                                 out.print(request.getParameter("txtTitularSpeuaR"));
                  %>                          </td>
                        </tr>
                        <% }
         
		 if((request.getParameter("cboFormaR")).equals("18")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
                  {%>
                        <tr class="celda02"> 
                          <td  > N&uacute;mero de Cuenta Banxico:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("cboCuentaSiacR")!=null)
                                 out.print(request.getParameter("cboCuentaSiacR"));%>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td >Instituci&oacute;n o Entidad Beneficiaria:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtInstitucionSiacR")!=null)
                              out.print(request.getParameter("txtInstitucionSiacR"));%>                          </td>
                        </tr>
                        <%
                  }
   
   if((request.getParameter("cboFormaR")).equals("19")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) {
				  %>
                        <tr class="celda02"> 
                          <td  >Plaza:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtPlazaTbcR")!=null)
                                 out.print(request.getParameter("txtPlazaTbcR"));%>                          </td>
                        </tr>
						  <tr class="celda02"> 
							  <td >Sucursal:</td>
							  <td  colspan="2"> 
								<% if(request.getParameter("txtSucursalSwiftR")!=null)
													 out.print(request.getParameter("txtSucursalSwiftR"));
											%>							  </td>
						</tr>
                        <tr class="celda02"> 
                          <td  >N&uacute;mero de Cuenta:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("cboCuentaTbcR")!=null)
                                  out.print(request.getParameter("cboCuentaTbcR").substring((request.getParameter("cboCuentaTbcR")).indexOf('|')+2,(request.getParameter("cboCuentaTbcR")).length()) );
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Titular </td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtTitularTbcR")!=null)
                                 out.print(request.getParameter("txtTitularTbcR"));
                  %>                          </td>
                        </tr>
                        <% }
							 
		 if(((request.getParameter("cboFormaR")).equals("20") || (request.getParameter("cboFormaR")).equals("23"))&& request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
                  {%>
                        <tr class="celda02"> 
                          <td  >N&uacute;mero de Cuenta:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtCuentaPagoR")!=null)
                                  out.print(request.getParameter("txtCuentaPagoR").substring(request.getParameter("txtCuentaPagoR").indexOf('|')+2,request.getParameter("txtCuentaPagoR").length()));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Plaza:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtPlazaPagoR")!=null)
                                 out.print(request.getParameter("txtPlazaPagoR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Titular de la Cuenta:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtTitularPagoR")!=null)
                                 out.print(request.getParameter("txtTitularPagoR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >RFC:</td>
                          <td colspan="2"  > 
                            <% if(request.getParameter("txtRfcPagoR")!=null)
                                 out.print(request.getParameter("txtRfcPagoR"));
                  %>                          </td>
                        </tr>
                        <% }

 	if(((request.getParameter("cboFormaR")).equals("24") || (request.getParameter("cboFormaR")).equals("25") || (request.getParameter("cboFormaR")).equals("26"))&& request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
                  {%>
                        <tr class="celda02"> 
                          <td  >N&uacute;mero de <%=request.getParameter("cboFormaR")!=null && request.getParameter("cboFormaR").trim().equals("26")?"Cuenta:":"Convenio:"%></td>
                          <td colspan="2" >
                            <% if(request.getParameter("txtCuentaPagoR")!=null)
                                  out.print(request.getParameter("txtCuentaPagoR").substring(request.getParameter("txtCuentaPagoR").indexOf('|')+2,request.getParameter("txtCuentaPagoR").length()));
                  %>                          </td>
                        </tr>
						<%
						if(request.getParameter("cboFormaR")!=null && request.getParameter("cboFormaR").trim().equals("24"))
						{
						%>
							<tr class="celda02"> 
								<td>Referencia:</td>
								<td colspan="2">
									<%if(request.getParameter("txtReferencia")!=null)
										out.print(request.getParameter("txtReferencia"));%>                
								</td>
							</tr>
						<%
						}
						%>
                        <tr class="celda02"> 
                          <td><%=request.getParameter("cboFormaR")!=null && request.getParameter("cboFormaR").trim().equals("26")?"�rea Titular:":"Titular de la Cuenta:"%></td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtTitularPagoR")!=null)
                                 out.print(request.getParameter("txtTitularPagoR"));
                  %>                          </td>
                        </tr>
                        
                        <%
		                if(request.getParameter("cboFormaR")!=null && !request.getParameter("cboFormaR").trim().equals("26"))
		                {
		                %>
		                <tr class="celda02"> 
		                	<td>RFC:</td>
		                    <td colspan="2">
		                    	<%if(request.getParameter("txtRfcPagoR")!=null)
		                    		out.print(request.getParameter("txtRfcPagoR"));%>                
		                    </td>
		                </tr>
		                <%
		                }
                  %>
	<% }
 
      if((request.getParameter("cboFormaR")).equals("21")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
                  {%>
                        <tr class="celda02"> 
                          <td  colspan="3" class="celda01" >Datos del Banco Domiciliario:</td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Pa&iacute;s:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("cboPaisDSwiftR")!=null)
                                 out.print(request.getParameter("cboPaisDSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Ciudad:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtCiudadDSwiftR")!=null)
                              out.print(request.getParameter("txtCiudadDSwiftR"));
                        %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Nombre del Banco:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtBancoDSwiftR")!=null)
                                             out.print(request.getParameter("txtBancoDSwiftR"));%>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td >Plaza:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtPlazaSwiftR")!=null)
                                  out.print(request.getParameter("txtPlazaSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Sucursal:</td>
                          <td colspan="2"  > 
                            <% if(request.getParameter("txtSucursalSwiftR")!=null)
                                 out.print(request.getParameter("txtSucursalSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td >N&uacute;mero de Cuenta:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtCuentaSwiftR")!=null)
                                 out.print(request.getParameter("txtCuentaSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Branch:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtBranchSwiftR")!=null)
                                 out.print(request.getParameter("txtBranchSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td >Moneda:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("cboMonedaSwiftR")!=null)
                                   out.print(request.getParameter("cboMonedaSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td >Comprometido:</td>
                          <td colspan="2"  ><%=request.getParameter("comprometido")!=null?request.getParameter("comprometido"):"NO"%></td>
                        </tr>
                        <tr class="celda02"> 
                          <td class="celda01" >Origen:</td>
                          <td colspan="2" class="celda01"  >Importes a transferir 
                            en Moneda Extranjera:</td>
                        </tr>
                        <tr class="celda02" > 
                          <td align="right" >Estatal: </td>
                          <td colspan="2"  ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteE)%><%=(SaldoE<sImporteE  && sImporteE>0)?"<font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible: "+NumberFormat.getCurrencyInstance(Locale.US).format(SaldoE)+"]</font>":""%><%=(saldoCE<sImporteE)?"<br><font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible del Contrato de Inversi�n: "+NumberFormat.getCurrencyInstance(Locale.US).format(saldoCE)+"]</font>":""%></td>
                        </tr>
                        <tr class="celda02"> 
                          <td align="right" >Federal:</td>
                          <td colspan="2"  ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteF)%><%=(SaldoF<sImporteF  && sImporteF>0)?"<font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible: "+NumberFormat.getCurrencyInstance(Locale.US).format(SaldoF)+"]</font>":""%><%=(saldoCF<sImporteF)?"<br><font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible del Contrato de Inversi�n: "+NumberFormat.getCurrencyInstance(Locale.US).format(saldoCF)+"]</font>":""%></td>
                        </tr>
                        <tr class="celda02" > 
                          <td align="right"  > Rendimientos: </td>
                          <td colspan="2"  ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteR)%><%=(SaldoR<sImporteR  && sImporteR>0)?"<font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible: "+NumberFormat.getCurrencyInstance(Locale.US).format(SaldoR)+"]</font>":""%><%=(saldoCR<sImporteR)?"<br><font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible del Contrato de Inversi�n: "+NumberFormat.getCurrencyInstance(Locale.US).format(saldoCR)+"]</font>":""%></td>
                        </tr>
                        <tr class="celda02"> 
                          <td align="right" class="celda01" >Importe Total a Tranferir 
                            en Moneda Extranjera:</td>
                          <td colspan="2"  ><%=NumberFormat.getCurrencyInstance(Locale.US).format(sImporteT)%></td>
                        </tr>
                       
                        <tr class="celda02"> 
                          <td >C�digo SWIFT ABA o IBAN :</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtCodigoSwiftR")!=null)
                                 out.print(request.getParameter("txtCodigoSwiftR") + " ");
                               if(request.getParameter("txtCodigoSWIFT")!=null)
                                 out.print(request.getParameter("txtCodigoSWIFT"));
                            %>
                          </td>
                        </tr>
                        
                        <tr class="celda02"> 
                          <td  colspan="3"   class="celda01" >Datos del Beneficiario:</td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Nombre:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtNombreBSwiftR")!=null)
                                 out.print(request.getParameter("txtNombreBSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td >Pa&iacute;s:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("cboPaisBSwiftR")!=null)
                                   out.print(request.getParameter("cboPaisBSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Ciudad:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtCiudadBSwiftR")!=null)
                                 out.print(request.getParameter("txtCiudadBSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td  >Domicilio:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtDomicilioBSwiftR")!=null)
                                 out.print(request.getParameter("txtDomicilioBSwiftR"));
                  %>                          </td>
                        </tr>
                        <tr class="celda02"> 
                          <td >Tel&eacute;fono:</td>
                          <td colspan="2" > 
                            <% if(request.getParameter("txtTelefonoBSwiftR")!=null)
                                 out.print(request.getParameter("txtTelefonoBSwiftR"));
                  %>                          </td>
                        </tr>
                        <% } %>
                        <%if(request.getParameter("pagosM")!=null&&request.getParameter("pagosM").equals("S") && !((String)session.getAttribute("permiso")).equals("CLIENTE CAPTURA"))
				{%>
                        <tr class="celda02"> 
                          <td align="center"  colspan="3">&nbsp;</td>
                        </tr>
                        <tr class="celda02">
                          <td align="center" class="celda01"  colspan="3">Para 
                            Enviar Archivo de Pagos Multiples, &nbsp;&nbsp;<a href="javascript:pagosMultiples();"><u>click 
                            Aqu�</u></a> </td>
                        </tr>
                        <tr class="celda02"> 
                          <td align="center" class="subtitulo"  colspan="3">&nbsp;</td>
                        </tr>
                        <%}%>
                      </table>
                    </form> </td>
                </tr>



   <%if(( saldoCF<sImporteF && sImporteF>0)  || (saldoCE<sImporteE && sImporteE>0) || ( saldoCR<sImporteR && sImporteR>0) ||  saldoDisponibleAcuerdoCT<sImporteT ||
   !BD.getImporteMaxRetiro((String)session.getAttribute("NumUser"),(String)request.getParameter("txtImporteR")))
			        {
                  %>
				 <tr> 
                  <td align="center">&nbsp;</td>
                </tr>
				 <tr> 
                  <td align="center">&nbsp;</td>
                </tr>
				  <tr> 
		          <td align="center"><input type="button" name="Modificar" value="Modificar" onClick="javascript:history.back()" class="boton">
		            &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton">                  </td>
		 </tr>
                  <%}
               else{%>

				                <tr> 
                  <td align="center">&nbsp;</td>
                </tr>
			        <tr><td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.back()"><u>Modificar Instrucci&oacute;n</u></a></td></tr>

			        <tr> 
			          <td >&nbsp;</td>
			        </tr>

		  <tr> 
		          <td align="center"> <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:confirmar()" class="boton" <%=!bRetiro?"disabled":""%>>
                    &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton">                  </td>
		 </tr>


                  <%}%>
                       </table></td>
          </tr>
        </table>

		<%
}
catch(Exception e)
{
         %>
		 <table align="center" width="90%" class="alerta">
		 <tr>
		    <td  class="alerta"> <p>&nbsp;</p>
              <p>TU OPERACION NO PUEDE SER PROCESADA, AUN NO HA SIDO PARAMETRIZADA 
                EN EL SISTEMA. </p>
              <p>FAVOR DE INFORMAR A TU EJECUTIVO DE CUENTA.</p>
              <p>TELEFONO: 53 25 60 00<br>
              </p></td>
          </tr>
        </table>
	<%

}
%>
		
	  </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
