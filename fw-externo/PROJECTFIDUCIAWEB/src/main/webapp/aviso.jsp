<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="avisos" class="com.bancomext.negocio.nServicios"/>

<HTML>
<HEAD><TITLE>AVISO IMPORTANTE</TITLE>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<BODY bgColor=#ffffff leftMargin=0 text=#000000 topMargin=0 marginwidth="0" marginheight="0">
<table width="100%" border="3" bordercolor="#000000" height="100%" bgcolor="#EAEADF">
  <tr valign="top"> 
    <td align="center"><table width="90%" border="0" >
		<%
		avisos.querySelect(11);
		for(int r=0; r < avisos.getSize(); r++)
		    {
			
			 avisos.setIndex(r);%>
        <tr> 
          <td align="center">
		  <br>
		  <p align="justify" class="subtitulo">
		  <%=avisos.getVtrStrDato1()%>
		  </p>
		  
		  <div align="center"><img src="./imagenes/mensaje.jpg" height="150"></div>
		  </td>
        </tr>
        <%}%>
		
       
        <tr> 
          <td align="center" class="subtitulo"><br><br>Atentamente</td>
        </tr>
        <tr align="center" class="fiso"> 
          <td><br>Direcci&oacute;n Fiduciaria</td>
        </tr>
        <tr align="center" class="fiso"> 
          <td>&nbsp;</td>
        </tr>
        <tr align="center" class="fiso">
          <td><input type="button" name="CERRAR" value="CERRAR" class="boton" onClick="javascript:window.close()"></td>
        </tr>
        <tr align="center" class="fiso"> 
          <td>&nbsp;</td>
        </tr>
      </table></td>
  </tr>
</table>
</BODY></HTML>
