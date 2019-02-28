package test.day05;

public class Test02 {
	public static void main(String[] args) {
		double arr[] = { 80.5, 45.2, 60.8, 80.1, 10.0 };
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("최대값 : " + max + " 최소값 : " + min);
	}
}
