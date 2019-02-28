package coding.day03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5]; // 배열의 선언과 생성
		int max = 0;

		for (int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt(); // 키보드에서 입력받은 정수를 배열에 저장
			if (intArray[i] > max) // 가장 큰 수와 비교하여 크면
				max = intArray[i]; // max에 저장
		}
		System.out.print("입력된 수에서 가장 큰 수는 " + max + "입니다.");
	}
}
