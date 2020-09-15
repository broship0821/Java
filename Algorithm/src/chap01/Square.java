package chap01;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사각형
//		System.out.println("사각형 출력하기");
//		System.out.println("단 수: ");
//		int n = sc.nextInt();
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//삼각형
				System.out.println("삼각형 출력하기");
				System.out.println("단 수: ");
				int n = sc.nextInt();
				
				for(int i=0;i<n;i++) {
					for(int j=0;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}

	}

}
