package coding.day04;

public class Order {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int mainb = 0; // ���κ���
		int cpu = 0; // CPU
		int ram = 0; // RAM
		int hdd = 0; // HDD
		int pcase = 0; // ���̽�
		int sum = 0; // �μ��� ��
		int gong = 100000; // ���κ�
		int delivery = 20000; // �ù��
		int tot = 0; // �ѱݾ�
		int tax = 0; // �ΰ���ġ��
		int pay = 0; // ����ݾ�
		String sang = ""; // ��ǰ��

		System.out.println("������ �Է��ϼ���. ");
		System.out.println("-------------------");
		System.out.print("Main Board: ");
		mainb = in.nextInt();
		System.out.print("CPU       : ");
		cpu = in.nextInt();
		System.out.print("RAM       : ");
		ram = in.nextInt();
		System.out.print("HDD       : ");
		hdd = in.nextInt();
		System.out.print("���� ���̽�: ");
		pcase = in.nextInt();

		sum = mainb + cpu + ram + hdd + pcase;
		tot = sum + gong + delivery;
		tax = (int) (tot * 0.1); // ����
		pay = tot + tax; // ���� �ݾ�

		if (pay < 500000) {
			sang = "5 õ��";
		} else if (pay >= 500000 && pay < 600000) {
			sang = "1 ����";
		} else if (pay >= 600000 && pay < 700000) {
			sang = "2 ����";
		} else {
			sang = "3 ����";
		}

		System.out.println();
		System.out.println("-------------------");
		System.out.println("    ���� ������    ");
		System.out.println("-------------------");
		System.out.println("Main Board: " + mainb);
		System.out.println("CPU: " + cpu);
		System.out.println("RAM: " + ram);
		System.out.println("HDD: " + hdd);
		System.out.println("Case: " + pcase);
		System.out.println("�μ� �ݾ�: " + sum);
		System.out.println("���κ�: " + gong);
		System.out.println("�ù��: " + delivery);
		System.out.println("�ѱݾ�: " + tot);
		System.out.println("�ΰ���ġ��: " + tax);
		System.out.println("����ݾ�: " + pay);
		System.out.println("��ǰ�� ����: " + sang);

	}

}