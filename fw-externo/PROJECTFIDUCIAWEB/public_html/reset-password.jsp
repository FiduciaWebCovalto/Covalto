<!DOCTYPE html>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
    <head>
        <meta content="text/html;" http-equiv="content-type" charset="utf-8"/>
        <title>FiduciaWeb Movil - Cambio de Contraseña</title>
        <link rel="stylesheet" type="text/css" href="styles/bancomext.css"/>
        <script type="text/javascript" src='scripts/general.js'></script>
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
    <body   class="bg-light">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        
        <table>
        <tr align="center"><td><div class="titleContainer"><IMG src="imagenes/logo.jpg"
                                  height="106" width="200"/></div>
        </td></tr>
        <tr><td>
    <form id="cambio">
        <div class="card text-center" style="width: 300px;">
        <div class="card-header h5 text-white bg-primary">Reestablecer Contrase&ntilde;a</div>
        <div class="card-body px-5">

            <div data-mdb-input-init class="form-outline">
                <input type="text" id="codigo" class="form-control my-3" required/>
                <label class="form-label" for="codigo">Codigo Enviado</label>
            </div>
            <div data-mdb-input-init class="form-outline">
                <input type="password" class="form-control" name="password" id="password" placeholder="********" required>
                <label class="form-label" for="password">Nueva Contrase&ntilde;a</label>
            </div>
            <!-- Fin Mensajes de Verificación -->
            <div class="d-grid gap-2">
            <button type="submit" id="cambio" class="btn btn-primary">Cambiar Contrase&ntilde;a</button>
            <script src="scripts/cambio.js"></script>
            
            <p id="message"></p>
            </div>
            <div class="d-flex justify-content-between mt-4">
            <a class="" href="login.jsp">Login</a>
            
        </div>            
        </div>
        </div>

    </form>
        
        </td></tr></table>
    
    </body>
</html>