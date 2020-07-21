import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {

		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		 지속적으로 문제를 출제한 후 정답을 입력받으세요.
		 
		 사용자가 0을 입력하면 반복문을 탈출시키세요
		 
		 2. 종료  이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------");
		System.out.println("끝내시려면 0을 입력하세요");
		
		int correct = 0;
		int wrong = 0;
		
//		while(true) {
//			
//			int cal = (int) (Math.random()*2);
//			int num1 = (int) (Math.random()*100) + 1;
//			int num2 = (int) (Math.random()*100) + 1;
//			
//			if(cal==0) {
//				System.out.printf("%d + %d = ???\n", num1, num2);
//				System.out.print("답: ");
//				int answer = sc.nextInt();
//				if(answer == 0) {
//					System.out.println("프로그램을 종료합니다.");
//					break;
//				}
//				else if(answer == num1+num2) {
//					System.out.println("정답입니다!");
//					correct++;
//				}
//				else {
//					System.out.println("오답입니다");
//					wrong++;
//				}
//			}
//			else {
//				System.out.printf("%d - %d = ???\n", num1, num2);
//				System.out.print("답: ");
//				int answer = sc.nextInt();
//				if(answer == 0) {
//					System.out.println("프로그램을 종료합니다.");
//					break;
//				}
//				else if(answer == num1-num2) {
//					System.out.println("정답입니다!");
//					correct++;
//				}
//				else {
//					System.out.println("오답입니다");
//					wrong++;
//				}
//			}
//		}
//		System.out.println("-----------------");
//		System.out.printf("정답 횟수: %d회\n", correct);
//		System.out.printf("오답 횟수: %d회\n", wrong);
		
		//-----------------------------------------------------------------------------------
		
while(true) {
			
			int cal = (int) (Math.random()*2);
			int num1 = (int) (Math.random()*100) + 1;
			int num2 = (int) (Math.random()*100) + 1;
			
			int math; //이렇게 변수 사용하면 중복 줄일 수 있음
			
			if(cal==0) {
				System.out.printf("%d + %d = ???\n", num1, num2);
				math = num1 + num2;
			}
			else {
				System.out.printf("%d - %d = ???\n", num1, num2);
				math = num1 - num2;
			}
			
			System.out.print("답: ");
			int answer = sc.nextInt();
			if(answer == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(answer == math) {
				System.out.println("정답입니다!");
				correct++;
			}
			else {
				System.out.println("오답입니다");
				wrong++;
			}
		}
		System.out.println("-----------------");
		System.out.printf("정답 횟수: %d회\n", correct);
		System.out.printf("오답 횟수: %d회\n", wrong);
		
		sc.close();
	}

}
