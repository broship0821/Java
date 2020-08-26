<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="1kb" autoFlush="false" %>
<%-- autoFlush는 디폴트가 true --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buffer 예제</title>	
</head>
<body>
<%
	for(int i=0;i<1000;i++) {
%>
1234
<%} %>
</body>
</html>