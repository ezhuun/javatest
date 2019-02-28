package day12;

public class IR2 {

	public static void main(String[] args) {
		B b = new D1();
		b.display("���� - ������ - ������ ȸ��ħ");
		
		b = new D2();
		b.display("��ε� - ��ƸӸ� - ������ Į����");
			
		D2 d2 = (D2) b;
		System.out.println(d2.str);
	}

}

interface B {
	void display(String s);
}

class D1 implements B {
	String str = "";

	@Override
	public void display(String s) {
		str = s;
		System.out.println("�١١١١١١١١١�" + s);
	}
}

class D2 implements B {
	String str;

	@Override
	public void display(String s) {
		str = s;
		System.out.println("�ڡڡڡڡڡڡڡڡڡ�" + s);
	}
}
