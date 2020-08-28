<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
입력하신 정보는 아래와 같습니다.<br>
학력: <%=request.getParameter("grade") %><br>
소속 국가: 
	<%
		String[] nations = request.getParameterValues("nations");
		if(nations!=null){
			for(int i=0;i<nations.length;i++){
	%>
		<%=nations[i] %>
	<%
			}
		}
	%>
<br>
관심 분야: <%=request.getParameter("job") %><br>
</body>
</html>