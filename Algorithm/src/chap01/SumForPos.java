package chap01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("1부터 n까지의 합 구하기");
		
//		do {
//			System.out.print("n: ");
//			n = sc.nextInt();
//		} while(n<=0);
		
		while(n<=0) {
			System.out.print("n: ");
			n = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합은 %d입니다.", n, sum);

	}

}
