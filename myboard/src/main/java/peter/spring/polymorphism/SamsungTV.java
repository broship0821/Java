package peter.spring.polymorphism;

public class SamsungTV implements TV {
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
