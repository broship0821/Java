package poly.basic;

//자바에서는 하나의 파일에 여러개 클래스 선언 가능
//파일명과 동일한 이름의 클래스가 반드시 존재해야하며
//해당 클래스만 public으로 선언할 수 있음, 나머지는 패키지 프랜들리로만 가능
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}
/*
 상속관계:
 A - B - D
   - C - E
   1. B 랑 C는 완전 다른 객체임
   
   2. 하나의 자식이 2개의 부모를 가질 수 없음 - 다중 상속 불가
   		class E extends C extends B 이렇게 못함
   		자바는 단일 상속만 가능
 
 */

public class Basic {

	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	/*
	 다형성이란 자식 객체가 모든 부모의 타입을 가질 수 있다는 것을 의미합니다.
	 
	 부모 타입 변수에 자식 객체의 주소값을 얼마든지 저장할 수 있다는 것을 의미합니다.
	 
	 자식이 부모의 타입을 가질 수 있음
	 
	 클래스 타입을 하나로 규격화 시킴 -> 생산성 증가
	 */
	A v1 = new B(); //클래스 타입 B -> A 타입으로 자동 형 변환(promotion)됨
	A v2 = new C();
	A v3 = new D();
	A v4 = new E();
	A v5 = b;

	B v6 = new D();
	C v7 = new E();
	
	//상속 관계가 없다면 다형성 적용이 불가능
	//다형성은 무조건 상속 관계 하에서만 발생함
	
//	B v8 = new E(); //상속 관계가 없기에 안됨
//	C v9 = new D();
//	B v10 = new C();
//	D v11 = new E();
	
	//Object는 자바의 최상위 클래스임
	//모든 클래스는 Object를 상속받음
	Object o1 = new A();
	Object o2 = new B();
	Object o3 = new C();
	Object o4 = new D();
	Object o5 = new E();
	Object o6 = new String("안녕하세요");
	Object o7 = new Basic();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
