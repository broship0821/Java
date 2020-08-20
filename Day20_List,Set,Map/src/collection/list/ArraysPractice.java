package collection.list;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class ArraysPractice {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,22,33}, {44,55,66}};
		
		//toString: 배열 보여줌
		System.out.println("arr= " + Arrays.toString(arr));
		System.out.println("arr2D= " + Arrays.deepToString(arr2D)); //2차원 배열 출력방법

		//.copyOf(배열, 길이): 배열 복사
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3); //3개만 복사
		int[] arr4 = Arrays.copyOf(arr, 7); //넘는 값은 0(기본값) 대입
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4); //범위 지정
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2= " + Arrays.toString(arr2));
		System.out.println("arr3= " + Arrays.toString(arr3));
		System.out.println("arr4= " + Arrays.toString(arr4));
		System.out.println("arr5= " + Arrays.toString(arr5));
		System.out.println("arr6= " + Arrays.toString(arr6));
		
		//.fill(배열, val) 해당 배열은 전부 val로 채움
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("arr7= " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, IntUnaryOperator);
		
	}

}
