package day10;

public class MainTest {
	public static void main(String[] args) {
		Line a = new Line();
		a.draw();

		DObject b = new Line();
		b.draw();
	}	
}

class DObject {
	public void draw() {
		System.out.println("DObject draw");
	}
	public void bb() {
		System.out.println("bb");
	}	
}

class Line extends DObject {
	public void draw() {
		System.out.println("Line");
	}
	public void aa() {
		System.out.println("aa");
	}
}
