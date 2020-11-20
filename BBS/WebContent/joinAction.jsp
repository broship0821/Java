<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="user.User" scope="page" />
<jsp:setProperty name="user" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 게시판 웹 사이트 만들기!</title>
</head>
<body>
	<%
		if(user.getUserID()==null || user.getUserPW()==null || user.getUserName()==null || user.getUserGender()==null || user.getUserEmail()==null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('입력을 완료해주세요.')");
			script.println("history.back()");
			script.println("</script>");
		} else{
			UserDAO dao = new UserDAO();
			int result = dao.join(user);
			if(result==-1){
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('이미 존재하는 ID입니다.')");
				script.println("history.back()");
				script.println("</script>");
			} else {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("location.href='main.jsp'");
				script.println("</script>");
			} 
		}
	%>
</body>
</html>