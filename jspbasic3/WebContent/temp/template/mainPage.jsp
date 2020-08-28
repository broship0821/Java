<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("PAGE_TITLE", "정보 보기");
%>
<jsp:forward page="template.jsp">
	<jsp:param value="infoView.jsp" name="CONTENT_PAGE"/>
	<!-- 포워딩 하면서 이렇게 파라미터를 전달할수도 있음 -->
	<!-- 포워딩 하고 나서도 클라이언트가 전달해줘야 하는 값이 있으면 그때 jsp:param을 써서 파라미터를 받아올 수 있음  -->
</jsp:forward>
<%-- <%@include와의 차이점
	<%@include: 지정된 페이지가 현재 페이지에 포함되어 하나의 페이지가됨, 변수가 공유됨
	include 액션태그: 현재 페이지에 여러 페이지가 같이 실행되는 개념, 변수 공유X 파라미터로 공유해야됨
	
	여러 페이지에 같은 부분들을 include를 통해 공통되게 만들수있음
	변수 공유가 필요하냐 안하냐에 따라서 선택해서 사용하면됨
	
 --%>