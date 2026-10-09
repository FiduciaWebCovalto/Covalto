<%@ page contentType="text/html;charset=ISO-8859-1"
         import="mx.com.inscitech.fiducia.common.beans.UsersInformation,
         mx.com.inscitech.fiducia.services.ConfigLoader"
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Servicios Fiduciarios</title>
    
    <script type="text/javascript">
      <!--
        var aMenuBar = null;
        var userInfo = <%=net.sf.json.JSONObject.fromObject(session.getAttribute("userInfo"))%>;
        var ctxRoot = "<%=request.getContextPath()%>";   
        //console.log("ctxRoot "+ctxRoot);
        var ctxFeccont = ' <%=session.getAttribute("fechaContable") %>';
        console.log("FechaCont "+ctxFeccont)
        var OLbubbleImageDir = ctxRoot + "/js/overlibmws/";
      //-->
    </script>
    <link type="text/css" rel="stylesheet" href="css/ayuda.css" />
    <link type="text/css" rel="stylesheet" href="css/fiducia_general.css" />
    <link type="text/css" rel="stylesheet" href="css/dhtmlXMenu.css" />
    <link type="text/css" rel="stylesheet" href="css/dhtmlXMenu_xp.css" />
    <link type="text/css" rel="stylesheet" href="js/calendar/calendario.css" />
    <link type="text/css" rel="stylesheet" href="js/calendarExtended/css/border-radius.css" />
    <link type="text/css" rel="stylesheet" href="js/calendarExtended/css/extras.css" />
    <link type="text/css" rel="stylesheet" href="css/font/bootstrap-icons.css" />
    <link id="skinhelper-Normal"  type="text/css" rel="stylesheet" href="js/calendarExtended/css/jscal2.css" />  
    <link id="skinhelper-Minis"   type="text/css" rel="" href="js/calendarExtended/css/jscal2Minis.css" />
    <link id="skinhelper-compact" type="text/css" rel="stylesheet" href="js/calendarExtended/css/reduce-spacing.css" />

    <link type="text/css" rel="stylesheet" href="modules/Administracion/Agenda/feederEventos/feederEventos.css" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script> 
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js"></script>
    <!--script type="text/javascript" src="js/menu.jsp"></script-->
