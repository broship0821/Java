import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���: ");
		int height = sc.nextInt();
		
		if(height>=140) {
			System.out.print("���̸� �Է��ϼ���: ");
			int age = sc.nextInt();
		
			if(age>=8) {
				System.out.println("������ �����մϴ�!");
			}
			else if(age>=6) {
				System.out.println("��ȣ�� ���� �� ž���� �����մϴ�.");
			}
			else {
				System.out.println("�˼��մϴ�, ���̰� 6�� �̸��Դϴ�.");
				System.out.println("���̱ⱸ ž���� �Ұ��մϴ�.");
			}
		}
		else {
			System.out.println("�˼��մϴ�, Ű�� 140cm �̸��Դϴ�.");
			System.out.println("���̱ⱸ ž���� �Ұ��մϴ�.");
		}
		System.out.println("���� �Ϸ� ��ſ� �ð� �Ǽ���~!");

		System.out.println(height);
//		System.out.println(age);
		//��ϱ��� ������ ������ ������ �ش� ��ϱ��������� ��� ����
		//������ {} �ȿ��� ����ǰ� ����, �ش� ��ϳ������� Ȱ�� ����
		//��ϱ���, {}�� ������ �޸𸮿��� ������

		sc.close();
		
		
	}

}
