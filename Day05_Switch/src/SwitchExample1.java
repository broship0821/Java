import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int point = sc.nextInt();
		
		/*
		 switch Ű���� �ڿ� ������ ��ȣ �ȿ��� boolean�� ���ǽ��� �ƴ�
		 ������ ������ ������� ����� �ϸ�, Ÿ���� ����, ���ڿ��� ����
		 */
		
				
		switch(point/10) { //������ ���������� ���ڸ� �Է� ����
		case 10:
			if(point>100) {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			// ���� break; �Ⱦ��� �ڵ����� case9�� �����
		case 9:
			System.out.println("����� ������ A�Դϴ�.");
			break; //Ż�⹮(�ش� ���̽��� �����ϰ� switch�� ��������)
		case 8:
			System.out.println("����� ������ B�Դϴ�.");
			break;
		case 7:
			System.out.println("����� ������ C�Դϴ�.");
			break;
		case 6:
			System.out.println("����� ������ D�Դϴ�.");
			break;
		default:
			
			if(point>100) {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			
			System.out.println("����� ������ F�Դϴ�.");
			
		}

	}

}
