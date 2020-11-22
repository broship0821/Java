package peter.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		//1. 스프링 컨테이너를 구동한다
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		//2. spring 컨테이너로부터 필요한 객체를 요청(lookup)한다.
		TV tv1 = (TV) factory.getBean("tv");
		tv1.powerOn();
		tv1.volumUp();
		tv1.volumDown();
		tv1.powerOff();
		//3. 스프링 컨테이너를 종료한다
		factory.close();

	}

}
