package test.day05;

import java.util.Calendar;

public class Test04 {
	public static void main(String[] args) {
		String name = args[0];
		String phone = args[1];
		String address = args[2];
		String jumin = args[3];

		int iage = Integer.parseInt(jumin.substring(0, 2));
		iage = iage + 1900;

		Calendar calendar = Calendar.getInstance();
		int currYear = calendar.get(Calendar.YEAR);

		int age = currYear - iage;

		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);
	}
}
