package day13;

public class ExceptionError3 {
	public static void main(String[] args) {
		try {
			System.out.println("�Ű������� ���� �� ���� ��");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a = " + a + " b = " + b);
			System.out.println("�������� ��Ȱ�� ����Ǿ����ϴ�");
		} catch (Exception e) {
			new UserException(e);
		} finally {
			System.out.println("=============================");
			System.out.println("���� ó���� ������ fianlly ���� �����մϴ�");
		}
		System.out.println("������ ��ƾ�� ����ó���մϴ�");
	}
}

class UserException {
	public UserException() {
	}

	public UserException(Exception e) {
		System.out.println("-------------------------------");
		System.out.println("���Ͽ� ���� ������ ����մϴ�........");
		System.out.println("�� �������� : " + e.toString());
		System.out.println("-------------------------------");
	}
}