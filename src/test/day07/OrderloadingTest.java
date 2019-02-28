package test.day07;

public class OrderloadingTest {

	public static void main(String[] args) {

		// =================
		// 오버로딩메소드 호출
		// =================
		Test t1 = new Test();
		t1.print(); // d : 0
		
		t1.sum(); // true
		t1.sum(1, 2); // 3
		t1.sum(1, 2.5); // 3.5
		// t1.sum(1); //error

		// =================
		// 생성자메소드 테스트
		// =================
		Test t2 = new Test(5);
		t2.print(); // d : 5

	}

}

class Test {
	int d;

	// =====================
	// 생성자 메소드
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
	// 오버로딩 메소드
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
	// 출력 메소드
	// =====================

	public void print() {
		System.out.println("d : " + this.d);
	}

}