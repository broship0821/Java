package threadEx2;

import javax.swing.JOptionPane;

public class Ex13_4 {

	public static void main(String[] args) {
		//작업1 입력받기
		String input = JOptionPane.showInputDialog("아무 값 입력");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
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
