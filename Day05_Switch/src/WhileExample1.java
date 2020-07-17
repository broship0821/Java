
public class WhileExample1 {

	public static void main(String[] args) {

		//1~10까지 누적합 구하기
//		
//		int sum = 0;
//		int i = 0;
//		while(i<10) {
//			i++;
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 반복문의 3 요소: begin, end, step
		
		int total = 0; // 누적합을 담아줄 변수
		int n = 1; //제어변수: 반복문의 횟수를 제어할 변수(begin)
		while(n<=10) { // 논리형 조건식: 반복문의 끝을 지정(end)
			total += n;
			n++; // 증감식: 반복문의 종료를 위해 제어변수의 값을 조정(step)
		}
		System.out.printf("1~10의 누적합: %d\n", total);
		
		System.out.println("-------------------------------------");
		
		int i = 0;
		while(i<10) {
			System.out.println("반갑습니다");
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
