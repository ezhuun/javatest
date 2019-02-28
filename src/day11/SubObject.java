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
		SuperObject b = new SubObject(); //��ī����
		b.paint();		
	}

}

class SuperObject {
	protected String name;
	int b;
	
	public void paint() {
		draw(); //�������ε�
	}

	public void draw() {
		System.out.println(name);
	}
}
