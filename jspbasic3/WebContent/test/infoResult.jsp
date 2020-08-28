<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
입력하신 정보는 아래와 같습니다.<br>
ID: <%=request.getParameter("id") %><br>
Password: <%=request.getParameter("pw") %><br>
자기소개: <%=request.getParameter("info") %> 
</body>
</html>