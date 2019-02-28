package test.day08;

public class ThreadSynchronizedTest {

	public static void main(String[] args) {
		Task task = new Task();
		Thread t1 = new Thread(task,"t1-Thread");
		Thread t2 = new Thread(task,"t2-Thread");
		 
		t1.start();
		t2.start();
    }

}

class Account {
	int balance = 1000;

	public void withDraw(int money) {
		synchronized(Account.class) {
			if (balance >= money) {
				try {
					Thread thread = Thread.currentThread();
					System.out.println(thread.getName() + " ��� �ݾ� ->> " + money);
					Thread.sleep(1000);
					balance -= money;
					System.out.println(thread.getName() + " balance:" + balance);

				} catch (Exception e) {
				}

			}
		}
	}
}

class Task implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.balance > 0) {
			// 100, 200, 300 ���� �� ���� ���Ƿ� �����ؼ� ���(withDraw)�Ѵ�.
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withDraw(money);

		}
	}
}