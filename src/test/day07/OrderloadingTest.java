package test.day07;

public class OrderloadingTest {

	public static void main(String[] args) {

		// =================
		// �����ε��޼ҵ� ȣ��
		// =================
		Test t1 = new Test();
		t1.print(); // d : 0
		
		t1.sum(); // true
		t1.sum(1, 2); // 3
		t1.sum(1, 2.5); // 3.5
		// t1.sum(1); //error

		// =================
		// �����ڸ޼ҵ� �׽�Ʈ
		// =================
		Test t2 = new Test(5);
		t2.print(); // d : 5

	}

}

class Test {
	int d;

	// =====================
	// ������ �޼ҵ�
	// =====================
	public Test() {

	}

	public Test(int d) {
		this.d = d;
	}

	// =====================
	// SET/ GET
	// =====================
	public void setD(int d) {
		this.d = d;
	}

	public int getD() {
		return this.d;
	}

	// =====================
	// �����ε� �޼ҵ�
	// =====================

	public boolean sum() {
		return true;
	}

	public int sum(int a, int b) {
		return (int) (a + b);
	}

	public double sum(double a, double b) {
		return (double) (a + b);
	}

	// =====================
	// ��� �޼ҵ�
	// =====================

	public void print() {
		System.out.println("d : " + this.d);
	}

}