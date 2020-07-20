import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {

		/*
		 1. 2������ ������ 1~100������ ������ �߻����Ѽ�
		 ���������� ������ ������ �� ������ �Է¹�������.
		 
		 ����ڰ� 0�� �Է��ϸ� �ݺ����� Ż���Ű����
		 
		 2. ����  ���Ŀ� ���� Ƚ���� ���� Ƚ���� ���� ����ϼ���.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------");
		System.out.println("�����÷��� 0�� �Է��ϼ���");
		
		int correct = 0;
		int wrong = 0;
		
		while(true) {
			
			int cal = (int) (Math.random()*2);
			int num1 = (int) (Math.random()*100) + 1;
			int num2 = (int) (Math.random()*100) + 1;
			
			if(cal==0) {
				System.out.printf("%d + %d = ???\n", num1, num2);
				System.out.print("��: ");
				int answer = sc.nextInt();
				if(answer == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				else if(answer == num1+num2) {
					System.out.println("�����Դϴ�!");
					correct++;
				}
				else {
					System.out.println("�����Դϴ�");
					wrong++;
				}
			}
			else {
				System.out.printf("%d - %d = ???\n", num1, num2);
				System.out.print("��: ");
				int answer = sc.nextInt();
				if(answer == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				else if(answer == num1-num2) {
					System.out.println("�����Դϴ�!");
					correct++;
				}
				else {
					System.out.println("�����Դϴ�");
					wrong++;
				}
			}
		}
		System.out.println("-----------------");
		System.out.printf("���� Ƚ��: %dȸ\n", correct);
		System.out.printf("���� Ƚ��: %dȸ\n", wrong);
		
		sc.close();
	}

}
