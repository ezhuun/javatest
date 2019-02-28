package day04;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int intArray[] = new int[5];
//		int max=0;
		int min = 100;
//		int min = Integer.MIN_VALUE 어떤 숫자가 들어오더라도 INT의 중에서 가장 작은 최소값을 가르킴.

		for (int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt();
//			 if(intArray[i]>max)
//			 max=intArray[i];
				if (intArray[i] < min)
					min = intArray[i];
		}
		System.out.println("입력된 수에서 가장 큰 수는 " + min + "입니다.");
//		System.out.println("입력된 수에서 가장 큰 수는 " + max + "입니다.");
	}

}
