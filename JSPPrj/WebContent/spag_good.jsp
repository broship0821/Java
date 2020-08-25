<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	pageContext.setAttribute("result", "페이지 저장소 사용하기");
%>
<body>
	<%=request.getAttribute("result") %>입니다. <br>
	${requestScope.result}입니다. <br>
	배열 받기: ${names[0]}<br>
	리스트 받기: ${list[2]}<br>
	map 받기: ${map.title}<br>
	페이지: ${result}<br>
	파라미터 가져오기: ${param.n }<br>
	헤더 정보 가져오기: ${header.accept }<br>
</body>
</html>