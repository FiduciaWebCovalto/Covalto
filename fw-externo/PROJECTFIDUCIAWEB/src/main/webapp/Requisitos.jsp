<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<HTML>
<HEAD><TITLE>FiduciaWeb Movil  -  Requisitos</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript">

function ir() 
		{
		window.open("http://www.microsoft.com/windows/ie/downloads/recommended/ie55sp2/default.asp",'cambio_pwd','resizable=YES,menubar=YES,scrollbars=YES')  ;
		}	

</script>
<script language="JavaScript" type="text/JavaScript">
<!--

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</HEAD>
<BODY vLink=#052206 leftMargin=0 
topMargin=0 marginwidth="0" marginheight="0">
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%">
  <TBODY>
    <TR> 
      <TD width="176" height="47" background="imagenes/logo.jpg">&nbsp;</TD>
      <TD vAlign="top" background="imagenes/msur01.png"> </TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
	    <TR  background="imagenes/fondoMenu.gif"> 
      <TD align="center" class="date"  height="13"> <%=BD.fecha()%></TD>
	  	  <%if (session.getAttribute("NumUser")!=null ) 
	  		{%>
      <TD  align="right"> <a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir"  border="0"></a></TD>
	        <%}%>
    </TR>

    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="540" width="176">&nbsp;</TD>
      <TD valign="top" align="center"><table border="0" cellpadding=1 cellspacing=1 width="70%" >
          <tbody>
            <tr> 
              <td  colspan="2" >&nbsp;</td>
            </tr>
            <tr> 
              <td  colspan="2" align="center"><img src="imagenes/fid1.gif" > </td>
            </tr>
            <tr> 
              <td  colspan="2">&nbsp;</td>
            </tr>
            <tr> 
              <td  colspan="2" >&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2" class="titulo" align="center">TU EXPLORADOR NO SOPORTA 
                LA APLICACI&Oacute;N</td>
            </tr>
            <tr>
              <td colspan="2">&nbsp;</td>
            </tr>
            <tr>
              <td class="subtitulo" colspan="2"  align="center"> Es necesario 
                que actualices o descarges el Internet Explorer &lt;<a href="javascript:ir();">click 
                aqu&iacute;</a>&gt;<br>
              </td>
            </tr>
            <tr> 
              <td colspan="2">&nbsp;</td>
            </tr>
            <tr>
              <td  class="subtitulo" colspan="2"><br>
                En caso de requerir asesoria favor de comunicarte al:<br>
                Call Center <%=session.getAttribute("empresa_9")%>: &nbsp;&nbsp;5447-4050&nbsp;&nbsp; &nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;01800-849-9760 
              </td>
            </tr>
          </tbody>
        </table></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>