package day10;

public class OverrideExam2 {

	public static void main(String[] args) {
		OverB ob = new OverB();
		ob.show();
		ob.parent();
		
		SubOverB over = new SubOverB();
		over.show();
		over.parent();
	}
	
}

class OverB{
	void show() {
		System.out.println("�θ� Ŭ������ �޼ҵ� show()");
	}
	void parent() {
		System.out.println("�θ� Ŭ�������� �մ� �޼ҵ� parent()");
	}
}
class SubOverB extends OverB{
	void show() {
		System.out.println("�ڽ� Ŭ������ �޼ҵ� show()");
	}
	
}
