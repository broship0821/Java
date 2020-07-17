import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		/*
		 정수 1개를 입력받아서 해당 정수가 소수(prime number)인지를 판별
		 */
		//정수 입력
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		int count = 0;
		//1부터 하나씩 나눠보기
		int i = 1;
		while(i<=num) {
			if(num%i==0) {
				count++;
			}
			i++;
		}
		//딱 떨어지는게 2개면 소수
		if(count==2) {
			System.out.println("입력하신 정수는 소수입니다.");
		}
		else {
			System.out.println("입력하신 정수는 소수가 아닙니다.");
		}

		sc.close();
	}

}
