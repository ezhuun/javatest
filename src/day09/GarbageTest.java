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
		System.out.println("Garbage class " + objNo + "�� ����������ϴ�");
	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage class " + objNo + " ���� ���̴� �޸𸮰� �����Ǿ����ϴ�");
		super.finalize();
	}

}