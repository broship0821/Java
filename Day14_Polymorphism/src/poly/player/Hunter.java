package poly.player;

public class Hunter extends Player {

	String pet;

	Hunter(){
		super();
	}
	Hunter(String name){
		super(name);
		pet = "dragon";
	}
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 펫: " + pet);
	}
	
}
