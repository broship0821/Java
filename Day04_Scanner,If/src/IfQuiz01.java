import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���: ");
		int height = sc.nextInt();
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
		System.out.println();
		System.out.println("--------------------------------");
		if(height>=140 && age>=8) {
			System.out.println("������ �����մϴ�!");
		}
		else {
			System.out.println("�˼��մϴ�, ���� �� �� �����ϴ�.");
		}
		System.out.println("���� �Ϸ� ��ſ� �ð� �Ǽ���~!");
		System.out.println("--------------------------------");
		sc.close();
		
		
	}

}
