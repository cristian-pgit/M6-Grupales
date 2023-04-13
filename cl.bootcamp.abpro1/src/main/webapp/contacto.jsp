<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="shortcut icon" href="https://i.ibb.co/FzxxWTL/BDLY-ico.png"
	type="image/x-icon">
<link rel="stylesheet" href="Assets/style.css">
<!-- <link rel="stylesheet" href="css/Style.css"> -->


<title>Formulario de Contacto</title>
<!-- Incluimos los archivos CSS de Bootstrap -->
</head>

	<%@include file="navbar.jsp"%>
	<body style="background-color: Lavender;" id="bodycontacto">
	<div class="container">
			<h1 class="text-center">Formulario de Contacto</h1>
  		<form id="formContacto" method="POST" action="index.jsp">
			  <div class="form-group">
			    <label for="nombre">Nombre de Contacto</label>
			    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" required>
			    <div class="invalid-feedback"></div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="email">Correo Electrónico</label>
			    <input type="email" class="form-control" id="email" name="email" placeholder="Correo Electrónico" required>
			    <div class="invalid-feedback"></div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="asunto">Asunto</label>
			    <input type="text" class="form-control" id="asunto" name="asunto" placeholder="Asunto" required>
			    <div class="invalid-feedback"></div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="mensaje">Mensaje</label>
			    <textarea class="form-control" id="mensaje" name="mensaje" rows="5" placeholder="Mensaje" required></textarea>
			    <div class="invalid-feedback"></div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <br>
			  
		  	 <button type="submit" class="btn btn-primary">Enviar</button>
		  
	</form>
	</div>	

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>
<script src="js/validaFormContacto.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
	crossorigin="anonymous">
</script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<footer><%-- <%@include file="extras/footer.jsp"%> --%></footer>
</body>
</html>
