import java.util.Scanner;

// 1. Scanner api �ε�: main�� scanner ���� ��Ʈ�� �����̽�


public class ScannerExample {

	public static void main(String[] args) {

		//2. Scanner ��ü�� ����
		Scanner sc = new Scanner(System.in);
		
		/*
		 3. Scanner �Լ����� �̿��Ͽ� �����͸� �Է¹��� �� ����
		 - next(): ������ ���� ���ڿ��� �Է¹���
		 - nextLine(): ������ �����ϴ� ���ڿ��� �Է¹���
		 - next + �⺻Ÿ���̸�(): �ش� Ÿ�Կ� �´� ���ڿ��� �Է¹���
		 ex) 
		 	nextInt(): ���� ������ �Է¹���
		 	nextDouble(): �Ǽ� ������ �Է¹���
		 */

		System.out.print("�̸��� �Է��ϼ���: ");
//		String name = sc.next(); //sc(Scanner)�� next()�Լ��� �̿��ؼ� �Է¹��� ���� name ���ڿ��� ����
		String name = sc.nextLine(); //������� �����ؼ� �������
//		System.out.println(name);
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
			
		
		System.out.println();
		System.out.printf("�� �̸��� %s�̰� ���̴� %d�� �Դϴ�.\n", name, age);
		
		
		//4. Scanner ��ü�� �ݳ�
		//��ü�ݳ�: Scanner�� �޸𸮿��� ����
		sc.close();
		
		
		
		
		
		
		
		
	}

}
