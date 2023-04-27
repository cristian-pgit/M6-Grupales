<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<link rel="stylesheet" href="resources/bootstrap.min.css">
<link rel="stylesheet" href="resources/style.css">
<!-- <link rel="stylesheet" href="css/Style.css"> -->


<title>Formulario de Contacto</title>
<!-- Incluimos los archivos CSS de Bootstrap -->
</head>

<jsp:include page="navbar.jsp"></jsp:include>
	
	
	<body style="background-color: Lavender;" id="bodycontacto">
	<div class="container">
			<h1 class="text-center">Formulario de Contacto</h1>
			
			
  		<form class="was-validated" id="contacto" action="enviarMsg" method="POST" >
			  <div class="form-group">
			    <label for="nombre">Nombre de Contacto</label>
			    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" required>
			    <div class="invalid-feedback">Favor ingrese nombre o nombres</div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="asunto">Apellido</label>
			    <input type="text" class="form-control" id="apellido" name="asunto" placeholder="apellido" required>
			    <div class="invalid-feedback">Favor ingrese nombre o apellidos</div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="email">Correo Electrónico</label>
			    <input type="email" class="form-control" id="email" name="email" placeholder="Correo Electrónico" required>
			    <div class="invalid-feedback">Ingrese un correo electronico valido</div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="email">telefono</label>
			    <input type="number" class="form-control" id="phone" name="phone" placeholder="telefono de contacto" required>
			    <div class="invalid-feedback">Favor ingrese telefono de contacto</div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="mensaje">Mensaje</label>
			    <textarea class="form-control" id="mensaje" name="mensaje" rows="5" placeholder="Mensaje" required></textarea>
			    <div class="invalid-feedback">Favor escriba el mensaje</div> <!-- Aquí se mostrará el mensaje de error -->
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
