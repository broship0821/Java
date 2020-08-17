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

@WebServlet("/calc3")
public class Calc3 extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//session이랑 cookie 없는 문제 ServletRequest -> HttpServletRequest로 교체하니 해결됨
		
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");

		Cookie[] cookies = req.getCookies(); //cookie는 배열로 옴
		
		
		PrintWriter out = res.getWriter();
		
		String v_ = req.getParameter("v");
		String op = req.getParameter("operator");
		
		int v = 0;
		
		if(!v_.equals("")) v = Integer.parseInt(v_);
		
		if(op.equals("=")) { //계산
			
			int x = 0;
			for(Cookie c : cookies) {
				if(c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			} //cookie는 배열로 오기때문에 사용할 때마다 그 값을 반복문으로 찾아야됨
			
			int y = v;

			String operator = "";
			for(Cookie c : cookies) {
				if(c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
				
			} 
			
			int result = 0;
			
			if(operator.equals("+")) result = x+y;
			else if(operator.equals("-")) result = x - y;
			
			out.println(result);
		}
		else { //값 저장
			//쿠키에 저장, 웹 브라우저에 저장되어 있음
			
			Cookie valueCookie = new Cookie("value", String.valueOf(v)); //쿠키는 문자열만 담을 수 있음
			Cookie opCookie = new Cookie("op", op);
			//쿠키를 모든 url에 저장하게 하면 충돌이 일어날수도 있고 비효율적임, 지정 url을 정해줘야됨
			valueCookie.setPath("/calc2c");
			opCookie.setPath("/calc2c");
			//원래 쿠키는 브라우저가 닫히면 삭제됨, maxAge옵션 사용하면 쿠키가 저장되는 기간을 정할 수 있음( 브라우저 외부에 저장됨)
			valueCookie.setMaxAge(24*60*60); //숫자 1당 1초로 지정됨, *로 시간, 분, 초 표시
			opCookie.setMaxAge(24*60*60);
			res.addCookie(valueCookie);
			res.addCookie(opCookie);
			
			//redirection, 반환할때 페이지도 반환하기
			res.sendRedirect("calc2Cookie.html");
			
			
		}
		
		/*
		 application, session, cookie 차이점: 
		 	application(모든 사용자가 사용 가능하게 함):
		 		사용범위: 전역범위에서 사용하는 저장 공간
		 		생명주기: WAS가 시작해서 종료시 까지
		 		저장위치: WAS 서버 메모리
		 	session(특정 사용자만 사용 가능하게 함):
		 		사용범위: 세션범위에서 사용하는 저장 공간
		 		생명주기: 세션이 시작해서 종료시 까지
		 		저장위치: WAS 서버 메모리
		 	cookie:(서버 메모리 부담을 줄여줌)
		 		사용범위: 웹브라우저별 지정한 path 범주(url)공간
		 		생명주기: 브라우저에 전달한 시간 부터 만료시간까지
		 		저장위치: 웹브라우저의 메모리 또는 파일
		 */
		
		
		
	}

	
	
}
