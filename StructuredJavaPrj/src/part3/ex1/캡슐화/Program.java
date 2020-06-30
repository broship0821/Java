package part3.ex1.캡슐화;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		//여기에 있는 부분들도 ExamList클래스가 변경되면 영향을 받기 때문에 초기화도 해당 클래스에서 해줘야됨
		//list.exams = new Exam[3];
		//list.current = 0;
		ExamList.init(list); //변수 생성 및 초기화도 해당 클래스에서 해라
		
		int menu;
        boolean keepLoop = true;			
		
                
		while(keepLoop)
		{
			menu = inputMenu();
	        switch(menu) {
	        case 1:	        	
				ExamList.inputLIst(list);//함수를 다른 클래스에 넣어놨기 때문에 Examlist.로 어디있는 함수를 사용할건지 알려줘야됨
		        break;
	        case 2:		        
	        	ExamList.printList(list, 2);	        	
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

	

}
