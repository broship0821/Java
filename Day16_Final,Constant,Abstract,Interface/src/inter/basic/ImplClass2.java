package inter.basic;

public class ImplClass2 implements Inter1{

	@Override
	public void testMethod() {
		System.out.println("Inter 메서드 재정의");
		
	}

	@Override
	public void method1() {
		System.out.println("Inter1의 메서드 재정의");
		
	}

}
