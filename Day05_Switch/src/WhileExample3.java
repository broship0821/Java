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
		
		int count = 0; //������ ������ Ƚ���� ���� ����
		//1���� �ϳ��� ��������
		int i = 1; //�Ҽ��� �Ǻ��� ���� �Է¹��� ���� num�� ���������� ������ �� ����
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

		System.out.println("�ٸ� ���---------------------------------");
		
		int j = 2;
		while(num % j != 0) {
			j++;
		} //�Է��� ���ڰ� j�� �� ������������ j�� 1�� �߰��ؼ� �� ������
		
		//j�� ���� �������°� �Է��� ���ڰ� �Ǹ� �� ���ڴ� �Ҽ�����
		System.out.println(num == j ? "�Ҽ��Դϴ�" : "�Ҽ��� �ƴմϴ�");
		
		sc.close();
	}

}
