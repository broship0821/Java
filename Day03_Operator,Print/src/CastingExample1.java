
public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변활할 때는
		 자바 가상머신(JVM)이 자동으로 타입을 올려서 반환해줌
		 (promotion, upcasting)
		 */
		
		byte b = 10;
		int i = b; //자동으로 b를 int로 바꿔줌
		System.out.println(i);
		
		char c = 'A';
		int j = c;
		System.out.println("A의 유니코드 번호: " + j);
		
		int k = 500;
		double d = k;
		System.out.println(d);
		

	}

}
