package modi.protect.pac2;

import modi.protect.pac1.A;

public class D extends A {

//	A a1 = new A(1); //protected
	/*
	 protected 제한자는 패키지가 다를 경우
	 두 클래스 사이에 상속 관계가 있다면 
	 super 키워드를 통해서 만 참조를 허용
	 (제한적으로만 사용 가능, 메인 클래스에서 실체화 하는건 안되고 
	 다른 클래스에서 만들어서 그 클래스를 실체화 하는 형식만 가능할듯)
	 */
	
	public D() {
		//super(3.14); //p.f -> (x)
		super(1); //protected, 가능
		super.x = 1;
		super.method1();

	}
	
	
}
