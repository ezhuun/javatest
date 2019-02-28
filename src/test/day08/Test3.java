package test.day08;

class SuperTest {
	public int a = 10, b = 20;

	public void write() {
		System.out.println("����Ŭ���� write() �޼ҵ�");
	}

	public int hap() {
		return a + b;
	}
}

class SubTest extends SuperTest {
	public int b = 100, c = 200;

	public void print() {
		System.out.println("����Ŭ���� print() �޼ҵ�");
	}

	@Override
	public int hap() {
		return a + b + c;
	}
}

public class Test3 {

	public static void main(String[] args) {
		SubTest ob1 = new SubTest();
		System.out.println("b: " + ob1.b);

		SuperTest ob2 = ob1; // ��ĳ����
		System.out.println("b: " + ob2.b);

		System.out.println("��: " + ob2.hap()); // �������ε�
		// �������̵��Ͽ� �������ϸ� �ڽ�Ŭ������ ��, ���ϸ� �θ�Ŭ������ �� ���

		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());

		ob2.write();
		// ob2.print(); -> �θ� �ڽ�Ŭ������ �޼ҵ忡�� ������ �� ����.

		SuperTest ob3 = (SubTest) ob2; // �ٿ�ĳ����
		System.out.println(ob3.hashCode());
		System.out.println(ob3.hap()); // �������̵� �����Ƿ� �ڽ�Ŭ������ �����Ͽ� ���
	}
}