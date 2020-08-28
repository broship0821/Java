<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력 양식</title>
</head>
<body>
	<form action="infoResult.jsp">
		ID: <input type="text" name="id"><br>
		Password: <input type="text" name="pw"><br>
		자기소개<br>
		<textarea name="info"></textarea><br>
		<input type="submit" value="전송">
	</form>
	<form action="infoForm.jsp">
		<input type="submit" value="초기화">
	</form>
</body>
</html>