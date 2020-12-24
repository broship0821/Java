package peter.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import peter.spring.web.controller.Controller;
import peter.spring.web.user.impl.UserDAO;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("로그인 처리");
		//1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		//2. 데이터 베이스 연동처리
		UserVo vo = new UserVo();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserVo user = userDAO.getUser(vo);
		
		//3. 화면 내비게이션
		if(user!=null){
			return "getBoardList.do"; //로그인 성공
		} else {
			return "login"; //로그인 실패
		}
	}

}