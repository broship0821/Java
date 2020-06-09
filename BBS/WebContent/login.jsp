<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<%--Bootstrap은 데스크탑이나 모바일 해상도에 맞게 알아서 디자인이 변경됨
이런 반응형 웹을 간단하게 사용하는 meta테그임 --%>
<link rel="stylesheet" href="css/bootstrap.css">
<%--bootstrap의 css를 참조해서 이 웹사이트의 기본 디자인으로 쓰겠다 --%>
<title>JSP 게시판 웹사이트</title>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="navbar-header"> <%--헤더부분 만들기 --%>
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="icon-bar"></span><%--목록의 짝대기 개수 --%>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<%--목록만들 버튼 만들기, 화면이 커지면 안보여짐, 모바일에서만 보임 --%>
			<a class="navbar-brand" href="main.jsp">JSP 게시판 웹사이트</a>
		</div>

		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<%--id를 위의거랑 똑같게해 동기화될수있게 하기 --%>
			<ul class="nav navbar-nav">
				<li><a href="main.jsp">메인</a></li>
				<li><a href="bbs.jsp">게시판</a></li>
			</ul>
			
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown">
					<a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="botton" aria-haspopup="true"
						aria-expanded="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li class="active"><a href="login.jsp">로그인</a></li>
						<%--현재의 홈페이지를 의미 --%>
						<li><a href="join.jsp">회원가입</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>
	
	<div class="container">
		<div class="col-lg-4"></div>
		<div class="col-lg-4">
			<div class="jumbotron" style="padding-top: 20px;">
				<form method="post" action="loginAction.jsp">
					<h3 style="text-align: center;">로그인 화면</h3>
					
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디" name="userID" maxlength="20">
						<%--placeholder:아무것도 입력되지 않았을때 보이는 글씨
								name: 나중에 서버랑 연결될때 중요
								maxlength: 아이디 길이 제한 --%>
					</div>
					
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호" name="userPassword" maxlength="20">
					</div>
					
					<input type="submit" class="btn btn-primary form-control" value="로그인">
					<%--로그인 버튼 누르면 loginAction.jsp로 감 --%>
					
				</form>
				<%--post:로그인할때 정보 숨기면서 보내는 역활/loginAction에다가 로그인 정보를 보내줌 --%>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>
	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<%--jquery 사용 --%>
	<script src="js/bootstrap.js"></script>
	<%--bootstrap 스크립트 사용 --%>
</body>
</html>