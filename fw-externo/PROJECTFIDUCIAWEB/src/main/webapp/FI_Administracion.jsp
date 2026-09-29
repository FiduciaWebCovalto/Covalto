<!doctype html>
<!--FI_Administracion.jsp-->
<%@ page %>
<jsp:useBean id="BD" class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="Sesion.jsp" %>
<%
try {
int menu=Integer.parseInt(request.getParameter("menu")!=null?request.getParameter("menu").trim():"0");
String titulo="ADMINISTRACION";
//String fecha=BD.getFecha();
int regBitacora=0;
/*
menu=1;Administraci�n
menu=2;Operaci�n
*/
switch(menu)
					{
					case 1:
							titulo="Administracion de Usuarios";
							break;
					case 2:
							titulo="Modificacion de los datos del usuario";
							break;
					case 3:
							titulo="Alta del usuario";
							break;
					case 4:
							titulo="Asignar Fideicomiso al usuario";
							break;
					case 5:
							titulo="Asignar Fideicomiso al usuario";
							break;   
              
					case 10:
							titulo="Administracion de Conceptos";
							break;  
					case 11:
							titulo="Asignacion de Conceptos a Fideicomiso";
							break;   
					case 12:
							titulo="Usuarios Asignados a Fideicomiso";
							break;               
					
          case 100:
							titulo="Personalizaci�n de Encuesta";
							break;              
					case 101:
							titulo="Alta de Encuesta";
							break;
          case 102:
							titulo="Modificaci�n de los datos de la Encuesta";
							break;             
          case 103:
							titulo="Asignaci�n de Opciones a la Encuesta";
							break;
              
          case 104:
							titulo="Personalizaci�n de Opciones";
							break;               
          case 105:
							titulo="Alta de Opciones";
							break;
          case 106:
							titulo="Modificaci�n de Opciones";
							break;           
              
					default:
							titulo="ADMINISTRACION";
              
							break;	
					}//switch(menu)
%>
<HTML>
<HEAD><TITLE><%=titulo%> - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
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

</HEAD>
<body class="bg-light">
<jsp:include page="header.jsp"/>
  <jsp:include page="MenuAdmon.jsp"/>

<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%">
  <TBODY>
    <TR > 
      <TD valign="top" align="center">
        
    <table width="80%" border="0"> 
          <tr> 
            <td width="588" class="texto">&nbsp;</td>
          </tr>
          <tr> 
            <td height="50" align="center" background="imagenes/tit_Fondo.jpg" bgcolor="#000000" class="titulo"><%=titulo%></td>
          </tr>
          <%
            if ((session.getAttribute("permiso")!=null && !((String)session.getAttribute("permiso")).equals("ADMINISTRACION"))) {          
            menu=0;
          %>
          <tr> 
          <td align="center" class="alerta">Operaci&oacute;n no Autorizada<br>No cuentas con los permisos, para esta operaci�n<br></td>
          </tr>
          <%          
          } else if(menu!=0) {              
          %>
          <tr> 
            <td align="center" valign="top"> 
              <%
        switch(menu)
					{
					case 1://menu principal Administraci�n-Usuario   
          %>
            <jsp:include page="FI_Usuario.jsp" />
          <%
            break;
            
					case 2://menu principal Operaci�n cuentas TEF y SPEI
             %>  
            <jsp:include page="FI_UsuarioModificar.jsp"/>
            <%	
            break;
          
          case 3://submenu de FI_Usuario.jsp
            %>  
            <jsp:include page="FI_UsuarioAlta.jsp"/>
            <%	
            break;

          case 4://submenu de FI_Usuario.jsp
            %>  
            <jsp:include page="FI_UsuarioAsigna.jsp"/>
            <%	
            break;
            
          case 5://submenu de FI_Usuario.jsp
            %>  
            <jsp:include page="FI_UsuarioFideicomiso.jsp"/>
            <%	
            break;            
            
          case 10://submenu de menuAdministracion.jsp
            %>  
            <jsp:include page="FI_AdministracionConceptos.jsp"/>
            <%	
            break;

          case 11://submenu de FI_AdministracionConceptos.jsp
            %>  
            <jsp:include page="FI_ConceptosAsignacion.jsp"/>
            <%	
            break;
            
          case 12://submenu de FI_AdministracionConceptos.jsp
            %>  
            <jsp:include page="FI_UsuariosAsignados.jsp"/>
            <%	
            break;            



          default:
            %>          
            <jsp:include page="mensajeAdministracion.jsp" />
            <%
            break;
					}//fin switch
            %>
            </td>
          </tr>
        <%
         }//fin else           
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