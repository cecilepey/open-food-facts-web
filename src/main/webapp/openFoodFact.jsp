<%@page import="java.util.List, fr.openfoodfact.model.*, fr.openfoodfact.controllers.*"%>
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

		<div class="h1 text-secondary ">Formulaire de recherche d'un
			produit</div>
	</div>
	</div>


	<div class="container-fluid text-center mt-5">
		<div class="row">
			<form
				class="col-sm-4 mx-auto border shadow p-3 mb-5 bg-white rounded"
				method="POST" action="http://localhost:8080/open-food-facts-web/rechercher">
				<div class="form-group">
					<select class="custom-select mr-sm-2" id="categorie" name="selectedCategorie" onchange="appelServeur()">

						<%
							List<Categorie> liste = (List<Categorie>)request.getAttribute("categorie");
						%>
						<option selected>Categorie</option>
						<%
							for (Categorie cate : liste) {
						%>
						<option value="<%=cate.getId() %>"><%=cate.getNom()%></option>
						<%
							}
						%>

					</select>
				</div>
				<div class="form-group">
					<select class="custom-select mr-sm-2" id="marque" name="selectedMarque">				
						<%
							List<Marque> listeMarque = (List<Marque>)request.getAttribute("marque");
						%>
						<option selected>Marque</option>
						<%
							for (Marque marque : listeMarque) {
						%>
						<option value="<%=marque.getId() %>"><%=marque.getNom()%></option>
						<%
							}
						%>
					</select>
				</div>
				<div class="form-group">
					<input type="text" class="form-control" id="nomProduit"
						placeholder="nom du produit" name="selectedNom">
				</div>
				<div class="form-group">
					<select class="custom-select mr-sm-2" id="grade" name="selectedGrade">
						<option selected>Grade nutritionnel</option>
						<option value="a">A</option>
						<option value="b">B</option>
						<option value="c">C</option>
						<option value="d">D</option>
						<option value="e">E</option>
					</select>
				</div>
				<div class="form-group">
					<div class="form-row">
						<div class="col">
							<input type="text" class="form-control"
								placeholder="Energie minimum">
						</div>
						<div class="col">
							<input type="text" class="form-control"
								placeholder="Energie maximum">
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="form-row">
						<div class="col">
							<input type="text" class="form-control"
								placeholder="Graisse minimum">
						</div>
						<div class="col">
							<input type="text" class="form-control"
								placeholder="Graisse maximum">
						</div>
					</div>
				</div>
				<input type="submit" class="btn btn-outline-success" id="bouton" name="rechercher"
					value="Rechercher">
			</form>
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
		
		<script type="text/javascript">
		//fonction javascript pour récupérer les infos sélectionnées
		//function appelServeur(){
			
			//document.location.href = "http://localhost:8080/open-food-facts-web/refreshMarques?idCat="+document.forms[0].selectedCategorie.value; 
			
			//refresh marques est une servlet
			// 1 récupère idCate
			//2 extraction des marques
			//3 stockage des marques, categorie, idcat dans la request
			//4 forward vers page origine
		//}
		
		</script>
</body>
</html>

