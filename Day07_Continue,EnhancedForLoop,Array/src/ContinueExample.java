import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			if(i==5) continue;
			System.out.print(i + " ");
		}
		System.out.println("\n�ݺ��� ����!");

		//1~30������ ���� �� Ȧ���� ���η� ����غ���
		
		System.out.println("-------------------");
		
		for(int i=1;i<=30;i++) {
			if(i%2==0) continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("-------------------");
		
		for(int i=1;i<=30;i++) {
			if(i%2!=0)
			System.out.print(i + " ");
		}
		System.out.println();
		
		//���ѷ������� continue ����ϱ�
		
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		
		while(true) {
			System.out.print(">>> ");
			int answer = sc.nextInt();
			
			if(answer==1) break;
			else if(answer==0) {
				System.out.println("0���δ� ���� �� �����ϴ�");
				continue;
			}
			
			System.out.println("100 / �Է��� ������ ������ ���: " + (100/answer));
			
			
		}
		
	}

}
