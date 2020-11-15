package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long start = System.currentTimeMillis();
		
		//실제 업무 처리하는 로직
		Object result = invocation.proceed();
		
		long end = System.currentTimeMillis();
		
		String message = (end-start) + "ms 시간 소요";
		System.out.println(message);
		
		return result;
	}
	
}
