package peter.spring.polymorphism;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("***소니스피커 객체 생성");
	}
	public void volumUp() {
		System.out.println("소니스피커 소리 키움");
	}
	public void volumDown() {
		System.out.println("소니스피커 소리 내림");
	}
}
