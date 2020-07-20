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
		
		int count = 0; //나누어 떨어진 횟수를 세줄 변수
		//1부터 하나씩 나눠보기
		int i = 1; //소수의 판별을 위해 입력받은 정수 num을 지속적으로 나누어 볼 변수
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

		System.out.println("다른 방법---------------------------------");
		
		int j = 2;
		while(num % j != 0) {
			j++;
		} //입력한 숫자가 j로 안 나눠떨어지면 j를 1씩 추가해서 또 나눠봄
		
		//j로 나눠 떨어지는게 입력한 숫자가 되면 그 숫자는 소수가됨
		System.out.println(num == j ? "소수입니다" : "소수가 아닙니다");
		
		sc.close();
	}

}
