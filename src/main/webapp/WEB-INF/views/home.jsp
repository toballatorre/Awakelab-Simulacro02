<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<!-- Cabecera -->
	<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Talento Digital</title>
	<!-- BOOTSTRAP -->
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
		integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
		crossorigin="anonymous">
	<!-- CUSTOM CSS -->

	</head>
	
	<body>
		<!-- Contenedor de toda la Vista -->
		<main class="container">
		<!-- Titulo con H1 -->
			<section class="row">
				<h1 class="h1 text-center col-12">Simulacro 2</h1>
			</section>

		
		<!-- CONTENIDO  -->
			<section class="row">
			
			<!-- FORMULARIO PARA OBTENER LAS FACTURAS -->
				<form class="col-4 m-auto" action="./" method="get">
				<div class="form-group">
					<label id="id">Numero de Factura: </label>
					<input class="form-control" type="number" name="id" required="required">
				</div>
				<div class="form-group">
					<input class="btn btn-primary w-100" type="submit" value="Buscar">
				</div>
			</form>
			<!-- FIN FORMULARIO -->
			
			<!-- SECCION DONDE SE MUESTRA LA FACTURA SELECCIONADA -->
			</section>
			
			<!-- SI LA FACTURA EXISTE LA MUESTRA, SI NO SÓLO SE VE EL FORMULARIO -->
			<c:if test="${factura != null}">
				
				<!-- CABECERA DE LA FACTURA -->
				<section class="row col-4">
					<p> <strong>Cliente: </strong>${factura.getCliente()}</p>
					<p> <strong>Fecha: </strong>${factura.getFecha()}</p>
				</section>
				
				<!-- DETALLE DE LA FACTURA -->
				<section class="row col-10 m-auto text-center">
					<div class="table-responsive">
						<table class="table table-hover table-stripped table-bordered">
							<thead class="thead-light">
								<tr>
									<th scope="col">Producto</th>
									<th scope="col">Precio</th>
									<th scope="col">Cantidad</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${factura.getListaDetalle()}" var="d">
									<tr>
										<td scope="row">${d.getProducto().getNombre()}</td>
										<td scope="row">${d.getProducto().getValor()}</td>
										<td scope="row">${d.getCantidad()}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</section>		
			</c:if>
			<!-- FIN FACTURA -->
		</main>
	
		<!-- BOOTSTRAP -->
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
			integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
			crossorigin="anonymous"></script>
		<script
			src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
			integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
			integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
			crossorigin="anonymous"></script>
	</body>
</html>
