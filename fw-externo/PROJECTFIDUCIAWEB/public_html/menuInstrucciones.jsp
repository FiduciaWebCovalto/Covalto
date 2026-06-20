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
<li><a  href="FI_Instruccion1.jsp">Dep&oacute;sito</a></li>
<li><a  href="FI_Instruccion<%=(((String)session.getAttribute( "FOSEG" )).equals("S"))?"FS":""%>2.jsp">Retiro</a></li>
<li><a  href="FI_Instruccion14.jsp">Inversi&oacute;n</a></li>

  <% 


%>

	  <li><a   href="<%=((String)session.getAttribute( "totFid" )).equals("1")?"FI_Bienvenida":"FI_Fideicomiso"%>.jsp">Inicio</a></li>
    
  <%
  }
  if(tipoUsuario!=null && ( tipoUsuario.equals("EJECUTIVO SECRETARIO DE ACTAS") || tipoUsuario.equals("CLIENTE SECRETARIO DE ACTAS")))
  		{%>
		<% 
//OPCIONES NO DISPONIBLES PARA FOSEG
if(((String)session.getAttribute( "FOSEG" )).equals("N"))
  	{
%>
  <% if(((String)session.getAttribute("TRASPINTERFID")).equals("1"))
		  { %>
  <%} %>
  <% 
	}//if(((String)session.getAttribute( "FOSEG" )).equals("N"))
	
	
//OPCIONES SOLO DISPONIBLES PARA FOSEG
 if(((String)session.getAttribute( "FOSEG" )).equals("S"))
    {
    %>
  <%
	}//if(((String)session.getAttribute( "FOSEG" )).equals("S"))
%>
  <li><a  href="FI_ComiteTecnico.jsp"> 
      Sesiones Comite T&eacute;cnico</a></li>
	<li> <a  href="<%=((String)session.getAttribute( "totFid" )).equals("1")?"FI_Bienvenida":"FI_Fideicomiso"%>.jsp">Inicio</a></li>
    
<%}%>



</ul>
