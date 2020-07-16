import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		int height = sc.nextInt();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println();
		System.out.println("--------------------------------");
		if(height>=140 && age>=8) {
			System.out.println("입장이 가능합니다!");
		}
		else {
			System.out.println("죄송합니다, 입장 할 수 없습니다.");
		}
		System.out.println("오늘 하루 즐거운 시간 되세요~!");
		System.out.println("--------------------------------");
		sc.close();
		
		
	}

}
