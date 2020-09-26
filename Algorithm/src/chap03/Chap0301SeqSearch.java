package chap03;

import java.util.Scanner;

public class Chap0301SeqSearch {
	
	static int seqSearch(int[] a, int key) {
		for(int i=0; i<a.length;i++) {
			if(key == a[i]) return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인덱스: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.printf("x[%d] : ", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		int result = seqSearch(x, key);
		
		if(result==-1)
			System.out.println("찾지 못했습니다.");
		else {
			System.out.println(result + "인덱스에 있습니다.");
		}

	}

}
