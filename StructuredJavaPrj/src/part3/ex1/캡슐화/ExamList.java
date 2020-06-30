package part3.ex1.ĸ��ȭ;

import java.util.Scanner;

public class ExamList {
	
	Exam[] exams;
	int current;
	//ĸ��ȭ, ����ü�� ����ϴ� �Լ����� �Ѱ��� ��Ƴ� �̷��� �����ִ� ������ ����Ǹ� �� Ŭ������ ������ ����
	static void printList(ExamList list) {
		printList(list, list.current); // �����ε� �Լ� ����ȭ
		
	}
	
	static void printList(ExamList list, int size) {
		System.out.println("����������������������������������");
        System.out.println("��           ����  ���                  ��");
        System.out.println("����������������������������������");
        System.out.println();
        //�� �Լ��� �Ű������� �Էµ� ��ŭ�� ��µ�
        //int size = list.current;
        Exam[] exams = list.exams;
        
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

	static void inputLIst(ExamList list) {
		
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
        		temp[i] = exams[i]; // list�ȿ��ִ� exams�迭�� temp�迭�� ����
        	// 3. exams = temp; �ϸ� list�ȿ��ִ� �迭�� �ٲ�°� �ƴ϶� ������������ ������ exams�� �ٲ�
        	// list.exams�� ���θ��� temp �迭�� �����Ҽ��ְ� �ؾߵ�
        	list.exams = temp;
        	
        }
        
        
        list.exams[list.current] = exam;
        list.current++; // list�ȿ� �ִ� �� �ٲ�� ������ ���� ������ �Ǽ� ������
        
		
	}

	
	
	public static void init(ExamList list) {
		list.exams = new Exam[3];
		list.current = 0;
	}
}
