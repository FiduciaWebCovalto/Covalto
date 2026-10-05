<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%
 String IPCorreo=Correo.getDatosParametros(100);
 String correo=Correo.getDatosParametros(101);
 props.put("mail.smtp.host", "127.0.0.1");
 fromAddress = correo;
 toAddress = correo;
%>