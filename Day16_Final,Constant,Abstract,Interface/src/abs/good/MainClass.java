package abs.good;

public class MainClass {

	public static void main(String[] args) {

		
//		HeadStore h = new HeadStore(); //abstract 클래스 자체는 생성 불가능, 자식 클래스만 생성 가능
		
		HeadStore s = new Store();
		s.orderApple();
		s.orderBanana();
		s.orderGrape();
		s.orderMelon();
		s.orderWaterMelon();//오버라이딩 아님

	}

}
