<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<HTML><HEAD><TITLE><%=session.getAttribute("empresa_9")%>: Encuesta</TITLE>
<SCRIPT language=JavaScript>
function abrirEncuesta() {
   window.open("Encuesta.jsp","Ventana","width=600,height=400,scrollbars=YES");      
window.close();
}
</SCRIPT>
</HEAD>
<META content="text/html; charset=iso-8859-1" http-equiv=Content-Type>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<BODY bgColor=#ffffff leftMargin=0 text=#000000 topMargin=0 marginwidth="0" marginheight="0">
  <table background="" bgcolor=#ffffff border=0 cellpadding=0 cellspacing=0 
      width="166" >
    <tbody> 
    <tr valign=top> 
      <td align=left colspan=3><img border=0 
            name=titulo_tareas_ch src="imagenes/titulo_encuesta.gif" 
           ></td>
    </tr>
    <tr valign=top> 
      <td width="13" ><img border=0  src="imagenes/weblog1_r4_c1.gif" ></td>
      <td width="143" align="center"> 
          <table border=0 cellpadding=1 cellspacing=1 width="100%" height"115">
          <tr align=left height="10"> 
            <td class="titulo" align="center" colspan="4"  >&nbsp;</td>
          </tr>
          <tr > 
            <td height="39" colspan="4" align="center" class="subtitulo"  > SERVICIOS 
              FIDUCIARIOS EN LINEA</td>
          </tr>
          <tr> 
            <td align="left"  colspan="4" valign="top">&nbsp;</td>
          </tr>
          <tr> 
            <td   colspan="4"  align="center"> <a  class="ref" href="javascript:abrirEncuesta();"> 
              TU OPINION<BR>
              ES IMPORTANTE </a> </td>
          </tr>
        </table>
      </td>
      <td width="10" align="right"><img border="0"  
             src="imagenes/weblog1_r4_c4.gif" ></td>
    </tr>
    <tr valign=top> 
      <td  colspan=3><img border="0" 
            src="imagenes/titulo_encuesta2.gif" ></td>
    </tr>
    </tbody> 
  </table>
</BODY></HTML>
