<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="Sesion.jsp" %> 
<%@ include file="parametrosToken.jsp" %>
<%
String strAlerta="Autenticaci&oacute;n No Satisfactoria,  su "+session.getAttribute("empresa_9")+"-LLAVE no se encuentra sincronizada<br> Se requieren sus pr&oacute;ximas 2 "+session.getAttribute("empresa_9")+"-LLAVES para realizar la sincronizaci&oacute;n.";
int stTOKEN=-10;
if(request.getParameter("txtTokenS")!=null)
 {
  session.setAttribute("errorToken","");
 stTOKEN=Token.sincronizaToken(fileProperties,claveUsuario,(String)request.getParameter("txtTokenS"),	(String)request.getParameter("txtnextToken"));

if (stTOKEN==0)
			{
			  session.setAttribute("errorToken","SINCRONIZACION  SATISFACTORIA");
			%>
          	<jsp:forward page="FI_Token.jsp"/>    
          <%
			}
else		{			
			strAlerta="SINCRONIZACION  NO SATISFACTORIA<br>INTENTE NUEVAMENTE";
			}
	


}
%>
<HTML>
<HEAD>
<TITLE>FiduciaWeb Movil .- SINCRONIZACION <%=session.getAttribute("empresa_9")%>-LLAVE</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" >
							function aceptarToken() 
								{
								if(document.SincronizaToken.txtTokenS.value=="")
									{
									alert('Es necesario que digite su LLAVE');
									document.SincronizaToken.txtTokenS.focus();
									return;
									}	
							   if((document.SincronizaToken.txtTokenS.value).length<6)
									{
									alert('La longitud de su LLAVE es invalida');
									document.SincronizaToken.txtTokenS.value="";
									document.SincronizaToken.txtTokenS.focus();
									return;
									}	
								if(isNaN(document.SincronizaToken.txtTokenS.value))
									{
									alert('La LLAVE es un dato numerico');
									document.SincronizaToken.txtTokenS.value="";
									document.SincronizaToken.txtTokenS.focus();
									return;
									}		
								if(document.SincronizaToken.txtnextToken.value=="")
									{
									alert('Es necesario que digite su Proxima <%=session.getAttribute("empresa_9")%>-Llave');
									document.SincronizaToken.txtnextToken.focus();
									return;
									}	
							   if((document.SincronizaToken.txtnextToken.value).length<6)
									{
									alert('La longitud de la Proximo <%=session.getAttribute("empresa_9")%>-Llave es invalida');
									document.SincronizaToken.txtnextToken.value="";
									document.SincronizaToken.txtnextToken.focus();
									return;
									}	
								if(isNaN(document.SincronizaToken.txtnextToken.value))
									{
									alert('La Proxima <%=session.getAttribute("empresa_9")%>-Llave es un dato numerico');
									document.SincronizaToken.txtnextToken.value="";
									document.SincronizaToken.txtnextToken.focus();
									return;
									}		
								 if(document.SincronizaToken.txtTokenS.value==document.SincronizaToken.txtnextToken.value)
									{
									alert('Las claves de la <%=session.getAttribute("empresa_9")%>-LLAVE deben ser distintas');
									document.SincronizaToken.txtTokenS.value="";							
        							document.SincronizaToken.txtnextToken.value="";
									document.SincronizaToken.txtTokenS.focus();
									return;
									}
								document.SincronizaToken.submit();
								}							
							function ocultarToken() 
							{
							document.SincronizaToken.txtTokenS.value="";							
							document.SincronizaToken.txtnextToken.value="";							
							}							
							</script>							
							
<script language="JavaScript" type="text/JavaScript">
<!--

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
//-->
</script>
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
//-->
</script>


</HEAD>
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" onLoad="document.SincronizaToken.txtTokenS.focus();">
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%"  height="100%" >
  <TBODY>
    <TR> 
      <TD width="176" height="56" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD width="100%" vAlign="top" background="imagenes/msur01.png"
          > </TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
	<TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=BD.fecha()%></TD>
      <TD background="imagenes/fondoMenu.gif" align="right"><A href="salir.jsp" class="Menu">SALIR</A>&nbsp;</TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center"  background="imagenes/fondoSubMenu.png"  width="176"  valign="top"  height="100%" ><br><br>
      </TD>
      <TD valign="top" align="center"><table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table> 
        
        <table width="612" border="0">
          <tr> 
            <td width="606" class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Sincronizaci&oacute;n 
              <%=session.getAttribute("empresa_9")%>-LLAVE</td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td align="center"> 
              <table width="90%" border="0" >
                <tr> 
                  <td  align="center" class="alerta"> </td>
                </tr>
                <tr> 
                  <td  align="center" class="alerta"><%=strAlerta%></td>
                </tr>
                <tr> 
                  <td height="239"  align="center" class="titulo"> <form name="SincronizaToken" method="post"  action="FI_Sincroniza_Token.jsp">
                      <table width="400" border="1" cellpadding="1" cellspacing="1" bordercolor="#666666" bgcolor="#999999" align="center">
                        <tr> 
                          <td  align="center"><table width="100%" border="0" cellspacing="1" cellpadding="1" class="texto" bgcolor="#CCCCCC" align="center"  background="imagenes/fondoSubMenu.png"  >
                              <tr> 
                                <td width="55%">&nbsp;</td>
                                <td width="45%">&nbsp;</td>
                              </tr>
                              <tr> 
                                <td width="55%">&nbsp;</td>
                                <td width="45%">&nbsp;</td>
                              </tr>
                              <tr> 
                                <td class="textoNegritaWhite">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Introduzca 
                                  la primer <%=session.getAttribute("empresa_9")%>-LLAVE:</td>
                                <td><input type="password" name="txtTokenS" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  ></td>
                              </tr>
                              <tr> 
                                <td width="55%"  class="textoNegritaWhite">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Introduzca 
                                  la Proxima <%=session.getAttribute("empresa_9")%>-LLAVE:</td>
                                <td width="45%"><input type="password" name="txtnextToken" size="10"  style=" WIDTH: 100px"
                                 maxlength="6"  ></td>
                              </tr>
                              <tr> 
                                <td width="55%">&nbsp;</td>
                                <td width="45%">&nbsp;</td>
                              </tr>
                              <tr> 
                                <td width="55%">&nbsp;</td>
                                <td width="45%">&nbsp;</td>
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
                    </form></td>
                </tr>
                <tr> 
                  <td  align="center" class="alerta">&nbsp;</td>
                </tr>
                <tr> 
                  <td  align="center" class="subtitulo">&nbsp;</td>
                </tr>
                <tr> 
                  <td  align="center" class="alerta">&nbsp;</td>
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
