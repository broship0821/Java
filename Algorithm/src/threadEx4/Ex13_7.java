package threadEx4;

public class Ex13_7 implements Runnable { //Runnable인터페이스 상속해서 쓰레드 구현하는 방법
	static boolean autosave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_7());//Runnable인터페이스를 상속받고 있는 클래스 인자로 넣기
		t.setDaemon(true); //데몬쓰레드로 만들기, 이거 없으면 종료되지 않음
		t.start(); //.setDaemon이 .start()보다 위에 있어야됨(먼저 실행되야됨)
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
			if(i==5) autosave=true;
		}
		
		System.out.println("프로그램 종료");
	}

	@Override
	public void run() {
		while(true) {//데몬쓰레드는 무한루프로 만듬, 일반 쓰레드가 끝나면 자동으로 끝나기 때문에 상관없음
			try {
				Thread.sleep(3*1000); //3초마다
			} catch (InterruptedException e) {}
			
			if(autosave) autosave();
			
		}
		
	}

	private void autosave() {
		System.out.println("작업파일이 자동저장 되었습니다.");
		
	}

}