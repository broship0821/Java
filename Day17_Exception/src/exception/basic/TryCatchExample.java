package exception.basic;

public class TryCatchExample {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;
		System.out.println("나눗셈 시작!");
		
		try {
			//try블록 내부에는 예외 발생 가능성이 있는 코드를 작성
			System.out.printf("%d / %d = %d\n", i, j, i/j);
		}
		catch(Exception e) { //Exception e: 모든 에러를 다 받아드림, 에러 종류를 알고 있으면 Exception 대신 에러 종류 쓰기
			//catch블록 내부에는 try에서 예외가 발생했을 시 실행할 코드 작성
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
//		System.out.printf("%d / %d = %d\n", i, j, i/j); //에러 발생 지점
		
		System.out.println("프로그램 정상 종료");
		
		//예외처리 자체는 쉬우나 어떻게 적용시키고 어떻게 보완하는지가 어려움

	}

}
