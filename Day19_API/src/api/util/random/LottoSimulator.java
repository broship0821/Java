package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class LottoSimulator {

	static Random r = new Random();
	
	static int prize1 = 0; //1등 당첨 횟수를 저장할 변수
	static int prize2 = 0; //2등 당첨 횟수를 저장할 변수
	static int prize3 = 0; //3등 당첨 횟수를 저장할 변수
	static int prize4 = 0; //4등 당첨 횟수를 저장할 변수
	static int prize5 = 0; //5등 당첨 횟수를 저장할 변수
	static int failCnt = 0; //6등 당첨 횟수를 저장할 변수
	
	//로또 번호를 생성하는 메서드
	public static int[] createLotto() {
		
		int[] lotto = new int[6];
		
		/*
		 1~45까지의 정수 중 6개의 난수를 lotto 배열에 담기
		 6개 난수는 중복이 발생하면 안됨
		 6개의 숫자를 정렬해서 리턴하기
		 (while, boolean)
		 */
		int i = 0;
		while(i<lotto.length) {
			
			int j = r.nextInt(45)+1;
			for(int k=0;k<i;k++) {
				if(lotto[i]==j) {
					continue;
				}
			}
			lotto[i] = j;
			i++;
		}
		for(int l=0;l<lotto.length;l++) {
			for(int n=l+1;n<lotto.length;n++) {
				if(lotto[l]>lotto[n]) {
					int tmp = lotto[l];
					lotto[l] = lotto[n];
					lotto[n] = tmp;
				}
			}
		}
		
		
		return lotto;
	}
	
	//보너스 번호 생성하는 메서드
	public static int createBonusNum(int[] win) {
		int bonus = r.nextInt(45)+1;
		
		boolean flag = true;
		while(flag) {
			for(int i=0;i<win.length;i++) {
				if(win[i]==bonus) {
					break;
				}
//				flag = false;//???
			}
		}
		
		
		return bonus;
		
	}
	
	//당첨 여부를 알려주는 메서드
	public static void checkLottoNumber(int[] myLotto, int[] win, int bonus) {
		
		int count = 0;
		for(int i : myLotto) {
			for(int j : win) {
				if(i==j) {
					count++;
					break;
				}
			}
		}
		
		if(count == 6) prize1++;
		else if(count == 5) {
			boolean flag = false;
			for(int n : myLotto) {
				if(bonus == n) {
					prize2++;
					flag = true;
					break;
				}
			}
			if(!flag) prize3++;
		}
		else if(count == 4) prize4++;
		else if(count == 3) prize5++;
		else failCnt++;
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//당첨번호 배열을 고정
		int[] win = createLotto();
		//보너스 번호 고정
		int bonus = createBonusNum(win);
		long paper = 0; //로또 구매 횟수
		long money = 0;
		
		while(true) {
			//내 로또번호 생성
			int[] myLotto = createLotto();
			paper++;
			checkLottoNumber(myLotto, win, bonus);
			if(prize1 == 1) {
				System.out.println("\n1등 당첨!");
				System.out.println("*** 1등에 1번 당첨될 때 까지의 누적 당첨 현황 ***");
				
				System.out.printf("# 1등 당첨 횟수: %d\n", prize1);
				System.out.printf("# 2등 당첨 횟수: %d\n", prize2);
				System.out.printf("# 3등 당첨 횟수: %d\n", prize3);
				System.out.printf("# 4등 당첨 횟수: %d\n", prize4);
				System.out.printf("# 5등 당첨 횟수: %d\n", prize5);
				System.out.printf("# 꽝 당첨 횟수: %d\n", failCnt);
				
				money = paper * 1000;
				System.out.println("로또 1등 한번 되려고 당신이 쓴 금액: " + money + "원");
				
				break;
			}
			else {
				System.out.printf("로또 %d장째 구매중...\n", paper);
			}
		}
		

	}

}
