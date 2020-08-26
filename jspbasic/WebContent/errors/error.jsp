<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 이 파일은 에러 발생 시 보여질 페이지 --%>
<%@ page isErrorPage="true" %>
<%-- isErrorPage가 true면 발생된 예외를 참조하는 exception 객체 사용 가능 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외 발생</title>
</head>
<body>
	요청을 처리하는 과정에서 예외가 발생되었습니다.<br><br>
	확인 후 문제를 해결하도록 하겠습니다. <br><br>
	예외 타입: <%= exception.getClass().getName() %><br><br>
	에러 메시지: <%= exception.getMessage() %>
</body>
</html>