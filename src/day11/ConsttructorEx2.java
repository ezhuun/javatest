package day11;

//����Ŭ����
public class ConsttructorEx2 {

	public static void main(String[] args) {
		B1 b;
		b = new B1(1);
	}

}

//�θ�Ŭ����
class A1 {
	public A1() {
		System.out.println("������ A1");
	}

	public A1(int a) {
		System.out.println("�Ű����� �ִ� ������ A1 : ���ڰ� " + a);
	}
}

//�ڽ�Ŭ����
class B1 extends A1 {
	public B1() {
		super();
		System.out.println("������ B1");
	}

	public B1(int b) {
		super(2);
		System.out.println("�Ű����� �ִ� ������ B1 : ���ڰ� "+b);
	}
}