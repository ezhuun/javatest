package test.day05;

import java.util.Calendar;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("이름을 입력해주세요 : ");
		String name = in.nextLine();

		System.out.print("주소를 입력해주세요 : ");
		String address = in.nextLine();

		System.out.print("생일을 입력해주세요(ex:900214) : ");
		String jumin = in.nextLine();
		int iage = Integer.parseInt(jumin.substring(0, 2));
		iage = iage + 1900;

		Calendar calendar = Calendar.getInstance();
		int currYear = calendar.get(Calendar.YEAR);
		int age = currYear - iage;

		System.out.println("-------------------");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);
		System.out.println("-------------------");

	}
}
