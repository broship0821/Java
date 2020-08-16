package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/add2")
public class Add2 extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		String[] nums = req.getParameterValues("num"); //배열로 전달되니 받을때도 배열로 받아야됨
		
		int result = 0;
		
		for(int i=0;i<nums.length;i++) {
			int num = Integer.parseInt(nums[i]);
			result += num;
		}
		
		
		out.println("result is " + result);
	}

	
	
}
