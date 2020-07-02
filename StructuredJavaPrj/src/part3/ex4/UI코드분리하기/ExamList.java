package part3.ex4.UI�ڵ�и��ϱ�;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public void printList() {
		printList(current);
	}

	public void printList(int size) {
		System.out.println("����������������������������������");
		System.out.println("��           ����  ���                  ��");
		System.out.println("����������������������������������");
		System.out.println();


		for (int i = 0; i < size; i++) {
			Exam exam = this.get(i);//this.exams[i];
			//�ۿ��� ���� ������ �������� �κ��� ���� �Լ��� ����, ���� ���⿡�� ������ ����ϴ� ��ɸ� ��������
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			int total = exam.total();
			float avg = exam.avg();
			
			
			System.out.printf("���� : %3d\n", kor);
			System.out.printf("���� : %3d\n", eng);
			System.out.printf("���� : %3d\n", math);

			System.out.printf("���� : %3d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("����������������������������������");
		}

	}

	private Exam get(int i) {
		
		return this.exams[i];
	}

	public void inputLIst() {
		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������");
		System.out.println("��           ����  �Է�                  ��");
		System.out.println("����������������������������������");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("���� : ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("���� : ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("���� : ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");

		} while (math < 0 || 100 < math);

		Exam exam = new Exam(kor, eng, math);
		
		// ������ �Է��ϴ� ���, �ؿ��� �����͸� �߰��ϴ� ���----------------------------
		add(exam);
		
	}

	
	private void add(Exam exam) {
		Exam[] exams = this.exams;
		int size = current;

		if (exams.length == size) {
			Exam[] temp = new Exam[size+5];
			for(int i =0;i<size;i++)
        		temp[i] = exams[i];
			this.exams = temp;
		}

		this.exams[current] = exam;
		current++;
		
	}

	public ExamList() {
		exams = new Exam[3];
		current = 0;
	} 
	
}
