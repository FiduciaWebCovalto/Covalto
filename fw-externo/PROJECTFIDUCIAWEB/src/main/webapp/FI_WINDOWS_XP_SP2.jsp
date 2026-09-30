<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%
 String sysFecha=BD.fecha(); %>
<HTML>
<HEAD><TITLE>FiduciaWeb Movil  -  <%=session.getAttribute("empresa_1")%></TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<script language="JavaScript">
function descargar(formato)
{
if( formato==1)
window.open( "formatos/Manual_WINXPSP2.doc"  ,"DESCARGAR_MANUAL","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=NO,width=750,height=400");
if( formato==2)
window.open( "formatos/seguridataAC.cer" ,"DESCARGAR_AC","top=20,left=20,toolbar=no,location=no,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=NO,width=750,height=400");
}

function guia(doc)
{
   window.open( "formatos/anexo"+doc+".doc"  ,"ANEXO_"+doc,"top=20,left=20,width=750,height=420,menubar=YES,scrollbars=YES");
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
<body  class="bg-light"vLink="#052206"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0"   >
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR> 
      <TD width="176" bgcolor="#003366"><IMG 
            src="imagenes/logo.jpg" 
            alt="<%=session.getAttribute("empresa_9")%>"   border="0"  width="176"></TD>
      <TD vAlign="top" background="imagenes/msur01.png"
          > <DIV align="right">
            <FONT color="#FFFFFF" size="-7" face="Arial, Helvetica, sans-serif"><FONT color="#FFFFFF" size="-7" face="Arial, Helvetica, sans-serif">54 49 91&nbsp;12</FONT> &nbsp;&nbsp;</FONT>&nbsp;&nbsp;
            <A href="mailto:info@bancomextsa.com"><FONT color="#FFFFFF" size="-7" face="Arial, Helvetica, sans-serif">fiduciario@finalmex.com</FONT></A><A 
            href="mailto:info@bancomext.com"><FONT color="#FFFFFF"size=-7 
            face="Arial, Helvetica, sans-serif">&nbsp;&nbsp;&nbsp;</FONT></A> 
        </DIV></TD>
    </TR>
    <TR > 
      <TD colspan="2" align="center" height="1"></TD>
    </TR>
    <TR > 
      <TD background="imagenes/fondoMenu.gif" align="center" class="date"> <%=BD.fecha()%></TD>
      <TD background="imagenes/fondoMenu.gif"> <a href="FI_Consultas.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Consultas','','imagenes/consultas2.gif',1);" ><img src="imagenes/consultas1.gif" name="Consultas" width="104" height="17" border="0" ></a><a href="FI_Instrucciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Instrucciones','','imagenes/instrucciones2.gif',1)"><img src="imagenes/instrucciones1.gif" name="Instrucciones"  border="0"></a><!--a href="FI_EdosF.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Reportes','','imagenes/reportes2.gif',1)"><img src="imagenes/reportes1.gif" name="Reportes"  border="0"></a--><a href="FI_Opciones.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Opciones','','imagenes/Opciones2.gif',1)"><img src="imagenes/Opciones1.gif" name="Opciones"  border="0"></a><a href="salir.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Salir','','imagenes/salir2.gif',1)"><img src="imagenes/salir1.gif" name="Salir"  border="0"></a></TD>
    <TR > 
      <TD colspan="2" align="center" height="2"></TD>
    </TR>
    <TR > 
      <TD align="center" class="textoNegrita" background="imagenes/fondoSubMenu.png" valign="top" height="100%" width="176">&nbsp; 
        </TD>
      <TD valign="top" align="center"><table width="80%" border="0">
          <tr> 
            <td  class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td  height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo">Manual 
              de Operaci&oacute;n con Windows XP Service Pack 2</td>
          </tr>
          <tr> 
            <td  valign="top"> <br>
              <P align="justify" class="subtitulo">PASO 1:</P>
              <P align="justify" class="textoNegrita"> Consulta del Manual de 
                Operaci&oacute;n de FiduciaWeb Movil en L&iacute;nea con 
                Windows XP Service Pack 2:</P>
              <table width="473" align="center" >
                <tr> 
                  <td colspan="2"  class="texto">- Haz clic sobre la siguiente 
                    liga.</td>
                </tr>
                <tr> 
                  <td width="82" align="right" class="textoNegrita"><img src="imagenes/img_word.jpg" width="28" height="30"></td>
                  <td width="431">&nbsp;&nbsp;&nbsp;<a href="javascript:descargar(1);"  class="texto">1932 
                    KB Manual de Operaci&oacute;n </a></td>
                </tr>
                <tr>
                  <td colspan="2" class="texto">Si deseas Guardar el manula en 
                    tu PC sigue los siguientes pasos:</td>
                </tr>
                <tr> 
                  <td colspan="2" class="texto">&nbsp;&nbsp;&nbsp;- Haz clic en 
                    em menu de archivo de la ventana en la que se visualiza el 
                    manual.</td>
                </tr>
                <tr> 
                  <td colspan="2" class="texto">&nbsp;&nbsp;&nbsp;- Haz clic en 
                    Guardar como.. y guarda el manual en una de tus carpetas personales.</td>
                </tr>
              </table>
              <p align="justify" class="subtitulo">PASO 2:</p>
              <p align="justify" class="textoNegrita"> Realiza el paso 0 del Manual 
                de Operaci&oacute;n.</p>
              <p align="justify" class="subtitulo">PASO 3 : </p>
              <p align="justify" class="textoNegrita">Instalar la Autoridad Certificadora, 
                siguiendo las instrucciones de los pasos del 1 al 9 del Manual 
                de Operaci&oacute;n.</p>
              <table align="center" >
                <tr> 
                  <td colspan="2" class="texto">Haz clic en la liga para descargar 
                    el archivo:</td>
                </tr>
                <tr> 
                  <td width="82" align="right" class="textoNegrita"><img src="imagenes/img_cer.jpg" ></td>
                  <td width="427">&nbsp;&nbsp;&nbsp;<a href="javascript:descargar(2);"  class="texto">2 
                    KB Autoridad Certificadora</a></td>
                </tr>
              </table>
              <p align="justify" class="subtitulo">PASO 4 : </p>
              <p align="justify" class="textoNegrita">En caso de que usted utilice 
                firmas digitales y en la pantalla de confirmaci&oacute;n de la 
                instrucci&oacute;n le mande errores y no le despliege la pantalla 
                para firmar digitalmente su instruccion, realice el paso 9 del 
                Manual de operaci&oacute;n</p>
              <p align="justify" class="textoNegrita">&nbsp;</p>
              <p align="justify" class="textoNegrita">&nbsp;</p>
              </td>
          </tr>
        </table>
        <table  align="center">
          <tr align=middle valign=center> 
            <td height=30 align="center"> <a href="#top"><img border=0 height=11 src="imagenes/arriba.gif" width=59></a> 
            </td>
          </tr>
          <tr align=middle> 
            <td  height=7><img  height=1 src="imagenes/cnaranja01.gif" width=420></td>
          </tr>
        </table>
        <br> </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY></HTML>
