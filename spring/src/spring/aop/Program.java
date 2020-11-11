package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		Exam exam = new NewlecExam(1,1,1,1);
		
		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(),
				new Class[] {Exam.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//소스코드에 있던 곁다리 업무를 여기다 넣기
						long start = System.currentTimeMillis();
						
						//실제 업무 처리하는 로직
						Object result = method.invoke(exam, args);
						//exam: 실제 업무를 처리하는 객체
						//args: 그 객체의 모든 메소드들에 필요한 파라미터들
						
						long end = System.currentTimeMillis();
						
						String message = (end-start) + "ms 시간 소요";
						System.out.println(message);
						
						return result;
					}
				}
				);
		
		System.out.println("total is " + proxy.total());
		System.out.println("-----------------");
		System.out.println("total is " + exam.total());
		System.out.println("-----------------");
		System.out.println("avg is " + proxy.avg());

	}

}
