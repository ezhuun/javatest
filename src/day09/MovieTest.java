package day09;

public class MovieTest {

	public static void main(String[] args) {
		Korea k = new Korea();
		System.out.println("�帣 : " + k.part);
		System.out.println("���� : " + k.m1);

		Foreign f = new Foreign();
		System.out.println("�帣 : " + f.part);
		System.out.println("���� : " + f.m1);
	}

}

class Movie {
	String part = "��ȭ";
}

class Korea extends Movie {
	String m1 = "������ ����";
}

class Foreign extends Movie {
	String m1 = "�ڹ����� ����ִ�";
}
