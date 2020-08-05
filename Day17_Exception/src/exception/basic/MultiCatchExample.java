package exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		while(true) {
			
			try {
				System.out.print("정수 입력: ");
				int n = sc.nextInt(); //InputMismatchException
				
				int result = 100 / n; //ArithmeticException
				
				System.out.println(arr[result]); //ArrayIndexOutOfBoundsException
				
				String s = null; //NullPointerException
				s.equals("안녕");
				break;
			}
			catch(InputMismatchException | ArithmeticException e) { //두개의 예외 같이 처리하기(상속관계는 불가능)
				System.out.println("입력값이 잘못되었습니다");
				sc.nextLine();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위를 벗어났습니다.");
			}
			catch(NullPointerException e) {
				System.out.println("null 오류가 발생했습니다.");
				break;
			}
			catch(Exception e) {
				//다중캐치 작성시 Exception문도 작성해서 인지하지 못한 오류도 방지하기
				//Exception은 catch문 제일 마지막에 작성해야됨
				System.out.println("알수없는 오류가 발생했습니다.");
			}
			
		}

	}

}
