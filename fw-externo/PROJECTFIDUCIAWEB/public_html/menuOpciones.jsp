<ul class="menuLateral">
	<%	if(tipoUsuario!=null &&  (tipoUsuario.equals("OPERATIVO SIN ACUERDOS") || tipoUsuario.equals("OPERATIVO CON ACUERDOS") || tipoUsuario.equals("CAPTURA CON ACUERDOS") || tipoUsuario.equals("CAPTURA SIN ACUERDOS") || tipoUsuario.equals("CLIENTE CONSULTA")))
		{%>
	<li> 
		<a href="FI_Opciones_2.jsp">Solicitud de Alta de Cuentas CLABE</a>
	</li>  
	<li> 
		<a href="FI_Opciones_12.jsp">Solicitud de Cuentas CLABE Pendientes</a>
	</li>  
	<li> 
		<a href="FI_Opciones_3.jsp">Solicitud de Alta de Terceros</a>
	</li>    
	<li> 
		<a href="FI_Opciones_13.jsp">Solicitud de Terceros Pendientes</a>
	</li>
	  
	<%}%>
    
	<li> 
		<a href="<%=((String)session.getAttribute( "totFid" )).equals("1")?"FI_Bienvenida":"FI_Fideicomiso"%>.jsp">Inicio</a>
	</li>
</ul>











