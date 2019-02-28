package day13;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0;
		System.out.print("숫자입력하세요:");
		try {
			a = s.nextInt();
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
		}

		System.out.println(a);
	}
}
