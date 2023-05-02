<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bitee Dans Les Youx</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp"
	crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="shortcut icon" href="https://i.ibb.co/FzxxWTL/BDLY-ico.png"
	type="image/x-icon">
<link rel="stylesheet" href="../resources/bootstrap.min.css">
<link rel="stylesheet" href="../resources/style.css">
</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>



	<div class="container">
		<br>
		<h1 class="text-center py-3">Listado de Capacitaciones</h1>
		<br>
		<div class="table-responsive">
			<table class="table table-hover">
			<thead>
				<tr>
					<th scope="col">ID de Capacitación</th>
					<th scope="col">Nombre de la Capacitacion</th>
					<th scope="col">RUT de Cliente</th>
					<th scope="col">Día</th>
					<th scope="col">Hora</th>
					<th scope="col">Lugar</th>
					<th scope="col">Duración</th>
					<th scope="col">Cantidad de Asistentes</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="capacit" items="${capacitaciones}">
					<tr >
						<td><c:out value="${capacit.idCapacitacion}" /></td>
						<td><c:out value="${capacit.nomCapa}" /></td>
						<td><c:out value="${capacit.rutCliente}" /></td>
						<td><c:out value="${capacit.dia}" /></td>
						<td><c:out value="${capacit.hora}" /></td>
						<td><c:out value="${capacit.lugar}" /></td>
						<td><c:out value="${capacit.duracion}" /></td>
						<td><c:out value="${capacit.cantAsis}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
		
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</body>
</html>