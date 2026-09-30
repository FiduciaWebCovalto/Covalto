<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="Token"  class="mx.com.inscitech.clients.negocio.AutenticaUsuario"/>
<%@ page import="java.io.*"%>
<%
//String fileProperties=pageContext.getServletContext().getRealPath("/WEB-INF/")+File.separator+ "classes" + File.separator+"rsa_api.properties";
String fileProperties="rsa_api.properties";
//System.out.println(fileProperties);
String passCode = request.getParameter("txtToken")!=null?request.getParameter("txtToken"):"";
String claveUsuario=(String)session.getAttribute("username");  
String mensajeToken="";
int autenticaUsuario=0;//se coloca por default que el TOKEN es valido 

%>
