<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bitte Dans Les Youx</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="shortcut icon" href="https://i.ibb.co/FzxxWTL/BDLY-ico.png"
	type="image/x-icon">
<link rel="stylesheet" href="../resources/bootstrap.min.css">
<link rel="stylesheet" href="../resources/style.css">

</head>
<body id="cuerpocrear">
	<jsp:include page="navbar.jsp"></jsp:include>
	<%-- 	<c:if test="${sessionScope.userName == null}">
		<c:redirect url="/" />
	</c:if> --%>
<form:form action="crearcapa" class="was-validated"  method="post" modelAttribute="capacitacion">
	<form:hidden path="idCapacitacion" />
	<div class="container-fluid">
		<div class="row">
			<div class="col-3"></div>
			<div class="col-6 text-center">
				<br>
				<h1 class="h3 mb-3 fw-normal text-center">Crear capacitación</h1>
			</div>
			<div class="col-3"></div>
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-4">
					<div class="form-group col-md">
						<label class="text-center">Nueva Capacitacion:</label> 
					</div>
			</div>
			<div class="col-4">
				<div class="form-group col-md">
					<label class="text-center" for="nomCapa">Nombre de la Capacitacion:</label> 
					<form:input type="text" id="nomCapa" required="true" class="form-control" path="nomCapa" />
					<div class="invalid-feedback">Favor ingrese nombreCapacitacion</div>
				</div>
			</div>
			<div class="col-2"></div>
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-4">
				<div class="form-group col-md" >
					<label for="rutCliente">Rut de Cliente:</label> 
					<form:select	class="form-select" aria-label="select example"
						id="rutCliente" required="true" name="rutCliente" path="rutCliente">
						<form:option value="" disabled="true" selected="false" hidden="false">Selecciona un
							Rut de Cliente Existente</form:option>
						<c:forEach var="client" items="${clientes}">
							<form:option value="${client.rutCliente}"><c:out value="${client.nombres}" />&nbsp;
							<c:out value="${client.apellidos}" />&nbsp;-&nbsp;<c:out value="${client.rutCliente}" /></form:option>
						</c:forEach>
					</form:select>
					<div class="invalid-feedback">Favor seleccione un RUT</div>
				</div>
			</div>
			<div class="col-4">
				<div class="form-group col-md">
							<label for="dia">Día:</label> 
							<form:select class="form-select" aria-label="select example" id="dia" name="dia"
							required="true" path="dia">
								<option value="" disabled="true" selected="false" hidden="false">Selecciona un
									día</option>
								<form:option value="lunes">Lunes</form:option>
								<form:option value="martes">Martes</form:option>
								<form:option value="miercoles">Miércoles</form:option>
								<form:option value="jueves">Jueves</form:option>
								<form:option value="viernes">Viernes</form:option>
								<form:option value="sabado">Sábado</form:option>
								<form:option value="domingo">Domingo</form:option>
							</form:select>
							<div class="invalid-feedback">Favor seleccione un día</div>
					</div>
				
			</div>
			<div class="col-2"></div>
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-4">
				<div class="form-group col-md">
							<label class="text-center" for="hora">Ingrese Hora (xx:xx):</label> 
							<form:input type="time" required="true" class="form-control" id="hora" name="hora" 
								path="hora" pattern="^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$" />
							<div class="invalid-feedback">Favor ingrese una hora</div>
					</div>
			</div>
			<div class="col-4">
				<div class="form-group col-md">
							<label class="text-center" for="lugar">Ingrese Lugar:</label> 
							<form:input path="lugar" type="text" required="true" class="form-control" id="lugar" name="lugar"/>
							<div class="invalid-feedback">Favor ingrese una Locacion
								donde se impartira la Capacitacion</div>
					</div>
			</div>
			<div class="col-2"></div>
		</div>
		<div class="row">
			<div class="col-2"></div>
			<div class="col-4">
				<div class="form-group col-md">
							<label class="text-center" for="duracion">Duración:</label> 
							<form:select class="form-select" aria-label="select example"
								required="true" path="duracion" id="duracion" name="duracion">
								<option value="" disabled="true" selected="false" hidden="false">Selecciona
									duracion</option>
								<form:option value="30">30 minutos</form:option>
								<form:option value="60">1 Hora</form:option>
								<form:option value="90">1 Hora 30 minutos</form:option>
								<form:option value="120">2 Horas</form:option>
								<form:option value="150">2 Horas 30 minutos</form:option>
								<form:option value="180">3 Horas</form:option>
								<form:option value="210">3 Horas 30 Minutos</form:option>
								<form:option value="240">4 Horas</form:option>
							</form:select>
							<div class="invalid-feedback">Favor seleccione duracion</div>
					</div>
			</div>
			<div class="col-4">
				<div class="form-group col-md">
							<label class="text-center" for="cantAsist">Cantidad de
								Asistentes:</label> 
								<form:input type="number" class="form-control" id="cantAsist" 
								 name="cantAsist" required="true" path="cantAsis"/>
							<div class="invalid-feedback">Favor indique Cantidad de
								Asistentes esperados</div>
					</div>
			</div>
			<div class="col-2"></div>
		</div>
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4 text-center">
				<br>
						<form:button type="submit" class="btn btn-outline-success" id="save">Guardar</form:button>
					
			</div>
			<div class="col-4"></div>
		</div>
		</div>
</form:form>
			

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
	<script src="resources/js/crearcapareg.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</body>
</html>