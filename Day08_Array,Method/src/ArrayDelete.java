import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {

		int[] arr = {1,3,5,7,9,11,13};
		//arr의 7을 바꾸기
		/*
		 arr[3] = arr[4]
		 arr[4] = arr[5]
		 arr[5] = arr[6]
		 arr[6] = arr[7] -> 이건 안됨
		 */
		//바꿀 위치부터 하나씩 앞으로 떙기기
		for(int i=3;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		
		//arr보다 하나 작은 배열 하나 생성
		int[] temp = new int[arr.length-1];
		//arr의 값을 temp로 이동
		for(int i=0;i<temp.length;i++) {
			temp[i] = arr[i];
		}
		System.out.println(Arrays.toString(temp));
		//arr이 temp 주소를 참조하도록 하고 더이상 쓸필요 없는 temp는 null로 지워버리기
		arr = temp;
		temp = null;
		System.out.println(Arrays.toString(arr));

	}

}
