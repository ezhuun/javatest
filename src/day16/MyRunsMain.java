package day16;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class MyRunsMain {
	public static void main(String[] args) {
		MyRuns mr1 = new MyRuns();

		Thread t1 = new Thread(mr1, "a");
		Thread t2 = new Thread(mr1, "b");
		Thread t3 = new Thread(mr1, "c");

		t1.start();
		t2.start();
		t3.start();

	}
}

class MyRuns implements Runnable {

	@Override
	public void run() {
		show();
	}

	public void show() {
		for (int i = 0; i < 100; i++) {
			if (Thread.currentThread().getName().equals("a")) {
				System.out.print("a");
			} else if (Thread.currentThread().getName().equals("b")) {
				System.out.print("b");
			} else if (Thread.currentThread().getName().equals("c")) {
				System.out.print("c");
			} else {
				System.out.print("[" + Thread.currentThread().getName() + i + "]");
			}
		}
	}

}