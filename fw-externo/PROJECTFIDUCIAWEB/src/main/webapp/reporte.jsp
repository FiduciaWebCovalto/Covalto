<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%! String accion = ""; %> 
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>

<%
String[] bitacora = new String[5];
String folioBit="";
int regBitacora=0;

response.setContentType("application/vnd.ms-excel");

String contenido = (String)session.getAttribute("contenido");  
String accion = request.getParameter("accion");
if ( contenido!= null && !contenido.trim().equals(""))
{    
     if (accion.equals("Consultar")) {
       accion = "<link rel=\"stylesheet\" href=\"styles/bancomext2.css\" type=\"text/css\">";  
       accion += "<script>function Opcion() {  }</script>"; 
      
     }else{ 
       accion = "<link rel=\"stylesheet\" href=\"styles/bancomext.css\" type=\"text/css\">";
       accion += "<script>function Opcion() { window.print(); }</script>"; 
     }    
	
  out.print("<html><head>"); 
	out.print(accion);
  out.print (contenido);
	session.setAttribute("contenido","");
}
else
	{%> 
<html>              
<head>
<title>PROGRAMATICO PRESUPUESTAL</title> 
</head> 
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<body >
	
<table align="center">
  <tr> 
    <td style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;" align="center" height="200">ERROR 
      AL MOSTRAR <BR>
      EL REPORTE PROGRAMATICO PRESUPUESTAL<BR>
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
