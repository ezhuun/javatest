package day13;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0;
		System.out.print("�����Է��ϼ���:");
		try {
			a = s.nextInt();
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}

		System.out.println(a);
	}
}
