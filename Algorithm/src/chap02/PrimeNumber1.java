package chap02;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		int counter = 0;
		for(int n=2; n<=num;n++) {
			int i;
			for(i=2;i<n;i++) {
				counter++;
				if(n%i==0) break;
			}
			if(n==i)
				System.out.println(n);
		}
		//소수일 경우: 반복문이 끝까지 실행됨, i 랑 n이랑 같아짐
		//소수가 아닐 경우: 반복문이 끝남, i가 n보다 작음
		//입력한 값(num)내의 모든 소수를 찾음
		

	}

}
