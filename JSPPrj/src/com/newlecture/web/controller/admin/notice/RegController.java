package com.newlecture.web.controller.admin.notice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@WebServlet("/admin/board/notice/reg")
public class RegController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/view/admin/board/notice/reg.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String isOpen = request.getParameter("open");
		boolean pub = false;
		if(isOpen!=null) pub = true;
		
		//바로 공개 여부 결정하기
		/*
		 데이터 베이스에 컬럼이 하나 추가될시 고쳐야할 사항
		 	1. 데이터 베이스에 컬럼 추가
		 	2. Notice 엔티티
		 	3. 데이터 베이스 - NOTICE_VIEW 수정
		 	4. NoticeView 엔티티
		 	5. NoticeService에서 Notice나 NoticeView를 사용하는 모든 메소드 수정
		 */
		Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContent(content);
		notice.setPub(pub);
		notice.setWriterId("SON7");
		
		NoticeService service = new NoticeService();
		int result = service.insertNotice(notice);
		System.out.println(result + "행이 추가되었습니다");
		
		response.sendRedirect("list");
	}
}
