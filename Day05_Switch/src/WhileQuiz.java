import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 ������ 2�� �Է¹ޱ� (x,y)
		 x~y���� ���� �հ踦 ���ϱ�
		 x���� y������ �����հ�: z
		 */

		int x, y, z = 0;
		System.out.print("���� 1 �Է�: ");
		x = sc.nextInt();
		System.out.print("���� 2 �Է�: ");
		y = sc.nextInt();
		
		if(x>y) {
			int tmp = y;
			y = x;
			x = tmp;
		}
		
		
		int i = x;
			
		while(i<=y) {
			z += i;
			i++;
		}
		System.out.printf("%d���� %d������ �����հ�: %d\n", x, y, z);
		
		sc.close();
		
	}

}
