<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int bufferSize = out.getBufferSize(); //버퍼크기
	int remainSize = out.getRemaining(); //남은 버퍼
	int usedSize = bufferSize - remainSize; //사용한 버퍼
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out 예제</title>
</head>
<body>
버퍼 전체 크기: <%=bufferSize %>byte<br><br>
사용한 버퍼 크기: <%= usedSize %>byte<br><br>
남은 버퍼: <% out.println(remainSize); %><br>
</body>
</html>