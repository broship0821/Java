package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2s")
public class Calc2Session extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");

		HttpSession session = req.getSession(); //session 없는데..?
		
		
		PrintWriter out = res.getWriter();
		
		String v_ = req.getParameter("v");
		String op = req.getParameter("operator");
		
		int v = 0;
		
		if(!v_.equals("")) v = Integer.parseInt(v_);
		
		if(op.equals("=")) { //계산
			
			int x = (int) session.getAttribute("value"); //앱 저장소에서 데이터 꺼내오기
			int y = v;
			String operator = (String) session.getAttribute("op");
			int result = 0;
			
			if(operator.equals("+")) result = x+y;
			else if(operator.equals("-")) result = x - y;
			
			out.println(result);
		}
		else { //값 저장
			//앱 저장소에 데이터 저장
			session.setAttribute("value", v);
			session.setAttribute("op", op);
		}
		
		
		
		
	}

	
	
}
