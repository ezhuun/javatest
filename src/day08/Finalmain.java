package day08;

public class Finalmain {

	public static void main(String[] args) {
		Final fi = new Final();
		fi.money = 15000;
		// fi.day = 10;
		System.out.println("1���� �뵷:" + fi.money * fi.day);
		System.out.println("1�� " + Final.month + "��");
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