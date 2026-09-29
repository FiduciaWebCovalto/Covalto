<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->
<script language="JavaScript" SRC='scripts/ApiSendEmail.js'></script>

<%

String Folio         = request.getParameter("txtFolio");
String Serial        = "111111111111111111111";
String PKCS7         = request.getParameter("Pkcs7"); 
String ExternContent = request.getParameter("SignedText");
char GetReceipt      = 'Y';

%>
