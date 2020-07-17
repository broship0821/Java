import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		/*
		 switch 키워드 뒤에 나오는 괄호 안에는 boolean형 조건식이 아닌
		 변수나 변수의 연산식을 적어야 하며, 타입은 정수, 문자열만 가능
		 */
		
				
		switch(point/10) { //정수랑 딱떨어지는 문자만 입력 가능
		case 10:
			if(point>100) {
				System.out.println("점수를 잘못 입력하셨습니다.");
				break;
			}
			// 여기 break; 안쓰면 자동으로 case9가 실행됨
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break; //탈출문(해당 케이스만 실행하고 switch문 빠져나감)
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
		default:
			
			if(point>100) {
				System.out.println("점수를 잘못 입력하셨습니다.");
				break;
			}
			
			System.out.println("당신의 학점은 F입니다.");
			
		}

	}

}
