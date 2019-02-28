package coding.day08;

//1¹ø
public class EqualsEx {

	public static void main(String[] args) {
		Rect11 a = new Rect11(2, 3);
		Rect11 b = new Rect11(3, 2);
		Rect11 c = new Rect11(3, 4);

		if (a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if (a.equals(c)) {
			System.out.println("a is equal to c");
		}
		if (b.equals(c)) {
			System.out.println("b is equal to c");
		}
	}
}

class Rect11 {
	int width;
	int height;

	public Rect11(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equals(Rect11 p) {
		if (width * height == p.width * p.height) {
			return true;
		} else {
			return false;
		}
	}
}