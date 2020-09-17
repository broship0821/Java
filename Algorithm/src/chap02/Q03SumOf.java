package chap02;

public class Q03SumOf {
	
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = {1, 3, 2, 4, 6, 5, 7, 9, 10, 8};
		System.out.println(sumOf(a));
	}

}
