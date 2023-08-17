<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ver Historial Clínico</title>
<%@include file="css-proyecto.jsp"%>
</head>
<body class="bg-gradiente">
	<c:set var="paciente" value="${listaHistorial[0].getPaciente()}" />
	<div class="w-100 pt-3 sticky-top text-start bg-gradiente">
		<div class="ms-5">
			<h1 class="fw-bold text-white">Historial Clínico:</h1>
			<h5>Paciente: <i>${paciente.getNombre()}</i></h5>
			<p>Fecha de Nacimiento: ${paciente.getFechaNacFormateado()}</p>
			<hr>
		</div>
	</div>
	<main class="d-flex ">
		<div class="container mt-4 text-center">
			<section>
				<div class="row justify-content-center  ">
					<c:forEach items="${listaHistorial}" var="historial">
						<div class="card m-2 px-0 col-lg-3 col-sm-12 col-md-4 mx-sm-3">
							<div class="card-header bg-color text-white fw-bold">Fecha de Cita:
								${historial.getFechaCitaFormateada()}</div>
							<div class="card-body bg-color-2">
								<h6 class="card-subtitle mb-2 text-muted"><b> Doctor:
									${historial.getDoctor().getNombre()}</b></h6>
								<p class="card-text">Especialidad:
									${historial.getDoctor().getEspecialidad().getNombre()}</p>
								<p class="card-text">Experiencia:
									${historial.getDoctor().getExperiencia()} años</p>
								<hr>
								<p class="card-text">Síntomas: ${historial.sintomas}</p>
								<p class="card-text">Diagnóstico: ${historial.diagnostico}</p>
								<p class="card-text">Tratamiento: ${historial.tratamiento}</p>
							</div>
						</div>
					</c:forEach>
				</div>
			</section>
		</div>
	</main>
	<div class="w-100 sticky-bottom">
		<div class="d-flex justify-content-center">
			<a href="lista-pacientes" class="btn btn-light w-25 bg-color text-white">Volver</a>
			
		</div>
	</div>
	<!-- Script Bootstrap 5.3-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
</body>
</html>
