package coding.day03;

import java.util.Scanner;

public class ExamPay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("��³���� �Է��ϼ���");
		int year = in.nextInt();
		System.out.print("�ڳ���� �Է��ϼ���");
		int child = in.nextInt();
		System.out.print("�ڰ��� ����(0-����, 1-��ɻ�, 2-������, 3-���): ");
		int license = in.nextInt();

		int year_pay = year * 200000;
		int child_pay = child * 200000;
		int basic = 1600000;
		int license_pay = 0;

		if (license == 1) { // �ڰ��� ���� ó��
			license_pay = 100000;
		} else if (license == 2) {
			license_pay = 150000;
		} else if (license == 3) {
			license_pay = 200000;
		}
		
		int decide_pay = basic + year_pay + child_pay+license_pay ;// ������ �޿�
		int annual_salary = decide_pay * 13; // ����

		System.out.println("-----------------------");
		System.out.println("JAVA ������ �޿� ������");
		System.out.println("-----------------------");
		System.out.println("�⺻��     : " + basic);
		System.out.println("��� ���  : " + year);
		System.out.println("��� ����  : " + year_pay);
		System.out.println("�ڳ��     : " + child);
		System.out.println("�ڳ� ����  : " + child_pay);
		System.out.println("�ڰ��� ����: " + license_pay);
		System.out.println("������ �޿�: " + decide_pay);
		System.out.println("������ ����: " + annual_salary);

		switch (license) {
		case 0:
			System.out.println("�ڰ����� �����ϴ�.");
			break;

		case 1:
			System.out.println("��ɻ�");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("���");
			break;
		}
		System.out.println("-----------------------");
	}

}
