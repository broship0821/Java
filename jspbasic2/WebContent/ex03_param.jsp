<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 파라미터 출력 예제</title>
</head>
<body>
	요청된 이름:<%= request.getParameter("name") %><br>
	요청된 주소:<%= request.getParameter("address") %><br>
	요청된 동물:<%= request.getParameter("pet") %><br>
</body>
</html>