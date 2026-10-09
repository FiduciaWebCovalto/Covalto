<%@ page contentType="text/html;charset=ISO-8859-1"
        import="
            mx.com.inscitech.fiducia.common.services.ConfigurationService,
            mx.com.inscitech.fiducia.services.ConfigLoader
        "
%>
<%
String mensaje = request.getAttribute("Mensaje") == null ? "" : "" + request.getAttribute("Mensaje");

session.setMaxInactiveInterval(-1);// duración en segundos de la sesión (-1) = no tiene tiempo limite

String error = session.getAttribute("error") == null ? "" : "" + session.getAttribute("error");

if (request.getParameter("ssousername") != null && request.getParameter("password") != null) {
  session.setAttribute("username", request.getParameter("ssousername"));
  session.setAttribute("tipoCambio", request.getParameter("tipo"));
  session.setAttribute("password", request.getParameter("password"));
  session.setAttribute("password_pass", request.getParameter("password"));
}

if(session.getAttribute("userInfo") != null) {
  response.sendRedirect("principal.do");
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
        <meta http-equiv="Page-Exit" content="BlendTrans(Duration=1)"/>
        
        <title>Servicios Fiduciarios</title>
        
        <link rel="stylesheet" href="css/fiducia_general.css" type="text/css"/>
        <!-- JQUERY -->
        <script src="js/jquery/jquery.js" type="text/javascript"></script>
        <script src="js/jquery/draggable/jquery.ui.draggable.js" type="text/javascript"></script>
        <script src="js/jquery/jalert/alerts.js" type="text/javascript"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>    
    <script language="JavaScript" >
    // Se lee del contexto y se asigna a una variable JS
    window.API_BASE_URL = "<%= ConfigLoader.getApiBaseUrl() %>";
        function valida(){
                //valido el nombre
                if (document.logon.username.value.length==0){
                        alert("Introduzca el Usuario.")
                        document.logon.username.focus()
                        return 0;
                }
                

                if (document.logon.password.value.length==0){
                        alert("Introduzca la Contraseña.")
                        document.logon.password.focus()
                        return 0;
                }
                
                //el formulario se envia
                document.logon.submit();
        }    
    </script>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        
           
        <link href="js/jquery/jalert/alerts.css" rel="stylesheet" type="text/css" media="screen"/>
        
        <style type="text/css">
            a:visited { color: #052206; }
        </style>
     
    </head>
    <body class="loginBody">
     <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>            
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>     
       
        <script type="text/javascript">
            <!--
              var ctxRoot = "<%=request.getContextPath()%>";
            //-->
        </script>
        
        <table id="tablaPrincipal" cellpadding="0" cellspacing="0" border="0" width="100%" height="100%">
            <tr>
                <td rowspan="4">&nbsp;</td>
                <td id="tdHeader" height="40px">
                    <jsp:include page="header.jsp"/>
                </td>
                <td rowspan="4">&nbsp;</td>
            </tr>
             
            <tr height="91%">
                <td width="100%" nowrap="nowrap" align="center">
                    <table id="tablaContenido" cellpadding="0" cellspacing="0" border="0" width="100%" height="100%">
                        <tr>
                            <td colspan="3" height="3px">&nbsp;</td>
                        </tr>
                        <tr>
                            <td width="15%">&nbsp;</td>
                            <td valign="top" align="center">
                                <br/><br/><br/>
                                    <div class="card w-50 card-login" style="background-color: #002a5c; color: white;">
                                    <div class="card-body">
                                    <h3 class="text-center mb-4">SISTEMA FIDUCIAWEB - Iniciar Sesion</h3>
                                    <form id="frmLoginExterno">
                                    <!-- Campo de Email -->
                                    <div class="mb-3">
                                    <label for="lemail" class="form-label">Usuario</label>
                                    <input type="text" class="form-control  w-100" size=50  name="email" id="email" placeholder="Usuario" required>
                                    </div>
                                    
                                    <!-- Campo de Contraseña -->
                                    <div class="mb-3">
                                    <label for="password" class="form-label">Password</label>
                                    <input type="password" class="form-control" name="password" id="password" placeholder="********" required>
                                    </div>
                                    
                                    <!-- Botón de Ingreso -->
                                    <div class="d-grid gap-2">
                                    <button type="submit" class="btn btn-primary">Ingresar</button>
                                    <script src="js/login.js"></script>
                                    
                                    <p id="message"></p>
                                    </div>
                                    <div id="dvMensajesLogin" style="width:400px;">&nbsp;</div>
                                    <div class="mt-3 text-center">
                                    <a href="solicitudpassword.jsp" class="text-decoration-none" style="color: white;">Olvidaste tu Contrase&ntilde;a?</a>
                                    </div>
                                    <div class="mt-3 text-center">
                                    <a href="reset-password.jsp" class="text-decoration-none" style="color: white;">Cambio de Contrase&ntilde;a</a>
                                    </div>                            
                                    </form>
                                    </div>
                                    </div>
                            </td>
                            <td width="15%">&nbsp;</td>
                        </tr>
                        <tr>
                            <td colspan="3" height="3px">&nbsp;</td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td height="2%">
                    <jsp:include page="footer.jsp"/>
                </td>
            </tr>
        </table>
        <div id="dvMensajes" style="position: absolute; top: 0; left: 0;"></div>
        <div id="dialog" title="Basic dialog">
  <p>This is the default dialog which is useful for displaying information. The dialog window can be moved, resized and closed with the &apos;x&apos; icon.</p>
</div>
    </body>
</html>
<%
    ConfigurationService appConfig = ConfigurationService.getInstance();
    
    if(!ConfigurationService.isConfigLoadedOnce()) {
        appConfig.setConfigFilePath(session.getServletContext().getRealPath("/WEB-INF/config/fiduciario_config.xml"));
        appConfig.loadConfiguration();
    }
%>
