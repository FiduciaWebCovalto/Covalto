<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->
<%
String contenido = (String)session.getAttribute("contenido");
if ( contenido!= null && !contenido.trim().equals(""))
{	
	out.print ( contenido);
}
else
	{%> 
<html>              
<head>
<title>REPORTE DE CUENTAS INDIVIDUALES</title> 
</head> 
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<body  class="bg-light"oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">
	
<table align="center">
  <tr> 
    <td style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;" align="center" height="200">ERROR 
      AL MOSTRAR  <BR>
      EL REPORTE DE CUENTAS INDIVIDUALES<BR>
	  INTENTA NUEVAMENTE</td>
  </tr>
  <tr> 
    <td class="subtitulo" align="center" height="20"></td>
  </tr>
  <tr> 
    <td align="center" height="20"><input type="button" name="Cerrar" value="Cerrar" onClick="window.close();" style="background: #006699; border: 1px solid #000066; font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 9px; color: #FFFFFF; font-weight: normal;"></td>
  </tr>
</table>
</body>
</html>
<%
	}
%>
