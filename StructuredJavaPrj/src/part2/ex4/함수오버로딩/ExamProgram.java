package part2.ex4.함수오버로딩;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

		/*
		 * Exam exam = new Exam(); // Exam()이라는 객체를 exam으로 부르기로 결정 // 참조변수는 공간을 실제로 가지고
		 * 있는게 아니라 실제로 가지고 있는 공간을 참조만 하는것임 
		 * exam.kor = 30; // exam에 있는 kor변수에 30이라는 값을 대입
		 * exam.eng = 40; exam.math = 59; System.out.printf("kor: %d", exam.kor);
		 */
		
		Exam exam = new Exam();
		
		input(exam);
		
		print(exam);

	}

	private static void print(Exam exam) {
		
		System.out.println("┌───────────────┐");
        System.out.println("│           성적  출력                  │");
        System.out.println("└───────────────┘");
        System.out.println();
        
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

	private static void input(Exam exam) {
		
		Scanner scan = new Scanner(System.in);
    	
    	System.out.println("┌───────────────┐");
        System.out.println("│           성적  입력                  │");
        System.out.println("└───────────────┘");
        System.out.println();
		
        int kor, eng, math;
        
        do {
	        System.out.printf("국어 : ");
	        kor = scan.nextInt();
        
	        if(kor < 0 || 100 < kor)
	        	System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
	        
        }while(kor < 0 || 100 < kor);
        
        do {
	        System.out.printf("영어 : ");
	        eng = scan.nextInt();
        
	        if(eng < 0 || 100 < eng)
	        	System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
	        
        }while(eng < 0 || 100 < eng);
        
        do {
	        System.out.printf("수학 : ");
	        math = scan.nextInt();
        
	        if(math < 0 || 100 < math)
	        	System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
	        
        }while(math < 0 || 100 < math);
        
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
        
        
	}

}
