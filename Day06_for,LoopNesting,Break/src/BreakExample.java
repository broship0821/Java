
public class BreakExample {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i > 7) break; //����� �����̸� ���ٷ� ǥ���ϴ°� ����
			System.out.print(i + " ");
		}
		System.out.println("\n�ݺ��� ����!");

		System.out.println("-------------------------");
		
//		for(int i=0;i<=2;i++) {
//			for(int j=0;j<=1;j++) {
//				if(i==j) break;
//				System.out.println(i + "-" + j);
//			}
//		}
		
		/*
		 ���� �ݺ����� ���Ե� break�� �ٱ��� �ݺ������� �ѹ���
		 �����Ű�� �ʹٸ� �ٱ��� �ݺ����� label�� ���Դϴ�.
		 �׸��� break ����� label�� �Բ� �����մϴ�.
		 */
		
		outer: for(int i=0;i<=2;i++) { //�ݺ����� �̸� ���̱�
			for(int j=0;j<=1;j++) {
				if(i==j) break outer; //�ش� �ݺ��� ����
				System.out.println(i + "-" + j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
