package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DAO;


@WebServlet("/record")
public class RecordController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String exercise = request.getParameter("ex");
		String num = request.getParameter("num");
		
		request.setAttribute("exercise", exercise);
		request.setAttribute("num", num);
		
		DAO dao = DAO.getInstance();
		request.setAttribute("x", dao.test());
		
		request.getRequestDispatcher("/WEB-INF/view/record.jsp").forward(request, response);
		
	}

}
