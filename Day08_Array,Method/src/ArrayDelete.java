import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {

		int[] arr = {1,3,5,7,9,11,13};
		//arr�� 7�� �ٲٱ�
		/*
		 arr[3] = arr[4]
		 arr[4] = arr[5]
		 arr[5] = arr[6]
		 arr[6] = arr[7] -> �̰� �ȵ�
		 */
		//�ٲ� ��ġ���� �ϳ��� ������ �����
		for(int i=3;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		
		//arr���� �ϳ� ���� �迭 �ϳ� ����
		int[] temp = new int[arr.length-1];
		//arr�� ���� temp�� �̵�
		for(int i=0;i<temp.length;i++) {
			temp[i] = arr[i];
		}
		System.out.println(Arrays.toString(temp));
		//arr�� temp �ּҸ� �����ϵ��� �ϰ� ���̻� ���ʿ� ���� temp�� null�� ����������
		arr = temp;
		temp = null;
		System.out.println(Arrays.toString(arr));

	}

}
