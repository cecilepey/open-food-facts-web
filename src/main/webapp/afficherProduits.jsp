<%@page
	import="java.util.List, fr.openfoodfact.model.*, fr.openfoodfact.controllers.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Open Food Fact</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-success">
		<a class="navbar-brand h1" href="#">Open Food Fact</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
	</nav>

	<div class="container-fluid">
		<div class="h1 text-secondary">
			<button type="button" class="btn btn-success">+ Ajouter un
				produit</button>
		</div>
	</div>

	<div class="container-fluid text-center mt-5 ">

		<div class="h1 text-secondary ">Résultat de la recherche</div>
	</div>
	</div>

	<div class="container-fluid text-center mt-5">
		<div class="row">
			<div class="col-sm-8 mx-auto border shadow p-3 mb-5 bg-white rounded">

				<table class="table">
					<thead>
						<tr>
							<th scope="col">Nom du produit</th>
							<th scope="col">Grade nutritif</th>
							<th scope="col">Energie au 100g</th>
							<th scope="col">Graisse au 100g</th>
						</tr>
					</thead>
					<tbody>
					<%
							List<Produit> listeProduitCate = (List<Produit>)request.getAttribute("categorie");
							if(listeProduitCate != null ){
							for (Produit listePro : listeProduitCate) {
						%>
						<tr>
						
							<td scope="row"><%=listePro.getNom() %></th>
							<td><%=listePro.getGrade() %></td>
							<td><%=listePro.getEnergie100g() %></td>
							<td><%=listePro.getGraisse100g() %></td>
							
						</tr>
						<%}} %>
											<%
							List<Produit> listeProduitMarque = (List<Produit>)request.getAttribute("marques");
							if(listeProduitMarque != null){
							for (Produit listePro : listeProduitMarque) {
						%>
						<tr>
						
							<td scope="row"><%=listePro.getNom() %></th>
							<td><%=listePro.getGrade() %></td>
							<td><%=listePro.getEnergie100g() %></td>
							<td><%=listePro.getGraisse100g() %></td>
							
						</tr>
						<%}}%>
											<%
							List<Produit> listeProduitGrade = (List<Produit>)request.getAttribute("grades");
							if(listeProduitGrade != null){
							for (Produit listePro : listeProduitGrade) {
						%>
						<tr>
						
							<td scope="row"><%=listePro.getNom() %></th>
							<td><%=listePro.getGrade() %></td>
							<td><%=listePro.getEnergie100g() %></td>
							<td><%=listePro.getGraisse100g() %></td>
							
						</tr>
						<%}}%>
					</tbody>
				</table>


			</div>
		</div>
	</div>




	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>