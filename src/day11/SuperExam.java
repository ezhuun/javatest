package day11;

public class SuperExam {
	public static void main(String[] args) {
		SubOverC over1 = new SubOverC(10, 20, 30);

		System.out.println("i, j, k의 값 : " + over1.i + " " + over1.j + " " + over1.k);
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
		System.out.println("상위클래스의 메소드 show() 수행");
	}
}

class SubOverC extends OverC {
	int k;

	public SubOverC(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}

	public void show() {
		System.out.println("하위 클래스의 메소드 show() 수행");
		System.out.println("***super를 이용한 상위 클래스 메소드 호출***");
		super.show();
	}
}