<style>
        .sidebar {
            height: 100vh;
            background-color: #0d6efd; /* Color azul bootstrap */
            padding-top: 20px;
        }
        .sidebar a {
            color: rgba(255, 255, 255, 0.85);
            text-decoration: none;
            display: block;
            padding: 10px 15px;
        }
        .sidebar a:hover {
            color: #fff;
            background-color: rgba(255, 255, 255, 0.1);
        }
        .dropdown-toggle::after {
            float: right;
            margin-top: 10px;
        }
        /* Bot�n de Salir Fijo en la parte inferior */
        .logout-container {
            position: absolute;
            bottom: 20px;
            width: 100%;
            padding: 0 20px;
        }
        /* Barra superior fija */
        .header-fixed {
            position: fixed;
            top: 0;
            left: 250px; /* Ancho del sidebar */
            width: calc(100% - 250px);
            z-index: 1000;
            background-color: #ffffff;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            transition: all 0.3s ease;
        }
        
        /* Ajuste para que el cuerpo ocupe toda la pantalla y el footer quede abajo */
        html, body {
            height: 100%;
            margin: 0;
        }

        /* Espaciado para evitar que el contenido se tape con el Header y el Footer fijos */
        body {
            padding-top: 70px; /* Ajusta seg�n la altura de tu div superior */
            padding-bottom: 60px; /* Ajusta seg�n la altura del footer */
            display: flex;
            flex-direction: column;
        }        
        
        /* Estilos visuales para los ejemplos */
        .header-top { height: 60px; background-color: #343a40; color: white; }
        .main-content { padding: 20px; overflow-y: auto; }
        .message-float { position: fixed; bottom: 80px; right: 20px; z-index: 200; width: 50px;height: 50px; }
        .footer { height: 50px; background-color: #e9ecef; }    
        
        /* Contenedor principal: siempre en la esquina inferior derecha */
        #contenedor-flotante {
            position: fixed;
            bottom: 20px;
            right: 20px;
            z-index: 9999; /* Asegura que est� por encima de otros elementos */
            font-family: Arial, sans-serif;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
            border-radius: 8px;
            overflow: hidden;
            background-color: white;
            transition: all 0.3s ease;
        }

        /* Cabecera (T�tulo y bot�n de minimizar) */
        .cabecera-flotante {
            background-color: #007bff;
            color: white;
            padding: 10px 15px;
            display: flex;
            height: 150px;
            width: 350px;
            justify-content: space-between;
            align-items: center;
            cursor: pointer;
        }

        .cabecera-flotante h3 {
            margin: 0;
            font-size: 16px;
        }

        .btn-minimizar {
            background: none;
            border: none;
            color: white;
            font-size: 20px;
            cursor: pointer;
        }

        /* Contenido (La tabla) */
        .contenido-flotante {
            padding: 15px;
            width:350px;
            height:250px;
            max-height: 350px; /* Altura m�xima para cuando est� expandido */
            overflow-y: auto;  /* Permite scroll si la tabla es muy grande */
            transition: all 0.3s ease;
        }
        
        /* Clase modificadora para minimizar */
        #contenedor-flotante.minimizado .contenido-flotante {
            display: none; /* Oculta la tabla */
        }
        
        #contenedor-flotante.minimizado .btn-minimizar::before {
            content: "+"; /* Cambia el �cono a expandir */
        }
        
        #contenedor-flotante:not(.minimizado) .btn-minimizar::before {
            content: "-"; /* Muestra el �cono de minimizar */
        }
        
        /* Estilos personalizados para el men� lateral azul */
        .sidebar {
            width: 280px;
            height: 100vh;
            background-color: #0d3b66; /* Azul oscuro corporativo */
            position: fixed;
            top: 0;
            left: 0;
            padding-top: 20px;
            color: white;
            transition: all 0.3s ease;
            overflow-y: auto;
        }

        .sidebar .nav-link {
            color: rgba(255, 255, 255, 0.8);
            padding: 12px 20px;
            display: flex;
            align-items: center;
            text-decoration: none;
            transition: all 0.2s;
        }

        .sidebar .nav-link:hover {
            background-color: rgba(255, 255, 255, 0.1);
            color: #fff;
        }

        /* Estilos para los desplegables (submen�s) */
        .sidebar .submenu {
            padding-left: 20px;
            background-color: rgba(0, 0, 0, 0.1);
        }

        .sidebar .nav-link i {
            width: 25px; /* Alineaci�n de los iconos */
            text-align: center;
            margin-right: 10px;
        }

        /* Ajuste de contenido principal para que no quede debajo del men� */
        .main-content {
            margin-left: 280px;
            padding: 40px;
        }
        
        
        /*CONTENEDOR PARA AGENDA*/
        /* Contenedor principal flotante */
  .tabla-flotante {
    position: fixed;
    bottom: 20px;
    right: 20px;
    z-index: 9999;
    background: #ffffff;
    border: 1px solid #ccc;
    border-radius: 8px;
    box-shadow: 0 4px 12px rgba(0,0,0,0.15);
    font-family: Arial, sans-serif;
    transition: all 0.3s ease;
    width: 350px;
  }
   /* Cabecera con t�tulo y bot�n de minimizar */
  .tabla-header {
    display: flex;
    justify-content: space-between;
    align-items: center;
    background-color: #007bff;
    color: white;
    padding: 10px 15px;
    border-top-left-radius: 7px;
    border-top-right-radius: 7px;
    cursor: pointer;
  }
  .tabla-header h3 {
    margin: 0;
    font-size: 16px;
  }
  .btn-minimizar {
    background: none;
    border: none;
    color: white;
    font-size: 20px;
    cursor: pointer;
    font-weight: bold;
  }

  /* Contenedor del scroll (oculto al minimizar) */
  .tabla-contenido {
    max-height: 200px; /* Controla el scroll vertical */
    overflow-y: auto;
    overflow-x: auto;
    transition: max-height 0.3s ease;
  }
  /* Clase utilitaria para minimizar */
  .minimizado .tabla-contenido {
    max-height: 0;
    overflow: hidden;
  }
  
  /*reporteador dinamico*/
