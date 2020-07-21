import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		String[] names = new String[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<names.length;i++) {
			System.out.print("�̸��� �Է��ϼ���: ");
			String name = sc.next();
			
			/*
			 �ڹٿ����� ���ڿ� ���� �񱳽� '==' �����ڸ� ����ϸ�
			 ����� �� �Ұ�
			 
			 ���ڿ� String�� �⺻ ������ Ÿ���� �ƴ�
			 ��ü ���� Ÿ����
			 
			 ���ڿ� ���� �񱳸� ������ ����
			 �� ���ڿ�1.equals(�񱳹��ڿ�2)�� ����ؾ�
			 ���ڿ� ���� �� ����
			 */
			
			if(name == "�׸�") { //���ڿ��� ==���� �� �Ұ�, ���ڿ��� ������ �Ȱ��Ƶ� ���� ��ġ�� �ٸ�
				System.out.println("�Է��� �����մϴ�");
				break;
			}
			
			if(name.equals("�׸�")) {
				System.out.println("�Է��� �����մϴ�");
				break;
			}
			
			names[i] = name;
		}
		
		System.out.println(Arrays.toString(names));
		
		//null�����ϰ� ����ϱ�
		System.out.println("---------------------------------");
		System.out.print("�Է¹��� �̸�: ");
		for(String str : names) {
			if(str == null) break;
			System.out.print(str + " ");
		}

	}

}
