package final_.method;

public class Parent {

	/*
	 클래스 선언 시 final을 사용하면 그 클래스는 상속이 불가능해짐
	 
	 final 클래스는 자식 클래스를 가질 수 가 없고, 오직 외부에서 객체 생성을
	 통해서만 사용할 수 있음
	 */
	
	
	//final 메서드는 오버라이딩이 불가능
	//final 클래스는 상속이 불가능 (String 객체도 final임)
	
	void method1() {}
	void method2() {}
	final void method3() {}
	
	
}
