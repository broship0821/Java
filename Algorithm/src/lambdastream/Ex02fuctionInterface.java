package lambdastream;

@FunctionalInterface //함수형 인터페이스는 단 하나의 추상메서드만 가져야됨
interface MyFunction2 {
	void run();
}
public class Ex02fuctionInterface {
	//매개변수를 함수형인터페이스로 받음
	static void execute(MyFunction2 f) {
		f.run();
	}
	//반환타입이 함수형 인터페이스
	static MyFunction2 getMyFunction() {
//		MyFunction2 f = () -> System.out.println("f3.run");
//		return f;
		return () -> System.out.println("f3.run"); //위에랑 동일
	}

	public static void main(String[] args) {
		MyFunction2 f1 = () -> System.out.println("f1.run");
		
		MyFunction2 f2 = new MyFunction2() {
			
			@Override
			public void run() {
				System.out.println("f2.run");
				
			}
		};
		
		MyFunction2 f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(new MyFunction2() {
			
			@Override
			public void run() {
				System.out.println("f2.run");
				
			}
		});
		execute(() -> System.out.println("f3.run"));

	}

}

