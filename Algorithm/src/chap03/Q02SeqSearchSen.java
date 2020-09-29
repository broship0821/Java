package chap03;

import java.util.Scanner;

public class Q02SeqSearchSen {
	
	static int seqSearch(int[] a, int n, int key) {

		System.out.print("    |");
		for(int j=0;j<n;j++)
			System.out.printf("%4d", j);
		
		System.out.println();
		System.out.print("--+");
		
		for(int j=0;j<4*n+2;j++)
			System.out.print("-");
		System.out.println();
		
		for(int i=0;i<n;i++) {
			System.out.print("    |");
			System.out.printf(String.format("%%%ds*\n", (i*4)+3), "");
			System.out.printf("%3d|", i);
			for(int k=0;k<n;k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n    |");
			if(a[i]==key)
				return i; //검색성공
		}
		return -1;//검색 실패
		
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
