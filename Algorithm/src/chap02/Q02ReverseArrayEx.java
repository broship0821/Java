package chap02;

import java.util.Arrays;

public class Q02ReverseArrayEx {
	
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			swap(a, i, a.length-1-i);
			System.out.printf("a[%d] 과 a[%d]를 교환\n", i, a.length-1-i);
		}
		System.out.println("역순 정렬 완료");
	}

	public static void main(String[] args) {
		int[] a = {4, 30, 29, 42, 13, 23};
		reverse(a);
		System.out.println(Arrays.toString(a));
	}

}
