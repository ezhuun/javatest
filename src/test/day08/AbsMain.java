package test.day08;

public class AbsMain {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int[] c = { 5, 2, 7, 5, 1, 8, 2 };

		GoodCalc g1 = new GoodCalc();
		System.out.println(g1.add(a, b));
		System.out.println(g1.subtract(a, b));
		System.out.println(g1.average(c));
	}

}

abstract class Calculator {
	public abstract int add(int a, int b);

	public abstract int subtract(int a, int b);

	public abstract double average(int[] a);
}

class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return sum / a.length;
	}

}