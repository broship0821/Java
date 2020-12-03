package lambdastream;

public class Ex01fuctionInterface {

	public static void main(String[] args) {
//		Object obj = (a, b) -> a>b?a:b; //람다식, 익명객체
		
//		MyFunction f = new MyFunction() {
//			public int max(int a, int b) { //오버라이딩 - 접근제어자는 좁게 못바꾼다
//				return a>b?a:b;
//			}
//		};
		//위에걸 람다식으로 변환
		MyFunction f = (a, b) -> a>b?a:b;
		int value = f.max(3,5); //함수형 인터페이스
		System.out.println(value);

	}

}

@FunctionalInterface //함수형 인터페이스는 단 하나의 추상메서드만 가져야됨
interface MyFunction {
	int max(int a, int b);
}
