package fr.openfoodfact.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet qui sert à afficher uniquement les marques de la catégorie
 * sélectionnées
 * 
 * @author Cécile Peyras
 *
 */
@WebServlet(urlPatterns = "/refreshMarques/*")
public class RefreshMarques extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// String selectedCategorie = req.getParameter("selectedCategorie");
		// Integer idCategorie = Integer.parseInt(selectedCategorie);
		//
		// MarqueDao marqueDao = new MarqueDao();
		//
		// List<Marque> listeMarque =
		// marqueDao.getMarqueByCategorie(idCategorie);
		// req.setAttribute("marques", listeMarque);
		// req.setAttribute("categories", selectedCategorie);
		//
		// RequestDispatcher dispatcher =
		// this.getServletContext().getRequestDispatcher("/openFoodFact.jsp");
		// dispatcher.forward(req, resp);
	}

}
