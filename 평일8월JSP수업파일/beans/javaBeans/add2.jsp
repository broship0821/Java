<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="javaBeans.Customer"%>
<% request.setCharacterEncoding("UTF-8"); 
	javaBeans.Customer customer = new javaBeans.Customer();
	customer.setName(request.getParameter("name"));
	customer.setEmail(request.getParameter("email"));
	customer.setPhone(request.getParameter("phone"));
%>
<html>
<head>
<title>Customer 가입 정보</title>
</head>
<body>
	<ul>
		<li>이름 : <jsp:getProperty property="name" name="customer" />
		<li>이메일 : <jsp:getProperty property="email" name="customer" />
		<li>전화 : <jsp:getProperty property="phone" name="customer" />
	</ul>
</body>
</html>
