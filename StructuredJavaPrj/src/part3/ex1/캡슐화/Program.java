package part3.ex1.ĸ��ȭ;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		//���⿡ �ִ� �κе鵵 ExamListŬ������ ����Ǹ� ������ �ޱ� ������ �ʱ�ȭ�� �ش� Ŭ�������� ����ߵ�
		//list.exams = new Exam[3];
		//list.current = 0;
		ExamList.init(list); //���� ���� �� �ʱ�ȭ�� �ش� Ŭ�������� �ض�
		
		int menu;
        boolean keepLoop = true;			
		
                
		while(keepLoop)
		{
			menu = inputMenu();
	        switch(menu) {
	        case 1:	        	
				ExamList.inputLIst(list);//�Լ��� �ٸ� Ŭ������ �־���� ������ Examlist.�� ����ִ� �Լ��� ����Ұ��� �˷���ߵ�
		        break;
	        case 2:		        
	        	ExamList.printList(list, 2);	        	
		        break;
	        case 3:
	        	System.out.println("Bye~~");	        	
	        	keepLoop = false;
				break;
	        
	        default:
	        	System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");
	       
	        }
		}
		
	}
	
	
	static int inputMenu() {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("����������������������������������");
        System.out.println("��           ���� �޴�                   ��");
        System.out.println("����������������������������������");
        System.out.println("\t1. �����Է� ");
        System.out.println("\t2. ������� ");
        System.out.println("\t3. ���� ");
        System.out.println("\t����> ");
         int menu = scan.nextInt();
        return menu;
    }

	

}
