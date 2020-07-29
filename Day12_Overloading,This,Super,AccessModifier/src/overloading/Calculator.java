package overloading;

public class Calculator {

	/*
	 오버로딩(중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
	 생성자를 여러개 중복해서 선언할 수 있게 해주는 문법
	 
	 오버로딩 적용 조건:
	 	1. 매개 변수의 데이터 타입이 다르거나
	 	2. 매개 변수의 전달 순서가 다르거나
	 	3. 매개 변수의 갯수가 다르거나
	 */
	
	void inputData() {}

	void inputData(int a) {} //매개 변수가 다름
	
	void inputData(int a, int b) {} //매개변수 갯수가 다름
	
	void inputData(String s) {} //매개변수 데이터 타입 다름
	
	void inputData(int a, double d) {} //전달 순서 다름
	
	void inputData(double d, int a) {} //전달 순서 다름
	
//	void inputData(int num) {} //이건 2번째거랑 똑같음
	
//	int inputData(int num) { //반환유형(return type)은 오버로딩에 영향을 미치지 않음
//		return num;
//	}
	
	
	static int calcRectArea(int a) {
		return a*a;
	}
	static int calcRectArea(int a, int b) {
		return a*b;
	}
	static int calcRectArea(int a, int b, int c) {
		return (a+b)*c / 2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
