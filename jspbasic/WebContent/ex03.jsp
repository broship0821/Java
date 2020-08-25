<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	//전역 변수 개념
	private int numMember = 0;
	//서블릿이 메모리에 로드되면 최초에 한 번 호출되는 메서드 오버 라이딩
	public void jspInit(){
		System.out.println("jspInit() 호출됨");
	}
	//서블릿이 메모리에서 해제될 때 한 번 호출되는 메서드 오버 라이딩
	public void jspDestroy(){
		System.out.println("jspDestroy() 호출됨");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex03</title>
</head>
<body>
	<%
		//지역변수 개념
		int numLocal = 0;
		numMember++; //새로고침할때마다 증가
		numLocal++;	//새로고침 할때마다 0으로 초기화
	%>
	<ul>
		<li>Number Member : <%=numMember %></li>
		<li>Number Local : <%=numLocal %></li>
	</ul>
</body>
</html>