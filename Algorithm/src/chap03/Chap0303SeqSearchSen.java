package chap03;

import java.util.Scanner;

public class Chap0303SeqSearchSen {
	
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		
		a[n] = key; //보초 추가
		
		while(true) {
			if(a[i]==key) break;
			i++;
		}
		
		return i==n ? -1 : i;
		//보초법
		/*
		 while문 사용시 보초법을 쓰면 조건문이 하나 줄어들어서 빨라짐
		 근데 for문 쓰는게 제일 빨라보임
		 */
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
