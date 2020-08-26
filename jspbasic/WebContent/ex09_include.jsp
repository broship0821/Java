<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>include 사용 예제</h2>
<%
 	String name = "홍길동";
%>
<%@ include file="ex09_top.jsp"%>
포함된 include 디렉티브 예제의 내용<br>
<%@ include file="ex09_bottom.jsp"%>