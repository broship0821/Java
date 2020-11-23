package threadEx6;

import javax.swing.JOptionPane;

/*
 interrupt(): 자고 있는 쓰레드를 깨우거나
 				실행중인 쓰레드를 중단시킴
 */
public class Ex13_9 {

	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		th1.start();
		
		System.out.println("isInterrupted(): "+th1.isInterrupted()); //true
		String input = JOptionPane.showInputDialog("아무거나 입력: ");
		System.out.println("입력한 값: " + input);
		th1.interrupt();//false -> true
//		System.out.println("isInterrupted(): "+th1.isInterrupted()); //true
//		System.out.println("isInterrupted(): "+th1.isInterrupted()); //true
//		System.out.println("interrupted(): "+Thread.interrupted()); 
		//.interrupted()는 static, 메인 쓰레드가 interrupt 되었는지 확인

	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		int i =10;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<1500000000L;x++); //시간지연
		}
		System.out.println("isInterrupted(): "+this.isInterrupted());
		System.out.println("interrupted(): "+Thread.interrupted());//false로 초기화
		System.out.println("interrupted(): "+Thread.interrupted());
		System.out.println("카운트 종료");
	}
}