import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.printf("�̸�: %s\n", name);
		System.out.printf("����: %d��\n", age);
		System.out.printf("����⵵: %d��\n", 2020-age+1);
		System.out.println("----------------------------------");
		
		sc.close();
	}

}
