package day10;

//����Ŭ����
public class CastingTest {
	public static void main(String[] args) {
		child2 ch = new child2();
		System.out.println(ch.msg);
		System.out.println(ch.getMsg());
		System.out.println(ch.str);
		System.out.println(ch.getStr());
		
		//�ڽ�Ŭ����Ÿ�� -> �θ�Ŭ����Ÿ��
		//��ĳ���� �ڵ�����ȯ
		Parent2 p = ch;
		System.out.println(p.msg);
		System.out.println(p.getMsg());

		/*ȣ�� ������ ��� ȣ�� �Ұ� (�θ𿵿��� ȣ�Ⱑ��)
		System.out.println(p.str);
		System.out.println(p.getStr());*/
		
		
		//�θ�Ŭ����Ÿ��->�ڽ�Ŭ����Ÿ��
		//�ٿ�ĳ����, ����� ����ȯ
		child2 ch2 = (child2)p;
		System.out.println(ch2.msg);
		System.out.println(ch2.getMsg());
		System.out.println(ch2.str);
		System.out.println(ch2.getStr());
	}
}

//����Ŭ����
class Parent2{
	String msg = "����";
	public String getMsg() {
		return msg;
	}
}

//����Ŭ����
class child2 extends Parent2{
	String str = "�ܿ�";
	public String getStr() {
		return str;
	}
}
