<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="shortcut icon" href="https://i.ibb.co/FzxxWTL/BDLY-ico.png"
	type="image/x-icon">
<title>Bitte Dans Les Youx</title>
<!-- Incluimos los archivos CSS de Bootstrap -->	
<link rel="stylesheet" href="../resources/bootstrap.min.css">
<link rel="stylesheet" href="../resources/style.css">
<link rel="stylesheet" href="../resources/contcor.css">
<!-- <link rel="stylesheet" href="css/Style.css"> -->
</head>
<body style="background-color: Lavender;" id="bodycontacto">

<jsp:include page="navbar.jsp"></jsp:include>

<form:form class="was-validated" id="contacto" action="creacontacto" method="POST"  modelAttribute="contacto">
<form:hidden path="idContacto" />

	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col-sm-6 text-center">
				<h1 class="text-center">Formulario de Contacto</h1>
			</div>
			<div class="col"></div>
		</div>
		<div class="row">
			<div class="col"></div>
			<div class="col-sm-6 text-center">
				<div class="form-group">
			    <label for="nombre">Nombre de Contacto</label>
			    <form:input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" required="true" path="contacName" />
			    <div class="invalid-feedback">Favor ingrese nombre o nombres</div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="email">Correo Electrónico</label>
			    <form:input type="email" class="form-control" id="email" name="email" placeholder="Correo Electrónico" required="true" path="email" />
			    <div class="invalid-feedback">Ingrese un correo electronico valido</div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="email">Telefono</label>
			    <form:input type="number" class="form-control" id="phone" name="phone" placeholder="telefono de contacto" required="true" path="telefono"/>
			    <div class="invalid-feedback">Favor ingrese telefono de contacto</div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			  <div class="form-group">
			    <label for="mensaje">Mensaje</label>
			    <form:textarea class="form-control" id="mensaje" name="mensaje" rows="5" placeholder="mensaje" required="true" path="mensaje"></form:textarea>
			    <div class="invalid-feedback">Favor escriba el mensaje</div> <!-- Aquí se mostrará el mensaje de error -->
			  </div>
			</div>
			<div class="col"></div>
		</div>
		<div class="row">
			<div class="col"></div>
			<div class="col-sm-6 text-center">
				<br>
			  
		  	 	<button type="submit" class="btn btn-primary">Enviar</button>
			</div>
			<div class="col"></div>
		</div>	
	</div>	<!-- <--fin de contenedor -->
</form:form>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>
<script src="../resources/js/enviarcontacto.js"></script>
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
