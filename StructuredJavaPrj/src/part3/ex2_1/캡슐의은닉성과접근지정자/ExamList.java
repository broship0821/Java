package part3.ex2_1.캡슐의은닉성과접근지정자;

import java.util.Scanner;

public class ExamList {

	//Exam[] exams;
	//int current;
	//원래 이상태면 메인함수에서 list.current 이렇게 써버리면 오류도 안나고 쓸수있게 되버림
	//그러다가 여기서 current에 대해 변경사항이 생기면 메인함수도 동시에 오류가남
	//그래서 변수같은 자료는 private로 다른 클래스에서 사용 못하게 해야됨
	//만약 여기에 있는 current같은 변수를 쓰고 싶다면 여기 클래스에 와서 사용 후 public한 함수를 가져다가 사용해야됨
	
	private Exam[] exams;
	private int current;
	
	public void printList() {
		printList(current);
	}

	public void printList(int size) {
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

	public void inputLIst() {
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
			Exam[] temp = new Exam[size+5];
			for(int i =0;i<size;i++)
        		temp[i] = exams[i];
			this.exams = temp; //여기 this 안썼다가 에러났음, temp이용한 배열 공간 늘리기가 안됨, 아직 어느때 this 써야되고 어느때 생략 가능한지 모르겠음

		}

		this.exams[current] = exam; //여기도 this 꼭 써줘야됨, 아마 exams라는 배열이 2개니까 구분지을땐 쓰는거 같음
		current++;
	}

	
	// init 같은 경우는 다른 클래스에서 사용하는 서비스 함수가 아니라
	// 한번만 사용되는 초기화 함수이기 때문에 생성자를 사용해야됨
	//public void init() {
	//	exams = new Exam[3];
	//	current = 0;
	//}
	public ExamList() {
		exams = new Exam[3]; // 자동으로 만들게 되면 널값이 되는데 지금 [3]으로 초기화를 시키고 싶으니까 이렇게 생성자 만들어줌
		current = 0;
	} // 얘는 기본 생성자, 사실 이걸 쓰지 않아도 컴파일러가 자동으로 만들어줌, 근데 생성자 오버로딩을 위해 오버로딩 생성자를 만들었다면 생성자가 하나라도 있기 때문에 자동으로 만들어 주지 않음

}
