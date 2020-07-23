import java.util.Arrays;

/*
반환값, 반환 유형 (return value, return type)

1. 반환값이란 메서드의 실행 결과값을 의미

2. 매개 변수는 여러개 있을 수 있지만 반환값은 하나만 존재

3. 

4. 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할때
메서드 이름 앞에 반드시 반환 유형을 명시하여야 됨

5. 반환값이 있는 메서드는 호출문이 하나의 값으로 처리가 될 수 있기 때문에
반환값을 다른 변수에 대입할수도 있고 다른 메서드의 매개값으로도 처리될수 있음
 	
 6. 모든 메서드가 반환값이 있는건 아님, 메서드 실행 후
 반환할 값이 딱히 없다면 return 생략 가능
 
 7. 반환할 값이 없을때는 메서드 선언시 void 라는 키워드 작성
 
 8. 모든 메서드는 return을 만나면 강제로 메서드가 종료됨
 따라서 조건 없이 return문 아래에 코드를 작성할 수 없음
 void메서드에서는 return키워드를 탈출 기능으로 사용할수 있음
 */

public class MethodExample3 {

	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int[] operateTotal(int n1, int n2) {
		//return은 함수 종료를 뜻하기 때문에 return 밑에는 실행되지 않음
//		return n1 + n2;		
//		return n1 - n2;
//		return n1 * n2;
//		return n1 / n2;
		
		return new int[] {add(n1, n2), n1-n2, n1*n2, n1/n2}; //메서드 안에 메서드 사용 가능
		//여러개의 값을 리턴하려면 배열 사용
		//배열 리턴할땐 static 뒤에 배열임을 명시해줘야됨
	}
	
	static double[] calcArrayTotal(int[] nums) {
		int total = 0;
		for(int i=0;i<nums.length;i++) {
			total += nums[i];
		}
		double avg = (double)total/nums.length;
		
		return new double[] {total, avg};
	}
	
	static void multi(int n1, int n2) {
		int result = n1 * n2;
		System.out.printf("%d * %d = %d\n", n1, n2, result);
	}
	
	static void divide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("0은 나눌 수 없습니다");
			return; //메서드 종료, void에서만 사용 가능
		}
		
		int result = n1 / n2;
		
		System.out.printf("%d / %d = %d\n", n1, n2, result);
		
	}

	
	public static void main(String[] args) {
		
		int r1 = add(3, 8); //int r1 = 11;
		int r2 = add(10, 15); //int r2 = 25;
		int r3 = add(add(4,6), add(7,8)); //int r3 = (4+6) + (7+8)
		
		int[] totalResult = operateTotal(30, 6);
		System.out.println("30 + 6 = " + totalResult[0]);
		System.out.println("30 - 6 = " + totalResult[1]);
		System.out.println("30 * 6 = " + totalResult[2]);
		System.out.println("30 / 6 = " + totalResult[3]);
		
		/*
		 1. 메서드 이름은 calcArrayTotal
		 2. 이 메서드는 정수 배열 하나를 전달받아 해당 배열 내부에 있는
		 모든 정수의 합계(int)와 평균(double)을 배열에 다시 담아서 리턴
		 3. 2번에 정의한 메서드를 선언하고, 실제로 호출해서
		 합계와 평균(소수점 2자리까지) 출력
		 */
		
		int[] nums = {57, 89, 78, 91, 93, 47};
		double[] darr = calcArrayTotal(nums);
		
		System.out.println(Arrays.toString(darr));
		
		System.out.printf("합계: %d\n", (int)darr[0]);
		System.out.printf("평균: %.2f\n", darr[1]);
		
		System.out.println("-------------------------------");
		
		/*
		 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 때문에
		 실행 결과를 변수에 저장 할수 없고, 다른 메서드의 매개값으로도
		 사용이 불가능
		 
		 반드시 단독 호출해서 사용
		 
		 void 메서드는 단순히 동작을 지시하는 역활만 수행
		 */
		
		
		multi(10, 7);
//		int r4 = multi(10, 7); // error
//		add(multi(2,2), multi(2,2)) //error
		
		divide(20, 5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
