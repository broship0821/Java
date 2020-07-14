
public class FloatExample {

	public static void main(String[] args) {

		/*
		 실수 리터럴의 기본 데이터 타입은 double임
		 */
		float f1 = 7.12345f;
		double d1 = 7.12345;
		System.out.println(f1);
		System.out.println(d1);
		
		System.out.println("----------------------------------------------------------");
		
		float f2 = 1.234567891234f; //소수점 7자리 까지밖에 표현 못함, 자동 반올림됨
		double d2 = 1.234567891234;
		System.out.println(f2);
		System.out.println(d2);
		
		
	}

}
