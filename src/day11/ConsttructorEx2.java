package day11;

//메인클래스
public class ConsttructorEx2 {

	public static void main(String[] args) {
		B1 b;
		b = new B1(1);
	}

}

//부모클래스
class A1 {
	public A1() {
		System.out.println("생성자 A1");
	}

	public A1(int a) {
		System.out.println("매개변수 있는 생성자 A1 : 인자값 " + a);
	}
}

//자식클래스
class B1 extends A1 {
	public B1() {
		super();
		System.out.println("생성자 B1");
	}

	public B1(int b) {
		super(2);
		System.out.println("매개변수 있는 생성자 B1 : 인자값 "+b);
	}
}