package test.day05;

import java.util.Calendar;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("�̸��� �Է����ּ��� : ");
		String name = in.nextLine();

		System.out.print("�ּҸ� �Է����ּ��� : ");
		String address = in.nextLine();

		System.out.print("������ �Է����ּ���(ex:900214) : ");
		String jumin = in.nextLine();
		int iage = Integer.parseInt(jumin.substring(0, 2));
		iage = iage + 1900;

		Calendar calendar = Calendar.getInstance();
		int currYear = calendar.get(Calendar.YEAR);
		int age = currYear - iage;

		System.out.println("-------------------");
		System.out.println("�̸� : " + name);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : " + age);
		System.out.println("-------------------");

	}
}
