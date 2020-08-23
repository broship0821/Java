<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//PrintWriter out = response.getWriter(); //jsp자체가 갖고 있기 때문에 따로 생성하지 않아도됨
String cnt_ = request.getParameter("cnt");
int cnt = 100; //기본값
if(cnt_!=null && !cnt_.equals("")) {
	cnt = Integer.parseInt(cnt_);
}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% for(int i=0;i<cnt;i++){ %>
			안녕~!! Servlet!!!아 개졸리다 빨리 자고 싶다<br>
	<%}//이 괴상한건 뭐야 %>
</body>
</html>