/* Contenedor que fuerza el scroll horizontal y vertical */
        .contenedor-scroll {
            max-height: 250px; /* Altura m�xima para el scroll vertical */
            overflow-y: auto;  /* Scroll vertical autom�tico */
            overflow-x: auto;  /* Scroll horizontal autom�tico */
            border: 1px solid #dee2e6;
        }

        /* Fijar la cabecera al hacer scroll vertical */
        .contenedor-scroll th {
            position: sticky;
            top: 0;
            background-color: #f8f9fa; /* Color de fondo para que no sea transparente */
            z-index: 1;
        }  
    </style>

    <script type="text/javascript" src="js/JSON.js"></script>
    <script src="js/xlsx.full.min.js"></script>
	<script>
        window.API_BASE_URL = "<%= ConfigLoader.getApiBaseUrl() %>";

        if (!localStorage.getItem('token')) {
            window.location.href = 'login.jsp'; // Redirigir si no hay token
        }
    </script>
        <%
        // Simulamos una variable de sesi�n en Java
        String valorJavaFechaContableSis =  session.getAttribute("fechaContable")!=null?
        (String)session.getAttribute("fechaContable"):"";
        %>
  </head>
  
  <body class="d-flex flex-column min-vh-100 bg-light">
    
    <script type="text/javascript" src="https://cdn.sheetjs.com/xlsx-0.20.3/package/dist/xlsx.full.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js" integrity="sha384-G/EV+4j2dNv+tEPo3++6LCgdCROaejBqfUeNjuKAiuXbjrxilcCdDz6ZAVfHWe1Y" crossorigin="anonymous"></script>            
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>     
    
        <script type="text/javascript" src="js/operacion.js" charset="iso-8859-1"></script>
    <!--script src="js/reportedinamico.js"></script-->
    <script type="text/javascript" src="js/cross_browser_support.js" charset="iso-8859-1"></script>
    <script type="text/javascript" src="js/generic_functions.js" charset="iso-8859-1"></script>
    <script type="text/javascript" src="js/formValidator.js" charset="iso-8859-1"></script>
    <script type="text/javascript" src="js/keyHandler.js" charset="iso-8859-1"></script>
    <script type="text/javascript" src="js/overlibmws/overlibmws.js"></script>    
    <script type="text/javascript" src="js/overlibmws/overlibmws_bubble.js"></script>
    <script type="text/javascript" src="js/overlibmws/overlibmws_filter.js"></script>
    
    <script type="text/javascript" src="js/calendarExtended/jscal2.js"></script>
    <script type="text/javascript" src="js/calendarExtended/lang/es.js"></script>
    
    <script type="text/javascript" src="js/calendar/calendar.js"></script>
    <script type="text/javascript" src="js/calendar/lang/calendar-ES.js"></script>   
    <script type="text/javascript" src="js/calendar/calendar-setup.js"></script>
    
    <script type="text/javascript" src="js/catalogos.js"></script>
    <script type="text/javascript" src="js/menu//dhtmlXProtobar.js"></script>
    <script type="text/javascript" src="js/menu/dhtmlXMenuBar.js"></script>
    <script type="text/javascript" src="js/menu/dhtmlXCommon.js"></script>
    <script type="text/javascript" src="js/menu.jsp"></script>
    <script type="text/javascript" src="js/funciones_cliente.js"></script>
    <script type="text/javascript" src="js/handling_objects_functions.js"></script>
    
    <!-- feeder eventos -->
    <script type="text/javascript" src="js/feederEventos.js"></script> 
    
    <!-- toplink -->
    <script src="js/toplink.js" type="text/javascript"></script>
    
    <div class="header-top fixed-top d-flex justify-content-between align-items-center px-4">
        <div class="fw-bold fs-4">FIDUCIAWEB</div>
        <div id="dvFechaContableSistema"></div>
        <a href="ssologoff.jsp" class="btn btn-outline-danger btn-sm">
            <i class="fas fa-sign-out-alt me-1"></i> Salir
        </a>
    </div>

    <!-- Widget Flotante -->
    <div id="asistente-widget">
        <div class="widget-header" onclick="toggleWidget()">
            <span>? Asistente de Ayuda</span>
            <button class="btn-min" id="btn-minimizador">?</button>
        </div>
        <div class="widget-content" id="widget-body">
            <p>Di tu palabra clave:</p>
            <div style="display: flex; gap: 10px; align-items: center;">
                <button class="btn-mic" id="btn-voz" onclick="iniciarVoz()">?</button>
                <span id="texto-escuchado" style="font-style: italic; color: #555;">Presiona y habla...</span>
            </div>
            <div id="resultados-busqueda" style="margin-top: 15px; max-height: 200px; overflow-y: auto;">
                <!-- Aqu� se cargar�n los resultados -->
            </div>
        </div>
    </div>
    <script type="text/javascript" src="js/ayuda.js"></script>
    <div class="container-fluid  flex-grow-1 d-flex p-0">
            <!-- Men� Lateral -->
            <div class="sidebar d-flex flex-column flex-shrink-0">
                <hr>
                <ul class="nav nav-pills flex-column mb-auto" id="menu-contenedor">
                    <!-- El men� se generar� din�micamente con JavaScript -->
                </ul>
            </div>
    
            <!-- Contenido Principal -->
            <div id="dvPantalla" class="main-content">
                <div class="container-fluid">
                    <div class="card p-4">
                        <h3>Bienvenido al Sistema</h3>
                        <h4><div id="dvNomUsuario"></div></h4>
                        <p>Navegue a trav�s de las opciones del men� lateral izquierdo.</p>
                    </div>
                </div>
            </div>
    </div>

    <!-- Estructura del componente -->
    <div class="tabla-flotante" id="contenedorTabla">
      <div class="tabla-header" onclick="toggleTabla()">
        <h3>Agenda</h3>
        <button class="btn-minimizar" id="btnMinimizar">?</button>
      </div>
      
      <div class="tabla-contenido" id="dvFeeder">
      </div>
    </div> 
    
    <footer id="footer" class="footer fixed-bottom d-flex align-items-center justify-content-center">
        <p class="mb-0 text-muted"><jsp:include page="footer.jsp"/></p>
    </footer>    
    <!-- Bootstrap JS -->
    <script src="js/app.js"></script>
    <div id="dvMensajes" style="position: absolute; top: 0; left: 0;"></div>
    <a id="linkReporteNew" href="#" target="_new" style="visibility:hidden;position: absolute; top: 0; left: 0;" >Archivo</a>
    <a id="excelTestLnk" href="multiSheetExcel.do" target="_new" style="visibility:hidden;position: absolute; top: 0; left: 0;" >ArchivoXLS</a>
   
  </body>
