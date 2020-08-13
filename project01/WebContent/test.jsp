<%@ page session="false" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>타이틀자리</title>
    </head>

    <body>
      현재 시간은: <%= new java.util.Date() %> 입니다.<br>
      <form method="post" action="result.jsp">
        검색: <input type="text" name="search"><br>
        <input type="submit" value="검색요청">
      </form>
    </body>

</html>
