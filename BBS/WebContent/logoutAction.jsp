<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 게시판 웹 사이트 만들기!</title>
</head>
<body>
	<%
		session.invalidate();//이 페이지에 접속한 회원 세션 없애기, 로그아웃됨
	%>
	<script>
		location.href='main.jsp';
	</script>
</body>
</html>