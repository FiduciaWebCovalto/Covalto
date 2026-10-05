// JavaScript Document<script language="JavaScript">
 function ventanaError() {
    var ventanaError;
	ventanaError = window.open("","VENTANA","width=600,height=300");
    ventanaError.document.write("<link rel='stylesheet' href='styles/bancomext.css' type='text/css'>");
    ventanaError.document.write("<table align='center' border='0'>");
	ventanaError.document.write("<tr><td>&nbsp;</td></tr>");
	ventanaError.document.write("<tr><td>&nbsp;</td></tr>");
	ventanaError.document.write("<tr><td>&nbsp;</td></tr>");
	ventanaError.document.write("<tr><td class='error'>&nbsp;</td></tr>");
	ventanaError.document.write("<tr><td class='error'>ESTA CUENTA YA SE ENVIO CON ANTERIORIDAD</td></tr>");
	ventanaError.document.write("<tr><td class='error'>&nbsp;</td></tr>");
	ventanaError.document.write("<tr><td align='center'><input class='boton' type='button' value='Cerrar' onClick='window.close()'/></td></tr>");	
	ventanaError.document.write("</table>");
}
              