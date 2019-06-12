package fr.openfoodfact.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.openfoodfact.dao.CategorieDao;
import fr.openfoodfact.dao.MarqueDao;
import fr.openfoodfact.dao.ProduitDao;
import fr.openfoodfact.model.Categorie;
import fr.openfoodfact.model.Marque;
import fr.openfoodfact.model.Produit;

@WebServlet(urlPatterns = "/rechercher/*")
public class InitController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

		CategorieDao categorieDao = new CategorieDao();

		List<Categorie> nomCate = categorieDao.getCategorie();

		MarqueDao marqueDao = new MarqueDao();

		List<Marque> listeMarque = marqueDao.getMarque();

		req.setAttribute("categorie", nomCate);

		req.setAttribute("marque", listeMarque);

		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/openFoodFact.jsp");
		dispatcher.forward(req, rep);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProduitDao produitDao = new ProduitDao();

		String selectedCategorie = req.getParameter("selectedCategorie");
		String selectedMarque = req.getParameter("selectedMarque");
		String selectedGrade = req.getParameter("selectedGrade");
		String selectedNom = req.getParameter("selectedNom");

		if (!selectedCategorie.equals("Categorie")) {

			Integer idCategorie = Integer.parseInt(selectedCategorie);
			List<Produit> listeProduitCategorie = produitDao.rechercherProduitCategorie(idCategorie);
			req.setAttribute("categories", listeProduitCategorie);

		} else if (!selectedMarque.equals("Marque")) {
			Integer idMarque = Integer.parseInt(selectedMarque);
			List<Produit> listeProduitmarque = produitDao.rechercherProduitMarque(idMarque);
			req.setAttribute("marques", listeProduitmarque);
		} else if (!selectedGrade.equals("Grade nutritionnel")) {
			List<Produit> listeProduitGrade = produitDao.rechercherProduitGrade(selectedGrade);
			req.setAttribute("grades", listeProduitGrade);
		} else if (!selectedNom.equals("")) {
			List<Produit> listeProduitNom = produitDao.rechercherProduitNom(selectedNom);
			req.setAttribute("noms", listeProduitNom);
		}

		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/afficherProduits.jsp");
		dispatcher.forward(req, resp);

	}

}
