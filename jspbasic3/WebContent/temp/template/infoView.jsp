<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table width="100%" border="1">
	<tr>
		<td>제품 번호</td>
		<td>XXXXXX</td>
	</tr>
	<tr>
		<td>제품 가격</td>
		<td>10000원</td>
	</tr>
</table>
<jsp:include page="infoSub.jsp">
	<jsp:param value="B" name="type"/>
</jsp:include>