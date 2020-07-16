import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d세\n", age);
		System.out.printf("출생년도: %d년\n", 2020-age+1);
		System.out.println("----------------------------------");
		
		sc.close();
	}

}
