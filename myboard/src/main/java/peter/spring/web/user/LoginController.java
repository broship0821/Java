package peter.spring.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import peter.spring.web.user.impl.UserDAO;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
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
		ModelAndView mav = new ModelAndView();
		if(user!=null){
			mav.setViewName("getBoardList.do"); //로그인 성공
		} else {
			mav.setViewName("login.jsp");//로그인 실패
		}
		return mav;
	}

}
