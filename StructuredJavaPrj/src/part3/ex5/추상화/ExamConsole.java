package part3.ex5.추상화;

import java.util.Scanner;

public abstract class ExamConsole {
	
	private ExamList list;// = new ExamList();
	
	public ExamConsole() {
		list = new ExamList();
	}

	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────┐");
		System.out.println("│           성적  입력                  │");
		System.out.println("└───────────────┘");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (math < 0 || 100 < math);

		//Exam exam = new Exam(kor, eng, math); //exam은 뼈대라 사용하면 안됨
		//펙토리 메소드
		Exam exam = makeExam(); // 이런 추상 메소드를 또 만듬	
		//이건 매개변수를 통해 대입 못하니 setters써야됨
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		
		// 위에는 입력하는 기능, 밑에는 데이터를 추가하는 기능----------------------------
		list.add(exam);
		
	}
	
	
	protected abstract Exam makeExam();
	// 추상 메소드는 추상 클래스에서만 사용 가능
	

	public void print() {
		print(list.size());
	}

	public void print(int size) {
		System.out.println("┌───────────────┐");
		System.out.println("│           성적  출력                  │");
		System.out.println("└───────────────┘");
		System.out.println();


		for (int i = 0; i < size; i++) {
			Exam exam = list.get(i);//this.exams[i];
			//밖에서 성적 데이터 가져오는 부분을 따로 함수로 만듬, 이제 여기에는 오로지 출력하는 기능만 남아있음
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			int total = exam.total();
			float avg = exam.avg();
			
			
			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);

			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────");
		}

	}
}
