package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		Singleton s1 = new Singleton();
		s1.method1();
		s1.method2();
		//싱글톤 패턴
		//통합적으로 관리해야하는 객체는 굳이 여러개의 객체를 생성해서 데이터 낭비할 필요 없음
		//하나만 생성해서 통합적으로 관리하게 하는게 더 좋음
		
	}
	
}
