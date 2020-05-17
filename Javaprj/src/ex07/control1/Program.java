package ex07.control1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);


		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while(true) {
			// 성적 입력 부분----------------------------------
			System.out.println("┌─────────────────────┐");
			System.out.println("│         성적 입력                 │");
			System.out.println("└─────────────────────┘");
			System.out.print("\t국어1 성적은?");
			kor1 = scan.nextInt();
			// while(!(0<=kor1 && kor1<=100))
			while(kor1<0 || 100<kor1) {
				System.out.println("점수는 0~100 사이의 숫자여야 합니다. 다시쓰랑께");
				System.out.print("국어1 성적은?");
				kor1 = scan.nextInt();
			}
			System.out.print("\t국어2 성적은?");
			kor2 = scan.nextInt();
			System.out.print("\t국어3 성적은?");
			kor3 = scan.nextInt();
			
	

	
			// 성적 출력 부분----------------------------------
			total = kor1 + kor2 + kor3;
			avg = total / 3.0f;
			System.out.println("┌─────────────────────┐");
			System.out.println("│         성적 출력                 │");
			System.out.println("└─────────────────────┘");
			System.out.printf("\t국어1 : %3d\n",kor1);
			System.out.printf("\t국어2 : %3d\n",kor2);
			System.out.printf("\t국어3 : %3d\n",kor3);
			System.out.printf("\t총점 : %3d\n",total);
			System.out.printf("\t평균 : %6.2f\n",avg);
			System.out.println("───────────────────────");
		}
	}
}