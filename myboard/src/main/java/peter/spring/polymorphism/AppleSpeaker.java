package peter.spring.polymorphism;

import org.springframework.stereotype.Component;


public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("AppleSpeaker 객체 생성");
	}
	@Override
	public void volumUp() {
		System.out.println("AppleSpeaker 소리 올림");
		
	}

	@Override
	public void volumDown() {
		System.out.println("AppleSpeaker 소리 내림");
		
	}

}
