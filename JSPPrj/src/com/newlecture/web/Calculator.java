package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		
//		if(req.getMethod().equals("GET")) {//get으로 왔는지 post로 왔는지 확인하는 메서드, 대문자로 오니까 대문자로 해줘야됨
//			System.out.println("get요청이 들어옴");
//		}
//		else if(req.getMethod().equals("POST")) {
//			System.out.println("post요청이 들어옴");
//		}
//		
//		super.service(req, res);
//	}
	
	/*
	 service블럭 안에는 get이든 post든 다 실행함
	 doPost는 post요청일때만 실행됨
	 doGet은 get요청일때만 실행됨
	 post때 처리해야할 로직, get때 처리해야할 로직은 따로 작성하고
	 그 전에 공통적으로 처리해야할 부분은 service에 작성(그게 없으면 생략가능)
	 */
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		
		
		String value = req.getParameter("value"); //0~9 올수 있음
		String operator = req.getParameter("operator"); //+,-,*,/ 올수 있음
		String dot = req.getParameter("dot"); //. 올수 있음
		
		String exp = "";
		if(cookies!=null) { //만약 받은 쿠키가 있다면
			for(Cookie c : cookies) { //모든 쿠키를 조회해서
				if(c.getName().equals("exp")) { //key값이 exp인 쿠키의
					exp = c.getValue(); //value값을 exp 변수에 대입
					break;
				}
			}
		}
		
		if("=".equals(operator)) { //=누르면 계산해야됨, 여태까지 받은 쿠키를 계산해서 출력해줌
			//자바에서 자바스크립트 사용 가능하게 해주는 엔진
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
			try {
				exp = String.valueOf(engine.eval(exp)); //자바스크립트의 eval()함수(문자열 바로 실행해줌)
			} catch (ScriptException e) {
				e.printStackTrace();
			}
		}
		else if("C".equals(operator)) { //C 누르면 캐쉬삭제(밑에 있음)
			exp = "";
		}
		else { //= 제외한 다른게 눌렸다면 그 값들 누적시키기
			exp += (value == null) ? "" : value;
			exp += (operator == null) ? "" : operator;
			exp += (dot == null) ? "" : dot;
		}
		
		Cookie expCookie = new Cookie("exp", exp); //자바에서 처리한 결과 다시 쿠키로 내보내기
		if("C".equals(operator)) { //C가 눌리면 setMaxAge(0)으로 쿠키 도착하자마자 쿠키 삭제
			expCookie.setMaxAge(0);
		}
		expCookie.setPath("/calculator");
		res.addCookie(expCookie);
		res.sendRedirect("calculator");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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
				out.write("	<form method=\"post\">");
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
