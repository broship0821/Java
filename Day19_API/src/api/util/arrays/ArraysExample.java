package api.util.arrays;

import java.util.Arrays;

class ArraysExample {

	public static void main(String[] args) {
		
		//배열의 복사
		char[] arr1 = {'J', 'A', 'V', 'A'};
		char[] arr2 = arr1; //이건 주소값만 참조, 복사가 아님
		
		arr1[2] = 'g'; //값이 둘다 바뀜
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[2] = 'V';
		
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr3));
		
		char[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
		System.out.println(Arrays.toString(arr4));
		
		System.out.println("------------------------------------");
		
		//배열 탐색: Arrays.binarySearch()
		//필수 조건: 정렬이 되어 있어야됨
		
		int[] nums = {1, 3, 5, 13, 9, 11, 7};
		System.out.println(Arrays.binarySearch(nums, 11));
		
		System.out.println("------------------------------------");
		
		//배열 정렬
		int[] numbers = {213, 23, 124, 25, 64, 3};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("------------------------------------");
		
		//배열 내부 요소의 일치 여부 확인
		System.out.println(Arrays.equals(arr1, arr4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
