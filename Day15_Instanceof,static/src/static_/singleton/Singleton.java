package static_.singleton;

public class Singleton {

	/*
	 싱글톤 디자인 패턴: 클래스의 객체 생성을 단 1개로 제한하기 위한 디자인 패턴
	 
	 1. 외부에서 이 클래스의 객체를 생성할 수 없도록 생성자를 단 한개만
	 선언한 후 private 접근 제한을 붙임.(private 생성자 생성하기)
	 */
	private Singleton() {
		System.out.println("객체가 생성됨");
	}
	
	public void method1() {
		System.out.println("꼭 필요한 메서드");
	}
	
	public void method2() {
		System.out.println("무조건 사용해야 하는 메서드");
	}
	
}
