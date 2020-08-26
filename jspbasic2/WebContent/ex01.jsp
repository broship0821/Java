<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request 예제</title>
</head>
<body>
<h1>Request 객체가 가지는 내용</h1>
클라이언트 IP: <%= request.getRemoteAddr() %><br>
요청 정보 길이: <%= request.getContentLength() %><br>
요청 정보 인코딩: <%= request.getCharacterEncoding() %><br>
요청 정보 컨텐트 타입: <%= request.getContentType() %><br>
요청 프로토콜: <%= request.getProtocol() %><br>
*요청 메서드: <%= request.getMethod() %><br>
요청 URL: <%= request.getRequestURL() %><br>
요청 URI: <%= request.getRequestURI() %><br>
*컨텍스트 경로(최상위 요청 경로): <%=request.getContextPath() %><br>
서버 이름: <%= request.getServerName() %><br>
*서버 포트: <%= request.getServerPort() %><br>
</body>
</html>