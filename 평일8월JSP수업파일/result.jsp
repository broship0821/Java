<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>결과</title>
    </head>

    <body>
      <%
        String str = request.getParameter("search");
      %>
      <%=str%>에 대한 검색 결과입니다.<br>
      관련내용1 <br>
      관련내용2 <br>
      관련내용3 <br>
    </body>

</html>
