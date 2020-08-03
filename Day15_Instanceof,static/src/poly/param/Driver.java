package poly.param;

public class Driver {

//	public Sonata buySonata() {
//		System.out.println("소나타를 구입합니다");
//		return new Sonata();
		//이렇게 하면 
//		return new Morning();을 하지 못함
		//모든 차종을 따로 메서드 작성해야됨
//	}
	
	//반환 타입을 부모로 정해주면 하나의 메서드에 자식들 객체를 리턴할 수 있음
	
	public Car buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다");
			return new Sonata();
		}
		else if(name.equals("모닝")) {
			System.out.println("모닝을 구입합니다");
			return new Morning();
		}
		else if(name.equals("테슬라")) {
			System.out.println("테슬라를 구입합니다");
			return new Tesla();
		}
		return null;
	}
	
}
