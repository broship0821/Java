package exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryQuiz {

	public static void main(String[] args) {

		/*
		 1. 스캐너를 사용하여 정수 2개 입력받기
		 2. 입력받은 값이 정수라면 단순히 정수 2개를 출력하고 반복문 종료
		 3. 입력받은 값이 예외를 발생시킬 수 있는 값(실수,문자열 등)이라면
		 "정수로만 입력하세요!" 를 출력 후 다시 정수를 입력받게 하기
		 4. 마지막에 반복문을 탈출하면 "프로그램 정상 종료!" 문장이
		 출력되도록 예외처리를 하기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("정수 1 입력: ");
				int num1 = sc.nextInt(); //이때 정수가 아닌 값이 들어오면 에러를 발생시키고 들어온 값은 버퍼에 남아있음
				System.out.print("정수 2 입력: ");
				int num2 = sc.nextInt();
				
				System.out.printf("나눗셈 결과: %d\n", num1/num2);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요!");
				sc.nextLine(); //버퍼 비우기
			}
			catch(ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			catch(Exception e) {
				System.out.println("알수없는 오류가 발생했습니다.");
			}
			
		}
		System.out.println("프로그램 정상 종료!");		
		sc.close();
		
		
	}

}
