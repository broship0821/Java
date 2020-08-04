package inter.basic;

public class ImplClass3 implements Inter2{

	@Override
	public void testMethod() {
		System.out.println("테스트 메서드 재정의");
		
	}

	@Override
	public void method2() {
		System.out.println("인터페이스2의 메서드 재정의");
		
	}

}
