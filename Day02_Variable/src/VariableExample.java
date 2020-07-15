
public class VariableExample {

	public static void main(String[] args) {

		/*
		 # 변수 (variable)
		 프로그램 실행 시 자주 사용되는 값을 저장하기 위한 공간
		 1. 변수는 데이터가 저자오디는 공간에 이름을 붙여놓은 것입니다.
		 2. 변수는 생성할때 변수에 저장되는 데이터의 크기와 모양에 따라
		 적당한 데이터 타입을 설정
		 ex) int: 4byte 정수, String: 문자열(문장)
		 3. 변수는 동일한 이름으로 중복 선언할 수 없음
		 4. 변수 내부의 값은 언제든지 변경가능
		 */
		
		// 변수의 선언: 자료형(데이터 타입) 변수명;
		int age;
		
		// 변수의 초기화: 변수명 = 값;
		age = 20; // = :대입 연산자 좌측은 영역 우측은 값, 좌측의 영역에 우측의 값을 대입시킴

		// 변수의 값 참조(사용)
		System.out.println(age);
		
		// 변수는 선언과 동시에 초기화 진행 가능, 단 처음 선언시 1회만 가능
//		int score;
//		score = 95;
		
		int score = 95;
		System.out.println(score);
		
//		int score = 90; Error, 똑같은 변수명 사용 불가능
		score = 90; //변수의 값 변경시 자료형은 쓰지 않음
		System.out.println(score);
		
		//변수에는 다른 변수의 값도 저장 가능
		int doubleScore = score * 2;
		System.out.println(doubleScore);
		
		//변수의 자료형에 맞지 않는 데이터는 저장 불가능
//		int count = "한번"; Error
//		int count = 24.5; Error
//		String str = 100; Error
		
		//변수는 자료형이 달라도 이름이 동일하다면 중복 선언할 수 없음
		String name = "홍길동";
//		int name = 572; error
		
		//선언 및 초기화하지 않은 변수는 참조 불가능
//		int result = doubleScore + num Error, num을 선언하지 않음
		int result;
//		System.out.println(result); //Error, 값이 없으면(초기화되지않으면) 출력되지 않음, 초기화 필요
		
	}

}
