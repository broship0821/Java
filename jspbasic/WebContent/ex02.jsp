<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex02</title>
</head>
<body>
	<h2>JSP Script 예제</h2>
	<%
		//Scriptlet: 자바코드를 작성할 수 있는 영역(메인클래스)
		String scriptlet = "스크립틀릿입니다.";
		String comment = "주석입니다.";
		out.println("out기본 객체를 이용한 출력: " + declaration + "<br><br>");
	%>
	선언문 출력하기: <%=declaration %><br><br>
	선언문 출력하기: <%=declarationMethod() %><br><br>
	스크립틀릿 출력하기: <%=scriptlet %>
	
	<!-- JSP 파일에서 HTML에 대한 주석 -->
	<!-- <%=comment %> -->
	<%-- JSP 주석 --%>
	<%-- <%=comment %> --%>
	<%
		//자바 주석
		/*
		자바 범위 주석
		*/
	%>
	
	<%!
		//declaration: 선언문 -> 멤버로 저장됨, 나머지 코드들은 jspservice()라는 함수 안에 들어감
		//멤버필드
		String declaration = "선언문 입니다.";
	
		//멤버메서드
		public String declarationMethod(){
			return declaration;
		}
	%>
	
</body>
</html>