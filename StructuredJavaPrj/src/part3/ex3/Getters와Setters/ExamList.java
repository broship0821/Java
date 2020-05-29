package part3.ex3.Getters와Setters;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public void printList() {

		printList(current);
	}
	
	public void printList(int size) {

		System.out.println("┌───────────────┐");
        System.out.println("│           성적  출력                  │");
        System.out.println("└───────────────┘");
        System.out.println();
        
        //int size = list.current;
        Exam[] exams = this.exams;
        
        for(int i=0;i<size;i++) {
//        	getters 다른 캡슐에서 값을 가져와야할때
//        	int kor,eng,math 등 밖에서 가져오는 변수는
//        	직접적으로 가져오면 캡슐화가 깨질 수 있으니
//        	함수를 사용해서 간접적으로 가져옴
	        Exam exam = exams[i];
//	        int kor = exam.kor;
	        int kor = exam.getKor();
//	        int eng = exam.eng;
	        int eng = exam.getEng();
//	        int math = exam.math;
	        int math = exam.getMath();
	        
	        int total = kor+eng+math;
	    	float avg = total / 3.0f;
	    	
	    	
	    	System.out.printf("국어 : %3d\n", kor);
	    	System.out.printf("영어 : %3d\n", eng);
	    	System.out.printf("수학 : %3d\n", math);
	        
	        System.out.printf("총점 : %3d\n", total);
	        System.out.printf("평균 : %6.2f\n", avg);
	        System.out.println("─────────────────");
        }
	}

	public void inputList() {
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
        
        Exam exam = new Exam();
//      setters 다른곳에서 값을 가져와 설정해야될때
//    	exam.kor = kor;
//    	exam.eng = eng;
//    	exam.math = math;
        exam.setKor(kor);
        exam.setEng(eng);
        exam.setMath(math);

    	Exam[] exams = this.exams;
    	int size = current;
    	
    	if(exams.length == size) {
    		//1. 크기가 5 더큰 새로운 배열 생성
    		Exam[] temp = new Exam[size + 5];
    		//2. 값 옮기기
    		for(int i=0;i<size;i++)
    			temp[i] = exams[i];
    		//3. list.exams가 temp 참조
    		exams = temp;
    	}
    	
    	
    	exams[current] = exam;
    	current++;
        
	
	}

	public ExamList() {
		exams = new Exam[3];
		current = 0;
	}
//	생성자 오버로드(Constructor Overload)
//	public ExamList() {
//		this(3);
//	}
//	public ExamList(int size) {
//		exams = new Exam[size];
//		current = 0;
//	}
}


