package part3.ex2_0.메소드;

import java.util.Scanner;

public class ExamList {

	Exam[] exams;
	int current;
	/*
	 * void printList() { this.printList(this.current); // 오버로딩 함수 집중화
	 * 
	 * }
	 * 
	 * void printList(int size) { //인스턴스 메소드
	 * System.out.println("┌───────────────┐");
	 * System.out.println("│           성적  출력                  │");
	 * System.out.println("└───────────────┘"); System.out.println();
	 * 
	 * Exam[] exams = this.exams;
	 * 
	 * for(int i=0;i<size;i++) { Exam exam = exams[i]; int kor = exam.kor, eng =
	 * exam.eng, math = exam.math;
	 * 
	 * int total = kor + eng + math; float avg = total / 3.0f;
	 * 
	 * System.out.printf("국어 : %3d\n", kor); System.out.printf("영어 : %3d\n", eng);
	 * System.out.printf("수학 : %3d\n", math);
	 * 
	 * System.out.printf("총점 : %3d\n", total); System.out.printf("평균 : %6.2f\n",
	 * avg); System.out.println("─────────────────"); }
	 * 
	 * }
	 * 
	 * void inputLIst() { //인스턴스 메소드 Scanner scan = new Scanner(System.in);
	 * 
	 * System.out.println("┌───────────────┐");
	 * System.out.println("│           성적  입력                  │");
	 * System.out.println("└───────────────┘"); System.out.println();
	 * 
	 * 
	 * int kor, eng, math;
	 * 
	 * do { System.out.printf("국어 : "); kor = scan.nextInt();
	 * 
	 * if(kor < 0 || 100 < kor) System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
	 * 
	 * }while(kor < 0 || 100 < kor);
	 * 
	 * do { System.out.printf("영어 : "); eng = scan.nextInt();
	 * 
	 * if(eng < 0 || 100 < eng) System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
	 * 
	 * }while(eng < 0 || 100 < eng);
	 * 
	 * do { System.out.printf("수학 : "); math = scan.nextInt();
	 * 
	 * if(math < 0 || 100 < math)
	 * System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
	 * 
	 * }while(math < 0 || 100 < math);
	 * 
	 * Exam exam = new Exam(); exam.kor = kor; exam.eng = eng; exam.math = math;
	 * 
	 * 
	 * Exam[] exams = list.exams; int size = list.current;
	 * 
	 * if(exams.length==size) { Exam[] temp = new Exam[size+5]; for(int i
	 * =0;i<size;i++) temp[i] = exams[i]; list.exams = temp; }
	 * 
	 * list.exams[list.current] = exam; list.current++;
	 * 
	 * //인스턴스 메소드로 바꾼후 list값을 받아서 쓰는게 아닌 뭘 받든 그걸 쓸수 있도록 this로 바꿔줘야됨
	 * 
	 * Exam[] exams = this.exams; int size = this.current;
	 * 
	 * if(exams.length==size) { Exam[] temp = new Exam[size+5]; for(int i
	 * =0;i<size;i++) temp[i] = exams[i]; this.exams = temp;
	 * 
	 * }
	 * 
	 * this.exams[this.current] = exam; this.current++; }
	 * 
	 * public void init() { this.exams = new Exam[3]; this.current = 0; }
	 */

	// 모든 함수를 인스턴스 메소드로 바꿈, this를 썼으니 어떤 인자를 받든지 어디서든 사용 가능
	// 근데 이 this는 무조건 받는거기 때문에 지워도됨
	void printList() {
		printList(current); // 오버로딩 함수 집중화

	}

	void printList(int size) {
		// 인스턴스 메소드
		System.out.println("┌───────────────┐");
		System.out.println("│           성적  출력                  │");
		System.out.println("└───────────────┘");
		System.out.println();

		Exam[] exams = this.exams; // 이런건 exams가 2개기 때문에 this. 있어야됨

		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor, eng = exam.eng, math = exam.math;

			int total = kor + eng + math;
			float avg = total / 3.0f;

			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);

			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────");
		}

	}

	void inputLIst() {
		// 인스턴스 메소드
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
		// 인스턴스 메소드로 바꾼후 list값을 받아서 쓰는게 아닌 뭘 받든 그걸 쓸수 있도록 this로 바꿔줘야됨

		Exam[] exams = this.exams; // 이런건 exams가 2개기 때문에 this. 있어야됨
		int size = current;

		if (exams.length == size) {
			Exam[] temp = new Exam[size + 5];
			for (int i = 0; i < size; i++)
				temp[i] = exams[i];
			this.exams = temp;

		}

		exams[current] = exam;
		current++;
	}

	public void init() {
		exams = new Exam[3];
		current = 0;
	}

}
