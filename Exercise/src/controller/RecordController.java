package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Exercise;
import service.DAO;


@WebServlet("/record")
public class RecordController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int pull_up = Integer.parseInt(request.getParameter("pull_up"));
		int hspu = Integer.parseInt(request.getParameter("hspu"));
		int push_up = Integer.parseInt(request.getParameter("push_up"));
		int samdu = Integer.parseInt(request.getParameter("samdu"));
		int dips = Integer.parseInt(request.getParameter("dips"));
		int dumbbell_curl = Integer.parseInt(request.getParameter("dumbbell_curl"));
		int chin_up = Integer.parseInt(request.getParameter("chin_up"));
		Exercise ex = new Exercise(pull_up, hspu, push_up, samdu, dips, dumbbell_curl, chin_up);
		
		DAO dao = DAO.getInstance();
//		dao.insertRecord(ex);
		
		Exercise recordEx = dao.checkDayRecord(LocalDate.now());
		
		request.setAttribute("ex", recordEx);
		
		request.getRequestDispatcher("/WEB-INF/view/record.jsp").forward(request, response);
		
	}

}
