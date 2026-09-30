<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->
<%@ page session="true" import="mx.com.inscitech.clients.seguridad.*"%>
    <script>
        // Verificación básica de sesión
        if (!localStorage.getItem('token')) {
            window.location.href = 'login.jsp'; // Redirigir si no hay token
        }


    </script>
<%
//String userName = request.getParameter("username");
//String password = request.getParameter("password");
//Autenticacion autenticacion = new Autenticacion();
int resultLDAP = 1;//autenticacion.autenticar(userName, password);
//session.setAttribute("username", userName);

System.out.println(session.isNew()); 
//if (session != null) { //validacion LDAP WEBLOGIC
if (resultLDAP > 0){
    String user = request.getParameter("email");//request.getRemoteUser();
    //request.getParameter("j_username");
    //String user = request.getRemoteUser();//request.getParameter("j_username");
    System.out.print("usuario "+user);
    System.out.println("Atributo: " + user);
    session.setAttribute("username", user);
    //session.setAttribute("password", password);
    System.out.println("Entra " + user);  
    response.sendRedirect("FI_ValidUser.jsp");
} else {
    out.println("<center>Informaci&oacute;n del usuario incorrecta</center>");
%>    <script language="JavaScript" type="text/JavaScript">
        alert("Usuario o Password Incorrecto");
    </script>
    <table>
        <tr>
            <td>
                <font color="#C60000"><img src="imagenes/reloj_arena.gif" width="31" height="30">&nbsp;</font>        
            </td>                  
        </tr>                  
    </table>                  
    <jsp:forward page="login.jsp"/>
<%
}
%>

