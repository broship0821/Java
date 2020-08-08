package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoSimulator {
	
	private Random r = new Random();
	private int prize1 = 0;
	private int prize2 = 0;
	private int prize3 = 0;
	private int prize4 = 0;
	private int prize5 = 0;
	private int fail = 0;

	//중복없는 랜덤한 숫자 6개 생성
	public int[] lottoSimulator() {
		
		int[] lotto = new int[6];
		
		int j = 0;
		
		while(true) {
			int num = r.nextInt(45) + 1;
			boolean flag = true;
			
			for(int i=0;i<j;i++) {
				if(lotto[i]==num) {
					flag = false;
					break;
				}
			}
			if(flag) {
				lotto[j] = num;
				j++;
			}
			
			
			if(j==6) {
				break;
			}
			
		}
		Arrays.sort(lotto);
		return lotto;
	}
	
	//로또 6개 숫자에서 없는 랜덤한 숫자 1개 생성
	public int createBonusNum(int[] win) {
		
		int bonus;
		while(true) {
			
			boolean flag = true;
			bonus = r.nextInt(45) + 1;
			
			for(int i=0;i<win.length;i++) {
				if(win[i]==bonus) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				break;
			}
		}
		return bonus;
	}
	
	
	//당첨 여부를 알려주는 메서드
	public void checkLottoNumber(int[] myLotto, int[] win, int bonus) {
		
		int count = 0;
		for(int i : myLotto) {
			for(int j : win) {
				if(i == j) {
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
		} else if(count == 4) prize4++;
		else if(count == 3) prize5++;
		else fail++;
		
	}

	public int getPrize1() {
		return prize1;
	}

	public void setPrize1(int prize1) {
		this.prize1 = prize1;
	}

	public int getPrize2() {
		return prize2;
	}

	public void setPrize2(int prize2) {
		this.prize2 = prize2;
	}

	public int getPrize3() {
		return prize3;
	}

	public void setPrize3(int prize3) {
		this.prize3 = prize3;
	}

	public int getPrize4() {
		return prize4;
	}

	public void setPrize4(int prize4) {
		this.prize4 = prize4;
	}

	public int getPrize5() {
		return prize5;
	}

	public void setPrize5(int prize5) {
		this.prize5 = prize5;
	}

	public int getFail() {
		return fail;
	}

	public void setFail(int fail) {
		this.fail = fail;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
