package part2.ex3_3.가변길이배열구현하기;

import java.util.Scanner;

public class ListProgram {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		list.exams = new Exam[3];
		list.current = 0;
		
		int menu;
        boolean keepLoop = true;			
		
                
		while(keepLoop)
		{
			menu = inputMenu();
	        switch(menu) {
	        case 1:	        	
				inputLIst(list);
		        break;
	        case 2:		        
		        printList(list);	        	
		        break;
	        case 3:
	        	System.out.println("Bye~~");	        	
	        	keepLoop = false;
				break;
	        
	        default:
	        	System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
	       
	        }
		}
		
	}
	
	
	static int inputMenu() {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("┌───────────────┐");
        System.out.println("│           메인 메뉴                   │");
        System.out.println("└───────────────┘");
        System.out.println("\t1. 성적입력 ");
        System.out.println("\t2. 성적출력 ");
        System.out.println("\t3. 종료 ");
        System.out.println("\t선택> ");
         int menu = scan.nextInt();
        return menu;
    }

	private static void printList(ExamList list) {
		System.out.println("┌───────────────┐");
        System.out.println("│           성적  출력                  │");
        System.out.println("└───────────────┘");
        System.out.println();
        
        int size = list.current; // size라는 데이터 만들어서 list 데이터 안에 있는 current값 대입
        Exam[] exams = list.exams; // list안에있는 exams 배열 대입
        
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

	private static void inputLIst(ExamList list) {
		
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
        		temp = exams; // list안에있는 exams배열을 temp배열에 대입
        	// 3. exams = temp; 하면 list안에있는 배열이 바뀌는게 아니라 지역변수에서 지정한 exams가 바뀜
        	// list.exams가 새로만든 temp 배열을 참조할수있게 해야됨
        	list.exams = temp;
        	
        }
        
        
        list.exams[list.current] = exam;
        list.current++; // list안에 있는 값 바꿨기 때문에 서로 참조가 되서 공유됨
        
		
	}

	

}
