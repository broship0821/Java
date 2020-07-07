package part3.ex5.추상화;

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
			System.out.printf("컴퓨터 : ");
			com = scan.nextInt();

			if (com < 0 || 100 < com)
				System.out.println("컴퓨터성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (com < 0 || 100 < com);
		
		peterSchoolExam.setCom(com);
		
	}

	@Override
	protected void onPrint(Exam exam) {
		PeterSchoolExam peterSchoolExam = (PeterSchoolExam)exam;
		int com = peterSchoolExam.getCom();
		System.out.printf("컴퓨터 : %3d\n", com);
		
	}

	
}