</html>
 <script>
        
    // 1. Obtener el valor de localStorage
    const NombreUsuario = localStorage.getItem('nomusuario');
    const FechaContableSistema="Fecha Contable: "+"<%= valorJavaFechaContableSis %>";
    // 2. Seleccionar el div donde queremos colocar el texto
    const contenedorUsuario = document.getElementById('dvNomUsuario');
    const contenederFechaContable= document.getElementById('dvFechaContableSistema');
    if (NombreUsuario) {
        contenedorUsuario.textContent = NombreUsuario;
    } else {
        contenedorUsuario.textContent = "Usuario sin nombre";
    }
 
     if (FechaContableSistema) {
        contenederFechaContable.textContent = FechaContableSistema;
    } else {
        contenederFechaContable.textContent = "Sin Fecha Contable";
    }
    
function toggleTabla() {
    const contenedor = document.getElementById('contenedorTabla');
    const btn = document.getElementById('btnMinimizar');
    
    contenedor.classList.toggle('minimizado');
    
    // Cambia el icono del bot�n dependiendo del estado
    if (contenedor.classList.contains('minimizado')) {
      btn.textContent = '+';
    } else {
      btn.textContent = '?';
    }
  }
  
    function toggleMinimizar() {
            const contenedor = document.getElementById('contenedor-flotante');
            // Alterna (agrega o quita) la clase 'minimizado'
            contenedor.classList.toggle('minimizado');
        }
 
   /* function onButtonClick(itemId) {
      if(isDefinedAndNotNull(itemId) && itemId != "null") {
        var baseURL = ctxRoot + "/modules/";
        var url = baseURL + itemId.replace(".", "/");  
        while(url.indexOf(".") != -1) {
          url = url.replace(".", "/");
        }
        LDSCR(url + ".do", GI("dvContenido"), function() { LDJS(url + ".js"); } );
      }
    }*/    
    </script>
<script>

// accesos de hoy
  function accesosHoy()
  {
    var url = ctxRoot +"/getRef.do?json={\"id\":\"consultaUltimosAcceso\"}";
    makeAjaxRequest(url,"HTML",resAccesosHoy,null);
  }
  function resAccesosHoy(obj,result)
  {
    var res = JSON.parse(result);
    var accesos = eval(res[0].cuantos);
    if(accesos < 2)
      countEventosProx();
  }
  
// eventos pendientes
  function countEventosProx()
  {
    var url = ctxRoot + "/getRef.do?json={\"id\":\"consultaProximosEventos\"}";
    makeAjaxRequest(url,"HTML",resCountEventosProx,null);
  }
  function resCountEventosProx(obj,result)
  {
    var res = JSON.parse(result); 
    var pendientes = eval(res[0].cuantos);
    if(pendientes > 0)
      actualizaAcceso();
  }
  //envia correo
  function enviaCorreo(){
     var idLink = "linkReporteNew"; 
     var parametrosUrl = new Object;
     parametrosUrl.sendToJSP="true";
     parametrosUrl.urlReporte="/modules/Administracion/Agenda/EnviarCorreo.jsp"
     parametrosUrl.id="mandaCorreoPendientesAgenda";
    var url = ctxRoot + "/imprimirReporte.do?json=" +  encodeURIComponent(JSON.stringify(parametrosUrl));   
    var link = GI(idLink);
    link.href=url;
    window.open(url,GI("linkReporteNew").value,"width=450,height=205,scrollbars=NO");            
    document.onreadystatechange = function() { hideWaitLayer(); document.onreadystatechange = function() {} }
    hideWaitLayer();
  }
  //actualiza ultimo acceso
  function actualizaAcceso()
  {
    var url = ctxRoot+"/doRef.do?json={\"id\":\"actualizaUltimosAcceso\"}";
    makeAjaxRequest(url,"HTML",resActualizaAcceso,null)
  }
  function resActualizaAcceso(obj,result)
  {
    enviaCorreo();
  }
  getEventosFeeder();
  enviaCorreo();
  accesosHoy();
</script>