<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String code = request.getParameter("code"); //모든 전송은 문자열로전송
	String viewPageURI = null;
	
	switch(code){
	case "A": viewPageURI = "/forward/viewModule/a.jsp"; break;
	case "B": viewPageURI = "/forward/viewModule/b.jsp"; break;
	case "C": viewPageURI = "/forward/viewModule/c.jsp"; break;
	}
	
	//선택된 페이지로 forwarding
	//forward 동작은 해당 애플리케이션 내의 자원으로만 가능
	//request.getRequestDispatcher(viewPageURI).forward(request, response);
%>
<%--forward 액션 테그 --%>
<jsp:forward page="<%=viewPageURI %>"></jsp:forward>