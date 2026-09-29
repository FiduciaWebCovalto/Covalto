
<!--menuOperacionInterna.jsp-->

<ul class="menuLateral">
<%
if(tipoUsuario!=null &&  (tipoUsuario.equals("CAPTURA CON ACUERDOS") || tipoUsuario.equals("CAPTURA SIN ACUERDOS") || 
tipoUsuario.equals("OPERATIVO CON ACUERDOS") || tipoUsuario.equals("OPERATIVO SIN ACUERDOS") || 
tipoUsuario.equals("CLIENTE CONSULTA"))){%>
	<li> 
		<a href="FI_Consultas.jsp?menu=1">Saldos por Contratos de Inversi&oacute;n</a>
	</li>  
	<!--li> 
		<a href="FI_Consultas.jsp?menu=2">Honorarios Fiduciarios Pendientes de Pago</a>
	</li>  
	<li> 
		<a href="FI_Consultas.jsp?menu=3">Tasas de Rendimiento</a>
	</li-->    
	<li> 
		<a href="FI_Consultas.jsp?menu=<%=((String)session.getAttribute( "FOSEG" )).equals("S")?"5":"6"%>">Movimientos</a>
	</li>
	<li>
		<a  href="<%=((String)session.getAttribute( "totFid" )).equals("1")?"FI_Bienvenida":"FI_Fideicomiso"%>.jsp">Inicio</a>
	</li>
	<%}%>
	
<%
  //opciones del menu para las consultas por ejecutivo
  if(tipoUsuario!=null && (tipoUsuario.equals("EJECUTIVO CONSULTA") || tipoUsuario.equals("CLIENTE SECRETARIO DE ACTAS")))
  		{%>
		
	<li> 
		<a href="FI_Consultas.jsp?menu=1">Saldos por Contratos de Inversi&oacute;n</a>
	</li>  
	<li> 
		<a href="FI_Consultas.jsp?menu=11">Seguimiento de Acuerdos del Comite T&eacute;cnico</a>
	</li>  
	<!--li> 
		<a href="FI_Consultas.jsp?menu=2">Honorarios Fiduciarios Pendientes de Pago</a>
	</li>    
	<li> 
		<a href="FI_Consultas.jsp?menu=3">Tasas de Rendimiento</a>
	</li-->
	
	<%  if(((String)session.getAttribute( "FOSEG" )).equals("S"))
    {
    %>
	<li> 
		<a href="FI_Consultas.jsp?menu=4">Instrucciones SWIFT </a>
	</li>
  <% } %>
  
	<li>
		<a href="FI_Consultas.jsp?menu=<%=((String)session.getAttribute( "FOSEG" )).equals("S")?"5":"6"%>">Movimientos</a>
	</li>
	<li>
		<a  href="<%=((String)session.getAttribute( "totFid" )).equals("1")?"FI_Bienvenida":"FI_Fideicomiso"%>.jsp">Inicio</a>
	</li>
	
	<%}%>
		<%
	//opciones del menu para el Secretario de Actas
	if(tipoUsuario!=null &&  tipoUsuario.equals("CLIENTE1 SECRETARIO DE ACTAS"))
	{
	%>
	<li>
		<a href="FI_Consultas.jsp?menu=1">Saldos por Contratos de Inversi&oacute;n</a>
	</li>
	<li>
		<a  href="<%=((String)session.getAttribute( "totFid" )).equals("1")?"FI_Bienvenida":"FI_Fideicomiso"%>.jsp">Inicio</a>
	</li>
	<%}%>

	<%if(tipoUsuario!=null &&  (tipoUsuario.equals("CLIENTE HONORARIOS")))

	{%>

		<%if(((String)session.getAttribute( "FOSEG" )).equals("N")){%>
	<li>
		<a href="FI_Consultas.jsp?menu=2">Honorarios Fiduciarios Pendientes de Pago</a>
	</li>
		<%}%>
	<%}%>
</ul>






