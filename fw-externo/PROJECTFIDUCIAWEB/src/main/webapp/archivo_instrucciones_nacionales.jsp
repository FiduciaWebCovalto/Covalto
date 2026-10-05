<!--
/*
  archivoDepositosRetiros.jsp
  @Autor:Inscitech
  @Creado: Junio 2008
  
*/
-->
<%@ page %>
<!--jsp:useBean id="BD"  class="com.inscitech.negocio.FiduciaBD"/-->
<jsp:useBean id="instruccDAO" class="mx.com.inscitech.clients.daos.InstruccDAO"/>
<%
String txtFechaI = request.getParameter("txtFechaI");
String moneda = request.getParameter("moneda");
String archivoGenerado = instruccDAO.generarArchivo(txtFechaI, moneda);
//application/vnd.ms-excel
  response.setContentType("application/vnd.ms-excel");
  out.print("<HTML>");
  out.print(archivoGenerado);
  out.print("</HTML>");
%>