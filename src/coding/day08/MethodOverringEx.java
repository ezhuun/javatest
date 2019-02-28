package coding.day08;

//����
public class MethodOverringEx {

	public static void main(String[] args) {
		DObject obj = new DObject(); // ����Ŭ���� ��ü����
		Line line = new Line(); // ��ӹ��� �ڽ�Ŭ���� ��ü����
		DObject p = new Line(); // ��ĳ����
		DObject r = line; // ��ĳ����

		obj.draw(); // �θ�޼ҵ�ȣ��
		line.draw(); // �ڽĸ޼ҵ�ȣ��(�������̵�)
		p.draw(); // �ڽĸ޼ҵ�ȣ��(�������ε�)
		r.draw(); // �ڽĸ޼ҵ�ȣ��(�������ε�)

		DObject rect = new Rect(); // ��ĳ����
		DObject circle = new Circle(); // ��ĳ����
		rect.draw(); // �ڽĸ޼ҵ�ȣ��(�������ε�)
		circle.draw(); // �ڽĸ޼ҵ�ȣ��(�������ε�)

	}

}

// ����Ŭ����
class DObject {
	public DObject next;

	public DObject() {
		next = null;
	}

	public void draw() {
		System.out.println("DObject draw");
	}

}

// ����Ŭ����1
class Line extends DObject {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

// ����Ŭ����2
class Rect extends DObject {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

// ����Ŭ����3
class Circle extends DObject {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
