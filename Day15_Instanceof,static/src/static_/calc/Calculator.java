package static_.calc;

public class Calculator {
	/*
	 계산기마다 색깔이 각각 다를 수 있기 때문에 color 같은 변수는
	 데이터를 공유시키지 말고, 객체별로 따로 관리하는게 좋음
	 
	 pi 같은 원주율 값은 계산기마다 값이 동일하기 때문에
	 static을 붙여서 데이터를 공유하게 하는것이 좋음
	 
	 개별로 수정하는건 non-static (명확한 주소값이 필요),
	 통채로 관리하고 바뀌어야 하는건 static
	 */
	
	String color; //각각 다른 색깔을 입혀야 하기 때문에 static 붙이기에 적절하지 않음
	static double pi = 3.14159265; //원주율은 절대 변하지 않기 때문에 static 붙여도 됨
	
	/*
	 메서드 내부에서 non-static 데이터를 참조하고 있는 메서드는
	 해당 변수의 정확한 위치(객체의 주소값)을 알려줘야 하기 때문에
	 정적 메서드로 선언하기 부적합
	 this. <- 이거 있으면 static 부적합
	 */
	
	public void paint(String color) {
		System.out.println("계산기에 " + color + "색을 칠합니다.");
		this.color = color;
	}
	
	
	/*
	 메서드 내부에서 인스턴스 변수를 참조하지 않고, 범용성 있게 사용하는
	 메서드는 static 키워드를 붙여서 정적 메서드로 선언하는 것이 좋음
	 */
	
	public static double areaCircle(int r) {
		return r * r * pi;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
