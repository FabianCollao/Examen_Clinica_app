<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Pacientes</title>
<%@include file="css-proyecto.jsp" %>
</head>
<body  class="bg-gradiente">
<main class="flex-shrink-0 content">
		<div class="container mt-4 overflow-auto">

			<section>
				<h1 class="text-white fw-bold">Buscar Paciente</h1>
				<c:choose>
					<c:when test="${empty listaPacientes}">
						<div class="alert alert-danger" style="text-align: center"
							role="alert">
							No hay registros de pacientes.
						</div>
					</c:when>
					<c:otherwise>
						<table id="listaPacientes" class="table table-striped table-bordered">
							<thead class="table-dark">
								<tr>
									<th>Id</th>
									<th>Nombre</th>
									<th>Fecha Nacimiento</th>
									<th class="">Historial clínico</th>
								</tr>
							</thead>
							<tbody>
								<!-- Ciclo forEach con JSTL para imprimir datos de la lista -->
								<c:forEach var="paciente" items="${listaPacientes}">
									<tr>
										<td><c:out value="${paciente.getId()}"></c:out></td>
										<td><c:out value="${paciente.getNombre()}"></c:out></td>
										<td><c:out value="${paciente.getFechaNacimiento()}"></c:out></td>
										<td>
											<!-- Enviar el ID del usuario al servlet EditarUsuario al hacer clic en el botÃ³n "Editar" -->
											<form action="historial-clinico" method="get">
												<input type="hidden" name="idRescatado"
													value="${paciente.getId()}">
												<button type="submit" class="btn btn-outline-dark btn-sm">
													<i class="bi bi-prescription2"></i> Ver
												</button>
											</form>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</c:otherwise>
				</c:choose>
			</section>
		</div>
	</main>
<!-- Script Bootstrap 5.3-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
<!-- Scrip Jquery -->
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
<!-- Script Datatables.js -->
<script type="text/javascript" src="https://cdn.datatables.net/1.13.6/js/jquery.dataTables.min.js"></script>
<script type="text/javascript">

let table = new DataTable('#listaPacientes');
</script>
</body>
</html>