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
		// f1.money = 1200; 값을 변경할 수 없음
		System.out.println("우유 " + f1.milk + "ml의 가격은 " + f1.money + "입니다.");
		Final f2 = new Final();
		// f2.money2 = 1800; 값을 변경할 수 없음
		System.out.println("우유 " + Final.milk2 + "ml의 가격은 " + f2.money2 + "입니다.");
	}
}