import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** ������ ��õ ���α׷� ***");
		System.out.println("- ������ �ϰ� ���� �����̳� ���� �Է��ϼ���.");
		System.out.print(">>>> ");
		
		String season = sc.next();
		
		switch(season) {
		case "3":
		case "4":
		case "5":
		case "��":
			System.out.println("��õ �������� ���ǵ� �������� �Դϴ�.");
			break;
		case "6":
		case "7":
		case "8":
		case "����":
			System.out.println("��õ �������� �ؿ�� �Դϴ�.");
			break;
		case "9":
		case "10":
		case "11":
		case "����":
			System.out.println("��õ �������� ���ǻ� �Դϴ�.");
			break;
		case "12":
		case "1":
		case "2":
		case "�ܿ�":
			System.out.println("��õ �������� ������ �Դϴ�.");
			break;
			
		default:
			System.out.println("�����̳� ���� �߸� �Է��ϼ̽��ϴ�.");
		}

	}

}
