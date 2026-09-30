<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*, java.util.*"%>
<jsp:useBean id="BD" class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="Sesion.jsp" %>
<%
int menu=Integer.parseInt(request.getParameter("menu")!=null?request.getParameter("menu").trim():"0");
String titulo="OPERACIONINTERNA";
int regBitacora=0;
/*
menu=1;Administraci�n
menu=2;Operaci�n
*/
switch(menu)
					{
					case 1:
							titulo="Administraci�n de usuarios";
							break;
					case 2:
							titulo="Autorizaci�n/Rechazo de cuentas TEF y SPEI";
							break;
					default:
							titulo="OPERACI�N INTERNA";
              
							break;	
					}//switch(menu)
%>
<HTML>
<HEAD><TITLE><%=titulo%> - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>
<script language="JavaScript" type="text/JavaScript">

function atras() {
						   document.forms[0].submit();
						}
</script>
<script language="JavaScript" type="text/JavaScript">
function MM_preloadImages() { 
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { 
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
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
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('imagenes/instrucciones2.gif','imagenes/reportes2.gif','imagenes/Opciones2.gif','imagenes/salir2.gif','imagenes/consultas2.gif')" >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG src="imagenes/logo.jpg" alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD vAlign="top" background="imagenes/msur01.png">
	  </TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=sysFecha%></TD>
      <TD background="imagenes/fondoMenu.gif">
        <a href="FI_Consultas.jsp"     onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Consultas','','imagenes/consultas2.gif',1);"><img src="imagenes/consultas1.gif" name="Consultas" border="0"></a>
        <a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones1.gif" name="Instrucciones"  border="0"></a>
        <a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes" border="0"></a>
        <a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones" border="0"></a>
        <a href="FI_Reportes.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('ReportesT','','imagenes/reportes02.gif',1)"><img src="imagenes/reportes01.gif" name="ReportesT"  border="0"></a>
        <a href="FI_OperacionInterna.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Operacion','','imagenes/Operacion2.gif',1)"><img src="imagenes/Operacion1.gif" name="Operacion"  border="0"></a>
        <a href="FI_Administracion.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Administracion','','imagenes/administracion2.gif',1)"><img src="imagenes/administracion1.gif" name="Administracion"  border="0"></a>		
        <a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir"  border="0"></a>
      </TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top"  height="100%"  width="176">
        <%@ include file="menuOperacionInterna.jsp" %>
      </TD>
      <TD valign="top" align="center">
	  <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %></td>
          </tr>
	</table>	  

	 <table width="80%" border="0"> 
          <tr> 
            <td width="588" class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo"><%=titulo%></td>
          </tr>
          <tr> 
            <td>
          </td>
          </tr>
          <tr> 
            <td align="center" valign="top"> 
              <%
  switch(menu)
					{
					case 1://menu principal Administraci�n-Usuario   
          %>
            <jsp:include page="FI_Usuario.jsp" />
          <%
            break;
            
					case 2://menu principal Operaci�n cuentas TEF y SPEI
            break;
          
          case 3://submenu de FI_Usuario.jsp
            %>  
            <jsp:include page="FI_UsuarioAsigna.jsp"/>
            <%	
            break;
            
          default:
            %>          
            <jsp:include page="mensajeOperacionInterna.jsp" />
            <%
            break;
					}	
            %>
            </td>
          </tr>
        </table>
        </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY>
</HTML>