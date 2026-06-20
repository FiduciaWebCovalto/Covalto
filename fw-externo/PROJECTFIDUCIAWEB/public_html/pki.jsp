<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="parametros"  class="com.bancomext.negocio.FiduciaBD"/>
<%
 String IP =parametros.getDatosParametros(106);
 int  Port = Integer.parseInt((parametros.getDatosParametros(107)==null?"0":parametros.getDatosParametros(107)));
%>
