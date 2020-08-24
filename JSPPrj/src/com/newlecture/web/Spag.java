package com.newlecture.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/spag_good")
public class Spag extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = 0;
		String num_ = request.getParameter("n");
		if(num_ != null && !num_.equals(""))
			num = Integer.parseInt(num_);
		String model;
		if(num%2==0)
			model = "짝수";
		else
			model = "홀수";
		
		//46강 7분부터 다시보기
		//포워딩
		RequestDispatcher dispatcher = request.getRequestDispatcher("spag_good.jsp");
		dispatcher.forward(request, response);
		
		
		
	}
}
