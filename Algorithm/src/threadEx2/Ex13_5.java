package threadEx2;

import javax.swing.JOptionPane;

public class Ex13_5 {

	public static void main(String[] args) {
		Thread4 th1 = new Thread4();
		th1.start();
		
		//작업1 입력받기
		String input = JOptionPane.showInputDialog("아무 값 입력");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		
		
	}

}

class Thread4 extends Thread {
	@Override
	public void run() {
		//작업2 카운트다운
				for(int i=10;i>0;i--) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
	}
}
