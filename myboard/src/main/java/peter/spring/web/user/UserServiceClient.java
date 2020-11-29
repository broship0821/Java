package peter.spring.web.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		// 1. 스프링 컨테이너 구동
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		// 2. 스프링 컨테이너로부터 UserServiceImpl 객체를 Lookup 한다.
		UserService userService = (UserService) container.getBean("userService");
		// 3. 로그인 기능 테스트
		UserVo vo = new UserVo("peter", "0821", null, null);
		UserVo user = userService.getUser(vo);
		if(user!=null)
			System.out.println(user.getName() + "님 환영합니다");
		else
			System.out.println("로그인 실패");
		// 4. 스프링 컨테이너 종료
		container.close();

	}

}
