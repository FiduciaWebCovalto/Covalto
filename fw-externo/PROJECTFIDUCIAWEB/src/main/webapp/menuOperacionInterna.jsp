
<!--menuOperacionInterna.jsp-->

<ul class="menuLateral">
	<% 
	if (tipoUsuario!=null /* && tipoUsuario.equals("OPERACION INTERNA")*/) {
		%>
	<li> 
		<a href="FI_OperacionInterna.jsp?menu=1">Administraci�n</a>
	</li>  
	<li> 
		<a href="FI_OperacionInterna.jsp?menu=2">Operaci�n</a>
	</li>   
	<li> 
		<a href="<%=((String)session.getAttribute( "totFid" )).equals("1")?"FI_Bienvenida":"FI_Fideicomiso"%>.jsp">Inicio</a>
	</li>
	  
	<%}%>
</ul>
