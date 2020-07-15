
public class CastingExample2 {

	public static void main(String[] args) {

		/*
		 크기가 큰 데이터타입의 값을 작은 데이터 타입으로 변환하려면
		 반드시 형 변환 연산자: (type)를 사용하여 명시적으로
		 형 변환을 진행해야됨
		 (downcasting, type casting)
		 
		 명시적으로 형 변환을 하는 이유는 저장공간이 줄어들어
		 데이터 손실의 가능성이 항상 있기 때문
		 (overflow, underflow)
		 */
		
		int i = 72;
		char c = (char) i;
		System.out.println("72의 문자값: " + c);
		
		double d = 4.98765;
		int j = (int) d; // 값 손실: 자기가 표현 못하는건 다 버림
		System.out.println(j);

		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);
		// 2진수로 바꾼 후 byte가 읽을 수 있는 8비트 까지 짤라서 읽음
			
	}

}
