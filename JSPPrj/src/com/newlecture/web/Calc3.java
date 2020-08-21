package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
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

@WebServlet("/calc3")
public class Calc3 extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Cookie[] cookies = req.getCookies(); //cookie는 배열로 옴
		
		
//		PrintWriter out = res.getWriter();
		//html파일에서 받는것들
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
		expCookie.setPath("/calc3");
		res.addCookie(expCookie);
		res.sendRedirect("calcpage");
			
			
		
		
	}

	
	
}
