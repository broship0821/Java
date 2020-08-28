<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="selectResult.jsp">
	학력:
	<select name="grade">
		<option value="유졸">유졸</option>
		<option value="중졸">중졸</option>
		<option value="고졸">고졸</option>
		<option value="대졸">대졸</option>
	</select>
	
	<br>소속 국가:
	<select name="nations" size="4" multiple="multiple">
		<option value="한국">한국</option>
		<option value="미쿡">미쿡</option>
		<option value="일본">일본</option>
		<option value="중국">중국</option>
	</select>
	<br>관심 분야:
	<select name="job" size="4">
		<option value="컨설팅">컨설팅</option>
		<option value="프로듀서">프로듀서</option>
		<option value="프로그래머">프로그래머</option>
		<option value="서버관리자">서버관리자</option>
	</select> 
	<br><input type="submit" value="전송">
</form>
<form action="selectForm.jsp">
	<input type="submit" value="초기화">
</form>
</body>
</html>