<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page info="Copyright 2020. Peter. All right reserved." %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page info 예제</title>
</head>
<body>
	<h2>page info 가져오기</h2>
	<%=this.getServletInfo() %>
	<!-- 이 페이지 안에서 자주 사용하는 문구 저장후 사용 -->
</body>
</html>