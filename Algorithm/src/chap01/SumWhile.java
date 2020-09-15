package chap01;

import java.util.Scanner;

public class SumWhile {
	
	static int sumOf(int a, int b) {
		int sum=0;
		int c;
		if(b<a) {
			c=b;
			b=a;
			a=c;
		}
		for(int i=a;i<=b;i++) {
			sum += i;
			System.out.print(i);
			if(i!=b)
				System.out.print("+");
			else
				System.out.print("=");
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력: ");
//		int num = sc.nextInt();
		
		//for문 이용한 방법
//		int sum=0;
//		for(int i=1;i<=num;i++) {
//			sum += i;
//			System.out.print(i);
//			if(i!=num)
//				System.out.print("+");
//			else
//				System.out.print("=");
//		}
//		System.out.println(sum);
		
		//가우스의 덧셈
//		int sum = 0;
//		if(num%2==0) {//짝수
//			sum = (1+num)*(num/2);
//		} else
//			sum = (1+num)*(num/2)+(1+num)/2;
//		
//		System.out.println(sum);
		
		System.out.println(sumOf(10,10));

	}

}
