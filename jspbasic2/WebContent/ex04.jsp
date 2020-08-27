<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 헤더 정보</title>
</head>
<body>
	<%
		Enumeration names = request.getHeaderNames();
		while(names.hasMoreElements()){
			String headerName = (String)names.nextElement();
			String headerValue = request.getHeader(headerName);
	%>
		<%=headerName %> : <%= headerValue %><br><br>
	<%
		}
	%>
</body>
</html>