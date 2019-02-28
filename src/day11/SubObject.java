package day11;

public class SubObject extends SuperObject {
	protected String name;
	int a;

	@Override
	public void draw() {
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		SuperObject b = new SubObject(); //업카운팅
		b.paint();		
	}

}

class SuperObject {
	protected String name;
	int b;
	
	public void paint() {
		draw(); //동적바인딩
	}

	public void draw() {
		System.out.println(name);
	}
}
