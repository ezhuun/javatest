package day17;

public class SchedulingTest2 {

	public static void main(String[] args) {
		Thread[] t = new RunThread2[5];
		t[0] = new RunThread2("��");
		t[1] = new RunThread2("��");
		t[2] = new RunThread2("��");
		t[3] = new RunThread2("��");
		t[4] = new RunThread2("��");
		
		t[0].start();
		t[1].start();
		t[2].start();
		t[3].start();
		t[4].start();
	}

}

class RunThread2 extends Thread {
	public RunThread2(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i < 30000000; i++) {
			if (i % 50 == 0) {
				System.out.println("Thread[" + getName() + "] : " + i);
				try {
					System.out.print("");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
