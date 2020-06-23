package ex14.array;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		
		//int kor1, kor2, kor3;
		int[] kors = new int[3];
		int total;
		float avg;
		int menu;
		
		Scanner scan = new Scanner(System.in);

		/*
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		*/
		// 배열은 초기값이 0임, 사실 초기화할필요 없음
		for(int i=0;i<3;i++)
			kors[i] = 0;
		
		종료:
		while(true) {
			
			// 메인 메뉴 부분----------------------------------
			System.out.println("┌─────────────────────┐");
			System.out.println("│         메인 메뉴                 │");
			System.out.println("└─────────────────────┘");
			System.out.println("\t1.성적 입력");
			System.out.println("\t2.성적 출력");
			System.out.println("\t3.종료");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				// 성적 입력 부분----------------------------------
				System.out.println("┌─────────────────────┐");
				System.out.println("│         성적 입력                 │");
				System.out.println("└─────────────────────┘");
				
				/*
				do {
					System.out.print("\t국어1 성적은?");
					kor1 = scan.nextInt();
					if(kor1<0 || 100<kor1)
						System.out.println("점수는 0~100 사이의 숫자여야 합니다. 다시쓰랑께");
				}while(kor1<0 || 100<kor1);
				
				do {
					System.out.print("\t국어2 성적은?");
					kor2 = scan.nextInt();
					if(kor2<0 || 100<kor2)
						System.out.println("점수는 0~100 사이의 숫자여야 합니다. 다시쓰랑께");
				}while(kor2<0 || 100<kor2);
				
				do {
					System.out.print("\t국어3 성적은?");
					kor3 = scan.nextInt();
					if(kor3<0 || 100<kor3)
						System.out.println("점수는 0~100 사이의 숫자여야 합니다. 다시쓰랑께");
				}while(kor3<0 || 100<kor3);
				*/
				
				for(int i=0;i<3;i++)
					do {
						System.out.printf("\t국어%d 성적은?", i+1);
						kors[i] = scan.nextInt();
						if(kors[i]<0 || 100<kors[i])
							System.out.println("점수는 0~100 사이의 숫자여야 합니다. 다시쓰랑께");
					}while(kors[i]<0 || 100<kors[i]);
				break;
			
				
			case 2:
				// 성적 출력 부분----------------------------------
				//total = kor1 + kor2 + kor3;
				//total = kors[0] + kors[1] + kors[2];
				total = 0; // avg는 왜 초기화 할필요 없고 total은 초기화 해야되지? - for이라는 함수 안에서 쓰이고 있으니까, 지역함수에서 변수 쓸때는 초기화 시켜줘야됨
				for(int i=0;i<3;i++) total += kors[i];
				avg = total / 3.0f;
				
				
				System.out.println("┌─────────────────────┐");
				System.out.println("│         성적 출력                 │");
				System.out.println("└─────────────────────┘");
				
				for(int i=0;i<3;i++) {
					System.out.printf("\t국어%d : %3d\n", i+1, kors[i]);
				}
				
	
				System.out.printf("\t총점 : %3d\n",total);
				System.out.printf("\t평균 : %6.2f\n",avg);
				System.out.println("───────────────────────");
				break;
			
			case 3:
				break 종료;
				
			default:
				System.out.println("눈 사시냐?");
			}
		}
		System.out.print("good bye");
	}
}