package inter.basic;

public class ImplClass1 implements Inter1, Inter2 {


	/*
	 1. 인터페이스에 명세된 기능을 사용하려면 클래스에서
	 헤당 인터페이스를 구현해야됨
	 
	 2. 인터페이스를 구현하는 키워드는 implements
	 
	 3. 인터페이스는 상속과는 달리 여러 개의 인터페이스들을
	 동시에 다중 구현할 수 있음
	 (변수는 다 상수고 메서드는 다 추상메서드라서 결국 내용은 다 클래스에서 생성됨
	 다중으로 상속받아도 구분이 되기 때문에 다중 상속 가능)
	 
	 4. 또한 인터페이스들끼리 서로 상속이 가능하며, 이 경우
	  다중 상속이 가능함
	  
	 5. 인터페이스를 구현할 때 인터페이스 내부에 선언된 추상 메서드들을
	 반드시 전부 오버라이딩 해야됨
	 */
	
	@Override
	public void method1() {
		System.out.println("인터페이스1의 메서드 재정의");
		
	}

	@Override
	public void method2() {
		System.out.println("인터페이스2의 메서드 재정의");
		
	}

	@Override
	public void testMethod() {
		System.out.println("테스트 메서드 재정의");
		
	}
	
}
