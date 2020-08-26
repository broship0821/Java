<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 이 페이지에서 예외가 발생될 경우 사용할 에러페이지 지정 --%>
<%@ page errorPage="/errors/error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 파라미터 출력</title>
</head>
<body>
전달받은 파라미터 값: <%=request.getParameter("name").toUpperCase() %>
</body>
</html>