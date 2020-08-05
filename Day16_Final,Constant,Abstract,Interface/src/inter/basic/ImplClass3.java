package inter.basic;

public class ImplClass3 implements Inter2{

	@Override
	public void testMethod() {
		System.out.println("Inter 메서드 재정의");
		
	}

	@Override
	public void method2() {
		System.out.println("Inter2의 메서드 재정의");
		
	}

}
