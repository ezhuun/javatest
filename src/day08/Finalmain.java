package day08;

public class Finalmain {

	public static void main(String[] args) {
		Final fi = new Final();
		fi.money = 15000;
		// fi.day = 10;
		System.out.println("1주일 용돈:" + fi.money * fi.day);
		System.out.println("1년 " + Final.month + "달");
		// Final.month = 20000;
	}

}

class Final {
	int money = 10000;

	final int day = 7;
	final int week = 4;

	final static int month = 12;

	public Final() {
	}
}