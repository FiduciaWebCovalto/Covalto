<%@ page contentType="text/html;charset=ISO-8859-1"%>
<%
try {
%>
<table id="tablaFooter">
  <tr>
    <TD align="left" valign="middle"><b>© Copyright, FiduciaWeb. TODOS LOS DERECHOS RESERVADOS. </b></td>
    <TD align="right" valign="middle">Sistema Fiduciario 2026.05 &nbsp;</td>
  </tr>
</table>
<%
} catch(Exception Ex) {
    session.removeAttribute("userInfo");
    session.removeAttribute("username");
    session.invalidate();
    response.sendRedirect("error.jsp");
}
%>