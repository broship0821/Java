
public class ConditionalOperator {

	public static void main(String[] args) {

		/*
		 삼항 연산자
		 	피 연산자(연산을 당하는 값)가 3개인 연산자를 말함
		 	조건식 ? 좌항 : 우항
		 	조건식을 비교하여 true가 도출되었을 시에 좌항을,
		 	false가 도출되었을 시에 우항의 식이 실행됨
		 */
		
		System.out.println(5==4 ? "참" : "거짓");
		
		String result = (5!=4 ? "참" : "거짓");
		
		System.out.println(result);

		
		//난수(랜덤값)를 발생시키는 메서드
		// Math.random()
		// 0.0~1.0 미만의 랜덤 실수값을 반환
		
//		double rn = Math.random();
//		System.out.println(rn);
		
		// 1~10까지 하는 방법
//		int rn1 = (int)(Math.random()*10) + 1;
//		System.out.println(rn1);
		
		// 10~100까지
		int rn2 = (int) ((Math.random()*91) + 10);
		System.out.println(rn2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
