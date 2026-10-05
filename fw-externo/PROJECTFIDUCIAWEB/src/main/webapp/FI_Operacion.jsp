
<!doctype html>
<!--FI_BandejaEntrada.jsp-->
<%@ page import="java.text.*, java.util.*"%>
<jsp:useBean id="BD" class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<%@ include file="Sesion.jsp" %>
<%
try {
int menu=Integer.parseInt(request.getParameter("menu")!=null?request.getParameter("menu").trim():"0");
String titulo="OPERACI?N";
//String fecha=BD.getFecha();
int regBitacora=0;
/*
menu=1;Administraci?n
menu=2;Operaci?n
*/
     switch(menu)
					{
          
					case 1: //Menu principal
							titulo="Autorizaci?n/Rechazo de Cuentas SPEI";
							break;
					case 2: //Menu principal
							titulo="Bandeja de Entrada";
							break;
					case 3: //Submenu de Autorizaci?n/Rechazo de Cuentas SPEI
							titulo="Modificaci?n de Cuentas";
							break;
					case 4: //Submenu de la Bandeja de Entrada
							titulo="Detalle de la Instrucci?n";
							break;
					case 5: //Submenu de Autorizaci?n/Rechazo de Cuentas SPEI
							titulo="Asignaci?n/Eliminaci?n de Cuentas a Fideicomisos";
							break;
					case 6: //Submenu de Autorizaci?n/Rechazo de Cuentas SPEI
							titulo="Contabiliza/Rechaza Instrucci?n";
							break;     
					case 7: //Submenu de Charola de Operaciones Relevantes
							titulo="Charola de Op. Inusuales/Relevantes/24Hrs";
							break;                
					case 8: //Submenu de Charola de Instrucciones No Monetarias
							titulo="Charola de Instrucciones No Monetarias";
							break;          
					case 9: //Submenu de Charola de Operaciones Internas Sospechosas
							titulo="Charola de Operaciones Internas Preocupante";
							break;  
					case 10: //Submenu de Consulta de PLD
							titulo="Consulta Operaciones PLD";
							break;  
              
					default:
							titulo="OPERACI?N";
              
							break;	
					}//switch(menu)
%>
<HTML>
<HEAD><TITLE><%=titulo%> - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P?gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<link rel="stylesheet" href="styles/calendario.css" type="text/css">
<SCRIPT src="scripts/calendario.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-es.js" type=text/javascript></SCRIPT>
<SCRIPT src="scripts/calendario-setup.js" type=text/javascript></SCRIPT>
<script language="JavaScript" SRC='scripts/general.js'></script>
<script language="JavaScript" type="text/JavaScript">

function atras() {
						   document.forms[0].submit();
						}
</script>
<script language="JavaScript" type="text/JavaScript">

</script>
</HEAD>
<body class="bg-light">
<jsp:include page="header.jsp"/>
<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%">
  <TBODY>
     <TR class="trMenuSuperior">
      <TD colspan="7">
        <ul class="menuSuperior">
          <li><a href="FI_Administracion.jsp">Administracion</a></li>
          <li><a href="FI_Operacion.jsp">Operaciones</a></li>
          <li><a href="salir.jsp">Salir</a></li>
        </ul>
      </TD>
    </TR>   
    <TR > 
      <TD align="center" class="tdMenuLateral" valign="top"  height="100%"  width="176">
        <%@ include file="menuOperacion.jsp"%>
      </TD>
      <TD valign="top" align="center">

    <table width="80%" border="0"> 
          <tr> 
            <td width="588" class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo"><%=titulo%></td>
          <%
          //System.out.println(session.getAttribute("permiso"));
            if ( session.getAttribute("permiso")!=null && 
                (
                  session.getAttribute("permiso").equals("ADMINISTRACION") ||
                  session.getAttribute("permiso").equals("AUTORIZACION INSTRUCCIONES") ||
                  session.getAttribute("permiso").equals("LIBERA INSTRUCCIONES")
                )    
               ) {      
          %>
          <tr> 
            <td align="center" valign="top"> 
              <%
  switch(menu)
					{
					case 1://menu principal Autorizaci?n/Rechazo de Cuentas SPEI
            if (session.getAttribute("permiso").equals("ADMINISTRACION")) {
          %>
            <jsp:include page="FI_AutorizacionCuentaFideicomiso.jsp" />
          <%
            } else {
              out.print("<tr>"); 
              out.print("<td align=\"center\" class=\"alerta\">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci?n<br></td>");
              out.print("</tr>");          
            }          
            break;
            
					case 2://menu principal Bandeja de Entrada
            if (session.getAttribute("permiso").equals("AUTORIZACION INSTRUCCIONES") || session.getAttribute("permiso").equals("LIBERA INSTRUCCIONES")) {
               %>  
              <jsp:include page="FI_BandejaEntrada.jsp"/>
              <%
            } else {
              out.print("<tr>"); 
              out.print("<td align=\"center\" class=\"alerta\">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci?n<br></td>");
              out.print("</tr>");          
            }
          break;

					case 3: //Submenu Alta de Autorizaci?n/Rechazo de Cuentas SPEI
            if (session.getAttribute("permiso").equals("ADMINISTRACION")) {
            %>
              <jsp:include page="FI_CuentaBancariaModificar.jsp" />
            <%
            } else {
              out.print("<tr>"); 
              out.print("<td align=\"center\" class=\"alerta\">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci?n<br></td>");
              out.print("</tr>");          
            }
					break;
              
					case 4://submenu de la Bandeja de Entrada
             %>  
            <jsp:include page="confirmarInstruccion.jsp"/>
            <%	
            break;
              
					case 5: //Submenu Asinar/Quitar Fideicomiso de Autorizaci?n/Rechazo de Cuentas SPEI
            %>
              <jsp:include page="FI_CuentaBancariaAsignarFideicomiso.jsp" />
            <%
							break;
          case 6: //Menu principal Contabilizar o Rechazar Instrucciones
            if (((String)session.getAttribute("permiso")).equalsIgnoreCase("LIBERA INSTRUCCIONES")) {
            %>
              <jsp:include page="FI_ContabilizaRechazaInstrucc.jsp" />
            <%
            } else {
              out.print("<tr>"); 
              out.print("<td align=\"center\" class=\"alerta\">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci?n<br></td>");
              out.print("</tr>");          
            }
              break; 
          case 7: //Menu principal Contabilizar o Rechazar Instrucciones
            if (((String)session.getAttribute("permiso")).equalsIgnoreCase("LIBERA INSTRUCCIONES")) {
            %>
              <jsp:include page="FI_CharolaOperacionesRelevantes.jsp" />
            <%
            } else {
              out.print("<tr>"); 
              out.print("<td align=\"center\" class=\"alerta\">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci?n<br></td>");
              out.print("</tr>");          
            }
              break;         
          case 8: //Menu principal Instrucciones no monetarias
            if (((String)session.getAttribute("permiso")).equalsIgnoreCase("LIBERA INSTRUCCIONES")) {
            %>
              <jsp:include page="FI_CharolaInstruccionesNoMonetarias.jsp" />
            <%
            } else {
              out.print("<tr>"); 
              out.print("<td align=\"center\" class=\"alerta\">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci?n<br></td>");
              out.print("</tr>");          
            }
              break; 
          case 9: //Menu principal Contabilizar o Rechazar Instrucciones
            if (((String)session.getAttribute("permiso")).equalsIgnoreCase("LIBERA INSTRUCCIONES")) {
            %>
              <jsp:include page="FI_CharolaOperacionesInternasSospechosas.jsp" />
            <%
            } else {
              out.print("<tr>"); 
              out.print("<td align=\"center\" class=\"alerta\">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci?n<br></td>");
              out.print("</tr>");          
            }
              break; 
          case 10: //Consulta operaciones pld
            if (((String)session.getAttribute("permiso")).equalsIgnoreCase("LIBERA INSTRUCCIONES")) {
            %>
              <jsp:include page="FI_CharolaInstruccionesConsulta.jsp" />
            <%
            } else {
              out.print("<tr>"); 
              out.print("<td align=\"center\" class=\"alerta\">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci?n<br></td>");
              out.print("</tr>");          
            }
              break;               

            case 11://submenu de la Bandeja de Entrada
             %>  
            <jsp:include page="confirmarInstruccionPLD.jsp"/>
            <%	
            break;
          default:
            %>          
              <jsp:include page="mensajeOperacion.jsp" />
            <%
            break;
					}	
            %>
            </td>
          </tr>
        <%
         } else {
        %>
          <tr> 
          <td align="center" class="alerta">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci?n<br></td>
          </tr>
        <%          
          }
        %>           
        </table>
        </TD>
    </TR>
    <TR> 
      <TD bgColor=#ffffff colSpan=2 height=1> </TR>
  </TBODY>
</TABLE>
</BODY>
<%
} catch (Exception e) {
e.printStackTrace();
}
%>
</HTML>