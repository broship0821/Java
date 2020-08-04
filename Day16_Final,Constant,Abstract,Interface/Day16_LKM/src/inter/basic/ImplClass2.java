package inter.basic;

public class ImplClass2 implements Inter1 {

	@Override
	public void testMethod() {
		System.out.println("테스트 메서드 구현!");
	}

	@Override
	public void method1() {
		System.out.println("method1 구현!");
	}

}
