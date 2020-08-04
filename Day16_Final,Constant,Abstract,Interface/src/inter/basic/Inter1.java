package inter.basic;

public interface Inter1 extends Inter {

	//인터페이스에서 변수를 선언하면 자동으로 상수로 취급함
	double INCH = 2.54;
	
	//인터페이스는 생성자를 선언할 수 없음
//	public Inter1() {
//		System.out.println("인터페이스의 생성자");
//	}
	
	//인터페이스에서 메서드를 선언하면 자동으로 추상 메서드로 취급함
	void method1();
	
	//인터페이스는 클래스의 틀, 껍데기, 그 어떠한 값도 저장할 수 없음
	
}
