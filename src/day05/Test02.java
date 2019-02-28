package day05;

public class Test02 {
	public static void main(String[] args) {
		int a[] = new int[10];

		System.out.print("로또 번호 : ");
		for (int i = 1; i <= 6; i++) {
			a[i] = (int) (Math.random() * 45 + 1);
			System.out.print(a[i] + " ");
		}
	}
}
