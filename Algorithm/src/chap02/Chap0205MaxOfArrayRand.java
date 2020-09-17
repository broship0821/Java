package chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Chap0205MaxOfArrayRand {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max) max = a[i];
		
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
//		System.out.print("사람 수: ");
//		int num = sc.nextInt();
		
		int num = rand.nextInt(11);
		
		int[] height = new int[num];
		
		
		for(int i=0;i<num;i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println(i + ": " + height[i]);
		}
		
		System.out.println("최대값: " + maxOf(height));
	}

}
