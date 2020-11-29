package threadEx8;

public class SynchronizedEx {

	public static void main(String[] args) {
		Runnable r = new RunnableEx();
		new Thread(r).start();
		new Thread(r).start();

	}

}

class Account {
	private int balance = 1000;

	public synchronized int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance>=money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}
}

class RunnableEx implements Runnable {
	Account acc = new Account();
	@Override
	public void run() {
		while(acc.getBalance()>0) {
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("남은돈: "+acc.getBalance());
		}
		
	}
}
