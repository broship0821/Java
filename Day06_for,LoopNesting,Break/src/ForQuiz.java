import java.util.Scanner;

public class ForQuiz {

	public static void main(String[] args) {

		/*
		 ������ �ܼ��� �Է¹��� �� �ش� �ܼ��� ������ ����ϱ�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܼ��� �Է��ϼ���: ");
		int dan = sc.nextInt();
		System.out.printf("*** ������ %d�� ***\n", dan);
		System.out.println("------------------------");
		for(int i=1;i<10;i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}

		sc.close();
	}

}
