package abs.good;

public class Store extends HeadStore{

	//여기서 abstract 메서드 오버라이딩 안하면 오류남
	@Override
	public void orderApple() {
		System.out.println("사과 쥬스의 가격은 3000원 입니다.");
		
	}

	@Override
	public void orderBanana() {
		System.out.println("바나나 쥬스의 가격은 3100원 입니다.");
		
	}

	@Override
	public void orderGrape() {
		System.out.println("포도 쥬스의 가격은 3200원 입니다.");
		
	}

	@Override
	public void orderMelon() {
		System.out.println("멜론 쥬스의 가격은 3300원 입니다.");
		
	}

}
