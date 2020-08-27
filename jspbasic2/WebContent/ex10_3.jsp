<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex10_3</title>
</head>
<body>
하나의 페이지 범위: <%= pageContext.getAttribute("name") %><br>
하나의 페이지 범위: <%= request.getAttribute("name") %><br>
하나의 페이지 범위: <%= session.getAttribute("name") %><br>
하나의 페이지 범위: <%= application.getAttribute("name") %><br>
</body>
</html>