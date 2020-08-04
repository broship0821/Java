package inter.basic;

public class ImplClass2 implements Inter1{

	@Override
	public void testMethod() {
		System.out.println("테스트 메서드 재정의");
		
	}

	@Override
	public void method1() {
		System.out.println("인터페이스 1의 메서드 재정의");
		
	}

}
