<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="parametros"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%
 String IP =parametros.getDatosParametros(106);
 int  Port = Integer.parseInt((parametros.getDatosParametros(107)==null?"0":parametros.getDatosParametros(107)));
%>
