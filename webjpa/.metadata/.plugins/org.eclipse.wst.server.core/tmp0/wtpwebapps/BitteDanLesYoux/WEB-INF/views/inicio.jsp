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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="shortcut icon" href="https://i.ibb.co/FzxxWTL/BDLY-ico.png"
	type="image/x-icon">
<link rel="stylesheet" href="resources/bootstrap.min.css">
<link rel="stylesheet" href="resources/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />


<body id="body1">
	<jsp:include page="navbar.jsp"></jsp:include>

<div id="div1"><br></div>
<section class="hero" id="hero">
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <h1 class="mb-4">Empresa de Prevención de Riesgos</h1>
          <p class="lead mb-4">Nuestra empresa se especializa en la prevención de riesgos laborales. Ofrecemos servicios de asesoramiento y consultoría a empresas de todos los tamaños y sectores. Nos aseguramos de que su empresa cumpla con las normas y regulaciones de seguridad en el trabajo.</p>
          <a href="#" class="btn btn-primary">Más información</a>
        </div>
        <div class="col-md-6">
          <img src="resources/img/prev4.jpg" alt="Imagen de Prevención de Riesgos" class="img-fluid">
        </div>
      </div>
    </div>
  </section>
  <br><br>
  
  

<div class="card-group">
  <div class="card">
    <img src="resources/img/prev1.jpg" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">Detalle</h5>
      <p class="card-text"> • Levantamiento de condiciones de higiene y seguridad.<br>
						    • Diagnostico en prevención de riesgos laborales<br>
							• Asistir y apoyar en reunión de comité paritario de higiene y seguridad<br>
							• Confección de formulario Charla<br>
							
</p>
      <p class="card-text"><small class="text-body-secondary">Ultima actualizacion 3 mins atras</small></p>
    </div>
  </div>
  <div class="card">
    <img src="resources/img/serv-2.jpg" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">Detalle</h5>
      <p class="card-text"> • Gestión comité paritario de higiene y seguridad (CPHS).<br>
							• Inspección de seguridad.<br>
						    • Levantamiento de condiciones de higiene y seguridad.<br>
							• Levantamiento de peligros y evaluación de riesgos.</p>
      <p class="card-text"><small class="text-body-secondary">Ultima actualizacion 3 mins atras</small></p>
    </div>
  </div>
  <div class="card">
    <img src="resources/img/serv-1.jpg" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">Detalle</h5>
      <p class="card-text">• Procedimiento de trabajo seguro.<br>
						   • Sistema de gestión en seguridad y salud ocupacional.<br>
                           • Reglamento interno de orden higiene y seguridad.<br>
                           • Adhesión Organismo Administrador.</p>
      <p class="card-text"><small class="text-body-secondary">Ultima actualizacion 3 mins atras</small></p>
    </div>
  </div>
</div>


	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	
</body>
</html>
