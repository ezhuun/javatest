package test.day07;

class Final {
	int milk = 100;
	static int milk2 = 500;
	final int money = 1000;
	final int money2 = 1500;
}

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Final f1 = new Final();
		f1.milk = 200;
		// f1.money = 1200; ���� ������ �� ����
		System.out.println("���� " + f1.milk + "ml�� ������ " + f1.money + "�Դϴ�.");
		Final f2 = new Final();
		// f2.money2 = 1800; ���� ������ �� ����
		System.out.println("���� " + Final.milk2 + "ml�� ������ " + f2.money2 + "�Դϴ�.");
	}
}