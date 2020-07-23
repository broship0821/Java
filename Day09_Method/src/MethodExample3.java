import java.util.Arrays;

/*
��ȯ��, ��ȯ ���� (return value, return type)

1. ��ȯ���̶� �޼����� ���� ������� �ǹ�

2. �Ű� ������ ������ ���� �� ������ ��ȯ���� �ϳ��� ����

3. 

4. ���޵Ǵ� ���� Ÿ���� ��ȯ �����̶�� �ϸ�, �޼��带 �����Ҷ�
�޼��� �̸� �տ� �ݵ�� ��ȯ ������ ����Ͽ��� ��

5. ��ȯ���� �ִ� �޼���� ȣ�⹮�� �ϳ��� ������ ó���� �� �� �ֱ� ������
��ȯ���� �ٸ� ������ �����Ҽ��� �ְ� �ٸ� �޼����� �Ű������ε� ó���ɼ� ����
 	
 6. ��� �޼��尡 ��ȯ���� �ִ°� �ƴ�, �޼��� ���� ��
 ��ȯ�� ���� ���� ���ٸ� return ���� ����
 
 7. ��ȯ�� ���� �������� �޼��� ����� void ��� Ű���� �ۼ�
 
 8. ��� �޼���� return�� ������ ������ �޼��尡 �����
 ���� ���� ���� return�� �Ʒ��� �ڵ带 �ۼ��� �� ����
 void�޼��忡���� returnŰ���带 Ż�� ������� ����Ҽ� ����
 */

public class MethodExample3 {

	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int[] operateTotal(int n1, int n2) {
		//return�� �Լ� ���Ḧ ���ϱ� ������ return �ؿ��� ������� ����
//		return n1 + n2;		
//		return n1 - n2;
//		return n1 * n2;
//		return n1 / n2;
		
		return new int[] {add(n1, n2), n1-n2, n1*n2, n1/n2}; //�޼��� �ȿ� �޼��� ��� ����
		//�������� ���� �����Ϸ��� �迭 ���
		//�迭 �����Ҷ� static �ڿ� �迭���� �������ߵ�
	}
	
	static double[] calcArrayTotal(int[] nums) {
		int total = 0;
		for(int i=0;i<nums.length;i++) {
			total += nums[i];
		}
		double avg = (double)total/nums.length;
		
		return new double[] {total, avg};
	}
	
	static void multi(int n1, int n2) {
		int result = n1 * n2;
		System.out.printf("%d * %d = %d\n", n1, n2, result);
	}
	
	static void divide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("0�� ���� �� �����ϴ�");
			return; //�޼��� ����, void������ ��� ����
		}
		
		int result = n1 / n2;
		
		System.out.printf("%d / %d = %d\n", n1, n2, result);
		
	}

	
	public static void main(String[] args) {
		
		int r1 = add(3, 8); //int r1 = 11;
		int r2 = add(10, 15); //int r2 = 25;
		int r3 = add(add(4,6), add(7,8)); //int r3 = (4+6) + (7+8)
		
		int[] totalResult = operateTotal(30, 6);
		System.out.println("30 + 6 = " + totalResult[0]);
		System.out.println("30 - 6 = " + totalResult[1]);
		System.out.println("30 * 6 = " + totalResult[2]);
		System.out.println("30 / 6 = " + totalResult[3]);
		
		/*
		 1. �޼��� �̸��� calcArrayTotal
		 2. �� �޼���� ���� �迭 �ϳ��� ���޹޾� �ش� �迭 ���ο� �ִ�
		 ��� ������ �հ�(int)�� ���(double)�� �迭�� �ٽ� ��Ƽ� ����
		 3. 2���� ������ �޼��带 �����ϰ�, ������ ȣ���ؼ�
		 �հ�� ���(�Ҽ��� 2�ڸ�����) ���
		 */
		
		int[] nums = {57, 89, 78, 91, 93, 47};
		double[] darr = calcArrayTotal(nums);
		
		System.out.println(Arrays.toString(darr));
		
		System.out.printf("�հ�: %d\n", (int)darr[0]);
		System.out.printf("���: %.2f\n", darr[1]);
		
		System.out.println("-------------------------------");
		
		/*
		 ��ȯ���� ���� void Ÿ���� �޼���� ���� ���ƿ��� �ʱ� ������
		 ���� ����� ������ ���� �Ҽ� ����, �ٸ� �޼����� �Ű������ε�
		 ����� �Ұ���
		 
		 �ݵ�� �ܵ� ȣ���ؼ� ���
		 
		 void �޼���� �ܼ��� ������ �����ϴ� ��Ȱ�� ����
		 */
		
		
		multi(10, 7);
//		int r4 = multi(10, 7); // error
//		add(multi(2,2), multi(2,2)) //error
		
		divide(20, 5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
