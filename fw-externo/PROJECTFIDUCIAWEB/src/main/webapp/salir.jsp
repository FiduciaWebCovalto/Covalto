<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->



<HTML>
<HEAD><TITLE>FiduciaWeb Movil  -  <%=session.getAttribute("empresa_9")%> </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="/fiduciaweb/styles/bancomext.css" type="text/css">
<script language="JavaScript">
function ir() 			{
						javascript: setTimeout("salirSSo();",5000)
							}

function salirSSo() {
localStorage.removeItem('token');
//							location.href="/fiduciaweb/login.jsp";
document.inicio.action="/FiduciaWebMovil/login.jsp";
document.inicio.submit();
							}
</script>
</HEAD>
<BODY onLoad="ir();" style="background:none">
<jsp:include page="header.jsp"/>
<TABLE border="0" cellPadding="0" cellSpacing="0" width="102%">
  <TBODY>    
    <TR > 
      <TD height="540" align="center" valign="top"><form name="inicio" action="algo.jsp" method="post">
          <table border="0" cellpadding=1 cellspacing=1 width="100%" height="333">
            <tbody>
              <tr> 
                <td  colspan="2" >&nbsp;</td>
              </tr>
              <tr> 
                <td  colspan="2" >&nbsp;</td>
              </tr>
              <tr> 
                <td  colspan="2" >&nbsp;</td>
              </tr>
              <tr> 
                <td  colspan="2" >&nbsp;</td>
              </tr>
			  <tr> 
	              
                <td  colspan="2"  align="center" class="alerta"> 
				
                    <%
                        if(session.getAttribute("Mensaje")!=null)
                           out.print(session.getAttribute("Mensaje"));
						
                     %>
					 <BR>
					 <%
                        if(session.getAttribute("Error")!=null)
                           out.print(session.getAttribute("Error"));
						
                     %>
					 					 <BR>
					 <%
                        if(session.getAttribute("errorToken")!=null)
                           out.print(session.getAttribute("errorToken"));
						
                     %>
                </td>
              </tr>
	          <tr> 
	              <td  colspan="2" >&nbsp;</td>
              </tr>
              <tr> 
                <td   class="subtitulo" colspan="2" align="center">ESPERE MIENTRAS 
                  FINALIZA SU SESION...</a> </td>
              </tr>
              <tr> 
                <td  colspan="2">&nbsp;</td>
              </tr>
              <tr> 
                <td align="center" class="subtitulo" colspan="2" ><font color="#C60000"><img src="imagenes/reloj_arena.gif" width="31" height="30">&nbsp; 
                  </font></td>
              </tr>
              <tr> 
                <td  colspan="2" >&nbsp;</td>
              </tr>
              <tr> 
                <td  colspan="2">&nbsp;</td>
              </tr>
              <tr> 
                <td  width="239"  align="right"></td>
                <td  width="337"  align="center">&nbsp; </td>
              </tr>
            </tbody>
          </table>
        </form></TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff height=1> </TR>
	  
  </TBODY>
</TABLE>
<%
try
         {            
           session.removeAttribute("NumUser");
	   request.getSession().invalidate();
         }
         catch(Exception e)
         {
		 System.out.println("Error in ending JSP application session.  Please quit your all browser windows.");
         }
%>

		
</BODY></HTML>
