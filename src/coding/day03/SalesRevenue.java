package coding.day03;

import java.util.Arrays;

public class SalesRevenue {
	public static void main(String[] args) {
		int intArray[][] = { { 90, 90, 110, 110 }, // 1���⵵�� ����
				{ 120, 110, 100, 110 }, // 2���⵵ ����
				{ 120, 140, 130, 150 } }; // 3���⵵ ����
		double sum = 0;
		System.out.println(Arrays.toString(intArray));
		
		
		for (int i = 0; i < intArray.length; i++) { // �⵵�� ���� �ݺ�
			for (int j = 0; j < intArray[i].length; j++) { // �б⿡ ���� �ݺ�
				sum += intArray[i][j]; // �б⺰ ������ ��
			}
		}
		System.out.println("���� 3�Ⱓ ���� �Ѿ��� " + sum + "�̸� �����  ������ " + sum / intArray.length + "�Դϴ�.");
	}
}