package static_.method;

public class Count {

	public int a; //인스턴스 변수
	
	public static int b; //정적 변수
	
	/*
	 인스턴스 메서드:
		 인스턴스 메서드 안에서는 정적 변수와
		 인스턴스 변수 모두 참조가 가능함
	 */
	
	public int method1() {
		return this.a + Count.b;
	}
	
	/*
	 static 블록(메서드, 정적 초기화자):
	 	static 블록 내부에서는 static이 붙은 변수나 메서드만 사용 가능
	 	static 블록 내부에서 non-static멤버를 사용하려면 반드시 객체를 생성해서 주소값을 통해 참조해야됨
	 */
	
	public static int method2() {
//		return this.a + Count.b;
		//static 메서드는 객체 생성 없이도 사용 가능하기에
		//this는 사용할 수 없음
		Count ccc = new Count();
		return ccc.a + Count.b; //Count. 이건 생략 가능
	}
	
	
	
}
