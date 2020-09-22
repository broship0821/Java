package chap02;

import java.util.Scanner;

public class Q08DayOfYear {
	
	//각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //윤년
		//    1    2    3	   4   5     6   7    8    9   10  11  12
	};
	
	//윤년 확인
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		while(--m!=0) {
			d += mdays[isLeap(y)][m-1];
		}
		return d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("올해 경과 일수 구하기");
		
		do {
			System.out.print("년: "); int year = sc.nextInt();
			System.out.print("월: "); int month = sc.nextInt();
			System.out.print("일: "); int day = sc.nextInt();
			
			System.out.printf("%d일 경과\n", dayOfYear(year, month, day));
			
			System.out.print("한번 더? (1:예, 2: 아니오)\n>>>");
			retry = sc.nextInt();
		} while(retry==1);

	}

}
