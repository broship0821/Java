package part3.ex2_1.ĸ�������м�������������;

import java.util.Scanner;

public class ExamList {

	//Exam[] exams;
	//int current;
	//���� �̻��¸� �����Լ����� list.current �̷��� ������� ������ �ȳ��� �����ְ� �ǹ���
	//�׷��ٰ� ���⼭ current�� ���� ��������� ����� �����Լ��� ���ÿ� ��������
	//�׷��� �������� �ڷ�� private�� �ٸ� Ŭ�������� ��� ���ϰ� �ؾߵ�
	//���� ���⿡ �ִ� current���� ������ ���� �ʹٸ� ���� Ŭ������ �ͼ� ��� �� public�� �Լ��� �����ٰ� ����ؾߵ�
	
	private Exam[] exams;
	private int current;
	
	public void printList() {
		printList(current);
	}

	public void printList(int size) {
		// �ν��Ͻ� �޼ҵ�
		System.out.println("����������������������������������");
		System.out.println("��           ����  ���                  ��");
		System.out.println("����������������������������������");
		System.out.println();

		Exam[] exams = this.exams; // �̷��� exams�� 2���� ������ this. �־�ߵ�

		for (int i = 0; i < size; i++) {
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

	public void inputLIst() {
		// �ν��Ͻ� �޼ҵ�
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

		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;

		/*
		 * Exam[] exams = list.exams; int size = list.current;
		 * 
		 * if(exams.length==size) { Exam[] temp = new Exam[size+5]; for(int i
		 * =0;i<size;i++) temp[i] = exams[i]; list.exams = temp; }
		 * 
		 * list.exams[list.current] = exam; list.current++;
		 */
		// �ν��Ͻ� �޼ҵ�� �ٲ��� list���� �޾Ƽ� ���°� �ƴ� �� �޵� �װ� ���� �ֵ��� this�� �ٲ���ߵ�

		Exam[] exams = this.exams; // �̷��� exams�� 2���� ������ this. �־�ߵ�
		int size = current;

		if (exams.length == size) {
			Exam[] temp = new Exam[size+5];
			for(int i =0;i<size;i++)
        		temp[i] = exams[i];
			this.exams = temp; //���� this �Ƚ�ٰ� ��������, temp�̿��� �迭 ���� �ø��Ⱑ �ȵ�, ���� ����� this ��ߵǰ� ����� ���� �������� �𸣰���

		}

		this.exams[current] = exam; //���⵵ this �� ����ߵ�, �Ƹ� exams��� �迭�� 2���ϱ� ���������� ���°� ����
		current++;
	}

	
	// init ���� ���� �ٸ� Ŭ�������� ����ϴ� ���� �Լ��� �ƴ϶�
	// �ѹ��� ���Ǵ� �ʱ�ȭ �Լ��̱� ������ �����ڸ� ����ؾߵ�
	//public void init() {
	//	exams = new Exam[3];
	//	current = 0;
	//}
	public ExamList() {
		exams = new Exam[3]; // �ڵ����� ����� �Ǹ� �ΰ��� �Ǵµ� ���� [3]���� �ʱ�ȭ�� ��Ű�� �����ϱ� �̷��� ������ �������
		current = 0;
	} // ��� �⺻ ������, ��� �̰� ���� �ʾƵ� �����Ϸ��� �ڵ����� �������, �ٵ� ������ �����ε��� ���� �����ε� �����ڸ� ������ٸ� �����ڰ� �ϳ��� �ֱ� ������ �ڵ����� ����� ���� ����

}
