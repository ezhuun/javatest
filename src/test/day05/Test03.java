package test.day05;

public class Test03 {
	public static void main(String[] args) {
		int arr[] = { -15, 54, -78, 90, 12 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.println(arr[i] * (-1));
			} else {
				System.out.println(arr[i]);
			}
		}
	}
}
