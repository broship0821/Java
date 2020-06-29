package part2.ex3_3.�������̹迭�����ϱ�;

import java.util.Scanner;

public class ListProgram {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		list.exams = new Exam[3];
		list.current = 0;
		
		int menu;
        boolean keepLoop = true;			
		
                
		while(keepLoop)
		{
			menu = inputMenu();
	        switch(menu) {
	        case 1:	        	
				inputLIst(list);
		        break;
	        case 2:		        
		        printList(list);	        	
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

	private static void printList(ExamList list) {
		System.out.println("����������������������������������");
        System.out.println("��           ����  ���                  ��");
        System.out.println("����������������������������������");
        System.out.println();
        
        int size = list.current; // size��� ������ ���� list ������ �ȿ� �ִ� current�� ����
        Exam[] exams = list.exams; // list�ȿ��ִ� exams �迭 ����
        
        for(int i=0;i<size;i++) {
	        Exam exam = exams[i];
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

	private static void inputLIst(ExamList list) {
		
		Scanner scan = new Scanner(System.in);
    	
    	System.out.println("����������������������������������");
        System.out.println("��           ����  �Է�                  ��");
        System.out.println("����������������������������������");
        System.out.println();
		
        
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
        
        Exam exam = new Exam();
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
        
		/*
		 * ������� �ϸ� list.exams�� ���Ե� 3���� �迭�� ��� ����, �� ��� �����ϰ� �ҷ���
		 * if(!exams�� ������ �ִ���) {
		 * 		���� �ø���; 
		 * } �̷��� ����ߵ�
		 */
        //�迭 ũ�� �ø���
        Exam[] exams = list.exams;
        int size = list.current;
        
        if(exams.length==size) {
        	// 1. ũ�Ⱑ 5������ �� ū ���ο� �迭(temp)�����ϱ�
        	Exam[] temp = new Exam[size+5];
        	// 2. �� ���ֽ�Ű��
        	for(int i =0;i<size;i++)
        		temp = exams; // list�ȿ��ִ� exams�迭�� temp�迭�� ����
        	// 3. exams = temp; �ϸ� list�ȿ��ִ� �迭�� �ٲ�°� �ƴ϶� ������������ ������ exams�� �ٲ�
        	// list.exams�� ���θ��� temp �迭�� �����Ҽ��ְ� �ؾߵ�
        	list.exams = temp;
        	
        }
        
        
        list.exams[list.current] = exam;
        list.current++; // list�ȿ� �ִ� �� �ٲ�� ������ ���� ������ �Ǽ� ������
        
		
	}

	

}
