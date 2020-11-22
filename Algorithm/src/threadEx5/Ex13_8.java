package threadEx5;

public class Ex13_8 {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();
		
		try {
//			th1.sleep(5000);
			/*이렇게 해도 th1이 자는게 아니라 이걸 실행시킨
			 메인 쓰레드가 잠, 남을 재울순 없고 자기 자신만
			 재울 수 있음, 위에처럼 쓰면안되고
			 밑에처럼 써야됨
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("메인 종료");

	}
	
}

class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<300;i++)
			System.out.print("-");
		System.out.println("th1 종료");
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<300;i++)
			System.out.print("|");
		System.out.println("th2 종료");
	}
}