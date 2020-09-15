package chap01;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		int b;
//		do {
//			System.out.print("b의 값: ");
//			b = sc.nextInt();
//		}while(b<=a);
		while(true) {
			System.out.print("b의 값: ");
			b = sc.nextInt();
			if(b>a) break;
			System.out.println("a보다 큰 값을 입력하세욧!");
		}
		
		System.out.println("b - a = " + (b-a));

	}

}
