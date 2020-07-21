
public class EnhancedForLoop {

	public static void main(String[] args) {

		String[] week = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		for(int i=0;i<week.length;i++) {
			System.out.printf("%s����\n", week[i]);
		}
		System.out.println("-----------------------");
		
		//Enhanced for��, ��ü ������ ����� ��� ���� for�� ����ϴ°� ����, �� �������� ��� ����
		for(String day : week) {// ":" ���׿��� �ݺ��� �迭 �ۼ�, ���׿��� �迭 ������ Ÿ�� �̶� ���� �ۼ�
			System.out.printf("%s����\n", day);
		}
		
		System.out.println("-----------------------");
		
		/*
		 1. scores��� �̸����� int �迭�� �ϳ� �����ؼ� ���� �����͸� �ٷ� ����
		 {96, 88, 74, 63, 100, 55}
		 
		 2. ��� for��(forEach)�� ����Ͽ� ������ ����� ���غ�����
		 ����(int), ���(double, �Ҽ��� ��° �ڸ����� ǥ��)
		 */
		
	int[] scores = {96, 88, 74, 63, 100, 55};
	int total = 0;
	double avg = 0.0;
	 
	for(int num : scores) {
		total += num;
	}
	avg = (double)total/scores.length;
	
	System.out.printf("����: %d\n���: %.2f\n", total, avg);
		
	}

}
