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
		System.out.println("부모 클래스의 메소드 show()");
	}
	void parent() {
		System.out.println("부모 클래스에만 잇는 메소드 parent()");
	}
}
class SubOverB extends OverB{
	void show() {
		System.out.println("자식 클래스의 메소드 show()");
	}
	
}
