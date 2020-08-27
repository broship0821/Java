<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response 예제</title>
</head>
<body>
	구글로 이동
	<%
		//브라우저에 쿠키를 저장하도록 할 때 사용됨
		response.addCookie(new Cookie("cookie1", "1234"));
		//클라이언트(브라우저) 에게 해당 경로로 요청하라는 응답
		response.sendRedirect("https://www.google.com");
		
	%>
</body>
</html>