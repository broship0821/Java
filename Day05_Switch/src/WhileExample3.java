import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		/*
		 ���� 1���� �Է¹޾Ƽ� �ش� ������ �Ҽ�(prime number)������ �Ǻ�
		 */
		//���� �Է�
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		int count = 0;
		//1���� �ϳ��� ��������
		int i = 1;
		while(i<=num) {
			if(num%i==0) {
				count++;
			}
			i++;
		}
		//�� �������°� 2���� �Ҽ�
		if(count==2) {
			System.out.println("�Է��Ͻ� ������ �Ҽ��Դϴ�.");
		}
		else {
			System.out.println("�Է��Ͻ� ������ �Ҽ��� �ƴմϴ�.");
		}

		sc.close();
	}

}
