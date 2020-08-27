<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	/*
	기본 객체들의 범위를 이해하기 위한 예제
	setAttribute(키, 값)는 기본 객체에 값을 저장해두는 기능
	getAttribute(키)를 이용하여 값을 꺼낼 수 있음
	프로그램이 동작되면서 유지될 필요가 있는 값이 있다면 다음과 같이 저장 가능
	*/
	pageContext.setAttribute("name", "page");
	request.setAttribute("name", "request");
	
	/*
		request객체에 getParameter()와 getAttribute()는 구분해야됨
		getParameter(): 클라이언트에서 요청과 함께 들어온 값을 꺼낼 때 사용(이미 set되어있음-setParameter() 이런 함수 없음)
		setAttribute()은 있지만 setParameter()는 없음
		
		핵심: request객체의 setAttribute()는 forwarding한 jsp페이지까지 유지될 값을 저장하는 용도
		redirect - getParameter() -client가 보낸 값 가져오기
		forwarding - setAttribute(), getAttribute() -이어서 사용할 값 저장, 불러오기
	*/
	
	session.setAttribute("name", "session");
	application.setAttribute("name", "application");
	
	System.out.println("ex10_1.jsp");
	System.out.println("하나의 페이지 범위: " + pageContext.getAttribute("name"));
	System.out.println("하나의 request 범위: " + request.getAttribute("name"));
	System.out.println("하나의 session 범위: " + session.getAttribute("name"));
	System.out.println("하나의 application 범위: " + application.getAttribute("name"));
	
	//다른 jsp페이지로 forwarding하여 처리를 연결(redirect와 개념 구분할것)
	request.getRequestDispatcher("ex10_2.jsp").forward(request, response);	
	/*
	ex10_1.jsp에서 만든 기본 객체(request, response)를 ex10_2.jsp에 전달
	그럼 ex10_2.jsp는 기본 객체 새로 만들지 않고 1꺼 갖다씀
	redirect는 새로운 기본 객체 생성
	*/
%>