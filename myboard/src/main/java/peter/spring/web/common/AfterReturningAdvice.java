package peter.spring.web.common;

import org.aspectj.lang.JoinPoint;

import peter.spring.web.user.UserVo;

public class AfterReturningAdvice {
	public void afterLog(JoinPoint joinPoint, Object returnObj) {
		String method = joinPoint.getSignature().getName();
		if (returnObj instanceof UserVo) {
			UserVo user = (UserVo) returnObj;
			if (user.getRole().equals("admin")) {
				System.out.println(user.getName() + " 로그인(Admin)");
			}
		}
		System.out.println("[사후처리] : " + method + "() 메서드 리턴값 : " + returnObj.toString());
	}

}
