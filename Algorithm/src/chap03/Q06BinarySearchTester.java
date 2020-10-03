package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q06BinarySearchTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인덱스: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		System.out.println("오름차순으로 입력");
		
		System.out.print("arr[0]: ");
		arr[0] = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.printf("arr[%d]: ", i);
				arr[i] = sc.nextInt();
			} while(arr[i] < arr[i-1]); //앞에 요소보다 큰 값만 입력하게끔
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int result = Arrays.binarySearch(arr, key);
		
		if(result<0){
			System.out.println("삽입 포인트: " + (result+1)*-1);
		}
		else
			System.out.println(result + "번째 인덱스에 있습니다.");

	}

}
