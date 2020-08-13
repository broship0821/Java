package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi") //파일 위치 숨기기: xml 파일 편집해서 매핑도 가능하지만 이렇게 어노테이션 형식을 이용하는게 바람직함
public class Nana extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8"); //client에게 줄때 UTF-8로 하라고 전달
		response.setContentType("text/html; charset=UTF-8"); //헤더 부분에 UTF-8로 하라는걸 포함해서 브라우저가 UTF-8로 볼수 있게 해줌
		
		PrintWriter out = response.getWriter();
//		out.println("okay good123 start now!");
		
//		int cnt = Integer.parseInt(request.getParameter("cnt"));
		//http://localhost:8080/hi?cnt=3 이렇게 하면 cnt="3"으로 매개변수 전달 가능
		//request.getParameter("cnt")이렇게 똑같은 변수를 사용하면 전달받은 매개변수 사용 가능
		//하지만 무조건 문자열로 오기 때문에 정수형으로 형 변환을 해줘야됨
		//이 경우 웹에서 cnt값을 무조건 전달해야지만 오류 안남
		
		
		String cnt_ = request.getParameter("cnt");
		int cnt = 100; //기본값
		
		if(cnt_!=null && !cnt_.equals("")) {
			cnt = Integer.parseInt(cnt_);
		}
		
		for(int i=0;i<cnt;i++) {
			out.println((i+1) + ": 안녕~!! Servlet!!!이건 아마 깨질꺼야~~ 아 개졸리다 빨리 자고 싶다<br>");
		}
		
	}
}
