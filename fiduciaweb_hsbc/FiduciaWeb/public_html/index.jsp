<%@ page contentType="text/html;charset=ISO-8859-1"%>
    <script>
        // Verificación básica de sesión
        if (!localStorage.getItem('token')) {
            window.location.href = 'login.jsp'; // Redirigir si no hay token
        }
    </script>
<% 
if(request.getParameter("username")!=null){
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "Thu, 29 Oct 2000 17:04:19 GMT");
    String user = request.getParameter("username");
    String fecha=request.getParameter("fecha");
    session.setAttribute("username", user);
    session.setAttribute("fechaContable", fecha);
    request.getSession().setAttribute("mensaje", "Proceso completado");
    response.sendRedirect("principal.jsp");  
 }else {
    out.println("<center>Informaci&oacute;n del usuario incorrecta</center>");
%>               
<jsp:forward page="login.jsp"/>
<%
}
%>


