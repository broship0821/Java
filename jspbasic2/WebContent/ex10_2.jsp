<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex10_2</title>
</head>
<body>
하나의 페이지 범위: <%= pageContext.getAttribute("name") %><br>
하나의 페이지 범위: <%= request.getAttribute("name") %><br>
하나의 페이지 범위: <%= session.getAttribute("name") %><br>
하나의 페이지 범위: <%= application.getAttribute("name") %><br>
<a href="ex10_3.jsp">ex10_3.jsp 새로 요청</a>
<%
	/*
		pageContext는 페이지 하나당 하나씩 만들어짐(ex10_2꺼)
		request는 포워딩할때도 유효(ex10_1꺼 가져다씀)
		session은 브라우저마다 하나씩 만들어짐(ex10_1꺼 가져다씀)
		application은 전체 서버에서 사용 가능(ex10_1꺼 가져다씀)
		
		redirect - getParameter(): session,application전달(새로운 페이지)
		forwarding - setAttribute(), getAttribute(): request,session,application전달(기존 페이지)
	*/
%>
</body>
</html>