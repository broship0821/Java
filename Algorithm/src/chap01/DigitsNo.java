package chap01;

import java.util.Scanner;

public class DigitsNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("정수 입력: ");
			n = sc.nextInt();
		}while(n<=0);
		
		int count = 0;
		while(n!=0) {
			n /= 10;
			count++;
		}
		System.out.printf("그 수는 %d자리 입니다.", count);

	}

}
