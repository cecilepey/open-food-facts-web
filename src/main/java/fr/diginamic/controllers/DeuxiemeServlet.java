package fr.diginamic.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/deuxieme/*")
public class DeuxiemeServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

		// // Récupérer la session existante ou création d'une session
		// HttpSession session = req.getSession(true);
		//
		// // Récupérer une valeur stockée
		// Object utilisateur = session.getAttribute("utilisateur");
		//
		// String user = (String) utilisateur;

		// Récupérer une valeur stockée
		Object utilisateur = req.getAttribute("utilisateur");

		String user = (String) utilisateur;

		rep.getWriter().write("<h1>deuxième servlet</h1>" + "<ul>" + "<li>identifiant=" + user + "</li>" + "</ul>");

	}

}
