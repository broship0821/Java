package part3.ex5.�߻�ȭ;

import java.util.Scanner;

public abstract class ExamConsole {
	
	private ExamList list;// = new ExamList();
	
	public ExamConsole() {
		list = new ExamList();
	}

	public void input() {
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

		//Exam exam = new Exam(kor, eng, math); //exam�� ����� ����ϸ� �ȵ�
		//���丮 �޼ҵ�
		Exam exam = makeExam(); // �̷� �߻� �޼ҵ带 �� ����	
		//�̰� �Ű������� ���� ���� ���ϴ� setters��ߵ�
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		
		// ������ �Է��ϴ� ���, �ؿ��� �����͸� �߰��ϴ� ���----------------------------
		list.add(exam);
		
	}
	
	
	protected abstract Exam makeExam();
	// �߻� �޼ҵ�� �߻� Ŭ���������� ��� ����
	

	public void print() {
		print(list.size());
	}

	public void print(int size) {
		System.out.println("����������������������������������");
		System.out.println("��           ����  ���                  ��");
		System.out.println("����������������������������������");
		System.out.println();


		for (int i = 0; i < size; i++) {
			Exam exam = list.get(i);//this.exams[i];
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
}
