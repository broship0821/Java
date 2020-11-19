package threadEx2;

public class Ex13_11 {
	static long startTime = 0;

	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); //메인 쓰레드가 th1 작업이 끝날때 까지 기다림
			th2.join(); //메인 쓰레드가 th2 작업이 끝날때 까지 기다림
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("소요시간: "+ (System.currentTimeMillis()-startTime));
		

	}
	
}

class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<300;i++)
			System.out.print("-");
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<300;i++)
			System.out.print("|");
	}
}