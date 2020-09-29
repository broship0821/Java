package chap03;

import java.util.Scanner;

public class Q01SeqSearchSen {
	
	static int seqSearch(int[] a, int n, int key) {

		int i;
		a[n] = key;
//		for(i=0;i<=n;i++) {
//			if(a[i]==key) break;
//		}
		for (i = 0; a[i] != key; i++)
			;
		/*
		 a 배열의 마지막 값이 보초니까 for문 종료 조건을 a[i] != key로 써도됨
		 */
		return i==n ? -1 : i;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인덱스: ");
		int num = sc.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0;i<num;i++) {
			System.out.printf("x[%d] : ", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		int result = seqSearch(x, num, key);
		
		if(result==-1)
			System.out.println("찾지 못했습니다.");
		else {
			System.out.println(result + "인덱스에 있습니다.");
		}

	}

}
