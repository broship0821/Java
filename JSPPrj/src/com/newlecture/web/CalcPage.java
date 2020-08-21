package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

@WebServlet("/calcpage")
public class CalcPage extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		//html을 동적으로 실행시켜주는 페이지
		Cookie[] cookies = req.getCookies();//일단 쿠키 받고
		
		String exp = "0"; //쿠키에서 받은것이 없으면 0 출력
		if(cookies!=null) { //쿠키에서 받은것이 있으면 key 값이 exp인 쿠키 찾기
			for(Cookie c : cookies) {
				if(c.getName().equals("exp")) {
					exp = c.getValue();
					break;
				}
			}
		}
		
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");

		PrintWriter out = res.getWriter();
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>계산기 만들어보기~~</title>");
		out.write("<style>");
		out.write("input{");
		out.write("width:50px;");
		out.write("height:50px;");
		out.write("}");
		out.write(".output{");
		out.write("height:50px;");
		out.write("background:#e9e9e9;");
		out.write("	font-size:24px;");
		out.write("	font-weight:bold;");
		out.write("	text-align:right;");
		out.write("	padding:0px 5px;");
		out.write("	}");
		out.write("</style>");
		out.write("</head>");
		out.write("<body>");
		out.write("	<form action=\"calc3\" method=\"post\">");
			out.write("		<table>");
			out.write("		<tr>");
			out.printf("			<td class=\"output\" colspan=\"4\">%s</td>", exp); //전달받은 exp 표시하기
			out.write("	</tr>");
			out.write("	<tr>");
			out.write("		<td><input type=\"submit\" name=\"operator\" value=\"CE\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"operator\" value=\"C\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"operator\" value=\"지우기\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"operator\" value=\"/\" /></td>");
			out.write("	</tr>");
			out.write("	<tr>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"7\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"8\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"9\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"operator\" value=\"*\" /></td>");
			out.write("	</tr>");
			out.write("	<tr>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"4\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"5\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"6\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"operator\" value=\"-\" /></td>");
			out.write("	</tr>");
			out.write("	<tr>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"1\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"2\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"3\" /></td>");
			out.write("			<td><input type=\"submit\" name=\"operator\" value=\"+\" /></td>");
			out.write("	</tr>");
			out.write("	<tr>");
			out.write("		<td></td>");
			out.write("		<td><input type=\"submit\" name=\"value\" value=\"0\" /></td>");
			out.write("		<td><input type=\"submit\" name=\"dot\" value=\".\" /></td>");
			out.write("			<td><input type=\"submit\" name=\"operator\" value=\"=\" /></td>");
			out.write("		</tr>");
			out.write("	</table>");
				
			out.write("</form>");
			out.write("</body>");
			out.write("</html>");
		
		
		
		
		
	}

	
	
}
