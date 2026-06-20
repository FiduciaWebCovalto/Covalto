<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="bancos"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="det"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="UsuarioCap"  class="com.bancomext.negocio.nConsultas"/>
<%@ include file="sesionOpc2.jsp" %>
<%@ include file="parametrosToken.jsp" %>
<HTML>
<HEAD><TITLE>Cuentas  Pendientes </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
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
String usuario=(String)session.getAttribute( "username" );
String fechaCaptura="";
String usuarioCaptura="";
String Plaza="";
String RFC="";
String Sucursal="";
String Titular="";
String NumCuenta="";
String Banco="";
String CveCuenDep="";
int cveBanco=0;
String stFirma1="";
boolean bSaldo=true;
boolean bAutorizo=false;
int folio=Integer.parseInt(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0");
int fiso=Integer.parseInt((String)session.getAttribute("NumFid")!=null?(String)session.getAttribute("NumFid"):"0");
//se obtiene usuario de captura
UsuarioCap.setVtrIntDato1(folio);
UsuarioCap.querySelect(45);
usuarioCaptura=UsuarioCap.getVtrStrDato1();
System.out.println("Usuario captura  :"+usuarioCaptura);
//se recupera detalle de la cuenta
det.setVtrIntDato1(folio);
det.setVtrIntDato2(fiso);
System.out.println("folio:"+folio);
det.querySelect(41);
fechaCaptura=det.getVtrStrDato6();	
Plaza=det.getVtrStrDato2();
RFC=det.getVtrStrDato5();
Sucursal=det.getVtrStrDato3();
Titular=det.getVtrStrDato4();
NumCuenta=det.getVtrStrDato1();
CveCuenDep=det.getVtrStrDato7();
cveBanco=det.getVtrIntDato2();
if (cveBanco > 0 )
{
bancos.setVtrIntDato1(cveBanco);
bancos.querySelect(42);
Banco=bancos.getVtrStrDato1().equals("")?"DESCONOCIDO":bancos.getVtrStrDato1();
}
//************************************************************* MODIFICADO POR CUBO OCT-07******************************************************************
mensaje	=	"CUENTA CLABE\\n"
//****************************************************************************************************************************************************
                        +"\\nCuenta: "+det.getVtrStrDato1()
                        + "\\nFideicomiso: "+fiso
						+ "\\nBanco en el que radica la Cuenta: "+cveBanco+" - " +(Banco==null?"":Banco)
                        + "\\nRFC: "+det.getVtrStrDato5()
                        + "\\nTITULAR: "+det.getVtrStrDato4()
                        + "\\nCLAVE BANCO: "+det.getVtrIntDato2()
                        + "\\nFECHA CAPTURA: "+det.getVtrStrDato6();
%>
<%										
if(((String)session.getAttribute("token")).equals("1"))
    {%>
 <%@ include file="objetosPKI.jsp" %>
 <%}%>
<script language="JavaScript" src="scripts/navegador.js"></script>
<script language="JavaScript" type="text/JavaScript">

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

function aceptar() 
{
    
  if(!ValidarCorreo(document.confcuentas.txtCorreo.value))
   {
   alert("La cuenta de correo no es válida");
   document.confcuentas.txtCorreo.value="";
   document.confcuentas.txtCorreo.focus();
   }
   else
   {
    document.confcuentas.txtAccionSt.value="PENDIENTE";
    Sign();
     }
}

function cancelar()
{
   document.confcuentas.txtAccionSt.value="CANCELADA";
   Sign();
}




	function Sign()
		{
	if(bName == "Microsoft Internet Explorer")
		{	
			document.confcuentas.action="opciones_12.jsp";
			document.confcuentas.submit();	
 	}
  else{ 
    if (bName == "Netscape") 
    {
      document.confcuentas.action="opciones_2.jsp";
      document.confcuentas.submit();	
    }
  }		
}

  
function MM_swapImgRestore() { 
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { 
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

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

</script>
</HEAD>
<body  class="bg-light"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD width="819" vAlign="top" background="imagenes/msur01.png"
          ></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=BD.fecha()%></TD>
      <TD background="imagenes/fondoMenu.gif"><a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','imagenes/consultas2.gif',1)"><img src="imagenes/consultas1.gif" name="Image10" width="104" height="17" border="0"></a><a href="FI_confcuentas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones2.gif" name="Instrucciones"  border="0"></a><a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes1','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes1"  border="0" id="Reportes1"></a><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones1','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones1"  border="0" id="Opciones1"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir1','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir1"  border="0" id="Salir1"></a></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176"> 
        <%@ include file="menuOpciones.jsp" %>
      </TD>
      <TD valign="top" align="center"> <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr> 
            <td >&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo"><table width="100%" border="0"  class="titulo">
                <tr> 
                  <td width="93%" align="right">Confirmaci&oacute;n o Cancelaci&oacute;n 
                    de Cuentas Pendientes </td>
                  <td width="7%">&nbsp;</td>
                </tr>
              </table></td>
          </tr>
          <tr>
            <td align="center">
			<table width="90%">
			<tr>
            <td class="alerta" align="center">&nbsp;<%=alerta%></td>
          </tr>
			</table>
			</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"><table border="0" width="100%">
                <tr> 
                  <td align="center" valign="top"> <form name="confcuentas" method="post" >
                      <input type="hidden" name="txtFolio" value="<%=folio%>">
					  <input type="hidden" name="usuarioCaptura" value="<%=usuarioCaptura%>">
					   <input type="hidden" name="cveCuendep" value="<%=CveCuenDep%>">
                      <input type="hidden" name="txtBanco" value="<%=cveBanco%>">
					  <input type="hidden" name="txtNombreBanco" value="<%=Banco%>">
                      <input type="hidden" name="txtCuenta" value="<%=NumCuenta%>">
                      <input type="hidden" name="txtTitular" value="<%=Titular%>">
                      <input type="hidden" name="txtRFC" value="<%=RFC%>">
		      <input type="hidden" name="txtAccionSt" value="">
                      <input type="hidden" name="Pkcs7">
                      <input type="hidden" name="SignedText">

                      <table width="90%"  border="0" >
                        <tr> 
                          <td  colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DATOS 
                            GENERALES</b></td>
                        </tr>
                        <tr  class="celda02"> 
                          <td width="34%"> Folio:</td>
                          <td width="66%" > <%=folio%> </td>
                        </tr >
                        <tr  class="celda02"> 
                          <td   >Fecha de Captura: </td>
                          <td > <%=fechaCaptura%> </td>
                        </tr>
                        <tr  class="celda02"> 
                          <td > Capturada por:</td>
                          <td > <%=usuarioCaptura%> </td>
                        </tr>
						
                      </table>
                      <br>
															  <table width="90%"  border="0" >
																			<tr> 
																			  
                          <td height="19" colspan="2" align="center" bordercolor="#006699" bgcolor="#999966" class="celda01"><b>DETALLE 
                            CUENTA </b></td>
																			</tr>
																			                               <tr  class="celda02"> 
																			  
                          <td width="34%" > Banco donde radica la cuenta:&nbsp;&nbsp;</td>
																			  <td width="66%" > <%=Banco%> </td>
															</tr>
																			<tr  class="celda02">   
                          <td > Número de Cuenta:</td>
																			  <td ><%=NumCuenta%></td>
																			</tr>
                         												<tr  class="celda02"> 
																			  <td > Titular:</td>
																			  <td > <%=Titular%> </td>
																			</tr>
																			<tr  class="celda02"> 
																			  <td > RFC:</td>
																			  <td > <%=RFC%> </td>
																			</tr>     

                                      
															  </table>
                      <table width="90%" align="center">
                        <tr>
                          <td colspan="2" class="texto">&nbsp;</td>
                        </tr>
                        <tr> 
                          <td colspan="2" class="texto">Tu Direcci&oacute;n de 
                            Correo Electronico es: <b><i><font face="Arial"> <%= session.getAttribute("Email") %></font></i></b></td>
                        </tr>
                        <tr> 
                          <td width="36%" align="right" class="texto" >Otra Direcci&oacute;n 
                            de Correo Electronico:</td>
                          <td width="64%" class="texto"> <input maxlength=100 name="txtCorreo"  size="20" style=" WIDTH: 150px"> 
                            <font class="mensaje">(Opcional)</font> </td>
                        </tr>
                      </table>
                    </form></td>
                </tr>
                <tr> 
                  <td  >&nbsp; </td>
                </tr>

                <tr> 
                  <td align="right"><a href="FI_Opciones_12.jsp"><img src="imagenes/b_atras.gif" border=0 width="58"  height="23" align="right"></a></td>
                </tr>
                <tr> 
                  <td >&nbsp;</td>
                </tr>
                <tr> 
                  <td align="center"> <input type="button" name="Aceptar" value="Aceptar" onClick="javascript:aceptar()" class="boton" <%=( !BD.esDeposito(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0") &&  (tipoUsuario.equals("CLIENTE DEPOSITO") ||  tipoUsuario.equals("CLIENTE CONSULTA Y DEPOSITO") ))  ||  sCaptura.equals("SI") || bAutorizo ?"disabled":""%>> 
                    &nbsp; <input type="button" name="Cancelar" value="Cancelar" onClick="javascript:cancelar()" class="boton" <%=( !BD.esDeposito(request.getParameter("txtFolio")!=null?request.getParameter("txtFolio").trim():"0") &&  (tipoUsuario.equals("CLIENTE DEPOSITO") ||  tipoUsuario.equals("CLIENTE CONSULTA Y DEPOSITO") ))  ||  sCaptura.equals("SI") || bAutorizo?"disabled":""%>> 
                  </td>
                </tr>
              </table></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
