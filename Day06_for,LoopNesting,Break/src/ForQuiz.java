import java.util.Scanner;

public class ForQuiz {

	public static void main(String[] args) {

		/*
		 구구단 단수를 입력받은 후 해당 단수의 구구단 출력하기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단수를 입력하세요: ");
		int dan = sc.nextInt();
		System.out.printf("*** 구구단 %d단 ***\n", dan);
		System.out.println("------------------------");
		for(int i=1;i<10;i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}

		sc.close();
	}

}
