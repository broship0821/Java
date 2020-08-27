<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>초기화 파라미터 예제</title>
</head>
<body>
초기화 파라미터: 웹 어플리케이션 실행 시 <b>미리</b> 준비되어 있는 값(application):
<ul>
	<%
		Enumeration names = application.getInitParameterNames();
		while(names.hasMoreElements()){
			String initParamName = (String)names.nextElement();
	%>
		<li><%= initParamName %> = <%= application.getInitParameter(initParamName) %></li>
	<%
		}
	%>
</ul>
</body>
</html>