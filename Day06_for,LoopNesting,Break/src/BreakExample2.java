import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {

		/*
		 ���ѷ���
		 	�ݺ� Ƚ���� ������ �ʰ� �����ϰ� �ݺ����� �����ϴ� ����
		 	
		 	ó�� �ݺ����� ������ �� �����ڰ� ������ ��Ȯ�� �ݺ� Ƚ����
		 	�ľ��� �� ���ٸ�, ���� ������ ������ �ΰ�
		 	Ư�� ������ ���� ������ �� �ֵ��� �ڵ带 ����
		 	
		 	�Ϲ������� ��Ȯ�� �ݺ� Ƚ���� �˰� �ִٸ� for���� ����ϰ�,
		 	��Ȯ�� �ݺ� Ƚ���� �𸥴ٸ� while�� ���� ���� ������ �����Ͽ�
		 	��� for(;;), while(true)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------");
			System.out.println("15 x 6 == ???");
			System.out.print("��: ");
			int answer = sc.nextInt();
			
			if(answer == 90) {
				System.out.println("�����Դϴ�!");
				break;
			}
			else {
				System.out.println("�����Դϴ�");
			}
		}
		System.out.println("111");
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
