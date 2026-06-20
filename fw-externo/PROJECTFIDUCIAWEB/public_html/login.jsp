<!doctype html>
<!--
/*
@Autor:Inscitech
@Creado: Junio 2008
*/
-->
<html>
    <head>
        <meta content="text/html;" http-equiv="content-type" charset="utf-8"/>
        <title>FiduciaWeb Movil - Identificaci&oacute;n del usuario</title>
        <link rel="stylesheet" type="text/css" href="styles/bancomext.css"/>
        <script type="text/javascript" src='scripts/general.js'></script>
        <script  language="JavaScript" >
        window.API_BASE_URL = "<%= application.getInitParameter("apiBaseUrl") %>";
        </script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>         
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>        
        <style>
        body {
            background-color: #f8f9fa;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .card-login {
            width: 100%;
            max-width: 400px;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0,0,0,0.1);
        }
    </style>
    </head>
    <body  class="bg-light">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        
        <table>
        <tr align="center"><td><div class="titleContainer"><IMG src="imagenes/logo.jpg"
                                  height="106" width="200"/></div>
        </td></tr>
        <tr><td>
                            <div class="card card-login bg-white">
                            <div class="card-body">
                            <h3 class="text-center mb-4">Iniciar Sesion</h3>
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
                            <script src="scripts/login.js"></script>
                            
                            <p id="message"></p>
                            </div>
                            
                            <div class="mt-3 text-center">
                            <a href="solicitudpassword.jsp" class="text-decoration-none" style="color: white;">Olvidaste tu Contrase&ntilde;a?</a>
                            </div>
                            <div class="mt-3 text-center">
                            <a href="reset-password.jsp" class="text-decoration-none" style="color: white;">Cambio de Contrase&ntilde;a</a>
                            </div>                            
                            </form>
                            </div>
                            </div>
            </td></tr></table>

    </body>
</html>