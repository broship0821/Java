import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		System.out.println();
		System.out.println("--------------------------------");
		
		System.out.print("�Է��Ͻ� ���� ");
		
		if(num == 0) {
			System.out.println("0�Դϴ�.");
		}
		else if(num % 7 == 0) {
			System.out.println("7�� ����Դϴ�.");
		}
		else {
			System.out.println("7�� ����� �ƴմϴ�.");
		}
		System.out.println("--------------------------------");
		sc.close();
		
		
	}

}
