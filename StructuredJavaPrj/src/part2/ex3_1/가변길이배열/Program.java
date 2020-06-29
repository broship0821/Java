package part2.ex3_1.가변길이배열;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Exam[] exams = new Exam[3]; // 얘는 참조형이라 어디다 대입하든 공유됨
		int current = 0; // 얘는 그냥 지역변수라 다른곳에서 수정이 일어나도 공유 안됨
		
		int menu;
        boolean keepLoop = true;			
		
                
		while(keepLoop)
		{
			menu = inputMenu();
	        switch(menu) {
	        case 1:	        	
				inputLIst(exams, current);	    
				current++; //일단 이렇게 하면 inputLIst의 지역변수가 아닌 main 함수의 current가 1씩 증가함
		        break;
	        case 2:		        
		        printList(exams, current);	        	
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

	private static void printList(Exam[] exams, int size) { // size는 current임, 여기 함수에서만 size라고 표시/ current값을 받아서 size에 대입 후 사용
		System.out.println("┌───────────────┐");
        System.out.println("│           성적  출력                  │");
        System.out.println("└───────────────┘");
        System.out.println();
        
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

	private static void inputLIst(Exam[] exams, int current) {
		
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
        
        Exam exam = new Exam(); //exam 변수 사용하게 만들기
        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
        
        exams[current] = exam; // 이제 입력 받은 만큼만 대입시킴
        current++; // 이러면 지역변수 current만 ++됨
        
		
	}

	

}
