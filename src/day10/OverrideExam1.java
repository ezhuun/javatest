package day10;

public class OverrideExam1 {
	
	public static void main(String[] args) {
		SubOverA over = new SubOverA();
		over.show("IT KOREA");
		over.show();
	}
	
}

class OverA {

	void show(String str) {
		System.out.println("����Ŭ������ �޼ҵ� show(String str) ���� " + str);
	}

}

class SubOverA extends OverA {
	void show(String str) {
		System.out.println("�������̵�");
	}
	void show() {
		System.out.println("�����ε�");
	}
}

