/*
 매개변수 (parameter, argument)
 	1. 매개변수는 메서드를 호출할 때, 메서드 실행에 필요한 값들을
 	메서드 내부로 전달하는 매개체 역활을 함
 	
 	2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라
 	메서드의 실행 결과는 달라질 수 있음
 	
 	3. 매개값을 몇개 받아 사용할지는 메서드를 선언할 때 선언부에서
 	()안에 미리 갯수와 타입을 지정해야됨
 	
 	4. 매개 변수를 하나도 선언하지 않을 수 있음, 이 때는 메서드의 선언부에
 	() 내부를 비워둠, 호출할 때도 ()를 비워서 호출
 	
 */

public class MethodExample2 {

	//x~y까지의 누적합
	static int calcRangeTotal(int start, int end) {
		int total = 0;
		for(int i=start;i<=end;i++) {
			total += i;
		}
		return total;
	}
	
	//매개변수가 필요 없는 경우
	static String selectRandomFood() {
		double rn = Math.random();
		if(rn > 0.66) {
			return "치킨";
		}
		else if (rn > 0.33) {
			return "족발";
		}
		else {
			return "삼겹살";
		}
	}
	
	//정수를 여러개 전달하면 그 정수들의 총 합을 리턴하는 메서드
	static int calcNumberTotal(int[] nums) { //정확히 몇개를 받을지 모를때는 배열로 받음
		int total = 0;
		for(int num : nums) {
			total += num;
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		int result = calcRangeTotal(3, 7); //매개변수 순서랑 데이터 타입을 신경써야됨
		System.out.println(result);
		System.out.println(calcRangeTotal(1, 2));
		
		System.out.println(selectRandomFood());
		
		int[] nums = {10,20,30,40,50};
		
		int sum = calcNumberTotal(nums);
		System.out.println(sum);

	}

}
