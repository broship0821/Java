package part3.ex2_1.캡슐의은닉성과접근지정자;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		//list.init(); 이건 서비스 함수가 아니기 때문에 생성자를 사용함
		//ExamList list = new ExamList(); 여기서 new ExamList() 는 new ExamList + ()-생성자 임,
		//ExamList를 새로 생성하는 동시에 ()로 ExamLIst()를 사용, 생성될때 딱 한번만 사용가능
		//list.ExamList(); 이건 이제 사용 불가능
		
		int menu;
        boolean keepLoop = true;			
		
                
		while(keepLoop)
		{
			menu = inputMenu();
	        switch(menu) {
	        case 1:	        	
				//ExamList.inputLIst(list); static 전통적인 함수
	        	list.inputLIst(); // 인스턴스 메소드
		        break;
	        case 2:		        
	        	//ExamList.printList(list);	 
	        	list.printList();
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
