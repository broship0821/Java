package peter.spring.polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	private Speaker speaker;
	
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public void powerOn() {
		System.out.println("LgTV 전원 킴");
	}
	public void powerOff() {
		System.out.println("LgTV 전원 끔");
	}
	public void volumUp() {
		speaker.volumUp();
	}
	public void volumDown() {
		speaker.volumDown();
	}
}
