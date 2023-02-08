package controller;

import java.io.IOException;

import dao.PersonneDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Personne;

@WebServlet("/activite")
public class ActiviteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
/**
	private ActiviteDao activiteDao = new activiteDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("activites", activiteDao.findAll());
		// request.setAttribute("activite", activiteDao.findById(1));
		request.getRequestDispatcher("/WEB-INF/activite.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String description = request.getParameter("description");

		Activite activite = new Activite(description);
		activiteDao.save(activite);
		response.sendRedirect("activite");
	}
**/
}
