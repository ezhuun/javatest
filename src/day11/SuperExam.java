package day11;

public class SuperExam {
	public static void main(String[] args) {
		SubOverC over1 = new SubOverC(10, 20, 30);

		System.out.println("i, j, k�� �� : " + over1.i + " " + over1.j + " " + over1.k);
		over1.show();
	}
}

class OverC {
	int i, j;

	public OverC(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void show() {
		System.out.println("����Ŭ������ �޼ҵ� show() ����");
	}
}

class SubOverC extends OverC {
	int k;

	public SubOverC(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}

	public void show() {
		System.out.println("���� Ŭ������ �޼ҵ� show() ����");
		System.out.println("***super�� �̿��� ���� Ŭ���� �޼ҵ� ȣ��***");
		super.show();
	}
}
