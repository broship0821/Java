package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class Chap0201MaxOfArray {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>max) max = a[i];
		
		a[0] = 999; //아무 이유 없이 대입해봄
		max++;
		
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0;i<height.length;i++) {
			System.out.printf("%d번째 사람 키: ", i+1);
			height[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(height));
		System.out.println("젤 큰키: " + maxOf(height));
		System.out.println(Arrays.toString(height)); //height[]랑 a[]랑 똑같은 객체 참조하기 때문에 값이 바뀜

	}

}
