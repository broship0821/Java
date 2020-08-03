package static_.init;

public class MainClass {

	public static void main(String[] args) {

//		LapTop l1 = new LapTop();
//		System.out.println("노트북 정보: " + l1.info);
		//static 변수는 주소값을 지정할 필요 없음
//		LapTop l1 = new LapTop();
		System.out.println("노트북 정보: " + LapTop.info); //그렇다고 생성자를 안만들면 결과는 null이됨
		//정적 초기화자를 사용해서 초기화 시킬 수 있음
		
		/*
		 정적 초기화자를 호출하려면 클래스를 로딩하면 됨.
		 
		 클래스 로딩 방법:
		 	1. 클래스 이름을 참조하여 정적 멤버 호출하기
		 	2. 객체 생성
		 
		 정적 초기화자는 클래스 로딩 시 최초 1회만 호출됨
		 */
		System.out.println("노트북 정보: " + LapTop.info);
		System.out.println("노트북 정보: " + LapTop.info);
		System.out.println("노트북 정보: " + LapTop.info);
		LapTop l2 = new LapTop();
		LapTop l3 = new LapTop();
		LapTop l4 = new LapTop();
		LapTop l5 = new LapTop();
		

	}

}
