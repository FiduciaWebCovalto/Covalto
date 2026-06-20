<%@ page contentType="text/html;charset=ISO-8859-1"
    import="mx.com.inscitech.fiducia.common.beans.UsersInformation"
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Acceso no autorizado</title>
    
    <link rel="stylesheet" href="css/fiducia_operacion.css" type="text/css" />
    
    <link type="text/css" rel="stylesheet" href="css/fiducia_general.css" />
    <link type="text/css" rel="stylesheet" href="css/dhtmlXMenu.css" />
    <link type="text/css" rel="stylesheet" href="css/dhtmlXMenu_xp.css" />
    <link type="text/css" rel="stylesheet" href="js/calendar/calendario.css" />
    <link type="text/css" rel="stylesheet" href="js/calendarExtended/css/border-radius.css" />
    <link type="text/css" rel="stylesheet" href="js/calendarExtended/css/extras.css" />

    <link id="skinhelper-Normal"  type="text/css" rel="stylesheet" href="js/calendarExtended/css/jscal2.css" />  
    <link id="skinhelper-Minis"   type="text/css" rel="" href="js/calendarExtended/css/jscal2Minis.css" />
    <link id="skinhelper-compact" type="text/css" rel="stylesheet" href="js/calendarExtended/css/reduce-spacing.css" />
    
    <link type="text/css" rel="stylesheet" href="modules/Administracion/Agenda/feederEventos/feederEventos.css" />
  </head>
  
  <body vLink="#052206" leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" bgcolor="white"  background="./imagenes/fondo_fiduciaweb.jpg" style="background-repeat:no-repeat;background-size:cover;">
    
    <table id="tablaPrincipal" cellpadding="0" cellspacing="0" border="0" width="100%" height="100%" style="background-color:transparent;">
      <tr>
        <td rowspan="4">&nbsp;</td>
        <td id="tdHeader" height="40px">
          <!-- Header --><jsp:include page="header.jsp"/>
        </td>
        <td rowspan="4">&nbsp;</td>
      </tr>
      <tr>
        <td width="100%" nowrap align="center" >
          
          <table id="tablaContenido" cellpadding="0" cellspacing="0" border="0" width="100%" height="100%">
            <tr>  
              <td colspan="3" height="3px">
                &nbsp;<!-- Separador -->
              </td>
            </tr>
            <tr>
              <td width="15%">&nbsp;<!-- Separador --></td>
              <td valign="top" align="center">
              
                <!-- Contenido -->
                <div id="dvContenido">
                  <h1 class="titulo">Acceso no autorizado</h1>
                </div>
              </td>
              <td width="15%">&nbsp;<!-- Separador --></td>
            </tr>
            <tr>  
              <td colspan="3" height="3px">
                &nbsp; <!-- Separador -->
              </td>
            </tr>            
          </table>
        </td>
      </tr>
      <tr>
        <td height="16px">
          <!-- Footer --><jsp:include page="footer.jsp"/>
        </td>
      </tr>
    </table>
    
  </body>
</html>