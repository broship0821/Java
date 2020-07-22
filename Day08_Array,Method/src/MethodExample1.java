/*
 Method 메서드
 	메서드는 반복되는 코드에 이름을 붙여놓은 것
 	
 	메서드는 반복되는 코드를 줄여주고
 	좀 더 구조화시켜서 우리가 코드를 알아보기 쉽게 함
 	
 	메서드는 선언하는 과정과 호출하는 과정으로 나누어짐
 	
 	메서드의 선언은 메서드 내부에서는 불가능
 	새로운 메서드의 선언은 반드시
 	메서드 블록 외부 and 클래스 블록 내부에서만 가능
 	
 	메서드 호출은 메서드나 생성자 블록 내부에서만 가능
 	
 	메서드의 호출은 곧 메서드를 사용하는것을 의미
 	메서드가 필요로 하는 데이터(매개값)를 호출할때 전달하면
 	그 값을 받아서 메서드 내부 로직이 실행되고,
 	그 실행 결과값을 호출부로 다시 반환
 */

public class MethodExample1 {

	//메서드의 선언
	static int calcTotal(int x) {
		int total = 0;
		for(int i=1;i<=x;i++) {
			total+=i;
		}
		return total;
	}
	
	
	
	public static void main(String[] args) {
		
		//메서드 호출
		int result = calcTotal(10);
		System.out.println(result);
		
		System.out.println(calcTotal(100));

	}

}
