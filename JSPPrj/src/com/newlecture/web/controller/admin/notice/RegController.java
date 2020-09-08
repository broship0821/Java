package com.newlecture.web.controller.admin.notice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@MultipartConfig(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*50,
		maxRequestSize =  1024*1024*50*5
)
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
		
		Part filePart = request.getPart("file");
		String fileName = filePart.getSubmittedFileName();
		InputStream fis = filePart.getInputStream();
		
		String realPath = request.getServletContext().getRealPath("/upload");
		System.out.println(realPath);
		
		String filePath = realPath + File.separator + fileName;
		FileOutputStream fos = new FileOutputStream(filePath);
		
		byte[] buf = new byte[1024];
		int size = 0;
		while((size=fis.read(buf)) != -1) {
			fos.write(buf, 0, size);
		}
		
		fos.close();
		fis.close();
		
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
//		int result = service.insertNotice(notice);
		
		response.sendRedirect("list");
	}
}
