package chap03;

import java.util.Scanner;

public class Q05BinSearch {
	static int binSearch(int[] arr, int key) {
		int start = 0; //검색 시작값
		int end = arr.length - 1; //검색 끝값
		
		do {
			int center = (start + end) / 2; //검색 중앙
			
			if(arr[center] == key) {
				for(int i=center;i>0;i--) {
					if(arr[i-1]!=key) {
						return i;
					}
				}
				return center;
			}
			else if(arr[center] < key) start = center + 1; //뒤 절반으로 줄임
			else end = center - 1; //앞 절반으로 줄임
		} while(start <= end);
		
		return -1; //검색 실패
	}
	
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
		
		int result = binSearch(arr, key);
		
		if(result == -1)
			System.out.println("찾지 못했습니다.");
		else
			System.out.println(result + "번째 인덱스에 있습니다!");
	}
}
