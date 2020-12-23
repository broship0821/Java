<%@page import="peter.spring.web.board.impl.BoardDAO"%>
<%@page import="peter.spring.web.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
	//1. 검색할 게시글 번호 추출
	String seq = request.getParameter("seq");
	//2. 데이터베이스 연동처리
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	BoardVO board = boardDAO.getBoard(vo);
	
	//3. 응답화면 구현
%> --%>
<%
	//세션에 저장한 게시글 정보 추출
	BoardVO board = (BoardVO)session.getAttribute("board");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 보기</title>
</head>
<body>
	<h1>글 상세</h1>
	<a href="logout.do">Log Out</a><hr>
	<form action="updateBoard.do" method="post">
	<input name="seq" type="hidden" value="<%=board.getSeq()  %>" />
		<table border="1">
			<tr>
				<td>제목</td>
				<td><input name="title" type="text" value="<%=board.getTitle() %>" /></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><%=board.getWriter() %></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="content"><%=board.getContent() %></textarea></td>
			</tr>
			<tr>
				<td>등록일</td>
				<td><%=board.getRegDate() %></td>
			</tr>
			<tr>
				<td>조회수</td>
				<td><%=board.getCnt() %></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="글수정" /></td>
			</tr>
		</table>
	</form><hr>
	<a href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=<%= board.getSeq() %>">글삭제</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">글목록</a>
</body>
</html>