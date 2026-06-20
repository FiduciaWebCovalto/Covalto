<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="sesionInst9.jsp" %>
<HTML>
<HEAD><TITLE>Instrucciones - Pendientes </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript" type="text/JavaScript">
var existeToken="<%=(String)session.getAttribute("token")%>";
<!--
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

function Enviar(sFolio)
{

document.InstPen.txtFolio.value = sFolio;

if(existeToken==1)
	{
	mostrarToken(); 
	return;
	}
	
   document.InstPen.submit();
}

function aceptarToken() 
	{
	if(document.InstPen.txtToken.value=="")
		{
		alert('Es necesario que digite su LLAVE');
		document.InstPen.txtToken.focus();
		return;
		}	
   if((document.InstPen.txtToken.value).length<6)
		{
		alert('La longitud de la LLAVE es invalida');
		document.InstPen.txtToken.value="";
		document.InstPen.txtToken.focus();
		return;
		}	
	if(isNaN(document.InstPen.txtToken.value))
		{
		alert('La LLAVE es un dato numerico');
		document.InstPen.txtToken.value="";
		document.InstPen.txtToken.focus();
		return;
		}		
	document.InstPen.action="confirmarInst_FS9.jsp";
	document.InstPen.submit();
	}	
	
function mostrarToken() 
{
datos.style.visibility = 'hidden';
token.style.visibility = 'visible';
document.InstPen.txtToken.focus();
}

function ocultarToken() 
{
document.InstPen.txtToken.value="";
datos.style.visibility = 'visible';
token.style.visibility = 'hidden';

}



function MM_swapImage() { 
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
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
          ><a name="top"></a></TD>
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
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=sysFecha%></TD>
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
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %></td>
          </tr>
        </table>
        <table width="593" border="0">
          <tr>
            <td  align="center"  >&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Instrucciones 
              Pendientes </td>
          </tr>
          <tr> 
            <td>&nbsp;</td>
          </tr>
          <tr> 
            <td  align="center" valign="top"> <form name="InstPen" method="post" action="confirmarInst_FS9.jsp">
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
                <input type="hidden" name="txtFolio" value="">
				
                <table width="100%" border="0" id="datos">
				<tr> 
                    <td height="20" colspan="4" class="alerta" align="center"><%=request.getParameter("st")!=null && request.getParameter("st").equals("1")?(String)session.getAttribute("msgError"):""%>&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="4">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="4"> 
                      <%
                                 out.print(BD.getMovsFOSEG((String)session.getAttribute("NumFid"),"","","","ESPERA"));
                              %>
                    </td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="4">&nbsp;</td>
                  </tr>
                  <tr> 
                    <td height="20" colspan="4">&nbsp;</td>
                  </tr>
                </table>
              </form>
              <table border=0 cellpadding=0 cellspacing=1  align="center">
                <tr align=middle valign=center> 
                  <td height=30> <div align="center"><a href="#top"><img border=0 height=11 src="imagenes/arriba.gif" width=59></a></div></td>
                </tr>
                <tr align=middle> 
                  <td  height=7><img height=1 src="imagenes/cnaranja01.gif" width=470></td>
                </tr>
              </table></td>
          </tr>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=3 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
