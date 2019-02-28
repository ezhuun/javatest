package day05;

import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		int a[] = new int[10];

		Random rans = new Random();
		System.out.print("로또 번호 : ");
		for (int i = 1; i <= 6; i++) {
			a[i] = (int) (rans.nextInt(45));
			System.out.print(a[i] + " ");
		}
	}
}
