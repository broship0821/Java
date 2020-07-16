import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		System.out.printf("내 점수: %d점\n", point);
		System.out.println("--------------------------------------");
		
		if(point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("합격입니다!");
		}
		else {	
			System.out.println("70점 미만입니다.");
			System.out.println("탈락입니다");
		}
		
		System.out.println("시험 치루느라 수고하셨습니다.");
		
		sc.close();
		
		
	}

}
