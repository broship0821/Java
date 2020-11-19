package threadEx1;

class MyThread1 extends Thread { //Thread 클래스를 상속해서 쓰레드 구현
	@Override
	public void run() { //쓰레드가 수행할 작업
		for(int i=0;i<500;i++) {
//			System.out.println(getName()); //조상인 쓰레드의 getName() 호출
			System.out.print(0);
		}
	}
}

class MyThread2 implements Runnable { //Runnable 인터페이스를 구현해서 쓰레드를 구현
	@Override
	public void run() {//쓰레드가 수행할 작업
		for(int i=0;i<500;i++) {
//			System.out.println(Thread.currentThread().getName()); //현재 실행중인 Thread를 반환한다
			System.out.print(1);
		}
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		
		Runnable r = new MyThread2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}

}
