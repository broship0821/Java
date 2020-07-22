/*
 �Ű����� (parameter, argument)
 	1. �Ű������� �޼��带 ȣ���� ��, �޼��� ���࿡ �ʿ��� ������
 	�޼��� ���η� �����ϴ� �Ű�ü ��Ȱ�� ��
 	
 	2. �޼��� ȣ��ο��� � �Ű����� �����ϴ��Ŀ� ����
 	�޼����� ���� ����� �޶��� �� ����
 	
 	3. �Ű����� � �޾� ��������� �޼��带 ������ �� ����ο���
 	()�ȿ� �̸� ������ Ÿ���� �����ؾߵ�
 	
 	4. �Ű� ������ �ϳ��� �������� ���� �� ����, �� ���� �޼����� ����ο�
 	() ���θ� �����, ȣ���� ���� ()�� ����� ȣ��
 	
 */

public class MethodExample2 {

	//x~y������ ������
	static int calcRangeTotal(int start, int end) {
		int total = 0;
		for(int i=start;i<=end;i++) {
			total += i;
		}
		return total;
	}
	
	//�Ű������� �ʿ� ���� ���
	static String selectRandomFood() {
		double rn = Math.random();
		if(rn > 0.66) {
			return "ġŲ";
		}
		else if (rn > 0.33) {
			return "����";
		}
		else {
			return "����";
		}
	}
	
	//������ ������ �����ϸ� �� �������� �� ���� �����ϴ� �޼���
	static int calcNumberTotal(int[] nums) { //��Ȯ�� ��� ������ �𸦶��� �迭�� ����
		int total = 0;
		for(int num : nums) {
			total += num;
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		int result = calcRangeTotal(3, 7); //�Ű����� ������ ������ Ÿ���� �Ű��ߵ�
		System.out.println(result);
		System.out.println(calcRangeTotal(1, 2));
		
		System.out.println(selectRandomFood());
		
		int[] nums = {10,20,30,40,50};
		
		int sum = calcNumberTotal(nums);
		System.out.println(sum);

	}

}
