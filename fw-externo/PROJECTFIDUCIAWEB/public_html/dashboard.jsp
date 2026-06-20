<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
</head>
<body>
    <h1>Bienvenido al sistema FiduciaWebMovil</h1>
    <button onclick="logout()">Cerrar Sesión</button>
    <script>
        // Verificación básica de sesión
        if (!localStorage.getItem('token')) {
            window.location.href = 'login.jsp'; // Redirigir si no hay token
        }
        else
        {
            window.location.href = 'index.jsp'; // Redirigir si no hay token
        }

    </script>
</body>
</html>