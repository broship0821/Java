package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton(); //싱글톤이라 이 객체는 더이상 생성 못함
//		s1.method1();
//		s1.method2();
		//싱글톤 패턴
		//통합적으로 관리해야하는 객체는 굳이 여러개의 객체를 생성해서 데이터 낭비할 필요 없음
		//하나만 생성해서 통합적으로 관리하게 하는게 더 좋음
		
//		Singleton s2 = Singleton.s; //이렇게 하면 모두가 해당 객체를 수정할수 있게 됨, 생성한 객체도 private 해줘야됨
		
		
		Singleton s2 = Singleton.getInstance();
		s2.method1();
		s2.method2();
		
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		//이렇게 해도 다 똑같은 객체임
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

	
	
	
	
	
	
	}
	
}
