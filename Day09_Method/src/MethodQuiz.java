/*
 1. ������ �ϳ� ���޹޾� �ش��ϴ� ���� ����� ������ ���ؼ�
 �� ������ �����ϴ� �޼��带 ����
 
 2. �� �޼���� �Ű������� ���� ������ ��� ����� ���η� ����� ��
 �� ������� ������ �������ִ� �޼���
 
 3. �޼��� ������ �Ϸ��� �Ŀ� �޼��带 ȣ���Ͽ�
 10�� ����� ����, 72�� ����� ������ ���غ��� (calc_divisor)
 */
public class MethodQuiz {

	static int calc_divisor(int num) {
		int total = 0;
		System.out.printf("%d�� ���: ", num);
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				total += i;
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println("10�� ����� ����: " + calc_divisor(10));
		System.out.println("72�� ����� ����: " + calc_divisor(72));

	}

}
