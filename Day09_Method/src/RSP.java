import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		
		//문자열로 이루어진 정수를 실제 정수로 변환하는 방법
		//Integer.parseInt(문자열 or 문자열이 들어있는 변수)
//		String s1 = "10";
//		String s2 = "34";
//		System.out.println(s1 + s2);
//		int i1 = Integer.parseInt(s1);
//		int i2 = Integer.parseInt(s2);
//		System.out.println(i1 + i2);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 가위 바위 보 게임 ***");
		System.out.print("코인을 넣어주세요: ");
		int coin = sc.nextInt();
		int win = 0;
		int loose = 0;
		int tie = 0;
		
		System.out.println("해당하는 메뉴의 숫자를 입력해 주세요.");
		
		outer: while(true) {
			System.out.printf("현재 코인의 수: %d\n", coin);
			
			System.out.println("--------------------------------");
			System.out.println("1. 가위바위보 게임 시작");
			System.out.println("2. 전적 보기");
			System.out.println("3. 코인 투입하기");
			System.out.println("4. 프로그램 종료");
			System.out.println("--------------------------------");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			
			
			switch(menu) {
			case 1:
				
				while(true) {
					System.out.println();
					System.out.println("--------------------------------");
					System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
					System.out.println("게임을 끝내고 싶으시면 '그만' 이라고 입력하세요.");
					System.out.print("> ");
					String rsp = sc.next();
					
					int mine = 0;
					if(rsp.equals("가위")) {
						mine = 0;
					}
					else if(rsp.equals("바위")) {
						mine = 1;
					}
					else if(rsp.equals("보")) {
						mine = 2;
					}
					else if(rsp.equals("그만")){
						System.out.println("가위바위보 게임 종료!");
						break;
					}
					
					int com = (int) (Math.random()*3);
					if(com==0) {
						System.out.println("컴퓨터가 낸 것은 가위!");
					}
					else if(com==1) {
						System.out.println("컴퓨터가 낸 것은 바위!");
					}
					else if(com==2) {
						System.out.println("컴퓨터가 낸 것은 보!");
					}
					
					System.out.println("--------------------------------");
					if(com==mine) {
						System.out.println("비겼습니다.");
						tie++;
					}
					else if((mine==0&&com==2) || (mine==1&&com==0) || (mine==2&&com==1)) {
						System.out.println("이겼습니다.");
						win++;
					}
					else {
						System.out.println("졌습니다.");
						loose++;
					}
					
					System.out.printf("남은 코인: %d\n", --coin);
					if(coin==0) {
						System.out.println("--------------------------------");
						System.out.println("코인이 다 떨어졌습니다.");
						System.out.println("게임을 계속 하시려면 코인을 더 넣어주세요.");
						System.out.println("게임을 그만 두고 메뉴로 돌아가시려면 '그만'이라고 입력해 주세요.");
						System.out.print("> ");
						String ask = sc.next();
						if(ask.equals("그만")) {
							System.out.println("메뉴로 돌아갑니다.");
							break;
						}
						else {
							coin = Integer.parseInt(ask);
							System.out.printf("코인을 %d개 추가합니다.\n", coin);
						}
					}
					
				}
				break;
			case 2:
				
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println("*** 게임 결과 ***");
				System.out.printf("이긴 횟수: %d회\n", win);
				System.out.printf("비긴 횟수: %d회\n", tie);
				System.out.printf("진 횟수: %d회\n", loose);
				System.out.println("--------------------------------");
				break;
			case 3:
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println("코인을 넣어주세요.");
				System.out.print("> ");
				int plus = sc.nextInt();
				System.out.printf("%d개의 코인을 넣었습니다.\n", plus);
				coin += plus;
				break;
			case 4:
				System.out.println("프로그램을 종료합니다. [Y / N]");
				System.out.print("> ");
				char end = sc.next().charAt(0);
				if(end=='Y' || end=='y') {
					break outer;
				}
				else {
					System.out.println("종료를 취소합니다.");
				}
				break;
			}//메뉴
			
		} //전체 프로그램
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
