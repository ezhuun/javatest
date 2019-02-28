package coding.day08;

//메인
public class MethodOverringEx {

	public static void main(String[] args) {
		DObject obj = new DObject(); // 슈퍼클래스 객체생성
		Line line = new Line(); // 상속받은 자식클래스 객체생성
		DObject p = new Line(); // 업캐스팅
		DObject r = line; // 업캐스팅

		obj.draw(); // 부모메소드호출
		line.draw(); // 자식메소드호출(오버라이딩)
		p.draw(); // 자식메소드호출(동적바인딩)
		r.draw(); // 자식메소드호출(동적바인딩)

		DObject rect = new Rect(); // 업캐스팅
		DObject circle = new Circle(); // 업캐스팅
		rect.draw(); // 자식메소드호출(동적바인딩)
		circle.draw(); // 자식메소드호출(동적바인딩)

	}

}

// 슈퍼클래스
class DObject {
	public DObject next;

	public DObject() {
		next = null;
	}

	public void draw() {
		System.out.println("DObject draw");
	}

}

// 서브클래스1
class Line extends DObject {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

// 서브클래스2
class Rect extends DObject {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

// 서브클래스3
class Circle extends DObject {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
