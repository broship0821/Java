import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {

		//1. �迭 ������ ���� 
		int[] arr; //�迭�� �ϳ��� ������ Ÿ������ ���⶧���� ������ Ÿ�� �ڿ� [] ����
		int arr2[]; //c ��Ÿ��, �ظ��ϸ� ������ ����

		//2. �迭 ��ü�� ���� - ���� ������ ����� ������ ����,
		arr = new int[5];
		
		//3. �迭�� �ʱ�ȭ - �迭 ���ο� ���� ������ ����
		//�迭�� �ʱ�ȭ�� �ε����� ���� �����մϴ�.
		//�ε����� �迭 ������ ��ġ�� ������ �� �ִ� ���Դϴ�.
		//�ε����� 0������ �����Ͽ� 1�� ���������� ����
		
		arr[0] = 65; //int�� �����߱⶧���� �Ǽ��� ���ڿ� ���� �Ұ�
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = 3;
		arr[4] = 100;
		//arr[5] = 77; ������ ����� ������ ������ ����
		
		//4.�迭�� �� ũ�� Ȯ�� -> �迭������.length
		System.out.println("arr�迭�� ����: " + arr.length);
		
		//5.�迭�� ����� ���� ����(���)�ϴ� ��.
		System.out.println("�迭�� 1��° ������: " + arr[0]);
		System.out.println("�迭�� 2��° ������: " + arr[1]);
		System.out.println("�迭�� 3��° ������: " + arr[2]);
		System.out.println("�迭�� 4��° ������: " + arr[3]);
		System.out.println("�迭�� 5��° ������: " + arr[4]);
		
		//6.�迭�� �ݺ��� ó��
		//�迭�� �ε��� ��ȣ�� ������� Ȱ���Ͽ� �ݺ����� ���� ó���� �� ����
		System.out.println("---------------------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("�迭�� %d��° ������: %d\n", i+1, arr[i]);
		}
		
		//7.�迭 ������ ��Ұ��� ���ڿ� ���·� �Ѵ��� ����ϱ�
		//System.out.println(arr); �̰� �ּҰ� ��µ�
		//Array.toString() Ŭ���� ���
		System.out.println(Arrays.toString(arr));
		//�迭�� stack�� ����Ǵ°� �ƴ϶� heap������ �����, �ű⼭ �ּҸ� ������
		
		//8.�迭�� ����� ������ ���ÿ� �ϱ�
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		
		//�迭�� �ڵ����� �ʱⰪ �� ����
		System.out.println("---------------------");
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		
		//9.�迭�� ������ ���ÿ� �ʱ�ȭ�� �����ϴ� ���
		char[] letters = new char[] {'A', 'B', 'C', 'D'};
		System.out.println(Arrays.toString(letters));
		
		//����� ���ÿ� �ʱ�ȭ �Ҷ� �� 1���� ������ ����
		String[] names = {"ȫ�浿", "��浿", "�ڱ浿"};
		System.out.println(Arrays.toString(names));
		
		//�迭�� ũ��� ���Ƿ� �ø��ų� ���� �� ����
//		names = {"ȫ�浿", "��浿", "�ڱ浿", "�̱浿"}; //�ѹ� �����ϰ� ������ ��� �Ұ�
		names = new String[] {"ȫ�浿", "��浿", "�ڱ浿", "�̱浿"}; //�̷��� ���� ������ ��ߵ�
		
		
		
		
	}

}
