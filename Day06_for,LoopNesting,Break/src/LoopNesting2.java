import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {

		/*
		 ������ �ϳ� �Է¹޾Ƽ� �ش� ���ڱ����� ��� �Ҽ��� ���η� ����ϰ�
		 �� �Ҽ����� ���� ���ϴ� ���� �ۼ�
		 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		int total = 0; //�Ҽ����� �� ���� ����� ����
		
		System.out.print("�Ҽ�: ");
		
		for(int j=2;j<=num;j++) {
			//System.out.println(j);
			int count = 0; //������ ������ Ƚ���� �� �� ����
			
			for(int i=1;i<=j;i++) {
				if(j%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.printf("%d ", j);
				total += j;
			}
		}
		
		System.out.println();
		System.out.printf("�Ҽ����� �� ��: %d\n", total);
		
		sc.close();
	}

}
