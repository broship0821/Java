import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		
		//���ڿ��� �̷���� ������ ���� ������ ��ȯ�ϴ� ���
		//Integer.parseInt(���ڿ� or ���ڿ��� ����ִ� ����)
//		String s1 = "10";
//		String s2 = "34";
//		System.out.println(s1 + s2);
//		int i1 = Integer.parseInt(s1);
//		int i2 = Integer.parseInt(s2);
//		System.out.println(i1 + i2);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** ���� ���� �� ���� ***");
		System.out.print("������ �־��ּ���: ");
		int coin = sc.nextInt();
		int win = 0;
		int loose = 0;
		int tie = 0;
		
		System.out.println("�ش��ϴ� �޴��� ���ڸ� �Է��� �ּ���.");
		
		outer: while(true) {
			System.out.printf("���� ������ ��: %d\n", coin);
			
			System.out.println("--------------------------------");
			System.out.println("1. ���������� ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� �����ϱ�");
			System.out.println("4. ���α׷� ����");
			System.out.println("--------------------------------");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			
			
			switch(menu) {
			case 1:
				
				while(true) {
					System.out.println();
					System.out.println("--------------------------------");
					System.out.println("����, ����, �� �߿� �ϳ��� �Է��ϼ���.");
					System.out.println("������ ������ �����ø� '�׸�' �̶�� �Է��ϼ���.");
					System.out.print("> ");
					String rsp = sc.next();
					
					int mine = 0;
					if(rsp.equals("����")) {
						mine = 0;
					}
					else if(rsp.equals("����")) {
						mine = 1;
					}
					else if(rsp.equals("��")) {
						mine = 2;
					}
					else if(rsp.equals("�׸�")){
						System.out.println("���������� ���� ����!");
						break;
					}
					
					int com = (int) (Math.random()*3);
					if(com==0) {
						System.out.println("��ǻ�Ͱ� �� ���� ����!");
					}
					else if(com==1) {
						System.out.println("��ǻ�Ͱ� �� ���� ����!");
					}
					else if(com==2) {
						System.out.println("��ǻ�Ͱ� �� ���� ��!");
					}
					
					System.out.println("--------------------------------");
					if(com==mine) {
						System.out.println("�����ϴ�.");
						tie++;
					}
					else if((mine==0&&com==2) || (mine==1&&com==0) || (mine==2&&com==1)) {
						System.out.println("�̰���ϴ�.");
						win++;
					}
					else {
						System.out.println("�����ϴ�.");
						loose++;
					}
					
					System.out.printf("���� ����: %d\n", --coin);
					if(coin==0) {
						System.out.println("--------------------------------");
						System.out.println("������ �� ���������ϴ�.");
						System.out.println("������ ��� �Ͻ÷��� ������ �� �־��ּ���.");
						System.out.println("������ �׸� �ΰ� �޴��� ���ư��÷��� '�׸�'�̶�� �Է��� �ּ���.");
						System.out.print("> ");
						String ask = sc.next();
						if(ask.equals("�׸�")) {
							System.out.println("�޴��� ���ư��ϴ�.");
							break;
						}
						else {
							coin = Integer.parseInt(ask);
							System.out.printf("������ %d�� �߰��մϴ�.\n", coin);
						}
					}
					
				}
				break;
			case 2:
				
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println("*** ���� ��� ***");
				System.out.printf("�̱� Ƚ��: %dȸ\n", win);
				System.out.printf("��� Ƚ��: %dȸ\n", tie);
				System.out.printf("�� Ƚ��: %dȸ\n", loose);
				System.out.println("--------------------------------");
				break;
			case 3:
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println("������ �־��ּ���.");
				System.out.print("> ");
				int plus = sc.nextInt();
				System.out.printf("%d���� ������ �־����ϴ�.\n", plus);
				coin += plus;
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�. [Y / N]");
				System.out.print("> ");
				char end = sc.next().charAt(0);
				if(end=='Y' || end=='y') {
					break outer;
				}
				else {
					System.out.println("���Ḧ ����մϴ�.");
				}
				break;
			}//�޴�
			
		} //��ü ���α׷�
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
