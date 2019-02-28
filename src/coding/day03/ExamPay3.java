package coding.day03;

import java.util.Scanner;

public class ExamPay3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// ------------------------------------------
		// �Է�
		// ------------------------------------------
		System.out.print("��� ����� �Է��ϼ���: ");
		int year = in.nextInt();
		System.out.print("�ڳ���� �Է��ϼ���: ");
		int child = in.nextInt();
		System.out.print("�ڰ��� ����(0-����, 1-��ɻ�, 2-������, 3-���): ");
		int license = in.nextInt();

		// ------------------------------------------
		// ó��
		// ------------------------------------------
		int year_pay = year * 200000;
		int child_pay = child * 200000;
		int basic = 1600000;
		int license_pay = 0;
		String license_name = "";
		
		switch (license) {
		case 0:
			license_name = "����";
			license_pay = 0;
			break;
		case 1:
			license_name = "��ɻ�";
			license_pay = 100000;
			break;
		case 2:
			license_name = "������";
			license_pay = 150000;
			break;
		case 3:
			license_name = "���";
			license_pay = 200000;
			break;
		default:
			license_name = "Ȯ�κҰ�";
			license_pay = 0;
			break;
		}

		int decide_pay = basic + year_pay + child_pay + license_pay; // ������ �޿�
		int annual_salary = decide_pay * 13; // ����

		// ------------------------------------------
		// ���
		// ------------------------------------------
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("JAVA ������ �޿� ������");
		System.out.println("-----------------------");
		System.out.println("�⺻��		: " + basic);
		System.out.println("��� ���	: " + year);
		System.out.println("��� ����	: " + year_pay);
		System.out.println("�ڳ��		: " + child);
		System.out.println("�ڳ� ����	: " + child_pay);
		System.out.println("�ڰ��� �̸�	: " + license_name);
		System.out.println("�ڰ��� ����	: " + license_pay);
		System.out.println("������ �޿�	: " + decide_pay);
		System.out.println("������ ����	: " + annual_salary);
		System.out.println("-----------------------");
	}

}
