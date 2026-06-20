<%@ page contentType="text/html;charset=ISO-8859-1"%>
<TABLE border="0" cellPadding="0" cellSpacing="0"  width="100%" height="60">  
  <TR>
    <TD width="20%" class="headerLogo" ><img src="imagenes/header.jpg" alt="Sistema Fiduciario - FiduciaWeb" border="0" /></TD>
    <td width="80%"  align="right" valign="bottom" style="background-color:#ffffff" width="50%">
      <table border="0" cellpadding="0" cellspacing="0" height="100%" width="100%">
        <tr> 
          <td  align="right" valign="middle"  height="25">&nbsp; 
            <%//if(session.getAttribute("username")!=null){%>
              <a href="ssologoff.jsp" style="color:#000000;font-weight:bold">Cerrar Sesion &nbsp;&nbsp;<img src="imagenes/power.png" border="0" alt="Cerrar Sesión SSO" style="margin-right:20px;margin-top:10px"></a>
            <%//}%>
          </td>
        </tr>
        <tr> 
          <td  align="right" valign="bottom" class="tituloEncabezado" height="50%"> 
            <font style="color:#000000;font-weight: bolder; font-size: 9pt;"><%=session.getAttribute("strFechaContable")!=null?session.getAttribute("strFechaContable"):"&nbsp;"%></font>&nbsp;&nbsp; 
            <%if(session.getAttribute("mesAbiertoLbl") != null) {%>
            <%}%>
          </td>
        </tr>
      </table>
    </td>
  </TR>
</TABLE>
