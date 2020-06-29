package part2.ex3_0.�����ͱ���ȭ;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		//Exam[] exams = new Exam[3];
		//exams[0].kor = 30; // �̷��Ը� �ϸ� ������, exams[0]�� ���� new ����� ��� ����

		/*exams[0] = new Exam();
		exams[0].kor = 30;
		System.out.printf("kor: %d", exams[0].kor);*/
		
		
		Exam[] exams = new Exam[3];
		int menu;
        boolean keepLoop = true;			
		
                
		while(keepLoop)
		{
			menu = inputMenu();
	        switch(menu) {
	        case 1:	        	
				inputLIst(exams);	        	
		        break;
	        case 2:		        
		        printList(exams);	        	
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

	private static void printList(Exam[] exams) { //�Է¹��� ������ ���� �� 3���� ���
		System.out.println("����������������������������������");
        System.out.println("��           ����  ���                  ��");
        System.out.println("����������������������������������");
        System.out.println();
        
        for(int i=0;i<3;i++) { // exams�迭 3�� ����?
	        Exam exam = exams[i]; // ���ο� exam ���� ����, �ٵ� exams[0] �� new���ʿ� ����?
	        int kor = exam.kor, eng = exam.eng, math = exam.math;
			
	        int total = kor + eng + math;
	    	float avg = total / 3.0f;
	    	
	    	System.out.printf("���� : %3d\n", kor);	   
	    	System.out.printf("���� : %3d\n", eng);	
	    	System.out.printf("���� : %3d\n", math);	
	        
	        System.out.printf("���� : %3d\n", total);
	        System.out.printf("��� : %6.2f\n", avg);
	        System.out.println("����������������������������������");
        }
		
	}

	private static void inputLIst(Exam[] exams) { //������ ���� �� 3���� �Է¹ޱ�
		
		Scanner scan = new Scanner(System.in);
    	
    	System.out.println("����������������������������������");
        System.out.println("��           ����  �Է�                  ��");
        System.out.println("����������������������������������");
        System.out.println();
		
        for(int i=0;i<exams.length;i++) {  //�̶� exams.length����.. ��?
	        int kor, eng, math;
	        
	        do {
		        System.out.printf("���� : ");
		        kor = scan.nextInt();
	        
		        if(kor < 0 || 100 < kor)
		        	System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
		        
	        }while(kor < 0 || 100 < kor);
	        
	        do {
		        System.out.printf("���� : ");
		        eng = scan.nextInt();
	        
		        if(eng < 0 || 100 < eng)
		        	System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
		        
	        }while(eng < 0 || 100 < eng);
	        
	        do {
		        System.out.printf("���� : ");
		        math = scan.nextInt();
	        
		        if(math < 0 || 100 < math)
		        	System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");
		        
	        }while(math < 0 || 100 < math);
	        
	        Exam exam = new Exam(); //exam ���� ����ϰ� �����
	        exam.kor = kor;
	        exam.eng = eng;
	        exam.math = math;
	        
	        exams[i] = exam; //�� exam ���� exams[i] �迭�� ����
        }
		
	}

	

}
