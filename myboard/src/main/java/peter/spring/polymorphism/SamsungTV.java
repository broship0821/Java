package peter.spring.polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("삼성티비 객체 생성");
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("삼성티비 객체 생성, 생성자 인젝션");
		this.speaker = speaker;
		this.price = price;
	}
	
	
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker메소드 호출");
		this.speaker = speaker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("setPrice메소드 호출");
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SamsungTV 전원 킴, 가격: "+price);
	}
	public void powerOff() {
		System.out.println("SamsungTV 전원 끔");
	}
	public void volumUp() {
		speaker.volumUp();
	}
	public void volumDown() {
		speaker.volumDown();
	}
}
