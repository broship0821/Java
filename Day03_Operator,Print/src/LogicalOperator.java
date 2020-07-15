
public class LogicalOperator {

	public static void main(String[] args) {

		/*
		비교(관계) 연산자 (<, <=, >, >=, ==, !=)
			좌항과 우항의 크기를 비교하여 결과값으로 항상 논리형 타입 값을
			도출함 (true, false)
		 */
		System.out.println(10 >= 10);
		
		System.out.println("------------------------------------------------------");
		
		/*
		 논리 연산자 (&, &&, |, ||)
		 	좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출함
		 1. &, &&: 양쪽 항의 논리값이 모두 true일 경우에만 true 도출
		 2. |, ||: 양쪽 항의 논리값중 한쪽만 true여도 true 도출
		 */
		
		int x = 10, y = 20;
		System.out.println(x > 10 & y < 30);
		System.out.println(x > 10 && y < 30);
		//결과는 똑같은데 밑에껀 좌항이 false면 우항은 보지도 않고 false 출력함, &&가 연산 속도가 더 빠름(단축 평가 연산)
		System.out.println(x > 10 || y < 30);
			
		System.out.println("------------------------------------------------------");
		
		/*
		 논리 반전 연산자 (!: 단항)
		 	논리값을 단순히 반전시킴: true -> false, false -> true
		 */
		
		int z = 10;
		System.out.println(z == 10);
		System.out.println(!(z == 10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
