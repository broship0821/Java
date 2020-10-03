<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" rel="stylesheet" type="text/css">
<title>운동 기록 프로그램</title>
</head>
<body>
<form action="record" method="post">
	<b>${year }년 ${month }월 ${day }일</b><br><br>
	
	<table align="center">
		<th align="center" colspan="2">운동 기록표</th>
		<tr>
			<td>풀업</td>
			<td  align="right"><input type="text" value="0" name="pull_up"></td>
		</tr>
		<tr>
			<td>물구나무 푸시업</td>
			<td><input type="text" value="0" name="hspu"  align="right"></td>
		</tr>
		<tr>
			<td>푸시업</td>
			<td><input type="text" value="0" name="push_up"></td>
		</tr>
		<tr>
			<td>삼두 푸시업</td>
			<td><input type="text" value="0" name="samdu"></td>
		</tr>
		<tr>
			<td>딥스</td>
			<td><input type="text" value="0" name="dips"></td>
		</tr>
		<tr>
			<td>덤벨컬</td>
			<td><input type="text" value="0" name="dumbbell_curl"></td>
		</tr>
		<tr>
			<td>친업</td>
			<td><input type="text" value="0" name="chin_up"></td>
		</tr>
	</table><br><br>
	<input type="submit" value="저장">
	<input type="reset" value="초기화">
</form>
</body>
</html>