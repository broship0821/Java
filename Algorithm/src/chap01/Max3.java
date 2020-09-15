package chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력: ");
		int num2 = sc.nextInt();
		System.out.print("숫자3 입력: ");
		int num3 = sc.nextInt();
		
		//내꺼
//		int max;
//		if(num1 >= num2) {
//			if(num1 >=num3) {
//				max = num1;
//			} else {
//				max = num3;
//			}
//		} else {
//			if(num2 >= num3) {
//				max = num2;
//			} else {
//				max = num3;
//			}
//		}
		
		//책
		int max = num1;
		if(num2 > max) max = num2;
		if(num3 > max) max = num3;

		System.out.println("최대값: " + max);
	}

}
