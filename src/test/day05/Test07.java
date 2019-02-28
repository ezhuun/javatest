package test.day05;

public class Test07 {
	public static void main(String[] args) {
		for (int x = 0; x < 4; x++) {
			for (int y = 4; y > 2; y--) {
				System.out.println(x + " " + y);
			} // end of for
			if (x == 1) {
				x++;
			} // end of if
		} // end of for		
	}
}
