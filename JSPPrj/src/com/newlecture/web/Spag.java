package com.newlecture.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		request.setAttribute("result", model);
		
		//배열 보내기
		String[] names = {"손흥민", "추신수", "류현진"};
		request.setAttribute("names", names);
		//list 보내기
		List list = new ArrayList();
		list.add("문자열"); list.add(1); list.add(1.1);
		request.setAttribute("list", list);
		//map 보내기
		Map<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("title", "이건 되야되");
		request.setAttribute("map", map);
		
		/*
		 포워딩(forward): 현재 작업하는 내용을 이어나가게 해줌
		 redirect: 현재 작업하는 내용과 상관없이 새로운 요청을 보냄
		 */
		RequestDispatcher dispatcher = request.getRequestDispatcher("spag_good.jsp");
		dispatcher.forward(request, response);
		
		
		
	}
}
