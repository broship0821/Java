package ex15.marray;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		
		//int kor1, kor2, kor3;
		int[] kors = new int[3*3];
		int total;
		float avg;
		int menu;
		
		Scanner scan = new Scanner(System.in);

		/*
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		*/
		
		for(int j=0;j<3;j++)
			for(int i=0;i<3;i++)
				kors[3*j+i] = 0;
		
		����:
		while(true) {
			
			// ���� �޴� �κ�----------------------------------
			System.out.println("����������������������������������������������");
			System.out.println("��         ���� �޴�                 ��");
			System.out.println("����������������������������������������������");
			System.out.println("\t1.���� �Է�");
			System.out.println("\t2.���� ���");
			System.out.println("\t3.����");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				// ���� �Է� �κ�----------------------------------
				System.out.println("����������������������������������������������");
				System.out.println("��         ���� �Է�                 ��");
				System.out.println("����������������������������������������������");
				
				/*
				do {
					System.out.print("\t����1 ������?");
					kor1 = scan.nextInt();
					if(kor1<0 || 100<kor1)
						System.out.println("������ 0~100 ������ ���ڿ��� �մϴ�. �ٽþ�����");
				}while(kor1<0 || 100<kor1);
				
				do {
					System.out.print("\t����2 ������?");
					kor2 = scan.nextInt();
					if(kor2<0 || 100<kor2)
						System.out.println("������ 0~100 ������ ���ڿ��� �մϴ�. �ٽþ�����");
				}while(kor2<0 || 100<kor2);
				
				do {
					System.out.print("\t����3 ������?");
					kor3 = scan.nextInt();
					if(kor3<0 || 100<kor3)
						System.out.println("������ 0~100 ������ ���ڿ��� �մϴ�. �ٽþ�����");
				}while(kor3<0 || 100<kor3);
				*/
				for(int j=0;j<3;j++)
					for(int i=0;i<3;i++)
						do {
							System.out.printf("%d�г� ����%d ������?", j+1, i+1);
							kors[3*j+i] = scan.nextInt();
							if(kors[3*j+i]<0 || 100<kors[3*j+i])
								System.out.println("������ 0~100 ������ ���ڿ��� �մϴ�. �ٽþ�����");
						}while(kors[3*j+i]<0 || 100<kors[3*j+i]);
				break;
			
				
			case 2:
				// ���� ��� �κ�----------------------------------
				
				System.out.println("����������������������������������������������");
				System.out.println("��         ���� ���                 ��");
				System.out.println("����������������������������������������������");
				
				//total = kor1 + kor2 + kor3;
				//total = kors[0] + kors[1] + kors[2];
				//avg = total / 3.0f;
				

				
				for(int j=0;j<3;j++) {
				
					total = kors[3*j+0] + kors[3*j+1] + kors[3*j+2];
					avg = total / 3.0f;
												
					System.out.printf("<%d�г� �����>------------\n", j+1);
					for(int i=0;i<3;i++)
						System.out.printf("\t����%d : %3d\n", i+1, kors[3*j+i]);
					

					System.out.printf("\t���� : %3d\n",total);
					System.out.printf("\t��� : %6.2f\n",avg);
					System.out.println("����������������������������������������������");
					
				}
				break;
			
			case 3:
				break ����;
				
			default:
				System.out.println("�� ��ó�?");
			}
		}
		System.out.print("good bye");
	}
}