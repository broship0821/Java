import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {

		/*
		 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를 가로로 출력하고
		 그 소수들의 합을 구하는 로직 작성
		 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		int total = 0; //소수들의 총 합을 담아줄 변수
		
		System.out.print("소수: ");
		
		for(int j=2;j<=num;j++) {
			//System.out.println(j);
			int count = 0; //나누어 떨어질 횟수를 세 줄 변수
			
			for(int i=1;i<=j;i++) {
				if(j%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.printf("%d ", j);
				total += j;
			}
		}
		
		System.out.println();
		System.out.printf("소수들의 총 합: %d\n", total);
		
		sc.close();
	}

}
