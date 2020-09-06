package com.newlecture.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*") //모든 url에 이 필터를 적용한다
public class CharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//servlet 동작 전에 실행
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response); //전달받은걸 servlet에 전달
		
		//servlet 동작 후에 실행

	}

}
