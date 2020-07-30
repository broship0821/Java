package modi.constructor.pac1;

public class A {

	A a1 = new A(true);
	A a2 = new A(30);
	A a3 = new A(3.14);
	//같은 클래스에서는 전부 사용 가능
	
	//생성자 선언
	public A(boolean b) {}
	A(int i) {}
	private A(double d) {}
}
