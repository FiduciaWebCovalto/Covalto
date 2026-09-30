<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="firmas"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<%@ include file="sesionInst1.jsp" %>
<%@ include file="parametrosToken.jsp" %>
<%
/****************************AUTENTICACION CON TOKEN******************************/
if(((String)session.getAttribute("token")).equals("1"))
    {%>
       <%@ include file="autenticaToken.jsp" %>
    <%
     }
/*********************************************************************************/
String alerta="";
String mensaje="";
String usuario=(String)session.getAttribute( "NomUser" );
String instruccion="";
String fechaCaptura="";
String usuarioCaptura="";
String fechaFirma1="";
String usuarioFirma1="";
String usuarioFirma2="";
String stFirma1="";
boolean bSaldo=true;
boolean bAutorizo=false;
int folio=Integer.parseInt(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0");
int fiso=Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0");


if(BD.firmasMancomunadas((String)session.getAttribute("NumFid")))
	{
	firmas.setVtrIntDato1(folio);
    firmas.setVtrIntDato2(fiso);
	firmas.querySelect(2);
	if(firmas.hasData()) 
		{
		usuarioCaptura=firmas.getVtrStrDato1();
		fechaCaptura=firmas.getVtrStrDato2();
		usuarioFirma1=firmas.getVtrStrDato3();
		usuarioFirma2=firmas.getVtrStrDato6();
		fechaFirma1=firmas.getVtrStrDato4();
		stFirma1=firmas.getVtrStrDato5();
		}
	if(usuarioFirma1.trim().equals( ((String)session.getAttribute( "NomUser" )).trim() ))
		{
		bAutorizo=true;
		alerta="Ya autorizaste esta Instrucci�n";
		}
	}
else
	{ 
	firmas.removerValores();
	firmas.setVtrIntDato1(folio);
    firmas.setVtrIntDato2(fiso);
	firmas.querySelect(1);
	if(firmas.hasData()) usuarioCaptura=firmas.getVtrStrDato1();
	}	
String sFiso=(String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0";
String detalle=BD.getMovsDetFOSEG(request.getParameter("txtFolio"),sFiso,1);
%>
<HTML>
<HEAD><TITLE>Confirmar - Instruciones Pendientes </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
<script language="JavaScript" type="text/JavaScript">

function MM_swapImgRestore() {
   var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() {
   var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
   var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
   if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { 
   var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) 
   {
      d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);
   }
   if(!(x=d[n])&&d.all)
      x=d.all[n]; 
   for (i=0;!x&&i<d.forms.length;i++) 
      x=d.forms[i][n];
   for(i=0;!x&&d.layers&&i<d.layers.length;i++)
      x=MM_findObj(n,d.layers[i].document);
   if(!x && d.getElementById) 
      x=d.getElementById(n);
   return x;
}

function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; 
   document.MM_sr=new Array; 
   for(i=0;i<(a.length-2);i+=3)
      if ((x=MM_findObj(a[i]))!=null)
      {
         document.MM_sr[j++]=x; 
         if(!x.oSrc)
            x.oSrc=x.src;
         x.src=a[i+2];
      }
}


function atras() {
						   document.forms[0].action="FI_InstruccionFS9.jsp";
						   document.forms[0].submit();
						}
						
function Aceptar()
{
   document.InstPend.txtAccionSt.value="ACTIVO";

   if(document.InstPend.txtTipo.value=="Retiro")
   {
      if(document.InstPend.txtPM.value=="SI")
      {
         if(document.InstPend.Pkcs7.value=="SI")
         {  
            Sign();
         }
         else
         {
            alert("Deber hacer click en  Enviar Archivo de Pagos Multiples");
         }
      }
      else
      {
         Sign();
      }
   }
   else
   { 
      Sign();
   }
}


function Cancelar()
{
   document.InstPend.txtAccionSt.value="CANCELADO";
   Sign();
}


function pagosMultiples()	  
{
   location.href="mailto:fiducia@bancomext.com?subject=Archivo%20de%20Pagos%20Multiples%20%20Fideicomiso:<%=session.getAttribute("Fideicomiso")%>&body=FOSEG:%20%20<%=session.getAttribute( "Fideicomiso" )%>%0D%0A%0D%0A<%=session.getAttribute( "NomUser" )%>:%0D%0A%0D%0AFavor%20de%20Adjuntar%20el%20Archivo%20de%20Pagos%20Multiples%20necesario%20para%20realizar%20la:%0D%0A%0D%0AINSTRUCCION%20DE%20RETIRO:%0D%0A%0D%0A%20%20Forma%20de%20Liquidaci�n:" + document.InstPend.txtFormaLiq.value + "%0D%0A%20%20Folio%20de%20Operaci�n:<%=request.getParameter("txtFolio")%>";
   document.InstPend.Pkcs7.value="SI";
}


	function Sign()
	{


if(bName == "Microsoft Internet Explorer")
	{	
	
		var ToSignText;
		var pkcs7_="";
		var estatus;
		ToSignText="<%=BD.sMensaje%>";
		
		SeguriSIGN.Who=document.domain;
		pkcs7_=SeguriSIGN.Firma(ToSignText);
		if(SeguriSIGN.status == 2000)	
			{
			document.InstPend.Pkcs7.value=pkcs7_;
			document.InstPend.SignedText.value="NONE";
			if(SeguriSIGN.File!="")
				alert("El archivo seleccionado fue:"+SeguriSIGN.File);
			}
		else
			{
			if(SeguriSIGN.status != 0)
				alert("Error del proceso de la Firma:"+SeguriSIGN.status);
			
			else if(SeguriSIGN.status == 0)
				alert("Para poder realizar la Instrucci�n de Deposito\n Es necesaria su Firma Digital ");
			}


			
		if(SeguriSIGN.status == 2000)
			{

			document.InstPend.action="instruccionFS9.jsp";
			document.InstPend.submit();	
			}

 	}
  else{ 
		if (bName == "Netscape") 
			{
		var ToSignText;
		var pkcs7_="";
		ToSignText="<%=BD.sMensaje%>";
		pkcs7_=crypto.signText(ToSignText,"ask");
		if(pkcs7_!="error:UserCancel" && pkcs7_!="error:internalError" && pkcs7_!="error:noMatchingCert")
			{
			document.InstPend.Pkcs7.value=pkcs7_;
			document.InstPend.SignedText.value=escape(ToSignText);
			document.InstPend.action="instruccionFS9.jsp";
			document.InstPend.submit();	
			}
		else    {

			if(pkcs7_=="error:internalError")
				{
				alert("Verifique que la AC que emitio el certificado este instalada o habilitada");
				}
			else	{
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



</script>
</HEAD>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD width="201" vAlign="top" background="imagenes/msur01.png"
          >&nbsp;</TD>
      <TD background="imagenes/msur05.gif" vAlign="top" width="625"> <DIV align="right"><FONT color="#FFFFFF"
            size=-7 
            face="Arial, Helvetica, sans-serif"> 01 800 623 4672 &nbsp;&nbsp;</FONT>&nbsp;&nbsp;<A 
            href="mailto:info@bancomext.com"><FONT color="#FFFFFF"size=-7 
            face="Arial, Helvetica, sans-serif">info@bancomext.com&nbsp;&nbsp;&nbsp;</FONT></A> 
        </DIV></TD>
    </TR>
    <TR > 
      <TD colspan="3" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=BD.fecha()%></TD>
      <TD colspan="2" background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image10" width="104" height="17" border="0"></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones2.gif" name="Instrucciones"  border="0"></a><a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes1','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes1"  border="0" id="Reportes1"></a><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones1','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones1"  border="0" id="Opciones1"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir1','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir1"  border="0" id="Salir1"></a></TD>
    </TR>
    <TR > 
      <TD colspan="3" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176"> 
        <%@ include file="menuInstrucciones.jsp" %>
      </TD>
      <TD colspan="2" valign="top" align="center">
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
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000"> 
              <table width="100%" border="0"  class="titulo">
                <tr>
                    <td width="93%" align="right">Confirmaci&oacute;n o Cancelaci&oacute;n de Instrucciones 
                    Pendientes </td>
					<td width="7%">&nbsp;</td>
                </tr>
              </table>
            </td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
		  <tr>
            <td class="alerta" align="center">&nbsp;<%=alerta%></td>
          </tr>
          <tr> 
            <td  align="center" valign="top">
			<table width="85%" border="0">
                <tr> 
                  <td align="center">
				  <form name="InstPend"  method="post" action="">
                     <input type="hidden" name="Pkcs7">
                     <input type="hidden" name="SignedText">
                     <input type="hidden" name="txtFolio" value="<%=request.getParameter("txtFolio")%>">
                     <input type="hidden" name="txtAccionSt">
                      <%=request.getParameter("txtFolio")!=null?detalle:""%>
                    </form></td>
                </tr>
              </table> </td>
          </tr>
          <tr> 
            <td  align="center" valign="top">
              <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:Aceptar()"  class="boton"  <%=( !BD.esDeposito(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0") &&  (tipoUsuario.equals("CLIENTE DEPOSITO") ||  tipoUsuario.equals("CLIENTE CONSULTA Y DEPOSITO") ) )  ||  BD.sMensaje.trim().equals("ERRORFS") || sCaptura.equals("SI") || bAutorizo || !bSaldo?"disabled":""%>> 
              &nbsp;
              <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:Cancelar()"  class="boton" <%=( !BD.esDeposito(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0") && (tipoUsuario.equals("CLIENTE DEPOSITO") ||  tipoUsuario.equals("CLIENTE CONSULTA Y DEPOSITO") ) )  || BD.sMensaje.trim().equals("ERRORFS") ||  sCaptura.equals("SI") || bAutorizo || !bSaldo?"disabled":""%> > 
            </td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=3 height=1> </TR>
  </TBODY>
</TABLE>

</BODY></HTML>
