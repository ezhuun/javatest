package test.day07;

public class Counter {// final은 변할 수 없는 상수 선언에 사용
	// static은 공용의 변수를 만들 때 사용되는 예약어

	static int count = 0;
	final String name = "홍길동";

	Counter() {
		this.count++;
	}

	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		Counter c2 = new Counter();

		System.out.println(Counter.getCount());
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
		System.out.println(c1.name);
		System.out.println(c2.name);

	}

}