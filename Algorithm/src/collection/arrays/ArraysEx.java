package collection.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11,12,13}, {21, 22, 23}};
		
		System.out.println("arr= " + Arrays.toString(arr));
		System.out.println("arr2D= " + Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

		System.out.println("arr2= " + Arrays.toString(arr2));
		System.out.println("arr3= " + Arrays.toString(arr3));
		System.out.println("arr4= " + Arrays.toString(arr4));
		System.out.println("arr5= " + Arrays.toString(arr5));
		System.out.println("arr6= " + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("arr7= " + Arrays.toString(arr7));
		
		//람다식
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println("arr7= " + Arrays.toString(arr7));
		
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + i);
		}
		
		//다차원 배열 비교하기
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //이게 정확함
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		System.out.println("chArr= " + Arrays.toString(chArr));
		System.out.println("index if B: " + Arrays.binarySearch(chArr, 'B'));
		//이진탐색 전에는 먼저 정렬 필요
		System.out.println("---정렬 후---");
		Arrays.sort(chArr);
		System.out.println("index if B: " + Arrays.binarySearch(chArr, 'B'));
	}

}
