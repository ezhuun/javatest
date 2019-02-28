package test.day08;

class ClassA {

	String A = "A";
	String A2 = "A2";

	public void methodA() {
		System.out.println("methodA");
	}

	public void methodA2() {
		System.out.println("methodA2");
	}
}

class ClassExtendA extends ClassA {
	String A = "ExA";
	String A3 = "ExA3";

	public void methodA() {
		System.out.println("methodExA");
	}

	public void methodA3() {
		System.out.println("methodExA3");
	}
}

public class TestExtend {

	public static void main(String[] args) {
		ClassA ca = new ClassA(); // �θ�
		ClassExtendA cea = new ClassExtendA(); //�θ�,�ڽ�
		ClassA cea2 = new ClassExtendA();	//��ĳ���� (�θ�)

		System.out.println("---------------------�⺻ȣ��----------------------");

		// ����ȣ��
		System.out.println("ca.A	  =" + ca.A);//A
		System.out.println("cea.A	  =" + cea.A); //ExA
		System.out.println("cea2.A	  =" + cea2.A); //A
		// �޼ҵ�ȣ��
		System.out.print("ca.methodA()	  =");
		ca.methodA(); //�θ� �޼ҵ� ȣ��
		System.out.print("cea.methodA()	  =");
		cea.methodA();  //�������̵� �޼ҵ� ȣ��
		System.out.print("cea2.methodA()	  =");
		cea2.methodA(); //�������ε��� ���� �ڽĸ޼ҵ带 ȣ��
		
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------����ȯȣ��--------------------");
		
		// ����ȯ ���� ȣ��
		System.out.println("((ClassA)cea).A	  =" + ((ClassA) cea).A); //A
		System.out.println("((ClassExtendA)cea2).A	  =" + ((ClassExtendA) cea2).A);  //ExA
		
		// ����ȯ �޼��� ȣ��
		System.out.print("((ClassA)cea).methodA	  =");
		((ClassA) cea).methodA();  //�������ε� �޼ҵ�ȣ��
		System.out.print("((ClassExtendA)cea2)	  =");
		((ClassExtendA) cea2).methodA(); //�ڽ�, �������̵� �޼ҵ�

		System.out.println("----------------------------------------------------");
		System.out.println("-----------�θ�Ŭ������ ����, �޼ҵ� ȣ��-----------");
		// ���� Ŭ������ �����ϴ� ���� ȣ��
		System.out.println("ca.A2	  =" + ca.A2);
		System.out.println("cea.A2	  =" + cea.A2);
		System.out.println("cea2.A2	  =" + cea2.A2);
		// ���� Ŭ�������� �����ϴ� �޼ҵ� ȣ��
		System.out.print("ca.methodA2()	  =");
		ca.methodA2();
		System.out.print("cea.methodA2()	  =");
		cea.methodA2();
		System.out.print("cea2.methodA2()	  =");
		cea2.methodA2();

		System.out.println("-----------------------------------------------------");
		System.out.println("-����ȯ�� �θ�Ŭ�������� �����ϴ� ���� , �޼ҵ� ȣ��-");
		// ����ȯ�� �θ�Ŭ�������� �����ϴ� ���� ȣ��
		System.out.println("((ClassA)cea).A2	  =" + ((ClassA) cea).A2);
		System.out.println("((ClassExtendA)cea2).A2	  =" + ((ClassExtendA) cea2).A2);
		// ����ȯ�� �θ�Ŭ�������� �����ϴ� �޼ҵ� ȣ��
		System.out.print("((ClassA)cea).methodA2()  =");
		((ClassA) cea).methodA2();
		System.out.print("((ClassExtendA)cea2).methodA2() =");
		((ClassExtendA) cea2).methodA2();

	}

}