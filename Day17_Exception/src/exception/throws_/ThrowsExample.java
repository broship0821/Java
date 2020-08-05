package exception.throws_;

public class ThrowsExample {

	static String[] greetings = {"안녕", "헬로", "니하오"};
	
	
	/*
	 throws
	 	throws는 예외의 원인이 메서드 선언부가 아니라 호출부에 있을 경우
	 	예외처리를 메서드의 호출부로 떠넘기는 방식
	 	
	 	throws는 생성자에서도 선언이 가능하며, 메서드나 생성자 호출 시
	 	예외처리를 강요하고 싶을때 사용
	 	
	 	원래는 메서드 선언부랑 호출부에 둘다 예외처리를 해야하는데
	 	throws를 통해 한곳에서만 처리하게(메인) 해줄 수 있음
	 */
	
	
	static void greet(int idx) throws ArrayIndexOutOfBoundsException { //이 메서드를 부르는 메인 함수에 예외처리 떠넘기기
		System.out.println(greetings[idx]);
	}
	
	
	public static void main(String[] args) {
		
		//메인에서도 떠넘기면 메인을 부르는 JVM에 예외처리 떠넘김, 예외처리 안한다는 것과 같은 의미
		try {
			greet(3);
		} catch (Exception e) {
			
			e.printStackTrace(); //오류 메세지가 프로그램 상에서 보여짐
			//printStackTrace메서드는 예외 발생 원인을 역추적하여
			//예외가 어디에서 발생했는지, 그 이유는 무엇인지를
			//메세지를 통해 개발자에게 전달하므로 자주 사용됨
		}
		
		System.out.println("프로그램 정상 종료!");

	}

}
