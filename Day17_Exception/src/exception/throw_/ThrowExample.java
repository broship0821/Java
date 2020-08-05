package exception.throw_;

public class ThrowExample {

	public static int calcSum(int end) throws Exception {
		
		if(end<=0) {
//			System.out.println("매개값은 0보다 커야 합니다!");
			//이러고 메서드를 종료시켜야됨
//			break; -> if문은 탈출시킬 수 없음
//			return; -> int값을 무조건 반환시켜야됨
			//둘다 안됨, 이 시점에서 강제로 예외를 발생시킴
			throw new Exception();
			
		}
		
		int total = 0;
		for(int i=1;i<=end;i++) {
			total += i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		
		try {
			
			int result = calcSum(100);
			System.out.println(result);
			
			int result2 = calcSum(-120);
			System.out.println(result2);
			
		} catch (Exception e) {
			//throw new Exception()로 메서드를 끝내고 경고 문구를 이곳에 작성
			System.out.println("매개값은 0보다 커야 합니다!");
		}
		

	}

}
