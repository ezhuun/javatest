package coding.day03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5]; // �迭�� ����� ����
		int max = 0;

		for (int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt(); // Ű���忡�� �Է¹��� ������ �迭�� ����
			if (intArray[i] > max) // ���� ū ���� ���Ͽ� ũ��
				max = intArray[i]; // max�� ����
		}
		System.out.print("�Էµ� ������ ���� ū ���� " + max + "�Դϴ�.");
	}
}
