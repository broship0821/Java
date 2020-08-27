<%@page import="java.util.Map"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//post요청에 한글이 포함된 경우
	//request객체를 사용하기 전에 charset이 설정되어야 정상적으로 표현됨
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 파라미터 출력 예제</title>
</head>
<body>
	<b>request.getParameter() 메서드 활용</b><br>
	요청된 이름:<%= request.getParameter("name") %><br>
	요청된 주소:<%= request.getParameter("address") %><br>
	
	<br><b>request.getParameterValues() 메서드 활용</b><br>
	요청된 동물:
	<%
		String[] values = request.getParameterValues("pet");
		if(values!=null){
			for(int i=0;i<values.length;i++){
	%>
		<!-- html 부분 -->
		<%= values[i] %>
	<%		
			}
		}
	%><br>
	<br><b>request.getParameterName() 사용 예제</b><br>
	<%
		Enumeration names = request.getParameterNames();
		while(names.hasMoreElements()){
			String name = (String)names.nextElement();
	%>
		<%=name %>
	<%
		}
	%><br>
	<br><b>request.getParameterMap() 사용 예제</b>
	<%
		Map paramMap = request.getParameterMap();
		String[] name = (String[])paramMap.get("name");
	%><br>
	<%=name[0] %>
</body>
</html>