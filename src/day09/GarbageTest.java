package day09;

public class GarbageTest {

	public static void main(String[] args) {
		Garbage[] ga = new Garbage[10];

		for (int i = 0; i < ga.length; i++) {
			ga[i] = new Garbage(i);
		}

		for (int i = 0; i < ga.length; i++) {
			ga[i] = null;
		}
		System.gc();
	}
}

class Garbage {
	int objNo;

	public Garbage(int n) {
		objNo = n;
		System.out.println("Garbage class " + objNo + "이 만들어졌습니다");
	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage class " + objNo + " 에서 쓰이던 메모리가 수집되었습니다");
		super.finalize();
	}

}