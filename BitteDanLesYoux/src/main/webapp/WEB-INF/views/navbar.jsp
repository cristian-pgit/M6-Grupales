<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav id="navbar" class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
     <a class="navbar-brand" href="/BitteDanLesYoux/">
      <img src="https://i.ibb.co/xYzqC8n/BDLY-logo.png" alt="PDLY" width="30" height="24">
     </a>
	<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/BitteDanLesYoux/">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="contacto/nuevocontacto">Contacto</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Crear
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="capacitaciones/nuevacapa">Crear Capacitacion</a></li>
            <li><a class="dropdown-item d-none" href="#">Crear Usuario</a></li>
          </ul>
        </li>
        <li class="nav-item dropdown  d-none">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Editar
          </a>
          <ul class="dropdown-menu  d-none">
            <li><a class="dropdown-item d-none" href="#">Editar Capacitacion</a></li>
            <li><hr class="dropdown-divider d-none"></li>
            <li><a class="dropdown-item  d-none" href="#">Editar Cliente</a></li>
            <li><a class="dropdown-item  d-none" href="#">Editar Profesional</a></li>
            <li><a class="dropdown-item  d-none" href="#">Editar Administrativo</a></li>
          </ul>
        </li>
         <li class="nav-item dropdown "> 
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Listar
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item " href="capacitaciones/obtenercapacitaciones">Listar Capacitaciones</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item d-none" href="mostrarusuarios">Listar Usuarios</a></li>
            <li><a class="dropdown-item d-none" href="ListarClientes">Listar Clientes</a></li>
            <li><a class="dropdown-item d-none" href="ListarProfesionales">Listar Profesionales</a></li>
            <li><a class="dropdown-item d-none" href="ListarAdministrativos">Listar Administrativos</a></li>
          </ul>
        </li>
      </ul>
      <div class="collapse navbar-collapse" id="navbarNavDropdown">
				<div class="loginSector d-flex">
					<!-- Agregamos la clase ms-auto para mover el login a la derecha -->
					<%
					String username = (String) session.getAttribute("username");
					if (username != null) {
					%>
					<div class="d-flex ms-auto">
						<p class="nav-link text-info" id="texlogin">
							Welcome,&nbsp;<%=username%></p>
						<form action="#" method="POST">
							<button id="btnlogout" class="btn btn-outline-danger btn-sm" type="submit">Logout</button>
						</form>
					</div>
					<%
					} else {
					%>
					<form class="d-flex ms-auto" role="#" action="login" method="POST">
						<input id="userName" class="form-control me-2" type="text"
							name="username" placeholder="userName" aria-label="Username">
						<input id="pass" class="form-control me-2" type="password"
							name="password" placeholder="password" aria-label="Password">
						<button type="button" class="btn btn-outline-info center-text">Log-in</button>
					</form>
					<%
					}
					%>
				</div>
			</div>
    </div>
  </div>
</nav>