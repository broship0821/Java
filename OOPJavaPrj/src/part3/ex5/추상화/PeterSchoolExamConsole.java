package part3.ex5.�߻�ȭ;

import java.util.Scanner;

public class PeterSchoolExamConsole extends ExamConsole{

	@Override
	protected Exam makeExam() {
		
		return new PeterSchoolExam();
	}

	@Override
	protected void onInput(Exam exam) {
		Scanner scan = new Scanner(System.in);
		
		PeterSchoolExam peterSchoolExam = (PeterSchoolExam)exam;
		int com;
		
		do {
			System.out.printf("��ǻ�� : ");
			com = scan.nextInt();

			if (com < 0 || 100 < com)
				System.out.println("��ǻ�ͼ����� 0~100������ ������ �Է��� �����մϴ�.");

		} while (com < 0 || 100 < com);
		
		peterSchoolExam.setCom(com);
		
	}

	@Override
	protected void onPrint(Exam exam) {
		PeterSchoolExam peterSchoolExam = (PeterSchoolExam)exam;
		int com = peterSchoolExam.getCom();
		System.out.printf("��ǻ�� : %3d\n", com);
		
	}

	
}
