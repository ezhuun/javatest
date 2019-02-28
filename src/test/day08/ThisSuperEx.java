package test.day08;

// ===============
// ���� Ŭ����
// ===============
public class ThisSuperEx {

	public static void main(String[] args) {
		SubSub ssub = new SubSub();
		System.out.println();
		
		System.out.println("*********************************");
		System.out.println("ssub.common : "+ssub.common);
		System.out.println("ssub.a : "+ssub.a);
		System.out.println("ssub.b : "+ssub.b);
		System.out.println("ssub.c : "+ssub.c);
		
		System.out.println("*********************************");
		SubSub ssub1 = new SubSub("test", 1, 2, 3);
		System.out.println("ssub.a : "+ssub1.a);
		System.out.println("ssub.b : "+ssub1.b);
		System.out.println("ssub.c : "+ssub1.c);		
		System.out.println("*********************************");
		
		System.out.println();
		ssub1.testMethod();	//�������̵� �޼ҵ� ȣ��
		
		Super ssub2 = ssub1;	//��ī����
		ssub2.testMethod();	//�������̵�(�������ε�) �޼ҵ� ȣ��
	}

}

// ===============
// ���� Ŭ����
// ===============
class Super {
	String common;
	int a;

	public Super() {
		String common = "";
		int a = 0;
		System.out.println("�⺻������ �޼ҵ�ȣ�� (Super)Ŭ����");
	}

	public Super(String common, int a) {
		this.common = common;
		this.a = a;
		System.out.println("�Ű������� �ִ� ������ �޼ҵ�ȣ�� (Super)Ŭ����");
		System.out.println("���� ���ڿ�Ÿ�� ���� common�� �� : <" + this.common + "> (SuperŬ������ �������)");
		System.out.println();
	}
	
	public void testMethod() {
		System.out.println(" ��������������������������������������������");
	}
	
	
}

// ===============
// ���� Ŭ����
// ===============
class Sub extends Super {
	String common;
	int b;

	public Sub() {
		String common = "";
		int b = 0;
		System.out.println("�⺻������ �޼ҵ�ȣ�� (Sub)Ŭ����");
	}

	public Sub(String common, int a, int b) {
		super(common, a);
		this.b = b;
		System.out.println("�Ű������� �ִ� ������ �޼ҵ�ȣ�� (Sub)Ŭ����");
		System.out.println("���� ���ڿ�Ÿ�� ���� common�� �� : <" + this.common + "> (SubŬ������ �������)");
		System.out.println();
	}

	@Override
	public void testMethod() {
		super.testMethod();
		System.out.println("��  super�� ���� ���� �޼ҵ� ȣ��  ��");
	}
	
}

// ===============
// ������ ���� Ŭ����
// ===============
class SubSub extends Sub {
	String common;
	int c;

	public SubSub() {
		String common = "";
		int c = 0;
		System.out.println("�⺻������ �޼ҵ�ȣ�� (SubSub)Ŭ����");
	}

	public SubSub(String common, int a, int b, int c) {
		super(common, a, b);
		this.c = c;
		System.out.println("�Ű������� �ִ� ������ �޼ҵ�ȣ�� (SubSub)Ŭ����");
		System.out.println("���� ���ڿ�Ÿ�� ���� common�� �� : <" + this.common + "> (SubSubŬ������ �������)");
		System.out.println();
	}

	@Override
	public void testMethod() {
		super.testMethod();
		System.out.println(" ��������������������������������������������");
	}
	

}