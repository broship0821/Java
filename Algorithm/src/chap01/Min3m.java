package chap01;

public class Min3m {
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		return min;
	}

	public static void main(String[] args) {
		System.out.println("min3(3,2,1) = " + min3(3,2,1));
		System.out.println("min3(1,2,3) = " + min3(1,2,3));
		System.out.println("min3(3,1,2) = " + min3(3,1,2));
		System.out.println("min3(1,2,1) = " + min3(1,2,1));
	}

}
