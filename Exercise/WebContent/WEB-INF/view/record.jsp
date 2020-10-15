<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 이거 해서 테이블 for문 돌려서 완성하자 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>운동 기록 프로그램</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<table align="center">
		<th colspan="2">어제</th>
		<tr>
			<td>풀업</td>
			<td>${preEx.pull_up}회</td>
		</tr>
		<tr>
			<td>물구나무 푸시업</td>
			<td>${preEx.hspu}회</td>
		</tr>
		<tr>
			<td>푸시업</td>
			<td>${preEx.push_up}회</td>
		</tr>
		<tr>
			<td>삼두 푸시업</td>
			<td>${preEx.samdu}회</td>
		</tr>
		<tr>
			<td>딥스</td>
			<td>${preEx.dips}회</td>
		</tr>
		<tr>
			<td>덤벨컬</td>
			<td>${preEx.dumbbell_curl}회</td>
		</tr>
		<tr>
			<td>친업</td>
			<td>${preEx.chin_up}회</td>
		</tr>
	</table>
	<table align="center">
		<th colspan="2">오늘</th>
		<tr>
			<td>풀업</td>
			<td>${todayEx.pull_up}회</td>
		</tr>
		<tr>
			<td>물구나무 푸시업</td>
			<td>${todayEx.hspu}회</td>
		</tr>
		<tr>
			<td>푸시업</td>
			<td>${todayEx.push_up}회</td>
		</tr>
		<tr>
			<td>삼두 푸시업</td>
			<td>${todayEx.samdu}회</td>
		</tr>
		<tr>
			<td>딥스</td>
			<td>${todayEx.dips}회</td>
		</tr>
		<tr>
			<td>덤벨컬</td>
			<td>${todayEx.dumbbell_curl}회</td>
		</tr>
		<tr>
			<td>친업</td>
			<td>${todayEx.chin_up}회</td>
		</tr>
	</table><br><br>
</body>
</html>