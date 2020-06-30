package part3.ex1.캡슐화;

import java.util.Scanner;

public class ExamList {
	
	Exam[] exams;
	int current;
	//캡슐화, 구조체를 사용하는 함수들을 한곳에 모아놈 이러면 여기있는 구조가 변경되면 이 클래스만 영향을 받음
	static void printList(ExamList list) {
		printList(list, list.current); // 오버로딩 함수 집중화
		
	}
	
	static void printList(ExamList list, int size) {
		System.out.println("┌───────────────┐");
        System.out.println("│           성적  출력                  │");
        System.out.println("└───────────────┘");
        System.out.println();
        //이 함수는 매개변수로 입력된 만큼만 출력됨
        //int size = list.current;
        Exam[] exams = list.exams;
        
        for(int i=0;i<size;i++) {
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

	static void inputLIst(ExamList list) {
		
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
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
        
		/*
		 * 여기까지 하면 list.exams에 대입된 3개의 배열만 사용 가능, 더 사용 가능하게 할려면
		 * if(!exams에 공간이 있는지) {
		 * 		공간 늘리기; 
		 * } 이렇게 해줘야됨
		 */
        //배열 크기 늘리기
        Exam[] exams = list.exams;
        int size = list.current;
        
        if(exams.length==size) {
        	// 1. 크기가 5개정도 더 큰 새로운 배열(temp)생성하기
        	Exam[] temp = new Exam[size+5];
        	// 2. 값 이주시키기
        	for(int i =0;i<size;i++)
        		temp[i] = exams[i]; // list안에있는 exams배열을 temp배열에 대입
        	// 3. exams = temp; 하면 list안에있는 배열이 바뀌는게 아니라 지역변수에서 지정한 exams가 바뀜
        	// list.exams가 새로만든 temp 배열을 참조할수있게 해야됨
        	list.exams = temp;
        	
        }
        
        
        list.exams[list.current] = exam;
        list.current++; // list안에 있는 값 바꿨기 때문에 서로 참조가 되서 공유됨
        
		
	}

	
	
	public static void init(ExamList list) {
		list.exams = new Exam[3];
		list.current = 0;
	}
}
