package threadEx2;

public class Ex13_3 {
	static long startTime = 0;

	public static void main(String[] args) {
		Thread3 th1 = new Thread3();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0;i<300;i++)
			System.out.print("|");
		
		System.out.println("소요시간1: "+ (System.currentTimeMillis()-startTime));
		

	}
	
}

class Thread3 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<300;i++)
			System.out.print("-");
		System.out.println("소요시간2: "+ (System.currentTimeMillis()-Ex13_3.startTime));

	}
}