package test.day07;

public class Counter {// final�� ���� �� ���� ��� ���� ���
	// static�� ������ ������ ���� �� ���Ǵ� �����

	static int count = 0;
	final String name = "ȫ�浿";

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