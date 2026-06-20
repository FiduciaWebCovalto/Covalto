<link rel="stylesheet" href="styles/nuevomenu.css" type="text/css">
<script language="JavaScript" SRC='scripts/nuevomenu.js'></script>

<nav class="navbar navbar-expand-md bg-body-tertiary">
  <div class="container-xl">
    <a class="navbar-brand" href="#">
      <img src="imagenes/logo.jpg" alt="">
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="<%=((String)session.getAttribute( "totFid" )).equals("1")?"FI_Bienvenida":"FI_Fideicomiso"%>.jsp">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="FI_Instruccion13.jsp">Instrucciones No Monetarias</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Instrucciones
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="FI_Instruccion1.jsp">Depositos</a></li>
            <li><a class="dropdown-item" href="FI_Instruccion<%=(((String)session.getAttribute( "FOSEG" )).equals("S"))?"FS":""%>2.jsp">Retiros</a></li>
            <li><a class="dropdown-item" href="FI_Instruccion14.jsp">Inversion</a></li>
            <li><a class="dropdown-item" href="FI_Instruccion3.jsp">Traspaso</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Informacion Financiera
          </a>
          <ul class="dropdown-menu">
            <li class="nav-item">
              <a class="nav-link" href="FI_EdosF.jsp?edo=1">Estados de Cuenta</a>
            </li>
          </ul>
        </li>                
        <li class="nav-item">
          <a class="nav-link" href="salir.jsp">Salir</a>
        </li>
      </ul>
    </div>
  </div>
</nav>