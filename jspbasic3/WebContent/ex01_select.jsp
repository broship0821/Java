<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>옵션 선택</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/forward/ex01_view.jsp">
	<!-- /jspbasic3/forward/ex01)view.jsp 를 가져오는 개념, 이러면 파일 위치가 바뀌어도 똑같이 변경됨-->
		보고싶은 페이지 선택: 
		<select name="code">
			<option value="A">A페이지</option>
			<option value="B">B페이지</option>
			<option value="C">C페이지</option>
			<!-- code 라는 변수명으로 A,B,C중 하나의 값이 전송됨 -->
		</select>
		<input type="submit" value="이동">
	</form>
</body>
</html>