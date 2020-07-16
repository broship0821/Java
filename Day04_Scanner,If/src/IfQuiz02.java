import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		System.out.println();
		System.out.println("--------------------------------");
		
		System.out.print("입력하신 값은 ");
		
		if(num == 0) {
			System.out.println("0입니다.");
		}
		else if(num % 7 == 0) {
			System.out.println("7의 배수입니다.");
		}
		else {
			System.out.println("7의 배수가 아닙니다.");
		}
		System.out.println("--------------------------------");
		sc.close();
		
		
	}

}
