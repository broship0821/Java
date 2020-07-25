/*
 
 멤버 변수(field, class member variable)
 	1. 클래스 블록에 선언된 변수를 의미
 	2. 메모리의 heap 영역에 저장되며 값을 초기화 하지 않아도
 	각 데이터 타입의 기본 값으로 자동 초기화됨
 	3. 객체를 가리키고 있는 레퍼런스변수(참조변수)가 사라지거나
 	주소값을 잃어버리게 되면, 메모리에서 가비지 컬렉터(gc)에 의해
 	자동으로 제거됨

 지역 변수(local variable)
 	1. 메서드나 생성자 블록 내부에서 선언된 변수를 의미
 	2. 메모리의 stack 영역에 저장되며, 선언된 블록을 벗어나면
 	메모리에서 자동으로 제거됩니다.
 	3. 값을 초기화 하지 않으면 변수를 사용할 수 없음
 	
 */

public class MemberLocalVariable {

	int a; //멤버 변수
	
	void printNumber(int c) { //매개 변수
		int b=0; //지역 변수
		System.out.println("멤버 변수: " + a); //멤버 변수는 자동 초기화
		System.out.println("지역 변수: " + b); //지역변수는 초기화 시켜줘야 사용 가능
		System.out.println("매개 변수: " + c); //매개변수는 값을 받지 않으면 메서드 실행조차 안되기 때문에 초기화 할필요 옶음
		
	}
	
	public static void main(String[] args) {
		
		
		
		MemberLocalVariable a = new MemberLocalVariable();
		a.printNumber(4);
		
		
		
	}

}
