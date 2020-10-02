package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q03SearchIdx {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int j = 0;
		
		for(int i=0;i<n;i++) {
			if(a[i] == key) {
				idx[j] = i;
				j++;
			}
		}
		
		return j;
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
		
		int[] tmp = new int[num];
		int[] idx = new int[searchIdx(x, num, key, tmp)];
		
		System.out.println("개수" + searchIdx(x, num, key, idx));
		System.out.println(Arrays.toString(idx));

	}

}
