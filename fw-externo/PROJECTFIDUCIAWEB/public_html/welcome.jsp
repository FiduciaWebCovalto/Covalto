<html>
  <head>
    <title>Ejemplo</title>
  </head>

  <%
    String bgcolor;
    if ((bgcolor=(String)application.getAttribute("Background")) ==
        null)
    {
        bgcolor="#cccccc";
    }
  %>
  <body bgcolor=<%="\""+bgcolor+"\""%>> 
  <blockquote>
  <h1> Ejemplo de Seguridad </h1>
  <p> Bienvenido <%= request.getRemoteUser() %>! 
  <p> Si eres administrador, puedes configurar el color del fondo
  de la aplicación. 
  <br> <b><a href="firmas/Principal.jsp">Configurar el fondo</a></b>.
  <%
//if (request.getRemoteUser() != null) { 
 System.out.println(session.isNew()); 
 if (session != null) { 
    response.sendRedirect("FI_ValidUser.jsp");
} else { 
  %> 
    <p> Click aquí para salir <a href="logout.jsp">logout</a>. 
  <% 
     }
  %>    
  </blockquote>
  </body>
</html>
