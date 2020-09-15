package chap01;

public class Median {
	
	static int med3(int a, int b, int c) {
		int median;
		if(a>=b) {
			if(b>=c) 
				median = b;
			else if(a<=c)
				median = a;
			else
				median = c;
		} else if(a>c)
			median = a;
		else if(b>c)
			median = c;
		else
			median = b;
		return median;
	}
	
	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1));
		System.out.println("med3(3,2,2) = " + med3(3,2,2));
		System.out.println("med3(3,1,2) = " + med3(3,1,2));
		System.out.println("med3(3,2,3) = " + med3(3,2,3));
		System.out.println("med3(2,1,3) = " + med3(2,1,3));
		System.out.println("med3(3,3,2) = " + med3(3,3,2));
		System.out.println("med3(3,3,3) = " + med3(3,3,3));
		System.out.println("med3(2,2,3) = " + med3(2,2,3));
		System.out.println("med3(2,3,1) = " + med3(2,3,1));
		System.out.println("med3(2,3,2) = " + med3(2,3,2));
		System.out.println("med3(1,3,2) = " + med3(1,3,2));
		System.out.println("med3(2,3,3) = " + med3(2,3,3));
		System.out.println("med3(1,2,3) = " + med3(1,2,3));
	}

}
