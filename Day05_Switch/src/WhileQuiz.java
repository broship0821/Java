import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 정수를 2개 입력받기 (x,y)
		 x~y까지 누적 합계를 구하기
		 x부터 y까지의 누적합계: z
		 */

		int x, y, z = 0;
		System.out.print("정수 1 입력: ");
		x = sc.nextInt();
		System.out.print("정수 2 입력: ");
		y = sc.nextInt();
		
		if(x>y) {
			int tmp = y;
			y = x;
			x = tmp;
		}
		
		
		int i = x;
			
		while(i<=y) {
			z += i;
			i++;
		}
		System.out.printf("%d부터 %d까지의 누적합계: %d\n", x, y, z);
		
		sc.close();
		
	}

}
