<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폼 전송 예제</title>
</head>
<body>
폼에 데이터를 입력하고 전송을 누르세요.
<form action="ex03_param.jsp" method="post">
<!-- 무언갈 얻기 위한 정보를 간단하게 보낼때: get(경로 뒤에?붙여서 전달, 길이 제한 있음 적은 정보만 전송 가능),
서버에 저장시켜야 하는 정보는 post, 많은 정보를 보내야 할때는 post -->
	이름: <input type="text" name="name"><br>
	주소: <input type="text" name="address"><br>
	좋아하는 동물:<br>
		<input type="checkbox" name="pet" value="dog">개<br>
		<input type="checkbox" name="pet" value="cat">고양이<br>
		<input type="checkbox" name="pet" value="pig">돼지<br>
	<input type="submit" value="전송">
</form>
</body>
</html>