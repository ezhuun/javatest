package day04;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int intArray[] = new int[5];
//		int max=0;
		int min = 100;
//		int min = Integer.MIN_VALUE � ���ڰ� �������� INT�� �߿��� ���� ���� �ּҰ��� ����Ŵ.

		for (int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt();
//			 if(intArray[i]>max)
//			 max=intArray[i];
				if (intArray[i] < min)
					min = intArray[i];
		}
		System.out.println("�Էµ� ������ ���� ū ���� " + min + "�Դϴ�.");
//		System.out.println("�Էµ� ������ ���� ū ���� " + max + "�Դϴ�.");
	}

}
