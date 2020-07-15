
public class CastingExample3 {

	public static void main(String[] args) {

		/*
		서로 타입이 다른 기본 데이터의 연산시에는 데이터 타입이 큰 쪽에
		맞춰져서 자동으로 형 변환이 진행된 뒤에 연산 진행
		 */
		
		char c = 'B';
		int i = 2;
		
		int intResult = c + i; // int가 더 크니 int 타입이됨
		char charResult = (char)(c+i);
		System.out.println(intResult);
		System.out.println(charResult);
		
		
		int k = 10;
//		double d = k / 4; // int와 int의 연산
		double d = k / 4.0;//(double)k / 4; //하나라도 double로 바꿔주면 자동으로 형변환됨
		System.out.println(d);
		
		
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2); //int 보다 작은 크기의 데이터 연산은 자동으로 int로 바꿔서 출력해줌(데이터 손실 방지,오버플로우 방지)
		
			
				
	}

}
