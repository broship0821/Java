import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			if(i==5) continue;
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");

		//1~30까지의 정수 중 홀수만 가로로 출력해보자
		
		System.out.println("-------------------");
		
		for(int i=1;i<=30;i++) {
			if(i%2==0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("-------------------");
		
		for(int i=1;i<=30;i++) {
			if(i%2!=0)
			System.out.print(i + " ");
		}
		System.out.println();
		
		//무한루프에서 continue 사용하기
		
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		
		while(true) {
			System.out.print(">>> ");
			int answer = sc.nextInt();
			
			if(answer==1) break;
			else if(answer==0) {
				System.out.println("0으로는 나눌 수 없습니다");
				continue;
			}
			
			System.out.println("100 / 입력한 정수의 나눗셈 결과: " + (100/answer));
			
			
		}
		
	}

}
