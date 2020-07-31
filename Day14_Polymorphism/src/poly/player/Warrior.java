package poly.player;


public class Warrior extends Player{

	
	int rage;

//	Warrior(){
//		super();
//	}
	//자식 클래스의 생성자는 자동으로 이렇게 생성됨
	//자식 클래스 생성 동시에 부모 클래스도 자동 생성됨
	Warrior(String name){
		super(name);
		rage = 60;
	}
	
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
	
}
