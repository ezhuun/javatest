package coding.day09;

import java.util.Scanner;

public class ExceptionExample2 {
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;

		System.out.print("�������� �Է��Ͻÿ� : ");
		dividend = rd.nextInt();
		System.out.print("�������� �Է��Ͻÿ� : ");
		divisor = rd.nextInt();

		try {
			System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend / divisor + "�Դϴ�");
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�");
		}
	}
}