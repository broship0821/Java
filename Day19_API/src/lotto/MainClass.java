package lotto;

import java.util.Arrays;
import java.util.Random;

public class MainClass {

public static void main(String[] args) {
		

		LottoSimulator p = new LottoSimulator();
		//당첨 번호
		int[] win = p.lottoSimulator();
		//보너스 번호
		int bonus = p.createBonusNum(win);
		long paper = 0; //로또 구매 횟수.
		long money = 0;
		
		
		
		while(true) {
			//내 로또번호 생성.
			int[] myLotto = p.lottoSimulator();
			paper++;
			p.checkLottoNumber(myLotto, win, bonus);
			
			if(p.getPrize1() == 1) {
				System.out.println("\n1등에 당첨되셨습니다!");
				System.out.println("*** 1등에 1번 당첨될 때 까지의 누적 당첨 현황 ***");
				
				System.out.printf("# 1등 당첨 횟수: %d\n", p.getPrize1());
				System.out.printf("# 2등 당첨 횟수: %d\n", p.getPrize2());
				System.out.printf("# 3등 당첨 횟수: %d\n", p.getPrize3());
				System.out.printf("# 4등 당첨 횟수: %d\n", p.getPrize4());
				System.out.printf("# 5등 당첨 횟수: %d\n", p.getPrize5());
				System.out.printf("# 꽝 당첨 횟수: %d\n", p.getFail());
				
				money = paper * 1000;
				System.out.println("로또 1등 한번 되려고 당신이 쓴 금액: " + money + "원");
				
				break;
			} else {
				System.out.printf("로또 %d장 째 구매중...\n", paper);
			}
			
		}
		
		

	}
	
}
