<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String pageTitle = (String)request.getAttribute("PAGE_TITLE");// forwarding
	//오브젝트 객체가 가기 때문에 문자열로 보내도 다시 문자열로 형 변환을 해줘야됨
	String contentPage = request.getParameter("CONTENT_PAGE"); // redirect
	//무조건 문자열(같은 name으로 보내면 배열로감, 그땐 values붙여서 꺼내와야됨)
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=pageTitle %></title>
</head>
<body>
	<table width="400" border="1">
		<tr>
			<td colspan="2">
				<jsp:include page="/temp/module/top.jsp"/>
			</td>
		</tr>
		<tr>
			<td width="100" align="top">
				<jsp:include page="/temp/module/left.jsp"/>
			</td>
			<td width="300" align="top">
				<jsp:include page="<%=contentPage %>"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<jsp:include page="/temp/module/bottom.jsp"/>
			</td>
		</tr>
	</table>
</body>
</html>