package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import dao.PersonneDao;

@WebServlet("/supprimerPersonne")
public class DeletePersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonneDao personneDao = new PersonneDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(request.getParameter("num"));
		personneDao.remove(num);
		response.sendRedirect("personne");
	}

}


