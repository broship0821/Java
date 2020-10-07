<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>운동 기록 프로그램</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<table align="center">
		<th colspan="2">오늘</th>
		<tr>
			<td>풀업</td>
			<td>${ex.pull_up}회</td>
		</tr>
		<tr>
			<td>물구나무 푸시업</td>
			<td>${ex.hspu}회</td>
		</tr>
		<tr>
			<td>푸시업</td>
			<td>${ex.push_up}회</td>
		</tr>
		<tr>
			<td>삼두 푸시업</td>
			<td>${ex.samdu}회</td>
		</tr>
		<tr>
			<td>딥스</td>
			<td>${ex.dips}회</td>
		</tr>
		<tr>
			<td>덤벨컬</td>
			<td>${ex.dumbbell_curl}회</td>
		</tr>
		<tr>
			<td>친업</td>
			<td>${ex.chin_up}회</td>
		</tr>
	</table><br><br>
</body>
</html>