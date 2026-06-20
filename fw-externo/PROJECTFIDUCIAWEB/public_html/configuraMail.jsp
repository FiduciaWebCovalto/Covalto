<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%
 String IPCorreo=BD.getDatosParametros(100);
 String correo=BD.getDatosParametros(101);
 props.put("mail.smtp.host", IPCorreo);
 fromAddress = correo;
 toAddress = correo;
%>