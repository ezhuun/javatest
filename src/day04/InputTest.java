package day04;

class InputTest {
	public static void main(String[] args) {
		// �Է� ���, System.in: Ű����, Scanner: 1.5���� ���
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print("���ڿ� �Է�: ");
		String dest = in.next(); // ���ڿ� �Է�

		System.out.print("���� �Է�: ");
		int money = in.nextInt(); // ���� �Է�

		System.out.print("float �Ǽ� �Է�(f�� �������� ����): ");
		float f = in.nextFloat(); // �Ǽ� �Է�

		System.out.print("double �Ǽ� �Է�: ");
		double d = in.nextDouble(); // double �Ǽ� �Է�

		System.out.println("----------------------------------");
		System.out.println("�Էµ� ���ڿ�: " + dest);
		System.out.println("�Էµ� ����: " + money);
		System.out.println("�Էµ� float �Ǽ�: " + f);
		System.out.println("�Էµ� dobue �Ǽ�: " + d);
	}
}
