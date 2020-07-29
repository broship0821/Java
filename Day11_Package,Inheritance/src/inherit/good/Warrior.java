package inherit.good;

/*
  자식 클래스, 하위 클래스(Child, Sub class)
  	-부모 클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를
  	자식 클래스라고 부릅니다.
  	
  	-상속을 적용시키려면 자식 클래스 선언부의 클래스 이름 뒤에
  	키워드 extends를 쓰고. 물려받을 부모 클래스의 이름을 적으면 됨
 */

public class Warrior extends Player{ //extends가 전제가 되야됨

	//Player의 모든 데이터 받아오고 새로 추가되는 데이터만 작성
	int rage;

	@Override//Alt+Shift+s -> override/implements methods
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노: " + rage);
	}
	
//	void characterInfo() {
//		//부모 클래스의 메서드를 먼저 실행되게 하고 추가되는 부분만 작성
//		super.characterInfo();
//		System.out.println("# 분노: " + rage);
//	}
	
	//리턴 타입이 같아야됨
	//메서드 이름이 똑같아야됨
	//매개변수가 완전히 일치해야됨
	
}
