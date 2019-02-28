package coding.day03;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World! 3+3.0=6\nasdf";

		Scanner scanner = new Scanner(s);

		// Scanner scanner = new Scanner(System.in);
		System.out.println("  " + scanner.hasNext());
		System.out.println("  " + scanner.nextLine());
		System.out.println("  " + scanner.hasNext());

		scanner.close();
	}
}
