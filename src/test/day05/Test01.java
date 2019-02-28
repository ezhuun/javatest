package test.day05;

public class Test01 {
	public static void main(String[] args) {
		int arr[] = { 80, 45, 60, 80, 10 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("ÃÑÁ¡ : " + sum + " Æò±Õ : " + sum / arr.length);
	}
}