package controller;

import java.io.IOException;

import dao.PersonneDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Personne;

@WebServlet("/personne")
public class PersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PersonneDao personneDao = new PersonneDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("personnes", personneDao.findAll());
		// request.setAttribute("personne", personneDao.findById(1));
		request.getRequestDispatcher("/WEB-INF/personne.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
//		String dateNaissance = request.getParameter("dateNaissance");
//		String adresse = request.getParameter("adresse");
//		Integer telephone  = getParameter("telephone");

		//Personne personne = new Personne(nom, prenom, dateNaissance, adresse, telephone);
		Personne personne = new Personne(nom, prenom);
		personneDao.save(personne);
		response.sendRedirect("personne");
	}

}
