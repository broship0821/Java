<%@page import="peter.spring.web.board.impl.BoardDAO"%>
<%@page import="peter.spring.web.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int seq = Integer.parseInt(request.getParameter("seq"));
	BoardVO vo = new BoardVO();
	vo.setSeq(seq);
	BoardDAO dao = new BoardDAO();
	dao.deleteBoard(vo);
	response.sendRedirect("getBoardList.jsp");
%>