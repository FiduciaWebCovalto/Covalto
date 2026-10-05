<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->
<ul class="menuLateral">

<%

  if(tipoUsuario==null || (tipoUsuario!=null &&  !tipoUsuario.equals("CLIENTE SECRETARIO DE ACTAS") && !tipoUsuario.equals("EJECUTIVO CONSULTA") && !tipoUsuario.equals("EJECUTIVO SECRETARIO DE ACTAS") && !tipoUsuario.equals("CLIENTE HONORARIOS")))

  		{%>
  <li><a href="FI_Instruccion13.jsp">Instrucciones no Monetarias</a></li>
  <%
  }%>

</ul>
