import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		int height = sc.nextInt();
		
		if(height>=140) {
			System.out.print("나이를 입력하세요: ");
			int age = sc.nextInt();
		
			if(age>=8) {
				System.out.println("입장이 가능합니다!");
			}
			else if(age>=6) {
				System.out.println("보호자 동반 시 탑승이 가능합니다.");
			}
			else {
				System.out.println("죄송합니다, 나이가 6세 미만입니다.");
				System.out.println("놀이기구 탑승이 불가합니다.");
			}
		}
		else {
			System.out.println("죄송합니다, 키가 140cm 미만입니다.");
			System.out.println("놀이기구 탑승이 불가합니다.");
		}
		System.out.println("오늘 하루 즐거운 시간 되세요~!");

		System.out.println(height);
//		System.out.println(age);
		//블록구조 내에서 생성된 변수는 해당 블록구조에서만 사용 가능
		//변수는 {} 안에서 선언되고 사용됨, 해당 블록내에서만 활용 가능
		//블록구조, {}가 끝나면 메모리에서 삭제됨

		sc.close();
		
		
	}

}
