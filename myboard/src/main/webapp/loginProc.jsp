<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="peter.spring.web.user.impl.UserDAO" %>
<%@ page import="peter.spring.web.user.UserVo" %>
<%
	//1. 사용자 입력 정보 추출
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	//2. 데이터 베이스 연동처리
	UserVo vo = new UserVo();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO userDAO = new UserDAO();
	UserVo user = userDAO.getUser(vo);
	
	//3. 화면 내비게이션
	if(user!=null){
		response.sendRedirect("getBoardList.jsp"); //로그인 성공
	} else {
		response.sendRedirect("login.jsp"); //로그인 실패
	}
	
%>