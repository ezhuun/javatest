package day13;

public class Ex1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		/*
		 * if(b == 0) { System.out.println("0���� ���� �� �����ϴ�"); System.exit(0); }
		 */
		try {
			System.out.println("a = " + a + " b = " + b);
			System.out.println("a/b = " + (a / b));
			System.out.println("�������� ����Ǿ����ϴ�");
		} catch (Exception e) {

		} finally {
			System.out.println("������ ����Ǵ� ��");
		}

		System.out.println("���α׷��� ���������� ����˴ϴ�");

	}
}
