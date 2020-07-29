package this_super;

public class Mage extends Player {

	int mana;

	Mage(){
		super();
	}
	Mage(String name){
		super(name);
		mana = 60;
	}
	
	
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 마력: " + mana);
	}
	

	
}
