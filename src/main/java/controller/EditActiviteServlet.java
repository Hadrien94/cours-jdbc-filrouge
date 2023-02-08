package controller;

import java.io.IOException;

import dao.PersonneDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Personne;


@WebServlet("/modifierActivite")
public class EditActiviteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PersonneDao personneDao = new PersonneDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
        Personne personne = personneDao.findById(num);
        request.setAttribute("personne", personne);
        request.getRequestDispatcher("/WEB-INF/editPersonne.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		Personne personne = new Personne (num,nom,prenom);
		personneDao.update(personne);
		response.sendRedirect("personne");
	}

}
