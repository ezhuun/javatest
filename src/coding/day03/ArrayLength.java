package coding.day03;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5]; // �迭�� ����� ����
		double sum = 0;
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = in.nextInt(); // Ű���忡�� �Է¹��� ���� ����
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i]; // �迭�� ����� ���� ���� ���ϱ�
		}
		System.out.print("�迭 ������ ����� " + sum / intArray.length + "�Դϴ�.");
	}
}