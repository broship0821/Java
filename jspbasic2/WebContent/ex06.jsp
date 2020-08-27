<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext 예제</title>
</head>
<body>
	<%
		HttpServletRequest httpRequest = (HttpServletRequest)pageContext.getRequest();
	%>
	request기본 객체와 pageContext.getRequest() 동일여부:
	<%= request == httpRequest %><br><br>
	기본객체 out으로 출력:
	<% out.println("out으로 출력"); %><br>
	pageContext.getOut()으로 가져온 out으로 출력:
	<% pageContext.getOut().println("안녕하세요~"); %>
</body>
</html>