package chap02;

import java.util.Scanner;

public class Q09LeftDayOfYear {
	
	//각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //윤년
		//월:1    2    3	   4   5     6   7    8    9   10  11  12
		//i:  0    1    2    3   4    5    6    7   8    9   10  11
	};
	
	//윤년 확인
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int leftDay = mdays[isLeap(y)][m-1] - d;
		while(m!=12) {
			leftDay += mdays[isLeap(y)][m++];
			
		}
		return leftDay;
	}
	//보고 배우기
	static int leftDayOfYear(int y, int m, int d) {
		int days = d; // 일수

		for (int i = 1; i < m; i++) // 1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i - 1];
		return 365 + isLeap(y) - days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("올해 남은 일수 구하기");
		
		do {
			System.out.print("년: "); int year = sc.nextInt();
			System.out.print("월: "); int month = sc.nextInt();
			System.out.print("일: "); int day = sc.nextInt();
			
			System.out.printf("%d일 남음\n", dayOfYear(year, month, day));
			
			System.out.print("한번 더? (1:예, 2: 아니오)\n>>>");
			retry = sc.nextInt();
		} while(retry==1);

	}

}
