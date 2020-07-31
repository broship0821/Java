package poly.casting;

public class MainClass {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 1; //부모는 자식의 멤버 변수를 사용할 수 없음
		p.method1();
		p.method2();
//		p.method3(); //부모는 자식의 메서드를 사용할 수 없음
		
		System.out.println("-------------------------");
		
		Child c = new Child();
		c.n1 = 1; //부모로부터 물려받은 속성
		c.n2 = 1; //자식 고유의 속성
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("-------------------------");

		//다형성 적용 (promotion) -> 자식의 멤버(멤버변수, 메서드) 사용 불가
		
		Parent p2 = new Child(); //p2는 Parent의 정보를 가지고 있음
		p2.n1 = 999999;
//		p2.n2 = 2; 지금은 부모 객체를 가지고 있어서 사용 불가
		
		p2.method1();
		p2.method2();
//		p2.method3(); 지금은 부모 객체를 가지고 있어서 사용 불가
		
		/*
		 다형성이 적용되면 자식 클래스의
		 본래의 멤버(멤버변수, 메서드)를 참조하지 못하는 문제가 발생
		 
		 이를 해결하기 위하여 강제 타입 변환(Downcasting)을 사용
		 */
		Child c2 = (Child) p2; //c2이랑 p2는 같은 객체임, 같은 주소 공유
		c2.n2 = 1;
		c2.method3();

		System.out.println("p2의 주소값: " + p2);
		System.out.println("c2의 주소값: " + c2);
		
		System.out.println(c2.n1); 
		//c2.n1은 한번도 값을 대입하지 않았어도 값이 나옴
		//c2랑 p2는 완전 똑같은 객체임
		
		//다형성이 한 번도 발생하지 않은 객체는 강제 형 변환을 시킬 수 없음
		
//		Child c3 = (Child) p; //Child c3 = new Parent();
		
		
		
	}

}
