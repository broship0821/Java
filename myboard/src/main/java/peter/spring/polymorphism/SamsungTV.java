package peter.spring.polymorphism;

public class SamsungTV implements TV {
	public SamsungTV() {
		System.out.println("삼성티비 객체 생성");
	}
	public void start() {
		System.out.println("객체 초기화 작업 처리");
	}
	public void stop() {
		System.out.println("객체 삭제 전에 처리할 로직 처리");
	}
	public void powerOn() {
		System.out.println("SamsungTV 전원 킴");
	}
	public void powerOff() {
		System.out.println("SamsungTV 전원 끔");
	}
	public void volumUp() {
		System.out.println("SamsungTV 소리 크게");
	}
	public void volumDown() {
		System.out.println("SamsungTV 소리 작게");
	}
}
